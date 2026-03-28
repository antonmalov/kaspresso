package com.kaspersky.exampleMalov.steps

import com.kaspersky.exampleMalov.screens.MainScreen
import com.kaspersky.exampleMalov.screens.ScrollviewScreen.checkItemText
import com.kaspersky.exampleMalov.screens.ScrollviewScreen.scrollHorizontally
import com.kaspersky.exampleMalov.screens.ScrollviewScreen.scrollToItemById
import com.kaspersky.exampleMalov.screens.SimpleFragmentScreen
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object ScrollviewSteps {
    fun TestContext<*>.openSimpleScreen() {
        step("Open simple screen") {
            MainScreen {
                clickSimpleFragmentButton()
            }
        }
    }

    fun TestContext<*>.scrollToItem(id: Int) {
        step("Scroll to item with id: $id") {
            SimpleFragmentScreen {
                scrollToItemById(id)
            }
        }
    }

    fun TestContext<*>.verifyItemText(id: Int, text: String) {
        step("Verify item text: $text") {
            SimpleFragmentScreen {
                checkItemText(id, text)
            }
        }
    }


    fun TestContext<*>.scrollHorizontalSection() {
        step("Scroll horizontal section") {
            SimpleFragmentScreen {
                scrollHorizontally()
            }
        }
    }
}
