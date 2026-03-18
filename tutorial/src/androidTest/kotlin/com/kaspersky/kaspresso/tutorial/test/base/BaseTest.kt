package com.kaspersky.kaspresso.tutorial.test.base

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import org.junit.Rule

abstract class BaseTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()
}
