package com.kaspersky.exampleMalov.steps

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object DeviceSteps {
    fun TestContext<*>.rotateToLandscape() {
        step("Rotate screen to landscape") {
            val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
            device.setOrientationLeft()
        }
    }

    fun TestContext<*>.rotateToPortrait() {
        step("Rotate screen to portrait") {
            val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
            device.setOrientationNatural()
        }
    }
}
