package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartAmenitiesPage extends BasePage {

    public SmartAmenitiesPage(WebDriver driver) {
        super(driver);
    }

    private final By SMART_AMENITIES_PAGE = By.id("js-smart-amenities-tab");

    public boolean smartAmenitiesPageVisible() {
        return confirmElementIsVisible(SMART_AMENITIES_PAGE);
    }
}
