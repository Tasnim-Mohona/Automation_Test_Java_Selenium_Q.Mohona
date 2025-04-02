package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CheckboxesPage;

public class CheckboxPageSteps {
    private final CheckboxesPage checkboxPage = new CheckboxesPage();

    @Then("the Checkboxes page should be displayed")
    public void verifyCheckboxesPageDisplayed() {
//        checkboxPage.state().waitForDisplayed();
        Assert.assertTrue(checkboxPage.state().isDisplayed(), "Checkboxes page is not displayed");
    }

    @When("I select Checkbox 1")
    public void selectCheckbox1() {
        checkboxPage.clickCheckbox1();
    }

    @Then("Checkbox 1 should be selected")
    public void verifyCheckbox1Selected() {
        Assert.assertTrue(checkboxPage.isCheckbox1Selected(), "Checkbox 1 should be selected");
    }

    @When("I refresh the page")
    public void refreshPage() {
        AqualityServices.getBrowser().refresh();
        checkboxPage.state().waitForDisplayed();
    }

    @Then("Checkbox 1 should not be selected")
    public void verifyCheckbox1NotSelected() {
        Assert.assertFalse(checkboxPage.isCheckbox1Selected(), "Checkbox 1 should not be selected after refresh");
    }
}