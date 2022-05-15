package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor.vendor_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RemittanceOptions extends BasePage {

    private final By VENDOR_LOCATION_INFO = By.id("location_info-view");
    private final By REMITTANCE_OPTIONS = By.id("1099-view");
    private final By CONTACTS = By.id("view_ap_payee_contacts");
    private final By ACCOUNTS = By.xpath("//*[@id=\"view_location_info\"]/b[3]");
    private final By ADVANCED_SETTINGS = By.id("prequal-advanced");
    private final By EDIT_REMITTANCE = By.cssSelector("i[id*='edit_ap_remittance']");
    private final By VIEW_REMITTANCE = By.cssSelector("a[class*='view_remittance_details']");
    private final By ADD_REMITTANCE_OPTION = By.cssSelector("a[onclick*='Add Remittance Option']");
    private final By ADD_REMITTANCE_TYPE = By.id("remittance_type_id");
    private final By ADD_REMITTANCE_NAME = By.id("remittance_name");
    private final By ADDRESS = By.name("remittance_address[postal_addresses][default][country]");
    private final By ADD_REMITTANCE_ADDRESS_ONE = By.name("remittance_address[postal_addresses][default][addressLine1]");
    private final By ADD_REMITTANCE_ADDRESS_TWO = By.name("remittance_address[postal_addresses][default][addressLine2]");
    private final By ADD_REMITTANCE_ADDRESS_THREE = By.name("remittance_address[postal_addresses][default][addressLine3]");
    private final By ADD_REMITTANCE_CITY = By.name("remittance_address[postal_addresses][default][locality]");
    private final By ADD_REMITTANCE_STATE = By.name("remittance_address[postal_addresses][default][administrativeArea]");
    private final By ADD_REMITTANCE_ZIP = By.name("remittance_address[postal_addresses][default][postalCode]");
    private final By MAKE_DEFAULT_TOGGLE = By.id("toggle-button");
    private final By ADD_REMITTANCE_SUBMIT = By.id("submit_remittance");
    private final By CANCEL_REMITTANCE_HYPERLINK = By.cssSelector("a[class='cancel'][href*='javascript:void(0)']");
    private final By CLOSE_REMITTANCE_BOX = By.cssSelector("button[title='Close']");
    private final By VENDOR_LOCATIONS_PAGE = By.id("vendorBusinessInfoView");


    public RemittanceOptions(WebDriver driver) {
        super(driver);
    }

    public boolean addRemittanceOptionClick() {
        return clickElement(ADD_REMITTANCE_OPTION);
    }

    public boolean selectRemittanceType() {
        return selectElementByValue(ADD_REMITTANCE_TYPE, "3");
    }

    public boolean addNewRemittanceOptionClick() {
        return clickElement(ADD_REMITTANCE_SUBMIT);
    }

    public boolean editRemittanceClick() {
        return clickElement(EDIT_REMITTANCE);
    }

    public boolean clearRemittanceName() {
        return elementClearTextField(ADD_REMITTANCE_NAME);
    }

    public boolean inputRemittanceName(String name) {
        return sendKeysToElement(ADD_REMITTANCE_NAME, name);
    }


    //Visibility

    public boolean vendorLocationInfoVisible() {
        return confirmElementIsVisible(VENDOR_LOCATION_INFO);
    }

    public boolean remittanceOptionsVisible() {
        return confirmElementIsVisible(REMITTANCE_OPTIONS);
    }

    public boolean contactsVisible() {
        return confirmElementIsVisible(CONTACTS);
    }

    public boolean accountsVisible() {
        return confirmElementIsVisible(ACCOUNTS);
    }

    public boolean advancedSettingsVisible() {
        return confirmElementIsVisible(ADVANCED_SETTINGS);
    }

    public boolean editRemittanceVisible() {
        return confirmElementIsVisible(EDIT_REMITTANCE);
    }

    public boolean viewRemittanceVisible() {
        return confirmElementIsVisible(VIEW_REMITTANCE);
    }

    public boolean addRemittanceTypeVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_TYPE);
    }

    public boolean addRemittanceNameVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_NAME);
    }

    public boolean addressVisible() {
        return confirmElementIsVisible(ADDRESS);
    }

    public boolean addRemittanceAddressOneVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_ONE);
    }

    public boolean addRemittanceAddressTwoVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_TWO);
    }

    public boolean addRemittanceAddressThreeVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_THREE);
    }

    public boolean addRemittanceCityVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_CITY);
    }

    public boolean addRemittanceStateVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_STATE);
    }

    public boolean addRemittanceZipVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ZIP);
    }

    public boolean makeDefaultToggleVisible() {
        return confirmElementIsVisible(MAKE_DEFAULT_TOGGLE);
    }

    public boolean addRemittanceButtonVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_SUBMIT);
    }

    public boolean cancelRemittanceVisible() {
        return confirmElementIsVisible(CANCEL_REMITTANCE_HYPERLINK);
    }

    public boolean closeRemittanceBoxVisible() {
        return confirmElementIsVisible(CLOSE_REMITTANCE_BOX);
    }

    public boolean vendorLocationPageVisible() {
        return confirmElementIsVisible(VENDOR_LOCATIONS_PAGE);
    }
}
