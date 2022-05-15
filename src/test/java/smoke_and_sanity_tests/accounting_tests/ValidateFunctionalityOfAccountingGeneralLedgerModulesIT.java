package smoke_and_sanity_tests.accounting_tests;


import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.AccountingNav;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.AddJournalEntryPage;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.JournalEntriesPage;
import page_objects.entrata_page_objects.accounting_tab.management_fees_subtab.GenerateManagementFeesPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.ChartOfAccountsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.management_fees_tab.ManagementFeesPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAccountingGeneralLedgerModulesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAccountingGeneralLedgerModulesIT() {
        super("avantic");
    }

    @Test
    public void validateFuntionalityOfAccountingGeneralLedgerModules() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        AccountingNav accNav = new AccountingNav(driver);
        CompanyFirstLevelNavigation companyNav = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        GeneralLedgerNav glNav = new GeneralLedgerNav(driver);

        JournalEntriesPage jePage = new JournalEntriesPage(driver);
        AddJournalEntryPage addJePage = new AddJournalEntryPage(driver);
        GenerateManagementFeesPage generateMFPage = new GenerateManagementFeesPage(driver);
        ManagementFeesPage mfPage = new ManagementFeesPage(driver);
        ChartOfAccountsPage coaPage = new ChartOfAccountsPage(driver);

        // -- Journal Entries module --
        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the journal entries selection in the account tab dropdown", nav.selectJournalEntriesSubTab());
        assertTrue("Could not verify that the journal entries table was visible", jePage.verifyJournalEntriesTable());
        assertTrue("Could not close the filters modal", jePage.closeFiltersModal());
        assertTrue("Could not find the add journal entry button", jePage.clickAddJEButton());
        assertTrue("Could not verify that the reference text box on the Add Journal Entry curtain was visible", addJePage.verifyAddJournalEntryCurtain());
        assertTrue("Could not close the add journal entry curtain", addJePage.closeAddJournalEntryCurtain());
        assertTrue("Could not find the tools icon in the side menu", jePage.hoverToolsButton());
        assertTrue("Could not find the journal entry templates menu option", jePage.clickJournalEntriesTemplatesMenuItem());
        assertTrue("Could not verify that the journal entry templates curtain was visible", jePage.verifyJournalEntryTemplatesCurtain());
        assertTrue("Could not close the journal entry template curtain", jePage.closeJournalEntryTemplatesCurtain());
        assertTrue("Could not verify that the journal entries table was visible", jePage.verifyJournalEntriesTable());

        // -- Management Fees module --
        assertTrue("Could not verify that the management fees button was visible", accNav.verifyManagementFeesSubtabVisibility());
        assertTrue("Could not click the management fees sub-tab", accNav.clickManagementFeesSubtab());
        assertTrue("Could not verify that the management fees table was visible", generateMFPage.verifyManagementFeesTableIsVisible());
        assertTrue("Could not hover over Generate Fees button.", generateMFPage.hoverGenerateManagementFeesButton());
        assertTrue("Could not click the generate management fees button", generateMFPage.clickGenerateManagementFeesButton());
        assertTrue("Could not click the cancel button on the generate management fees popup", generateMFPage.clickCancelGenerateManagementFee());
        assertTrue("Could not verify that the management fees table was visible", generateMFPage.verifyManagementFeesTableIsVisible());

        // -- Management Fees Template module
        assertTrue("Could not click settings tab", nav.clickSetupButton());
        assertTrue("Could not verify that the financial tab on the company settings page was visible", companyNav.verifyFinancialTab());
        assertTrue("Could not click the financial tab on the company settings page", companyNav.clickFinancialTab());
        assertTrue("Could not click the management fees sub-tab on the financial tab", financialNav.clickManagementFeesTab());
        assertTrue("Could not click the add management fee template button", mfPage.addManagementFeeTemplate());
        assertTrue("Could not that the add management fee template popup was visible", mfPage.verifyAddManagementFeeTemplate());
        assertTrue("Could not close the add management fee template popup", mfPage.closeAddManagementFeeTemplate());

        // -- Chart Of Accounts Reporting Mask module
        assertTrue("Could not click the general ledger sub-tab on the financial tab", financialNav.clickGeneralLedgerTab());
        assertTrue("Could not click the chart of accounts sub-tab on the general ledger tab", glNav.clickChartOfAccountsTab());
        assertTrue("Could not click reporting mask button on the chart of accounts page", coaPage.clickAddReportingMaskButton());
        assertTrue("Could not verify that the add reporting mask popup was visible", coaPage.verifyAddReportingMaskPopupIsVisible());
        assertTrue("Could not click the add reporting mask popup close button", coaPage.closeAddReportingMaskPopup());

    }
}
