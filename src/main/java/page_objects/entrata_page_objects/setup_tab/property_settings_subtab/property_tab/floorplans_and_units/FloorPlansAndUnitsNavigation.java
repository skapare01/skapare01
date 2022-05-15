package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlansAndUnitsNavigation extends BasePage {

    private final By FLOORPLANS_SUBTAB = By.id("property_floorplansxxx");
    private final By UNIT_TYPE_SUBTAB = By.id("unit_typesxxx");
    private final By ADD_BUTTON = By.cssSelector("a[class='button action right nomargin nohref  binded-nohref-click']");
    private final By UNIT_TYPE_NAME = By.id("name");
    private final By ADD_UNIT_TYPE_BUTTON = By.id("btnSave");

    public FloorPlansAndUnitsNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickFloorplansSubtab() {return clickElement(FLOORPLANS_SUBTAB); }
    public boolean clickUnitTypeSubtab() {return clickElement(UNIT_TYPE_SUBTAB); }
    public boolean clickAddButton() {return clickElement(ADD_BUTTON); }
    public boolean sendKeysUnitTypeName() {return sendKeysToElement(UNIT_TYPE_NAME, "Jane"); }
    public boolean clickAddUnitTypeButton() {return clickElement(ADD_UNIT_TYPE_BUTTON); }

    }


