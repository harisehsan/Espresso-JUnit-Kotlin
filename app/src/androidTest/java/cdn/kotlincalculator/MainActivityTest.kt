package cdn.kotlincalculator


import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Matcher

import com.squareup.javawriter.JavaWriter.type
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)
    val additionResult = "4"
    val subtractionResult = "2"


    @Before
    fun setUp() {

    }

    @Test
    fun addition()
    {
        Espresso.onView(withId(R.id.num2)).perform(click());
        Espresso.onView(withId(R.id.actionAdd)).perform(click());
        Espresso.onView(withId(R.id.num2)).perform(click());
        Espresso.onView(withId(R.id.actionEquals)).perform(click());
        Espresso.onView(withId(R.id.answer)).check(matches(withText(additionResult)));
    }

    @Test
    fun subtraction()
    {
        Espresso.onView(withId(R.id.num4)).perform(click());
        Espresso.onView(withId(R.id.actionMinus)).perform(click());
        Espresso.onView(withId(R.id.num2)).perform(click());
        Espresso.onView(withId(R.id.actionEquals)).perform(click());
        Espresso.onView(withId(R.id.answer)).check(matches(withText(subtractionResult)));
    }

    @After
    fun tearDown() {
    }
}