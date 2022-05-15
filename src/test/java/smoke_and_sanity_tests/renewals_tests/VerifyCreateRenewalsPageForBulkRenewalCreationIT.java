package smoke_and_sanity_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.renewals_subtab.RenewalsSubtabPage;
import page_objects.entrata_page_objects.residents_tab.renewals_subtab.create_renewals.BulkCreateRenewalsPage;

import static junit.framework.Assert.assertTrue;

public class VerifyCreateRenewalsPageForBulkRenewalCreationIT extends BaseBrowserTest {

    public VerifyCreateRenewalsPageForBulkRenewalCreationIT() {
        super("demoold");
    }

    @Test
    public void shouldVerifyBulkCreateRenewalsPage_whenClickingCreateRenewalsButtonUnderResidentsRenewals() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Could not click on residents tab", nav.clickResidentsTab());
        assertTrue("Could not click on renewals subtab", nav.clickRenewalsTab());
        RenewalsSubtabPage renewals = new RenewalsSubtabPage(driver);
        assertTrue("Could not see Email button", renewals.renewalEmailButtonVisible());
        assertTrue("Could not see cancel Renewals button", renewals.cancelRenewalsButtonVisible());
        assertTrue("Could not see renewals list lead column", renewals.leadColumnVisible());
        assertTrue("Could not see renewals list status column", renewals.renewalStatusColumnVisible());
        assertTrue("Could not see renewals list 'Renewal Offer Expires' column", renewals.renewalOfferExpiresVisible());
        assertTrue("Could not see renewals list property column", renewals.propertyColumnVisible());
        assertTrue("Could not see renewals list 'Unit' column.", renewals.unitColumnVisible());
        assertTrue("Could not see renewals list 'Lease Status' column.", renewals.leaseStatusVisible());
        assertTrue("Could not see renewals list lease expires column", renewals.leaseExpiresColumnVisible());
        assertTrue("Could not see renewals list created column", renewals.createdColumnVisible());
        assertTrue("Could not see renewals list last contact column", renewals.lastContactColumnVisible());
        assertTrue("Could not see renewals list last attempt column", renewals.lastAttemptColumnVisible());
        assertTrue("Could not click on create renewals tab", renewals.createRenewalsTabClick());
        BulkCreateRenewalsPage bulkCreate = new BulkCreateRenewalsPage(driver);
        assertTrue("Header 'select residents to renew' not visible", bulkCreate.selectResidentsToRenewTextVisible());
        assertTrue("name or email text box not visible", bulkCreate.nameOrEmailTextBoxVisible());
        assertTrue("unit text box not visible", bulkCreate.unitTextBoxVisible());
        assertTrue("property filter box not visible", bulkCreate.propertySelectionBoxVisible());
        assertTrue("Unit types dropdown not visible", bulkCreate.unitTypesDropdownBoxVisible());
        assertTrue("Leases expiring between from text box not visible", bulkCreate.leaseExpiresBetweenFromDaysTextBoxVisible());
        assertTrue("Leases expiring between to text box not visible", bulkCreate.leaseExpiresBetweenToDaysTextBoxVisible());
        assertTrue("Leases expiring between from date picker not visible", bulkCreate.leaseExpiresBetweenFromDaysDatePickerVisible());
        assertTrue("Leases expiring between to date picker not visible", bulkCreate.leaseExpiresBetweenToDaysDatePickerVisible());
        assertTrue("include in month to month leases checkbox not visible", bulkCreate.includeMonthToMonthLeasesCheckboxVisible());
        assertTrue("show non-renewable residents checkbox not visible", bulkCreate.showNonRenewableResidentsCheckBoxVisible());
        assertTrue("Search button not visible", bulkCreate.searchButtonVisible());
        assertTrue("reset button not visible", bulkCreate.resetButtonVisible());
        assertTrue("Select All Offers checkbox not visible", bulkCreate.selectAllOffersCheckboxVisible());
        assertTrue("Set Up Offers button not visible", bulkCreate.setUpOffersButtonVisible());
        assertTrue("Main renewal list Residents column not visible", bulkCreate.offerListResidentColumnVisible());
        assertTrue("Main renewal list property column not visible", bulkCreate.offerListPropertyColumnVisible());
        assertTrue("Main renewal list unit type column not visible", bulkCreate.offerListUnitTypeColumnVisible());
        assertTrue("Main renewal list bldg-unit column not visible", bulkCreate.offerListBldgUnitColumnVisible());
        assertTrue("Main renewal list Lease Expires column not visible", bulkCreate.offerListLeaseExpiresColumnVisible());
    }
}
