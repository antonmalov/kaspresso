package com.kaspersky.kaspresso.tutorial.test.screens

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object SimpleScreen : Screen<SimpleScreen>() {

    private val defaultTitle = KTextView { withId(R.id.simple_title) }
    private val inputText = KEditText { withId(R.id.input_text) }
    private val changeButton = KButton { withId(R.id.change_title_btn) }

    fun checkDefaultTitle() {
        defaultTitle.hasText("Default title")
    }

    fun inputTitle(title: String) {
        inputText.typeText(title)
        changeButton.click()
        defaultTitle.hasText(title)
    }
}
