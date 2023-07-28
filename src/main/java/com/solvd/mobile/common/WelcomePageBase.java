package com.solvd.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomePageBase extends AbstractPage {

    public WelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AlarmPageBase clickAlarmBtn();
    public abstract SettingPageBase clickSettingsBtn();
    public abstract CreateFolderPageBase clickAddFolder();
    public abstract void deleteFolder();
    public abstract void createFolder();
}
