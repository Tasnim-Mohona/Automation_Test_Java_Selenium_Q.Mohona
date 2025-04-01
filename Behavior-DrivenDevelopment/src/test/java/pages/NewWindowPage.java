package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class NewWindowPage extends Form {
    private final ILink toolsBtn = AqualityServices.getElementFactory().getLink(By.id("vector-page-tools-dropdown"), "Tools Button");
    private final IButton pageInformationLocator = getElementFactory().getButton(By.id("t-info"), "Page Information");
    private final ILink downloadBtn = AqualityServices.getElementFactory().getLink(By.xpath("//span[text()='Download as PDF']"), "Download Link");

    public NewWindowPage() {
        super(By.xpath("//input[@aria-label='Tools']"), "Tools");
    }

    public void clickTools() {
        toolsBtn.click();
    }

    public void clickFileDownloadPageBtn() {
        downloadBtn.click();
    }

    public void clickPageInfo() {
        pageInformationLocator.click();
    }
}
