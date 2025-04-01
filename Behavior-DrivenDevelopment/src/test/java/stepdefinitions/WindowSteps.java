package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.IndexPage;
import pages.MultipleWindowsPage;
import pages.NewWindowPage;

public class WindowSteps {
    private IndexPage indexPage;
    private MultipleWindowsPage multipleWindowsPage;
    private NewWindowPage newWindowPage;
    private String originalWindowHandle;

    @And("the {string} link should be visible")
    public void verifyClickHereLinkVisible(String linkText) {
        Assert.assertTrue(AqualityServices.getConditionalWait().waitFor(() ->
                        multipleWindowsPage.state().isDisplayed()),
                linkText + " link is not visible");
    }

    @When("I click the {string} link")
    public void clickClickHereLink(String linkText) {
        originalWindowHandle = AqualityServices.getBrowser().tabs().getCurrentHandle();
        multipleWindowsPage.clickHereLink();
    }

    @Then("a new tab with {string} header should open")
    public void verifyNewWindowOpened(String expectedHeader) {
        AqualityServices.getBrowser().tabs();
        newWindowPage = new NewWindowPage();
        newWindowPage.state().waitForDisplayed();
        Assert.assertTrue(newWindowPage.state().isDisplayed(),
                "New window page is not displayed");
    }

    @When("I switch back to the original tab")
    public void switchToOriginalTab() {
        AqualityServices.getBrowser().tabs().switchTo(originalWindowHandle);
    }

    @When("I navigate back to the main page")
    public void navigateBackToMainPage() {
        AqualityServices.getBrowser().goBack();
    }

    @Then("the main page should be displayed")
    public void verifyMainPageDisplayed() {
        indexPage.state().waitForDisplayed();
        Assert.assertTrue(indexPage.state().isDisplayed(),
                "Main page is not displayed after navigation");
    }
}