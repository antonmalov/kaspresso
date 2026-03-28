package com.kaspersky.exampleMalov.screens

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView

object ScrollviewScreen : Screen<ScrollviewScreen>() {

    fun scrollToItemById(id: Int) {
        KTextView { withId(id) }.apply {
            scrollTo()
            isDisplayed()
        }
    }

    fun checkItemText(id: Int, text: String) {
        KTextView {
            withId(id)
        }.hasText(text)
    }

    fun scrollHorizontally() {
        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        repeat(5) {
            device.swipe(800, 1000, 200, 1000, 10)
        }
    }
}
