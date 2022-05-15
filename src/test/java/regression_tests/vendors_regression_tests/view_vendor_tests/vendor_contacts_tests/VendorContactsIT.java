package regression_tests.vendors_regression_tests.view_vendor_tests.vendor_contacts_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.*;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.VendorsContacts;

import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class VendorContactsIT extends BaseBrowserTest {

    public VendorContactsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddNewVendorContact_whenAllFieldsAreCompleted() {
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        assertTrue("Could not find Accounting tab.", entrata_navBar.hoverAccountingTab());
        assertTrue("Could not select Vendors tab.", entrata_navBar.selectVendorsInDropdown());

        VendorsPage vendorsPage = new VendorsPage(driver);
        assertTrue("Could not close Vendor filter.", vendorsPage.closeVendorFilter());
        assertTrue("Could not select first listed vendor.", vendorsPage.firstListedVendorClick());

        VendorsContacts vendorsContacts = new VendorsContacts(driver);
        assertTrue("Could not select Contacts tab.", vendorsContacts.contactsTabClick());
        assertTrue("Could not find Contacts Information.", vendorsContacts.contactsInfoVisible());
        assertTrue("Could not click Add Contact Button.", vendorsContacts.addContactButtonClick());
        assertTrue("Could not find First Name box.", vendorsContacts.firstNameVisible());
        assertTrue("Could not find Last Name box.", vendorsContacts.lastNameVisible());
        assertTrue("Could not find Associated Locations box.", vendorsContacts.associatedLocationsVisible());
        assertTrue("Could not find Set As Primary Contact For box.", vendorsContacts.setAsPrimaryContactVisible());
        assertTrue("Could not find Position box.", vendorsContacts.positionVisible());
        assertTrue("Could not find Phone box.", vendorsContacts.phoneVisible());
        assertTrue("Could not find Extension box.", vendorsContacts.extensionVisible());
        assertTrue("Could not find Fax box.", vendorsContacts.faxVisible());
        assertTrue("Could not find Email box.", vendorsContacts.emailVisible());
        assertTrue("Could not find Add button.", vendorsContacts.submitContactButtonVisible());
        assertTrue("Could not find Cancel hyperlink.", vendorsContacts.cancelHyperlinkVisible());
        assertTrue("Could not input First Name.", vendorsContacts.firstNameInput(randomName()));
        assertTrue("Could not input Last Name.", vendorsContacts.lastNameInput(randomName()));
        assertTrue("Could not input Position.", vendorsContacts.positionInput("Farmer"));
        assertTrue("Could not input Phone Number Area Code.", vendorsContacts.phoneAreaInput("123"));
        assertTrue("Could not input Phone Number First set.", vendorsContacts.phoneFirstInput("456"));
        assertTrue("Could not input Phone Number Second set.", vendorsContacts.phoneSecondInput("7890"));
        assertTrue("Could not input Extension Number.", vendorsContacts.extensionInput("12345"));
        assertTrue("Could not input Email.", vendorsContacts.emailInput("Test@Test.lcl"));
        assertTrue("Could not input Fax Number Area Code.", vendorsContacts.faxAreaInput("098"));
        assertTrue("Could not input Fax Number First set.", vendorsContacts.faxFirstInput("765"));
        assertTrue("Could not input Fax Number Second set.", vendorsContacts.faxSecondInput("4321"));
        assertTrue("Could not submit new contact.", vendorsContacts.submitContactButtonClick());
        assertTrue("Could not find green success banner.", vendorsContacts.successBannerVisible());
    }
}
