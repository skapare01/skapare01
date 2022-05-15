package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.occupied_units_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OccupiedUnitsPage extends BasePage {

    public OccupiedUnitsPage(WebDriver driver) {
        super(driver);
    }

    private final By OCCUPIED_UNITS_PAGE = By.id("js-view-smart-community-occupied-tab");

    public boolean occupiedUnitsPageVisible() {
        return confirmElementIsVisible(OCCUPIED_UNITS_PAGE);
    }
}
