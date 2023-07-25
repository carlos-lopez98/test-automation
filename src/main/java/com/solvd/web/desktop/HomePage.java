package com.solvd.web.desktop;


import com.solvd.web.common.HomePageBase;
import com.solvd.web.common.LoginPageBase;
import com.solvd.web.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

//Here we will specify all elements needed for our testing
//Methods will simulate different user actions

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

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(homeHeader);
    }

    @Override
    public void selectGamingPage() {

    }

    @Override
    public LoginPage openLoginScreen() {
        if(logInButton != null){
            logInButton.click();
        }
        return initPage(driver, LoginPage.class);
    }

    @Override
    public ProfilePageBase openProfilePage() {
        return null;
    }

}
