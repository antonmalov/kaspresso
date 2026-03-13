package com.kaspersky.kaspresso.tutorial.test

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.test.screen.FlakуScreen
import com.kaspersky.kaspresso.tutorial.test.screen.MainScreen
import com.kaspersky.kaspresso.tutorial.test.screen.NoteListScreen
import org.junit.Rule
import org.junit.Test


class SimpleTest : TestCase() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun test() {
        MainScreen {
            checkTitle("Tutorial")
            clickSimpleButton()
        }
    }

    @Test
    fun isVisibleListTest() = run {
        MainScreen.clickListActivityButton()

        NoteListScreen {
            rvNotes {
                children<NoteListScreen.NoteItem> {
                    noteContainer.isVisible()
                    tvNoteId.isVisible()
                    tvNoteText.isVisible()
                    tvNoteId.hasAnyText()
                    tvNoteText.hasAnyText()
                }
            }
        }
    }

    @Test
    fun checkElementsList() = run {
        MainScreen.clickListActivityButton()

        NoteListScreen {
            rvNotes {
                childAt<NoteListScreen.NoteItem>(0) {
                    noteContainer.hasBackgroundColor(android.R.color.holo_green_light)
                    tvNoteId.hasText("0")
                    tvNoteText.hasText("Note number 0")
                }

                childAt<NoteListScreen.NoteItem>(1) {
                    noteContainer.hasBackgroundColor(android.R.color.holo_orange_light)
                    tvNoteId.hasText("1")
                    tvNoteText.hasText("Note number 1")
                }

                childAt<NoteListScreen.NoteItem>(2) {
                    noteContainer.hasBackgroundColor(android.R.color.holo_red_light)
                    tvNoteId.hasText("2")
                    tvNoteText.hasText("Note number 2")
                }
            }
        }
    }

    @Test
    fun checkFlakyTest() = run {
        MainScreen.clickFlakyButton()

        flakySafely(15000) {
            FlakуScreen.checkFlakyText()
        }
    }

}

