package com.solvd.mobile.gui;

import com.solvd.mobile.common.CreateFolderPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateFolderPageBase.class)
public class CreateFolderPage extends CreateFolderPageBase {

    public CreateFolderPage(WebDriver driver) {
        super(driver);
    }
}
