package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NavSubPage extends BasePage {

    public NavSubPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="comp-kd5ryhsn0label")
    @CacheLookup
    WebElement solutionsNavOption;

    @FindBy(id="comp-kd5ryhsnmoreContainer0label")
    @CacheLookup
    WebElement aumniForGeneralPartnersNavOption;

    @FindBy(id="comp-kd5ryhsnmoreContainer1label")
    @CacheLookup
    WebElement aumniForFinanceNavOption;

    @FindBy(id="comp-kd5ryhsnmoreContainer2label")
    @CacheLookup
    WebElement aumniForLegalNavOption;

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

    public void clickAumniForGeneralPartnersNavOption() {
        clickSolutionsOption(aumniForGeneralPartnersNavOption);
    }

    public void clickAumniForFinanceNavOption() {
        clickSolutionsOption(aumniForFinanceNavOption);
    }

    public void clickAumniForLegalNavOption() {
        clickSolutionsOption(aumniForLegalNavOption);
    }

    public void clickResourcesNavOption() {
        getElementWithWait(resourcesNavOption).click();
    }

    public void clickBlogNavOption() {
        getElementWithWait(blogNavOption).click();
    }

    public void clickLoginNavOption() {
        getElementWithWait(loginNavOption).click();
    }

    public void clickGetADemoNavOption() {
        getElementWithWait(getADemoButton).click();
    }

    private void clickSolutionsOption(WebElement element) {
        moveToElement(solutionsNavOption);
        getElementWithWait(element).click();
    }
}
