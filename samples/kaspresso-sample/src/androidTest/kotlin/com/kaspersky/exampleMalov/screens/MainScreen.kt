package com.kaspersky.exampleMalov.screens

import io.github.kakaocup.kakao.screen.Screen
import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : Screen<MainScreen>() {

    val mainTitle = KTextView { withId(R.id.activity_main_title) }
    val simpleFragmentButton = KButton { withId(R.id.activity_main_simple_sample_button) }
    val continuouslySampleButton = KButton { withId(R.id.activity_main_continuously_sample_button) }

    fun clickSimpleFragmentButton() {
        simpleFragmentButton.click()
    }
}
