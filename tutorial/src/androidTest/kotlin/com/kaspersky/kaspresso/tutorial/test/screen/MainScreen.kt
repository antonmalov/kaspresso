package com.kaspersky.kaspresso.tutorial.test.screen

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView


object MainScreen : Screen<MainScreen>() {
    private val simpleButton = KButton { withId(R.id.simple_activity_btn) }
    private val screenTitle = KTextView { withId(R.id.title) }
    private val listActivityButton = KButton { withId(R.id.list_activity_btn) }

    private val loginButton = KButton { withId(R.id.login_activity_btn) }

    private val flakyButton = KButton { withId(R.id.flaky_activity_btn) }
    private val loadUserButton = KButton { withId(R.id.load_user_activity_btn) }
    private val notificationButton = KButton { withId(R.id.notification_activity_btn)}

    fun clickSimpleButton() {
        simpleButton.click()
    }

    fun checkTitle(title: String) {
        screenTitle {
            isDisplayed()
            hasText(title)
        }
    }

    fun clickLoginActivity() {
        loginButton.click()
    }

    fun clickListActivityButton() {
        listActivityButton.click()
    }

    fun clickFlakyButton() {
        flakyButton.click()
    }

    fun clickLoadUser() {
        loadUserButton.click()
    }

    fun clickNotificationActivity() {
        notificationButton.click()
    }
}
