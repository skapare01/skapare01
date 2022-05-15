package smoke_and_sanity_tests.lease_workflows_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.financial_tab.NoticesSubtab;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AddResidentPage;
import page_objects.entrata_page_objects.accounting_tab.closings_subtab.ClosingsPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.ChargesPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.tools.GenerateCustomerInvoices;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.tools.PostDepositsInterest;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.tools.PostLateFees;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.tools.PostRecurringCharges;
import page_objects.entrata_page_objects.residents_tab.deposits_subtab.DepositsPage;
import page_objects.entrata_page_objects.residents_tab.other_income_subtab.AddOtherIncome;
import page_objects.entrata_page_objects.residents_tab.other_income_subtab.OtherIncomePage;

import static org.junit.Assert.assertTrue;

public class LeaseWorkflowsTestsIT extends BaseBrowserTest {

    public LeaseWorkflowsTestsIT() {
        super("avantic");
    }

    @Test //TC: 3247394
    public void shouldFindAddResidentsPage_whenAddResidentsButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        AddResidentPage addResidentPage = new AddResidentPage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Add Resident button.", allResidentsPage.addResidentButtonClick());
        assertTrue("Could not find Add Resident page.", addResidentPage.addResidentPageVisible());
    }

    @Test //TC: 3247376
    public void shouldFindResidentsPageInOtherIncome_whenAResidentIsSelectedInOtherIncome() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        OtherIncomePage otherIncomePage = new OtherIncomePage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Other Income sub tab.", navBar.clickOtherIncomeTab());
        assertTrue("Could not click first listed resident.", otherIncomePage.firstListedResidentClick());
        assertTrue("Could not find Resident's page.", otherIncomePage.residentPageVisible());
    }

    @Test //TC: 3247393
    public void shouldFindChargesPage_whenChargesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ChargesPage chargesPage = new ChargesPage(driver);
        assertTrue("Could not Click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Charges sub tab.", navBar.clickChargesTab());
        assertTrue("Could not find Charges page.", chargesPage.chargesPageVisible());
    }

    @Test //TC: 3247393
    public void shouldFindDepositsPage_whenDepositsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        DepositsPage depositsPage = new DepositsPage(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Deposits tab.", navBar.clickDepositsTab());
        assertTrue("Could not find Deposits page.", depositsPage.depositsPageVisible());
    }

    @Test //TC: 3247393
    public void shouldFindAccountingClosingsPage_whenClosingsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ClosingsPage closingsPage = new ClosingsPage(driver);
        assertTrue("Could not hover over Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not click Closings tab.", navBar.clickClosingsTab());
        assertTrue("Could not find Closings page.", closingsPage.closingsPageVisible());
    }

    @Test //TC: 3247404
    public void shouldFindAddOtherIncomePage_whenAddOtherIncomeButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        OtherIncomePage otherIncomePage = new OtherIncomePage(driver);
        AddOtherIncome addOtherIncome = new AddOtherIncome(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Other Income sub tab.", navBar.clickOtherIncomeTab());
        assertTrue("Could not click Add Other Income button.", otherIncomePage.addOtherIncomeButtonClick());
        assertTrue("Could not find Add Other Income page.", addOtherIncome.addOtherIncomePageVisible());
    }

    @Test //TC: 3247420
    public void shouldFindPostRecurringChargesPage_whenPostRecurringChargesButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ChargesPage chargesPage = new ChargesPage(driver);
        PostRecurringCharges postRecurringCharges = new PostRecurringCharges(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Charges sub tab.", navBar.clickChargesTab());
        assertTrue("Could not find Tools menu.", chargesPage.toolsMenuHover());
        assertTrue("Could not click Post Recurring Charges button.", chargesPage.postRecurringChargesButtonClick());
        assertTrue("Could not find Post Recurring Charges page.", postRecurringCharges.postRecurringChargePageVisible());
    }

    @Test //TC: 3247420
    public void shouldFindPostDepositsInterestPage_whenPostDepositsInterestButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ChargesPage chargesPage = new ChargesPage(driver);
        PostDepositsInterest postDepositsInterest = new PostDepositsInterest(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Charges sub tab.", navBar.clickChargesTab());
        assertTrue("Could not find Tools menu.", chargesPage.toolsMenuHover());
        assertTrue("Could not click Post Deposits Interest button.", chargesPage.postDepositsInterestButtonClick());
        assertTrue("Could not find Post Deposits Interest page.", postDepositsInterest.postDepositsInterestsPageVisible());
    }

    @Test //TC: 3247420
    public void shouldFindPostLateFeesPage_whenPostLateFeesButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Charges sub tab.", navBar.clickChargesTab());
        ChargesPage chargesPage = new ChargesPage(driver);
        assertTrue("Could not find Tools menu.", chargesPage.toolsMenuHover());
        assertTrue("Could not click Post Late Fees button.", chargesPage.postLateFeesButtonClick());
        PostLateFees postLateFees = new PostLateFees(driver);
        assertTrue("Could not find Post Late Fees page.", postLateFees.postLateFeesPageVisible());
    }

    @Test //TC: 3247495
    public void shouldFindGenerateCustomerInvoicesPage_whenGenerateCustomerInvoicesButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        ChargesPage chargesPage = new ChargesPage(driver);
        GenerateCustomerInvoices generateCustomerInvoices = new GenerateCustomerInvoices(driver);
        assertTrue("Could not click Residents tab.", navBar.clickResidentsTab());
        assertTrue("Could not click Charges sub tab.", navBar.clickChargesTab());
        assertTrue("Could not find Tools menu.", chargesPage.toolsMenuHover());
        assertTrue("Could not click Generate Customer Invoice button.", chargesPage.generateCustomerInvoicesButtonClick());
        assertTrue("Could not find Generate Customer Invoice page.", generateCustomerInvoices.generateCustomerInvoicesPageVisible());
    }

    @Test //TC: 3247490
    public void shouldFindDelinquencyPageOnDashboard_whenNoticesSubTabIsSelectedInMyDashboard() {
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        NoticesSubtab noticesSubtab = new NoticesSubtab(driver);
        assertTrue("Could not click My Dashboard Financial tab.", myDashboardNav.clickFinancialTab());
        assertTrue("Could not click Notices sub tab.", myDashboardNav.noticesSubTabClick());
        assertTrue("Could not find Delinquency page.", noticesSubtab.delinquencyPageVisible());
    }
}
