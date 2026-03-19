package com.kaspersky.exampleMalov.steps

import com.kaspersky.exampleMalov.data.ContinuouslyTestData
import com.kaspersky.exampleMalov.screens.ContinuouslySampleScreen
import com.kaspersky.exampleMalov.utils.WaitExtensions.waitUntil
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext


object ContinuouslySteps {

    fun TestContext<*>.checkInitialState() {
        step("Check initial state") {
            ContinuouslySampleScreen {
                checkTitle(ContinuouslyTestData.TEXT_TITLE)
                checkStartButtonEnabled()
            }
        }
    }

    fun TestContext<*>.startBackgroundWork() {
        step("Start background work") {
            ContinuouslySampleScreen {
                clickStart()
                checkStartButtonDisabled()
            }
        }
    }

    fun TestContext<*>.waitWorkFinished() {
        step("Wait work finished") {
            waitUntil {
                ContinuouslySampleScreen.isStartButtonEnabled()
            }
        }
    }

    fun TestContext<*>.verifyButtonEnabled() {
        step("Verify start button is enabled") {
            ContinuouslySampleScreen {
                checkStartButtonEnabled()
            }
        }
    }
}
