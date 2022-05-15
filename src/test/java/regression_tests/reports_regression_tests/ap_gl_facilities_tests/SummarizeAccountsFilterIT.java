package regression_tests.reports_regression_tests.ap_gl_facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports.BalanceSheet;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports.CashFlowStatement;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports.ComparativeIncomeStatement;

import static org.junit.Assert.assertTrue;

public class SummarizeAccountsFilterIT extends BaseBrowserTest {

    public SummarizeAccountsFilterIT() {
        super("avantic");
    }

    @Test
    public void shouldGenerateCashFlowStatementReport_whenSummarizeAccountToggleIsOn() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(28));

        CashFlowStatement cashFlowStatement = new CashFlowStatement(driver);
        assertTrue("Failed to click on Cash Flow Statement link.", cashFlowStatement.cashFlowStatementClick());
        assertTrue("Failed to toggle Summarize Accounts to 'Yes'.", sharedGeneralReportingFunctions.summarizeAccountsToggle());
        assertTrue("Failed to click Add property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click first property.", sharedGeneralReportingFunctions.pickFirstProperty());
        assertTrue("GL Account Numbers toggle failed to be hidden.", sharedGeneralReportingFunctions.glAccountNumbersHidden());
        assertTrue("Beginning/Ending Cash Balance toggle failed to be hidden.", sharedGeneralReportingFunctions.beginningEndingCashBalanceHidden());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateBalanceSheetReport_whenSummarizeAccountToggleIsOn() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(18));

        BalanceSheet balanceSheet = new BalanceSheet(driver);
        assertTrue("Failed to click on Balance Sheet link.", balanceSheet.balanceSheetLinkClick());
        assertTrue("Failed to toggle Summarize Accounts to 'Yes'.", sharedGeneralReportingFunctions.summarizeAccountsToggle());
        assertTrue("Failed to click Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click first property.", sharedGeneralReportingFunctions.pickFirstProperty());
        assertTrue("GL Account Numbers toggle failed to be hidden.", sharedGeneralReportingFunctions.glAccountNumbersHidden());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateComparativeIncomeReport_whenSummarizeAccountToggleIsOn() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(22));

        ComparativeIncomeStatement comparativeIncomeStatement = new ComparativeIncomeStatement(driver);
        assertTrue("Failed to click on Comparative Income Statement link.", comparativeIncomeStatement.comparativeIncomeStatementLinkClick());
        assertTrue("Failed to toggle Summarize Accounts to 'Yes'.", sharedGeneralReportingFunctions.summarizeAccountsToggle());
        assertTrue("Failed to click Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click first property.", sharedGeneralReportingFunctions.pickFirstProperty());
        assertTrue("GL Account Numbers toggle failed to be hidden.", sharedGeneralReportingFunctions.accountNumbersHidden());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }
}
