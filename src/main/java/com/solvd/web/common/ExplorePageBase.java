package com.solvd.web.common;

import com.solvd.web.components.YTHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ExplorePageBase extends AbstractPage {

    @FindBy(xpath = "//div[@id='masthead-container']")
    private YTHeader header;

    public ExplorePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean countSections(Integer expectedSections);
}
