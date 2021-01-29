package aumni.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SolutionForFinancePage extends AumniBasePage {

    String expectedHeaderText = "Finance";

    public SolutionForFinancePage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/solution-finance");
    }

    @FindBy(xpath="//*[@id=\"comp-k9e6ndwx1\"]/h1/span/span/span")
    @CacheLookup
    WebElement pageHeader;

    public String getPageHeaderText() {
        return getElementWithWait(pageHeader).getText();
    }

    public String getExpectedHeaderText() {
        return expectedHeaderText;
    }
}
