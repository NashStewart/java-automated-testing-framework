package aumni.tests;

import aumni.pageObjects.HomePage;
import aumni.pageObjects.ResourcesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTests extends BaseTestClass {

    @Test
    void navigateToResourcesTest() throws InterruptedException {
        HomePage homePage =  new HomePage(driver);
        ResourcesPage resourcesPage = new ResourcesPage(driver);

        homePage.goTo();
        homePage.clickResourcesNavOption();
        Assertions.assertEquals("Featured Resource", resourcesPage.getFeaturedResourcesHeaderText(), "The header text does not match");
    }
}
