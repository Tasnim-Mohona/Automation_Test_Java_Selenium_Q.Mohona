package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckboxPage extends Form {
    private static final By PAGE_HEADING = By.xpath("//a[contains(text(),'Checkboxes')]");
    private final By CHECKBOX1 = By.xpath("//*[text()[contains(.,'checkbox 1')]]");
    protected final ICheckBox checkboxBtn1 = getElementFactory().getCheckBox(CHECKBOX1, "Checkbox1");

    public CheckboxPage() {
        super(PAGE_HEADING, "Page Name");
    }

    public void clickCheckbox() {
        checkboxBtn1.click();
    }

    public boolean isSelected() {
        return checkboxBtn1.isChecked();
    }
}
