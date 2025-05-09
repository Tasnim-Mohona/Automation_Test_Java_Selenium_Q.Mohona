package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class CheckboxesPage extends Form {
    private final static String PAGE_NAME = "Checkboxes";
    private final By checkBox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private final ICheckBox checkboxBtn1 = getElementFactory().getCheckBox(checkBox1, "Checkbox1");

    public CheckboxesPage() {
        super(By.xpath(String.format(LocatorConstants.PARTICULAR_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickCheckbox1() {
        checkboxBtn1.click();
    }

    public boolean isCheckbox1Selected() {
        return checkboxBtn1.isChecked();
    }
}
