package aumni.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends AumniBasePage {

    public HomePage(WebDriver driver) {
        super(driver, "https://www.aumni.fund/");
    }
}
