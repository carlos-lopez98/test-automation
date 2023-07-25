package com.solvd.web;

import com.solvd.web.common.HomePageBase;
import com.solvd.web.desktop.HomePage;
import com.solvd.web.desktop.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {


    @Test(testName = "Open Page", description = "Testing if the homepage works")
    public void testHomePage(){
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();

        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");
    }

    @Test(testName = "Testing Login Page Opens", description = "Testing log in page button works")
    public void testLoginPageOpens(){
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();

        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");

        LoginPage loginPage = homepage.openLoginScreen();
        Assert.assertTrue(loginPage.isPageOpened(), "Login Page is not opened");

    }
}
