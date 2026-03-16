package com.kaspersky.kaspresso.tutorial.test.steps

import androidx.test.uiautomator.UiDevice
import com.kaspersky.kaspresso.tutorial.test.helpers.CallHelper

import com.kaspersky.kaspresso.tutorial.test.helpers.PermissionHelper
import com.kaspersky.kaspresso.tutorial.test.screens.CallScreen
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen

object CallSteps {

    fun simulateIncomingCall(device: UiDevice, phone: String) {

        MainScreen.clickMakeCallButton()

        CallScreen.inputPhone(phone)
        CallScreen.clickCallButton()

        PermissionHelper.allow(device)
    }

    fun verifyIncomingCall(device: UiDevice, phone: String) {
        CallHelper.checkIncomingCall(device, phone)
    }
}
