package com.kaspersky.kaspresso.tutorial.test.steps

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.kaspersky.kaspresso.tutorial.test.helpers.NotificationHelper
import com.kaspersky.kaspresso.tutorial.test.screens.NotificationScreen

object NotificationSteps {

    fun sendNotification() {
        NotificationScreen.showNotification()
    }

    fun verifyNotification(title: String, content: String) {

        val device = UiDevice.getInstance(
            InstrumentationRegistry.getInstrumentation()
        )

        device.openNotification()
        device.waitForIdle()

        NotificationHelper.checkNotificationText(device, title)
        NotificationHelper.checkNotificationText(device, content)

        device.pressBack()
    }
}
