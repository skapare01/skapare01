package page_objects.entrata_page_objects.accounting_tab.invoices_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InvoicesListingScreenPage extends BasePage {

    public InvoicesListingScreenPage(WebDriver driver) { super (driver);}

    private final By INVOICES_LIST = By.cssSelector("tr[class='aRow js-load-invoice-details']");
    private final By RANDOM_INVOICE = By.cssSelector("tr[class='aRow js-load-invoice-details']");
    private final By RANDOM_INVOICE_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By INVOICES_FILTER_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By ADD_INVOICE_BUTTON = By.cssSelector("i[class='flat-add transition']");
    private final By TOOL_MENU_BUTTON = By.cssSelector("a[class='js-launch-vertical-toolbar']");
    private final By TOOL_INVOICE_TEMPLATES = By.xpath("//*[text()='Invoice Templates']");
    private final By TOOL_BULK_INVOICE_ENTRY = By.xpath("//*[text()='Bulk Invoice Entry']");
    private final By TOOL_CONTINUE_PAUSED_BULK_ENTRIES = By.xpath("//*[text()='Continue Paused Bulk Entries']");
    private final By TOOL_IMPORT_INVOICES = By.xpath("//*[text()='Import Invoices']");
    private final By TOOL_APPROVE_POST_INVOICES = By.xpath("//*[text()='Approve/Post Invoices']");
    private final By TOOL_APPROVE_FOR_PAYMENT = By.xpath("//*[text()='Approve For Payment']");
    private final By TOOL_INTER_CO_REIMBURSEMENTS = By.xpath("//*[text()='Inter-co Reimbursements']");
    private final By TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_BUTTON = By.cssSelector("a[class='js-launch-add']");
    private final By TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By TOOL_INVOICE_TEMPLATES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_CONTAINER = By.id("add_edit_invoice_template");
    private final By TOOL_INVOICE_TEMPLATES_CONTAINER = By.id("main_invoice_template_container");
    private final By TOOL_BULK_INVOICE_ENTRY_ADD_INVOICE_BATCH_CANCEL_BUTTON = By.id("btn_cancel");
    private final By TOOL_BULK_INVOICE_ENTRY_ADD_INVOICE_BATCH_CANCEL_BUTTON_CONFIRMATION_CONTINUE_BUTTON = By.id("continue_btn");
    private final By TOOL_CONTINUE_PAUSED_BULK_ENTRIES_CONTAINER = By.id("frm_paused_bulk_entries");
    private final By TOOL_CONTINUE_PAUSED_BULK_ENTRIES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_IMPORT_INVOICES_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By TOOL_APPROVE_POST_INVOICES_CONTAINER = By.id("pending_invoice_list_container");
    private final By TOOL_APPROVE_POST_INVOICES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_APPROVE_FOR_PAYMENT_CONTAINER = By.id("overlay_modal");
    private final By TOOL_APPROVE_FOR_PAYMENT_CANCEL_BUTTON = By.id("idCancel");
    private final By TOOL_INTER_CO_REIMBURSEMENTS_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");


    public boolean ClickCloseVendorFilterButton(){return clickElement(INVOICES_FILTER_CLOSE_BUTTON);}
    public boolean ClickCloseInvoiceFilterButton(){return clickElement(INVOICES_FILTER_CLOSE_BUTTON);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenFirstInvoice() {return confirmElementIsVisible(INVOICES_LIST);}
    public boolean ClickRandomInvoice() {return clickElement(RANDOM_INVOICE);}
    public boolean ClickRandomInvoiceCloseButton() {return clickElement(RANDOM_INVOICE_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenAddInvoiceButton(){return clickElement(ADD_INVOICE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolMenu() {return clickElement(TOOL_MENU_BUTTON);}
    public boolean ClickInvoiceListingScreenToolInvoiceTemplates() {return clickElement(TOOL_INVOICE_TEMPLATES, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenToolInvoiceTemplatesContainer() {return confirmElementIsVisible(TOOL_INVOICE_TEMPLATES_CONTAINER);}
    public boolean ClickInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplates() {return clickElement(TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_BUTTON);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplatesContainer() {return confirmElementIsVisible(TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_CONTAINER);}
    public boolean ClickInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplatesCloseButton() {return clickElement(TOOL_INVOICE_TEMPLATES_ADD_INVOICE_TEMPLATE_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolInvoiceTemplatesCloseButton() {return clickElement(TOOL_INVOICE_TEMPLATES_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolBulkInvoiceEntry() {return clickElement(TOOL_BULK_INVOICE_ENTRY, waitTimes.LONG_WAIT);}
    public boolean ClickInvoiceListingScreenToolBulkInvoiceEntryAddInvoiceBatchCancelButton() {return clickElement(TOOL_BULK_INVOICE_ENTRY_ADD_INVOICE_BATCH_CANCEL_BUTTON);}
    public boolean ClickInvoiceListingScreenToolBulkInvoiceEntryAddInvoiceBatchCancelButtonConfirmationContinueButton() {return clickElement(TOOL_BULK_INVOICE_ENTRY_ADD_INVOICE_BATCH_CANCEL_BUTTON_CONFIRMATION_CONTINUE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolPausedBulkEntries() {return clickElement(TOOL_CONTINUE_PAUSED_BULK_ENTRIES);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenToolPausedBulkEntriesContainer() {return confirmElementIsVisible(TOOL_CONTINUE_PAUSED_BULK_ENTRIES_CONTAINER);}
    public boolean ClickInvoiceListingScreenToolPausedBulkEntriesCloseButton() {return clickElement(TOOL_CONTINUE_PAUSED_BULK_ENTRIES_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolImportInvoices() {return clickElement(TOOL_IMPORT_INVOICES, waitTimes.LONG_WAIT);}
    public boolean ClickInvoiceListingScreenToolImportInvoicesCloseButton() {return clickElement(TOOL_IMPORT_INVOICES_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolApprovePostInvoices() {return clickElement(TOOL_APPROVE_POST_INVOICES,waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfClickInvoiceListingScreenToolApprovePostInvoicesContainer() {return confirmElementIsVisible(TOOL_APPROVE_POST_INVOICES_CONTAINER);}
    public boolean ClickInvoiceListingScreenToolApprovePostInvoicesCloseButton() {return clickElement(TOOL_APPROVE_POST_INVOICES_CLOSE_BUTTON);}
    public boolean ClickInvoiceListingScreenToolApproveForPayment() {return clickElement(TOOL_APPROVE_FOR_PAYMENT, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenToolApproveForPaymentContainer() {return confirmElementIsVisible(TOOL_APPROVE_FOR_PAYMENT_CONTAINER);}
    public boolean ClickInvoiceListingScreenToolApproveForPaymentCloseButton() {return clickElement(TOOL_APPROVE_FOR_PAYMENT_CANCEL_BUTTON);}
    public boolean ClickInvoiceListingScreenToolInterCoReimbursements() {return clickElement(TOOL_INTER_CO_REIMBURSEMENTS);}
    public boolean ClickInvoiceListingScreenToolInterCoReimbursementsCloseButton() {return clickElement(TOOL_INTER_CO_REIMBURSEMENTS_CLOSE_BUTTON);}
}
