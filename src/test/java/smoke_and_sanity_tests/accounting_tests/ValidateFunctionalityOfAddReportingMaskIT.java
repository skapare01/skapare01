package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab.ChartOfAccountsPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddReportingMaskIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddReportingMaskIT() {
        super("avantic");
    }

    @Test
    public void shouldAddReportingMask_whenReportingMaskPopupIsCompleted() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyNav = new CompanyFirstLevelNavigation(driver);
        GeneralLedgerNav glNav = new GeneralLedgerNav(driver);
        ChartOfAccountsPage coaPage = new ChartOfAccountsPage(driver);

        assertTrue("Could not click settings tab", nav.clickSetupButton());
        assertTrue("Could not verify that the financial tab on the company settings page was visible", companyNav.verifyFinancialTab());
        assertTrue("Could not click the financial tab on the company settings page", companyNav.clickFinancialTab());
        assertTrue("Could not click the chart of accounts sub-tab on the general ledger tab", glNav.clickChartOfAccountsTab());
        assertTrue("Could not click reporting mask button on the chart of accounts page", coaPage.clickAddReportingMaskButton());
        assertTrue("Could not verify that the add reporting mask popup was visible", coaPage.verifyAddReportingMaskPopupIsVisible());
        assertTrue("Could not find the reporting mask name field", coaPage.enterReportingMaskName());
        assertTrue("Could not find the save reporting mask button", coaPage.clickSaveReportingMaskButton());
        assertTrue("Could not find the add reporting mask success message", coaPage.verifyAddReportingMaskSuccessMessage());
    }
}
