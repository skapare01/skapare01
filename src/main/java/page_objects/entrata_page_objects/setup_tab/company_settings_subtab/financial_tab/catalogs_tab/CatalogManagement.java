package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CatalogManagement extends BasePage {

    public CatalogManagement(WebDriver driver) {
        super(driver);
    }

    private final By CATALOG_MANAGEMENT = By.id("li_sub_nav_catalog_items_setupxxx");
    private final By ADD_CATALOG_ITEM_BUTTON = By.id("add_ap_codes_btn");
    private final By ADD_CATALOG_ITEM_FORM = By.id("add_edit_ap_code_div");
    private final By ITEM_CATEGORY_DROPDOWN = By.xpath("//*[@id=\"catalog_items_list\"]/div[2]/ul/li[2]/a");
    private final By ADD_CATALOG_ITEM_CATEGORY = By.id("add_ap_code_category_btn");
    private final By ADD_CATALOG_ITEM_CATEGORY_FORM = By.id("add_ap_code_category");
    private final By CATEGORY_NAME = By.name("ap_code_category[name]");
    private final By CATEGORY_DESCRIPTION = By.name("ap_code_category[description]");
    private final By ENABLED_TOGGLE = By.xpath("//*[@id=\"add_ap_code_category_form\"]/fieldset/div[3]/div");
    private final By ADD_ITEM_CATEGORY_BUTTON = By.id("ap_code_category_submit");
    private final By CANCEL_HYPERLINK = By.id("ap_code_category_cancel");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    public boolean catalogManagementClick() {
        return clickElement(CATALOG_MANAGEMENT);
    }

    public boolean addCatalogItemButtonClick() {
        return clickElement(ADD_CATALOG_ITEM_BUTTON);
    }

    public boolean itemCategoryDropdownClick() {
        return clickElement(ITEM_CATEGORY_DROPDOWN);
    }

    public boolean addCatalogItemCategoryClick() {
        return clickElement(ADD_CATALOG_ITEM_CATEGORY);
    }

    public boolean addItemCategoryButtonClick() {
        return clickElement(ADD_ITEM_CATEGORY_BUTTON);
    }

    public boolean categoryNameInput(String name) {
        return sendKeysToElement(CATEGORY_NAME, name);
    }

    public boolean categoryDetailsInput(String details) {
        return sendKeysToElement(CATEGORY_DESCRIPTION, details);
    }


    //Visibility

    public boolean addCatalogItemFormVisible() {
        return confirmElementIsVisible(ADD_CATALOG_ITEM_FORM);
    }

    public boolean addCatalogItemCategoryFormVisible() {
        return confirmElementIsVisible(ADD_CATALOG_ITEM_CATEGORY_FORM);
    }

    public boolean categoryNameVisible() {
        return confirmElementIsVisible(CATEGORY_NAME);
    }

    public boolean categoryDescriptionVisible() {
        return confirmElementIsVisible(CATEGORY_DESCRIPTION);
    }

    public boolean enabledToggleVisible() {
        return confirmElementIsVisible(ENABLED_TOGGLE);
    }

    public boolean addItemCategoryButtonVisible() {
        return confirmElementIsVisible(ADD_ITEM_CATEGORY_BUTTON);
    }

    public boolean cancelHyperlinkVisible() {
        return confirmElementIsVisible(CANCEL_HYPERLINK);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
