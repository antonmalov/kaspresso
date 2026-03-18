package com.kaspersky.exampleMalov.base

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspressample.MainActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule

abstract class BaseTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()
}
