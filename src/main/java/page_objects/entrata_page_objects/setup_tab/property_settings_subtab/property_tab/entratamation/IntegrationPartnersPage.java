package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IntegrationPartnersPage extends BasePage {

    public IntegrationPartnersPage(WebDriver driver) {
        super(driver);
    }

    private final By INTEGRATION_PARTNERS_PAGE = By.id("view_integration_partner");

    public boolean integrationPartnersPageVisible() {
        return confirmElementIsVisible(INTEGRATION_PARTNERS_PAGE);
    }
}
