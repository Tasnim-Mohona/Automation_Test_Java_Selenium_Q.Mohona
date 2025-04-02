package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.NewWindowPage;

public class NewWindowSteps {

    @Then("a new tab with {string} header should open")
    public void verifyNewWindowOpened(String expectedHeader) {
        AqualityServices.getBrowser().tabs();
        NewWindowPage newWindowPage = new NewWindowPage();
        newWindowPage.state().waitForDisplayed();
        Assert.assertTrue(newWindowPage.state().isDisplayed(),
                "New window page is not displayed");
    }

    @When("I navigate back to the main page")
    public void navigateBackToMainPage() {
        AqualityServices.getBrowser().goBack();
    }
}