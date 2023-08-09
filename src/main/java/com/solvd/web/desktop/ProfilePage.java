package com.solvd.web.desktop;

import com.solvd.web.common.ProfilePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProfilePageBase.class)
public class ProfilePage extends ProfilePageBase {

    @FindBy(xpath = "//button[contains(text(), 'Style Avatar']")
    private ExtendedWebElement styleAvatarButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }
}
