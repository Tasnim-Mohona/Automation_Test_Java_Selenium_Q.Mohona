package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class Hooks {

    @Before
    public void setUp() {
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
        getBrowser().maximize();
        getBrowser().waitForPageToLoad();
    }

    @After
    public void tearDown() {
        if (getBrowser().isStarted()) {
            getBrowser().quit();
        }
    }
}
