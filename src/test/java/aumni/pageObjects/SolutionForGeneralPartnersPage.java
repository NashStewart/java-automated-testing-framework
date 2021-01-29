package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SolutionForGeneralPartnersPage extends AumniBasePage {

    String expectedHeaderText = "General Partners";

    public SolutionForGeneralPartnersPage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/solution-general-partner");
    }

    @FindBy(xpath="//*[@id=\"comp-k9bn1qh7\"]/h1/span/span/span")
    @CacheLookup
    WebElement pageHeader;

    public String getPageHeaderText() {
        return getElementWithWait(pageHeader).getText();
    }

    public String getExpectedHeaderText() {
        return expectedHeaderText;
    }
}
