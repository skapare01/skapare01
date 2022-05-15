package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RentNav extends BasePage {

    public RentNav(WebDriver driver) {
        super(driver);}

    private final By PROPERTY_SUBTAB = By.id("property_pricing_rent_propertyxxx");
    private final By UNIT_TYPE_SUBTAB = By.id("property_pricing_rent_unit_typexxx");
    private final By UNIT_SPACE_SUBTAB = By.id("property_pricing_rent_unit_spacexxx");
    private final By HISTORICAL_RENTS_SUBTAB = By.id("property_pricing_rent_historical_rentxxx");
    private final By BUDGETED_RENT = By.id("property_pricing_rent_budgeted_rentxxx");


    public boolean clickPropertySubtab(){return clickElement(PROPERTY_SUBTAB);}
    public boolean clickUnitTypeSubtab(){return clickElement(UNIT_TYPE_SUBTAB);}
    public boolean clickUnitSpaceSubtab(){return clickElement(UNIT_SPACE_SUBTAB);}
    public boolean clickHistoricalRentsSubtab(){return clickElement(HISTORICAL_RENTS_SUBTAB);}
    public boolean clickBudgetedRent(){return clickElement(BUDGETED_RENT);}
}
