package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends AumniBasePage {

    public ResourcesPage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/resources");
    }

    @FindBy(xpath="//*[@id='comp-kb710n23']/h3")
    @CacheLookup
    WebElement featuredResourcesHeader;

    public String getFeaturedResourcesHeaderText() {
        return getElementWithWait(featuredResourcesHeader).getText();
    }
}
