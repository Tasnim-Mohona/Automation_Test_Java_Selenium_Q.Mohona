package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.IndexPageNavigation;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class MultipleWindowsPage extends Form {
    private static final String PAGE_NAME = "Click Here";
    private final ILink clickHereLink = AqualityServices.getElementFactory().getLink(By.linkText("Click Here"), "Link");

    public MultipleWindowsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public ILink getNavigationLink(IndexPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, navigation.getLabel())), navigation.getLabel());
    }

    public void clickNavigationLink(IndexPageNavigation navigation) {
        getNavigationLink(navigation).click();
    }
}
