package com.kaspersky.kaspresso.tutorial.test.screens

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton

object NotificationScreen : Screen<NotificationScreen>() {

    private val showNotificationButton = KButton { withId(R.id.show_notification_button) }

    fun showNotification() {
        showNotificationButton.click()
    }
}
