package regression_tests.ar_lease_financials_regression_tests.ar_ledgers_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerAddCreditModal;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerPage;

import static org.junit.Assert.assertTrue;

public class ResidentLedgerAddCreditIT extends BaseBrowserTest {

    public ResidentLedgerAddCreditIT() {
        super("avantic");
    }

    @Test //Test Case ID: 2226617
    public void shouldAddCredit_whenCurrentResidentSelected() {
        String chargeCode = "Accelerated Rent";
        String creditAmount = "50.00";
        String noteText = "Test Note=#2226617%";
        String memoText = "Test Note=#2226617%";

        //Open up current resident page
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to navigate to Residents Tab.", navBar.clickResidentsTab());
        AllResidentsPage allResidents = new AllResidentsPage(driver);
        assertTrue("Failed to click on Resident Filter.", allResidents.clickResidentFilter());
        AllResidentFilterPage allResFilter = new AllResidentFilterPage(driver);
        assertTrue("Failed to click on Filter By Current Status.", allResFilter.filterByCurrentStatus());
        assertTrue("Failed to click on Current Status.", allResFilter.clickCurrentStatus());
        assertTrue("Failed to click on Filter Residents.", allResFilter.clickFilterResidents());
        assertTrue("Failed to click on First Resident in list.", allResidents.clickFirstResidentOnList());
        //Add credit on resident ledger
        ResidentLedgerPage resLedger = new ResidentLedgerPage(driver);
        assertTrue("Failed to click on Add Dropdown.", resLedger.clickAddDropdownButton());
        assertTrue("Failed to click on Add Credit.", resLedger.clickAddCredit());
        ResidentLedgerAddCreditModal addCredit = new ResidentLedgerAddCreditModal(driver);
        assertTrue("Failed to enter Charge Code into Charge Code Field.", addCredit.enterChargeCodeIntoChargeCodeField(chargeCode));
        assertTrue("Failed to select Charge Code", addCredit.selectFirstCodeFromSearchResult());
        assertTrue("Failed to double click on Amount Field.", addCredit.doubleClickAmountField());
        assertTrue("Failed to enter credit value into Amount Field.", addCredit.enterAmount(creditAmount));
        //TODO AR Financials releasing updated tax field as part of new amount field layout after end of April 2022 - update once released
        //assertTrue("Failed to see Charge Tax Field.", addCredit.chargeTaxIsVisible());
        assertTrue("Failed to see Credit Date Picker Button.", addCredit.creditDatePickerIsVisible());
        assertTrue("Failed to see Post Month Field.", addCredit.postMonthFieldIsVisible());
        assertTrue("Failed to enter Notes.", addCredit.enterNotes(noteText));
        assertTrue("Failed to enter Internal Memo.", addCredit.enterInternalMemo(memoText));
        assertTrue("Failed to see Manage Files Button.", addCredit.manageFilesButtonIsVisible());
        assertTrue("Failed to see Auto Allocate Toggle.", addCredit.autoAllocateToggleIsVisible());
        assertTrue("Failed to click Add Credit Button", addCredit.clickAddCreditButton());
        //Confirm credit was added
        assertTrue("Failed to see Credit Success message.", resLedger.creditSuccessAlertIsVisible());
        assertTrue("Failed to click Full Ledger Button.", resLedger.clickFullLedgerButton());
        assertTrue("Failed to see Transaction Entry in Ledger.", resLedger.transactionEntryIsVisible(chargeCode, noteText));
    }
}
