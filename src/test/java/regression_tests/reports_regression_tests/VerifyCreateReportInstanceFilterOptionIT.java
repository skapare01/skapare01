package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.report_instance_creation.ReportInstanceCreationPage;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.RentRollReport;

public class VerifyCreateReportInstanceFilterOptionIT extends BaseBrowserTest {
    public VerifyCreateReportInstanceFilterOptionIT() {
        super("avantic");
    }

    @Test
    public void shouldCreateReportInstanceForRentRollReport_whenCreateInstanceStepsAreTaken() {
        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        //Navigating and going to Reports >> Library tab.
        assertTrue("Could not locate Reports tab.", entrataNavigation.moveToReportsTab());
        assertTrue("Could not locate Library option under Reports tab dropdown menu.", entrataNavigation.moveToLibrary());
        assertTrue("Could not click Library option under Reports tab dropdown menu.", entrataNavigation.librarySelect());

        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        //Going to Rent Roll report and filling in necessary filters, and then selecting option to Create Instance.
        assertTrue("Could not scroll to Resident Aged Receivables report.", generalFunctions.moveTo5BelowReport(85));
        RentRollReport rentRoll = new RentRollReport(driver);
        assertTrue("Rent Roll Report Link is not present", rentRoll.clickRentRollReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Drop down arrow is not present", generalFunctions.clickDropDownArrowForDownloads());
        assertTrue("Could not click on Create Instance option.", generalFunctions.clickCreateInstanceOption());

        ReportInstanceCreationPage instanceCreation = new ReportInstanceCreationPage(driver);
        //Filling out details and filters in Instance Creation page, and confirming that the instance gets saved successfully.
        assertTrue("Unable to clear name in Instance Name field.", instanceCreation.clearInstanceNameField());
        assertTrue("Unable to add random name in Instance Name field.", instanceCreation.addRandomNameToReportInstanceField());
        assertTrue("Unable to click on blue 'Add Group' link.", instanceCreation.clickBlueAddGroupLink());
        assertTrue("Unable to add random name in Group Name field.", instanceCreation.addRandomNameToGroupNameField());
        assertTrue("Unable to click green 'Save Group' button.", instanceCreation.clickGreenSaveGroupButton());
        assertTrue("Unable to click checkbox next to Company Groups in Permissions filter.", instanceCreation.clickCheckBoxForCompanyGroups());
        assertTrue("Unable to click checkbox next to Company Users in Permissions filter.", instanceCreation.clickCheckBoxForCompanyUsers());
        assertTrue("Unable to click green Save Instance button.", instanceCreation.clickGreenSaveInstanceButton());
        assertTrue("Could not confirm that green success banner appeared for report instance creation.", instanceCreation.confirmGreenBannerSuccessMessageAppearsAfterInstanceIsCreated());
    }
}
