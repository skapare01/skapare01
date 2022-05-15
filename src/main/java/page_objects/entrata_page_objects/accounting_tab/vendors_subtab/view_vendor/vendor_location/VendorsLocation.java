package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.vendor_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_objects.BasePage;

public class VendorsLocation extends BasePage {

    private final By VENDOR_CODE = By.name("ap_payee_location[vendor_code]");
    private final By COUNTRY = By.name("location_address[postal_addresses][default][country]");
    private final By ADDRESS_LINE_ONE = By.name("location_address[postal_addresses][default][addressLine1]");
    private final By ADDRESS_LINE_TWO = By.name("location_address[postal_addresses][default][addressLine2]");
    private final By ADDRESS_LINE_THREE = By.name("location_address[postal_addresses][default][addressLine3]");
    private final By CITY = By.name("location_address[postal_addresses][default][locality]");
    private final By STATE = By.name("location_address[postal_addresses][default][administrativeArea]");
    private final By ZIP = By.name("location_address[postal_addresses][default][postalCode]");
    private final By DUNS_NUMBER = By.name("ap_payee_location[duns_number]");
    private final By VENDOR_APPROVED_ALL_VENDORS = By.id("toggle_all_properties");
    private final By NOTES = By.name("ap_payee_location[notes]");
    private final By LOCATIONS_TAB = By.id("ap_payee_location_tab");
    private final By LOCATIONS_INFORMATION = By.id("ap_payee_system_container_div");
    private final By ADD_LOCATION = By.cssSelector("a[onclick*='create_location']");
    private final By ADD_LOCATION_FORM = By.id("form_add_location");
    private final By LOCATION_NAME = By.name("ap_payee_location[location_name]");
    private final By LEGAL_ENTITY = By.xpath("//*[@name=\"ap_payee_location[ap_legal_entity_id]\"]/option[2]");
    private final By LOCATION_REMITTANCE_TYPE = By.id("vendor_remittance_type_id");
    private final By LOCATION_REMITTANCE_NAME = By.name("ap_remittance_location[name]");
    private final By ADD_PROPERTIES_DIV_CLICK = By.id("property_groupid");
    private final By SUBMIT_LOCATION = By.id("submit_add_location");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");
    private final By FIRST_LISTED_LOCATION = By.cssSelector("a[onclick*='ap_payee_location[id]']");


    //ACH (eCheck)

    private final By ACH_NAME_ON_ACCOUNT = By.name("ap_remittance_location[check_name_on_account]");
    private final By ACH_ROUTING_NUMBER = By.name("ap_remittance_location[check_routing_number]");
    private final By ACH_ACCOUNT_NUMBER = By.name("ap_remittance_location[check_account_number_encrypted]");


    public VendorsLocation(WebDriver driver) {
        super(driver);
    }

    public boolean locationsTabClick() {
        return clickElement(LOCATIONS_TAB);
    }

    public boolean addLocationClick() {
        return clickElement(ADD_LOCATION);
    }

    public boolean locationName(String name) {
        return sendKeysToElement(LOCATION_NAME, name);
    }

    public boolean legalEntitySelect() {
        return clickElement(LEGAL_ENTITY);
    }

    public boolean remittanceTypeSelect(String num) {
        return selectElementByValue(LOCATION_REMITTANCE_TYPE, num);
    }

    public boolean addPropertiesDivClick() {
        return clickElement(ADD_PROPERTIES_DIV_CLICK);
    }

    public boolean submitLocation() {
        return clickElement(SUBMIT_LOCATION);
    }

    public boolean successBannerCheck() {
        return confirmElementIsVisible(SUCCESS_BANNER, waitTimes.LONG_WAIT);
    }

    public boolean vendorApprovedAllVendorsToggleVisible() {
        return confirmElementIsVisible(VENDOR_APPROVED_ALL_VENDORS);
    }

    public String getRemittanceName() {
        WebElement element = driver.findElement(LOCATION_REMITTANCE_NAME);
        return element.getAttribute("value");
    }

    public boolean firstListedLocationClick() {
        return clickElement(FIRST_LISTED_LOCATION);
    }

    public boolean addNameOnAccount(String name) {
        return sendKeysToElement(ACH_NAME_ON_ACCOUNT, name);
    }

    public boolean addRoutingNumber(String num) {
        return sendKeysToElement(ACH_ROUTING_NUMBER, num);
    }

    public boolean addAccountNumber(String num) {
        return sendKeysToElement(ACH_ACCOUNT_NUMBER, num);
    }


    //Visibility

    public boolean locationsInformationVisible() {
        return confirmElementIsVisible(LOCATIONS_INFORMATION);
    }

    public boolean addLocationFormVisible() {
        return confirmElementIsVisible(ADD_LOCATION_FORM);
    }

    public boolean notesVisible() {
        return confirmElementIsVisible(NOTES);
    }

    public boolean dunsNumberVisible() {
        return confirmElementIsVisible(DUNS_NUMBER);
    }

    public boolean vendorCodeVisible() {
        return confirmElementIsVisible(VENDOR_CODE);
    }

    public boolean countryVisible() {
        return confirmElementIsVisible(COUNTRY);
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
}
