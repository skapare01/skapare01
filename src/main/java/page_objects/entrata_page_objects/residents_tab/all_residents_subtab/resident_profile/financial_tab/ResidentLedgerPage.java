package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentLedgerPage extends BasePage {
    //Variables
    private final By ADD_DROPDOWN_BUTTON = By.className("dropdown-toggle");
    private final By ADD_CHARGE = By.linkText("Add Charge");
    private final By ADD_CREDIT = By.linkText("Add Credit");
    private final By ADD_PAYMENT = By.linkText("Add Payment");
    private final By ADD_PAYMENT_LIST_OPTION = By.xpath("//*[contains(text(), 'Add Payment')]");
    private final By PAYMENT_TYPE = By.id("payment_type");
    private final By PAYMENT_CODE = By.xpath("//*[contains(text(), 'Payment Code')]");
    private final By AMOUNT = By.id("transaction_amount");
    private final By CHECK_NUMBER = By.id("ar_payment_check_number");
    private final By DATE_RECEIVED = By.className("req");
    private final By NOTES = By.name("ar_payment[payment_memo]");
    private final By ALLOCATION_FOR_CHARGES = By.xpath("//*[contains(text(), 'Apply this payment to the following charges:')]");
    private final By RECURRING_PAYMENT_LINK = By.id("scheduled_payments");
    private final By ADD_RECURRING_PAYMENT = By.cssSelector("a[class='button action right']");
    private final By CHARGE_SUCCESS_ALERT = By.xpath("//p[contains(text(), 'Charge added successfully.')]");
    private final By CREDIT_SUCCESS_ALERT = By.xpath("//p[contains(text(), 'Concession added successfully.')]");
    private final By FULL_LEDGER_BUTTON = By.cssSelector("label[for='full_ledger']");
    private final By LOADING_OVERLAY_LOCATOR_IN_RESIDENT_LEDGER = By.cssSelector("div.loading-overlay.bg-img-medium");

    //Constructor Method
    public ResidentLedgerPage(WebDriver driver) {
        super(driver);
    }

    //Page Methods
    public boolean clickAddDropdownButton() {
        return clickElement(ADD_DROPDOWN_BUTTON, waitTimes.LONG_WAIT);
    }
    public boolean clickAddCharge(){
        return clickElement(ADD_CHARGE, waitTimes.LONG_WAIT);
    }
    public boolean clickAddPayment(){
        return clickElement(ADD_PAYMENT, waitTimes.LONG_WAIT);
    }
    public boolean clickAddCredit(){
        return clickElement(ADD_CREDIT, waitTimes.LONG_WAIT);
    }
    public boolean clickOnAddPayment() {
        return clickElement(ADD_PAYMENT_LIST_OPTION, waitTimes.LONG_WAIT);
    }
    public boolean paymentTypeIsVisible() {
        return confirmElementIsVisible(PAYMENT_TYPE, waitTimes.LONG_WAIT);
    }
    public boolean paymentCodeIsVisible() {
        return confirmElementIsVisible(PAYMENT_CODE, waitTimes.LONG_WAIT);
    }
    public boolean amountIsVisible() {
        return confirmElementIsVisible(AMOUNT, waitTimes.LONG_WAIT);
    }
    public boolean addAmount() {
        return sendKeysToElement(AMOUNT, "1.00", waitTimes.LONG_WAIT);
    }
    public boolean checkNumberIsVisible() {
        return confirmElementIsVisible(CHECK_NUMBER, waitTimes.LONG_WAIT);
    }
    public boolean dateReceivedIsVisible() {
        return confirmElementIsVisible(DATE_RECEIVED, waitTimes.LONG_WAIT);
    }
    public boolean notesIsVisible() {
        return confirmElementIsVisible(NOTES, waitTimes.LONG_WAIT);
    }
    public boolean allocationForCharges() {
        return confirmElementIsVisible(ALLOCATION_FOR_CHARGES, waitTimes.LONG_WAIT);
    }
    public boolean clickRecurringPaymentLink() {
        return clickElement(RECURRING_PAYMENT_LINK, waitTimes.LONG_WAIT);
    }
    public boolean clickAddPaymentForRecurring() {
        return clickElement(ADD_RECURRING_PAYMENT, waitTimes.LONG_WAIT);
    }
    public boolean chargeSuccessAlertIsVisible() {
        return confirmElementIsVisible(CHARGE_SUCCESS_ALERT, waitTimes.LONG_WAIT);
    }
    public boolean creditSuccessAlertIsVisible() {
        return confirmElementIsVisible(CREDIT_SUCCESS_ALERT, waitTimes.LONG_WAIT);
    }
    public boolean transactionEntryIsVisible(String chargeCode, String noteText) {
        return confirmElementIsVisible(By.linkText(chargeCode + " - " + noteText));
    }
    public boolean clickFullLedgerButton() {
        waitForResidentLedgerOverlay();
        return clickElement(FULL_LEDGER_BUTTON, waitTimes.LONG_WAIT);
    }
    //Overlay Method
    private void waitForResidentLedgerOverlay() {
        waitForOverlay(LOADING_OVERLAY_LOCATOR_IN_RESIDENT_LEDGER, waitTimes.SHORT_WAIT);
    }
}
