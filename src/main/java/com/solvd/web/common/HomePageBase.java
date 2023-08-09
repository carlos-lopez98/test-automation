package com.solvd.web.common;

import com.solvd.web.desktop.MoreTopicsPage;
import com.solvd.web.desktop.TelevisionPage;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {


    public HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);

    }


    public abstract ExplorePageBase selectExplore(String exploreTitle);
//    public abstract LoginPageBase openLoginScreen();
//    public abstract ProfilePageBase openProfilePage();
//    public abstract TelevisionPageBase openTelevisionPage();
//    public abstract MoreTopicsPageBase openMoreTopicsPage();
}
