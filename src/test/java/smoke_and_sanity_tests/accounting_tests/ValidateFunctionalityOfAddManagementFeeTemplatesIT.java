package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.management_fees_tab.ManagementFeesPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddManagementFeeTemplatesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddManagementFeeTemplatesIT() {
        super("avantic");
    }

    @Test
    public void addManagementFeeTemplate() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyNav = new CompanyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        ManagementFeesPage mfPage = new ManagementFeesPage(driver);

        assertTrue("Could not click settings tab", nav.clickSetupButton());
        assertTrue("Could not verify that the financial tab on the company settings page was visible", companyNav.verifyFinancialTab());
        assertTrue("Could not click the financial tab on the company settings page", companyNav.clickFinancialTab());
        assertTrue("Could not click the management fees sub-tab on the financial tab", financialNav.clickManagementFeesTab());
        assertTrue("Could not click the add management fee template button", mfPage.addManagementFeeTemplate());
        assertTrue("Could not verify that the add management fee template popup was visible", mfPage.verifyAddManagementFeeTemplate());
        assertTrue("Could not find the management fee template name field", mfPage.enterManagementFeeTemplateName());
        assertTrue("Could not find the company vendor dropdown", mfPage.clickCompanyVendorDropdown());
        assertTrue("Could not find the company vendor dropdown selection", mfPage.clickCompanyVendorDropdownSelection());
        assertTrue("Could not find the property list", mfPage.verifyPropertyListVisible());
        assertTrue("Could not find the property list selection", mfPage.clickPropertyListSelection());
        assertTrue("Could not find the management fee expense account dropdown", mfPage.clickManagementFeeExpenseAccountDropdown());
        assertTrue("Could not find the management fee expense account selection", mfPage.clickManagementFeeExpenseAccountSelection());
        assertTrue("Could not find the management fee calculation type radio button", mfPage.enterPercentOfRevenue());
        assertTrue("Could not find the management fee add template button", mfPage.clickAddTemplateButton());
        assertTrue("Could not find the template added successfully message", mfPage.verifySuccessMessageAppears());
    }
}
