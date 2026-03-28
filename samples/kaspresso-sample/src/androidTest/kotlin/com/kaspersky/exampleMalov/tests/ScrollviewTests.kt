package com.kaspersky.exampleMalov.tests

import com.kaspersky.exampleMalov.base.BaseTest
import com.kaspersky.exampleMalov.steps.MainSteps.openScrollviewScreen
import com.kaspersky.exampleMalov.steps.ScrollviewSteps.scrollHorizontalSection
import com.kaspersky.exampleMalov.steps.ScrollviewSteps.scrollToItem
import com.kaspersky.exampleMalov.steps.ScrollviewSteps.verifyItemText
import com.kaspersky.kaspressample.R
import org.junit.Test

class ScrollviewTests : BaseTest() {

    @Test
    fun item1_shouldHaveCorrectTextItem1() = run {
        openScrollviewScreen()

        scrollToItem(R.id.tvText1)
        verifyItemText(R.id.tvText1, "Item 1")
    }

    @Test
    fun item1_shouldHaveCorrectTextItem19() = run {
        openScrollviewScreen()

        scrollToItem(R.id.tvText19)
        verifyItemText(R.id.tvText19, "Item 19")
    }

    @Test
    fun item1_shouldHaveCorrectTextNItem3() = run {
        openScrollviewScreen()

        scrollToItem(R.id.nnHtvText1)
        scrollHorizontalSection()

        verifyItemText(R.id.nnHtvText3, "NNHItem 3")
    }
}
