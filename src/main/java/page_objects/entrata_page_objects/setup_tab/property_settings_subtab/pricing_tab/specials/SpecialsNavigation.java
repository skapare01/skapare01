package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.specials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SpecialsNavigation extends BasePage {

    private final By PROPERTY_SPECIALS_TAB = By.id("property_pricing_specials_propertyxxx");
    private final By UNIT_SPACE_SPECIALS_TAB = By.id("property_pricing_specials_unit_spacexxx");
    private final By FLOOR_PLAN_SPECIALS_TAB = By.id("property_pricing_specials_floor_planxxx");
    private final By UNIT_TYPE_SPECIALS_TAB = By.id("property_pricing_specials_unit_typexxx");

    public SpecialsNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickAddPropertyPricingSpecialsTab() {return clickElement(PROPERTY_SPECIALS_TAB); }
    public boolean clickUnitSpaceSpecialsTab() {return clickElement(UNIT_SPACE_SPECIALS_TAB); }
    public boolean clickFloorPlanSpecialsTab() {return clickElement(FLOOR_PLAN_SPECIALS_TAB); }
    public boolean clickUnitTypeSpecialsTab() {return clickElement(UNIT_TYPE_SPECIALS_TAB); }

}

