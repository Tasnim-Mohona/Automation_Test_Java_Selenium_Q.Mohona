package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MultipleWindowsPage;

public class MultipleWindowsPageSteps {

    private MultipleWindowsPage multipleWindowsPage;
    private String originalWindowHandle;

    @Then("the Multiple Windows page should be displayed")
    public void verifyMultipleWindowsPageDisplayed() {
        multipleWindowsPage = new MultipleWindowsPage();
        multipleWindowsPage.state().waitForDisplayed();
        Assert.assertTrue(multipleWindowsPage.state().isDisplayed(),
                "Multiple Windows page is not displayed");
    }

    @And("the {string} link should be visible")
    public void verifyClickHereLinkVisible(String linkText) {
        Assert.assertTrue(AqualityServices.getConditionalWait().waitFor(() ->
                        multipleWindowsPage.state().isDisplayed()),
                linkText + " link is not visible");
    }
    @When("I switch back to the original tab")
    public void switchToOriginalTab() {
        AqualityServices.getBrowser().tabs().switchTo(originalWindowHandle);
    }
    @When("I click the {string} link")
    public void clickClickHereLink(String linkText) {
        originalWindowHandle = AqualityServices.getBrowser().tabs().getCurrentHandle();
        multipleWindowsPage.clickHereLink();
    }

}