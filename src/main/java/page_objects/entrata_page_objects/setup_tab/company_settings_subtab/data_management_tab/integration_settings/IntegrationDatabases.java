package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IntegrationDatabases extends BasePage {

    public IntegrationDatabases(WebDriver driver) {
        super(driver);
    }

    private final By INTEGRATION_DATABASES_PAGE = By.id("integration_database_container");

    public boolean integrationDatabasesPageVisible() {
        return confirmElementIsVisible(INTEGRATION_DATABASES_PAGE);
    }
}
