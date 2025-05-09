package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.IndexPageNavigation;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class IndexPages extends Form {

    public IndexPages() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, "Welcome to the-internet")), "Index Page");
    }

    private ILink getNavigationLink(IndexPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH,navigation.getLabel())), navigation.getLabel());
    }

    public void clickNavigationLink(IndexPageNavigation navigation) {
        getNavigationLink(navigation).click();
    }
}
