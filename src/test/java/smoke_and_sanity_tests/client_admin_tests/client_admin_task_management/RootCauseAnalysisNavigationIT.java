package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import static base_tests.SitesEnum.CLIENTADMIN;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis.*;

import static org.junit.Assert.assertTrue;


public class RootCauseAnalysisNavigationIT extends BaseBrowserTest {
    public RootCauseAnalysisNavigationIT(){
        super("clientadmin",CLIENTADMIN,"bbreivik","Xento123");}

    @Test
    public void shouldValidateRootCauseAnalysis_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        assertTrue("Unable to hover over tasks tab.",nav.moveToTasksTab());
        assertTrue("Unable to click Root Cause Analysis subtab.",nav.clickRootCauseAnalysis());
        RootCauseAnalysisNav rootCauseAnalysisNav = new RootCauseAnalysisNav(driver);
        assertTrue("unable to click urgent vs immediate tab", rootCauseAnalysisNav.clickUrgentImmediateTab());
        UrgentVsImmediatePage urgentVsImmediatePage = new UrgentVsImmediatePage(driver);
        assertTrue("Unable to find 'urgent vs immediate task report' tab.",urgentVsImmediatePage.findUrgentImmediateTaskChart());
        assertTrue("Unable to find SDM dropdown on urgent vs immediate task report page.", urgentVsImmediatePage.findSDMDropdown());
        assertTrue("Unable to click 'key client task' tab.", rootCauseAnalysisNav.clickKeyClientTab());
        KeyClientTaskPage keyClientTaskPage = new KeyClientTaskPage(driver);
        assertTrue("Unable to find key client task chart'", keyClientTaskPage.findKeyClientTaskChart());
        assertTrue("Unable to find key client dropdown.", keyClientTaskPage.findKeyClientDropdown());
        assertTrue("Unable to click 'QA vs non QA' tab.", rootCauseAnalysisNav.clickQATAB());
        QAVsNonQAPage qaVsNonQAPage = new QAVsNonQAPage(driver);
        assertTrue("Unable fo find QA vs Non-QA approved task chart.",qaVsNonQAPage.findQAChart());
        assertTrue("Unable to find task priority dropdown.",qaVsNonQAPage.findTaskPriorityDropdown());
        assertTrue("Unable to click 'priority bugs' tab.", rootCauseAnalysisNav.clickPriorityBugsTab());
        PriorityBugsPage priorityBugsPage = new PriorityBugsPage(driver);
        assertTrue("Unable to find priority bugs chart.", priorityBugsPage.findBugsChart());
        assertTrue("Unable to find SDM dropdown on 'priority bugs' page.", priorityBugsPage.findSDMDropdown());
        assertTrue("Unable to click 'resolution timeline' tab.", rootCauseAnalysisNav.clickResolutionTimelineTab());
        ResolutionTimelinePage resolutionTimelinePage = new ResolutionTimelinePage(driver);
        assertTrue("Unable to find resolution timelines report.", resolutionTimelinePage.findResolutionTimelineReport());
        assertTrue("Unable to find PDM dropdown on resolution timelines page.", resolutionTimelinePage.findPDMDropdown());
        assertTrue("Unable to click 'root cause count' tab.",rootCauseAnalysisNav.clickRootCauseCountTab());
        RootCauseCountPage rootCauseCountPage = new RootCauseCountPage(driver);
        assertTrue("Unable to find root cause count report.",rootCauseCountPage.findRCACountReport());
        assertTrue("Unable to find multiple users dropdown on root cause count page.",rootCauseCountPage.findMultipleUsersDropdown());
        assertTrue("Unable to click 'outage report' tab.",rootCauseAnalysisNav.clickOutageReportTab());
        OutageReportPage outageReportPage = new OutageReportPage(driver);
        assertTrue("Unable to find 'generate report' button.", outageReportPage.findGenerateReport());
        assertTrue("Unable to click 'follow up status' tab.",rootCauseAnalysisNav.clickFollowUpStatusTab());
        FollowUpStatusPage followUpStatusPage = new FollowUpStatusPage(driver);
        assertTrue("Unable to find 'view follow up report' link.",followUpStatusPage.findViewFollowUpReport());
        assertTrue("Unable to click 'system up time' tab.",rootCauseAnalysisNav.clickSystemUpTimeTab());
        SystemUpTimePage systemUpTimePage = new SystemUpTimePage(driver);
        assertTrue("Unable to find system up time chart.",systemUpTimePage.findSystemUpTimeReport());
        assertTrue("Unable to find years dropdown on system up time chart page.",systemUpTimePage.findYearsDropdown());



    }

}
