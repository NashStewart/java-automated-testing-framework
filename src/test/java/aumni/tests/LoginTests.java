package aumni.tests;

import aumni.pageObjects.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTestClass  {

    @Test
    void loginWithFakeCredentialsTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goTo();
        loginPage.login("qatest@notarealemail.com", "password123");
        Assertions.assertEquals(
                loginPage.getExpectedWrongLoginMessageText(),
                loginPage.getWrongLoginMessageText(),
                "The wrong username or password message either doesn't match the expected or does not exist!");
    }
}
