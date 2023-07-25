package com.solvd.web.desktop;

import com.solvd.web.common.GamingPageBase;
import com.solvd.web.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = GamingPageBase.class)
public abstract class GamingPage extends GamingPageBase {

    @FindBy(xpath = "//div[@class='_3xUDHcNgeNVz7fD8H1kUy7']")
    public ExtendedWebElement title;

    @FindBy(xpath = "//div[contains(text(), 'Posts')]")
    public ExtendedWebElement postButton;

    @FindBy(xpath = "//div[contains(text(), 'Communities')]")
    public ExtendedWebElement communitiesButton;

    public GamingPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }
}
