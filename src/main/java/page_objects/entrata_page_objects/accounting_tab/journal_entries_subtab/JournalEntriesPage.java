package page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class JournalEntriesPage extends BasePage {

    private final By JOURNAL_ENTRIES_TABLE = By.id("table-header");
    private final By FILTERS_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By ADD_JOURNAL_ENTRY_BUTTON = By.cssSelector("i[class='flat-add transition']");
    private final By JOURNAL_ENTRY_ADDED_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By JOURNAL_ENTRY_LINE_ITEM = By.cssSelector("td[class='align-right']");
    private final By JOURNAL_ENTRY_REVERSE_BUTTON = By.id("reverse_gl_entry");
    private final By REVERSE_JOURNAL_ENTRY_MEMO_FIELD = By.id("gl_header_memo");
    private final By REVERSE_JOURNAL_ENTRY_POPUP_BUTTON = By.id("reverse_je_popup");
    private final By REVERSE_JOURNAL_CONFIRMATION_BUTTON = By.id("continue_reverse_gl_entry_popup");
    private final By MORE_ACTIONS_BUTTON = By.id("js-more-actions");
    private final By EDIT_JOURNAL_ENTRY_LIST_ITEM = By.id("edit_je");
    private final By EDIT_JOURNAL_ENTRY_SAVE_BUTTON = By.id("btn_update_gl_entry");
    private final By SIDE_PANEL_TOOLS_ICON = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By JOURNAL_ENTRIES_TEMPLATES_MENU_ITEM = By.cssSelector("a[onclick*='Journal Entry Templates']");
    private final By JOURNAL_ENTRY_TEMPLATE_TABLE = By.id("scheduled_je_templates");
    private final By CLOSE_ADD_JOURNAL_ENTRY_TEMPLATES_CURTAIN_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By ACCRUALS_TOOL_MENU_ITEM = By.cssSelector("a[onclick*='Accruals']");
    private final By ACCRUALS_POPUP_CONTINUE_BUTTON = By.id("filter_accruals");
    private final By PURCHASE_ORDER_RECORDS_TABLE = By.id("js-po-records");
    private final By FIRST_PURCHASE_ORDER_TABLE_ENTRY = By.cssSelector("a[class='po-link']");
    private final By PURCHASE_ORDER_INFORMATION_PANEL = By.id("viewPoContent");
    private final By JOURNAL_ENTRY_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public JournalEntriesPage(WebDriver driver) {
        super (driver);
    }

    public boolean closeFiltersModal() {
        return clickElement(FILTERS_CLOSE_BUTTON);
    }

    public boolean clickAddJEButton() {
        return clickElement(ADD_JOURNAL_ENTRY_BUTTON);
    }

    public boolean checkForSuccessMessage() {
        return confirmElementIsVisible(JOURNAL_ENTRY_ADDED_SUCCESS_MESSAGE);
    }

    public boolean clickJELineItem() {
        waitForJournalEntryOverlay();
        return clickElement(JOURNAL_ENTRY_LINE_ITEM);
    }

    public boolean clickReverseJE() {
        return clickElement(JOURNAL_ENTRY_REVERSE_BUTTON);
    }

    public boolean enterReverseJEMemo(String name) {
        return sendKeysToElement(REVERSE_JOURNAL_ENTRY_MEMO_FIELD, name);
    }

    public boolean clickReverseJEPopupButton() {
        return clickElement(REVERSE_JOURNAL_ENTRY_POPUP_BUTTON);
    }

    public boolean clickReverseJEConfirmButton() {
        if(confirmElementIsVisible(REVERSE_JOURNAL_CONFIRMATION_BUTTON)) {
            return clickElement(REVERSE_JOURNAL_CONFIRMATION_BUTTON);
        }
        else {
            System.out.println("Reverse Journal Entry Confirmation Button did not appear. Moving on with test.");
            return true;
        }
    }

    public boolean clickMoreActionsButton() {
        return clickElement(MORE_ACTIONS_BUTTON);
    }

    public boolean clickEditJEListItem() {
        return clickElement(EDIT_JOURNAL_ENTRY_LIST_ITEM);
    }

    public boolean clickEditJESaveButton() {
        return clickElement(EDIT_JOURNAL_ENTRY_SAVE_BUTTON);
    }

    public boolean hoverToolsButton() {
        return moveToAnElementWithActions(SIDE_PANEL_TOOLS_ICON);
    }

    public boolean clickJournalEntriesTemplatesMenuItem() {
        return clickElement(JOURNAL_ENTRIES_TEMPLATES_MENU_ITEM, waitTimes.LONG_WAIT);
    }

    public boolean verifyJournalEntryTemplatesCurtain() {
        return confirmElementIsVisible(JOURNAL_ENTRY_TEMPLATE_TABLE);
    }

    public boolean closeJournalEntryTemplatesCurtain() {
        return clickElement(CLOSE_ADD_JOURNAL_ENTRY_TEMPLATES_CURTAIN_BUTTON);
    }

    public boolean verifyJournalEntriesTable() {
        return confirmElementIsVisible(JOURNAL_ENTRIES_TABLE);
    }

    public boolean clickAccrualsMenuItem() {
        return clickElement(ACCRUALS_TOOL_MENU_ITEM, waitTimes.LONG_WAIT);
    }

    public boolean clickAccrualsContinueButton() {
        return clickElement(ACCRUALS_POPUP_CONTINUE_BUTTON);
    }

    public boolean verifyPurchaseOrderRecordsTable() {
        return confirmElementIsVisible(PURCHASE_ORDER_RECORDS_TABLE);
    }

    public boolean clickFirstLineItemInPurchaseOrderRecordsTable() {
        return clickElement(FIRST_PURCHASE_ORDER_TABLE_ENTRY);
    }

    public boolean verifyPurchaseOrderInformationPanel() {
        return confirmElementIsVisible(PURCHASE_ORDER_INFORMATION_PANEL);
    }

    private void waitForJournalEntryOverlay() {
        waitForOverlay(JOURNAL_ENTRY_OVERLAY);
    }
}