package com.solvd.web;

import com.azure.core.http.rest.Page;
import com.mongodb.DBPortPool;
import com.solvd.web.common.ExplorePageBase;
import com.solvd.web.common.HomePageBase;
import com.solvd.web.components.YTGuideMenu;
import com.solvd.web.desktop.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class WebTest implements IAbstractTest {

    private Map<String, Function<WebDriver, AbstractPage>> pages = new HashMap<>();


    @Test(testName = "Open Page", description = "Testing if the homepage works")
    public void testHomePage() {
        HomePageBase homepage = initPage(getDriver(), HomePageBase.class);
        homepage.open();

        //Test To make sure urls are matching
        Assert.assertTrue(homepage.isPageOpened(), "Page is not opened, based on Url");
    }


    @Test(testName = "Gaming Page Opens", description = "Testing gaming page opens")
    public void testGamingPageOpens() {
        HomePage homepage = new HomePage(getDriver());
        homepage.open();
        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");
        GamingPage gamingPage = (GamingPage) homepage.selectExplore("Gaming");
        Assert.assertTrue(gamingPage.isPageOpened(), "Gaming Page is not opened");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(gamingPage.countSections(3),true);
        softAssert.assertEquals(gamingPage.countGames(6), true);
        softAssert.assertEquals(gamingPage.isHeaderItemPresent(),true);
        softAssert.assertAll();
    }

//    @Test(testName = "Test More Topics Opens", description = "Testing more topics opens")
//    public void testMoreTopicsOpens() {
//        HomePage homepage = initPage(getDriver(), HomePage.class);
//        homepage.open();
//        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");
//
//        MoreTopicsPage moreTopicsPage = homepage.openMoreTopicsPage();
//        Assert.assertTrue(moreTopicsPage.isPageOpened(), "More Topics is not opened");
//
//    }

//    @Test(testName = "Test Television Page Opens", description = "Testing television page opens")
//    public void testTelevisionPageOpens() {
//        HomePage homepage = initPage(getDriver(), HomePage.class);
//        homepage.open();
//        Assert.assertTrue(homepage.isPageOpened(), "Home page is not opened");
//
//        TelevisionPage TelevisionPage = homepage.openTelevisionPage();
//        Assert.assertTrue(TelevisionPage.isPageOpened(), "Television Page is opened");
//
//
//    }

    @Test(testName = "Profile Page is Opened", description = "Testing profile page opens")
    public void testProfilePage() {}
}
