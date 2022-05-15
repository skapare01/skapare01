package regression_tests.vendors_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.AddVendor;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.*;

public class AddVendorsIT extends BaseBrowserTest {

    public AddVendorsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddANewStandardVendor_whenAllMandatoryVendorFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
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
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }

    @Test
    public void shouldAddANewIntercompanyVendor_whenAllMandatoryVendorFieldsAreCompleted() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("3"));
        assertTrue("Could not select Intercompany AR Entity dropdown.", addVendor.intercompanyEntityDropdownClick());
        assertTrue("Could not select first listed option in Intercompany AR Entity dropdown.", addVendor.intercompanyEntityFirstOptionClick());
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }

    @Test
    public void shouldAddAVendor_whenAllRequiredFieldsAreCompleted() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor Filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select Add New Vendor button.", vendorsPage.addNewVendor());

        AddVendor addVendor = new AddVendor(driver);
        assertTrue("Could not locate Vendor Code.", addVendor.vendorCodeVisible());
        assertTrue("Could not locate EIN.", addVendor.einVisible());
        assertTrue("Could not locate Business Name (DBA).", addVendor.businessNameVisible());
        assertTrue("Could not locate Name on Tax Return.", addVendor.nameOnTaxReturnVisible());
        assertTrue("Could not locate Vendor Type.", addVendor.vendorTypeVisible());
        assertTrue("Could not locate Entity Type.", addVendor.entityTypeVisible());
        assertTrue("Could not locate Default Payment Terms.", addVendor.defaultPaymentTermsVisible());
        assertTrue("Could not locate Default GL Account.", addVendor.defaultGlAccountVisible());
        assertTrue("Could not locate Pay on Same Check.", addVendor.payOnSameCheckVisible());
        assertTrue("Could not locate Service Location.", addVendor.serviceLocationVisible());
        assertTrue("Could not locate Service Provided.", addVendor.serviceProvidedVisible());
        assertTrue("Could not locate Website.", addVendor.websiteVisible());
        assertTrue("Could not locate Location Name.", addVendor.locationNameVisible());
        assertTrue("Could not locate Country.", addVendor.countryVisible());
        assertTrue("Could not locate Address Line 1.", addVendor.addressLineOneVisible());
        assertTrue("Could not locate Address Line 2.", addVendor.addressLineTwoVisible());
        assertTrue("Could not locate Address Line 3.", addVendor.addressLineThreeVisible());
        assertTrue("Could not locate City.", addVendor.cityVisible());
        assertTrue("Could not locate State.", addVendor.stateVisible());
        assertTrue("Could not locate Zip.", addVendor.zipVisible());
        assertTrue("Could not locate DUNS Number.", addVendor.dunsNumberVisible());
        assertTrue("Could not locate Vendor Approved for All Property Groups.", addVendor.vendorApprovedForAllPropertiesVisible());
        assertTrue("Could not locate Approved Properties.", addVendor.approvedPropertiesVisible());
        assertTrue("Could not locate External ID.", addVendor.externalIdVisible());
        assertTrue("Could not locate Notes.", addVendor.notesVisible());
        assertTrue("Could not locate Generate 1099.", addVendor.generate1099Visible());
        assertTrue("Could not locate Remittance Type.", addVendor.remittanceTypeVisible());
        assertTrue("Could not locate Remittance Name.", addVendor.remittanceNameVisible());
        assertTrue("Could not locate Country.", addVendor.remittanceCountryVisible());
        assertTrue("Could not locate Remittance - Address Line 1.", addVendor.remittanceAddressOneVisible());
        assertTrue("Could not locate Remittance - Address Line 2.", addVendor.remittanceAddressTwoVisible());
        assertTrue("Could not locate Remittance - Address Line 3.", addVendor.remittanceAddressThreeVisible());
        assertTrue("Could not locate Remittance - City.", addVendor.remittanceCityVisible());
        assertTrue("Could not locate Remittance - State.", addVendor.remittanceStateVisible());
        assertTrue("Could not locate remittance - Zip.", addVendor.remittanceZipVisible());
        assertTrue("Could not locate Contact - First Name.", addVendor.contactFirstNameVisible());
        assertTrue("Could not locate Contact - Last Name", addVendor.contactLastNameVisible());
        assertTrue("Could not locate Contact - Position.", addVendor.contactPositionVisible());
        assertTrue("Could not locate Contact- Phone.", addVendor.contactPhoneVisible());
        assertTrue("Could not locate Contact - Ext.", addVendor.contactPhoneExtVisible());
        assertTrue("Could not locate Contact - Fax.", addVendor.contactFaxVisible());
        assertTrue("Could not locate Contact - Email.", addVendor.contactEmailVisible());
        assertTrue("Could not locate Accounts - Account Number.", addVendor.accountNumberVisible());
        assertTrue("Could not locate Accounts - Description.", addVendor.accountDescriptionVisible());
        assertTrue("Could not locate Accounts - Property.", addVendor.accountPropertyVisible());
        assertTrue("Could not locate Accounts - Default GL Account.", addVendor.accountDefaultGlAccountVisible());
        assertTrue("Could not enter Business Name.", addVendor.enterBusinessName(randomName()));
        assertTrue("Could not select Vendor Type.", addVendor.selectVendorType("1"));
        assertTrue("Could not select Vendor Entity.", addVendor.selectVendorEntity("567"));
        assertTrue("Could not select Default Payment Terms.", addVendor.selectDefaultPaymentTerms("23058"));
        assertTrue("Could not enter Location Name.", addVendor.enterLocationName(randomName()));
        assertTrue("Could not select Add Properties button.", addVendor.addPropertiesButton());
        assertTrue("Could not select Add All Properties button.", addVendor.addAllProperties());
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }

    @Test
    public void shouldAddVendorWithACHRemittance_whenACHRemittanceOptionIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
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
        assertTrue("Could not select Remittance Type", addVendor.selectRemittanceType("5"));
        assertTrue("Could not select ACH Bank Account Type.", addVendor.selectBankAccountType("1"));
        assertTrue("Could not input ACH Name on Account.", addVendor.inputNameOnAccount(randomName()));
        assertTrue("Could not input ACH Routing Number.", addVendor.inputRoutingNumber(randomRoutingNumber()));
        assertTrue("Could not input ACH Account Number.", addVendor.inputAccountNumber(randomNumber()));
        assertTrue("Could not select Submit for new vendor.", addVendor.submitNewVendor());
        assertTrue("Could not see the page of the recently added vendor.", addVendor.vendorsPageCheck());
    }
}
