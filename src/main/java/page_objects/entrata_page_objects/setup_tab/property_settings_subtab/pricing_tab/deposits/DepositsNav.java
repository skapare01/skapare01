package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DepositsNav extends BasePage {
    public DepositsNav (WebDriver driver){
        super(driver);}
    private final By PROPERTY_TAB = By.id("property_pricing_deposits_propertyxxx");
    private final By UNIT_TYPE_TAB = By.id("property_pricing_deposits_unit_typexxx");
    private final By UNIT_SPACE_TAB = By.id("property_pricing_deposits_unit_spacexxx");

    public boolean clickPropertyTab(){return clickElement(PROPERTY_TAB);}
    public boolean clickUnitTypeTab(){return clickElement(UNIT_TYPE_TAB);}
    public boolean clickUnitSpaceTab(){return clickElement(UNIT_SPACE_TAB);}
}
