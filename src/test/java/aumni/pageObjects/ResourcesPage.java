package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResourcesPage {

    WebDriver driver;
    String pageUrl = "https://www.aumni.fund/resources";

    public ResourcesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id='comp-kb710n23']/h3")
    @CacheLookup
    WebElement featuredResourcesHeader;

    public String getFeaturedResourcesHeaderText() {
        return getElementAfterWait(featuredResourcesHeader).getText();
    }

    public void goTo() {
        driver.get(pageUrl);
    }

    private WebElement getElementAfterWait(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
    }
}
