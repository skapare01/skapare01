package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_documents_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.VendorsDocuments;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;

public class VendorDocumentsIT extends BaseBrowserTest {

    public VendorDocumentsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddADocumentToVendor_whenFileTypeAndLocationAreSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsDocuments vendorsDocuments = new VendorsDocuments(driver);
        assertTrue("Could not select Documents tab.", vendorsDocuments.documentsTabClick());
        assertTrue("Could not find Documents information.", vendorsDocuments.documentsInfoVisible());
        assertTrue("Could not click Upload New Document button.", vendorsDocuments.uploadNewDocumentClick());
        assertTrue("Could not find Choose File button.", vendorsDocuments.chooseFileButtonVisible());
        assertTrue("Could not find Type dropdown.", vendorsDocuments.typeVisible());
        assertTrue("Could not find Location dropdown.", vendorsDocuments.locationVisible());
        assertTrue("Could not choose designated test file.", vendorsDocuments.uploadFile());
        assertTrue("Could not select file Type.", vendorsDocuments.fileTypeSelect());
        assertTrue("Could not select file Location.", vendorsDocuments.fileLocationSelect());
        assertTrue("Could not select Upload button.", vendorsDocuments.uploadButtonClick());
        assertTrue("Could not find green success banner.", vendorsDocuments.successBannerVisible());
    }
}
