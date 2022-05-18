package smoke_and_sanity_tests.migrations_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.ImportData;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.import_data_new_tab_SK;

import static org.junit.Assert.assertTrue;

public class Migration_Import_Data_SK extends BaseBrowserTest {


    public Migration_Import_Data_SK() {
        super("migrationborapid", SitesEnum.ENTRATA,"Entrata_5074","Xento123");
    }
        @Test

        public void import_data_page()
        {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
            CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
            ImportData importData = new ImportData(driver);
            import_data_new_tab_SK new_import_data = new import_data_new_tab_SK(driver);
            assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
            assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
            assertTrue("Could not click Import Data tab.", dataManagementNav.new_import_data_page());
           // assertTrue("Could not find Import Data page.", importData.importDataPageVisible());
            assertTrue("Could not find Import Data New page.",new_import_data.new_import_data_page1());
            assertTrue("Could not find Upload ",new_import_data.upload());
        }
    }

