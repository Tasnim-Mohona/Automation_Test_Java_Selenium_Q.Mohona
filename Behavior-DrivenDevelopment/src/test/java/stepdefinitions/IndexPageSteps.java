package stepdefinitions;

import constants.IndexPageNavigation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.IndexPages;

public class IndexPageSteps {
    private final IndexPages indexPages = new IndexPages();

    @Given("I am on the-internet homepage in incognito mode")
    public void iAmOnTheMainPageOfWikipedia() {
        Assert.assertTrue(indexPages.state().isDisplayed(), "Page is not displayed");
    }

    @When("I navigate to the Checkboxes page")
    public void navigateToCheckboxesPage() {
        indexPages.clickNavigationLink(IndexPageNavigation.CHECKBOXES);
    }

    @Then("I navigate to the Multiple Window page")
    public void navigateToMultipleWindowsPage() {
        indexPages.clickNavigationLink(IndexPageNavigation.MULTIPLE_WINDOWS);
    }

    @Then("the main page should be displayed")
    public void verifyMainPageDisplayed() {
        indexPages.state().waitForDisplayed();
        Assert.assertTrue(indexPages.state().isDisplayed(),
                "Main page is not displayed after navigation");
    }
}


//    @When("I navigate to the {string} page")
//    public void navigateToMultipleWindowsPage(String navigate) {
//        indexPages.clickNavigationLink(IndexPageNavigation.valueOf(navigate));
//    }