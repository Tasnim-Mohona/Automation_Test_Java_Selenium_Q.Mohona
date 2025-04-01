package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.IndexPageNavigation;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class MultipleWindowsPage extends Form {
    private static final String PAGE_NAME = "Multiple Window";
    private final ILink clickHereLink = AqualityServices.getElementFactory().getLink(By.linkText("Click Here"),
            "Click Here Link"
    );

    public MultipleWindowsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, IndexPageNavigation.MULTIPLE_WINDOWS)), PAGE_NAME);
    }

    public void clickHereLink() {
        clickHereLink.click();
    }

    public boolean isClickHereLinkDisplayed() {
        return clickHereLink.state().isDisplayed();
    }
}