package page_objects.entrata_page_objects.tools_tab.smart_community_subtab.vacant_units_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class VacantUnitsPage extends BasePage {

    public VacantUnitsPage(WebDriver driver) {
        super(driver);
    }

    private final By VACANT_UNITS_PAGE = By.id("js-view-smart-community-vacant-tab");

    public boolean vacantUnitsPageVisible() {
        return confirmElementIsVisible(VACANT_UNITS_PAGE);
    }
}
