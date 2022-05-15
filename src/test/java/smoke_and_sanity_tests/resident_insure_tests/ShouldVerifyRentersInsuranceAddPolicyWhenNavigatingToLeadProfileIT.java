package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.LeadsAllLeadsFilters;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyRentersInsuranceAddPolicyWhenNavigatingToLeadProfileIT extends BaseBrowserTest {

    public ShouldVerifyRentersInsuranceAddPolicyWhenNavigatingToLeadProfileIT() {
        super("derapid");
    }

    @Test
    public void shouldVerifyRentersInsuranceAddPolicy_whenNavigatingToLeadProfile() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Leads' tab", entrataNavigation.clickLeadsTab());
        LeadsAllLeadsFilters leadsFilters = new LeadsAllLeadsFilters(driver);
        assertTrue("Unable to click filters button in Leads page", leadsFilters.clickExpandFilterButton());
        assertTrue("Unable to type 'started' in Leads filters status search bar", leadsFilters.sendKeysToStatusSearchBar("started"));
        assertTrue("Unable to click 'application started' check box in Leads filters", leadsFilters.clickApplicationStartedCheckBox());
        AllLeadsPage leadsPage = new AllLeadsPage(driver);
        assertTrue("Unable to click 'Filter Leads' button in Leads filters", leadsPage.clickFilterSearch());
        assertTrue("Unable to click first Lead name in Leads page", leadsPage.clickFirstResultLeadFilter());
        LeadSummary leadSummary = new LeadSummary(driver);
        assertTrue("Unable to click 'Add Policy' button in Leads Summary", leadSummary.clickAddPolicyButton());
        assertTrue("Unable to find 'Provider' dropdown in Leads Summary", leadSummary.findProviderDropdown());
        assertTrue("Unable to find 'Policy Number' field in Leads Summary", leadSummary.findPolicyNumberField());
        assertTrue("Unable to find insurance 'Start Date' datepicker in Leads Summary", leadSummary.findInsuranceStartDate());
        assertTrue("Unable to find insurance 'End Date' datepicker in Leads Summary", leadSummary.findInsuranceEndDate());
        assertTrue("Unable to find 'Liability' field in Leads Summary", leadSummary.findLiabilityField());
        assertTrue("Unable to find 'Personal Contents' field in Leads Summary", leadSummary.findPersonalContentsField());
        assertTrue("Unable to find 'Deductible' field in Leads Summary", leadSummary.findDeductibleField());
        assertTrue("Unable to find 'Proof of Coverage' upload in Leads Summary", leadSummary.findProofOfCoverageUpload());
        assertTrue("Unable to find insurance verified 'Yes' option in Leads Summary", leadSummary.findInsuranceVerifiedYes());
        assertTrue("Unable to find insurance verified 'No' option in Leads Summary", leadSummary.findInsuranceVerifiedNo());
        assertTrue("Unable to find insurance Save button in Leads Summary", leadSummary.findInsuranceSaveButton());

    }

}
