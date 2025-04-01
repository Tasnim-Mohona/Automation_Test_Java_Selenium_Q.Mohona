package stepdefinitions;

import constants.IndexPageNavigation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.IndexPage;

public class IndexPageSteps {
    private final IndexPage indexPage = new IndexPage();

    @Given("I am on the-internet homepage in incognito mode")
    public void iAmOnTheMainPageOfWikipedia() {
        Assert.assertTrue(indexPage.state().waitForDisplayed(), "Page is not displayed");
    }

    @When("I navigate to the Checkboxes page")
    public void navigateToCheckboxPage() {
        indexPage.clickNavigationLink(IndexPageNavigation.MULTIPLE_WINDOWS);
    }

    @When("I navigate to the Multiple Windows page")
    public void navigateToMultipleWindowsPage() {
        indexPage.clickNavigationLink(IndexPageNavigation.MULTIPLE_WINDOWS);

    }

}
