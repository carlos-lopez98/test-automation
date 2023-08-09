package com.solvd.web.components;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.function.Function;

public class SectionItem extends AbstractUIObject implements ICustomTypePageFactory {

    @FindBy(xpath = "./a")
    private ExtendedWebElement categoryLinkElement;

    protected SectionItem(WebDriver driver, SearchContext context) {
        super(driver, context);
    }

    public String getTitle(){
        return categoryLinkElement.getAttribute("title");
    }

    public void clickCategoryLink(){
        categoryLinkElement.click();
    }
}
