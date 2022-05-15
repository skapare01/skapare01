package regression_tests.accounting_suite_tests.add_invoices_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.invoices_subtab.AddInvoicesPage;
import page_objects.entrata_page_objects.accounting_tab.invoices_subtab.InvoicesListingScreenPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddInvoiceIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddInvoiceIT() {
        super("karenbertelli");
    }

    @Test
    // Add invoice Test
    //Dependencies for test: EntrataCore enabled property,User with all permissions or permission to Accounting(ie:Invoice Type, Add Invoice, Post Invoice), bank account setup with core enabled property,
    //property bank account default setup, vendor, location with property attached, remittance, require routing tags set to no, require attachment for invoice set to no, GL Account setup for property,
    //require PO for Invoices set to no, allow duplicate invoice number per vendor set to yes,
    public void AddNewInvoiceIT() {
        
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        InvoicesListingScreenPage testInvoices = new InvoicesListingScreenPage(driver);
        assertTrue("Failed to click close button for Vendor Filter", testInvoices.ClickCloseVendorFilterButton());
        assertTrue("Failed to click the Invoice listing screen button", navBar.clickInvoiceListingScreen());
        assertTrue("Failed to click the close button for Invoice Filter", testInvoices.ClickCloseInvoiceFilterButton());
        assertTrue("Failed to click the Invoice Listing Screen add Invoice button", testInvoices.ClickInvoiceListingScreenAddInvoiceButton());
        AddInvoicesPage testAddInvoices = new AddInvoicesPage(driver);
        assertTrue("Failed to click the add invoice property search dropdown", testAddInvoices.clickInvoiceListingScreenAddInvoicePropertySearchDropdown());
        assertTrue("Failed to Send keys to add invoice property search dropdown", testAddInvoices.sendKeysToInvoiceListingScreenAddInvoicePropertySearchField());
        assertTrue("Failed to click on item from property search autocomplete dropdown", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceAutoCompletePropertyDropdown());
        assertTrue("Failed to send keys to AP Payees search field", testAddInvoices.sendKeysToInvoiceListingScreenAddInvoiceApPayeesSearchField());
        assertTrue("Failed to click on AP Payees autocomplete dropdown", testAddInvoices.moveToInvoiceListingScreenAddInvoiceAutoCompleteApPayeesDropdown());
        assertTrue("Failed to click on AP Payees auto complete dropdown",testAddInvoices.clickOnInvoiceListingScreenAddInvoiceAutoCompleteApPayeesDropdown());
        assertTrue("Failed to send Keys to the Invoice Number Input Field", testAddInvoices.sendKeysToInvoiceListingScreenAddInvoiceInvoiceNumberInputField());
        assertTrue("Failed to click on invoice total input field", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceDistributeLineItemButton());
        assertTrue("Failed to click on Invoice Total Input Field", testAddInvoices.clickInvoiceListingScreenAddInvoiceInvoiceTotalInputField());
        assertTrue("Failed to send keys to Invoice total input field", testAddInvoices.sendKeysToInvoiceListingScreenAddInvoiceInvoiceTotalInputField());
        assertTrue("Failed to click on date picker calendar button", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceDatePickerCalendarDays());
        assertTrue("Failed to click on date picker today button", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceDatePickerTodayButton());
        assertTrue("Failed to click on GL Account Search Field and input GL Account", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceGLAccountInputField());
        assertTrue("Failed to send keys to GL Account Input field", testAddInvoices.sendKeysToInvoiceListingScreenAddInvoiceGLAccountSearchFieldInput());
        assertTrue("Failed to click on GL Account Auto Complete result", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceGLAccountAutoCompleteResult());
        assertTrue("Failed to click on Add Invoice Save invoice Button", testAddInvoices.clickOnInvoiceListingScreenAddInvoiceSaveInvoiceButton());
        assertTrue("Failed to find add invoice success message banner", testAddInvoices.confirmVisibilityOfInvoiceListingScreenAddInvoiceSuccessMessageBanner());
    }
}
