package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.ap_payments_subtab.APPaymentsPage;
import page_objects.entrata_page_objects.accounting_tab.invoices_subtab.AddInvoicesPage;
import page_objects.entrata_page_objects.accounting_tab.invoices_subtab.InvoicesListingScreenPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.AddPurchaseOrdersPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.PurchaseOrdersListingScreenPage;
import page_objects.entrata_page_objects.accounting_tab.reconciliations_subtab.ReconciliationsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.approvals_tab.ApprovalsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.accounts_payable_tab.TransactionsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.bank_accounts_tab.BankAccountsPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAccountingAccountsPayableModulesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAccountingAccountsPayableModulesIT() {
        super("karenbertelli");
    }

    @Test
    public void POListingAddPOSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click on Add Purchase Orders Button", testAddPurchaseOrders.clickAddPurchaseOrdersButton());
        assertTrue("Failed to confirm visibility of add purchase orders container", testAddPurchaseOrders.confirmVisibilityOfAddPurchaseOrdersPropertyDropdown());
        assertTrue("Failed to click on Add purchase orders close button", testAddPurchaseOrders.clickAddPurchaseOrdersCloseButton());
    }

    @Test
    public void POsToolTemplatesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders Listing Screen", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen menu button", testPOListingScreen.clickPurchaseOrdersListingScreenToolMenu());
        assertTrue("Failed to click the purchase orders listing screen menu templates", testPOListingScreen.clickPurchaseOrdersListingScreenToolPurchaseOrderTemplates());
        assertTrue("Failed to confirm visibility of the purchase orders listing screen menu purchase order templates list container", testPOListingScreen.confirmVisibilityOfPurchaseOrdersListingsScreenToolPurchaseOrdersTemplateListContainer());
        assertTrue("Failed to click the purchase orders listing screen menu templates close button", testPOListingScreen.clickPurchaseOrdersListingScreenToolPurchaseOrderTemplatesCloseButton());
    }

    @Test
    public void POsToolApprovePurchaseOrderSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen menu button", testPOListingScreen.clickPurchaseOrdersListingScreenToolMenu());
        assertTrue("Failed to click the purchase orders listing screen menu approve purchase orders", testPOListingScreen.clickPurchaseOrdersListingScreenToolApprovePurchaseOrders());
        assertTrue("Failed to confirm visibility of the purchase orders listing screen menu approve purchase orders list container", testPOListingScreen.confirmVisibilityOfPurchaseOrdersListingsScreenToolApprovePurchaseOrdersListContainer());
        assertTrue("Failed to click the purchase orders listing screen menu approve purchase orders close button", testPOListingScreen.clickPurchaseOrdersListingScreenToolApprovePurchaseOrdersCloseButton());
    }

    @Test
    public void POsToolReceiveItemsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen menu button", testPOListingScreen.clickPurchaseOrdersListingScreenToolMenu());
        assertTrue("Failed to click purchase orders listing screen menu receive items", testPOListingScreen.clickPurchaseOrdersListingScreenToolReceiveItems());
        assertTrue("Failed to confirm Visibility of Purchase Orders Listing Screen Menu Receive Items container", testPOListingScreen.confirmVisibilityOfPurchaseOrdersListingScreenToolReceiveItemsContainer());
        assertTrue("Failed to click purchase orders listing screen menu receive items close button", testPOListingScreen.clickPurchaseOrdersListingScreenToolReceiveItemsCloseButton());
    }

    @Test
    public void POsToolImportPOsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen menu button", testPOListingScreen.clickPurchaseOrdersListingScreenToolMenu());
        assertTrue("Failed to click the purchase order listing screen menu import purchase orders", testPOListingScreen.clickPurchaseOrdersListingScreenToolImportPurchaseOrders());
        assertTrue("Failed to confirm visibility of the purchase order listing screen menu import purchase orders container", testPOListingScreen.confirmVisibilityOfPurchaseOrdersListingScreenToolImportPurchaseOrdersContainer());
        assertTrue("Failed to click the purchase orders listing screen menu import purchase orders close button", testPOListingScreen.clickPurchaseOrdersListingScreenToolImportPurchaseOrdersCloseButton());
    }

    @Test
    public void POsRandomPOsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen Random purchase order", testPOListingScreen.clickPurchaseOrderListingScreenRandomPurchaseOrder());
        assertTrue("Failed to click the purchase orders listing screen Random Purchase Order close button", testPOListingScreen.clickPurchaseOrderListingScreenRandomPurchaseOrderCloseButton());
    }

    @Test
    public void RandomInvoiceSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to confirm visibility on the invoice listing first invoice", testInvoices.ConfirmVisibilityOfInvoiceListingScreenFirstInvoice());
        assertTrue("Failed to click on random invoice", testInvoices.ClickRandomInvoice());
        assertTrue("Failed to click on random invoice close button", testInvoices.ClickRandomInvoiceCloseButton());
    }

    @Test
    public void AddInvoiceSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);
        AddInvoicesPage testAddInvoices = new AddInvoicesPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the Invoice Listing Screen add Invoice button", testInvoices.ClickInvoiceListingScreenAddInvoiceButton());
        assertTrue("Failed to confirm the invoice listing screen add invoice containerR", testAddInvoices.confirmVisibilityOfInvoiceListingScreenAddInvoiceContainer());
        assertTrue("Failed to click the add invoice close button", testAddInvoices.clickInvoiceListingScreenAddInvoiceCloseButton());
    }

    @Test
    public void InvoiceTemplatesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the invoice listing screen tool Invoice Templates", testInvoices.ClickInvoiceListingScreenToolInvoiceTemplates());
        assertTrue("Failed to confirm visibility of the invoice listing screen tool menu Invoice Templates Container", testInvoices.ConfirmVisibilityOfInvoiceListingScreenToolInvoiceTemplatesContainer());
        assertTrue("Failed to click the invoice listing screen tool menu Invoice Templates Add Invoice templates Button", testInvoices.ClickInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplates());
        assertTrue("Failed to confirm visibility of the invoice listing screen tool menu invoice templates add invoice templates container", testInvoices.ConfirmVisibilityOfInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplatesContainer());
        assertTrue("Failed to click the invoice listing screen tool menu invoice templates add invoice templates close button", testInvoices.ClickInvoiceListingScreenToolInvoiceTemplatesAddInvoiceTemplatesCloseButton());
        assertTrue("Failed to click the invoice listing screen tool menu invoice templates close button", testInvoices.ClickInvoiceListingScreenToolInvoiceTemplatesCloseButton());
    }

    @Test
    public void BulkInvoiceEntrySmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu bulk invoice entry", testInvoices.ClickInvoiceListingScreenToolBulkInvoiceEntry());
        assertTrue("Failed to click the Invoice Listing Screen tool menu bulk invoice entry add invoice batch cancel button", testInvoices.ClickInvoiceListingScreenToolBulkInvoiceEntryAddInvoiceBatchCancelButton());
        assertTrue("Failed to click the Invoice Listing Screen tool menu bulk invoice entry add invoice batch cancel button confirmation continue button", testInvoices.ClickInvoiceListingScreenToolBulkInvoiceEntryAddInvoiceBatchCancelButtonConfirmationContinueButton());
    }

    @Test
    public void PausedBulkEntriesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu Paused bulk entries", testInvoices.ClickInvoiceListingScreenToolPausedBulkEntries());
        assertTrue("Failed to Confirm Visibility of the Invoice Listing Screen tool menu Paused bulk entries container", testInvoices.ConfirmVisibilityOfInvoiceListingScreenToolPausedBulkEntriesContainer());
        assertTrue("Failed to click the Invoice Listing Screen tool menu paused bulk entries close button", testInvoices.ClickInvoiceListingScreenToolPausedBulkEntriesCloseButton());
    }

    @Test
    public void ImportInvoicesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu import invoices", testInvoices.ClickInvoiceListingScreenToolImportInvoices());
        assertTrue("Failed to click the Invoice Listing Screen tool menu import invoices close button", testInvoices.ClickInvoiceListingScreenToolImportInvoicesCloseButton());
    }

    @Test
    public void ApprovePostInvoicesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu Approve Post Invoices", testInvoices.ClickInvoiceListingScreenToolApprovePostInvoices());
        assertTrue("Failed to Confirm Visibility of the Invoice Listing Screen tool menu Approve Post Invoices container", testInvoices.ConfirmVisibilityOfClickInvoiceListingScreenToolApprovePostInvoicesContainer());
        assertTrue("Failed to click the Invoice Listing Screen tool menu Approve Post Invoices Close Button", testInvoices.ClickInvoiceListingScreenToolApprovePostInvoicesCloseButton());
    }

    @Test
    public void ApproveForPaymentSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu approve for payment", testInvoices.ClickInvoiceListingScreenToolApproveForPayment());
        assertTrue("Failed to Confirm Visibility of the Invoice Listing Screen tool menu approve for payment container", testInvoices.ConfirmVisibilityOfInvoiceListingScreenToolApproveForPaymentContainer());
        assertTrue("Failed to click the Invoice Listing Screen tool menu approve for payment close button", testInvoices.ClickInvoiceListingScreenToolApproveForPaymentCloseButton());
    }

    @Test
    public void InterCoReimbursementsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the invoice listing screen tool menu", testInvoices.ClickInvoiceListingScreenToolMenu());
        assertTrue("Failed to click the Invoice Listing Screen tool menu Inter Co Reimbursements", testInvoices.ClickInvoiceListingScreenToolInterCoReimbursements());
        assertTrue("Failed to click the Invoice Listing Screen tool menu Inter Co Reimbursements close button", testInvoices.ClickInvoiceListingScreenToolInterCoReimbursementsCloseButton());
    }

    @Test
    public void FinalizePaymentsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen finalize payments", testAPPayments.ClickAPPaymentsListingScreenFinalizePayments());
        assertTrue("Failed to click the AP Payments Listing Screen Finalize Payments Filter Overlay", testAPPayments.ClickAPPaymentsListingScreenFinalizePaymentsFilterOverlay());
        assertTrue("Failed to click the AP Payments Listing Screen finalize payments close button", testAPPayments.ClickAPPaymentsListingScreenFinalizePaymentsCloseButton());
    }

    @Test
    public void ReprintChecksSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool reprint checks", testAPPayments.ClickAPPaymentsListingScreenToolReprintChecks());
        assertTrue("Failed to click the AP Payments Listing Screen tool reprint check reprint checks form cancel button", testAPPayments.ClickAPPaymentsListingScreenToolReprintChecksReprintChecksFormCancelButton());
    }

    @Test
    public void BulkVoidPaymentsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool bulk void payments", testAPPayments.ClickAPPaymentsListingScreenToolBulkVoidPayments());
        assertTrue("Failed to click the AP Payments Listing Screen tool bulk void payments search ap payments search payments button", testAPPayments.ClickAPPaymentsListingScreenToolBulkVoidPaymentsSearchAPPaymentsSearchPaymentsButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool bulk void payments close button", testAPPayments.ClickAPPaymentsListingScreenToolBulkVoidPaymentsCloseButton());
    }

    @Test
    public void PositivePaySchedulerSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay scheduler", testAPPayments.ClickAPPaymentsListingScreenToolPositivePayScheduler());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool positive pay scheduler container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePaySchedulerContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay scheduler close button", testAPPayments.ClickAPPaymentsListingScreenToolPositivePaySchedulerCloseButton());
    }

    @Test
    public void PositivePaySmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay", testAPPayments.ClickAPPaymentsListingScreenToolPositivePay());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay add positive pay export", testAPPayments.ClickAPPaymentsListingScreenToolPositivePayAddPositivePayExport());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool positive pay add positive pay export container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePayAddPositivePayExportContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay add positive pay export close button", testAPPayments.ClickAPPaymentsListingScreenToolPositivePayAddPositivePayExportCloseButton());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool positive pay container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolPositivePayContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool positive pay close button", testAPPayments.ClickAPPaymentsListingScreenToolPositivePayCloseButton());
    }

    @Test
    public void PaymentFilesSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool payment files", testAPPayments.ClickAPPaymentsListingScreenToolPaymentFiles());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool payment files container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolPaymentFilesContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool payment files close button", testAPPayments.ClickAPPaymentsListingScreenToolPaymentFilesCloseButton());
    }

    @Test
    public void UnclaimedPropertySmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool unclaimed property", testAPPayments.ClickAPPaymentsListingScreenToolUnclaimedProperty());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool unclaimed property container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolUnclaimedPropertyContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool unclaimed property close button", testAPPayments.ClickAPPaymentsListingScreenToolUnclaimedPropertyCloseButton());
    }

    @Test
    public void ImportAPPaymentsSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen tool menu", testAPPayments.ClickAPPaymentsListingScreenToolMenu());
        assertTrue("Failed to click the AP Payments Listing Screen tool import ap payments", testAPPayments.ClickAPPaymentsListingScreenToolImportAPPayments());
        assertTrue("Failed to confirm visibility of the AP Payments Listing Screen tool import ap payments import ap payments form container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenToolImportAPPaymentsImportAPPaymentsFormContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool import ap payments import ap payments form close button", testAPPayments.ClickAPPaymentsListingScreenToolImportAPPaymentsImportAPPaymentsFormCloseButton());
    }

    @Test
    public void RandomAPPaymentSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        APPaymentsPage testAPPayments = new APPaymentsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the AP Payments Listing Screen", navBar.clickAPPaymentsListingScreen());
        assertTrue("Failed to click the AP Payments Listing Screen close filter button", testAPPayments.ClickAPPaymentsListingScreenAPPaymentsFilterCloseButton());
        assertTrue("Failed to click the AP Payments Listing Screen Container", testAPPayments.ConfirmVisibilityOfAPPaymentsListingScreenContainer());
        assertTrue("Failed to click the AP Payments Listing Screen tool first ap payment", testAPPayments.ClickAPPaymentsListingScreenFirstAPPayment());
        assertTrue("Failed to click the AP Payments Listing Screen tool first ap payment close button", testAPPayments.ClickAPPaymentsListingScreenFirstAPPaymentCloseButton());
    }

    @Test
    public void AddBankAccountReconciliationSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        ReconciliationsPage testReconciliations = new ReconciliationsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Reconciliations listing Screen", navBar.clickReconciliationsListingScreen());
        assertTrue("Failed to click the Reconciliations listing screen Rec Filter Close Button", testReconciliations.clickReconciliationsListingScreenRecFilterCloseButton());
        assertTrue("Failed to click the Reconciliations listing screen add Rec", testReconciliations.clickReconciliationsListingScreenAddRec());
        assertTrue("Failed to click the Reconciliations listing screen Reconcile Bank Account", testReconciliations.clickReconciliationsListingScreenReconcileBankAccount());
        assertTrue("Failed to click the Reconciliations listing screen Reconcile Account Form", testReconciliations.clickReconciliationsListingScreenReconcileAccountForm());
        assertTrue("Failed to click the Reconciliations listing screen reconcile bank account close button", testReconciliations.clickReconciliationsListingScreenReconcileBankAccountCloseButton());
    }

    @Test
    public void RandomReconciliationSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        ReconciliationsPage testReconciliations = new ReconciliationsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Reconciliations listing Screen", navBar.clickReconciliationsListingScreen());
        assertTrue("Failed to click the Reconciliations listing screen Rec Filter Close Button", testReconciliations.clickReconciliationsListingScreenRecFilterCloseButton());
        assertTrue("Failed to click the Reconciliations listing screen First Rec", testReconciliations.clickReconciliationsListingScreenFirstRec());
        assertTrue("Failed to locate the Reconciliations listing screen Rec Container", testReconciliations.clickReconciliationsListingScreenRecContainer());
        assertTrue("Failed to click the Reconciliations listing screen First Rec Close Button", testReconciliations.clickReconciliationsListingScreenFirstRecCloseButton());
    }

    @Test
    public void AddCreditCardReconciliationSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        ReconciliationsPage testReconciliations = new ReconciliationsPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click the Reconciliations listing Screen", navBar.clickReconciliationsListingScreen());
        assertTrue("Failed to click the Reconciliations listing screen Rec Filter Close Button", testReconciliations.clickReconciliationsListingScreenRecFilterCloseButton());
        assertTrue("Failed to click the Reconciliations listing screen add Rec", testReconciliations.clickReconciliationsListingScreenAddRec());
        assertTrue("Failed to click the Reconciliations listing screen reconcile credit card account", testReconciliations.clickReconciliationsListingScreenReconcileCreditCardAccount());
        assertTrue("Failed to click the Reconciliations listing screen reconcile credit card account close button", testReconciliations.clickReconciliationsListingScreenReconcileCreditCardAccountCloseButton());
    }

   @Test
   public void AccountsPayableSettingsSmokeIT() {

       EntrataNavBar navBar = new EntrataNavBar(driver);
       CompanyFirstLevelNavigation flNav = new CompanyFirstLevelNavigation(driver);
       FinancialNav fNav = new FinancialNav(driver);
       TransactionsPage tA = new TransactionsPage(driver);

       assertTrue("Error Clicking setup button", navBar.clickSetupButton());
       assertTrue("Error Confirming Visibility of the financial tab", flNav.verifyFinancialTab());
       assertTrue("Error Clicking Financial Button", flNav.clickFinancialTab());
       assertTrue("Error Confirming Visibility of the Accounts Payable Tab", fNav.confirmVisibilityAccountsPayableTab());
       assertTrue("Error Clicking Accounts Payable Tab", fNav.clickAccountsPayableTab());
       assertTrue("Error Confirming Visibility of Accounts Payable Settings Container", tA.confirmVisibilityAccountsPayableSettingsContainer());
   }

   @Test
   public void ApprovalsSettingsSmokeIT() {

       EntrataNavBar navBar = new EntrataNavBar(driver);
       CompanyFirstLevelNavigation flNav = new CompanyFirstLevelNavigation(driver);
       FinancialNav fNav = new FinancialNav(driver);
       ApprovalsPage aNav = new ApprovalsPage(driver);

       assertTrue("Error Clicking setup button", navBar.clickSetupButton());
       assertTrue("Error Confirming Visibility of the financial tab", flNav.verifyFinancialTab());
       assertTrue("Error Clicking Financial Button", flNav.clickFinancialTab());
       assertTrue("Error Confirming Visibility of the Approvals Tab", fNav.confirmVisibilityApprovalsTab());
       assertTrue("Error Clicking Approvals Tab", fNav.clickApprovalsTab());
       assertTrue("Error Confirming Visibility of Accounts Payable Settings Container", aNav.confirmVisibilityApprovalsContainer());
   }

   @Test
    public void BankAccountsSettingSmokeIT() {

       EntrataNavBar navBar = new EntrataNavBar(driver);
       CompanyFirstLevelNavigation flNav = new CompanyFirstLevelNavigation(driver);
       FinancialNav fNav = new FinancialNav(driver);
       BankAccountsPage baNav = new BankAccountsPage(driver);

       assertTrue("Error Clicking setup button", navBar.clickSetupButton());
       assertTrue("Error Confirming Visibility of the financial tab", flNav.verifyFinancialTab());
       assertTrue("Error Clicking Financial Button", flNav.clickFinancialTab());
       assertTrue("Error confirming visibility of bank accounts tab", fNav.confirmVisibilityOfBankAccountsTab());
       assertTrue("Error clicking bank accounts tab", fNav.clickBankAccountsTab());
       assertTrue("Error Confirming Bank Accounts Container", baNav.confirmVisibilityOfBankAccountsContainer());
   }
}
