package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_accounts_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.VendorsAccounts;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomNumber;

public class VendorAccountsIT extends BaseBrowserTest {

    public VendorAccountsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddAVendorAccount_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsAccounts vendorsAccounts = new VendorsAccounts(driver);
        assertTrue("Could not select Accounts tab.", vendorsAccounts.accountsTabClick());
        assertTrue("Could not find Add Account button.", vendorsAccounts.addAccountButtonVisible());
        assertTrue("Could not find Account Information box.", vendorsAccounts.accountsInformationVisible());
        assertTrue("Could not click Add Account button.", vendorsAccounts.addAccountButtonClick());
        assertTrue("Could not find Account Number.", vendorsAccounts.accountNumberVisible());
        assertTrue("Could not find Account Description.", vendorsAccounts.accountDescriptionVisible());
        assertTrue("Could not find Location.", vendorsAccounts.locationVisible());
        assertTrue("Could not find Default Remittance.", vendorsAccounts.defaultRemittanceVisible());
        assertTrue("Could not find Default GL Account.", vendorsAccounts.defaultGlAccountVisible());
        assertTrue("Could not find Default Property.", vendorsAccounts.defaultPropertyVisible());
        assertTrue("Could not find Utility Bill Receipt Type.", vendorsAccounts.utilityBillVisible());
        assertTrue("Could not find Enable Invoice Tracking toggle.", vendorsAccounts.enableInvoiceTrackingVisible());
        assertTrue("Could not find Disable This Account toggle.", vendorsAccounts.disableAccountVisible());
        assertTrue("Could not find Use Sub Account Number.", vendorsAccounts.useSubAccountNumberVisible());
        assertTrue("Could not find Invoice Processing Recapture Total Only toggle.", vendorsAccounts.invoiceProcessingVisible());
        assertTrue("Could not input Account Number.", vendorsAccounts.accountNumberInput(randomNumber()));
        assertTrue("Could not select a Location.", vendorsAccounts.selectLocation());
        assertTrue("Could not click on Default Remittance.", vendorsAccounts.defaultRemittanceClick());
        assertTrue("Could not select a Default Remittance.", vendorsAccounts.selectRemittance());
        assertTrue("Could not select Add Account button.", vendorsAccounts.addAccountSubmitClick());
        assertTrue("Could not locate green success banner.", vendorsAccounts.successBannerVisible());
    }
}
