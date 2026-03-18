package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.base.BaseTest
import com.kaspersky.kaspresso.tutorial.test.data.TestData
import com.kaspersky.kaspresso.tutorial.test.helpers.DeviceHelper
import com.kaspersky.kaspresso.tutorial.test.steps.CallSteps
import org.junit.Test

class MakeCallTests : BaseTest() {
    val phone = TestData.PHONE

    @Test
    fun getCallTest() = run {

        step("Simulate incoming call") {
            CallSteps.simulateIncomingCall(device.uiDevice, phone)
        }

        step("Verify incoming call") {
            flakySafely(timeoutMs = 15000) {
                CallSteps.verifyIncomingCall(device.uiDevice, phone)
            }
        }

        step("Cleanup device") {
            DeviceHelper.resetDevice(device.uiDevice)
        }
    }
}
