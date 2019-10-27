package page;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;


    //XCUIElementTypeStaticText[@value = 'Personal Banking']
    //XCUIElementTypeButton
    //XCUIElementTypeOther


    public void UIvalidations() {
        sleepFor(10);
        if (accounts.isDisplayed()) {
            System.out.println(accounts.getText() + " : is displayed");
        }
        if (transfer.isDisplayed()) {
            System.out.println(transfer.getText() + " : is displayed");
        }
        if (deposit.isDisplayed()) {
            System.out.println(deposit.getText() + " : is displayed");
        }
        if (sendMoney.isDisplayed()) {
            System.out.println(sendMoney.getText() + " : is displayed");
        }
    }

    /**
     * This Method will click on Account
     *
     * @Author - Zann
     */

    public void clickOnAccountt() {
        sleepFor(10);
        //ad.findElement(By.xpath("abcd")).click();
        String account = accounts.getText();
        accounts.click();
        TestLogger.log(" message ");
        System.out.println(account + ": has been clicked");
    }

    public void clickOnLogin() {
        sleepFor(3);
        String account = accounts.getText();
        accounts.click();
        System.out.println(account + ": has been clicked");
        sleepFor(4);

    }

    public void swipeDown() {
        sleepFor(5);
        MobileAPI.functionSwipe("up", 200, 200);

    }
}