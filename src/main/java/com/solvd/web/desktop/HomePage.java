package com.solvd.web.desktop;


import com.solvd.web.common.GamingPageBase;
import com.solvd.web.common.HomePageBase;
import com.solvd.web.common.LoginPageBase;
import com.solvd.web.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//a[@aria-label and @href='/?feed=home']")
    private ExtendedWebElement homeHeader;

    @FindBy(xpath = "//div[contains(text(), 'Popular Communities')]")
    private ExtendedWebElement popularCommunitiesButton;

    @FindBy(xpath = "//div[@data-testid='frontpage-sidebar']")
    private ExtendedWebElement frontPageSidebar;

    @FindBy(xpath = "//a[contains(text(), 'Log In')]")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//div[contains(text(), '_3x3dhQasGAuYcXVQ02QUzy icon icon-caret_down')]")
    private ExtendedWebElement profileSelectionDropdown;

    @FindBy(xpath = "//span[contains(text(), 'Profile'])")
    private ExtendedWebElement profileButton;

    @FindBy(xpath = "//span[@class='f8nXLisWxOYzMMl1uIAP3']")
    private ExtendedWebElement openGamingButton;

    @FindBy(xpath = "//span[@class='yloKeyD8bfd8UJ_Gi9rsR']")
    private ExtendedWebElement openMoreTopicsButton;

    @FindBy(xpath="//span[@class='yloKeyD8bfd8UJ_Gi9rsR']")
    private ExtendedWebElement openTelevisionButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(homeHeader);
    }

    @Override
    public GamingPage openGamingPage() {
        if (openGamingButton != null) {
            openGamingButton.click();
        }
        return initPage(driver, GamingPage.class);
    }


    @Override
    public LoginPage openLoginScreen() {
        if (logInButton != null) {
            logInButton.click();
        }
        return initPage(driver, LoginPage.class);
    }

    @Override
    public ProfilePageBase openProfilePage() {
        return null;
    }

    @Override
    public TelevisionPage openTelevisionPage() {
        if (openTelevisionButton != null) {
            openTelevisionButton.click();
        }
        return initPage(driver, TelevisionPage.class);
    }
    @Override
    public MoreTopicsPage openMoreTopicsPage() {
        if (openMoreTopicsButton != null) {
            openMoreTopicsButton.click();
        }
        return initPage(driver, MoreTopicsPage.class);    }
}
