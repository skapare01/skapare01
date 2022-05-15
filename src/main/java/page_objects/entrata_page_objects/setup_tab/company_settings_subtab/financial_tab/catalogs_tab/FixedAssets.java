package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.audits.model.HeavyAdIssueDetails;
import page_objects.BasePage;

public class FixedAssets extends BasePage {

    public FixedAssets(WebDriver driver) {
        super(driver);
    }

    //Add Depreciation Category

    private final By FIXED_ASSETS_TAB = By.id("li_sub_nav_fixed_assets_setupxxx");
    private final By ADD_DEPRECIATION_CATEGORY_BUTTON = By.xpath("//*[@id=\"assetDepreciationDiv\"]/a");
    private final By ADD_DEPRECIATION_CATEGORY_FORM = By.id("add_depreciation_category");

    //Add Asset Condition

    private final By ADD_ASSET_CONDITION_BUTTON = By.id("create_asset_condition");
    private final By ADD_ASSET_CONDITION_FORM = By.id("add_asset_condition_div");
    private final By ASSET_CONDITION_STATUS_HEADER = By.xpath("//*[@id=\"view_asset_conditions_div\"]/b/table/tbody/tr[1]/th[3]");

    //Add Depreciation Category

    public boolean fixedAssetsTabClick() {
        return clickElement(FIXED_ASSETS_TAB);
    }

    public boolean addDepreciationCategoryButtonClick() {
        return clickElement(ADD_DEPRECIATION_CATEGORY_BUTTON);
    }

    //Visibility - Depreciation

    public boolean addDepreciationCategoryFormVisible() {
        return confirmElementIsVisible(ADD_DEPRECIATION_CATEGORY_FORM);
    }

    //Add Asset Condition

    public boolean assetConditionStatusFocus() {
        return moveToAnElementWithActions(ASSET_CONDITION_STATUS_HEADER);
    }

    public boolean addAssetConditionButtonClick() {
        return clickElement(ADD_ASSET_CONDITION_BUTTON);
    }

    //Visibility - Asset Condition

    public boolean addAssetConditionFormVisible() {
        return confirmElementIsVisible(ADD_ASSET_CONDITION_FORM);
    }
}
