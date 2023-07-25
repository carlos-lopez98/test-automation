package com.solvd.web.desktop;

import com.solvd.web.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//main[@class='Login']")
    private ExtendedWebElement loginPrompt;

    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(loginPrompt);
    }
}
