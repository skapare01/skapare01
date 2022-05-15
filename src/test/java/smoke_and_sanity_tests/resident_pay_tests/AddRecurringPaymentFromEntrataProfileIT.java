package smoke_and_sanity_tests.resident_pay_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerPage;


import static org.junit.Assert.assertTrue;

public class AddRecurringPaymentFromEntrataProfileIT extends BaseBrowserTest {

    public AddRecurringPaymentFromEntrataProfileIT() {
        super("avantic");
    }

    //manual test 2224105

    @Test
    public void addRecurringPaymentFromProfile() {
        EntrataNavBar residents = new EntrataNavBar(driver);
        assertTrue("Failed to navigate to 'Residents' tab.", residents.clickResidentsTab());

        AllResidentsPage residentsTab = new AllResidentsPage(driver);
        assertTrue("Failed to click 'Status' tab to have current leases appear first.", residentsTab.residentLeaseStatusTabClick());
        assertTrue("Failed to select resident from all residents", residentsTab.clickFirstResidentOnList());

        ResidentLedgerPage profilePage = new ResidentLedgerPage(driver);
        assertTrue("Failed to click 'Recurring Payments' link.", profilePage.clickRecurringPaymentLink());
        assertTrue("Failed to click 'Add Payment' button for recurring payment.", profilePage.clickAddPaymentForRecurring());

    }



}
