package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;

import static org.junit.Assert.assertTrue;

public class VerifyProcessScreeningIsVisibleIT extends BaseBrowserTest {

    public VerifyProcessScreeningIsVisibleIT() {
        super("rvtest");
    }

    @Test
    public void shouldVerifyThatTheProcessScreeningButtonIsPresent_whenNavigatingToTheApplicantsProfile() {
        //testCase 3188542_C
        //Checks for a specific applicant if the process screening is visible.
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);

        //Navigate to Leads page.
        assertTrue("Unable to open Leads tab of Entrata.", entrataNavBar.clickLeadsTab());

        //Open screening applicant.
        AllLeadsPage leadsPage = new AllLeadsPage(driver);
        assertTrue("Unable to click filter option on the Leads page of Entrata.", leadsPage.clickFilterOption());
        assertTrue("Unable to enter screening smoke applicant ID into filter option.", leadsPage.searchScreeningLeadID());
        assertTrue("Unable to click the search for the filters on the Leads page of Entrata.", leadsPage.clickFilterSearch());
        assertTrue("Unable to click screening smoke applicant from the results on the Leads page of Entrata.", leadsPage.clickScreeningSmokeLeadID());

        //Confirm process screening window opens.
        LeadSummary leadSummary = new LeadSummary(driver);
        assertTrue("Unable to click process screening option on the lead summary.",leadSummary.clickProcessScreening());
        assertTrue("The Process Screening Window did not open.", leadSummary.processScreeningWindowProcessScreeningButtonIsVisible());

    }

}
