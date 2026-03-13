package com.kaspersky.kaspresso.tutorial.test.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView

object FlakуScreen : Screen<FlakуScreen>() {
    private val flakyText = KTextView { withId(com.kaspersky.kaspresso.tutorial.R.id.text_1) }

    fun checkFlakyText() {
        flakyText {
            hasText("TEXT1")
        }
    }

}
