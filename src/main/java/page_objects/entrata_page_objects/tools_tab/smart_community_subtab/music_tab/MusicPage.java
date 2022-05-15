package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.music_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MusicPage extends BasePage {

    public MusicPage(WebDriver driver) {
        super(driver);
    }

    private final By MUSIC_TAB_PAGE = By.id("js-load-sidetab-body");

    public boolean musicTabPageVisible() {
        return confirmElementIsVisible(MUSIC_TAB_PAGE);
    }
}
