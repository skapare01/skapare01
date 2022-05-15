package regression_tests.accounting_suite_tests.add_journal_entry_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.JournalEntriesPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfEditJournalEntriesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfEditJournalEntriesIT() {
        super("avantic");
    }

    @Test
    public void editGeneralLedgerJournalEntry() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        JournalEntriesPage jePage = new JournalEntriesPage(driver);

        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the journal entries selection in the account tab dropdown", nav.selectJournalEntriesSubTab());
        assertTrue("Could not close the filters modal", jePage.closeFiltersModal());
        assertTrue("Could not click on a journal entry line item", jePage.clickJELineItem());
        assertTrue("Could not find the more actions button", jePage.clickMoreActionsButton());
        assertTrue("Could not click on the edit journal entry list item", jePage.clickEditJEListItem());
        assertTrue("Could not find the save button", jePage.clickEditJESaveButton());
        assertTrue("Could not find the success message", jePage.checkForSuccessMessage());
    }
}
