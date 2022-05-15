package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyNavigation extends BasePage {

    public PropertyNavigation(WebDriver driver) {
        super(driver);}

    private final By GENERAL_SUBTAB = By.id("property_details_generalxxx");
    private final By FLOORPLANS_UNITS_SUBTAB = By.id("property_details_floorplansxxx");
    private final By COMMERCIAL_BUILDINGS_AND_SUITES_SUBTAB = By.id("property_commercial_unit_setupxxx");
    private final By CALENDAR_SUBTAB = By.id("property_details_calendarxxx");
    private final By COMPETITORS_SUBTAB = By.id("property_details_action_competitorsxxx");
    private final By ENTRATAMATION_SUBTAB = By.id("property_details_entratamationxxx");
    private final By AFFORDABLE_SUBTAB = By.id("property_affordablexxx");


    public boolean clickGeneralTab(){return clickElement(GENERAL_SUBTAB);}
    public boolean clickFloorplansTab(){return clickElement(FLOORPLANS_UNITS_SUBTAB);}
    public boolean clickCommercialBuildingAndSuitesTab() {return clickElement(COMMERCIAL_BUILDINGS_AND_SUITES_SUBTAB); }
    public boolean clickCalendarTab(){return clickElement(CALENDAR_SUBTAB);}
    public boolean clickCompetitorsTab(){return clickElement(COMPETITORS_SUBTAB);}
    public boolean clickEntratamationTab(){return clickElement(ENTRATAMATION_SUBTAB);}
    public boolean clickPropertyAffordableMainTab() {
        return clickElement(AFFORDABLE_SUBTAB);
    }
    public String confirmAffordableTab() {
        return getElementText(AFFORDABLE_SUBTAB);
    }


}
