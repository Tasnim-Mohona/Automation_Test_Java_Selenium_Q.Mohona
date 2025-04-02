package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.IndexPageNavigation;
import constants.LocatorConstants;
import org.openqa.selenium.By;

//public class IndexPages extends Form {
//
//    private final By checkboxLink = By.linkText("Checkboxes");
//    private final ILink getCheckboxLink = getElementFactory().getLink(By.xpath("//a[text()='Checkboxes']"),"Ce");
//    private final ILink checkboxesLink = getElementFactory().getLink(checkboxLink, "Checkboxes Link");
//    private final By multipleWindowLink = By.linkText("Multiple Window");
//    private final ILink multipleWindowsLink = getElementFactory().getLink(multipleWindowLink,"Multiple Window Link");
//
//    public IndexPages() {
//        super(By.xpath("//h1[text()='Welcome to the-internet']"), "Index Page");
//    }
//
//    public void navigateToCheckboxes() {
//        checkboxesLink.click();
////        getCheckboxLink.click();
//    }
//
//    public void navigateToMultipleWindows(){
//        multipleWindowsLink.click();
//    }
//}

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
