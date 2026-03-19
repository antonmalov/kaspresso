package com.kaspersky.exampleMalov.tests

import com.kaspersky.exampleMalov.base.BaseTest
import com.kaspersky.exampleMalov.data.SimpleTestData
import com.kaspersky.exampleMalov.screens.SimpleFragmentScreen
import com.kaspersky.exampleMalov.steps.SimpleSteps
import com.kaspersky.exampleMalov.utils.WaitExtensions.waitUntil
import org.junit.Test


class SimpleFragmentTests : BaseTest() {

    @Test
    fun checkTitle() = run {

        step("Open simple Fragment screen") {
            SimpleSteps.openSimpleScreen()
        }
    }

    @Test
    fun button2shouldBeVisibleTest() = run {
        step("Open simple Fragment screen") {
            SimpleSteps.openSimpleScreen()
        }

        step("Click button1") {
            SimpleSteps.clickFirstButton()
        }

        step("Button2 should be visible") {
            SimpleFragmentScreen.simpleButton2.isVisible()
        }
    }

    @Test
    fun textInputShouldBeVisibleTest() = run {
        step("Open simple Fragment screen") {
            SimpleSteps.openSimpleScreen()
        }

        step("Go to input state") {
            SimpleSteps.goToTextInputState()
        }

        step("Check input field") {
            waitUntil {
                SimpleFragmentScreen.checkVisibleTextField()
            }


        }
    }

    @Test
    fun updateTextTest() = run {
        step("Open simple Fragment screen") {
            SimpleSteps.openSimpleScreen()
        }

        step("Input text") {
            SimpleSteps.enterText(SimpleTestData.NEW_TEXT)
        }

        step("check new text") {
            SimpleFragmentScreen.checkText(SimpleTestData.NEW_TEXT)
        }
    }
}
