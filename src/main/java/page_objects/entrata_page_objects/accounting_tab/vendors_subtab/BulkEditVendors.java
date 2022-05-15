package page_objects.entrata_page_objects.accounting_tab.vendors_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkEditVendors extends BasePage {

    //Search Form

    private final By BULK_EDIT_DROPDOWN = By.id("js-bulk-edit-dropdown");
    private final By EDITABLE_FIELDS_DROPDOWN = By.id("contacts_multiselect");
    private final By ALL_CONTACTS_OPTIONS = By.cssSelector("label[for='contacts_option_0']");
    private final By VENDORS_NAME_DROPDOWN = By.cssSelector("div[class='form-multiselect wide-side width313 property-search  binded binded-hover-intent']");
    private final By SEARCH_VENDOR_NAME = By.id("option_filter_text");
    private final By ABEL_ACE_HARDWARE_SELECTOR = By.cssSelector("input[value='673936'][id*='ap_payee_name']");
    private final By CONTINUE_BUTTON = By.id("bulk_edit_vendor_frm_btn");

    //Results Form

    private final By CONTACT_FIRST_NAME = By.id("name_first_add");
    private final By CONTACT_LAST_NAME = By.id("name_last");
    private final By CONTACT_ASSOCIATED_LOCATIONS_DROPDOWN = By.id("advanced_location_id_3521850_multiselect");
    private final By ASSOCIATED_LOCATIONS_ALL_LOCATIONS_OPTION = By.id("advanced_location_id_3521850_option_0");
    private final By CONTACT_SET_AS_PRIMARY_CONTACT_DROPDOWN = By.id("advanced_primary_location_id_3521850_multiselect");
    private final By PRIMARY_CONTACT_ALL_LOCATIONS_OPTION = By.id("advanced_primary_location_id_3521850_option_0");
    private final By CONTACT_POSITION = By.id("title");
    private final By CONTACT_PHONE_AREA_CODE = By.cssSelector("input[class='areacode']");
    private final By CONTACT_PHONE_FIRST_DIGITS = By.cssSelector("input[class='first']");
    private final By CONTACT_PHONE_SECOND_DIGITS = By.cssSelector("input[class='second']");
    private final By CONTACT_FAX_AREA_CODE = By.xpath("//*[@class='form-phone width100 binded']/input[2]");
    private final By CONTACT_FAX_FIRST_DIGITS = By.xpath("//*[@class='form-phone width100 binded']/input[3]");
    private final By CONTACT_FAX_SECOND_DIGITS = By.xpath("//*[@class='form-phone width100 binded']/input[4]");
    private final By CONTACT_EMAIL = By.id("email_address");
    private final By SAVE_CHANGES_BUTTON = By.id("bulk_update_vendor_submit");


    public BulkEditVendors(WebDriver driver) {
        super(driver);
    }

    //Search Form

    public boolean bulkEditDropdownSelect(String value) {
        return selectElementByValue(BULK_EDIT_DROPDOWN, value);
    }

    public boolean editableFieldsDropdownClick() {
        return clickElement(EDITABLE_FIELDS_DROPDOWN);
    }

    public boolean allContactsOptionsClick() {
        return clickElement(ALL_CONTACTS_OPTIONS);
    }

    public boolean vendorsNameDropdownClick() {
        return clickElement(VENDORS_NAME_DROPDOWN);
    }

    public boolean searchVendorName(String name) {
        return sendKeysToElement(SEARCH_VENDOR_NAME, name);
    }

    public boolean firstListedVendorResultClick() {
        return clickElement(ABEL_ACE_HARDWARE_SELECTOR);
    }

    public boolean continueButtonClick() {
        return clickElement(CONTINUE_BUTTON);
    }

    //Results Form

    public boolean contactFirstNameInput(String firstName) {
        return sendKeysToElement(CONTACT_FIRST_NAME, firstName);
    }

    public boolean contactLastNameInput(String lastName) {
        return sendKeysToElement(CONTACT_LAST_NAME, lastName);
    }

    public boolean associatedLocationsDropdownClick() {
        return clickElement(CONTACT_ASSOCIATED_LOCATIONS_DROPDOWN);
    }

    public boolean associatedLocationsAllLocationsVisible() {
        return confirmElementIsVisible(ASSOCIATED_LOCATIONS_ALL_LOCATIONS_OPTION);
    }

    public boolean primaryContactDropdownClick() {
        return clickElement(CONTACT_SET_AS_PRIMARY_CONTACT_DROPDOWN);
    }

    public boolean primaryContactAllLocationsOptionVisible() {
        return confirmElementIsVisible(PRIMARY_CONTACT_ALL_LOCATIONS_OPTION);
    }

    public boolean contactPositionInput(String name) {
        return sendKeysToElement(CONTACT_POSITION, name);
    }

    public boolean contactPhoneAreaCodeInput(String num) {
        return sendKeysToElement(CONTACT_PHONE_AREA_CODE, num);
    }

    public boolean contactPhoneFirstDigitsInput(String num) {
        return sendKeysToElement(CONTACT_PHONE_FIRST_DIGITS, num);
    }

    public boolean contactPhoneSecondDigitsInput(String num) {
        return sendKeysToElement(CONTACT_PHONE_SECOND_DIGITS, num);
    }

    public boolean contactFaxAreaCodeInput(String num) {
        return sendKeysToElement(CONTACT_FAX_AREA_CODE, num);
    }

    public boolean contactFaxFirstDigitsInput(String num) {
        return sendKeysToElement(CONTACT_FAX_FIRST_DIGITS, num);
    }

    public boolean contactFaxSecondDigitsInput(String num) {
        return sendKeysToElement(CONTACT_FAX_SECOND_DIGITS, num);
    }

    public boolean contactEmailClear() {
        return elementClearTextField(CONTACT_EMAIL);
    }

    public boolean contactEmailInput(String email) {
        return sendKeysToElement(CONTACT_EMAIL, email);
    }

    public boolean saveChangesButtonClick() {
        return clickElement(SAVE_CHANGES_BUTTON);
    }
}
