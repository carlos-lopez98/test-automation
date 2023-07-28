package com.solvd.mobile;

import com.solvd.mobile.common.WelcomePageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest implements IAbstractTest, IMobileUtils {

    @Test()
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testHomePage(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
    }
}
