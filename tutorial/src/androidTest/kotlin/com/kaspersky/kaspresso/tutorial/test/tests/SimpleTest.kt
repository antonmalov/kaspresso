package com.kaspersky.kaspresso.tutorial.test.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import com.kaspersky.kaspresso.tutorial.test.screen.SimpleScreen
import org.junit.Rule
import org.junit.Test

class SimpleTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun updateTitleTest() = run {
        val newTitle = "Update title"

        step("Open login screen") {
            MainScreen.clickSimpleButton()
        }

        step("Check default title") {
            SimpleScreen.checkDefaultTitle()
        }

        step("Input new title") {
            SimpleScreen.inputTitle(newTitle)
        }
    }
}
