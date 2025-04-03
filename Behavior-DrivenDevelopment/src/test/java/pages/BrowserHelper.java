package pages;

import aquality.selenium.browser.AqualityServices;
import java.util.Set;

public class BrowserHelper {
    private static String mainWindowHandle;

    public static void storeIndexWindow() {
        mainWindowHandle = AqualityServices.getBrowser().getDriver().getWindowHandle();
    }

    public static void switchToNewWindow() {
        Set<String> allWindows = AqualityServices.getBrowser().getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(mainWindowHandle)) {
                AqualityServices.getBrowser().getDriver().switchTo().window(window);
                break;
            }
        }
    }

    public static void switchToMainWindow() {
        AqualityServices.getBrowser().getDriver().switchTo().window(mainWindowHandle);
    }
}
