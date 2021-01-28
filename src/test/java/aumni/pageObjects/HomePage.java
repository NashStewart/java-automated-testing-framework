package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    String pageUrl = "https://www.aumni.fund/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="comp-kd5ryhsn0label")
    @CacheLookup
    WebElement solutionsNavOption;

    @FindBy(id="comp-kd5ryhsn1label")
    @CacheLookup
    WebElement resourcesNavOption;

    @FindBy(id="comp-kd5ryhsn2label")
    @CacheLookup
    WebElement blogNavOption;

    @FindBy(id="comp-kd5ryhsn3label")
    @CacheLookup
    WebElement loginNavOption;

    @FindBy(id="comp-keoczc17")
    @CacheLookup
    WebElement getADemoButton;

    public void clickResourcesNavOption() {
        resourcesNavOption.click();
    }

    public void goTo() {
        driver.get(pageUrl);
    }
}
