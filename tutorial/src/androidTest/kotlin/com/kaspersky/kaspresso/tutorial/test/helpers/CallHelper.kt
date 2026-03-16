package com.kaspersky.kaspresso.tutorial.test.helpers

import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import junit.framework.TestCase.assertTrue

object CallHelper {
    fun checkIncomingCall(device: UiDevice, phone: String) {
        val lastDigits = phone.takeLast(4)
        val number = device.findObject(UiSelector().textContains(lastDigits))
        assertTrue("Incoming call number not found", number.exists())
    }
}
