package smoke_and_sanity_tests.voip_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.call_tracker_logs_subtab.CallTrackerLogs;
import static org.junit.Assert.assertTrue;

public class CallTrackerLogsModuleIT extends BaseBrowserTest {

    public CallTrackerLogsModuleIT() { super("brooksideproperties"); }

    @Test
    public void shouldNavigateToCallTrackerLogsModule_whenDefaultWorkflowIsFollowed() { //Test Case ID: 2260142
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CallTrackerLogs callTrackerLogs = new CallTrackerLogs(driver);
        assertTrue("Failed to move to the Tools Tab", navBar.moveToToolsTab());
        assertTrue("Failed to click the Call Tracker Logs Sub Tab", navBar.clickCallTrackerLogsSubTab());
        assertTrue("Failed to find Name Phone ID Text Box", callTrackerLogs.findNamePhoneIDTextBox());
        assertTrue("Failed to find Call Date From Field", callTrackerLogs.findCallDateFrom());
        assertTrue("Failed to find Call Date To Field", callTrackerLogs.findCallDateTo());
        assertTrue("Failed to find Property Dropdown", callTrackerLogs.findPropertyDropdown());
        assertTrue("Failed to find Call Location Dropdown", callTrackerLogs.findCallLocationDropdown());
        assertTrue("Failed to find Call Type Dropdown", callTrackerLogs.findCallTypeDropdown());
        assertTrue("Failed to find Call Result Dropdown", callTrackerLogs.findCallResultDropdown());
        assertTrue("Failed to find Lead Source Dropdown", callTrackerLogs.findLeadSourceDropdown());
        assertTrue("Failed to find Answer Status Dropdown", callTrackerLogs.findAnswerStatusDropdown());
        assertTrue("Failed to find Voice Message Dropdown", callTrackerLogs.findVoiceMessageDropdown());
        assertTrue("Failed to find Archived Dropdown", callTrackerLogs.findArchivedDropdown());
        assertTrue("Failed to find Scored Dropdown", callTrackerLogs.findScoredDropdown());
        assertTrue("Failed to find Search Button", callTrackerLogs.findSearchButton());
        assertTrue("Failed to find Reset Button", callTrackerLogs.findResetButton());
        assertTrue("Failed to find Archive Call Action Button", callTrackerLogs.findArchiveCallActionButton());
        assertTrue("Failed to find Unarchive Call Action Button", callTrackerLogs.findUnarchiveCallActionButton());
        assertTrue("Failed to find Begin Download Action Button", callTrackerLogs.findBeginDownloadActionButton());
        assertTrue("Failed to find Download Ready Action Button", callTrackerLogs.findDownloadReadyActionButton());
        assertTrue("Failed to find Refresh Action Button", callTrackerLogs.findRefreshActionButton());
        assertTrue("Failed to find Download All Action Button", callTrackerLogs.findDownloadAllActionButton());
        assertTrue("Failed to find ID Column Header", callTrackerLogs.findIDColumnHeader());
        assertTrue("Failed to find CALLER Column Header", callTrackerLogs.findCallerColumnHeader());
        assertTrue("Failed to find PROPERTY Column Header", callTrackerLogs.findPropertyColumnHeader());
        assertTrue("Failed to find CALL STATUS Column Header", callTrackerLogs.findCallStatusColumnHeader());
        assertTrue("Failed to find SUB STATUS Column Header", callTrackerLogs.findSubStatusColumnHeader());
        assertTrue("Failed to find SOURCE Column Header", callTrackerLogs.findSourceColumnHeader());
        assertTrue("Failed to find RECEIVED Column Header", callTrackerLogs.findReceivedColumnHeader());
        assertTrue("Failed to find RESULT Column Header", callTrackerLogs.findResultColumnHeader());
        assertTrue("Failed to find SCORE Column Header", callTrackerLogs.findScoreColumnHeader());
        assertTrue("Failed to find the Notes Action Icon", callTrackerLogs.findNotesActionIcon());
        assertTrue("Failed to find the View History Action Icon", callTrackerLogs.findViewHistoryActionIcon());
        assertTrue("Failed to find Pagination", callTrackerLogs.findPagination());
    }
}
