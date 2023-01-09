package com.example.cicdpractcewithandroid

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    // use createAndroidComposeRule<YourActivity>() if you need access to
    // an activity

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun textComposableExistsTest() {
        val targetText = "Hello Android!"
        composeTestRule.onNodeWithText(targetText).assertExists()
    }

    @Test
    fun textComposableDoesNotExistTest() {
        val targetText = "Hello World!"
        composeTestRule.onNodeWithText(targetText).assertDoesNotExist()
    }

}