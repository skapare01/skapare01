package page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddPurchaseOrdersPage extends BasePage {

    public AddPurchaseOrdersPage(WebDriver driver) { super (driver);}

    private final String PROPERTY_NAME = "The Good Child";
    private final String VENDOR_ACCOUNT_NAME =  "21OctR, Corporate";
    private final String GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE = "1810 : Land";
    private final String LINE_ITEM_RATE_INPUT_FIELD_VALUE = "20.00";
    private final String LINE_ITEM_DESCRIPTION_INPUT_FIELD_VALUE = "DREW IS A BOSS";

    private final By ACCOUNTING_FILTERS_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By PURCHASE_ORDERS_LISTING_SCREEN_ADD_PURCHASE_ORDERS_BUTTON = By.cssSelector("i[class='flat-add transition']");
    private final By ORDERS_PROPERTY_SEARCH = By.id("property_header_dropdown");
    private final By VENDOR_ACCOUNT_SEARCH_FIELD = By.cssSelector("input[class='search-input create-po']");
    private final By VENDOR_ACCOUNT_DROPDOWN_RESULT = By.xpath("//*[text()='testacc']");
    private final By DATEPICKER = By.cssSelector("div[class='form-date datepicker binded']+div");
    private final By VENDOR_ACCOUNT_DROPDOWN = By.cssSelector("div[class='form-select-table-dropdown js-table wide6 ']");
    private final By DATEPICKER_TODAY_BUTTON =  By.cssSelector("button[data-handler='today']");
    private final By GL_ACCOUNT_DROPDOWN = By.id("gl_account_dropdown_0");
    private final By PROPERTY_DROPDOWN_RESULT = By.xpath("//a[contains(text(),' The Good Child')]");
    private final By GL_ACCOUNT_INPUT_SEARCH_FIELD = By.cssSelector("input[class='search-input']");
    private final By GL_ACCOUNT_INPUT_SEARCH_FIELD_RESULT = By.xpath("//*/li[text()='1810 : Land']");
    private final By LINE_ITEM_RATE_INPUT_FIELD = By.id("ap_detail_rate_0");
    private final By LINE_ITEM_DESCRIPTION_INPUT_FIELD = By.id("ap_detail_description_0");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By SUBMIT_BUTTON = By.id("add_purchase_order_submit");
    private final By ADD_PURCHASE_ORDER_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By ROUTING_TAG = By.id("ap_routing_tag_id");

    public boolean selectOptionOSInRoutingTagDropDown() {return selectElementByValue(ROUTING_TAG, "117");}
    public boolean confirmVisibilityOfAddPurchaseOrdersPropertyDropdown() {return confirmElementIsVisible(ORDERS_PROPERTY_SEARCH, waitTimes.LONG_WAIT);}
    public boolean clickAddPurchaseOrdersCloseButton() {return clickElement(CLOSE_BUTTON);}
    public boolean clickCloseVendorFilterButton(){return clickElement(ACCOUNTING_FILTERS_CLOSE_BUTTON);}
    public boolean clickClosePurchaseOrdersFilterButton() {return clickElement(ACCOUNTING_FILTERS_CLOSE_BUTTON);}
    public boolean clickAddPurchaseOrdersButton() {return clickElement(PURCHASE_ORDERS_LISTING_SCREEN_ADD_PURCHASE_ORDERS_BUTTON);}
    public boolean clickAddPurchaseOrdersPropertySearchDropdown(){return clickElement(ORDERS_PROPERTY_SEARCH);}
    public boolean sendKeysToAddPurchaseOrdersPropertySearchField(){return sendKeysToElement(ORDERS_PROPERTY_SEARCH, PROPERTY_NAME);}
    public boolean clickAddPurchaseOrdersPropertySearchDropdownResult() {return clickElement(PROPERTY_DROPDOWN_RESULT);}
    public boolean sendKeysToAddPurchaseOrdersVendorAccountSearchField() {return sendKeysToElement(VENDOR_ACCOUNT_SEARCH_FIELD, VENDOR_ACCOUNT_NAME);}
    public boolean clickAddPurchaseOrdersVendorAccountSearchResult() {return clickElement(VENDOR_ACCOUNT_DROPDOWN_RESULT);}
    public boolean clickAddPurchaseOrdersDatePickerButton() {return clickElement(DATEPICKER);}
    public boolean clickAddPurchaseOrdersDatePickerTodayButton() {return clickElement(DATEPICKER_TODAY_BUTTON);}
    public boolean clickAddPurchaseOrdersGLAccountDropdownButton() {return clickElement(GL_ACCOUNT_DROPDOWN);}
    public boolean sendKeysToAddPurchaseOrdersGlAccountInputSearchField() {return sendKeysToElement(GL_ACCOUNT_INPUT_SEARCH_FIELD, GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE);}
    public boolean clickAddPurchaseOrdersVendorAccountDropdown() {
        waitForOverlay(ADD_PURCHASE_ORDER_OVERLAY);
        return clickElement(VENDOR_ACCOUNT_DROPDOWN);}
    public boolean clickAddPurchaseOrdersGlAccountInputSearchFieldResult() {return clickElement(GL_ACCOUNT_INPUT_SEARCH_FIELD_RESULT);}
    public boolean clickAddPurchaseOrdersLineItemRateInputField() {return clickElement(LINE_ITEM_RATE_INPUT_FIELD);}
    public boolean sendKeysAddPurchaseOrdersLineItemRateInputField() {return sendKeysToElement(LINE_ITEM_RATE_INPUT_FIELD, LINE_ITEM_RATE_INPUT_FIELD_VALUE);}
    public boolean sendKeysToAddPurchaseOrdersLineItemDescriptionInputField() {return sendKeysToElement(LINE_ITEM_DESCRIPTION_INPUT_FIELD, LINE_ITEM_DESCRIPTION_INPUT_FIELD_VALUE);}
    public boolean clickAddPurchaseOrdersSubmitButton() {return clickElement(SUBMIT_BUTTON);}
}
