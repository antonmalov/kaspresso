package com.kaspersky.exampleMalov.tests

import com.kaspersky.exampleMalov.base.BaseTest
import com.kaspersky.exampleMalov.data.SimpleTestData
import com.kaspersky.exampleMalov.steps.SimpleSteps.checkButton2Visible
import com.kaspersky.exampleMalov.steps.SimpleSteps.waitForInputField
import com.kaspersky.exampleMalov.steps.SimpleSteps.clickFirstButton
import com.kaspersky.exampleMalov.steps.SimpleSteps.enterText
import com.kaspersky.exampleMalov.steps.SimpleSteps.goToTextInputState
import com.kaspersky.exampleMalov.steps.SimpleSteps.openSimpleScreen
import com.kaspersky.exampleMalov.steps.SimpleSteps.verifySimpleScreenOpened
import com.kaspersky.exampleMalov.steps.SimpleSteps.verifyText
import org.junit.Test


class SimpleFragmentTests : BaseTest() {

    @Test
    fun checkTitle() = run {
        openSimpleScreen()
        verifySimpleScreenOpened()
    }

    @Test
    fun button2ShouldBeVisibleAfterClickingFirstButton() = run {
        openSimpleScreen()
        clickFirstButton()
        checkButton2Visible()
    }

    @Test
    fun textInputShouldBeVisibleTest() = run {
        openSimpleScreen()
        goToTextInputState()
        waitForInputField()
    }

    @Test
    fun updateTextTest() = run {
        openSimpleScreen()
        enterText(SimpleTestData.NEW_TEXT)
        verifyText(SimpleTestData.NEW_TEXT)
    }
}
