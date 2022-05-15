package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.AddJournalEntryPage;
import page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab.JournalEntriesPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddJournalEntryIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddJournalEntryIT() {
        super("avantic");
    }

    @Test
    public void shouldAddGeneralLedgerJournalEntry_whenAddJournalEntryFormIsCompleted() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        JournalEntriesPage jePage = new JournalEntriesPage(driver);
        AddJournalEntryPage addJePage = new AddJournalEntryPage(driver);

        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the journal entries selection in the account tab dropdown", nav.selectJournalEntriesSubTab());
        assertTrue("Could not close the filters modal", jePage.closeFiltersModal());
        assertTrue("Could not find the add JE button", jePage.clickAddJEButton());
        assertTrue("Could not find the reference text field", addJePage.addReferenceText());
        assertTrue("Could not find the property dropdown", addJePage.clickPropertyDropdown());
        assertTrue("Could not find the selection in the property dropdown", addJePage.clickPropertyDropdownSelection());
        assertTrue("Could not find the account dropdown", addJePage.clickAccount1Dropdown());
        assertTrue("Could not find the selection in the account dropdown", addJePage.clickAccount1DropdownSelection());
        assertTrue("Could not find the debit description text field", addJePage.enterDebitDescriptionText());
        assertTrue("Could not find the debit amount field", addJePage.enterDebitAmount("550"));
        assertTrue("Could not find the account dropdown", addJePage.clickAccount2Dropdown());
        assertTrue("Could not find the selection in the account dropdown", addJePage.clickAccount2DropdownSelection());
        assertTrue("Could not find the credit description text field", addJePage.enterCreditDescriptionText());
        assertTrue("Could not find the credit amount field", addJePage.enterCreditAmount("550"));
        assertTrue("Could not find the post JE button", addJePage.clickPostJE());
        assertTrue("Could not find the success message", jePage.checkForSuccessMessage());
    }
}
