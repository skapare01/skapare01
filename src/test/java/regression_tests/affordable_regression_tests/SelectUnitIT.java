package regression_tests.affordable_regression_tests;

import static org.junit.Assert.assertTrue;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.LeadsAllLeadsFilters;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;

public class SelectUnitIT extends BaseBrowserTest {
    public SelectUnitIT() {
        super("1automationrapid");
    }

    @Test //Test Case ID: #2243665
    public void shouldConfirmSelectUnitFunctionality_WhenSelectingUnitOnRightHandSideOfLeadSummaryPage() {
        //Click Leads Tab on Dashboard
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Leads tab on Dashboard", navBar.clickLeadsTab());

        //Filter lead
        AllLeadsPage filter = new AllLeadsPage(driver);
        assertTrue("Failed to click Filter on All Leads Page", filter.clickFilterOption());

        //Filter property and status - Eligibility Complete
        LeadsAllLeadsFilters filterLead = new LeadsAllLeadsFilters(driver);
        assertTrue("Failed to click 'Clear All' to remove All Properties", filterLead.clickClearALlPropertiesButtonInFilters());
        assertTrue("Failed to click 'Add' button to select specific property", filterLead.clickAddPropertyFilterButton());
        assertTrue("Failed to search for property when filtering for specific property", filterLead.clickAllPropertiesDropdown());
        assertTrue("Failed to click Affordable_Automation property - search result", filterLead.clickAffordableAutomationPropertyFromDropdown());
        assertTrue("Failed to search for complete in Status search bar", filterLead.sendKeysToStatusSearchBar("complete"));
        assertTrue("Failed to scroll to Eligibility Complete checkbox", filterLead.scrollToEligibilityCompleteCheckbox());
        assertTrue("Failed to click 'Complete' under Eligibility status", filterLead.clickEligibilityStatusCompleteCheckbox());
        assertTrue("Failed to scroll to Filter Leads button", filterLead.scrollToFilterLeadsSearchButton());
        assertTrue("Failed to click Filter Leads button", filterLead.clickFilterSearch());

        //Click first result
        assertTrue("Failed to click filtered lead - first result", filter.clickFirstResultLeadFilter());

        //Select unit on right-hand side preferences section
        LeadSummary leadUnit = new LeadSummary(driver);
        assertTrue("Failed to click Preferences 'Edit' button", leadUnit.click_EditPreferencesButton());
        assertTrue("Failed to click Preference 'Select Unit' button", leadUnit.click_SelectUnitPreferencesButton());
        assertTrue("Failed to click radio button on first available unit", leadUnit.clickFirstAvailableUnitRadioButton());
        assertTrue("Failed to click 'Continue' after selecting first available unit", leadUnit.clickContinueUnitSearchWindow());
        assertTrue("Failed to click 'Complete' on Review Unit Details window", leadUnit.clickCompleteButtonReviewUnitDetails());
        assertTrue("Failed to click Alert 'Ok' after reviewing selected unit", leadUnit.clickAlertAfterSelectingAndReviewingUnit());
        assertTrue("Failed to confirm building and unit field were populated in the preferences section after selecting unit",
                leadUnit.confirmBuildingUnitPopulated());
        assertTrue("Failed to click 'Start Certification'", leadUnit.clickStartCertificationButton());

    }
}
