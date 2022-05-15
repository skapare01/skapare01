package regression_tests.vendors_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.BulkEditVendors;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomEmail;
import static utils.RandomGenerator.randomName;

public class BulkEditVendorTestsIT extends BaseBrowserTest {

    public BulkEditVendorTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldBulkEditVendorContacts_whenEditContactOptionIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Failed to select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Failed to close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Failed to click Bulk Edit Vendors button.", vendorsPage.bulkEditVendorsButtonClick());

        BulkEditVendors bulkEditVendors = new BulkEditVendors(driver);
        assertTrue("Failed to select Bulk Edit option.", bulkEditVendors.bulkEditDropdownSelect("contacts"));
        assertTrue("Failed to click Vendors Name dropdown.", bulkEditVendors.vendorsNameDropdownClick());
        assertTrue("Failed to input Vendor Name into Vendor Search.", bulkEditVendors.searchVendorName("Abel's Ace Hardware"));
        assertTrue("Failed to click the first listed vendor in Vendor Name dropdown.", bulkEditVendors.firstListedVendorResultClick());
        assertTrue("Failed to click Editable Fields dropdown.", bulkEditVendors.editableFieldsDropdownClick());
        assertTrue("Failed to click All Fields option.", bulkEditVendors.allContactsOptionsClick());
        assertTrue("Failed to click the Continue button.", bulkEditVendors.continueButtonClick());
        assertTrue("Failed to input into First Name.", bulkEditVendors.contactFirstNameInput(randomName()));
        assertTrue("Failed to input into Last Name.", bulkEditVendors.contactLastNameInput(randomName()));
        assertTrue("Failed to click on Associated Locations dropdown.", bulkEditVendors.associatedLocationsDropdownClick());
        assertTrue("Failed to find All Locations option in Associated Locations.", bulkEditVendors.associatedLocationsAllLocationsVisible());
        assertTrue("Failed to click on Primary Contact dropdown.", bulkEditVendors.primaryContactDropdownClick());
        assertTrue("Failed to find All Locations option in Primary Contact.", bulkEditVendors.primaryContactAllLocationsOptionVisible());
        assertTrue("Failed to input into Position.", bulkEditVendors.contactPositionInput(randomName()));
        assertTrue("Failed to input Phone Area Code.", bulkEditVendors.contactPhoneAreaCodeInput("111"));
        assertTrue("Failed to input Phone First Digits.", bulkEditVendors.contactPhoneFirstDigitsInput("222"));
        assertTrue("Failed to input Phone Second Digits.", bulkEditVendors.contactPhoneSecondDigitsInput("3333"));
        assertTrue("Failed to input Fax Area Code.", bulkEditVendors.contactFaxAreaCodeInput("444"));
        assertTrue("Failed to input Fax First Digits.", bulkEditVendors.contactFaxFirstDigitsInput("555"));
        assertTrue("Failed to input Fax Second Digits.", bulkEditVendors.contactFaxSecondDigitsInput("6666"));
        assertTrue("Failed to clear text from the Email field.", bulkEditVendors.contactEmailClear());
        assertTrue("Failed to input Email Address.", bulkEditVendors.contactEmailInput(randomEmail()));
        assertTrue("Failed to click Save Changes button.", bulkEditVendors.saveChangesButtonClick());
        assertTrue("Failed to find green success banner.", vendorsPage.successBannerVisible());
    }
}
