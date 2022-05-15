package smoke_and_sanity_tests.migrations_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.data_cleanup_tab.ClearCurrentData;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.ImportData;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings.IntegrationDatabases;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.migrations_tab.Workbooks;

import static org.junit.Assert.assertTrue;

public class MigrationsSmokeIT extends BaseBrowserTest {

    public MigrationsSmokeIT() {
        super("avantic");
    }

    @Test //TC: 3244406
    public void shouldFindImportDataPage_whenNavigatedToImportDataPage() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
        ImportData importData = new ImportData(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
        assertTrue("Could not click Import Data tab.", dataManagementNav.importDataTabClick());
        assertTrue("Could not find Import Data page.", importData.importDataPageVisible());
    }

    @Test //TC: 3244412
    public void shouldFindMigrationsWorkbooksPage_whenNavigatedToMigrationsWorkbooksPage() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
        Workbooks workbooks = new Workbooks(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
        assertTrue("Could not click Migrations tab.", dataManagementNav.migrationsTabClick());
        assertTrue("Could not find Migrations Workbooks page.", workbooks.migrationWorkbooksPageVisible());
    }

    @Test //TC: 3244413
    public void shouldFindDataCleanupPage_whenNavigatedToDataCleanupPage() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
        ClearCurrentData clearCurrentData = new ClearCurrentData(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
        assertTrue("Could not click Data Cleanup tab.", dataManagementNav.dataCleanupTabCLick());
        assertTrue("Could not find Clear Current Data page.", clearCurrentData.clearCurrentDataPageVisible());
    }

    @Test //TC: 3244417
    public void shouldFindIntegrationDatabasesPage_whenNavigatedToIntegrationDatabasesPage() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
        IntegrationDatabases integrationDatabases = new IntegrationDatabases(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
        assertTrue("Could not click Integration Settings tab.", dataManagementNav.clickIntegrationSettingsTab());
        assertTrue("Could not find Integration Databases page.", integrationDatabases.integrationDatabasesPageVisible());
    }
}
