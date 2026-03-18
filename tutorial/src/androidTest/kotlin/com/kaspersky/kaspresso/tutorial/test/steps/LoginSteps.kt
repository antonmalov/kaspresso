package com.kaspersky.kaspresso.tutorial.test.steps

import com.kaspersky.kaspresso.tutorial.test.screens.LoginScreen

object LoginSteps {

    fun login(username: String, password: String) {
        LoginScreen.enterUsername(username)
        LoginScreen.enterPassword(password)
        LoginScreen.clickLogin()
    }

    fun checkSuccessResultLogin() {
        LoginScreen.checkLoginSuccess("Screen after authorization");
    }
}
