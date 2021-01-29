package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends AumniBasePage {

    String expectedPageHeaderText = "Resources";
    String expectedPageSubHeaderText = "Learn more about Aumni's investment analytics solution, thought leadership and testimonials. ";
    String expectedFeaturedResourceHeaderText = "Featured Resource";

    public ResourcesPage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/resources");
    }

    @FindBy(xpath="//*[@id=\"comp-kbqxgkcj\"]/h1/span/span/span")
    @CacheLookup
    WebElement pageHeader;

    @FindBy(xpath="//*[@id=\"comp-kbqxgkcm\"]/p/span")
    @CacheLookup
    WebElement pageSubHeader;

    @FindBy(xpath="//*[@id='comp-kb710n23']/h3")
    @CacheLookup
    WebElement featuredResourceHeader;

    public String getPageHeaderText() {
        return getElementWithWait(pageHeader).getText();
    }

    public String getPageSubHeaderText() {
        return getElementWithWait(pageSubHeader).getText();
    }

    public String getFeaturedResourceHeaderText() {
        return getElementWithWait(featuredResourceHeader).getText();
    }

    public String getExpectedPageHeaderText() {
        return expectedPageHeaderText;
    }

    public String getExpectedPageSubHeaderText() {
        return expectedPageSubHeaderText;
    }

    public String getExpectedFeaturedResourceHeaderText() {
        return expectedFeaturedResourceHeaderText;
    }
}
