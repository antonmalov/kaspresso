package com.kaspersky.kaspresso.tutorial.test.helpers

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector

object DeviceHelper {

    fun resetDevice(device: UiDevice) {

        device.waitForIdle()

        val endCallButton = device.findObject(
            UiSelector().descriptionContains("End")
        )

        if (endCallButton.exists()) {
            endCallButton.click()
        }

        device.pressBack()
        device.pressHome()
    }
}
