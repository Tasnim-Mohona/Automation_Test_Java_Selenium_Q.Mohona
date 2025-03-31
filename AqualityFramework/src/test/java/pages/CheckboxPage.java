package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckboxPage extends Form {

    private final By CHECKBOX1 = By.xpath("//form[@id='checkboxes']/input[1]");
    protected final ICheckBox checkboxBtn1 = getElementFactory().getCheckBox(CHECKBOX1, "Checkbox1");

    public CheckboxPage() {
        super(By.xpath("//*[contains(., 'Checkboxes')]"), "Page Name");
    }

    public void clickCheckbox() {
        checkboxBtn1.click();
    }

    public boolean isSelected() {
        return checkboxBtn1.isChecked();
    }
}
