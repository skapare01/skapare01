package smoke_and_sanity_tests.resident_pay_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;

import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerPage;


import static org.junit.Assert.assertTrue;


public class AddPaymentFromEntrataProfileIT extends BaseBrowserTest {
    public AddPaymentFromEntrataProfileIT()  {
        super("avantic");
    }



    @Test
    public void addPaymentFromProfile() {
        EntrataNavBar residentsTab = new EntrataNavBar(driver);
        assertTrue("Failed to navigate to 'Residents' tab.", residentsTab.clickResidentsTab());

        AllResidentsPage residentsList = new AllResidentsPage(driver);
        assertTrue("Failed to click 'Status' tab to sort leases.", residentsList.residentLeaseStatusTabClick());
        assertTrue("Failed to select resident from all residents", residentsList.clickFirstResidentOnList());

        ResidentLedgerPage residentProfile = new ResidentLedgerPage(driver);
        assertTrue("Failed to click on Add button", residentProfile.clickAddDropdownButton());
        assertTrue("Failed to select Add Payment", residentProfile.clickOnAddPayment());
        assertTrue("Failed to see 'Payment Type' field", residentProfile.paymentTypeIsVisible());
        assertTrue("Failed to see 'Payment Code' field", residentProfile.paymentCodeIsVisible());
        assertTrue("Failed to see 'Amount' field", residentProfile.amountIsVisible());
        assertTrue("Failed to add amount to Amount field.", residentProfile.addAmount());
        assertTrue("Failed to see 'Check Number' field.", residentProfile.checkNumberIsVisible());
        assertTrue("Failed to see 'Date Received' field", residentProfile.dateReceivedIsVisible());
        assertTrue("Failed to see 'Notes' field", residentProfile.notesIsVisible());
        assertTrue("Failed to see 'Apply this payment to the following charges:' in right pane.", residentProfile.allocationForCharges());

    }
}

