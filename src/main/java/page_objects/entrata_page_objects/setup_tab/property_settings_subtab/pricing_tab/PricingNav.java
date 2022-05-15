package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PricingNav extends BasePage {

    public PricingNav(WebDriver driver) {
        super(driver);}

    private final By RENT_TAB= By.id("property_pricing_rentxxx");

    private final By PREFERENCES = By.id("property_pricing_preferencesxxx");
    private final By PROPERTY_PRICING_AMENITIES_TAB = By.id("property_pricing_amenitiesxxx");
    private final By SPECIALS = By.id("property_pricing_specialsxxx");
    private final By DEPOSITS_TAB = By.id("property_pricing_depositsxxx");
    private final By OTHER_FEES_TAB = By.id("property_pricing_other_feesxxx");



    public boolean clickPreferences(){return clickElement(PREFERENCES);}

    private final By OPTIMIZATION_TAB = By.id("property_details_pricingxxx");

    public boolean clickRentTab(){return clickElement(RENT_TAB);}

    public boolean clickOptimizationTab() { return clickElement(OPTIMIZATION_TAB); }

    public boolean clickPropertyPricingAmenitiesTab() {return clickElement(PROPERTY_PRICING_AMENITIES_TAB); }

    public boolean clickSpecialsTab () {return clickElement(SPECIALS);}

    public boolean clickDepositsTab(){return clickElement(DEPOSITS_TAB);}

    public boolean clickOtherFeesTab(){return clickElement(OTHER_FEES_TAB);}

}
