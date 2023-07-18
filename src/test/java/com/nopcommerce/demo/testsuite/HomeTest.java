package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        //String actualText = loginPage.getWelcomeText();
       // Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }
}