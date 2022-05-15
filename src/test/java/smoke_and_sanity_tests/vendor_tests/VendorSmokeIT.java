package smoke_and_sanity_tests.vendor_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.AddVendor;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;

public class VendorSmokeIT extends BaseBrowserTest {

    public VendorSmokeIT() {
        super("avantic");
    }

    @Test //TC: 3227748
    public void shouldFindVendorsPage_whenAVendorIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not find View Vendor page.", vendorsPage.viewVendorVisible());
    }

    @Test //TC: 3227795
    public void shouldSeeNewVendorForm_whenAddNewVendorIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());
        assertTrue("Could not find Add New Vendor form.", addVendor.addVendorFormVisible());
    }

    @Test //TC: 3235723
    public void shouldSeeVendorImportForm_whenImportVendorIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not find the tools button.", vendorsPage.toolsHover());
        assertTrue("Could not click Import Vendors button.", vendorsPage.importVendorsClick());
        assertTrue("Could not find Import Vendor form.", vendorsPage.importVendorsFormVisible());
    }
}
