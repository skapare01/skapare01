package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AssetCondition extends BasePage {

    public AssetCondition(WebDriver driver) {
        super(driver);
    }

    private final By FIXED_ASSETS_TAB = By.id("li_sub_nav_fixed_assets_setupxxx");
    private final By FIRST_ASSET_CONDITION = By.cssSelector("td[class='edit_asset_condition action']");
    private final By ADD_ASSET_CONDITION_BUTTON = By.id("create_asset_condition");
    private final By ADD_ASSET_FORM = By.id("add_asset_condition_form");
    private final By ASSET_NAME = By.name("asset_condition[name]");
    private final By ASSET_DESCRIPTION = By.name("asset_condition[description]");
    private final By ASSET_ENABLED_TOGGLE = By.xpath("//*[@id=\"add_asset_condition_form\"]/fieldset/div[3]/div");
    private final By ADD_ASSET_BUTTON = By.id("add_asset_condition");
    private final By CANCEL_ASSET_HYPERLINK = By.id("add_edit_asset_condition_cancel");
    private final By DELETE_SELECTED_ASSET = By.id("delete_asset_condition");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    public boolean fixedAssetsTabClick() {
        return clickElement(FIXED_ASSETS_TAB);
    }

    public boolean addAssetConditionButtonClick() {
        moveToAnElementWithActions(FIRST_ASSET_CONDITION);
        return clickElement(ADD_ASSET_CONDITION_BUTTON);
    }

    public boolean addAssetConditionName(String name) {
        return sendKeysToElement(ASSET_NAME, name);
    }

    public boolean assetConditionSubmit() {
        return clickElement(ADD_ASSET_BUTTON);
    }

    public boolean firstAssetConditionClick() {
        return clickElement(FIRST_ASSET_CONDITION);
    }

    public boolean firstAssetConditionDeleteClick() {
        return clickElement(DELETE_SELECTED_ASSET);
    }


    //Visibility

    public boolean addAssetFormVisible() {
        return confirmElementIsVisible(ADD_ASSET_FORM);
    }

    public boolean assetNameVisible() {
        return confirmElementIsVisible(ASSET_NAME);
    }

    public boolean assetDescriptionVisible() {
        return confirmElementIsVisible(ASSET_DESCRIPTION);
    }

    public boolean assetEnablesToggleVisible() {
        return confirmElementIsVisible(ASSET_ENABLED_TOGGLE);
    }

    public boolean addAssetButtonVisible() {
        return confirmElementIsVisible(ADD_ASSET_BUTTON);
    }

    public boolean cancelAssetHyperlinkVisible() {
        return confirmElementIsVisible(CANCEL_ASSET_HYPERLINK);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
