package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SiteTourPage extends BasePage {

    public SiteTourPage(WebDriver driver) {
        super(driver);
    }

    private final By SITE_TOUR_PAGE = By.id("settings_content");

    public boolean siteTourPageVisible() {
        return confirmElementIsVisible(SITE_TOUR_PAGE);
    }
}
