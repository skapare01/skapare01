package smoke_and_sanity_tests.vendoraccess_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.vendors_tab.Compliance;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.vendors_tab.VendorAccessTestAccounts;

import static org.junit.Assert.assertTrue;

public class VendorAccessIT extends BaseBrowserTest {

    public VendorAccessIT() {
        super("karenbertelli");
    }

    @Test //TC: 3238782
    public void shouldFindAddEntrataComplianceRuleSetForm_whenAddEntrataComplianceRuleSetButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        Compliance compliance = new Compliance(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not click Vendors tab.", financialNav.vendorsTabClick());
        assertTrue("Could not click Compliance tab.", compliance.complianceTabClick());
        assertTrue("Could not click Add Entrata Compliance Rule Set button.", compliance.addEntrataRuleSetButtonClick());
        assertTrue("Could not find Entrata Compliance Rule Set form.", compliance.ruleSetFormVisible());
    }

    @Test //TC: 3240453
    public void shouldFindAddThirdPartyComplianceRuleSetForm_whenAddThirdPartyComplianceRuleButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        Compliance compliance = new Compliance(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not click Vendors tab.", financialNav.vendorsTabClick());
        assertTrue("Could not click Compliance tab.", compliance.complianceTabClick());
        assertTrue("Could not click Add 3rd Party Compliance Rule button.", compliance.addThirdPartyRuleSetButtonClick());
        assertTrue("Could not find 3rd Party Rule Set form.", compliance.ruleSetFormVisible());
    }

    @Test // TC: 3238801
    public void shouldFindVendorAccessPage_whenLoginOoVendorAccessButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        VendorAccessTestAccounts vendorAccess = new VendorAccessTestAccounts(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Financial tab.", companyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Could not click Vendors tab.", financialNav.vendorsTabClick());
        assertTrue("Could not click VendorAccess Test Accounts tab.", vendorAccess.vendorAccessTestAccountsTabClick());
        assertTrue("Could not click Login to VendorAccess button.", vendorAccess.vendorAccessLoginButtonClick());
        assertTrue("Could not find VendorAccess page.", vendorAccess.vendorAccessPageVisible());
    }
}
