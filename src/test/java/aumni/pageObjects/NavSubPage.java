package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NavSubPage extends BasePage {

    public NavSubPage(WebDriver driver) {
        super(driver);
    }

    public
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
        getElementWithWait(resourcesNavOption).click();
    }
}
