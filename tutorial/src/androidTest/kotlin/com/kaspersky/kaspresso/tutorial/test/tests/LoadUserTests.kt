package com.kaspersky.kaspresso.tutorial.test.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.screen.LoadUserScreen
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import org.junit.Rule
import org.junit.Test

class LoadUserTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkLoadingAndError() = run {

        step("Open load user screen") {
            MainScreen.clickLoadUser()
        }

        step("Click button to start loading") {
            LoadUserScreen.clickLoadUsersButton()
        }

        step("Check spinner appears") {
            LoadUserScreen.checkSpinnerDisplayed()
        }

        step("Wait until spinner disappears") {
            flakySafely(15000) {
                LoadUserScreen.checkSpinnerNotFDisplayed()
            }
        }

        step("Check error message") {
            LoadUserScreen.checkErrorText("Something went wrong")
        }
    }
}
