package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class NewWindowPage extends Form {
    private final ITextBox headerTextBox = AqualityServices.getElementFactory().getTextBox(
            By.tagName("h3"),
            "New Window Header"
    );

    public NewWindowPage() {
        super(By.tagName("h3"), "New Window Page");
    }

    public String getHeaderText() {
        return headerTextBox.getText();
    }
}