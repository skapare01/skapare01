package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.scheduled_subtab.ScheduledPage;
import static org.junit.Assert.assertTrue;

public class VerifyReportScheduleCreationIT extends BaseBrowserTest {
    public VerifyReportScheduleCreationIT() { super("avantic");}

    @Test
    public void shouldCreateReportSchedule_whenInfoIsAddedAfterAddScheduleButtonIsClicked() {
        EntrataNavBar reportsTabs = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", reportsTabs.moveToReportsTab());
        assertTrue("Could not click on Scheduled subtab.", reportsTabs.scheduledReports());
        ScheduledPage reportSchedules = new ScheduledPage(driver);
        assertTrue("Could not click on add schedule button", reportSchedules.clickAddScheduleButton());
        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not click on Report Instance Drop Down arrow.", sharedGeneralReportingFunctions.clickReportInstanceDropDownArrow());
        assertTrue("Could not select a report instance in the menu.", reportSchedules.selectReportInstanceFromMenu());
        assertTrue("Could not enter a report instance name in the menu.", reportSchedules.enterSelectedReportInstanceNameInMenu());
        assertTrue("Could not add in a number for Every _ days field.", sharedGeneralReportingFunctions.sendKeysForEveryBlankDaysField());
        assertTrue("Could not add in Month for Start On field.", sharedGeneralReportingFunctions.sendKeysForMonthDateField());
        assertTrue("Could not add in Day for Start On field.", sharedGeneralReportingFunctions.sendKeysForDayDateField());
        assertTrue("Could not add in Year for Start On field.", sharedGeneralReportingFunctions.sendKeysForYearDateField());
        assertTrue("Could not click Company User drop down header.", sharedGeneralReportingFunctions.clickCompanyUserDropDownHeader());
        assertTrue("Could not click check box for a company user.", sharedGeneralReportingFunctions.clickCheckBoxForACompanyUser());
        assertTrue("Could not click on the green Save Report Schedule button.", reportSchedules.clickSaveReportScheduleButton());
        assertTrue("Could not click red X for newly added report schedule.", reportSchedules.clickRedXForNewlyAddedReportSchedule());
        assertTrue("Could not click red delete button for report schedule.", reportSchedules.clickDeleteScheduledReportButton());
        assertTrue("Could not confirm that blue 'Create your first Report Schedule...' text appears after report schedule deletion.", reportSchedules.confirmCreateYourFirstReportScheduleTextAppears());
    }
}