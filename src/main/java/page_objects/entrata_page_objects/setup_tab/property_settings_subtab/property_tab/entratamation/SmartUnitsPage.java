package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartUnitsPage extends BasePage {

    public SmartUnitsPage(WebDriver driver) {
        super(driver);
    }

    private final By SMART_UNITS_PAGE = By.id("div-smart-units");

    public boolean smartUnitsPageVisible() {
        return confirmElementIsVisible(SMART_UNITS_PAGE);
    }
}
