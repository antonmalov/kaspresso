package com.kaspersky.kaspresso.tutorial.test.screen

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView


object MainScreen : Screen<MainScreen>() {
    private val simpleButton = KButton { withId(R.id.simple_activity_btn) }
    private val screenTitle = KTextView { withId(R.id.title) }


    fun clickSimpleButton() {
        simpleButton.click()
    }

    fun checkTitle(title: String) {
        screenTitle {
            isDisplayed()
            hasText(title)
        }
    }
}
