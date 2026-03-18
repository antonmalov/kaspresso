package com.kaspersky.exampleMalov.screens


import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import junit.framework.TestCase.assertTrue

object ContinuouslySampleScreen : Screen<ContinuouslySampleScreen>() {
    const val TEXT_TITLE = "Continuously sample"
    const val TEXT_BUTTON = "Start some work with the success dialog at the and"
    val startButton = KButton { withId(R.id.continuously_start_btn) }

    fun checkTitle(device: UiDevice) {
        val title = device.findObject(
            UiSelector().text("Simple test")
        )
        assertTrue(title.exists())
    }

    fun checkTextButton() {
        startButton.hasText(TEXT_BUTTON)
    }

    fun clickStartButton() {
        startButton.click()
    }

    fun isButtonDisabled() {
        startButton.isDisabled()
    }

    fun isButtonEnabled() {
        startButton.isEnabled()
    }
}
