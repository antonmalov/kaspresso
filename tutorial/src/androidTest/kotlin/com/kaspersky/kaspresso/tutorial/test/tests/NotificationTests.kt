package com.kaspersky.kaspresso.tutorial.test.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.helpers.NotificationHelper
import com.kaspersky.kaspresso.tutorial.test.helpers.PermissionHelper
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import com.kaspersky.kaspresso.tutorial.test.screen.NotificationScreen
import org.junit.Rule
import org.junit.Test

class NotificationTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun allowNotificationsWithShade() = run {

        step("Open notification screen") {
            MainScreen.clickNotificationActivity()
        }

        step("Allow notifications") {
            PermissionHelper.allow(device.uiDevice)
        }

        step("Click show notification") {
            NotificationScreen.showNotification()
        }

        step("Open notification shade") {
            device.uiDevice.openNotification()
            device.uiDevice.waitForIdle()
        }

        step("Check notification exists") {
            NotificationHelper.checkNotification(device.uiDevice)
        }

        step("Check notification title") {
            NotificationHelper.checkNotificationText(
                device.uiDevice,
                "Notification title"
            )
        }

        step("Check notification content") {
            NotificationHelper.checkNotificationText(
                device.uiDevice,
                "Notification content"
            )
        }

        step("Close notification shade") {
            device.uiDevice.pressBack()
        }
    }
}
