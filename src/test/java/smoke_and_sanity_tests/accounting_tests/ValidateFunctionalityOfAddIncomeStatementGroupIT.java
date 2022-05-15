package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.ChartOfAccountsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.MasterGeneralLedgerTreePage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddIncomeStatementGroupIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddIncomeStatementGroupIT() {
        super("avantic");
    }

    @Test
    public void shouldAddIncomeStatementGroup_whenIncomeStatementGroupPopupIsCompleted() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyNav = new CompanyFirstLevelNavigation(driver);
        GeneralLedgerNav glNav = new GeneralLedgerNav(driver);
        ChartOfAccountsPage coaPage = new ChartOfAccountsPage(driver);
        MasterGeneralLedgerTreePage mgltPage = new MasterGeneralLedgerTreePage(driver);

        assertTrue("Could not click settings tab", nav.clickSetupButton());
        assertTrue("Could not verify that the financial tab on the company settings page was visible", companyNav.verifyFinancialTab());
        assertTrue("Could not click the financial tab on the company settings page", companyNav.clickFinancialTab());
        assertTrue("Could not click the chart of accounts sub-tab on the general ledger tab", glNav.clickChartOfAccountsTab());
        assertTrue("Could not click the master gl tree line item", coaPage.clickMasterGLTreeLineItem());
        assertTrue("Could not verify that the gl master tree account table was visible", mgltPage.verifyMasterGLTreeAccountsTable());
        assertTrue("Could not click on the gl master tree income statement tab", mgltPage.clickIncomeStatementTab());
        assertTrue("Could not click on the income statement tab add group button", mgltPage.clickAddGroupButton());
        assertTrue("Could not click on add group popup account type dropdown", mgltPage.clickAccountTypeDropdown());
        assertTrue("Could not click on the account type dropdown selection", mgltPage.clickAccountTypeDropdownSelection());
        assertTrue("Could not find the show group name on reports toggle", mgltPage.clickShowGroupNameOnReportsToggle());
        assertTrue("Could not enter group name into the group name field", mgltPage.enterGroupName());
        assertTrue("Could not find the add account group button", mgltPage.clickAddAccountGroupButton());
        assertTrue("Could not find the account group added success message", mgltPage.verifyAccountGroupAddedSuccessMessage());
    }
}
