package com.solvd.web.components;

import com.solvd.web.common.LoginPageBase;
import com.solvd.web.desktop.HomePage;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YTHeader extends AbstractUIObject implements ICustomTypePageFactory {

    @FindBy(xpath = "//yt-icon-button[@id='guide-button']")
    private ExtendedWebElement guideButton;

    @FindBy(xpath = "//ytd-topbar-logo-renderer[@id='logo']")
    private ExtendedWebElement youtubeLogoButton;

    @FindBy(xpath = "//a[@aria-label='Sign in' and ancestor::yt-button-shape/ancestor::ytd-button-renderer[@class='style-scope ytd-masthead']]")
    private ExtendedWebElement signInButton;

    public YTHeader(WebDriver driver, SearchContext context) {
        super(driver, context);
    }

    public HomePage pressLogoButton() {
        youtubeLogoButton.click();
        return new HomePage(driver);
    };

    public LoginPageBase pressSignInButton(){
        signInButton.click();
        return initPage(driver, LoginPageBase.class);
    }
}
