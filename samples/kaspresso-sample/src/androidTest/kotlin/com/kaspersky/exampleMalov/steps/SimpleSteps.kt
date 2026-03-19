package com.kaspersky.exampleMalov.steps

import com.kaspersky.exampleMalov.data.SimpleTestData
import com.kaspersky.exampleMalov.screens.MainScreen
import com.kaspersky.exampleMalov.screens.SimpleFragmentScreen
import com.kaspersky.exampleMalov.utils.WaitExtensions.waitUntil
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object SimpleSteps {

    fun TestContext<*>.openSimpleScreen() {
        step("Open simple screen") {
            MainScreen {
                clickSimpleFragmentButton()
            }
        }
    }

    fun TestContext<*>.verifySimpleScreenOpened() {
        step("Verify simple screen opened") {
            SimpleFragmentScreen {
                checkTitle(SimpleTestData.TITLE)
            }
        }
    }

    fun TestContext<*>.clickFirstButton() {
        step("Click button1") {
            SimpleFragmentScreen {
                clickButton1()
            }
        }
    }

    fun TestContext<*>.checkButton2Visible() {
        step("Button2 should be visible") {
            SimpleFragmentScreen {
                checkButton2Visible()
            }
        }
    }

    fun TestContext<*>.waitForInputField() {
        step("Wait for input field to be visible") {
            waitUntil {
                SimpleFragmentScreen.isTextFieldVisible()
            }

        }
    }

    fun TestContext<*>.goToTextInputState() {
        step("Go to input state") {
            SimpleFragmentScreen {
                clickButton1()
                clickButton2()
            }
        }
    }

    fun TestContext<*>.enterText(text: String) {
        step("Enter text") {
            SimpleFragmentScreen {
                inputNewText(text)
            }
        }
    }

    fun TestContext<*>.verifyText(text: String) {
        step("Verify text updated") {
            SimpleFragmentScreen {
                checkText(text)
            }
        }
    }
}

