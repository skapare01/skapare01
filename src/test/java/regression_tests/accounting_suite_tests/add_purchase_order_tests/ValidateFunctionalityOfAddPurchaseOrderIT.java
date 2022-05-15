package regression_tests.accounting_suite_tests.add_purchase_order_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.AddPurchaseOrdersPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.PurchaseOrdersListingScreenPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.ViewPurchaseOrderPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.approvals_tab.ApprovalsPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddPurchaseOrderIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddPurchaseOrderIT() {
        super("karenbertelli");
    }

    @Test
    public void shouldAddAPurchaseOrder_whenPurchaseOrderFormIsCompleted() {


        EntrataNavBar navBar = new EntrataNavBar(driver);
        //Check if approval routing is turned on and turn off prior to adding purchase order
        assertTrue("Failed to click on Setup Tab", navBar.clickSetupButton());
        CompanyFirstLevelNavigation companyNav = new CompanyFirstLevelNavigation(driver);
        assertTrue("Failed to click on Financial Sub Tab", companyNav.clickFinancialTab());
        FinancialNav financial = new FinancialNav(driver);
        assertTrue("Failed to click on Approvals Sub Tab", financial.clickApprovalsTab());
        ApprovalsPage approvals = new ApprovalsPage(driver);
        assertTrue("Failed to click on Edit Approval Settings Button", approvals.clickEditApprovalSettingsButton());
        if(approvals.confirmVisibilityOfPurchaseOrderAdvancedRoutingToggleOn()) {
            assertTrue("Failed to click (to turn off) Purchase Order Advanced Routing Toggle", approvals.clickPurchaseOrderAdvancedRoutingToggleToTurnOff());
            assertTrue("Failed to confirm visibility of Purchase Order Advanced Routing Toggle in off status", approvals.confirmVisibilityOfPurchaseOrderAdvancedRoutingToggleOff());
            assertTrue("Failed to click Save Approval Settings Button", approvals.clickSaveApprovalSettingsButton());
            assertTrue("Failed to confirm visibility of Approval Settings Save Success Message", approvals.confirmVisibilityOfApprovalSettingsSaveSuccessMessage());
        }
        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        AddPurchaseOrdersPage testPurchaseOrders = new AddPurchaseOrdersPage(driver);
        assertTrue("Failed to click close button for Vendor Filter", testPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click on Add Purchase Orders Button", testPurchaseOrders.clickAddPurchaseOrdersButton());
        assertTrue("Failed to click on Add Purchase Orders Property Dropdown",testPurchaseOrders.clickAddPurchaseOrdersPropertySearchDropdown());
        assertTrue("Failed to send keys to Add Purchase Orders Property Search Dropdown", testPurchaseOrders.sendKeysToAddPurchaseOrdersPropertySearchField());
        assertTrue("Failed to click on Add purchase orders property dropdown", testPurchaseOrders.clickAddPurchaseOrdersPropertySearchDropdownResult());
        assertTrue("Failed to click on Add Purchase Orders Vendor/Account Dropdown", testPurchaseOrders.clickAddPurchaseOrdersVendorAccountDropdown());
        assertTrue("Failed to send keys to Add Purchase Orders Vendor/Account Input Search Field", testPurchaseOrders.sendKeysToAddPurchaseOrdersVendorAccountSearchField());
        assertTrue("Failed to click on add Purchase Orders Vendor Account Search Results", testPurchaseOrders.clickAddPurchaseOrdersVendorAccountSearchResult());
        assertTrue("Failed to click on Add Purchase Orders Date Picker", testPurchaseOrders.clickAddPurchaseOrdersDatePickerButton());
        assertTrue("Failed to click the add purchase order date picker today button", testPurchaseOrders.clickAddPurchaseOrdersDatePickerTodayButton());
        assertTrue("Failed to click the add purchase order GL Account drop down", testPurchaseOrders.clickAddPurchaseOrdersGLAccountDropdownButton());
        assertTrue("Failed to send keys to add Purchase Orders GL Account Input field", testPurchaseOrders.sendKeysToAddPurchaseOrdersGlAccountInputSearchField());
        assertTrue("Failed to click on Add Purchase Orders GL Account Input Field Results", testPurchaseOrders.clickAddPurchaseOrdersGlAccountInputSearchFieldResult());
        assertTrue("Failed to click add Purchase Orders Line item Rate Input Field", testPurchaseOrders.clickAddPurchaseOrdersLineItemRateInputField());
        assertTrue("Failed to send keys to add Purchase Orders Line item Rate Input Field", testPurchaseOrders.sendKeysAddPurchaseOrdersLineItemRateInputField());
        assertTrue("Failed to click on Add Purchase Orders GL Account Description Input Field", testPurchaseOrders.sendKeysToAddPurchaseOrdersLineItemDescriptionInputField());
        assertTrue("Failed to click on the OS Routing Tag from the Routing Tag Drop Down.", testPurchaseOrders.selectOptionOSInRoutingTagDropDown());
        assertTrue("Failed to click add purchase orders submit button", testPurchaseOrders.clickAddPurchaseOrdersSubmitButton());
        PurchaseOrdersListingScreenPage testPurchaseOrdersListingScreen = new PurchaseOrdersListingScreenPage(driver);
        assertTrue("Failed to Confirm Visibility of add purchase order success message", testPurchaseOrdersListingScreen.confirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage());
        assertTrue("Failed to click the Purchase Order Listing Screen First Purchase Order", testPurchaseOrdersListingScreen.clickPurchaseOrderListingScreenRandomPurchaseOrder());
        ViewPurchaseOrderPage testViewPurchaseOrder = new ViewPurchaseOrderPage(driver);
        assertTrue("Failed to click the view purchase order approval button", testViewPurchaseOrder.clickViewPurchaseOrderApprovalButton());
        assertTrue("Failed to Confirm Visibility of message, Purchase order approved successfully.", testPurchaseOrdersListingScreen.confirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage());
    }
}
