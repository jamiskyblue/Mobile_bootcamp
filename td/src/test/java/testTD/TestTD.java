package testTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LogInPage;

public class TestTD extends MobileAPI {
    HomePage homePage;
    LogInPage logInPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        logInPage = PageFactory.initElements(appiumDriver, LogInPage.class);
    }


    //@Test
    public void uiTestCases() {
        homePage.UIvalidations();
    }

    //@Test
    public void forgotPassFunctionality() {
        homePage.clickOnAccountt();
        logInPage.clickForgotPass();
    }

    @Test
    public void swipe() {
        homePage.swipeDown();
    }

    //@Test
    public void checkAccountBalance() {
        homePage.clickOnAccountt();
        logInPage.fillUsernamePass("user", "pass");
    }
}