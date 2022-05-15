package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentLedgerAddCreditModal extends BasePage {
    //Add Credit Modal Locators
    private final By CHARGE_CODE_FIELD = By.cssSelector(".charge-code-field");
    private final By CHARGE_CODE_FIRST_SEARCH_RESULT = By.cssSelector(".form-search-combobox.charge-code li:nth-of-type(2) a");
    private final By AMOUNT_FIELD = By.id("transaction_amount");
    private final By CHARGE_TAX = By.id("charge_tax");
    private final By CREDIT_DATE_PICKER = By.cssSelector("button[class^='ui-datepicker-trigger']");
    private final By POST_MONTH_FIELD = By.id("concession_ar_transaction[post_month]");
    private final By NOTES_TEXT_AREA = By.id("memo");
    private final By INTERNAL_MEMO_TEXT_AREA = By.id("internal_memo");
    private final By MANAGE_FILES_BUTTON = By.id("manage_files");
    private final By AUTO_ALLOCATE_TOGGLE = By.cssSelector("#credit-auto-allocate>span");
    private final By ADD_CREDIT_BUTTON = By.cssSelector("input[value=' Add Credit']");

    //Constructor Method
    public ResidentLedgerAddCreditModal(WebDriver driver) {
        super(driver);
    }

    //Add Credit Methods
    public boolean enterChargeCodeIntoChargeCodeField(String chargeCode) {
        return sendKeysToElement(CHARGE_CODE_FIELD, chargeCode, waitTimes.LONG_WAIT);
    }
    public boolean selectFirstCodeFromSearchResult() {
        return clickElement(CHARGE_CODE_FIRST_SEARCH_RESULT, waitTimes.LONG_WAIT);
    }
    public boolean amountFieldIsVisible() {
        return confirmElementIsVisible(AMOUNT_FIELD, waitTimes.LONG_WAIT);
    }
    public boolean doubleClickAmountField() {
        return doubleClickElement(AMOUNT_FIELD, waitTimes.LONG_WAIT);
    }
    public boolean enterAmount(String creditAmount) {
        return sendKeysToElement(AMOUNT_FIELD, creditAmount, waitTimes.LONG_WAIT);
    }
    public boolean chargeTaxIsVisible() {
        return confirmElementIsVisible(CHARGE_TAX, waitTimes.LONG_WAIT);
    }
    public boolean creditDatePickerIsVisible() {
        return confirmElementIsVisible(CREDIT_DATE_PICKER, waitTimes.LONG_WAIT);
    }
    public boolean postMonthFieldIsVisible() {
        return confirmElementIsVisible(POST_MONTH_FIELD, waitTimes.LONG_WAIT);
    }
    public boolean enterNotes(String noteText) {
        return sendKeysToElement(NOTES_TEXT_AREA, noteText, waitTimes.LONG_WAIT);
    }
    public boolean enterInternalMemo(String memoText) {
        return sendKeysToElement(INTERNAL_MEMO_TEXT_AREA, memoText, waitTimes.LONG_WAIT);
    }
    public boolean manageFilesButtonIsVisible() {
        return confirmElementIsVisible(MANAGE_FILES_BUTTON, waitTimes.LONG_WAIT);
    }
    public boolean autoAllocateToggleIsVisible() {
        return confirmElementIsVisible(AUTO_ALLOCATE_TOGGLE, waitTimes.LONG_WAIT);
    }
    public boolean clickAddCreditButton() {
        return clickElement(ADD_CREDIT_BUTTON, waitTimes.LONG_WAIT);
    }
}
