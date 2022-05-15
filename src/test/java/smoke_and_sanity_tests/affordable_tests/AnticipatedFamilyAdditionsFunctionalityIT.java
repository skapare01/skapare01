package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.PeopleTabPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnticipatedFamilyAdditionsFunctionalityIT extends BaseBrowserTest {

    public AnticipatedFamilyAdditionsFunctionalityIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2227668
    public void shouldValidateEditingSavingFunctionality_whenSavingAndEditingAnticipatedFamilyAdditions() {
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

        //Verification of saving/editing functionality of adding Anticipated Family members
        PeopleTabPage people = new PeopleTabPage(driver);
        assertTrue("Could not find edit button for Anticipated Family Additions", people.editAnticipatedFamilyAdditions());
        assertTrue("Unable to clear Pregnancy input field", people.clearInputPregnancy());
        assertTrue("Unable to edit Pregnancy field", people.editPregnancy("1"));
        assertTrue("Unable to clear Adoption input field", people.clearInputAdoption());
        assertTrue("Unable to edit Adoption field", people.editAdoption("1"));
        assertTrue("Unable to clear Foster input field", people.clearInputFoster());
        assertTrue("Unable to edit Foster field", people.editFoster("1"));
        assertTrue("Unable to locate submit button for Anticipated Family Additions", people.clickSubmitAnticipatedFamilyAdditions());
        assertEquals("Anticipated family additions updated successfully ", people.successMessageAfterEditAnticipatedFamilyAdditions());

    }

}
