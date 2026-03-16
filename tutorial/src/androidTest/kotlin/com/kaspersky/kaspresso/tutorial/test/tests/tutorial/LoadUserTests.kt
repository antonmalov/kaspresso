package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.BaseTest
import com.kaspersky.kaspresso.tutorial.test.screens.LoadUserScreen
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import org.junit.Test

class LoadUserTests : BaseTest() {

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
