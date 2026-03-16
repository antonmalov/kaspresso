package com.kaspersky.kaspresso.tutorial.test.screens

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object LoadUserScreen : Screen<LoadUserScreen>() {
    private val loadUser = KButton { withId(com.kaspersky.kaspresso.tutorial.R.id.loading_button) }
    private val progressBar = KView { withId(com.kaspersky.kaspresso.tutorial.R.id.progress_bar_loading) }
    private val errorText = KTextView { withId(com.kaspersky.kaspresso.tutorial.R.id.error) }

    fun clickLoadUsersButton() {
        loadUser.click()
    }

    fun checkSpinnerDisplayed() {
        progressBar.isDisplayed()
    }

    fun checkSpinnerNotFDisplayed() {
        progressBar.isGone()
    }

    fun checkErrorText(text: String) {
        errorText {
            isDisplayed()
            hasText(text)
        }
    }
}
