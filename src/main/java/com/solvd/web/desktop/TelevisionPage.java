package com.solvd.web.desktop;

import com.solvd.web.common.TelevisionPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TelevisionPageBase.class)
public class TelevisionPage extends TelevisionPageBase {

    @FindBy(xpath = "//div[@class='_3xUDHcNgeNVz7fD8H1kUy7']")
    public ExtendedWebElement title;

    @FindBy(xpath = "//div[contains(text(), 'Posts')]")
    public ExtendedWebElement postButton;

    @FindBy(xpath = "//div[contains(text(), 'Communities')]")
    public ExtendedWebElement communitiesButton;

    public TelevisionPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }
}
