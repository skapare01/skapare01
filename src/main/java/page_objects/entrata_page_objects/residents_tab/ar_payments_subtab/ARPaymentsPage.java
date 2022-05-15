package page_objects.entrata_page_objects.residents_tab.ar_payments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ARPaymentsPage extends BasePage {
    public ARPaymentsPage(WebDriver driver) {
        super(driver);
    }
    //Variables

    private final By TOOLS_SIDE_MENU_LOCATOR = By.xpath("//*[@id=\"div-listing-container\"]/span/div/ul/li[3]/a/span[1]/i");
    private final By ADD_PAYMENT_OPTION_LOCATOR = By.xpath("//*[@id=\"view-data-tools-menu\"]/ul/li[1]/a");
    private final By PROPERTY_DROPDOWN_LIST_LOCATOR = By.id("ar_payment_property");
    private final By SELECT_PROPERTY_LOCATOR = By.id("ar_payment_property");
    private final By ADD_RESIDENT_TO_SEARCH = By.id("fastSearch_add_payments");
    private final By CHOOSE_RESIDENT_LOCATOR = By.cssSelector("td[style='overflow:hidden; ']");
    private final By PAYMENT_CODE_LOCATOR = By.xpath("//*[@id=\"check_number_dialog\"]/dd/input");
    private final By PAYMENT_TYPE_LOCATOR = By.id("payment_type");
    private final By AMOUNT_LOCATOR = By.id("transaction_amount");
    private final By CHECK_NUMBER_LOCATOR = By.name("ar_payment[check_number]");
    private final By DATE_RECEIVED = By.cssSelector("input[class='bindedi18n pickerReplaced form-date datepicker wide2 js-add-payment-make-date_readonly hasDatepicker binded']");
    private final By POST_MONTH = By.id("post_month");
    private final By NOTES_LOCATOR = By.id("memo");
    private final By INTERNAL_MEMO = By.id("internal_memo");
    private final By ADD_PAYMENT_BUTTON = By.cssSelector("input[class='form-submit']");
    private final By CANCEL_BUTTON = By.cssSelector("a[onclick*='close']");
    private final By CLOSE_POPUP_LOCATOR = By.cssSelector("button[title='Close']");
    private final By ADD_BULK_PAYMENTS = By.cssSelector("a[title = 'Add Bulk Payments']");

    //Methods

    public boolean navigateToToolsSideMenu() { return clickElement(TOOLS_SIDE_MENU_LOCATOR, waitTimes.DEFAULT_WAIT); }
    public boolean navigateToAddSinglePaymentOption() { return clickElement(ADD_PAYMENT_OPTION_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean clickOnPropertyDropDown() { return clickElement(PROPERTY_DROPDOWN_LIST_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean selectProperty(String value) { return selectElementByValue(SELECT_PROPERTY_LOCATOR, value, waitTimes.DEFAULT_WAIT);}
    public boolean addResidentSearch(String value) { return sendKeysToElement(ADD_RESIDENT_TO_SEARCH, value, waitTimes.DEFAULT_WAIT);}
    public boolean clickOnResident() { return clickElement(CHOOSE_RESIDENT_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean paymentCodeIsVisible() { return confirmElementIsVisible(PAYMENT_CODE_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean paymentTypeIsVisible() { return confirmElementIsVisible(PAYMENT_TYPE_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean amountFieldIsVisible() { return confirmElementIsVisible(AMOUNT_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean checkNumberFieldIsVisible() {return confirmElementIsVisible(CHECK_NUMBER_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean dateReceivedIsVisible() { return confirmElementIsVisible(DATE_RECEIVED);}
    public boolean postMonthIsVisible() { return confirmElementIsVisible(POST_MONTH);}
    public boolean notesFieldIsVisible() { return confirmElementIsVisible(NOTES_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean internalMemoIsVisible() { return confirmElementIsVisible(INTERNAL_MEMO);}
    public boolean addPaymentButtonIsVisible() { return confirmElementIsVisible(ADD_PAYMENT_BUTTON);}
    public boolean cancelButtonIsVisible() { return confirmElementIsVisible(CANCEL_BUTTON);}
    public boolean closePopup() { return clickElement(CLOSE_POPUP_LOCATOR, waitTimes.DEFAULT_WAIT);}
    public boolean clickAddBulkPayments(){return clickElement(ADD_BULK_PAYMENTS);}

}
