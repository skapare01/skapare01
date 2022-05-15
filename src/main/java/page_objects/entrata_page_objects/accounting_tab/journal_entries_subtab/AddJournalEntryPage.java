package page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddJournalEntryPage extends BasePage {

    private final By CREDIT_AMOUNT_FIELD = By.id("credit_amount_1");
    private final By CREDIT_DESCRIPTION_FIELD = By.id("gl_detail_memo_1");
    private final By ACCOUNT_1_DROPDOWN_SELECTION = By.id("268830_0");
    private final By ACCOUNT_1_DROPDOWN = By.id("selected_gl_account_0");
    private final By ACCOUNT_2_DROPDOWN_SELECTION = By.id("268841_1");
    private final By ACCOUNT_2_DROPDOWN = By.xpath("//*[@id=\"selected_gl_account_1\"]/i");
    private final By DEBIT_AMOUNT_FIELD = By.id("debit_amount_0");
    private final By DEBIT_DESCRIPTION_FIELD = By.id("gl_detail_memo_0");
    private final By PROPERTY_DROPDOWN_SELECTION = By.cssSelector("a[class='ui-corner-all']");
    private final By PROPERTY_DROPDOWN = By.xpath("//*[@id=\"fast_lookup_property_id\"]/div/i");
    private final By REFERENCE_TEXT_FIELD = By.id("reference");
    private final By POST_JOURNAL_ENTRY_BUTTON = By.id("btn_add_gl_entry_skip_print");
    private final By CLOSE_ADD_JOURNAL_ENTRY_CURTAIN_BUTTON = By.cssSelector("i[class='close-button close']");

    public AddJournalEntryPage(WebDriver driver) {
        super(driver);
    }

    public boolean enterCreditAmount(String num) {
        return sendKeysToElement(CREDIT_AMOUNT_FIELD, num);
    }

    public boolean enterCreditDescriptionText() {
        return sendKeysToElement(CREDIT_DESCRIPTION_FIELD, "automatedCredit");
    }

    public boolean clickAccount1DropdownSelection() {
        return clickElement(ACCOUNT_1_DROPDOWN_SELECTION);
    }

    public boolean clickAccount1Dropdown() {
        return clickElement(ACCOUNT_1_DROPDOWN);
    }

    public boolean clickAccount2DropdownSelection() {
        return clickElement(ACCOUNT_2_DROPDOWN_SELECTION);
    }

    public boolean clickAccount2Dropdown() {
        return clickElement(ACCOUNT_2_DROPDOWN);
    }

    public boolean enterDebitAmount(String num) {
        return sendKeysToElement(DEBIT_AMOUNT_FIELD, num);
    }

    public boolean enterDebitDescriptionText () {
        return sendKeysToElement(DEBIT_DESCRIPTION_FIELD, "automatedDebit");
    }

    public boolean clickPropertyDropdownSelection() {
        return clickElement(PROPERTY_DROPDOWN_SELECTION);
    }

    public boolean clickPropertyDropdown() {
        return clickElement(PROPERTY_DROPDOWN);
    }

    public boolean addReferenceText() {
        return sendKeysToElement(REFERENCE_TEXT_FIELD, "automationTest");
    }

    public boolean verifyAddJournalEntryCurtain() {
        return confirmElementIsVisible(REFERENCE_TEXT_FIELD);
    }

    public boolean clickPostJE() {
        return clickElement(POST_JOURNAL_ENTRY_BUTTON);
    }

    public boolean closeAddJournalEntryCurtain() {
        return clickElement(CLOSE_ADD_JOURNAL_ENTRY_CURTAIN_BUTTON);
    }

}
