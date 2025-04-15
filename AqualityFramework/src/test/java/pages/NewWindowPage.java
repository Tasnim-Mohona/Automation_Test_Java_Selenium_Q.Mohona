package pages;

import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class NewWindowPage extends Form {

    private static final String PAGE_NAME = "New Window";

    public NewWindowPage() {
//        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
        super(By.xpath("//*[normalize-space(text())='New Window']"),"New Window");
    }
}
