package tests;

import aquality.selenium.browser.AqualityServices;
import constants.IndexPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.IndexPage;
import pages.MultipleWindowsPage;
import pages.NewWindowPage;

public class TestCases extends BaseTest {

    @Test
    public void checkboxTest() {
        IndexPage indexPage = new IndexPage();
        CheckboxPage checkboxPage = new CheckboxPage();
        indexPage.clickNavigationLink(IndexPageNavigation.CHECKBOXES);
        checkboxPage.state().waitForDisplayed();
        Assert.assertTrue(checkboxPage.state().isDisplayed(),"Checkbox Page is not Displayed");
        checkboxPage.clickCheckbox();
        AqualityServices.getBrowser().refresh();
        Assert.assertFalse(checkboxPage.isSelected(), "Checkbox 1 should be unchecked");
    }

    @Test
    public void Testcase2() {
        IndexPage indexPage = new IndexPage();
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
        NewWindowPage newWindowPage = new NewWindowPage();
        indexPage.clickNavigationLink(IndexPageNavigation.MULTIPLE_WINDOWS);
        Assert.assertTrue(multipleWindowsPage.state().isDisplayed(), "Multiple Windows Page is not Displayed");
        AqualityServices.getBrowser().tabs().getTabHandles();
        multipleWindowsPage.clickHereLink();
        Assert.assertTrue(newWindowPage.state().isDisplayed(), "New Window Page is not Displayed");
        AqualityServices.getBrowser().tabs().switchToTab(0);
        AqualityServices.getBrowser().goBack();
        Assert.assertTrue(indexPage.state().isDisplayed(), "Index Windows Page not Displayed");
    }
}
