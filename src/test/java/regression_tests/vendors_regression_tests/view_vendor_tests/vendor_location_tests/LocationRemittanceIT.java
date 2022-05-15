package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_location_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.vendor_location.RemittanceOptions;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.vendor_location.VendorsLocation;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class LocationRemittanceIT extends BaseBrowserTest {

    public LocationRemittanceIT() {
        super("avantic");
    }

    @Test
    public void shouldAddANewRemittanceOptionForAVendor_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not select first listed location.", vendorsLocation.firstListedLocationClick());

        RemittanceOptions remittanceOptions = new RemittanceOptions(driver);
        assertTrue("Could not find Vendor Location Info.", remittanceOptions.vendorLocationInfoVisible());
        assertTrue("Could not find Remittance Options.", remittanceOptions.remittanceOptionsVisible());
        assertTrue("Could not find Remittance View option.", remittanceOptions.viewRemittanceVisible());
        assertTrue("Could not find Remittance Edit option.", remittanceOptions.editRemittanceVisible());
        assertTrue("Could not find Contacts.", remittanceOptions.contactsVisible());
        assertTrue("Could not find Accounts.", remittanceOptions.accountsVisible());
        assertTrue("Could not find Advanced Settings.", remittanceOptions.advancedSettingsVisible());
        assertTrue("Could not select Add Remittance Option button.", remittanceOptions.addRemittanceOptionClick());
        assertTrue("Could not find Remittance Type.", remittanceOptions.addRemittanceTypeVisible());
        assertTrue("Could not find Remittance Name.", remittanceOptions.addRemittanceNameVisible());
        assertTrue("Could not find Address.", remittanceOptions.addressVisible());
        assertTrue("Could not find Address Line One.", remittanceOptions.addRemittanceAddressOneVisible());
        assertTrue("Could not find Address Line Two.", remittanceOptions.addRemittanceAddressTwoVisible());
        assertTrue("Could not find Address Line Three.", remittanceOptions.addRemittanceAddressThreeVisible());
        assertTrue("Could not find City.", remittanceOptions.addRemittanceCityVisible());
        assertTrue("Could not find State.", remittanceOptions.addRemittanceStateVisible());
        assertTrue("Could not find Zip.", remittanceOptions.addRemittanceZipVisible());
        assertTrue("Could not find Make Default toggle.", remittanceOptions.makeDefaultToggleVisible());
        assertTrue("Could not find green Add button.", remittanceOptions.addRemittanceButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", remittanceOptions.cancelRemittanceVisible());
        assertTrue("Could not find Close button.", remittanceOptions.closeRemittanceBoxVisible());
        assertTrue("Could not select Remittance Type.", remittanceOptions.selectRemittanceType());
        assertTrue("Could not select Add button.", remittanceOptions.addNewRemittanceOptionClick());
        assertTrue("Could not find Vendor Location page.", remittanceOptions.vendorLocationPageVisible());
        assertTrue("Could not locate green success banner.", vendorsLocation.successBannerCheck());
    }

    @Test
    public void shouldEditARemittanceOption_whenEditIconIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not select first listed location.", vendorsLocation.firstListedLocationClick());

        RemittanceOptions remittanceOptions = new RemittanceOptions(driver);
        assertTrue("Could not click on the edit icon for the first listed remittance option.", remittanceOptions.editRemittanceClick());
        assertTrue("Could not clear the Remittance Name field.", remittanceOptions.clearRemittanceName());
        assertTrue("Could not input a random name into the Remittance Name field.", remittanceOptions.inputRemittanceName(randomName()));
        assertTrue("Could not click 'Update' button to save editted remittance.", remittanceOptions.addNewRemittanceOptionClick());
        assertTrue("Could not find green success banner for updating the remittance,", vendorsLocation.successBannerCheck());
    }
}
