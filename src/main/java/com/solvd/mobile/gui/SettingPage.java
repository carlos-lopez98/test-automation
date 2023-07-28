package com.solvd.mobile.gui;

import com.solvd.mobile.common.SettingPageBase;
import com.solvd.mobile.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingPageBase.class)
public class SettingPage extends SettingPageBase {
    public SettingPage(WebDriver driver) {
        super(driver);
    }
}
