package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends AumniBasePage{

    String expectedPageHeaderText = "The Venture Blog";

    public BlogPage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/blog");
    }

    @FindBy(xpath="//*[@id=\"comp-k5fokdgu\"]/h2")
    @CacheLookup
    WebElement pageHeader;

    public String getPageHeaderText() {
        return getElementWithWait(pageHeader).getText();
    }

    public String getExpectedPageHeaderText() {
        return expectedPageHeaderText;
    }
}
