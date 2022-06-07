package smoke_and_sanity_tests.migrations_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.ImportNewData_Screen;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.NewImportDataSK;


import static org.junit.Assert.assertTrue;

public class MigrationImportDataSK extends BaseBrowserTest{

    public MigrationImportDataSK() {

        super("migrationborapid", SitesEnum.ENTRATA,"Entrata_5074","Xento123");
      //  super("migrationborapid");
      //  super("clientadmin",SitesEnum.CLIENTADMIN,"skapare01","Xento123");
    //    super("clientadmin");
    }

    @Test
    public void newImportDataScreen()
    {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);
        ImportNewData_Screen importNewDataScreen = new ImportNewData_Screen(driver);
        NewImportDataSK newImportData = new NewImportDataSK(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
        assertTrue("Could not click Import Data tab.", dataManagementNav.newImportDataPage());
        assertTrue("Could not select properties ",importNewDataScreen.SelectStatus());
        assertTrue("Click on checkbox ",importNewDataScreen.CheckFromDropdown());
        assertTrue("Click on checkbox ",importNewDataScreen.UnCheckFromDropdown());
        assertTrue("select properties", importNewDataScreen.SelectProperties());
        assertTrue("Click on checkbox ",importNewDataScreen.SelectPropertiesFromDropdownDropdown());
      //  assertTrue("select",importNewDataScreen.SelectProperty_Test());
        assertTrue("Clear Date Range",importNewDataScreen.ClearDataRange());
        assertTrue("Select Date Range",importNewDataScreen.SelectDateRange());
        assertTrue("Filter",importNewDataScreen.Filter());


    }


        @Test

        public void import_data_page()
        {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
            CompanyDataManagementNav dataManagementNav = new CompanyDataManagementNav(driver);

            NewImportDataSK newImportData = new NewImportDataSK(driver);
            assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
            assertTrue("Could not click Data Management tab.", companyFirstLevelNavigation.clickDataManagementTab());
            assertTrue("Could not click Import Data tab.", dataManagementNav.newImportDataPage());
            assertTrue("Could not find Import Data New page.",newImportData.newImportDataPage1());
            assertTrue("Could not select locale ",newImportData.choseLocal());
            assertTrue("Could not select property type ",newImportData.choosePropertyType());
            assertTrue("Could not select import type ",newImportData.chooseImportType());
            assertTrue("Unable to select import type ",newImportData.selectImportType());
            assertTrue("Able to select import type from dropdown",newImportData.selectImportTypeFromDrop());
            assertTrue("Choose file open successfully", newImportData.uploadCSV());
            assertTrue("CSV file imported",newImportData.uploadButton());
            assertTrue("Message displayed",newImportData.ImportDataListMessage());
           NewImportDataSK s = new NewImportDataSK(driver);
           s.uploadButtonOverlay();

        }
    }

