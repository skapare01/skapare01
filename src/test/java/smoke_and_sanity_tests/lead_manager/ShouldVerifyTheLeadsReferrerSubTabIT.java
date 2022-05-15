package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.referrers_subtab.LeadsReferrersSubTab;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifyTheLeadsReferrerSubTabIT extends BaseBrowserTest {


    public ShouldVerifyTheLeadsReferrerSubTabIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifyReferrersPageListings_whenInTheLeadsReferrersPage() {
        // 2263974 - Verify the Referrer Listing Page
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        //Navigate to Leads>Referrers
        assertTrue("Failed to find and click the \"Leads\" tab button from the dashboard Navigation bar!", useEntrataNavBar.clickLeadsTab());
        assertTrue("Failed to find and click the Leads->\"Referrers\" subtab button from the Navigation bar!", useEntrataNavBar.clickLeadsReferrersSubtab());
        LeadsReferrersSubTab useReferrers = new LeadsReferrersSubTab(driver);
        assertTrue("Failed to find the \"Referrer\" header on the referrers page!", useReferrers.locateReferrerHeader());
        assertTrue("Failed to find the \"Referrer Type\" header on the referrers page!", useReferrers.locateReferrerTypeHeader());
        assertTrue("Failed to find the \"Status\" header on the referrers page!", useReferrers.locateStatusHeader());
        assertTrue("Failed to find the \"Contact\" header on the referrers page!", useReferrers.locateContactHeader());
        assertTrue("Failed to find the \"Email\" header on the referrers page!", useReferrers.locateEmailHeader());
        assertTrue("Failed to find the \"Phone\" header on the referrers page!", useReferrers.locatePhoneHeader());
        assertTrue("Failed to find the \"Property(s)\" header on the referrers page!", useReferrers.locatePropertiesHeader());
        assertTrue("Failed to find the \"Leads Referred\" header on the referrers page!", useReferrers.locateLeadsReferredHeader());
        assertTrue("Failed to find the \"Move-In Conversions\" header on the referrers page!", useReferrers.locateMoveInConversionsHeader());
        //Locating Top Page Headers
        assertTrue("Failed to find the \"Referrer\" Page header on the Leads->Referrers page!", useReferrers.locateTotalReferralsHeader());
        assertTrue("Failed to find the \"Approved Applications\" Page header on the Leads->Referrers page!", useReferrers.locateApprovedApplicationsHeader());
        assertTrue("Failed to find the \"Move-Ins\" Page header on the Leads->Referrers page!", useReferrers.locateMoveInsHeader());
        assertTrue("Failed to find the \"% Moved In\" Page header on the Leads->Referrers page!", useReferrers.locatePercentMovedInHeader());
        //Add / Close Referrers Add functions
        assertTrue("Failed to find and click the \"Add Referrer\" button under the Leads->Referrers->page!", useReferrers.clickAddReferrerButton());
        assertTrue("Failed to find and click the \"Close\" button from the \"Add New Referrer\" screen!", useReferrers.clickCloseFromAddReferrerScreenButton());
        assertTrue("Failed to find and click the Leads->Referrers->\"Filter\" button from the referrers page!", useReferrers.clickReferrerFilterButton());
    }

}
