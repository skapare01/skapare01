package regression_tests.job_costing_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.corporate_tab.contracts_subtab.Contracts;
import page_objects.entrata_page_objects.corporate_tab.job_costing_subtab.JobsPage;

import static org.junit.Assert.assertTrue;

public class JobCostingRegressionIT extends BaseBrowserTest {

    public JobCostingRegressionIT() {
        super("avantic");
    }

    @Test
    public void shouldNavigateJobOverviewFinancialContractsTabsOfAJob_whenAJobIsAlreadyMadeAndNavigatedThroughAndChecked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Job Costing tab.", navBar.selectJobCostingInDropdown());

        JobsPage jobsPage = new JobsPage(driver);
        assertTrue("Could not select first listed job.", jobsPage.firstListedJobClick());
        assertTrue("Could not find Job Costing - Job Overview tab.", jobsPage.jobOverviewVisible());
        assertTrue("Could not find Job Costing - Financial tab.", jobsPage.financialVisible());
        assertTrue("Could not find Job Costing - Contracts tab.", jobsPage.contractsVisible());
        assertTrue("Could not select first listed job phase.", jobsPage.firstListedPhaseClick());
        assertTrue("Could not find Job Phase Details page.", jobsPage.jobPhaseDetailsVisible());
        assertTrue("Could not close Job Phase Details page.", jobsPage.closeMenu());
        assertTrue("Could not select Job Costing - Financial tab.", jobsPage.financialTabClick());
        assertTrue("Could not find Financial - Draw Request sub tab.", jobsPage.drawRequestsTabVisible());
        assertTrue("Could not find Financial - Purchase Orders sub tab.", jobsPage.purchaseOrdersTabVisible());
        assertTrue("Could not find Financial - Invoices sub tab.", jobsPage.invoicesTabVisible());
        assertTrue("Could not find Draw Requests information display box.", jobsPage.drawRequestsInfoVisible());
        assertTrue("Could not select Job Costing - Purchase Orders sub tab.", jobsPage.purchaseOrdersTabClick());
        assertTrue("Could not find Purchase Orders information display box.", jobsPage.purchaseOrdersInfoVisible());
        assertTrue("Could not select Job Costing - Invoice sub tab.", jobsPage.invoicesTabClick());
        assertTrue("Could not find Invoice information display box.", jobsPage.invoicesInfoVisible());
    }

    @Test
    public void shouldNavigateThroughFinancialContractsTabs_whenAContractIsAlreadyMadeAndNavigatedThrough() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find the Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Contract from dropdown.", navBar.selectContractsInDropdown());

        Contracts contracts = new Contracts(driver);
        assertTrue("Could not select first listed Contract.", contracts.firstListedContractClick());
        assertTrue("Could not find Contracts - Job tab.", contracts.jobTabVisible());
        assertTrue("Could not find Contracts - Financial tab.", contracts.financialTabVisible());
        assertTrue("Could not find Contract information display box.", contracts.contractInfoVisible());
        assertTrue("Could not select Financial tab.", contracts.financialTabClick());
        assertTrue("Could not find Purchase Order sub tab.", contracts.purchaseOrderTabVisible());
        assertTrue("Could not find Invoices sub tab.", contracts.invoiceTabVisible());
        assertTrue("Could not find Purchase Order information display box.", contracts.purchaseOrdersInfoVisible());
        assertTrue("Could not select Invoices tab.", contracts.invoiceTabClick());
        assertTrue("Could not find Invoices information display box.", contracts.invoicesInfoVisible());
    }
}
