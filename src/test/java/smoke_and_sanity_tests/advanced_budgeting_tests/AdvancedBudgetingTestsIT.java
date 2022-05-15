package smoke_and_sanity_tests.advanced_budgeting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.budgets_subtab.BudgetsPage;

import static org.junit.Assert.assertTrue;

public class AdvancedBudgetingTestsIT extends BaseBrowserTest {

    public AdvancedBudgetingTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldFindAddBudgetForm_whenAddBudgetButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        BudgetsPage budgetsPage = new BudgetsPage(driver);
        assertTrue("Could not click Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not click Budgets tab.", navBar.budgetsTabClick());
        assertTrue("Could not click Add Budget button.", budgetsPage.addBudgetButtonClick());
        assertTrue("Could not find Add Budget form.", budgetsPage.addBudgetFormVisible());
    }

    @Test
    public void shouldFindCurrentBudgetOverview_whenACurrentBudgetIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        BudgetsPage budgetsPage = new BudgetsPage(driver);
        assertTrue("Could not click Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not click Budgets tab.", navBar.budgetsTabClick());
        assertTrue("Could not click Current tab.", budgetsPage.currentTabClick());
        assertTrue("Could not select a Current Budget.", budgetsPage.firstListedBudgetClick());
        assertTrue("Could not find Current Budget overview.", budgetsPage.budgetOverviewVisible());
    }

    @Test
    public void shouldFindWorkingBudgetOverview_whenAWorkingBudgetIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        BudgetsPage budgetsPage = new BudgetsPage(driver);
        assertTrue("Could not click Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not click Budgets tab.", navBar.budgetsTabClick());
        assertTrue("Could not click Working tab.", budgetsPage.workingTabClick());
        assertTrue("Could not select a Working Budget.", budgetsPage.firstListedBudgetClick());
        assertTrue("Could not find Working Budget overview.", budgetsPage.budgetOverviewVisible());
    }

    @Test
    public void shouldFindArchivedBudgetOverview_whenAnArchivedBudgetIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        BudgetsPage budgetsPage = new BudgetsPage(driver);
        assertTrue("Could not click Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not click Budgets tab.", navBar.budgetsTabClick());
        assertTrue("Could not click Archived tab.", budgetsPage.archivedTabClick());
        assertTrue("Could not select an Archived Budget.", budgetsPage.firstListedBudgetClick());
        assertTrue("Could not find Archived Budget overview.", budgetsPage.budgetOverviewVisible());
    }
}
