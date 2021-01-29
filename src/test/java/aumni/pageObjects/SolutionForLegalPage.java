package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SolutionForLegalPage extends AumniBasePage {

    String expectedHeaderText = "Legal";

    public SolutionForLegalPage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/solution-legal");
    }

    @FindBy(xpath="//*[@id=\"comp-k9eloc0g1\"]/h1/span/span/span")
    @CacheLookup
    WebElement pageHeader;

    public String getPageHeaderText() {
        return getElementWithWait(pageHeader).getText();
    }

    public String getExpectedHeaderText() {
        return expectedHeaderText;
    }
}
