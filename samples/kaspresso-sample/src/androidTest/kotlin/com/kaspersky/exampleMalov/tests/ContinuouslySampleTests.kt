package com.kaspersky.exampleMalov.tests

import com.kaspersky.exampleMalov.base.BaseTest
import com.kaspersky.exampleMalov.steps.ContinuouslySteps.checkInitialState
import com.kaspersky.exampleMalov.steps.ContinuouslySteps.startBackgroundWork
import com.kaspersky.exampleMalov.steps.ContinuouslySteps.verifyButtonEnabled
import com.kaspersky.exampleMalov.steps.ContinuouslySteps.waitWorkFinished
import com.kaspersky.exampleMalov.steps.MainSteps.openContinuouslyScreen
import org.junit.Test

class ContinuouslySampleTests : BaseTest() {

    @Test
    fun startButtonStateChangesCorrectly() = run {
        openContinuouslyScreen()
        checkInitialState()
        startBackgroundWork()
        waitWorkFinished()
        verifyButtonEnabled()
    }
}
