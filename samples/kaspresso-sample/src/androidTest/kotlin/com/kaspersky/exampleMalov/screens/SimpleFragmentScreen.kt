package com.kaspersky.exampleMalov.screens

import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView


object SimpleFragmentScreen : Screen<SimpleFragmentScreen>() {

    private val simpleTitle = KTextView { withId(R.id.text_view_title) }
    private val simpleButton1 = KButton { withId(R.id.button_1) }
    private val simpleButton2 = KButton { withId(R.id.button_2) }
    private val textField = KEditText { withId(R.id.edit) }

    fun checkTitle(title: String) {
        simpleTitle.isDisplayed()
        simpleTitle.hasText(title)
    }

    fun clickButton1() {
        simpleButton1.click()
    }

    fun checkButton2Visible() {
        simpleButton2.isVisible()
    }

    fun clickButton2() {
        simpleButton2.click()
    }

    fun isTextFieldVisible(): Boolean {
        return try {
            textField.isVisible()
            true
        } catch (e: Throwable) {
            false
        }
    }

    fun inputNewText(text: String) {
        textField.clearText()
        textField.typeText(text)
    }

    fun checkText(text: String) {
        textField.hasText(text)
    }
}
