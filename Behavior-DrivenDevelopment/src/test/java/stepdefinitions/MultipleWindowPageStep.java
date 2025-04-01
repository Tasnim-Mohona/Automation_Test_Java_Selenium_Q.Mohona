package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MultipleWindowsPage;

public class MultipleWindowPageStep {

    @Then("the Multiple Windows page should be displayed")
    public void verifyMultipleWindowsPageDisplayed() {
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
        multipleWindowsPage.state().waitForDisplayed();
        Assert.assertTrue(multipleWindowsPage.state().isDisplayed(),
                "Multiple Windows page is not displayed");
    }
}