package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class NewWindowPage extends Form {
    private final static String PAGE_NAME = "New Window";
    private final ITextBox headerTextBox = AqualityServices.getElementFactory().getTextBox(By.tagName("h3"),
            "New Window Header");

    public NewWindowPage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH,PAGE_NAME)),PAGE_NAME);
    }

    public String getHeaderText() {
        return headerTextBox.getText();
    }
}
