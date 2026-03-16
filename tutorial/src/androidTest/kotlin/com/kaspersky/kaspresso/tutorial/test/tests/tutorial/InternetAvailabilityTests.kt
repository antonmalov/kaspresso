package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.BaseTest
import com.kaspersky.kaspresso.tutorial.test.screens.InternetAvailabilityScreen
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import org.junit.Test

class InternetAvailabilityTests : BaseTest() {

    @Test
    fun wifiStatusTest() = run {

        step("Open wifi screen") {
            MainScreen.clickInternetAvailability()
        }

        step("Check wifi status") {
            InternetAvailabilityScreen.checkWiFiStatus("enabled")
        }
    }
}
