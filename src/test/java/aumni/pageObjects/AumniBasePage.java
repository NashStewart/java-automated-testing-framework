package aumni.pageObjects;

import org.openqa.selenium.WebDriver;

public class AumniBasePage extends BasePage {

    String pageUrl;
    NavSubPage nav;

    public AumniBasePage(WebDriver driver, String pageUrl) {
        super(driver);
        this.pageUrl = pageUrl;
        this.nav = new NavSubPage(driver);
    }

    public NavSubPage getNav() {
        return nav;
    }

    public void goTo() {
        driver.get(pageUrl);
    }
}
