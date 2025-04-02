package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.NewWindowPage;
import org.testng.Assert;

public class NewWindowSteps {
    private final NewWindowPage newWindowPage = new NewWindowPage();

    @Then("the New Window page should be displayed")
    public void verifyNewWindowPage() {
        newWindowPage.state().waitForDisplayed();
        Assert.assertTrue(newWindowPage.state().isDisplayed(),
                "New Window page should be visible");
    }

    @Then("the page header should be {string}")
    public void verifyHeaderText(String expectedHeader) {
        Assert.assertEquals(newWindowPage.getHeaderText(), expectedHeader,
                "Header text mismatch");
    }
}