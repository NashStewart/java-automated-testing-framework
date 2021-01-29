package aumni.tests;

import aumni.pageObjects.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavTests extends BaseTestClass {

    @Test
    void navigateToAumniForGeneralPartnersTest() {
        HomePage homePage =  new HomePage(driver);
        SolutionForGeneralPartnersPage solutionForGeneralPartnersPage = new SolutionForGeneralPartnersPage(driver);

        homePage.goTo();
        homePage.getNav().clickAumniForGeneralPartnersNavOption();
        Assertions.assertEquals(
                solutionForGeneralPartnersPage.getExpectedHeaderText(),
                solutionForGeneralPartnersPage.getPageHeaderText(),
                "The page header text does not match the expected text!");
    }

    @Test
    void navigateToAumniForFinanceTest() {
        HomePage homePage =  new HomePage(driver);
        SolutionForFinancePage solutionForFinancePage = new SolutionForFinancePage(driver);

        homePage.goTo();
        homePage.getNav().clickAumniForFinanceNavOption();
        Assertions.assertEquals(
                solutionForFinancePage.getExpectedHeaderText(),
                solutionForFinancePage.getPageHeaderText(),
                "The page header text does not match the expected text!");
    }

    @Test
    void navigateToAumniForLegalTest() {
        HomePage homePage =  new HomePage(driver);
        SolutionForLegalPage solutionForLegalPage = new SolutionForLegalPage(driver);

        homePage.goTo();
        homePage.getNav().clickAumniForLegalNavOption();
        Assertions.assertEquals(
                solutionForLegalPage.getExpectedHeaderText(),
                solutionForLegalPage.getPageHeaderText(),
                "The page header text does not match the expected text!");
    }

    @Test
    void navigateToResourcesTest() {
        HomePage homePage =  new HomePage(driver);
        ResourcesPage resourcesPage = new ResourcesPage(driver);

        homePage.goTo();
        homePage.getNav().clickResourcesNavOption();

        Assertions.assertEquals(
                resourcesPage.getExpectedPageHeaderText(),
                resourcesPage.getPageHeaderText(),
                "The page header text does not match the expected text!");

        Assertions.assertEquals(
                resourcesPage.getExpectedPageSubHeaderText(),
                resourcesPage.getPageSubHeaderText(),
                "The page sub header text does not match the expected text!");

        Assertions.assertEquals(
                resourcesPage.getExpectedFeaturedResourceHeaderText(),
                resourcesPage.getFeaturedResourceHeaderText(),
                "The featured resources header text does not match the expected text!");
    }

    @Test
    void navigateToBlogTest() {
        HomePage homePage =  new HomePage(driver);
        BlogPage blogPage = new BlogPage(driver);

        homePage.goTo();
        homePage.getNav().clickBlogNavOption();

        Assertions.assertEquals(
                blogPage.getExpectedPageHeaderText(),
                blogPage.getPageHeaderText(),
                "The page header text does not match the expected text!");
    }

    @Test
    void navigateToLoginTest() {
        HomePage homePage =  new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goTo();
        homePage.getNav().clickLoginNavOption();

        Assertions.assertEquals(
                loginPage.getExpectedLoginButtonText(),
                loginPage.getLoginButtonText(),
                "The login button text does not match the expected text!");
    }
}