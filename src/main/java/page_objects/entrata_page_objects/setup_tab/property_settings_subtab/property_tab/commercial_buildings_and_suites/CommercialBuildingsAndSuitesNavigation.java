package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.commercial_buildings_and_suites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CommercialBuildingsAndSuitesNavigation extends BasePage {

    private final By BUILDINGS_AND_FLOORS_SUBTAB = By.id("property_commercial_unit_building_and_floorsxxx");
    private final By SUITES_SUBTAB = By.id("property_commercial_unit_suitesxxx");

    public CommercialBuildingsAndSuitesNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickBuildingsAndFloorsSubtab() {return clickElement(BUILDINGS_AND_FLOORS_SUBTAB); }
    public boolean clickSuitesSubtab() {return clickElement(SUITES_SUBTAB); }


}

