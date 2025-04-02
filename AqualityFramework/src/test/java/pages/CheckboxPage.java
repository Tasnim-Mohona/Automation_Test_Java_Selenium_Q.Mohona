package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class CheckboxPage extends Form {
    private static final String PAGE_NAME = "Checkboxes";
    private final By CHECKBOX1 = By.xpath("//form[@id='checkboxes']/input[1]");
    protected final ICheckBox checkbox1 = getElementFactory().getCheckBox(CHECKBOX1, "Checkbox1");

    public CheckboxPage() {
//        super(By.xpath("//*[contains(., 'Checkboxes')]"), "Page Name");
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)),PAGE_NAME);
    }

    public void clickCheckbox() {
        checkbox1.click();
    }

    public boolean isSelected() {
        return checkbox1.isChecked();
    }
}
