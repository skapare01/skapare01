package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AmenitiesNavigation extends BasePage {

    private final By PROPERTY_AMENITIES_TAB = By.id("property_pricing_amenities_propertyxxx");

    public AmenitiesNavigation(WebDriver driver) { super(driver); }
    public boolean clickPropertyAmenitiesTab() {return clickElement(PROPERTY_AMENITIES_TAB); }

}
