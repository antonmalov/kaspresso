package com.kaspersky.kaspresso.tutorial.test.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.screen.FlakуScreen
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import org.junit.Rule
import org.junit.Test


class FlakyTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkFlakyTest() = run {
        MainScreen.clickFlakyButton()

        flakySafely(15000) {
            FlakуScreen.checkFlakyText()
        }
    }
}
