package page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PurchaseOrdersListingScreenPage extends BasePage {

    //Purchase Orders Listing Page Tools
    private final By TOOL_MENU_BUTTON = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES = By.xpath("//*[text()='Purchase Order Templates']");
    private final By TOOL_APPROVE_PURCHASE_ORDERS = By.xpath("//*[text()='Approve Purchase Orders']");
    private final By TOOL_PURCHASING = By.xpath("//*[text()='Purchasing']");
    private final By TOOL_RECEIVE_ITEMS = By.xpath("//*[text()='Receive Items']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS = By.xpath("//*[text()='Import Purchase Orders']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS_CONTAINER = By.id("import_purchase_orders_div");
    private final By TOOL_RECEIVE_ITEMS_CONTAINER = By.id("receive_items_container");
    private final By TOOL_PURCHASING_CONTAINER = By.id("frm_maintenance_request_materials");
    private final By TOOL_APPROVE_PURCHASE_ORDERS_LIST_CONTAINER = By.id("approved_purchase_orders_list_container");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES_LIST_CONTAINER = By.id("main_purchase_order_template_container");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_APPROVE_PURCHASE_ORDERS_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By TOOL_PURCHASING_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_RECEIVE_ITEMS_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By FIRST_PURCHASE_ORDER = By.cssSelector("tr[class='aRow js-load-po-details']");
    private final By FIRST_PURCHASE_ORDER_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By PURCHASE_ORDER_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");

    public PurchaseOrdersListingScreenPage(WebDriver driver) { super (driver);}

    public boolean clickPurchaseOrdersListingScreenToolMenu() {return clickElement(TOOL_MENU_BUTTON);}
    public boolean clickPurchaseOrdersListingScreenToolPurchaseOrderTemplates() {return clickElement(TOOL_PURCHASE_ORDER_TEMPLATES);}
    public boolean clickPurchaseOrdersListingScreenToolPurchaseOrderTemplatesCloseButton() {return clickElement(TOOL_PURCHASE_ORDER_TEMPLATES_CLOSE_BUTTON);}
    public boolean clickPurchaseOrdersListingScreenToolApprovePurchaseOrders() {return clickElement(TOOL_APPROVE_PURCHASE_ORDERS);}
    public boolean confirmVisibilityOfPurchaseOrdersListingsScreenToolApprovePurchaseOrdersListContainer() {return confirmElementIsVisible(TOOL_APPROVE_PURCHASE_ORDERS_LIST_CONTAINER);}
    public boolean clickPurchaseOrdersListingScreenToolApprovePurchaseOrdersCloseButton() {return clickElement(TOOL_APPROVE_PURCHASE_ORDERS_CLOSE_BUTTON);}
    public boolean confirmVisibilityOfPurchaseOrdersListingsScreenToolPurchaseOrdersTemplateListContainer() {return confirmElementIsVisible(TOOL_PURCHASE_ORDER_TEMPLATES_LIST_CONTAINER);}
    public boolean clickPurchaseOrdersListingScreenToolPurchasing() {return clickElement(TOOL_PURCHASING, waitTimes.LONG_WAIT);}
    public boolean confirmVisibilityOfPurchaseOrdersListingScreenToolPurchasingContainer() {return confirmElementIsVisible(TOOL_PURCHASING_CONTAINER);}
    public boolean clickPurchaseOrdersListingScreenToolPurchasingCloseButton() {return clickElement(TOOL_PURCHASING_CLOSE_BUTTON);}
    public boolean clickPurchaseOrdersListingScreenToolReceiveItems() {return clickElement(TOOL_RECEIVE_ITEMS);}
    public boolean confirmVisibilityOfPurchaseOrdersListingScreenToolReceiveItemsContainer() {return confirmElementIsVisible(TOOL_RECEIVE_ITEMS_CONTAINER, waitTimes.UNREASONABLE_WAIT);}
    public boolean clickPurchaseOrdersListingScreenToolReceiveItemsCloseButton() {return clickElement(TOOL_RECEIVE_ITEMS_CLOSE_BUTTON);}
    public boolean clickPurchaseOrdersListingScreenToolImportPurchaseOrders() {return clickElement(TOOL_IMPORT_PURCHASE_ORDERS);}
    public boolean clickPurchaseOrdersListingScreenToolImportPurchaseOrdersCloseButton() {return clickElement(TOOL_IMPORT_PURCHASE_ORDERS_CLOSE_BUTTON);}
    public boolean confirmVisibilityOfPurchaseOrdersListingScreenToolImportPurchaseOrdersContainer() {return confirmElementIsVisible(TOOL_IMPORT_PURCHASE_ORDERS_CONTAINER);}
    public boolean clickPurchaseOrderListingScreenRandomPurchaseOrder() {return clickElement(FIRST_PURCHASE_ORDER);}
    public boolean clickPurchaseOrderListingScreenRandomPurchaseOrderCloseButton() {return clickElement(FIRST_PURCHASE_ORDER_CLOSE_BUTTON);}
    public boolean confirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage() {return confirmElementIsVisible(PURCHASE_ORDER_SUCCESS_MESSAGE, waitTimes.LONG_WAIT);}
}
