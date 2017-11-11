package cc.somkiat.basicunittesting.Controller;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cc.somkiat.basicunittesting.R;

import static android.app.PendingIntent.getActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void revertTest() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

    @Test
    public void saveSuccessfulTest() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("John Smith"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("test@gmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Save Successful")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

    @Test
    public void saveFailNoName() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText(""));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("test@gmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Name is Empty String")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }


    @Test
    public void saveFailNoEmail() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("John Smith"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText(""));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Email is Empty")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

    @Test
    public void saveFailInvalidName() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("Sam1337"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("test@gmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Name contain non Alphabet Characters")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }
    
    @Test
    public void saveFailInvalidEmail() {
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());
        onView(withId(R.id.userNameInput)).perform(scrollTo() ,replaceText("John Smith"));
        onView(withId(R.id.emailInput)).perform(scrollTo(), replaceText("gmail.com"));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withText("Email is Invalid")).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

}
