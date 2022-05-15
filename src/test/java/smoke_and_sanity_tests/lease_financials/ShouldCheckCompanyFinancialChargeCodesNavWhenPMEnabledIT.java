package smoke_and_sanity_tests.lease_financials;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.charge_codes_tab.ChargeCodesPage;

import static org.junit.Assert.*;

public class ShouldCheckCompanyFinancialChargeCodesNavWhenPMEnabledIT extends BaseBrowserTest {

    public ShouldCheckCompanyFinancialChargeCodesNavWhenPMEnabledIT() {
        super("campusapartments");
    }
@Test
    public void shouldCheckCompanyFinancialChargeCodesNav_whenPmEnabled() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        GeneralLedgerNav generalLedgerNav = new GeneralLedgerNav(driver);
        ChargeCodesPage chargeCodesPage = new ChargeCodesPage(driver);
        assertTrue("cannot click setup tab",nav.clickSetupButton());
        assertTrue("cannot click company subtab",nav.clickCompanyButton());
        assertTrue("unable to click financial tab", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("unable to click general ledger tab",financialNav.clickGeneralLedgerTab());
        assertTrue("unable to click charge codes tab",generalLedgerNav.clickChargeCodesTab());
        assertTrue("Core button not visible",chargeCodesPage.verifyVisibilityOfCoreButton());
        assertTrue("Non-core button not visible",chargeCodesPage.verifyVisibilityOfNonCoreButton());


    }
}