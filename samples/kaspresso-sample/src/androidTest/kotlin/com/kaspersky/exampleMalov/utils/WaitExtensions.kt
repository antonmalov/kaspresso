package com.kaspersky.exampleMalov.utils

import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

object WaitExtensions {
    fun TestContext<*>.waitUntil(
        timeout: Long = 5000,
        action: () -> Unit
    ) {
        flakySafely(timeoutMs = timeout) {
            action()
        }
    }
}
