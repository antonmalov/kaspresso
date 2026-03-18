package com.kaspersky.exampleMalov.steps

import com.kaspersky.exampleMalov.data.SimpleTestData
import com.kaspersky.exampleMalov.screens.MainScreen
import com.kaspersky.exampleMalov.screens.SimpleFragmentScreen

object SimpleSteps {

    fun openSimpleScreen() {
        MainScreen.clickSimpleFragmentButton()
        SimpleFragmentScreen.checkTitle(SimpleTestData.TITLE)
    }

    fun clickFirstButton() {
        SimpleFragmentScreen.clickButton1()
    }

    fun clickSecondButton() {
        SimpleFragmentScreen.clickButton2()
    }

    fun goToTextInputState() {
        clickFirstButton()
        clickSecondButton()
    }

    fun enterText(text: String) {
        goToTextInputState()
        SimpleFragmentScreen.inputNewText(text)
    }
}

