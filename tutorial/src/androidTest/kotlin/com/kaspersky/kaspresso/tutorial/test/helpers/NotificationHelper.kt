package com.kaspersky.kaspresso.tutorial.test.helpers

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import junit.framework.TestCase.assertTrue

object NotificationHelper {

    fun checkNotification(device: UiDevice) {

        val notification = device.findObject(
            UiSelector().packageName("com.kaspersky.kaspresso.tutorial")
        )

        assertTrue(
            "Notification not found",
            notification.waitForExists(10000)
        )
    }

    fun checkNotificationText(device: UiDevice, text: String) {
        val notification = device.findObject(
            UiSelector().textContains(text)
        )

        assertTrue(
            "Notification text '$text' not found",
            notification.waitForExists(10000)
        )
    }
}
