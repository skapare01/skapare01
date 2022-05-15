package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.ChartOfAccountsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.MasterGeneralLedgerTreePage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddAccountToChartOfAccountsIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddAccountToChartOfAccountsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddAccountToChartOfAccount_whenAddAccountPopupIsCompleted() {
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
        assertTrue("Could not click on the add account button on the master gl tree", mgltPage.clickAddAccountButtonOnMasterGLTree());
        assertTrue("Could not find the first account number input field", mgltPage.enterAccountNumberFieldOneOnAddAccountPopup());
        assertTrue("Could not find the second account number input field", mgltPage.enterAccountNumberFieldTwoOnAddAccountPopup());
        assertTrue("Could not find the account name field on the add account popup", mgltPage.enterAccountNameOnAddAccountPopup());
        assertTrue("Could not find the account type dropdown on the add account popup", mgltPage.clickAddAccountPopupAccountTypeDropdown());
        assertTrue("Could not find the account type dropdown selection on the add account popup", mgltPage.clickAddAccountPopupAccountTypeDropdownSelection());
        assertTrue("Could not find the usage type dropdown on the add account popup", mgltPage.clickAddAccountPopupUsageTypeDropdown());
        assertTrue("Could not find the usage type dropdown selection on the add account popup", mgltPage.clickAddAccountPopupUsageTypeDropdownSelection());
        assertTrue("Could not find the group type dropdown on the add account popup", mgltPage.clickAddAccountPopupGroupDropdown());
        assertTrue("Could not find the group type dropdown selection on the add account popup", mgltPage.clickAddAccountPopupGroupDropdownSelection());
        assertTrue("Could not find the group type dropdown sub-selection on the add account popup", mgltPage.clickAddAccountPopupGroupDropdownSubSelection());
        assertTrue("Could not find the save button on the add account popup", mgltPage.clickAddAccountPopupSaveButton());
        assertTrue("Could not find the account info added success message", mgltPage.verifyAccountInfoAddedSuccessMessage());
        assertTrue("Could not find the associate account save button", mgltPage.clickAddAccountPopupAssociateAccountSaveButton());
        assertTrue("Could not find the account added success message", mgltPage.verifyAccountAddedSuccessMessage());
    }
}
