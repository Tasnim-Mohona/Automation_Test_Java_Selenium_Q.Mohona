//package pages;
//
//import aquality.selenium.elements.interfaces.IButton;
//import aquality.selenium.elements.interfaces.ILabel;
//import aquality.selenium.forms.Form;
//import org.openqa.selenium.By;
//
//public class IndexPage extends Form {
//    private static final By OPTION_NAME = By.linkText("Checkboxes");
//    private final ILabel optionLabel = getElementFactory().getLabel(OPTION_NAME,"Option to Click");
//    private final ILabel fileLabel = getElementFactory().getLabel(OPTION_NAME,"PDF NAME");
//    private final IButton downloadBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Download Button");
//
//    public IndexPage() {
//        super(OPTION_NAME,"Option to Click");
//    }
//
//    public void clickOption() {
//        optionLabel.click();
//    }
//}


package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import constants.IndexPageNavigation;
import org.openqa.selenium.By;
import constants.LocatorConstants;

public class IndexPage extends Form {

    public IndexPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Welcome to the-internet")), "Main Page");
    }

    private ILink getNavigationLink(IndexPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,navigation.getLabel())), navigation.getLabel());
    }

    public void clickNavigationLink(IndexPageNavigation navigation) {
        getNavigationLink(navigation).click();
    }
}
