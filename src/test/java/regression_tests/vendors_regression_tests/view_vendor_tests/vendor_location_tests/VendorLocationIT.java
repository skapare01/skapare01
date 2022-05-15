package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_location_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.AddVendor;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.vendor_location.VendorsLocation;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;
import static utils.RandomGenerator.randomNumber;

public class VendorLocationIT extends BaseBrowserTest {

    public VendorLocationIT() {
        super("avantic");
    }


    @Test
    public void shouldAddNewLocationAndADebitCardRemittanceType_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not locate Vendors Location information.", vendorsLocation.locationsInformationVisible());
        assertTrue("Could not select Add Location button.", vendorsLocation.addLocationClick());
        assertTrue("Could not locate Add Vendor Location form.", vendorsLocation.addLocationFormVisible());
        assertTrue("Could not find Vendor Code.", vendorsLocation.vendorCodeVisible());
        assertTrue("Could not find Country.", vendorsLocation.countryVisible());
        assertTrue("Could not find Address Line 1.", vendorsLocation.addressOneVisible());
        assertTrue("Could not find Address Line 2.", vendorsLocation.addressTwoVisible());
        assertTrue("Could not find Address Line 3.", vendorsLocation.addressThreeVisible());
        assertTrue("Could not find City.", vendorsLocation.cityVisible());
        assertTrue("Could not find State.", vendorsLocation.stateVisible());
        assertTrue("Could not find Zip.", vendorsLocation.zipVisible());
        assertTrue("Could not find Duns Number.", vendorsLocation.dunsNumberVisible());
        assertTrue("Could not find This Vendor is Approved for All Property Groups toggle.", vendorsLocation.vendorApprovedAllVendorsToggleVisible());
        assertTrue("Could not find Notes.", vendorsLocation.notesVisible());
        assertTrue("Could not input a Location Name.", vendorsLocation.locationName(randomName()));
        assertTrue("Could not select a Legal Entity.", vendorsLocation.legalEntitySelect());
        assertTrue("Could not select a Remittance Type.", vendorsLocation.remittanceTypeSelect("3"));
        assertEquals("Remittance Name did not match Remittance Type.", vendorsLocation.getRemittanceName(), "Debit Card");
        assertTrue("Could not click the button's container.", vendorsLocation.addPropertiesDivClick());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not select the Add button for adding properties.", addVendor.addPropertiesButton());
        assertTrue("Could not the All Properties button.", addVendor.addAllProperties());
        assertTrue("Could select the Add button to submit new location.", vendorsLocation.submitLocation());
        assertTrue("Could not find green success banner.", vendorsLocation.successBannerCheck());
    }

    @Test
    public void shouldAddNewLocationAndCheckRemittanceType_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not locate Vendors Location information.", vendorsLocation.locationsInformationVisible());
        assertTrue("Could not select Add Location button.", vendorsLocation.addLocationClick());
        assertTrue("Could not locate Add Vendor Location form.", vendorsLocation.addLocationFormVisible());
        assertTrue("Could not find Vendor Code.", vendorsLocation.vendorCodeVisible());
        assertTrue("Could not find Country.", vendorsLocation.countryVisible());
        assertTrue("Could not find Address Line 1.", vendorsLocation.addressOneVisible());
        assertTrue("Could not find Address Line 2.", vendorsLocation.addressTwoVisible());
        assertTrue("Could not find Address Line 3.", vendorsLocation.addressThreeVisible());
        assertTrue("Could not find City.", vendorsLocation.cityVisible());
        assertTrue("Could not find State.", vendorsLocation.stateVisible());
        assertTrue("Could not find Zip.", vendorsLocation.zipVisible());
        assertTrue("Could not find Duns Number.", vendorsLocation.dunsNumberVisible());
        assertTrue("Could not find This Vendor is Approved for All Property Groups toggle.", vendorsLocation.vendorApprovedAllVendorsToggleVisible());
        assertTrue("Could not find Notes.", vendorsLocation.notesVisible());
        assertTrue("Could not input a Location Name.", vendorsLocation.locationName(randomName()));
        assertTrue("Could not select a Legal Entity.", vendorsLocation.legalEntitySelect());
        assertTrue("Could not select a Remittance Type.", vendorsLocation.remittanceTypeSelect("2"));
        assertEquals("Remittance Name did not match Remittance Type.", vendorsLocation.getRemittanceName(), "Check");
        assertTrue("Could not click the button's container.", vendorsLocation.addPropertiesDivClick());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not select the Add button for adding properties.", addVendor.addPropertiesButton());
        assertTrue("Could not the All Properties button.", addVendor.addAllProperties());
        assertTrue("Could select the Add button to submit new location.", vendorsLocation.submitLocation());
        assertTrue("Could not find green success banner.", vendorsLocation.successBannerCheck());
    }

    @Test
    public void shouldAddNewLocationAndACHRemittanceType_whenAllMandatoryFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsLocation vendorsLocation = new VendorsLocation(driver);
        assertTrue("Could not select vendor's Locations tab.", vendorsLocation.locationsTabClick());
        assertTrue("Could not locate Vendors Location information.", vendorsLocation.locationsInformationVisible());
        assertTrue("Could not select Add Location button.", vendorsLocation.addLocationClick());
        assertTrue("Could not locate Add Vendor Location form.", vendorsLocation.addLocationFormVisible());
        assertTrue("Could not find Vendor Code.", vendorsLocation.vendorCodeVisible());
        assertTrue("Could not find Country.", vendorsLocation.countryVisible());
        assertTrue("Could not find Address Line 1.", vendorsLocation.addressOneVisible());
        assertTrue("Could not find Address Line 2.", vendorsLocation.addressTwoVisible());
        assertTrue("Could not find Address Line 3.", vendorsLocation.addressThreeVisible());
        assertTrue("Could not find City.", vendorsLocation.cityVisible());
        assertTrue("Could not find State.", vendorsLocation.stateVisible());
        assertTrue("Could not find Zip.", vendorsLocation.zipVisible());
        assertTrue("Could not find Duns Number.", vendorsLocation.dunsNumberVisible());
        assertTrue("Could not find This Vendor is Approved for All Property Groups toggle.", vendorsLocation.vendorApprovedAllVendorsToggleVisible());
        assertTrue("Could not find Notes.", vendorsLocation.notesVisible());
        assertTrue("Could not input a Location Name.", vendorsLocation.locationName(randomName()));
        assertTrue("Could not select a Legal Entity.", vendorsLocation.legalEntitySelect());
        assertTrue("Could not select a Remittance Type.", vendorsLocation.remittanceTypeSelect("5"));
        assertTrue("Could not input a name to Name on Account.", vendorsLocation.addNameOnAccount(randomName()));
        assertTrue("Could not input a number to Routing Number.", vendorsLocation.addRoutingNumber(randomNumber()));
        assertTrue("Could not input a number to Account Number.", vendorsLocation.addAccountNumber(randomNumber()));
        assertEquals("Remittance Name did not match Remittance Type.", vendorsLocation.getRemittanceName(), "ACH (eCheck)");
        assertTrue("Could not click the button's container.", vendorsLocation.addPropertiesDivClick());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not select the Add button for adding properties.", addVendor.addPropertiesButton());
        assertTrue("Could not the All Properties button.", addVendor.addAllProperties());
        assertTrue("Could select the Add button to submit new location.", vendorsLocation.submitLocation());
        assertTrue("Could not find green success banner.", vendorsLocation.successBannerCheck());
    }
}
