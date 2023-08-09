package com.solvd.web.desktop;

import com.solvd.web.common.ExplorePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ExplorePageBase.class)
public class GamingPage extends ExplorePageBase {

    @FindBy(xpath = "//yt-formatted-string[contains(text(), 'Gaming')]")
    private ExtendedWebElement gamingHeader;

    @FindBy(xpath = "//div[@id='contents']/ytd-item-section-renderer[@page-subtype='channels']")
    private List<ExtendedWebElement> sectionsPrimary;

    @FindBy(xpath = "//div[@id='items']/ytd-game-card-renderer")
    private List<ExtendedWebElement> gamesDisplayed;

    @FindBy(xpath = "//div[@id='carousel-item']")
    private ExtendedWebElement headerItem;

    public GamingPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(gamingHeader);
        setPageURL("gaming");
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL_AND_ELEMENT);
    }

    public boolean countSections(Integer sectionsExpected){
        //Gives elements a chance to load
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sectionsPrimary.size() >= sectionsExpected;
    }

    public boolean countGames(Integer expectedGames){
        //Gives elements a chance to load
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return gamesDisplayed.size() >= expectedGames;
    }

    public boolean isHeaderItemPresent(){
        return headerItem.isPresent();
    }
}
