package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.base.BaseTest
import com.kaspersky.kaspresso.tutorial.test.data.TestData
import com.kaspersky.kaspresso.tutorial.test.helpers.PermissionHelper
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import com.kaspersky.kaspresso.tutorial.test.steps.NotificationSteps
import org.junit.Test

class NotificationTests : BaseTest() {

    @Test
    fun allowNotificationsWithShade() = run {

        step("Open notification screen") {
            MainScreen.clickNotificationActivity()
        }

        step("Allow notifications") {
            PermissionHelper.allow(device.uiDevice)
        }

        step("Send notification") {
            NotificationSteps.sendNotification()
        }

        step("Verify notification") {
            NotificationSteps.verifyNotification(
                TestData.NOTIFICATION_TITLE,
                TestData.NOTIFICATION_CONTENT
            )
        }
    }
}
