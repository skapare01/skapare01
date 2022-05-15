package regression_tests.reports_regression_tests.ap_gl_facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports.CashFlowStatement;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.maintenance_reports.WorkOrderDetailsReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.maintenance_reports.WorkOrderPerformanceReport;

import static org.junit.Assert.assertTrue;

public class ConsolidatedByFilterOptionsIT extends BaseBrowserTest {

    public ConsolidatedByFilterOptionsIT() {
        super("avantic");
    }

    @Test
    public void shouldGenerateWorkOrderPerformanceReport_whenDoNotConsolidateOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderPerformanceReport workOrderPerformanceReport = new WorkOrderPerformanceReport(driver);
        assertTrue("Failed to click on Work Order Performance link.", workOrderPerformanceReport.workOrderPerformanceLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Do Not Consolidate' option.", sharedGeneralReportingFunctions.consolidateByNoConsolidationConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateWorkOrderPerformanceReport_whenAllPropertiesOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderPerformanceReport workOrderPerformanceReport = new WorkOrderPerformanceReport(driver);
        assertTrue("Failed to click on Work Order Performance link.", workOrderPerformanceReport.workOrderPerformanceLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'All Properties' option.", sharedGeneralReportingFunctions.consolidateByAllPropertiesConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateWorkOrderPerformanceReport_whenPropertyGroupOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderPerformanceReport workOrderPerformanceReport = new WorkOrderPerformanceReport(driver);
        assertTrue("Failed to click on Work Order Performance link.", workOrderPerformanceReport.workOrderPerformanceLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Property Group' option.", sharedGeneralReportingFunctions.consolidateByPropertyGroupConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateWorkOrderDetailReport_whenNoConsolidationOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderDetailsReport workOrderDetailsReport = new WorkOrderDetailsReport(driver);
        assertTrue("Failed to click on Work Order Details link.", workOrderDetailsReport.workOrderDetailsLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Do Not Consolidate' option.", sharedGeneralReportingFunctions.consolidateByNoConsolidationConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateWorkOrderDetailReport_whenAllPropertiesOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderDetailsReport workOrderDetailsReport = new WorkOrderDetailsReport(driver);
        assertTrue("Failed to click on Work Order Details link.", workOrderDetailsReport.workOrderDetailsLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'All Properties' option.", sharedGeneralReportingFunctions.consolidateByAllPropertiesConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateWorkOrderDetailReport_whenPropertyGroupOptionIsSelected() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown.", entrataNavBar.moveToLibrary());
        assertTrue("Failed to click on Library.", entrataNavBar.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Work Order Performance link.", sharedGeneralReportingFunctions.moveTo5BelowReport(120));

        WorkOrderDetailsReport workOrderDetailsReport = new WorkOrderDetailsReport(driver);
        assertTrue("Failed to click on Work Order Details link.", workOrderDetailsReport.workOrderDetailsLinkClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Property Group' option.", sharedGeneralReportingFunctions.consolidateByPropertyGroupConsolidate());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateCashFlowStatementReport_whenDoNotConsolidateOptionIsSelected() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(28));

        CashFlowStatement cashFlowStatement = new CashFlowStatement(driver);
        assertTrue("Failed to click on Cash Flow Statement link.", cashFlowStatement.cashFlowStatementClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Do Not Consolidation' option.", sharedGeneralReportingFunctions.consolidateByNoConsolidationConsolidated());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateCashFlowStatementReport_whenAllPropertiesOptionIsSelected() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(28));

        CashFlowStatement cashFlowStatement = new CashFlowStatement(driver);
        assertTrue("Failed to click on Cash Flow Statement link.", cashFlowStatement.cashFlowStatementClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'All Properties' option.", sharedGeneralReportingFunctions.consolidateByAllPropertiesConsolidated());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }

    @Test
    public void shouldGenerateCashFlowStatementReport_whenPropertyGroupIsSelected() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Failed to find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Failed to find Library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Failed to click on Library", navigateTo.librarySelect());

        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Failed to scroll down to the Cash Flow Statement link.", sharedGeneralReportingFunctions.moveTo5BelowReport(28));

        CashFlowStatement cashFlowStatement = new CashFlowStatement(driver);
        assertTrue("Failed to click on Cash Flow Statement link.", cashFlowStatement.cashFlowStatementClick());
        assertTrue("Failed to click on Add Property button.", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Failed to click on All Properties option.", sharedGeneralReportingFunctions.addAllPropertiesClick());
        assertTrue("Failed to select 'Property Group' option.", sharedGeneralReportingFunctions.consolidateByPropertyGroupConsolidated());
        assertTrue("Failed to click Generate Report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Failed to find the final Generated Report.", sharedGeneralReportingFunctions.finalGeneratedReportVisible());
    }
}
