package regression_tests.ar_lease_financials_regression_tests.ar_ledgers_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerAddChargeModal;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.ResidentLedgerPage;

import static org.junit.Assert.assertTrue;

public class ResidentLedgerAddChargeIT extends BaseBrowserTest {

    public ResidentLedgerAddChargeIT() {
        super("arentrataandcommercials");
    }

    @Test //Test case ID: 2247213
    public void shouldAddCharge_whenCurrentResidentSelected() {
        String baseRentCode = "Base Rent";
        String chargeAmount = "30.00";
        String noteText = "Test Note=#2247213%";
        String memoText = "Test Note=#2247213%";

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
        //Add charge on resident ledger
        ResidentLedgerPage resLedger = new ResidentLedgerPage(driver);
        assertTrue("Failed to click on Add Dropdown.", resLedger.clickAddDropdownButton());
        assertTrue("Failed to click on Add Charge.", resLedger.clickAddCharge());
        ResidentLedgerAddChargeModal addCharge = new ResidentLedgerAddChargeModal(driver);
        assertTrue("Failed to enter Charge Code into Charge Code Field.", addCharge.enterChargeCodeIntoChargeCodeField(baseRentCode));
        assertTrue("Failed to select Charge Code.", addCharge.selectFirstCodeFromSearchResult());
        assertTrue("Failed to double click on Amount Field.", addCharge.doubleClickAmountField());
        assertTrue("Failed to add charge value in Amount Field.", addCharge.enterAmount(chargeAmount));
        //TODO AR Financials releasing updated tax field as part of new amount field layout after end of April 2022 - update once released
        //assertTrue("Failed to see Charge Tax details.", addCharge.chargeTaxIsVisible());
        assertTrue("Failed to see Charge Date Picker.", addCharge.chargeDatePickerIsVisible());
        assertTrue("Failed to see Post Month field.", addCharge.postMonthIsVisible());
        assertTrue("Failed to see Auto Allocate toggle.", addCharge.autoAllocateIsVisible());
        assertTrue("Failed to enter Notes.", addCharge.enterNotes(noteText));
        assertTrue("Failed to enter Internal Memo.", addCharge.enterInternalMemo(memoText));
        assertTrue("Failed to click on Submit button.", addCharge.clickAddChargeButton());
        //Verify charge was created
        assertTrue("Failed to see Charge Success Alert.", resLedger.chargeSuccessAlertIsVisible());
        assertTrue("Failed to see Transaction Entry in Ledger.", resLedger.transactionEntryIsVisible(baseRentCode, noteText));

    }

}
