package pages;

import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckboxPage extends Form {

    private final By checkBox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private final ICheckBox checkboxBtn1 = getElementFactory().getCheckBox(checkBox1, "Checkbox1");

    public CheckboxPage() {
        super(By.xpath("//h3[text()='Checkboxes']"), "Checkboxes Page");
    }

    public void clickCheckbox1() {
        checkboxBtn1.click();
    }

    public boolean isCheckbox1Selected() {
        return checkboxBtn1.isChecked();
    }
}