package com.solvd.web;

import com.solvd.web.common.HomePageBase;
import com.solvd.web.desktop.GamingPage;
import com.solvd.web.desktop.HomePage;
import com.solvd.web.desktop.LoginPage;
import com.solvd.web.desktop.MoreTopicsPage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {


    @Test(testName = "Open Page", description = "Testing if the homepage works")
    public void testHomePage() {
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");
    }

    @Test(testName = "Testing Login Page Opens", description = "Testing log in page button works")
    public void testLoginPageOpens() {
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");

        LoginPage loginPage = homepage.openLoginScreen();
        Assert.assertTrue(loginPage.isPageOpened(), "Login Page is not opened");
    }

    @Test(testName = "Gaming Page Opens", description = "Testing gaming page opens")
    public void testGamingPageOpens() {
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");

        GamingPage gamingPage = homepage.openGamingPage();
        Assert.assertTrue(gamingPage.isPageOpened(), "Gaming Page is not opened");
    }

    @Test(testName = "Test More Topics Opens", description = "Testing more topics opens")
    public void testMoreTopicsOpens() {
        HomePage homepage = initPage(getDriver(), HomePage.class);
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");

        MoreTopicsPage moreTopicsPage = homepage.openMoreTopicsPage();
        Assert.assertTrue(moreTopicsPage.isPageOpened(), "More Topics is not opened");

    }

    @Test(testName = "Test Television Page Opens", description = "Testing television page opens")
    public void testTelevisionPageOpens() {


    }
}
