package com.kaspersky.exampleMalov.utils

import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object WaitExtensions {
    fun TestContext<*>.waitUntil(
        timeout: Long = 15000,
        condition: () -> Boolean
    ) {
        flakySafely(timeoutMs = timeout) {
            if (!condition()) {
                throw AssertionError("Condition not met within $timeout ms")
            }
        }
    }
}
