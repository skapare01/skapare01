package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorplanNav extends BasePage {
    public FloorplanNav(WebDriver driver) {
        super(driver);}

    private final By FLOORPLANS_TAB = By.id("property_details_floorplansxxx");
    private final By SPACE_OPTIONS_TAB = By.id("property_details_fpu_space_optionsxxx");
    private final By UNITS_TAB = By.id("property_unitsxxx");


    public boolean clickFloorplansTab(){return clickElement(FLOORPLANS_TAB);}
    public boolean clickSpaceOptionsTab(){return clickElement(SPACE_OPTIONS_TAB);}
    public boolean clickUnitsTab(){return clickElement(UNITS_TAB);}
}
