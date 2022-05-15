package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.catalogs_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AssetLocation extends BasePage {

    public AssetLocation(WebDriver driver) {
        super(driver);
    }

    private final By ASSET_LOCATIONS = By.id("li_sub_nav_asset_locationxxx");
    private final By ADD_ASSET_LOCATION = By.id("add_asset_location_btn");
    private final By ADD_ASSET_LOCATION_FORM = By.id("add_asset_location");
    private final By LOCATION_NAME = By.name("asset_locations[name]");
    private final By ADDRESS = By.name("asset_location_address[postal_addresses][default][country]");
    private final By ADDRESS_LINE_ONE = By.name("asset_location_address[postal_addresses][default][addressLine1]");
    private final By ADDRESS_LINE_TWO = By.name("asset_location_address[postal_addresses][default][addressLine2]");
    private final By ADDRESS_LINE_THREE = By.name("asset_location_address[postal_addresses][default][addressLine3]");
    private final By CITY = By.name("asset_location_address[postal_addresses][default][locality]");
    private final By STATE = By.name("asset_location_address[postal_addresses][default][administrativeArea]");
    private final By ZIP = By.name("asset_location_address[postal_addresses][default][postalCode]");
    private final By PHONE_NUMBER = By.id("asset_locations[phone_number]-base");
    private final By ADD_PROPERTIES = By.id("addbutton");
    private final By ADD_ALL_PROPERTIES = By.xpath("//*[contains(@class, 'js-all-properties')]/i[2]");
    private final By SELECTED_PROPERTIES_BOX = By.id("property_group_asset_locationsproperty_group_id");
    private final By ADD_LOCATION_BUTTON = By.id("add_asset_location_submit");
    private final By CANCEL_LOCATION = By.id("add_asset_location_cancel");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    public boolean assetLocationsTabClick() {
        return clickElement(ASSET_LOCATIONS);
    }

    public boolean addAssetLocationClick() {
        return clickElement(ADD_ASSET_LOCATION);
    }

    public boolean locationName(String name) {
        return sendKeysToElement(LOCATION_NAME, name);
    }

    public boolean addPropertiesButton() {
        return clickElement(ADD_PROPERTIES);
    }

    public boolean addAllProperties() {
        return clickElement(ADD_ALL_PROPERTIES);
    }

    public boolean submitNewAssetLocation() {
        return clickElement(ADD_LOCATION_BUTTON);
    }



    //Visibility

    public boolean addAssetLocationFormVisible() {
        return confirmElementIsVisible(ADD_ASSET_LOCATION_FORM);
    }

    public boolean locationNameVisible() {
        return confirmElementIsVisible(LOCATION_NAME);
    }

    public boolean addressVisible() {
        return confirmElementIsVisible(ADDRESS  );
    }

    public boolean addressOneVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_ONE);
    }

    public boolean addressTwoVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_TWO);
    }

    public boolean addressThreeVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_THREE);
    }

    public boolean cityVisible() {
        return confirmElementIsVisible(CITY);
    }

    public boolean stateVisible() {
        return confirmElementIsVisible(STATE);
    }

    public boolean zipVisible() {
        return confirmElementIsVisible(ZIP);
    }

    public boolean phoneNumberVisible() {
        return confirmElementIsVisible(PHONE_NUMBER);
    }

    public boolean selectedPropertiesBoxVisible() {
        return confirmElementIsVisible(SELECTED_PROPERTIES_BOX);
    }

    public boolean addLocationVisible() {
        return confirmElementIsVisible(ADD_LOCATION_BUTTON);
    }

    public boolean cancelLocationVisible() {
        return confirmElementIsVisible(CANCEL_LOCATION);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
