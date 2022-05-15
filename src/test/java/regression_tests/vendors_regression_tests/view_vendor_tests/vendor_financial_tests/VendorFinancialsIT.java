package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_financial_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.VendorsFinancial;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;

public class VendorFinancialsIT extends BaseBrowserTest {

    public VendorFinancialsIT() {
        super("avantic");
    }

    @Test
    public void shouldFindVendorFinancials_whenAVendorIsSelectedAndClickFinancialTab() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsFinancial vendorsFinancial = new VendorsFinancial(driver);
        assertTrue("Could not find the Financial tab.", vendorsFinancial.financialTabVisible());
        assertTrue("Could not click the Financial tab.", vendorsFinancial.financialTabClick());
        assertTrue("Could not find Purchase Orders tab.", vendorsFinancial.purchaseTabVisible());
        assertTrue("Could not find Invoices tab.", vendorsFinancial.invoicesTabVisible());
        assertTrue("Could not click Invoices tab.", vendorsFinancial.invoicesTabClick());
        assertTrue("Could not find Invoice information.", vendorsFinancial.invoicesInfoVisible());
        assertTrue("Could not click Purchase Order tab.", vendorsFinancial.purchaseTabClick());
        assertTrue("Could not find Purchase Order information.", vendorsFinancial.purchaseInfoVisible());
    }
}
