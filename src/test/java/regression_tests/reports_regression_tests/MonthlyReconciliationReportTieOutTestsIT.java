package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.MonthlyReconciliationReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.GrossPotentialRentReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.ResidentAgedReceivablesReport;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MonthlyReconciliationReportTieOutTestsIT extends BaseBrowserTest {
    public MonthlyReconciliationReportTieOutTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldMatchPotentialRentBetweenMonthlyReconciliationAndGrossPotentialRentReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Operations Summary report.", generalFunctions.moveTo5BelowReport(61));
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMonthlyReconciliationReportLink());
        assertTrue("Could not click the Differential Rebuild toggle filter in Monthly Reconciliation report filters.", monthlyReconciliationReport.clickDifferentialRebuildToggleFilterInMonthlyReconciliationReportFilters());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Could not enter 'Woodland Commons' name into search text field in Property Groups filter.", generalFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("Woodland Commons"));
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Generate report button cannot be clicked.", generalFunctions.clickGenerateReportButton());
        assertTrue("Monthly Reconciliation Report did not generate.", generalFunctions.verifyGenerationOfReport());
        assertTrue("Could not click on Gross Potential Rent report drill down link", monthlyReconciliationReport.clickDrillDownLinkForGrossPotentialRentReport());
        GrossPotentialRentReport grossPotentialRentReport = new GrossPotentialRentReport(driver);
        assertTrue("Could not confirm that GPR report generated", grossPotentialRentReport.confirmNonExcludedUnitsText());
        assertTrue("Could not scroll to timestamp at the bottom of the Gross Potential Rent report", generalFunctions.scrollToTimeStampAtBottomOfGeneratedReport());
        assertEquals("Potential Rent Does Not Match Between Monthly Reconciliation and Gross Potential Rent Reports", monthlyReconciliationReport.getPotentialRentAmountFromMonthlyReconciliationReportLink(), grossPotentialRentReport.getPotentialRentTotalFromGrossPotentialRentReport());
    }

    @Test
    public void shouldMatchChangeInDelinquencyEndingBalanceBetweenMonthlyReconciliationAndResidentAgedReceivablesReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Operations Summary report.", generalFunctions.moveTo5BelowReport(61));
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMonthlyReconciliationReportLink());
        assertTrue("Could not click the Differential Rebuild toggle filter in Monthly Reconciliation report filters.", monthlyReconciliationReport.clickDifferentialRebuildToggleFilterInMonthlyReconciliationReportFilters());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Could not enter 'Woodland Commons' name into search text field in Property Groups filter.", generalFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("Woodland Commons"));
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Generate report button cannot be clicked.", generalFunctions.clickGenerateReportButton());
        assertTrue("Monthly Reconciliation Report did not generate.", generalFunctions.verifyGenerationOfReport());
        assertTrue("Could not scroll to timestamp at the bottom of the Monthly Reconciliation report", generalFunctions.scrollToTimeStampAtBottomOfGeneratedReport());
        assertTrue("Could not click Change In Delinquency Ending Balance link to Resident Aged Receivables report from Monthly Reconciliation report", monthlyReconciliationReport.clickChangeInDelinquencyDrillDownLinkForResidentAgedReceivablesReport());
        ResidentAgedReceivablesReport residentAgedReceivablesReport = new ResidentAgedReceivablesReport(driver);
        assertTrue("Could not confirm that RAR report generated", residentAgedReceivablesReport.confirmResidentAgedReceivablesReportNameText());
        assertTrue("Could not scroll to timestamp at the bottom of the Resident Aged Receivables report", generalFunctions.scrollToTimeStampAtBottomOfGeneratedReport());
        assertEquals("Change In Delinquency Ending Balance Does Not Match Between Monthly Reconciliation and Resident Aged Receivables reports", monthlyReconciliationReport.getChangeInDelinquencyAmountFromMonthlyReconciliationReportLink(), residentAgedReceivablesReport.getUnallocatedChargesAndCreditsTotalFromResidentAgedReceivablesReport());
    }

    @Test
    public void shouldMatchChangeInPrePaymentsEndingBalanceBetweenMonthlyReconciliationAndResidentAgedReceivablesReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        SharedGeneralReportingFunctions generalFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Operations Summary report.", generalFunctions.moveTo5BelowReport(61));
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMonthlyReconciliationReportLink());
        assertTrue("Could not click the Differential Rebuild toggle filter in Monthly Reconciliation report filters.", monthlyReconciliationReport.clickDifferentialRebuildToggleFilterInMonthlyReconciliationReportFilters());
        assertTrue("Add Button is not present in Property Groups Filter", generalFunctions.clickAddPropertiesButton());
        assertTrue("Could not enter 'Woodland Commons' name into search text field in Property Groups filter.", generalFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("Woodland Commons"));
        assertTrue("Property is not selectable in the Property Groups Filter", generalFunctions.pickFirstProperty());
        assertTrue("Generate report button cannot be clicked.", generalFunctions.clickGenerateReportButton());
        assertTrue("Monthly Reconciliation Report did not generate.", generalFunctions.verifyGenerationOfReport());
        assertTrue("Could not scroll to timestamp at the bottom of the Monthly Reconciliation report", generalFunctions.scrollToTimeStampAtBottomOfGeneratedReport());
        assertTrue("Could not click Change In Pre-Payments Ending Balance link to Resident Aged Receivables report from Monthly Reconciliation report", monthlyReconciliationReport.clickChangeInPrePaymentsDrillDownLinkForResidentAgedReceivablesReport());
        ResidentAgedReceivablesReport residentAgedReceivablesReport = new ResidentAgedReceivablesReport(driver);
        assertTrue("Could not confirm that RAR report generated", residentAgedReceivablesReport.confirmResidentAgedReceivablesReportNameText());
        assertTrue("Could not scroll to timestamp at the bottom of the Resident Aged Receivables report", generalFunctions.scrollToTimeStampAtBottomOfGeneratedReport());
        assertEquals("Change In Pre-Payments Ending Balance Does Not Match Between Monthly Reconciliation and Resident Aged Receivables Reports", monthlyReconciliationReport.getChangeInPrePaymentsAmountFromMonthlyReconciliationReportLink(), residentAgedReceivablesReport.getPrePaymentsTotalFromResidentAgedReceivablesReport());
    }
}
