package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.MultipleWindowsPage;
import org.testng.Assert;

public class MultipleWindowsPageSteps {
    private final MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();

    @Then("the Multiple Windows page should be displayed")
    public void verifyMultipleWindowsPage() {
        multipleWindowsPage.state().waitForDisplayed();
        Assert.assertTrue(multipleWindowsPage.state().isDisplayed(),
                "Multiple Windows page should be visible");
    }

    @When("I click the Click Here link")
    public void clickClickHereLink() {
        multipleWindowsPage.clickHereLink();
    }
}