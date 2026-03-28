package com.kaspersky.exampleMalov.steps

import com.kaspersky.exampleMalov.screens.MainScreen
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object MainSteps {

    fun TestContext<*>.openContinuouslyScreen() {
        step("Open continuously screen") {
            MainScreen.clickContinuouslySampleButton()
        }
    }

    fun TestContext<*>.openScrollviewScreen() {
        step("Open scrollview screen") {
            MainScreen.clickScrollviewButton()
        }
    }
}
