package page_objects.entrata_page_objects.accounting_tab.ap_payments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class APPaymentsPage extends BasePage {

    public APPaymentsPage(WebDriver driver) { super (driver);}

    //AP Payments Listing Screen Tool menu items
    private final By TOOL_MENU = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By TOOL_REPRINT_CHECKS = By.xpath("//*[text()='Reprint Checks']");
    private final By TOOL_BULK_VOID_PAYMENTS = By.xpath("//*[text()='Bulk Void Payments']");
    private final By TOOL_POSITIVE_PAY_SCHEDULER = By.xpath("//*[text()='Positive Pay Scheduler']");
    private final By TOOL_POSITIVE_PAY = By.xpath("//*[text()='Positive Pay']");
    private final By TOOL_PAYMENT_FILES = By.xpath("//*[text()='Payment Files']");
    private final By TOOL_UNCLAIMED_PROPERTY = By.xpath("//*[text()='Unclaimed Property']");
    private final By TOOL_IMPORT_AP_PAYMENTS = By.xpath("//*[text()='Import AP Payments']");

    private final By CLOSE_AP_PAYMENTS_FILTER = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By PAYMENTS_LIST = By.id("tbl_ap_payments");
    private final By FINALIZE_PAYMENTS = By.cssSelector("i[class='flat-add transition']");
    private final By FINALIZE_PAYMENTS_FILTER_OVERLAY = By.cssSelector("div[class='filter-overlay']");
    private final By FINALIZE_PAYMENTS_CLOSE_BUTTON = By.cssSelector("i[class='close-button close finalizePaymentClose']");
    private final By TOOL_REPRINT_CHECKS_REPRINT_CHECKS_FORM_CANCEL_BUTTON = By.xpath("//*[@id='reprint_checks_frm']/div[8]/div/span/a");
    private final By TOOL_BULK_VOID_PAYMENTS_SEARCH_AP_PAYMENTS_SEARCH_PAYMENTS_BUTTON = By.id("search_ap_payments");
    private final By TOOL_BULK_VOID_PAYMENTS_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_POSITIVE_PAY_SCHEDULER_CONTAINER = By.cssSelector("table[class='sort clickable']");
    private final By TOOL_POSITIVE_PAY_SCHEDULER_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT = By.id("navigation_item_Add");
    private final By TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT_CONTAINER = By.cssSelector("form[name='create_ap_header_export_batch_frm']");
    private final By TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT_CLOSE_BUTTON = By.cssSelector("button[title='Close']");
    private final By TOOL_POSITIVE_PAY_CONTAINER = By.id("view_ar_header_batches");
    private final By TOOL_POSITIVE_POSITIVE_PAY_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_PAYMENT_FILES_CONTAINER = By.id("ach-files");
    private final By TOOL_PAYMENT_FILES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_UNCLAIMED_PROPERTY_CONTAINER = By.id("tbl_view_unclaimed");
    private final By TOOL_UNCLAIMED_PROPERTY_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_IMPORT_AP_PAYMENTS_IMPORT_AP_PAYMENTS_FORM_CONTAINER = By.id("import_ap_payments_frm");
    private final By TOOL_IMPORT_AP_PAYMENTS_IMPORT_AP_PAYMENTS_FORM_CLOSE_BUTTON = By.cssSelector("button[title='Close']");
    private final By FIRST_AP_PAYMENT = By.cssSelector("tr[class='aRow js-view-check']");
    private final By FIRST_AP_PAYMENT_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");

    public boolean ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton() {return clickElement(CLOSE_AP_PAYMENTS_FILTER);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenContainer() {return confirmElementIsVisible(PAYMENTS_LIST);}
    public boolean ClickAPPaymentsListingScreenFinalizePayments() {return clickElement(FINALIZE_PAYMENTS);}
    public boolean ClickAPPaymentsListingScreenFinalizePaymentsFilterOverlay() {return clickElement(FINALIZE_PAYMENTS_FILTER_OVERLAY);}
    public boolean ClickAPPaymentsListingScreenFinalizePaymentsCloseButton() {return clickElement(FINALIZE_PAYMENTS_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolMenu() {return clickElement(TOOL_MENU);}
    public boolean ClickAPPaymentsListingScreenToolReprintChecks() {return clickElement(TOOL_REPRINT_CHECKS,waitTimes.LONG_WAIT);}
    public boolean ClickAPPaymentsListingScreenToolReprintChecksReprintChecksFormCancelButton() {return clickElement(TOOL_REPRINT_CHECKS_REPRINT_CHECKS_FORM_CANCEL_BUTTON,waitTimes.LONG_WAIT);}
    public boolean ClickAPPaymentsListingScreenToolBulkVoidPayments() {return clickElement(TOOL_BULK_VOID_PAYMENTS, waitTimes.LONG_WAIT);}
    public boolean ClickAPPaymentsListingScreenToolBulkVoidPaymentsSearchAPPaymentsSearchPaymentsButton() {return clickElement(TOOL_BULK_VOID_PAYMENTS_SEARCH_AP_PAYMENTS_SEARCH_PAYMENTS_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolBulkVoidPaymentsCloseButton() {return clickElement(TOOL_BULK_VOID_PAYMENTS_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolPositivePayScheduler() {return clickElement(TOOL_POSITIVE_PAY_SCHEDULER);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePaySchedulerContainer() {return confirmElementIsVisible(TOOL_POSITIVE_PAY_SCHEDULER_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolPositivePaySchedulerCloseButton() {return clickElement(TOOL_POSITIVE_PAY_SCHEDULER_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolPositivePay() {return clickElement(TOOL_POSITIVE_PAY, waitTimes.UNREASONABLE_WAIT);}
    public boolean ClickAPPaymentsListingScreenToolPositivePayAddPositivePayExport() {return clickElement(TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePayAddPositivePayExportContainer() {return confirmElementIsVisible(TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolPositivePayAddPositivePayExportCloseButton() {return clickElement(TOOL_POSITIVE_PAY_ADD_POSITIVE_PAY_EXPORT_CLOSE_BUTTON);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePayContainer() {return confirmElementIsVisible(TOOL_POSITIVE_PAY_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolPositivePayCloseButton() {return clickElement(TOOL_POSITIVE_POSITIVE_PAY_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolPaymentFiles() {return clickElement(TOOL_PAYMENT_FILES, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolPaymentFilesContainer() {return confirmElementIsVisible(TOOL_PAYMENT_FILES_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolPaymentFilesCloseButton() {return clickElement(TOOL_PAYMENT_FILES_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolUnclaimedProperty() {return clickElement(TOOL_UNCLAIMED_PROPERTY, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolUnclaimedPropertyContainer() {return confirmElementIsVisible(TOOL_UNCLAIMED_PROPERTY_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolUnclaimedPropertyCloseButton() {return clickElement(TOOL_UNCLAIMED_PROPERTY_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenToolImportAPPayments() {return clickElement(TOOL_IMPORT_AP_PAYMENTS, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfAPPaymentsListingScreenToolImportAPPaymentsImportAPPaymentsFormContainer() {return confirmElementIsVisible(TOOL_IMPORT_AP_PAYMENTS_IMPORT_AP_PAYMENTS_FORM_CONTAINER);}
    public boolean ClickAPPaymentsListingScreenToolImportAPPaymentsImportAPPaymentsFormCloseButton() {return clickElement(TOOL_IMPORT_AP_PAYMENTS_IMPORT_AP_PAYMENTS_FORM_CLOSE_BUTTON);}
    public boolean ClickAPPaymentsListingScreenFirstAPPayment() {return clickElement(FIRST_AP_PAYMENT);}
    public boolean ClickAPPaymentsListingScreenFirstAPPaymentCloseButton() {return clickElement(FIRST_AP_PAYMENT_CLOSE_BUTTON);}
}
