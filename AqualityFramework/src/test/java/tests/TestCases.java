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
    public void testMultipleWindowsNavigation() {

        IndexPage indexPage = new IndexPage();
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();

        indexPage.clickNavigationLink(IndexPageNavigation.MULTIPLE_WINDOWS);
        multipleWindowsPage.state().waitForDisplayed();

        Assert.assertTrue(multipleWindowsPage.state().isDisplayed(),
                "Multiple Windows page should be displayed");

        String originalTab = AqualityServices.getBrowser().tabs().getCurrentTabHandle();

        multipleWindowsPage.clickNavigationLink(IndexPageNavigation.CLICK_HERE);

        AqualityServices.getBrowser().tabs().getCurrentTabHandle();
        AqualityServices.getBrowser().tabs().switchToLastTab();

        NewWindowPage newWindowPage = new NewWindowPage();
        newWindowPage.state().waitForDisplayed();
        Assert.assertTrue(newWindowPage.state().isDisplayed(),
                "New Window page should be displayed");

        AqualityServices.getBrowser().tabs().switchToTab(originalTab);
        AqualityServices.getBrowser().goBack();

        indexPage.state().waitForDisplayed();
        Assert.assertTrue(indexPage.state().isDisplayed(),
                "Main page should be displayed after navigation");
    }
}
