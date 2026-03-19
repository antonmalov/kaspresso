package com.kaspersky.exampleMalov.screens


import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.kaspersky.exampleMalov.data.ContinuouslyTestData
import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import junit.framework.TestCase.assertTrue

object ContinuouslySampleScreen : Screen<ContinuouslySampleScreen>() {
    val startButton = KButton { withId(R.id.continuously_start_btn) }

    fun checkTitle(device: UiDevice) {
        val title = device.findObject(
            UiSelector().text(ContinuouslyTestData.TEXT_TITLE)
        )
        assertTrue(title.exists())
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
