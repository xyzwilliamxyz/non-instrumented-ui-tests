package com.example.noninstrumentaltests.ui.login

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.noninstrumentaltests.R
import org.junit.After
import org.junit.Test

class LoginActivityInstrumentedTest {

    lateinit var scenario: ActivityScenario<LoginActivity>

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun whenOpeningLoginScreen_thenFieldsAreEmptyAndButtonIsDisabled() {
        // when
        scenario = launchActivity()

        // then
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))
        Espresso.onView(ViewMatchers.withId(R.id.login))
            .check(ViewAssertions.matches(ViewMatchers.isNotEnabled()))
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled() {
        // when
        scenario = launchActivity()
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .perform(
                ViewActions.click(),
                ViewActions.replaceText("test@email.com"),
                ViewActions.closeSoftKeyboard()
            )
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .perform(
                ViewActions.click(),
                ViewActions.replaceText("123456"),
                ViewActions.closeSoftKeyboard()
            )

        // then
        Espresso.onView(ViewMatchers.withId(R.id.username))
            .check(ViewAssertions.matches(ViewMatchers.withText("test@email.com")))
        Espresso.onView(ViewMatchers.withId(R.id.password))
            .check(ViewAssertions.matches(ViewMatchers.withText("123456")))
        Espresso.onView(ViewMatchers.withId(R.id.login))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication1() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication2() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication3() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication4() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication5() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication6() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication7() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication8() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication9() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }

    @Test
    fun whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled_duplication10() {
        whenOpeningLoginScreenAndTyping_thenFieldsAreNotEmptyAndButtonIsEnabled()
    }
}