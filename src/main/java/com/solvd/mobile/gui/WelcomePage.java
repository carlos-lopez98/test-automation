package com.solvd.mobile.gui;

import com.solvd.mobile.common.AlarmPageBase;
import com.solvd.mobile.common.CreateFolderPageBase;
import com.solvd.mobile.common.SettingPageBase;
import com.solvd.mobile.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(id = "carina_logo")
    private ExtendedWebElement title;

    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AlarmPageBase clickAlarmBtn() {
        return null;
    }

    @Override
    public SettingPageBase clickSettingsBtn() {
        return null;
    }

    @Override
    public CreateFolderPageBase clickAddFolder() {
        return null;
    }

    @Override
    public void deleteFolder() {

    }

    @Override
    public void createFolder() {

    }
}
