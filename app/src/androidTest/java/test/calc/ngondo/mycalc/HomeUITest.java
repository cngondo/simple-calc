package test.calc.ngondo.mycalc;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeUITest {

    @Rule
    public ActivityTestRule<Home> homeActivityTestRule = new ActivityTestRule<Home>(Home.class);

    @Test
    public void clickAddButton() throws Exception{
        //performing a click action
        onView(withId(R.id.buttonAdd)).perform(click());
        //checking whether the Textview has displayed anything
        onView(withId(R.id.answer)).check(matches(isDisplayed()));
    }

}
