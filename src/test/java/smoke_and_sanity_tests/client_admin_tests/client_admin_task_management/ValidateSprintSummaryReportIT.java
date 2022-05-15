package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.sprint_summary_report_subtab.SprintSummaryReport;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class ValidateSprintSummaryReportIT extends BaseBrowserTest {

    public ValidateSprintSummaryReportIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void verify_Sprint_Summary_Reports_Load_Properly_When_Each_Tab_Is_Selected() {
        //Task 2224422

        //Navigate to Sprint Summary Report
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to the Tasks Tab.", clientAdminNavBar.moveToTasksTab());
        assertTrue("Unable to click Sprint Summary Report subtab.", clientAdminNavBar.clickSprintSummaryReport());

        //Validate the overview tab loads properly.
        SprintSummaryReport sprintSummaryReport = new SprintSummaryReport(driver);
        assertTrue("Unable to select the Overview Tab.", sprintSummaryReport.openOverviewTab());
        assertTrue("The Overview tab did not load properly.", sprintSummaryReport.confirmOverviewTableLoadedProperly());

        //Validate the Task List loads properly,
        assertTrue("Unable to select the Task List tab.", sprintSummaryReport.openTaskList());
        assertTrue("The Task List Tab did not load properly.", sprintSummaryReport.confirmTaskListLoadedProperly());

        //Validate the Release Report loads properly.
        assertTrue("Unable to select the Release Report tab.", sprintSummaryReport.openReleaseReportTab());
        assertTrue("The Release Report Tab did not not load properly.", sprintSummaryReport.confirmReleaseReportLoadedProperly());

    }

}