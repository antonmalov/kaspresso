package com.kaspersky.kaspresso.tutorial.test.screen

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object LoginScreen : Screen<LoginScreen>() {

    private val emailField = KEditText { withId(R.id.input_username) }
    private val passwordField = KEditText { withId(R.id.input_password) }
    private val loginButton = KButton { withId(R.id.login_btn) }

    private val successResultTitle = KTextView { withId(R.id.title)}

    fun login(email : String, password : String) {
        emailField.typeText(email)
        passwordField.typeText(password)
        loginButton.click()
    }

    fun checkTitle(title : String) {
        successResultTitle {
            isDisplayed()
            hasText(title)
        }
    }
}
