package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.addons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RentableItemsSubtab extends BasePage {

    private final By RENTABLE_ITEMS_EDIT_BUTTON = By.id("btn_edit_add_on_group");
    private final By RENTABLE_ITEMS_DELETE_BUTTON = By.id("btn_delete_add_on_group");
    private final By RENTABLE_ITEMS_YES_BUTTON = By.id("confirm-to-yes-for-delete-add-on-group");
    private final By RENTABLE_ITEMS_TEXT_BOX = By.cssSelector("textarea[class='form-textarea rows4']");
    private final By RENTABLE_ITEMS_SAVE_BUTTON = By.id("submit_update_add_on_group");
    private final By RENTABLE_ITEMS_MANAGE_INVENTORY_BUTTON = By.cssSelector("a[class='edit js-view-add-ons']");
    private final By RENTABLE_ITEMS_MANAGE_INVENTORY_EDIT_BUTTON = By.cssSelector("i[class='edit js-edit-add-on']");
    private final By RENTABLE_ITEMS_MANAGE_INVENTORY_TEXT_BOX = By.cssSelector("textarea[class='form-textarea rows4']");
    private final By RENTABLE_ITEMS_MANAGE_INVENTORY_SAVE_BUTTON = By.id("update_add_on");
    private final By RENTABLE_ITEM_ADD_ITEM_CATEGORY_BUTTON = By.id("btn_add_add_on_group");
    private final By RENTABLE_ITEM_CATEGORY_TYPE_DROPDOWN = By.id("select_aoc");
    private final By RENTABLE_ITEM_CATEGORY_CUSTOMIZE_NAME_TOGGLE = By.cssSelector("div[class='onoff slim on']");
    private final By RENTABLE_ITEM_CUSTOM_NAME_TEXT_BOX = By.cssSelector("input[name='add_on_group[name]']");
    private final By RENTABLE_ITEM_CATEGORY_SAVE_BUTTON = By.cssSelector("input[type='submit']");

    public RentableItemsSubtab(WebDriver driver) { super(driver);}
    public boolean clickRentableItemsEditButton() { return clickElement(RENTABLE_ITEMS_EDIT_BUTTON, waitTimes.LONG_WAIT); }
    public boolean clickRentableItemsDeleteButton() { return clickElement(RENTABLE_ITEMS_DELETE_BUTTON); }
    public boolean clickRentableItemsYesButton() { return clickElement(RENTABLE_ITEMS_YES_BUTTON); }
    public boolean sendKeysRentableItemsTextBox() { return sendKeysToElement(RENTABLE_ITEMS_TEXT_BOX, "test", waitTimes.LONG_WAIT); }

    public boolean clickRentableItemsSaveButton() { return clickElement(RENTABLE_ITEMS_SAVE_BUTTON); }
    public boolean clickRentableItemsManageInventoryButton() { return clickElement(RENTABLE_ITEMS_MANAGE_INVENTORY_BUTTON, waitTimes.LONG_WAIT); }
    public boolean clickRentableItemsManageInventoryEditButton() { return clickElement(RENTABLE_ITEMS_MANAGE_INVENTORY_EDIT_BUTTON, waitTimes.LONG_WAIT); }
    public boolean sendKeysRentableItemsManageInventoryTextBox() { return sendKeysToElement(RENTABLE_ITEMS_MANAGE_INVENTORY_TEXT_BOX, "test"); }
    public boolean clickRentableItemsManageInventorySaveButton() { return clickElement(RENTABLE_ITEMS_MANAGE_INVENTORY_SAVE_BUTTON); }

    public boolean clickAddRentableItemCategoryButton() { return clickElement(RENTABLE_ITEM_ADD_ITEM_CATEGORY_BUTTON, waitTimes.LONG_WAIT); }
    public boolean clickRentableItemCategoryTypeDropdown() { return clickElement(RENTABLE_ITEM_CATEGORY_TYPE_DROPDOWN, waitTimes.LONG_WAIT); }
    public boolean clickValueGarageFromTypeDropDown() { return selectElementByValue(RENTABLE_ITEM_CATEGORY_TYPE_DROPDOWN, "275"); }
    public boolean clickCustomizeNameToggle() { return clickElement(RENTABLE_ITEM_CATEGORY_CUSTOMIZE_NAME_TOGGLE, waitTimes.LONG_WAIT); }
    public boolean sendKeysRentableItemCustomNameTextBox() { return sendKeysToElement(RENTABLE_ITEM_CUSTOM_NAME_TEXT_BOX, "Garage"); }
    public boolean clickRentableItemCategorySaveButton() { return clickElement(RENTABLE_ITEM_CATEGORY_SAVE_BUTTON); }


    public String getTextOfRentableItemsTextBox() {
        return getElementText(RENTABLE_ITEMS_TEXT_BOX, waitTimes.LONG_WAIT); }
    public String getTextOfRentableItemsManageInventoryTextBox() {
        return getElementText(RENTABLE_ITEMS_MANAGE_INVENTORY_TEXT_BOX, waitTimes.LONG_WAIT); }
    public String getTextOfRentableItemCustomNameTextBox() {
        return getElementText(RENTABLE_ITEM_CUSTOM_NAME_TEXT_BOX, waitTimes.LONG_WAIT); }

    }
