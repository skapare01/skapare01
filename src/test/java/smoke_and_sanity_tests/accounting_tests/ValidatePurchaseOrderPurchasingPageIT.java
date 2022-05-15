package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.AddPurchaseOrdersPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.PurchaseOrdersListingScreenPage;

import static org.junit.Assert.assertTrue;

public class ValidatePurchaseOrderPurchasingPageIT extends BaseBrowserTest {

    public ValidatePurchaseOrderPurchasingPageIT() {
        super("demoold");
    }

    @Test
    public void POsToolPurchasingSmokeIT() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AddPurchaseOrdersPage testAddPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPOListingScreen = new PurchaseOrdersListingScreenPage(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testAddPurchaseOrders.clickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testAddPurchaseOrders.clickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click the purchase orders listing screen menu button", testPOListingScreen.clickPurchaseOrdersListingScreenToolMenu());
        assertTrue("Failed to click the purchase orders listing screen menu purchasing", testPOListingScreen.clickPurchaseOrdersListingScreenToolPurchasing());
        assertTrue("Confirm Visibility of the purchase orders listing screen menu purchasing list container", testPOListingScreen.confirmVisibilityOfPurchaseOrdersListingScreenToolPurchasingContainer());
        assertTrue("Failed to click on purchase orders listing screen menu purchasing close button", testPOListingScreen.clickPurchaseOrdersListingScreenToolPurchasingCloseButton());
    }
}
