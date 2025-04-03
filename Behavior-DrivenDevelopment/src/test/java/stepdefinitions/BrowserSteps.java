package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BrowserHelper;

public class BrowserSteps {

    @When("I store the Index Page Tab handle")
    public void storeIndexTabs() {
        BrowserHelper.storeIndexWindow();
    }

    @And("I wait for and switch to new tab")
    public void switchToNewTab() {
        BrowserHelper.switchToNewWindow();
    }

    @When("I switch back to index window")
    public void switchToMainWindow() {
        BrowserHelper.switchToMainWindow();
        AqualityServices.getBrowser().goBack();
    }
}
