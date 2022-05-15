package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.other_fees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits.UnitTypeDepositsPage;

public class OtherFeesNav extends BasePage {
    public OtherFeesNav(WebDriver driver){
        super(driver);}

    private final By PROPERTY_TAB = By.id("property_pricing_other_fees_propertyxxx");
    private final By UNIT_TYPE_TAB = By.id("property_pricing_other_fees_unit_typexxx");
    private final By UNIT_SPACE_TAB = By.id("property_pricing_other_fees_unit_spacexxx");

    public boolean clickPropertyTab(){return clickElement(PROPERTY_TAB);}
    public boolean clickUnitTypeTab(){return clickElement(UNIT_TYPE_TAB);}
    public boolean clickUnitSpaceTab(){return clickElement(UNIT_SPACE_TAB);}
}
