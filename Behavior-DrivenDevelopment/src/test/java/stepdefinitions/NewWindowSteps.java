package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NewWindowPage;

public class NewWindowSteps {
    private final NewWindowPage newWindowPage = new NewWindowPage();

    @Then("the page header should be {string}")
    public void verifyHeaderText(String expectedHeader) {
        Assert.assertEquals(newWindowPage.getHeaderText(), expectedHeader,
                "Header text mismatch");
    }
}
