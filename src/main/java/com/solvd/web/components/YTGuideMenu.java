package com.solvd.web.components;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class YTGuideMenu extends AbstractUIObject implements ICustomTypePageFactory {

    @FindBy(xpath = "//ytd-guide-entry-renderer[@class='style-scope ytd-guide-section-renderer']/a")
    List<ExtendedWebElement> sectionItemList;


    public YTGuideMenu(WebDriver driver, SearchContext context) {
        super(driver, context);
    }

    public List<ExtendedWebElement> getSectionItemList() {
        return sectionItemList;
    }
}
