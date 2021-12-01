package com.ziad.motasem.hellotest2

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.ziad.motasem.hellotest2.data.ListOfItems
import org.hamcrest.Matchers.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RecyclerViewTest {
    lateinit var recyclerView: RecyclerView
    private val recyclerViewId = R.id.rvItems

    @get: Rule
    val activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    val LIST_ITEM_IN_TEST = 4
    val ITEM_IN_TEST = ListOfItems.items[LIST_ITEM_IN_TEST]

    @Before
    fun setUpTest() {
        activityRule.scenario.onActivity {
            // This step is already built-in with Kotlin
        }
    }

    @Test
    fun testRecyclerViewIsCorrect() {
        onView(withId(recyclerViewId)).check(matches(isDisplayed()))
    }

    @Test
    fun testRecyclerViewNotDisplayed() {
        onView(withText(LIST_ITEM_IN_TEST)).check(doesNotExist())
    }

    @Test
    fun testRecyclerViewIsDisplayed() {
        onView(withText(LIST_ITEM_IN_TEST)).check(matches(not(doesNotExist())))
    }

    @Test
    fun testRecyclerScroll(){
        onData(equalTo(LIST_ITEM_IN_TEST)).check(matches(isCompletelyDisplayed()))
    }

    @Test
    fun rowClick() {
        onData(allOf()).inAdapterView(withId(recyclerViewId)).atPosition(LIST_ITEM_IN_TEST).perform(
            click()
        )
    }
}