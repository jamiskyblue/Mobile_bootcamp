package page;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='Forgot your password?']")
    WebElement forgotPass;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userName;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement pass;

    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement login;

    public void clickForgotPass() {
        sleepFor(10);
        forgotPass.click();
    }

    public void fillUsernamePass(String usName, String password) {
        sleepFor(4);
        userName.sendKeys(usName);
        pass.sendKeys(password);
    }

    public void clickOnLogin() {
        String loginn = login.getText();
        login.click();
        System.out.println(loginn + ": has been clicked");
    }

}