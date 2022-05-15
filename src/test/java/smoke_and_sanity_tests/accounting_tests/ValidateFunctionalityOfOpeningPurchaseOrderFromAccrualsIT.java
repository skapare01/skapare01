package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.JournalEntriesPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfOpeningPurchaseOrderFromAccrualsIT extends BaseBrowserTest {

    public ValidateFunctionalityOfOpeningPurchaseOrderFromAccrualsIT() {
        super("avantic");
    }

    @Test
    public void shouldOpenPurchaseOrder_whenAccessedFromAccruals() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        JournalEntriesPage jePage = new JournalEntriesPage(driver);


        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the journal entries selection in the account tab dropdown", nav.selectJournalEntriesSubTab());
        assertTrue("Could not verify that the journal entries table was visible", jePage.verifyJournalEntriesTable());
        assertTrue("Could not close the filters modal", jePage.closeFiltersModal());
        assertTrue("Could not find the tools icon in the side menu", jePage.hoverToolsButton());
        assertTrue("Could not find the accruals tool menu item", jePage.clickAccrualsMenuItem());
        assertTrue("Could not find the continue button on the accruals popup", jePage.clickAccrualsContinueButton());
        assertTrue("Could not find the purchase order records table", jePage.verifyPurchaseOrderRecordsTable());
        assertTrue("Could not find the first line item in the purchase order records table", jePage.clickFirstLineItemInPurchaseOrderRecordsTable());
        assertTrue("Could not find the purchase order information panel", jePage.verifyPurchaseOrderInformationPanel());
    }
}
