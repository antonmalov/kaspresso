package com.kaspersky.exampleMalov.steps

import androidx.test.uiautomator.UiDevice
import com.kaspersky.exampleMalov.screens.ContinuouslySampleScreen
import com.kaspersky.exampleMalov.screens.ContinuouslySampleScreen.checkTitle
import com.kaspersky.exampleMalov.screens.ContinuouslySampleScreen.startButton
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object ContinuouslySteps {

    fun checkInitialState(device: UiDevice) {
        checkTitle(device)
        startButton.isEnabled()
    }

    fun startWork() {
        ContinuouslySampleScreen.clickStartButton()
        ContinuouslySampleScreen.isButtonDisabled()
    }
}
