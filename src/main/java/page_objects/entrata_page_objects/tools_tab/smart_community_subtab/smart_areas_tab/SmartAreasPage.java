package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.smart_areas_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartAreasPage extends BasePage {

    public SmartAreasPage(WebDriver driver) {
        super(driver);
    }

    private final By SMART_AREAS_PAGE = By.id("js-view-smart-community-common-areas-tab");

    public boolean smartAreasPageVisible() {
        return confirmElementIsVisible(SMART_AREAS_PAGE);
    }
}
