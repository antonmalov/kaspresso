package com.kaspersky.kaspresso.tutorial.test.screens

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton

object CallScreen : Screen<CallScreen>() {

    private val phoneField = KEditText { withId(R.id.input_number) }
    private val makeCallButton = KButton { withId(R.id.make_call_btn) }

    fun inputPhone(phone: String) {
        phoneField.typeText(phone)
    }

    fun clickCallButton() {
        makeCallButton.click()
    }
}
