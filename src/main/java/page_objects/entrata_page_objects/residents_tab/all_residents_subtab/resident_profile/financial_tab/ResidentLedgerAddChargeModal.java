package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentLedgerAddChargeModal extends BasePage {

    //Add Charge Modal Locators
    private final By CHARGE_CODE_FIELD = By.cssSelector("input[id^='ar_code_search']");
    private final By CHARGE_CODE_FIRST_SEARCH_RESULT = By.cssSelector(".form-search-combobox.charge-code li:nth-of-type(2) a");
    private final By AMOUNT_FIELD = By.id("transaction_amount");
    private final By CHARGE_TAX = By.id("charge_tax");
    private final By CHARGE_DATE_PICKER = By.cssSelector("button[class^='ui-datepicker-trigger']");
    private final By POST_MONTH_FIELD = By.id("charge_ar_transaction[post_month]");
    private final By AUTO_ALLOCATE_TOGGLE = By.cssSelector("div[class^='onoff slim']");
    private final By NOTES_TEXT_AREA = By.id("memo");
    private final By INTERNAL_MEMO_TEXT_AREA = By.id("internal_memo");
    private final By ADD_CHARGE_BUTTON = By.cssSelector("input[value='Add Charge']");
    private final By CANCEL_BUTTON = By.linkText("Cancel");

    public ResidentLedgerAddChargeModal(WebDriver driver) {
        super(driver);
    }
    //Add Charge Modal Methods
    public boolean enterChargeCodeIntoChargeCodeField(String chargeCode) {
        return sendKeysToElement(CHARGE_CODE_FIELD, chargeCode);
    }
    public boolean selectFirstCodeFromSearchResult() {
        return clickElement(CHARGE_CODE_FIRST_SEARCH_RESULT);
    }
    public boolean amountFieldIsVisible(){return confirmElementIsVisible(AMOUNT_FIELD);}
    public boolean doubleClickAmountField() {
        return doubleClickElement(AMOUNT_FIELD);
    }
    public boolean enterAmount(String chargeAmount) {
        return sendKeysToElement(AMOUNT_FIELD,chargeAmount);
    }
    public boolean chargeTaxIsVisible() {
        return confirmElementIsVisible(CHARGE_TAX);
    }
    public boolean chargeDatePickerIsVisible() {
        return confirmElementIsVisible(CHARGE_DATE_PICKER);
    }
    public boolean postMonthIsVisible() {
        return confirmElementIsVisible(POST_MONTH_FIELD);
    }
    public boolean autoAllocateIsVisible() {
        return confirmElementIsVisible(AUTO_ALLOCATE_TOGGLE);
    }
    public boolean enterNotes(String noteText) {
        return sendKeysToElement(NOTES_TEXT_AREA, noteText);
    }
    public boolean enterInternalMemo(String memoText) {
        return sendKeysToElement(INTERNAL_MEMO_TEXT_AREA, memoText);
    }
    public boolean clickAddChargeButton() {
        return clickElement(ADD_CHARGE_BUTTON);
    }
    public boolean clickCancel(){return clickElement(CANCEL_BUTTON);}

}
