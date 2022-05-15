package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.DetailsTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HouseholdEditDetailsFunctionalityIT extends BaseBrowserTest {

    public HouseholdEditDetailsFunctionalityIT() {
        super("1automationrapid");
    }

    @Test //Test Case ID: #2227657
    public void shouldValidateEditingSavingFunctionality_whenUpdatingDetailsUnderHouseholdTabOnResidentProfile() {
        //Click on Dashboard >> Residents tab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Resident tab on the dashboard", nav.clickResidentsTab());

        //Click on Filter on All Residents Page
        AllResidentsPage resSearch = new AllResidentsPage(driver);
        assertTrue("Could not find filter button", resSearch.clickResidentFilter());

        //Search for Resident (Lease ID)
        AllResidentFilterPage resFilter = new AllResidentFilterPage(driver);
        assertTrue("Unable to enter Lease ID", resFilter.enterLeaseId("15927345"));
        assertTrue("Unable to submit Lease ID", resFilter.submitLeaseSearch());
        assertTrue("Lease ID not found", resFilter.clickResidentSearchResult());

        //Click Household tab on Resident Profile
        ResidentProfileCurtainPage household = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to locate Household tab on Resident Profile", household.clickResidentProfileHouseholdTab());

        //Click Details tab Resident Profile
        HouseholdTabPage htp = new HouseholdTabPage(driver);
        assertTrue("Unable to click Details sub-tab", htp.clickResidentProfileDetailsTab());

        //Start verification of edit/save functionality in the Details tab
        DetailsTabPage details = new DetailsTabPage(driver);
        assertTrue("Unable to click Edit button on Details subtab", details.clickEditDetailsButton());
        assertTrue("Unable to confirm Previous Subsidy Type dropdown", details.confirmPreviousSubsidyTypeDropdown());
        assertTrue("Unable to confirm Previous Housing dropdown", details.confirmPreviousHousingDropdown());
        assertTrue("Unable to confirm Displacement Status dropdown", details.confirmDisplacementStatusDropdown());
        assertTrue("Unable to confirm Household Citizenship Eligibility Dropdown", details.confirmHouseholdCitizenshipEligibilityDropdown());
        assertTrue("Unable to confirm Minimum Rent Hardship dropdown", details.confirmMinimumRentHardshipDropdown());
        assertTrue("Unable to confirm Income Level at Move-in dropdown", details.confirmIncomeLevelAtMoveInDropdown());
        assertTrue("Unable to confirm Current Income dropdown", details.confirmCurrentIncomeDropdown());
        assertTrue("Unable to confirm Income Exception dropdown", details.confirmIncomeExceptionDropdown());
        assertTrue("Unable to confirm Waiver Type dropdown", details.confirmWaiverTypeDropdown());

        //Testing required fields error message
        assertTrue("Unable to choose blank option in Previous Subsidy Type", details.clickChooseOnePreviousSubsidyTypeDropdown(0));
        assertTrue("Unable to click Save button after editing Details", details.clickSaveButtonDetails());
        assertTrue("Unable to confirm Error Message when saving with blank required field", details.confirmErrorMessageWhenSavingWithBlankRequiredFields());

        //Begin testing successful edit/save
        assertTrue("Unable to select Previous Subsidy Type", details.selectRentSupplementPreviousSubsidyTypeDropdown(3));
        assertTrue("Unable to click Save button after choosing Previous Subsidy Type", details.clickSaveButtonDetails());
        assertTrue("Unable to confirm success message after updating/saving details Household Information",
                details.confirmSuccessMessageAfterUpdatingDetails());

    }


}
