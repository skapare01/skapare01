package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.BoxScoreReport;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerifyBoxScoreReportDrillInsMatchIT extends BaseBrowserTest {
    public VerifyBoxScoreReportDrillInsMatchIT() {
        super("avantic");
    }

    @Test
    public void generateBoxScoreSmokeTestAndCheckDrillIns() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Cant Find Reporting Tab",navigateTo.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown",navigateTo.moveToLibrary());
        assertTrue("Cant Click on library",navigateTo.librarySelect());
        //page 3
        BoxScoreReport boxScoreReportTest = new BoxScoreReport(driver);
        SharedGeneralReportingFunctions generalReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("cant find box score in Library", generalReportingFunctions.moveTo5BelowReport(18));
        assertTrue("cant click on box score report link",boxScoreReportTest.clickOnBoxscoreReport());
        assertTrue("Box score report is not found",generalReportingFunctions.clickAddPropertiesButton());
        //add first property in report library list
        assertTrue("unable to add property during generation",generalReportingFunctions.pickFirstProperty());
        //click summarize by property
        assertTrue("Couldn't select summarize option", generalReportingFunctions.summarizeByPropertySelection());
        //click generate
        assertTrue("could not find generate report button",generalReportingFunctions.clickGenerateReportButton());
        assertTrue("Overlay is no longer present after report generation", generalReportingFunctions.doubleClickOverlay());
        assertTrue("Overlay did not go away", generalReportingFunctions.waitForReportingOverlay());
        //check generation time
        assertTrue("Generation failed in 600 secs",generalReportingFunctions.verifyGenerationOfReport());
//        boxScoreReport drillIn validation;
        System.out.println("generation successful in under 600 secs");
        assertEquals("failed to find drill in occupied counts or unable to select drill in", boxScoreReportTest.summarizedNoticeUnrented(), boxScoreReportTest.clickOnSummarizedElement());
        assertEquals("Unable to locate drill in", boxScoreReportTest.summarizedNoticeUnrented(), boxScoreReportTest.locateDrillInNoticeUnrentedCount());
    }

}