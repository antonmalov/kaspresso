package com.kaspersky.kaspresso.tutorial.test.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.screen.LoginScreen
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import org.junit.Rule
import org.junit.Test


class LoginTests : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun successLogin() = run {
        step("Open login screen") {
            MainScreen.clickLoginActivity()
        }

        step("Login with valid credentials") {
            LoginScreen.login("test@mail.com", "Qwerty123")
        }

        step("Check success screen") {
            LoginScreen.checkTitle("Screen after authorization")
        }
    }
}
