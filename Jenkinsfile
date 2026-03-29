pipeline {
    agent any

    environment {
        ANDROID_HOME = '/opt/android-sdk'
        // Отключаем звук и окно эмулятора для headless-режима
        EMULATOR_OPTS = '-no-audio -no-window -no-snapshot -gpu swiftshader_indirect'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Setup Emulator') {
            steps {
                script {
                    // Запускаем эмулятор в фоне
                    sh """
                        ${ANDROID_HOME}/emulator/emulator -avd testAVD \$EMULATOR_OPTS &
                    """
                    // Ждём загрузки эмулятора (максимум 5 минут)
                    sh """
                        timeout 300 adb wait-for-device
                        adb shell input keyevent 82   # разблокировка экрана
                    """
                }
            }
        }

        stage('Run Kaspresso Tests') {
            steps {
                script {
                    // Переходим в модуль с вашими тестами и запускаем их
                    dir('samples/kaspresso-sample') {
                        sh '''
                            chmod +x ../../gradlew
                            ../../gradlew clean connectedAndroidTest \
                                -Pandroid.testInstrumentationRunnerArguments.package=com.kaspersky.exampleMalov.tests
                        '''
                    }
                }
            }
        }

        stage('Publish Reports') {
            steps {
                junit 'samples/kaspresso-sample/build/outputs/androidTest-results/connected/*.xml'
                archiveArtifacts artifacts: 'samples/kaspresso-sample/build/outputs/androidTest-results/connected/**/*.xml', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            script {
                // Останавливаем эмулятор после сборки
                sh 'adb emu kill || true'
            }
            cleanWs()
        }
    }
}
