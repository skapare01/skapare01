package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings.IntegrationSettingsNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings.TransmissionVendors;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.ConditionTemplates;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.CriteriaTemplates;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.Packages;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.ScreeningNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.PropertyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.PropertyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.leasing_tab.Screening;

import static org.junit.Assert.assertTrue;

public class VerifyScreeningBasicSetupInEntrataIT extends BaseBrowserTest {

    public VerifyScreeningBasicSetupInEntrataIT() {
        super("rvtest");
    }

    @Test
    public void shouldVerifyThatResidentVerifyIsSetupForClient_whenNavigatingToTheCompanySettings() {
        //testCase 3188542_A
        //Verify if Transmission Vendor, Packages, Conditions, and Criteria Templates are present.
        EntrataNavBar setup = new EntrataNavBar(driver);

        //Navigate to transmission Vendors and confirm if Resident Verify is set as a vendor.
        CompanyFirstLevelNavigation setupCompany = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav setupCompanyDataManagement = new CompanyDataManagementNav(driver);
        IntegrationSettingsNav setupCompanyDataManagementIntegrationSettings = new IntegrationSettingsNav(driver);
        TransmissionVendors transmissionVendors = new TransmissionVendors(driver);
        assertTrue("Unable to open Setup.", setup.clickSetupButton());
        assertTrue("Unable to open Setup/Datamanagement.", setupCompany.clickDataManagementTab());
        assertTrue("Unable to open Setup/Datamanagement/IntegrationSettings.",setupCompanyDataManagement.clickIntegrationSettingsTab());
        assertTrue("Unable to open Setup/Datamangement/IntegrationSettings/Transmission Vendors.", setupCompanyDataManagementIntegrationSettings.clickTransmissionVendorsTab());
        assertTrue("Unable to find 'Resident Verify' as a Transmission Vendor.", transmissionVendors.verifyResidentVerifyIsVisible());

        //Navigate to the Screening Packages and confirm if they are visible.
        CompanyLeasingNav setupCompanyLeasing = new CompanyLeasingNav(driver);
        ScreeningNav setupCompanyLeasingScreening = new ScreeningNav(driver);
        Packages screeningPackages = new Packages(driver);
        assertTrue("Unable to open Setup/Leasing in Entrata company settings.", setupCompany.clickLeasingTab());
        assertTrue("Unable to open Setup/Leasing/Screening in Entrata company settings.", setupCompanyLeasing.clickScreeningTab());
        assertTrue("Unable to open Setup/Leasing/Screening/Packages in Entrata company settings.", setupCompanyLeasingScreening.clickPackagesTab());
        assertTrue("Packages are not visible on the Packages Tab in Entrata company settings.", screeningPackages.verifyPackagesVisible());

        //Navigate to Conditions Templates and confirm if they are visible.
        ConditionTemplates screeningConditionTemplates = new ConditionTemplates(driver);
        assertTrue("Unable to open Setup/Leasing/Screening/Condition Templates in Entrata company settings.", setupCompanyLeasingScreening.clickConditionTemplatesTab());
        assertTrue("Condition Templates are not visible on the Condition Templates Tab in Entrata company settings.", screeningConditionTemplates.verifyConditiontemplatesVisible());

        //Navigate to Criteria Templates and confirm if they are visible.
        CriteriaTemplates screeningCriteriaTemplates = new CriteriaTemplates(driver);
        assertTrue("Unable to open Setup/Leasing/Screening/Criteria Templates in Entrata company settings.", setupCompanyLeasingScreening.clickCriteriaTemplatesTab());
        assertTrue("Criteria Templates are not visible on the Criteria Templates Tab in Entrata company settings.", screeningCriteriaTemplates.verifyCriteriaTempalateVisible());

    }

    @Test
    public void shouldVerifyThatResidentVerifyIsSetupForProperty_whenNavigatingToThePropertySettings() {
        //testCase 3188542_B
        //Verify if Property is set for Screening
        EntrataNavBar setup = new EntrataNavBar(driver);

        //Go to Setup/Properties
        assertTrue("Unable to open 'Setup'.", setup.clickSetupButton());
        assertTrue("Unable to open Setup/Properties.", setup.clickPropertiesButton());

        //Search Resident Verify property Name
        PropertyListPage propertyList = new PropertyListPage(driver);
        assertTrue("Unable to enter property name into Property search bar.", propertyList.searchResidentVerifyProperty());
        assertTrue("Unable to press enter in Property search bar.", propertyList.pressEnterInPropertySearch());
        assertTrue("Unable to select Resident Verify Property from Result", propertyList.selectResidentVerifyProperty());

        //See if Resident Verify is set as screening Vendor.
        PropertyFirstLevelNavigation setupProperty = new PropertyFirstLevelNavigation(driver);
        PropertyDataManagementNav setupPropertyDataManagement = new PropertyDataManagementNav(driver);
        PropertyLeasingNav propertyLeasingTab = new PropertyLeasingNav(driver);
        Screening propertyDataManagementLeasingScreening = new Screening(driver);
        assertTrue("Unable to find Data Management Tab in Entrata property settings.", setupProperty.clickDataManagementTabAfterOverlay());
        assertTrue("Unable to find DataManagement/Leasing Tab in Entrata property settings.", setupPropertyDataManagement.clickLeasingTab());
        assertTrue("Unable to find DataManagement/Leasing/Screening Tab in Entrata property settings.", propertyLeasingTab.clickScreeningSubtab());
        assertTrue("Resident Verify is not selected as the property Screening Vendor in Entrata property settings.", propertyDataManagementLeasingScreening.findResidentVerifyText());
    }

}