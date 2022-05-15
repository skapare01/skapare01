package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.PeopleTabPage;

import static org.junit.Assert.assertTrue;

public class PeopleSubTabIT extends BaseBrowserTest {
    public PeopleSubTabIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2248066
    public void shouldValidateEditingSavingFunctionality_whenUpdatingOccupantInformationOnPeopleTabSubTab() {
        //Click on Dashboard >> Residents tab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Resident tab on the dashboard", nav.clickResidentsTab());

        //Click on Filter on All Residents Page
        AllResidentsPage resSearch = new AllResidentsPage(driver);
        assertTrue("Could not find filter button", resSearch.clickResidentFilter());

        //Search for Resident (Lease ID)
        AllResidentFilterPage resFilter = new AllResidentFilterPage(driver);
        assertTrue("Unable to enter Lease ID", resFilter.enterLeaseId("15810049"));
        assertTrue("Unable to submit Lease ID", resFilter.submitLeaseSearch());
        assertTrue("Lease ID not found", resFilter.clickResidentSearchResult());

        //Click Household tab on Resident Profile
        ResidentProfileCurtainPage household = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to locate Household tab on Resident Profile", household.clickResidentProfileHouseholdTab());

        //Click People tab Resident Profile
        HouseholdTabPage htp = new HouseholdTabPage(driver);
        assertTrue("Unable to click People sub-tab", htp.clickResidentProfilePeopleTab());

        //Start verifying editing/saving occupant information functionality
        PeopleTabPage people = new PeopleTabPage(driver);
        assertTrue("Unable to click First Current Occupant", people.clickFirstCurrentOccupant());
        assertTrue("Unable to click Edit Occupant Information button", people.clickEditOccupantInformationButton());
        assertTrue("Unable to scroll to Save Information button.", people.scrollToSaveInformationButton());
        assertTrue("Unable to click 'Is this Occupant Disabled' toggle", people.clickDisabilityToggle());
        assertTrue("Unable to locate Disability Types dropdown", people.confirmDisabilityTypesDropdown());
        assertTrue("Unable to click Disability type dropdown", people.clickDisabilityTypesDropdown());
        assertTrue("Unable to select Disability type from dropdown", people.selectDisabilityTypeOptionOne());
        assertTrue("Unable to click Save Information button", people.clickSaveInformationButton());
        assertTrue("Unable to locate success message after updating Occupant information", people.confirmSuccessMessageAfterUpdatingOccupantInfo());
        assertTrue("Unable to click Secure Info tab", people.clickSecureInfoTab());
        assertTrue("Unable to click Summary tab", people.clickSummaryTab());
        assertTrue("Unable to click Edit Occupant Information button (switch disabled toggle to No)", people.clickEditOccupantInformationButton());
        assertTrue("Unable to scroll to Save Information button.", people.scrollToSaveInformationButton());
        assertTrue("Unable to click 'Is this Occupant Disable' toggle to 'No'", people.clickDisabilityToggle());
        assertTrue("Unable to clear text from Customer Invoice Message text box", people.clearTextCustomerInvoiceMessage());
        assertTrue("Unable to enter test in Customer Invoice Message text box", people.enterTextCustomerInvoiceMessage("testing123"));
        assertTrue("Unable to confirm that the 'Is this Occupant Disable' toggle to 'No'.", people.confirmThatToggleIsOff());
        assertTrue("Unable to click Save Information button after updating Disability to 'No'", people.clickSaveInformationButton());
    }

    @Test //Test Case ID: #2248067
    public void shouldValidateEditingSavingFunctionality_whenUpdatingOccupantDemographicInformation() {
        //Click on Dashboard >> Residents tab
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Resident tab on the dashboard", navBar.clickResidentsTab());

        //Click on Filter on All Residents Page
        AllResidentsPage resident = new AllResidentsPage(driver);
        assertTrue("Could not find filter button", resident.clickResidentFilter());

        //Search for Resident (Lease ID)
        AllResidentFilterPage search = new AllResidentFilterPage(driver);
        assertTrue("Unable to enter Lease ID", search.enterLeaseId("15810049"));
        assertTrue("Unable to submit Lease ID", search.submitLeaseSearch());
        assertTrue("Lease ID not found", search.clickResidentSearchResult());

        //Click Household tab on Resident Profile
        ResidentProfileCurtainPage householdTab = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to locate Household tab on Resident Profile", householdTab.clickResidentProfileHouseholdTab());

        //Click People tab Resident Profile
        HouseholdTabPage peopleTab = new HouseholdTabPage(driver);
        assertTrue("Unable to click People sub-tab", peopleTab.clickResidentProfilePeopleTab());

        //Start verifying editing/saving occupant information functionality
        PeopleTabPage demographic = new PeopleTabPage(driver);
        assertTrue("Unable to click First Current Occupant", demographic.clickFirstCurrentOccupant());
        assertTrue("Failed to click Edit Demographic Information button", demographic.clickEditDemographicInfoButton());
        assertTrue("Unable to locate Race dropdown", demographic.confirmRaceDropdownExists());
        assertTrue("Unable to locate Ethnicity dropdown", demographic.confirmEthnicityDropdownExists());
        assertTrue("Failed to select Gender by value", demographic.selectGenderByValue("M"));
        assertTrue("Failed to click Save button after updating demographic info", demographic.clickSaveDemographicButton());
        assertTrue("Unable to confirm success message after saving demographic info", demographic.confirmSuccessMessageAfterUpdatingOccupantInfo());
    }
}
