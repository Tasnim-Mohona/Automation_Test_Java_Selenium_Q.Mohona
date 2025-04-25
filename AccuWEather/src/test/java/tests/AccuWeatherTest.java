package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class AccuWeatherTest extends BaseTest {
    private static final By CONSENT_BUTTON_LOCATOR = By.className("banner-button");
    private static final String SEARCH_INPUT_VALUE = "New York";
    private static final By SEARCH_RESULTS_CONTAINER_LOCATOR = By.className("results-container");
    private static final By SEARCH_RESULT_LOCATOR = By.className("search-bar-result__long-name");
    private static final By SEARCH_FIELD = By.className("search-input");
    private static final By CLICKED_PAGE = By.className("header-city-link");

    @Test
    public void searchAndClickFirstResult() {
        WaitForElementVisibility(CONSENT_BUTTON_LOCATOR);
        WebElement consentButton = driver.findElement(CONSENT_BUTTON_LOCATOR);
        consentButton.click();

        WebElement searchField = driver.findElement(SEARCH_FIELD);
        searchField.sendKeys(SEARCH_INPUT_VALUE);

        WaitForElementVisibility(SEARCH_RESULTS_CONTAINER_LOCATOR);

        List<WebElement> searchResults = driver.findElements(SEARCH_RESULT_LOCATOR);
        if (!searchResults.isEmpty()) {
            WebElement firstElement = searchResults.get(0);
            firstElement.click();
            WaitForElementVisibility(CLICKED_PAGE);
        }
    }

    private boolean WaitForElementVisibility(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }

    }
}
