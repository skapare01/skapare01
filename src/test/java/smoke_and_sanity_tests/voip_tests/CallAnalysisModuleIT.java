package smoke_and_sanity_tests.voip_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.phone_subtab.PhoneCallAnalysis;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;

public class CallAnalysisModuleIT extends BaseBrowserTest {

    public CallAnalysisModuleIT() { super("clientadmin",CLIENTADMIN,"cwardle","Entrata123"); }

    @Test
    public void shouldNavigateToCallAnalysisModule_whenDefaultWorkflowIsFollowed(){ //Test Case ID: 2224119
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        assertTrue("Failed to move to the Support Tab", navBar.moveToSupportMenu());
        assertTrue("Failed to move to Phone Sub Tab", navBar.moveToPhoneSubTab());
        assertTrue("Failed to click Call Analysis Sub Tab", navBar.clickPhoneCallAnalysisSubTab());
        PhoneCallAnalysis callAnalysis = new PhoneCallAnalysis(driver);
        assertTrue("Failed to find Call ID search Field", callAnalysis.findCallIDSearchField());
        assertTrue("Failed to find Extended Search Button", callAnalysis.findExtendedSearchButton());
        assertTrue("Failed to find Reset Filter Button", callAnalysis.findResetFilterButton());
        assertTrue("Failed to find Table Header ID", callAnalysis.findTableHeaderID());
        assertTrue("Failed to find Table Header Date", callAnalysis.findTableHeaderDate());
        assertTrue("Failed to find Table Header Company", callAnalysis.findTableHeaderCompany());
        assertTrue("Failed to find Table Header Property", callAnalysis.findTableHeaderProperty());
        assertTrue("Failed to find Table Header Answered By", callAnalysis.findTableHeaderAnsweredBy());
        assertTrue("Failed to find Table Header Duration", callAnalysis.findTableHeaderDuration());
        assertTrue("Failed to find Table Header Percent Lead Probability", callAnalysis.findTableHeaderPercentLeadProbability());
        assertTrue("Failed to find Table Header Action", callAnalysis.findTableHeaderAction());
        assertTrue("Failed to find Pagination", callAnalysis.findPagination());
        assertTrue("Failed to find Records Per Page", callAnalysis.findRecordsPerPage());
        assertTrue("Failed to click Analyze Call Button", callAnalysis.clickAnalyzeCallButton());
        assertTrue("Failed to find Call Analysis Form", callAnalysis.findCallAnalysisForm());
    }
}
