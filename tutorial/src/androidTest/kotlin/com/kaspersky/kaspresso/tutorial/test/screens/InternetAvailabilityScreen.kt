package com.kaspersky.kaspresso.tutorial.test.screens

import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object InternetAvailabilityScreen : Screen<InternetAvailabilityScreen>() {

    private val wifiStatusButton = KButton { withId(R.id.check_wifi_btn) }
    private val wifiStatusText = KTextView { withId(R.id.wifi_status) }

    fun checkWiFiStatus(status: String) {
        wifiStatusButton.click()
        wifiStatusText.isDisplayed()
        wifiStatusText.hasText(status)
    }
}
