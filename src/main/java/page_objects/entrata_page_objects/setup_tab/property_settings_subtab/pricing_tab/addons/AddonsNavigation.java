package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.addons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddonsNavigation extends BasePage {

    private final By PROPERTY_PRICING_ADDONS_TAB = By.id("property_pricing_add_onsxxx");
    private final By RENTABLE_ITEMS_ADDONS_TAB = By.id("property_pricing_add_ons_rentable_itemsxxx");

    public AddonsNavigation(WebDriver driver) {
        super(driver);
    }
    public boolean clickPropertyPricingAddonsTab() {return clickElement(PROPERTY_PRICING_ADDONS_TAB); }
    public boolean clickRentableItemsAddonsTab() {return clickElement(RENTABLE_ITEMS_ADDONS_TAB); }

}
