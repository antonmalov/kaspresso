package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.BaseTest
import com.kaspersky.kaspresso.tutorial.test.data.TestData
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import com.kaspersky.kaspresso.tutorial.test.steps.LoginSteps
import org.junit.Test


class LoginTests : BaseTest() {

    @Test
    fun successLogin() = run {
        step("Open login screen") {
            MainScreen.clickLoginActivity()
        }

        step("Login with valid credentials") {
            LoginSteps.login(
                username = TestData.USER_EMAIL,
                password = TestData.USER_PASSWORD
            )
        }

        step("Check success screen") {
            LoginSteps.checkSuccessResultLogin()
        }
    }
}
