package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.pets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PetsNavigation extends BasePage {

    private final By PROPERTY_PRICING_PETS_TAB = By.id("property_pricing_petsxxx");


    public PetsNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickPropertyPricingPetsTab() {return clickElement(PROPERTY_PRICING_PETS_TAB); }


}
