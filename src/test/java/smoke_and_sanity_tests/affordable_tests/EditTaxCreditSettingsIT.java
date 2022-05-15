package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.AffordableNavTabs;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.TaxCreditsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EditTaxCreditSettingsIT extends BaseBrowserTest {
    public EditTaxCreditSettingsIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2227241
    public void shouldValidateEditingSavingFunctionality_whenUpdatingTaxCreditPropertyInformation() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", prop.clickPropertyTab());

        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", propNav.clickPropertyAffordableMainTab());

        AffordableNavTabs affTab = new AffordableNavTabs(driver);
        assertTrue("Unable to find the TAX CREDIT tab", affTab.clickPropertyTaxCreditTab());

        TaxCreditsPage tax = new TaxCreditsPage(driver);
        assertTrue("Unable to find the Edit Tax Credit Property Information button", tax.clickEditPropertyInformation());
        //enter program number and project number
        assertTrue("Unable to clear Project Name field", tax.clearProjectNameField());
        assertTrue("Unable to enter Project Name", tax.enterProjectName("Tax Project 2022"));
        assertTrue("Unable to clear Program Number field", tax.clearProgramNumberField());
        assertTrue("Unable to enter Program Number", tax.enterProgramNumber());

        assertTrue("Unable to locate Tenant Income Certification field", tax.confirmTenantIncomeCertificationField());
        assertTrue("Unable to click Hold Harmless Project toggle switch", tax.clickHoldHarmlessProjectToggle());
        assertTrue("Unable to locate HERA Income Limits toggle", tax.confirmHERAIncomeLimitsToggle());
        assertTrue("Unable to locate VAWA Compliance Tracking", tax.confirmVAWAToggle());
        assertTrue("Unable to locate Save button", tax.clickSaveButton());
        assertTrue("Unable to find the Edit Tax Credit Property Information button", tax.clickEditPropertyInformation());
        assertTrue("Unable to click Hold Harmless Project toggle", tax.clickHoldHarmlessProjectToggle());
        assertTrue("Unable to locate Save button", tax.clickSaveButton());
        assertTrue("Unable to confirm success message after saving property information", tax.confirmSuccessMessage());
    }

    @Test //Test Case ID: #2227245
    public void shouldValidateEditingSavingFunctionality_whenEditingSavingCertificationSettingsInTaxCreditPropertyTab() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Settings tab", navBar.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", navBar.clickPropertiesButton());

        PropertyListPage propSearch = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", propSearch.clickPropertyInput());
        assertTrue("Unable to enter property name", propSearch.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", propSearch.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", propSearch.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propertyTab = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", propertyTab.clickPropertyTab());

        PropertyNavigation property = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", property.clickPropertyAffordableMainTab());

        AffordableNavTabs taxCreditTab = new AffordableNavTabs(driver);
        assertTrue("Unable to find the TAX CREDIT tab", taxCreditTab.clickPropertyTaxCreditTab());

        TaxCreditsPage taxCertSettings = new TaxCreditsPage(driver);
        assertTrue("Unable to click Edit Certification Settings button", taxCertSettings.clickEditCertificationSettingsButton());
        assertTrue("Unable to select Perform Annual Certifications from dropdown", taxCertSettings.selectPerformAnnualCertificationsOption("5"));
        assertTrue("Unable to select First Day of the Anniversary Month radio button", taxCertSettings.clickFirstDayOfAnniversaryMonthRadioButton());
        assertTrue("Unable to click the save button for certification settings", taxCertSettings.clickSaveButtonCertificationSettings());
        assertTrue("Unable to click Edit Certification Settings button after saving", taxCertSettings.clickEditCertificationSettingsButton());
        assertTrue("Unable to select Anniversary Date radio button", taxCertSettings.clickAnniversaryDateRadioButton());
        assertTrue("Unable to click the save button after updating Recertify on Anniversary Date", taxCertSettings.clickSaveButtonCertificationSettings());
        assertTrue("Unable to confirm Success message after saving Certification settings", taxCertSettings.confirmCertificationsSuccessMessage());
    }

    @Test //Test Case ID: #2248017
    public void shouldValidateEditingSavingFunctionality_whenEditingUtilityAllowancesAndRentFloors() {
        //Search and click Setup on Dashboard and click Properties sub-tab
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Settings tab", navBar.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", navBar.clickPropertiesButton());

        //Search for property
        PropertyListPage propSearch = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", propSearch.clickPropertyInput());
        assertTrue("Unable to enter property name", propSearch.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", propSearch.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", propSearch.selectFirstPropertyFromList());

        //Click Property tab on the Property
        PropertyFirstLevelNavigation propertyTab = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", propertyTab.clickPropertyTab());

        //Click Affordable sub-tab
        PropertyNavigation property = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", property.clickPropertyAffordableMainTab());

        //Click Tax Credit sub-tab
        AffordableNavTabs taxCreditTab = new AffordableNavTabs(driver);
        assertTrue("Unable to find the TAX CREDIT tab", taxCreditTab.clickPropertyTaxCreditTab());

        //Start Verification of Tax Credit set aside editing/saving functionality
        TaxCreditsPage taxSetAside = new TaxCreditsPage(driver);
        assertTrue("Unable to click on set-aside Tax Credit Program", taxSetAside.clickSetAsideFirstResult());
        assertTrue("Unable to confirm General tab in set aside", taxSetAside.confirmGeneralTab());
        assertTrue("Unable to click Rent & Utility Allowance tab in set aside", taxSetAside.clickRentUtilityAllowanceTab());
        assertEquals("Max Gross Rent & Rent Floors", taxSetAside.confirmMaxGrossRentAndRentFloorSection());
        assertTrue("Unable to locate Utility Allowance section in set aside", taxSetAside.confirmUtilityAllowanceSection());
        assertTrue("Unable to click 'Edit Max Gross Rent & Rent Floors' button", taxSetAside.clickEditMaxGrossRentAndRentFloorsButton());
        assertTrue("Unable to clear text in Max Gross Rent text box", taxSetAside.clearTextMaxGrossRentTextBox());
        assertTrue("Unable to enter amount in Max Gross Rent text box", taxSetAside.enterAmountMaxGrossRentTextBox("778"));
        assertTrue("Unable to clear text in Rent Floor text box", taxSetAside.clearTextRentFloorTextBox());
        assertTrue("Unable to enter amount in Rent Floor text box", taxSetAside.enterAmountRentFloorTextBox("0"));
        assertTrue("Unable to clear text in Default Tenant Rent text box", taxSetAside.clearTextDefaultTenantRentTextBox());
        assertTrue("Unable to enter amount in ", taxSetAside.enterAmountDefaultTenantRentTextBox("0"));
        assertTrue("Unable to click Submit button after updating Max Gross rent fields", taxSetAside.clickSubmitButtonEditMaxGrossRent());
        assertTrue("Unable to confirm success message after updating Max Gross Rent", taxSetAside.confirmSuccessMessageAfterEditingMaxGrossRent());
        assertTrue("Unable to click Edit Utility Allowance button", taxSetAside.clickEditUtilityAllowanceButton());
        assertTrue("Unable to clear text in Current Utility Allowance text box", taxSetAside.clearTextEditUtilityAllowance());
        assertTrue("Unable to enter amount in Current Utility Allowance text box", taxSetAside.enterAmountUtilityAllowance("500"));
        assertTrue("Unable to click Save after editing the current Utility Allowance", taxSetAside.clickSaveAfterEditingUtilityAllowance());
        assertTrue("Unable to confirm Rent & Utility Allowance tab", taxSetAside.confirmRentUtilityAllowanceTab());
        assertEquals("$500.00", taxSetAside.confirmSavedUtilityAmount());
    }

}
