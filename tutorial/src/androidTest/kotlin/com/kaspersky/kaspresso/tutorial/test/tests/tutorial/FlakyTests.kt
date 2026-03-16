package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.BaseTest
import com.kaspersky.kaspresso.tutorial.test.screens.FlakyScreen
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import org.junit.Test


class FlakyTests : BaseTest() {


    @Test
    fun checkFlakyTest() = run {
        MainScreen.clickFlakyButton()

        flakySafely(15000) {
            FlakyScreen.checkFlakyText()
        }
    }
}
