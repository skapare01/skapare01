package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.AffordableNavTabs;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.HudPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EditHudSettingsIT extends BaseBrowserTest {

    public EditHudSettingsIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2241915
    public void shouldValidateSavingEditingFunctionality_whenUpdatingCertificationSettingsInHud() {
        //Navigate to Setup >> Properties subtab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        //Search for Property
        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        //Click Property Tab
        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", prop.clickPropertyTab());

        //Click Affordable sub-tab
        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", propNav.clickPropertyAffordableMainTab());

        //Click HUD sub-tab
        AffordableNavTabs hudSub = new AffordableNavTabs(driver);
        assertTrue("Unable to locate HUD sub-tab", hudSub.clickPropertyHudTab());

        //Start verifying functionality in HUD sub-tab
        HudPage hud = new HudPage(driver);
        assertTrue("Unable to click Edit Certification Settings button", hud.clickEditCertificationSettingsButton());
        assertTrue("Unable to locate Annual Recertification Timing Dropdown", hud.confirmAnnualRecertificationDropdown());
        assertTrue("Unable to locate Save button in HUD certification settings", hud.confirmSaveButton());
        assertTrue("Unable to locate Cancel button in HUD certification settings", hud.confirmCancelButton());

        //Verify 'Buildings recertify on a specific date' dropdown
        assertTrue("Unable to make selection by value in Annual Recertification Timing", hud.selectAnnualRecertificationTimingByValue("2"));
        assertTrue("Unable to locate Building column when Buildings Recertify on a Specific Date is selected",
                hud.confirmBuildingColumnBuildingsRecertify());
        assertTrue("Unable to locate Recertification Dates column when Buildings Recertify on a Specific Date is selected",
                hud.confirmRecertificationDatesColumnBuildingRecertify());
        assertTrue("Unable to locate Save button when trying to save without inputting month/day", hud.clickSaveButton());
        assertTrue("Error message not found when month/day not entered under Buildings Recertify on a specific date",
                hud.confirmErrorWhenMonthDayNotEntered());
        assertTrue("Unable to select month for Build2", hud.selectMonthBuildTwoByValue("01"));
        assertTrue("Unable to select day for Build2", hud.selectDayBuildTwoByValue("1"));
        assertTrue("Unable to select month for Building1", hud.selectMonthBuildingOneByValue("01"));
        assertTrue("Unable to select day for Building1", hud.selectDayBuildingOneByValue("1"));
        assertTrue("Unable to select month for osho", hud.selectMonthOshoByValue("01"));
        assertTrue("Unable to select day osho", hud.selectDayOshoByValue("1"));
        assertTrue("Unable to click Save after selecting Month/Day for buildings", hud.clickSaveButton());

        //Verify 'All Households recertify on a specific date' dropdown
        assertTrue("Unable to find Edit Certification Settings button (to verify All Households recertify on a specific date",
                hud.clickEditCertificationSettingsButton());
        assertTrue("Unable to select 'All Households recertify on a specific date' from dropdown",
                hud.selectAnnualRecertificationTimingByValue("3"));
        assertTrue("Unable to select month for All Households recertify on a specific date", hud.selectMonthAllHouseholdsByValue("01"));
        assertTrue("Unable to select day for All Households recertify on a specific date", hud.selectDayAllHouseholdsByValue("1"));
        assertTrue("Unable to click save after updating recertification timing to 'All Households recertify on a specific date",
                hud.clickSaveButton());

        //Select Households recertify on their individual recertification date
        assertTrue("Unable to locate Edit Certification Settings button (to verify Households recertify on their individual recertification date",
                hud.clickEditCertificationSettingsButton());
        assertTrue("Unable to select Households recertify on their individual recertification date", hud.selectAnnualRecertificationTimingByValue("1"));
        assertTrue("Unable to click save after updating recertification timing to 'Households recertify on their individual recertification date' dropdown",
                hud.clickSaveButton());
    }

    @Test //Test Case ID: #2247374
    public void shouldValidateSavingEditingFunctionality_whenUpdatingHudPropertyInformationSettings() {
        //Navigate to Setup >> Properties subtab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        //Search for Property
        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        //Click Property Tab
        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", prop.clickPropertyTab());

        //Click Affordable sub-tab
        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", propNav.clickPropertyAffordableMainTab());

        //Click HUD sub-tab
        AffordableNavTabs hudSub = new AffordableNavTabs(driver);
        assertTrue("Unable to locate HUD sub-tab", hudSub.clickPropertyHudTab());

        //Confirm HUD sections
        HudPage hudProp = new HudPage(driver);
        assertEquals("HUD Property Information", hudProp.confirmHudPropertyInfoSection());
        assertEquals("Certifications", hudProp.confirmHudCertificationSection());
        assertEquals("HUD Contracts", hudProp.confirmHudContractsSection());

        //Begin verifying HUD property Information edit/saving functionality
        assertTrue("Unable to locate Edit HUD Property Information button", hudProp.clickEditHUDPropertyInformationButton());
        assertTrue("Unable to confirm Cancel link exists", hudProp.confirmCancelLinkHudPropInfoExists());
        assertTrue("Unable to clear text in Project Name text field", hudProp.clearTextProjectNamePropInfoHud());
        assertTrue("Unable to locate Project Name text field", hudProp.enterProjectNamePropInfoHud("Project25"));
        assertTrue("Unable to clear text in Project Number text field", hudProp.clearTextProjectNumberPropInfoHud());
        assertTrue("Unable to locate Project Number text field", hudProp.enterProjectNumberPropInfoHud("1A2B3C4D"));
        assertTrue("Unable to clear text in IMAX ID text field", hudProp.clearTextImaxIdPropInfoHud());
        assertTrue("Unable to locate Project IMAX ID text field", hudProp.enterImaxIdPropInfoHud("99924"));
        assertTrue("Unable to clear text in Project IMAX password text field", hudProp.clearTextImaxPasswordPropInfoHud());
        assertTrue("Unable to locate Project IMAX password text field", hudProp.enterImaxPasswordPropInfoHud("Entrata17"));
        assertTrue("Unable to clear text in Recipient IMAX ID text field", hudProp.clearTextImaxRecipientIdPropInfoHud());
        assertTrue("Unable to locate Recipient IMAX ID text field", hudProp.enterImaxRecipientIdPropInfoHud("99924"));
        assertTrue("Unable to locate TRACS version Dropdown", hudProp.selectTracsVersionDropdownByValue());
        assertTrue("Unable to locate Save button after editing HUD Property Information", hudProp.clickSaveButtonHudPropertyInformation());
        assertTrue("Unable to confirm Success message after saving HUD Property Information", hudProp.confirmSuccessMessageHudPropInfo());
    }

    @Test //Test Case ID: #3244880
    public void shouldValidateSavingEditingFunctionality_whenAddingNewContractHudPage() {
        //Navigate to Setup >> Properties sub-tab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        //Search for Property
        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        //Click Property Tab
        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", prop.clickPropertyTab());

        //Click Affordable sub-tab
        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", propNav.clickPropertyAffordableMainTab());

        //Click HUD sub-tab
        AffordableNavTabs hudSub = new AffordableNavTabs(driver);
        assertTrue("Unable to locate HUD sub-tab", hudSub.clickPropertyHudTab());

        //Start verifying add new contract on HUD sub-tab
        HudPage hudAdd = new HudPage(driver);
        assertTrue("Unable to click Add Contract button on HUD tab", hudAdd.clickAddContractButton());
        assertTrue("Unable to locate Contract Number text field", hudAdd.confirmContractNumberExists());
        assertTrue("Unable to locate Contracted Units All Units radio button", hudAdd.confirmContractedUnitsAllUnitsRadioButtonExists());
        assertTrue("Unable to locate Contracted Units Select Units radio button", hudAdd.confirmContractedUnitsSelectUnitsRadioButtonExists());
        assertTrue("Unable to select Project Type from dropdown", hudAdd.selectProjectTypeByValue());
        assertTrue("Unable to click Start Date calendar icon", hudAdd.clickStartDateCalendarIcon());
        assertTrue("Unable to click 'Today' on Start Date calendar", hudAdd.clickTodayCalendarIcon());
        assertTrue("Unable to click Expiration Date calendar icon", hudAdd.clickExpirationDateCalendarIcon());
        assertTrue("Unable to click 'Today on Expiration Date calendar", hudAdd.clickTodayCalendarIcon());
        assertTrue("Unable to click Save Contract", hudAdd.clickSaveContractButton());
        assertTrue("Unable to confirm success message after adding new contract", hudAdd.confirmSuccessMessageHudPropInfo());

    }

}
