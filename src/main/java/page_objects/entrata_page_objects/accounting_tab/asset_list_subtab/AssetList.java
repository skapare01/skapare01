package page_objects.entrata_page_objects.accounting_tab.asset_list_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AssetList extends BasePage {

    public AssetList(WebDriver driver) {
        super(driver);
    }

    private final By PICK_TODAY_DATE = By.cssSelector("button[data-handler='today']");

    //Inventory

    private final By INVENTORY_TOOLS_MENU = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By BULK_TRANSFER_BUTTON = By.cssSelector("a[onclick*='Bulk Transfer Fixed Assets']");
    private final By BULK_TRANSFER_FORM = By.id("bulk_transfer_fixed_assets_container");
    private final By INVENTORY_TAB = By.id("inventory_tab");
    private final By SIDE_PANEL = By.cssSelector("ul[class='view-data-side-tabs ']");
    private final By TABLE_HEADER = By.id("table-header");
    private final By ADD_INVENTORY_ADJUSTMENT = By.xpath("//*[contains(@onclick, 'add_inventory_adjustment')]");
    private final By ADD_INVENTORY_ADJUSTMENT_FORM = By.id("add_inventory_adjustment");
    private final By INVENTORY_PROPERTY = By.id("inventory_property_id");
    private final By INVENTORY_PROPERTY_DROPDOWN = By.xpath("//*[@id=\"add_inventory_adjustment_frm\"]/fieldset/div[1]/div/i");
    private final By FIRST_LISTED_PROPERTY = By.xpath("//*[contains(@data-info, 'property_name')]");
    private final By SELECT_ITEM = By.id("inventory_select_item");
    private final By SELECT_ITEM_DROPDOWN = By.xpath("//*[@id=\"add_inventory_adjustment_frm\"]/fieldset/div[2]/div/i");
    private final By INVENTORY_FIRST_LISTED_ITEM = By.xpath("//*[contains(@data-info, 'unit_of_measure_id')]");
    private final By ASSET_LOCATION = By.id("asset_locations");
    private final By INVENTORY_POST_DATE = By.cssSelector("div[class='form-date datepicker binded']");
    private final By INVENTORY_POST_DATE_MONTH = By.cssSelector("input[class='month']");
    private final By INVENTORY_POST_DATE_DAY = By.cssSelector("input[class='day']");
    private final By INVENTORY_POST_DATE_YEAR = By.cssSelector("input[class='year']");
    private final By INVENTORY_POST_MONTH = By.id("txtPostMonth");
    private final By QUANTITY = By.id("txtQuantity");
    private final By UNIT_COST = By.id("unit_cost");
    private final By MEMO = By.name("asset_transactions[memo]");
    private final By SAVE_BUTTON = By.id("btnSubmit");
    private final By INVENTORY_CANCEL_HYPERLINK = By.id("invntory_adjustment_cancel");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    //Fixed Assets

    private final By ADD_FIXED_ASSET = By.xpath("//*[contains(@onclick, 'Add Fixed Asset')]");
    private final By ADD_FIXED_ASSET_FORM = By.id("add_fixed_assets");
    private final By ITEM_NAME = By.id("assets_ap_code_id");
    private final By ITEM_NAME_DROPDOWN = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[1]/div/i");
    private final By FIXED_ASSET_FIRST_LISTED_ITEM = By.xpath("//*[contains(@data-info, 'asset_type_id')]");
    private final By FIXED_ASSETS_PROPERTY = By.id("assets_property_id");
    private final By FIXED_ASSET_PROPERTY_DROPDOWN = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[2]/div/i");
    private final By FIXED_ASSET_FIRST_LISTED_PROPERTY = By.xpath("//*[contains(@data-info, 'property_type_id')]");
    private final By PLACED_IN_SERVICE = By.id("placed_in_service_toggle");
    private final By PLACED_IN_SERVICE_DATE = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[4]/div[1]");
    private final By LOCATION_TYPE = By.id("location_type_id");
    private final By UNIT = By.id("asset_units");
    private final By LOCATION = By.id("locations_within_unit");
    private final By ASSET_NUMBER = By.name("asset_details[asset_number]");
    private final By SERIAL_NUMBER = By.name("assets[serial_number]");
    private final By PURCHASED = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[17]/div[1]");
    private final By PURCHASED_DATE_PICKER = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[17]/div[2]");
    private final By FIXED_ASSETS_POST_MONTH = By.id("txtPostMonth");
    private final By PURCHASE_PRICE = By.id("transaction_amount");
    private final By MAKE = By.name("asset_details[make]");
    private final By MODEL = By.name("asset_details[model]");
    private final By COLOR = By.name("asset_details[color]");
    private final By CONDITION = By.id("asset_conditon_dropdown");
    private final By WARRANTY_VENDOR = By.id("warranty_ap_payees_dropdown");
    private final By WARRANTY_EXPIRATION = By.xpath("//*[@id=\"add_fixed_assets_frm\"]/fieldset/div[25]/div[1]");
    private final By CREATE_NEW_VENDOR = By.id("add_vendor");
    private final By ADD_BUTTON = By.id("btn_add_fixed_assets");
    private final By FIXED_ASSET_CANCEL_HYPERLINK = By.id("btn_cancel_fixed_assets");


    public boolean todayDateClick() {
        return clickElement(PICK_TODAY_DATE);
    }

    //Inventory

    public boolean inventoryMenuHover() {
        return moveToAnElementWithActions(INVENTORY_TOOLS_MENU);
    }

    public boolean bulkTransferButton() {
        moveToAnElementWithActions(BULK_TRANSFER_BUTTON);
        return clickElement(BULK_TRANSFER_BUTTON);
    }

    public boolean inventoryTabClick() {
        return clickElement(INVENTORY_TAB);
    }

    public boolean addInventoryAdjustmentClick() {
        return clickElement(ADD_INVENTORY_ADJUSTMENT);
    }

    public boolean propertyDropdownClick() {
        return clickElement(INVENTORY_PROPERTY_DROPDOWN);
    }

    public boolean firstListedPropertyClick() {
        return clickElement(FIRST_LISTED_PROPERTY);
    }

    public boolean itemDropdownClick() {
        return clickElement(SELECT_ITEM_DROPDOWN);
    }

    public boolean inventoryFirstListedItemClick() {
        return clickElement(INVENTORY_FIRST_LISTED_ITEM);
    }

    public boolean inputPostDateMonth(String month) {
        elementClearTextField(INVENTORY_POST_DATE_MONTH);
        return sendKeysToElement(INVENTORY_POST_DATE_MONTH, month);
    }

    public boolean inputPostDateDay(String day) {
        elementClearTextField(INVENTORY_POST_DATE_DAY);
        return sendKeysToElement(INVENTORY_POST_DATE_DAY, day);
    }

    public boolean inputPostDateYear(String year) {
        elementClearTextField(INVENTORY_POST_DATE_YEAR);
        return sendKeysToElement(INVENTORY_POST_DATE_YEAR, year);
    }

    public boolean postMonthInput(String date) {
        elementClearTextField(INVENTORY_POST_MONTH);
        return sendKeysToElement(INVENTORY_POST_MONTH, date);
    }

    public boolean quantityInput(String num) {
        return sendKeysToElement(QUANTITY, num);
    }

    public boolean unitCostInput(String num) {
        return sendKeysToElement(UNIT_COST, num);
    }

    public boolean memoInput(String memo) {
        return sendKeysToElement(MEMO, memo);
    }

    public boolean saveButtonClick() {
        return clickElement(SAVE_BUTTON);
    }

    public boolean successBannerCheck() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }


    //Visibility - Inventory

    public boolean bulkTransferFormVisible() {
        return confirmElementIsVisible(BULK_TRANSFER_FORM);
    }

    public boolean addInventoryAdjustmentFormVisible() {
        return confirmElementIsVisible(ADD_INVENTORY_ADJUSTMENT_FORM);
    }

    public boolean inventoryPropertyVisible() {
        return confirmElementIsVisible(INVENTORY_PROPERTY);
    }

    public boolean selectItemVisible() {
        return confirmElementIsVisible(SELECT_ITEM);
    }

    public boolean assetLocationVisible() {
        return confirmElementIsVisible(ASSET_LOCATION);
    }

    public boolean inventoryPostDateVisible() {
        return confirmElementIsVisible(INVENTORY_POST_DATE);
    }

    public boolean inventoryPostMonthVisible() {
        return confirmElementIsVisible(INVENTORY_POST_MONTH);
    }

    public boolean quantityVisible() {
        return confirmElementIsVisible(QUANTITY);
    }

    public boolean unitCostVisible() {
        return confirmElementIsVisible(UNIT_COST);
    }

    public boolean memoVisible() {
        return confirmElementIsVisible(MEMO);
    }

    public boolean saveButtonVisible() {
        return confirmElementIsVisible(SAVE_BUTTON);
    }

    public boolean inventoryCancelHyperlinkVisible() {
        return confirmElementIsVisible(INVENTORY_CANCEL_HYPERLINK);
    }


    //Fixed Assets

    public boolean addFixedAssetClick() {
        return clickElement(ADD_FIXED_ASSET);
    }

    public boolean fixedAssetItemNameDropdownClick() {
        return clickElement(ITEM_NAME_DROPDOWN);
    }

    public boolean fixedAssetFirstListedItemClick() {
        return clickElement(FIXED_ASSET_FIRST_LISTED_ITEM);
    }

    public boolean fixedAssetPropertyDropdownClick() {
        return clickElement(FIXED_ASSET_PROPERTY_DROPDOWN);
    }

    public boolean fixedAssetFirstListedPropertyClick() {
        return clickElement(FIXED_ASSET_FIRST_LISTED_PROPERTY);
    }

    public boolean placedInServiceToggle() {
        return clickElement(PLACED_IN_SERVICE);
    }

    public boolean serialNumber(String num) {
        return sendKeysToElement(SERIAL_NUMBER, num);
    }

    public boolean purchasedDatePickerClick() {
        return clickElement(PURCHASED_DATE_PICKER, waitTimes.LONG_WAIT);
    }

    public boolean fixedAssetPostMonth(String date) {
        elementClearTextField(FIXED_ASSETS_POST_MONTH);
        return sendKeysToElement(FIXED_ASSETS_POST_MONTH, date);
    }

    public boolean purchasePrice(String price) {
        return sendKeysToElement(PURCHASE_PRICE, price);
    }

    public boolean fixedAssetAddButtonClick() {
        return clickElement(ADD_BUTTON);
    }


    //Visibility - Fixed Assets

    public boolean addFixedAssetFormVisible() {
        return confirmElementIsVisible(ADD_FIXED_ASSET_FORM);
    }

    public boolean itemNameVisible() {
        return confirmElementIsVisible(ITEM_NAME);
    }

    public boolean fixedAssetsPropertyVisible() {
        return confirmElementIsVisible(FIXED_ASSETS_PROPERTY);
    }

    public boolean placedInServiceVisible() {
        return confirmElementIsVisible(PLACED_IN_SERVICE);
    }

    public boolean placedInServiceDateVisible() {
        return confirmElementIsVisible(PLACED_IN_SERVICE_DATE);
    }

    public boolean locationTypeVisible() {
        return confirmElementIsVisible(LOCATION_TYPE);
    }

    public boolean unitVisible() {
        return confirmElementIsVisible(UNIT);
    }

    public boolean locationVisible() {
        return confirmElementIsVisible(LOCATION);
    }

    public boolean assetNumberVisible() {
        return confirmElementIsVisible(ASSET_NUMBER);
    }

    public boolean serialNumberVisible() {
        return confirmElementIsVisible(SERIAL_NUMBER);
    }

    public boolean purchasedVisible() {
        return confirmElementIsVisible(PURCHASED);
    }

    public boolean fixedAssetPostMonthVisible() {
        return confirmElementIsVisible(FIXED_ASSETS_POST_MONTH);
    }

    public boolean purchasePriceVisible() {
        return confirmElementIsVisible(PURCHASE_PRICE);
    }

    public boolean makeVisible() {
        return confirmElementIsVisible(MAKE);
    }

    public boolean modelVisible() {
        return confirmElementIsVisible(MODEL);
    }

    public boolean colorVisible() {
        return confirmElementIsVisible(COLOR);
    }

    public boolean conditionVisible() {
        return confirmElementIsVisible(CONDITION);
    }

    public boolean warrantyVendorVisible() {
        return confirmElementIsVisible(WARRANTY_VENDOR);
    }

    public boolean warrantyExpirationVisible() {
        return confirmElementIsVisible(WARRANTY_EXPIRATION);
    }

    public boolean createNewVendorButtonVisible() {
        return confirmElementIsVisible(CREATE_NEW_VENDOR);
    }

    public boolean addButtonVisible() {
        return confirmElementIsVisible(ADD_BUTTON);
    }

    public boolean fixedAssetCancelHyperlinkVisible() {
        return confirmElementIsVisible(FIXED_ASSET_CANCEL_HYPERLINK);
    }


    //Visibility

    public boolean sidePanelVisible() {
        return confirmElementIsVisible(SIDE_PANEL);
    }

    public boolean tableHeaderVisible() {
        return confirmElementIsVisible(TABLE_HEADER);
    }

}
