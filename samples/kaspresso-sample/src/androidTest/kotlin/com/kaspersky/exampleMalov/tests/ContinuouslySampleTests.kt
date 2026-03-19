package com.kaspersky.exampleMalov.tests

import com.kaspersky.exampleMalov.base.BaseTest
import com.kaspersky.exampleMalov.screens.ContinuouslySampleScreen
import com.kaspersky.exampleMalov.screens.MainScreen
import com.kaspersky.exampleMalov.steps.ContinuouslySteps
import com.kaspersky.exampleMalov.utils.WaitExtensions.waitUntil
import org.junit.Test

class ContinuouslySampleTests : BaseTest() {

    @Test
    fun checkUpdateButtonTest() = run {

        step("Open continuously screen") {
            MainScreen.clickContinuouslySampleButton()
        }

        step("Check initial state") {
            ContinuouslySteps.checkInitialState(device.uiDevice)
        }

        step("Start work") {
            ContinuouslySteps.startWork()
        }

        step("Wait until enabled") {
            waitUntil { ContinuouslySampleScreen.isButtonEnabled() }
        }
    }
}
