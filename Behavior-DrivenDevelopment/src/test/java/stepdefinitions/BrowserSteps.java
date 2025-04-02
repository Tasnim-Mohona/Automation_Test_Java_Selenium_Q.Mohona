package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.When;

public class BrowserSteps {
    private String originalTab;

    @When("I store the current tab handle")
    public void storeCurrentTab() {
        originalTab = AqualityServices.getBrowser().tabs().getCurrentHandle();
    }

    @When("I wait for and switch to new tab")
    public void switchToNewTab() {
        AqualityServices.getBrowser().tabs().getCurrentHandle();
        AqualityServices.getBrowser().tabs().switchToLast();
    }

    @When("I switch back to original tab")
    public void switchToOriginalTab() {
        AqualityServices.getBrowser().tabs().switchTo(originalTab);
    }

    @When("I navigate back to previous page")
    public void navigateBack() {
        AqualityServices.getBrowser().goBack();
    }
}