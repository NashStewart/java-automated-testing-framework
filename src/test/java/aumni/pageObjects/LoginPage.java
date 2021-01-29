package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AumniBasePage{

    String expectedLoginButtonText = "Login";
    String expectedWrongLoginMessageText = "WRONG EMAIL OR PASSWORD.";

    public LoginPage(WebDriver driver) {
        super(driver, "https://app.aumni.fund/login");
    }

    @FindBy(xpath="//button[contains(@class, 'login-page-dialog-button')]")
    @CacheLookup
    WebElement loginButton;

    @FindBy(id="1-email")
    @CacheLookup
    WebElement emailField;

    @FindBy(xpath="//input[contains(@name, 'password')]")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath="//button[contains(@name, 'submit')]")
    @CacheLookup
    WebElement submitButton;

    @FindBy(xpath="//*[text() = 'Wrong email or password.']")
    @CacheLookup
    WebElement wrongLoginMessage;

    public void clickLogin() {
        getElementWithWait(loginButton).click();
    }

    public void inputEmail(String email) {
        getElementWithWait(emailField).sendKeys(email);
    }

    public void inputPassword(String password) {
        getElementWithWait(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        getElementWithWait(submitButton).click();
    }

    public String getWrongLoginMessageText() {
        return getElementWithWait(wrongLoginMessage).getText();
    }

    public void login(String email, String password) {
        clickLogin();
        inputEmail(email);
        clickSubmit();
        inputPassword(password);
        clickSubmit();
    }

    public String getLoginButtonText() {
        return getElementWithWait(loginButton).getText();
    }

    public String getExpectedLoginButtonText() {
        return expectedLoginButtonText;
    }

    public String getExpectedWrongLoginMessageText() {
        return expectedWrongLoginMessageText;
    }
}