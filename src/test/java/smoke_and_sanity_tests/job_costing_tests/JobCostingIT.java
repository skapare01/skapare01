package smoke_and_sanity_tests.job_costing_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.corporate_tab.contracts_subtab.Contracts;
import page_objects.entrata_page_objects.corporate_tab.job_costing_subtab.JobsPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class JobCostingIT extends BaseBrowserTest {


    public JobCostingIT() {
        super("avantic");
    }

    @Test //TC: 3232870
    public void shouldNavigateToJobOverview_whenAJobIsSelected() {
        JobsPage jobsPage = new JobsPage(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Job Costing tab.", navBar.selectJobCostingInDropdown());
        assertTrue("Could not select first listed job.", jobsPage.firstListedJobClick());
        assertTrue("Could not find Job Details page.", jobsPage.jobDetailsVisible());
    }

    @Test //TC: 3240380
    public void shouldNavigateToContractOverview_whenAContractIsSelected() {
        Contracts contracts = new Contracts(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find the Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Contract from dropdown.", navBar.selectContractsInDropdown());
        assertTrue("Could not select first listed Contract.", contracts.firstListedContractClick());
        assertTrue("Could not find Contract Details page.", contracts.contractDetailsVisible());
    }

    @Test //TC: 3240159
    public void shouldFindAddNewJobForm_whenAddNewJobButtonIsClicked() {
        JobsPage jobsPage = new JobsPage(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Job Costing tab.", navBar.selectJobCostingInDropdown());
        assertTrue("Could not select Add Job button.", jobsPage.addJobButtonClick());
        assertTrue("Could not find Add Job form.", jobsPage.addJobFormVisible());
    }

    @Test //TC: 3240208
    public void shouldFindAddNewContractForm_whenAddNewContractButtonIsClicked() {
        Contracts contracts = new Contracts(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Corporate tab.", navBar.hoverCorporateTab());
        assertTrue("Could not select Contract tab.", navBar.selectContractsInDropdown());
        assertTrue("Could not select Add Contract button.", contracts.addContractButtonClick());
        assertTrue("Could not find Add Contract form.", contracts.addContractFormVisible());
    }
}
