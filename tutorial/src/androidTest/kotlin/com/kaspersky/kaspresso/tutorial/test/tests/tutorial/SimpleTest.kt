package com.kaspersky.kaspresso.tutorial.test.tests.tutorial

import com.kaspersky.kaspresso.tutorial.test.BaseTest
import com.kaspersky.kaspresso.tutorial.test.screens.MainScreen
import com.kaspersky.kaspresso.tutorial.test.screens.SimpleScreen
import org.junit.Test

class SimpleTest : BaseTest() {

    @Test
    fun updateTitleTest() = run {
        val newTitle = "Update title"

        step("Open login screen") {
            MainScreen.clickSimpleButton()
        }

        step("Check default title") {
            SimpleScreen.checkDefaultTitle()
        }

        step("Input new title") {
            SimpleScreen.inputTitle(newTitle)
        }
    }
}
