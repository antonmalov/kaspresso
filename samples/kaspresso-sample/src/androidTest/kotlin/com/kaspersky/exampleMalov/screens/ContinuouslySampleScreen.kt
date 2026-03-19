package com.kaspersky.exampleMalov.screens


import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.kaspersky.exampleMalov.data.ContinuouslyTestData
import com.kaspersky.kaspressample.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import junit.framework.TestCase.assertTrue

object ContinuouslySampleScreen : Screen<ContinuouslySampleScreen>() {

    private val startButton = KButton { withId(R.id.continuously_start_btn) }

    private val device: UiDevice
        get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    fun checkTitle(title: String) {
        KTextView { withText(title) }.isDisplayed()
    }

    fun clickStart() {
        startButton.click()
    }

    fun isStartButtonEnabled(): Boolean {
        return try {
            startButton.isEnabled()
            true
        } catch (e: AssertionError) {
            false
        }
    }

    fun checkStartButtonEnabled() {
        startButton.isEnabled()
    }

    fun checkStartButtonDisabled() {
        startButton.isDisabled()
    }
}
