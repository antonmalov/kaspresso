package com.kaspersky.exampleMalov.screens

import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView


object SimpleFragmentScreen : Screen<SimpleFragmentScreen>() {

    val simpleTitle = KTextView { withId(R.id.text_view_title) }
    val simpleButton1 = KButton { withId(R.id.button_1) }
    val simpleButton2 = KButton { withId(R.id.button_2) }
    val textField = KEditText { withId(R.id.edit) }

    fun checkTitle(title: String) {
        simpleTitle.isDisplayed()
        simpleTitle.hasText(title)
    }

    fun clickButton1() {
        simpleButton1.click()
    }

    fun clickButton2() {
        simpleButton2.click()
    }

    fun checkVisibleTextField() {
        textField.isVisible()
    }

    fun inputNewText(text: String) {
        textField.clearText()
        textField.typeText(text)
    }

    fun checkText(text: String) {
        textField.hasText(text)
    }
}
