package com.kaspersky.kaspresso.tutorial.test.helpers

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector

object PermissionHelper {
    fun allow(device: UiDevice) {
        device.findObject(
            UiSelector().resourceId("com.android.permissioncontroller:id/permission_allow_button")
        ).click()
    }

    fun deny(device: UiDevice) {
        device.findObject(
            UiSelector().resourceId("com.android.permissioncontroller:id/permission_deny_button")
        ).click()
    }
}
