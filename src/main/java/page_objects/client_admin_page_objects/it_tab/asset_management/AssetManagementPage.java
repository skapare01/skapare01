package page_objects.client_admin_page_objects.it_tab.asset_management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AssetManagementPage extends BasePage {
    public AssetManagementPage(WebDriver driver){
        super(driver);
    }
    private final By ADD_ASSET_BUTTON = By.id("add_asset_button");
    private final By ADD_BULK_ASSETS = By.xpath ("//*[text()='Add Bulk Assets']");
    private final By EDIT_ASSET_BUTTON = By.cssSelector(".edit");
    private final By ASSET_NOTES = By.id("asset-notes-modal");

    public boolean verifyAddAssetButton () {
        return confirmElementIsVisible(ADD_ASSET_BUTTON);
    }
    public boolean verifyAddBulkAssetsButton () {return confirmElementIsVisible(ADD_BULK_ASSETS);}
    public boolean clickEditAssetButton () {return clickElement(EDIT_ASSET_BUTTON);}
    public boolean verifyEditModal () {return confirmElementIsVisible(ASSET_NOTES, waitTimes.LONG_WAIT);}

}
