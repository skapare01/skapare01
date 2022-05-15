package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.RentRollReport;

import static org.junit.Assert.assertTrue;

public class VerifyRentRollGeneratesAndDownloadsPDFWithDefaultFiltersIT extends BaseBrowserTest {
    public VerifyRentRollGeneratesAndDownloadsPDFWithDefaultFiltersIT() {
        super("avantic");
    }

    @Test
    public void shouldDownloadRentRollPDF_whenGeneratedWithDefaultFilters() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab",navigateTo.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown",navigateTo.moveToLibrary());
        assertTrue("Can't Click on library",navigateTo.librarySelect());
        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Resident Animals report.", generalFunctions.moveTo5BelowReport(85));
        RentRollReport rentRoll = new RentRollReport(driver);
        assertTrue("Rent Roll Report Link is not present", rentRoll.clickRentRollReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Drop down arrow is not present", generalFunctions.clickDropDownArrowForDownloads());
        assertTrue("PDF Download option is not present", generalFunctions.clickPdfDownloadOption());
        assertTrue("Download button is not present", generalFunctions.confirmDownloadButtonExists());
        assertTrue("Could not click on PDF download button", generalFunctions.clickDownloadButton());
        //Verify PDF download
        assertTrue("Could not locate file for pdf", generalFunctions.waitToConfirmADownloadIsPresent("Rent Roll.pdf"));
        assertTrue("Unable to Delete file", generalFunctions.removeDownloadedFile("Rent Roll.pdf"));
    }

    @Test
    public void shouldGenerateRentRoll_whenDefaultFiltersAreUsed() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab",navigateTo.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown",navigateTo.moveToLibrary());
        assertTrue("Can't Click on library",navigateTo.librarySelect());
        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Resident Animals report.", generalFunctions.moveTo5BelowReport(85));
        RentRollReport rentRoll = new RentRollReport(driver);
        assertTrue("Rent Roll Report Link is not present", rentRoll.clickRentRollReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Generate report button cannot be clicked.", generalFunctions.clickGenerateReportButton());
        assertTrue("Report did not generate.", generalFunctions.verifyGenerationOfReport());
    }

}
