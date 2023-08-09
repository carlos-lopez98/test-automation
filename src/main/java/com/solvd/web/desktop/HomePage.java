package com.solvd.web.desktop;


import com.solvd.web.common.ExplorePageBase;
import com.solvd.web.common.HomePageBase;
import com.solvd.web.common.ProfilePageBase;
import com.solvd.web.components.SectionItem;
import com.solvd.web.components.YTGuideMenu;
import com.solvd.web.components.YTHeader;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import javax.naming.ldap.ExtendedRequest;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    private static final Logger LOGGER = LogManager.getLogger(HomePageBase.class);

    @FindBy(xpath = "//div[@id='masthead-container']")
    private YTHeader header;

    @FindBy(xpath = "//tp-yt-app-drawer")
    private YTGuideMenu guideMenu;

    //Since I'm not using the setPageUrl method, it'll automatically grab the url property from the config file
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public YTHeader getHeader(){
        return this.header;
    }

    @Override
    public ExplorePageBase selectExplore(String exploreTitle) {
        List<ExtendedWebElement> sectionItemList = guideMenu.getSectionItemList();

        LOGGER.info("Selecting Explore Section " + exploreTitle);

        for(ExtendedWebElement item: sectionItemList){
            String explore = item.getAttribute("title");
            if(explore.equals(exploreTitle)){
                item.click();
                return initPage(driver, ExplorePageBase.class);
            }
        }
        throw new RuntimeException("Unable to open explore page: " + exploreTitle);
    }
//
//
//    @Override
//    public LoginPage openLoginScreen() {
//        if (logInButton != null) {
//            logInButton.click();
//        }
//        return initPage(driver, LoginPage.class);
//    }
//
//    @Override
//    public ProfilePageBase openProfilePage() {
//        return null;
//    }
//
//    @Override
//    public TelevisionPage openTelevisionPage() {
//        if (openTelevisionButton != null) {
//            openTelevisionButton.click();
//        }
//        return initPage(driver, TelevisionPage.class);
//    }
//    @Override
//    public MoreTopicsPage openMoreTopicsPage() {
//        if (openMoreTopicsButton != null) {
//            openMoreTopicsButton.click();
//        }
//        return initPage(driver, MoreTopicsPage.class);    }

    public YTGuideMenu getGuideMenu() {
        return guideMenu;
    }
}
