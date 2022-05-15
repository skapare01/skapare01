package regression_tests.vendors_regression_tests.view_vendor_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.AddVendor;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class ViewVendorIT extends BaseBrowserTest {

    public ViewVendorIT() {
        super("avantic");
    }

    @Test
    public void shouldDeleteActiveVendorWithNoTransactions_whenTheDeleteOptionIsSelectedForTheVendor() {
        EntrataNavBar navBar = new EntrataNavBar(driver);

        //Create an active vendor with no transactions to delete.
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("1"));
        assertTrue("Could not select Vendor Entity.", addVendor.selectVendorEntity("567"));
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());

        //Validate elements on vendor's page and then delete the vendor.
        assertTrue("Could not find Vendor Status box.", vendorsPage.vendorStatusBoxVisible());
        assertTrue("Could not find Vendor Quick View box.", vendorsPage.vendorQuickViewBoxVisible());
        assertTrue("Could not find Vendor Quick View Edit button.", vendorsPage.vendorQuickViewButtonVisible());
        assertTrue("Could not find Vendor Add Activity box.", vendorsPage.vendorAddActivityBoxVisible());
        assertTrue("Could not select More Actions dropdown.", vendorsPage.actionMenuClick());
        assertTrue("Could not find Place On Hold selection.", vendorsPage.placeOnHoldVisible());
        assertTrue("Could not find Make Inactive selection.", vendorsPage.makeInactiveVisible());
        assertTrue("Could not find Permanently Delete selection.", vendorsPage.permanentlyDeleteVisible());
        assertTrue("Could not select Permanently Delete selection.", vendorsPage.permanentlyDeleteVendorClick());
        assertTrue("Could not find Delete Confirmation popup.", vendorsPage.deletePopupFormVisible());
        assertTrue("Could not find Continue button to delete vendor.", vendorsPage.deleteConfirmVisible());
        assertTrue("Could not find Cancel delete hyperlink.", vendorsPage.cancelDeleteHyperlinkVisible());
        assertTrue("Could not select Continue to delete vendor.", vendorsPage.confirmDeleteClick());
        assertTrue("Could not find green success banner.", vendorsPage.successBannerVisible());
    }

    @Test
    public void shouldEditVendorInfo_whenEditVendorButtonIsClickedAndFieldsAreChanged() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());
        assertTrue("Could not select Edit Vendor Info button.", vendorsPage.editVendorInfoClick());
        assertTrue("Could not input Business Name.", vendorsPage.businessNameInput(randomName()));
        assertTrue("Could not select Payment Terms.", vendorsPage.paymentTermsSelect());
        assertTrue("Could not click Save button.", vendorsPage.saveVendorEditInfoButtonClick());
        assertTrue("Could not find green success banner.", vendorsPage.successBannerVisible());
    }
}
