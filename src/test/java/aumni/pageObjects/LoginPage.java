package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AumniBasePage{

    String expectedLoginButtonText = "Login";

    public LoginPage(WebDriver driver) {
        super(driver, "https://app.aumni.fund/login");
    }

    @FindBy(xpath="//button[contains(@class, 'login-page-dialog-button')]")
    @CacheLookup
    WebElement loginButton;

    public String getLoginButtonText() {
        return getElementWithWait(loginButton).getText();
    }

    public String getExpectedLoginButtonText() {
        return expectedLoginButtonText;
    }
}