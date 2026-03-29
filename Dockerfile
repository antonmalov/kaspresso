FROM jenkins/jenkins:lts

USER root

# Устанавливаем зависимости для эмулятора и Android SDK
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    qemu-kvm \
    libvirt-daemon-system \
    libvirt-clients \
    bridge-utils \
    virt-manager \
    cpu-checker \
    && rm -rf /var/lib/apt/lists/*

# Скачиваем Command Line Tools
RUN wget -q https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip && \
    unzip commandlinetools-linux-11076708_latest.zip && \
    mkdir -p /opt/android-sdk/cmdline-tools && \
    mv cmdline-tools /opt/android-sdk/cmdline-tools/latest && \
    rm commandlinetools-linux-11076708_latest.zip

# Устанавливаем SDK компоненты (Android 33, эмулятор, platform-tools)
RUN /opt/android-sdk/cmdline-tools/latest/bin/sdkmanager \
    "platform-tools" \
    "platforms;android-33" \
    "build-tools;33.0.0" \
    "emulator" \
    "system-images;android-33;google_apis;x86_64" \
    --sdk_root=/opt/android-sdk

# Принимаем лицензии (автоматически)
RUN yes | /opt/android-sdk/cmdline-tools/latest/bin/sdkmanager --licenses --sdk_root=/opt/android-sdk

# Создаём AVD (Android Virtual Device) для эмулятора
RUN echo "no" | /opt/android-sdk/cmdline-tools/latest/bin/avdmanager create avd \
    -n testAVD \
    -k "system-images;android-33;google_apis;x86_64" \
    -d "pixel_4"

# Даём права пользователю jenkins на SDK и KVM
RUN chown -R jenkins:jenkins /opt/android-sdk && \
    chown -R jenkins:jenkins /home/jenkins/.android && \
    adduser jenkins kvm

# Переменные окружения для Android
ENV ANDROID_HOME=/opt/android-sdk
ENV PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$ANDROID_HOME/cmdline-tools/latest/bin

USER jenkins
