package regression_tests.accounting_suite_tests.add_journal_entry_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.AddJournalEntryPage;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.JournalEntriesPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfReverseJournalEntryIT extends BaseBrowserTest {

    public ValidateFunctionalityOfReverseJournalEntryIT() {
        super("avantic");
    }

    @Test
    public void reverseGeneralLedgerJournalEntry() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the journal entries selection in the account tab dropdown", nav.selectJournalEntriesSubTab());

        JournalEntriesPage jePage = new JournalEntriesPage(driver);
        assertTrue("Could not close the filters modal", jePage.closeFiltersModal());
        assertTrue("Could not click on Add Journal Entry", jePage.clickAddJEButton());

        AddJournalEntryPage addJournalEntryPage = new AddJournalEntryPage(driver);
        assertTrue("Could not click property dropdown.", addJournalEntryPage.clickPropertyDropdown());
        assertTrue("Could not select a property from the dropdown.", addJournalEntryPage.clickPropertyDropdownSelection());
        assertTrue("Could not click dropdown for account 1.", addJournalEntryPage.clickAccount1Dropdown());
        assertTrue("Could not select dropdown option for account 1.", addJournalEntryPage.clickAccount1DropdownSelection());
        assertTrue("Could not input credit amount.", addJournalEntryPage.enterCreditAmount("550"));
        assertTrue("Could not click dropdown for account 2.", addJournalEntryPage.clickAccount2Dropdown());
        assertTrue("Could not select option from account 2.", addJournalEntryPage.clickAccount2DropdownSelection());
        assertTrue("Could not input debit amount.", addJournalEntryPage.enterDebitAmount("550"));
        assertTrue("Could not click 'Post JE' button.", addJournalEntryPage.clickPostJE());
        assertTrue("Could not click on a journal entry line item", jePage.clickJELineItem());
        assertTrue("Could not click on the reverse journal entry button", jePage.clickReverseJE());
        assertTrue("Could not find the reverse journal entry memo field", jePage.enterReverseJEMemo("Test Memo"));
        assertTrue("Could not find the reverse journal entry memo page button", jePage.clickReverseJEPopupButton());
        assertTrue("Could not find the reverse journal entry confirmation button", jePage.clickReverseJEConfirmButton());
        assertTrue("Could not find the success message", jePage.checkForSuccessMessage());
    }
}
