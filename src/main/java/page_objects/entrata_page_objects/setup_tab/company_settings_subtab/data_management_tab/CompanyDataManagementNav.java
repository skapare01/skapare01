package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyDataManagementNav extends BasePage {

    public CompanyDataManagementNav(WebDriver driver) {
        super(driver);
    }

    //Data Management Tab Names
    private final By INTEGRATION_SETTINGS_TAB = By.id("li_nav_integration_setupxxx");
    private final By IMPORT_DATA_TAB = By.id("li_nav_import_dataxxx");
    private final By MIGRATIONS_TAB = By.id("li_nav_migrationsxxx");
    private final By DATA_CLEANUP_TAB = By.id("li_nav_data_cleanupxxx");

    //Data Management Tab Navigation Methods
    public boolean clickIntegrationSettingsTab() {
        return clickElement(INTEGRATION_SETTINGS_TAB);
    }

    public boolean importDataTabClick() {
        return clickElement(IMPORT_DATA_TAB);
    }

    public boolean migrationsTabClick() {
        return clickElement(MIGRATIONS_TAB);
    }

    public boolean dataCleanupTabCLick() {
        return clickElement(DATA_CLEANUP_TAB);
    }
}