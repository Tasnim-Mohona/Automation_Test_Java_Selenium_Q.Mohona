package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MultipleWindowsPage;

public class MultipleWindowsPageSteps {
    private final MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();

    @Then("I validate Multiple Page Header is {string}")
    public void verifyMultipleWindowsPage(String expectedHeader) {
        Assert.assertEquals(multipleWindowsPage.getHeaderText(), expectedHeader, "Header text mismatch");
    }

    @When("I click the Click Here link")
    public void clickClickHereLink() {
        multipleWindowsPage.clickHereLink();
    }
}
