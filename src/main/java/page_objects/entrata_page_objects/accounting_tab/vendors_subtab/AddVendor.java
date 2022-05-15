package page_objects.entrata_page_objects.accounting_tab.vendors_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddVendor extends BasePage {


    private final By ADD_VENDOR_FORM = By.id("frm_business_info");
    private final By BUSINESS_NAME = By.id("company_name");
    private final By VENDOR_TYPE = By.name("ap_payee[ap_payee_type_id]");
    private final By VENDOR_ENTITY = By.name("ap_legal_entities[owner_type_id]");
    private final By DEFAULT_PAYMENT_TERMS = By.name("ap_payee[ap_payee_term_id]");
    private final By LOCATION_NAME = By.name("ap_payee_locations[location_name]");
    private final By ADD_PROPERTIES_BUTTON = By.cssSelector("#property_groupid #addbutton > .add");
    private final By ADD_ALL_PROPERTIES = By.cssSelector("#property_groupid_selector .js-all-properties > .add");
    private final By SUBMIT_NEW_VENDOR = By.id("add_ap_payee");
    private final By VENDORS_PAGE = By.id("div_payee_name");
    private final By VENDOR_CODE = By.name("ap_payee_locations[vendor_code]");
    private final By VENDOR_EIN = By.id("taxpayer_id");
    private final By NAME_ON_TAX_RETURN = By.id("entity_name");
    private final By DEFAULT_GL_ACCOUNT = By.name("ap_payee_gl_account_id");
    private final By PAY_ON_SAME_CHECK = By.id("group_invoices");
    private final By SERVICE_LOCATION = By.xpath("//*[@id=\"stepContent\"]/div[3]/div[1]/div/fieldset/div[11]/div");
    private final By SERVICE_PROVIDED = By.id("sp_search_combobox");
    private final By WEBSITE_URL = By.name("ap_payee[website_url]");
    private final By COUNTRY = By.name("location_address[postal_addresses][default][country]");
    private final By ADDRESS_LINE_ONE = By.name("location_address[postal_addresses][default][addressLine1]");
    private final By ADDRESS_LINE_TWO = By.name("location_address[postal_addresses][default][addressLine2]");
    private final By ADDRESS_LINE_THREE = By.name("location_address[postal_addresses][default][addressLine3]");
    private final By CITY = By.name("location_address[postal_addresses][default][locality]");
    private final By STATE = By.name("location_address[postal_addresses][default][administrativeArea]");
    private final By ZIPCODE = By.name("location_address[postal_addresses][default][postalCode]");
    private final By DUNS_NUMBER = By.name("ap_payee_locations[duns_number]");
    private final By VENDOR_APPROVED_ALL_PROPERTIES = By.id("toggle_all_properties");
    private final By EXTERNAL_ID = By.name("ap_payee[secondary_number]");
    private final By NOTES = By.name("ap_payee[notes]");
    private final By GENERATE_1099 = By.id("generate_1099");

    //Remittance Options Elements

    private final By REMITTANCE_TYPE = By.id("remittance_type_id");
    private final By REMITTANCE_NAME = By.id("remittance_name");

    //**Check Options**

    private final By REMITTANCE_ADDRESS_LINE_ONE = By.name("remittance_address[postal_addresses][default][addressLine1]");
    private final By REMITTANCE_ADDRESS_LINE_TWO = By.name("remittance_address[postal_addresses][default][addressLine2]");
    private final By REMITTANCE_ADDRESS_LINE_THREE = By.name("remittance_address[postal_addresses][default][addressLine3]");
    private final By REMITTANCE_CITY = By.name("remittance_address[postal_addresses][default][locality]");
    private final By REMITTANCE_STATE = By.name("remittance_address[postal_addresses][default][administrativeArea]");
    private final By REMITTANCE_ZIP = By.name("remittance_address[postal_addresses][default][postalCode]");

    //**ACH Options**

    private final By BANK_ACCOUNT_TYPE = By.name("ap_remittances[check_account_type_id]");
    private final By ACH_NAME_ON_ACCOUNT = By.name("ap_remittances[check_name_on_account]");
    private final By ACH_ROUTING_NUMBER = By.name("ap_remittances[check_routing_number]");
    private final By ACH_ACCOUNT_NUMBER = By.name("ap_remittances[check_account_number_encrypted]");

    //Contact Options Elements

    private final By CONTACT_FIRST_NAME = By.name("ap_payee_contact[name_first]");
    private final By CONTACT_LAST_NAME = By.name("ap_payee_contact[name_last]");
    private final By CONTACT_POSITION = By.name("ap_payee_contact[title]");
    private final By CONTACT_PHONE = By.xpath("//*[@id=\"stepContent\"]/div[3]/div[4]/div/fieldset/div[4]/div");
    private final By CONTACT_PHONE_EXT = By.xpath("//*[@id=\"stepContent\"]/div[3]/div[4]/div/fieldset/div[4]/input");
    private final By CONTACT_FAX = By.xpath("//*[@id=\"stepContent\"]/div[3]/div[4]/div/fieldset/div[5]/div");
    private final By CONTACT_EMAIL = By.name("ap_payee_contact[email_address]");

    //Account Options Elements

    private final By ACCOUNT_NUMBER = By.name("ap_payee_account[0][account_number]");
    private final By ACCOUNT_DESCRIPTION = By.name("ap_payee_account[0][account_description]");
    private final By ACCOUNT_PROPERTY = By.id("property_search_combobox_0");
    private final By ACCOUNT_DEFAULT_GL_ACCOUNT = By.id("gl_account_search_combobox_0");

    //Intercompany Elements

    private final By INTERCOMPANY_AR_ENTITY_DROPDOWN = By.id("select_ar_entity");
    private final By INTERCOMPANY_AR_ENTITY_FIRST_OPTION = By.cssSelector("li[id*='intercompany_property']");



    public AddVendor(WebDriver driver) {
        super(driver);
    }

    //Add Vendor Methods

    public boolean enterBusinessName(String name) {
        return sendKeysToElement(BUSINESS_NAME, name);
    }

    public boolean selectVendorType(String value) {
        return selectElementByValue(VENDOR_TYPE, value);
    }

    public boolean selectVendorEntity(String value) {
        return selectElementByValue(VENDOR_ENTITY, value);
    }

    public boolean selectDefaultPaymentTerms(String value) {
        return selectElementByValue(DEFAULT_PAYMENT_TERMS, value);
    }

    public boolean enterLocationName(String name) {
        return sendKeysToElement(LOCATION_NAME, name);
    }

    public boolean addPropertiesButton() {
        return clickElement(ADD_PROPERTIES_BUTTON);
    }

    public boolean addAllProperties() { return clickElement(ADD_ALL_PROPERTIES); }

    public boolean submitNewVendor() {
        return clickElement(SUBMIT_NEW_VENDOR);
    }

    public boolean vendorsPageCheck() {
        return confirmElementIsVisible(VENDORS_PAGE);
    }

    //Remittance Options Methods

    public boolean selectRemittanceType(String value) {
        return selectElementByValue(REMITTANCE_TYPE, value);
    }

    //**ACH Options**

    public boolean selectBankAccountType(String value) {
        return selectElementByValue(BANK_ACCOUNT_TYPE, value);
    }

    public boolean inputNameOnAccount(String name) {
        return sendKeysToElement(ACH_NAME_ON_ACCOUNT, name);
    }

    public boolean inputRoutingNumber(String num) {
        return sendKeysToElement(ACH_ROUTING_NUMBER, num);
    }

    public boolean inputAccountNumber(String num) {
        return sendKeysToElement(ACH_ACCOUNT_NUMBER, num);
    }

    //Intercompany Methods

    public boolean intercompanyEntityDropdownClick() {
        return clickElement(INTERCOMPANY_AR_ENTITY_DROPDOWN);
    }

    public boolean intercompanyEntityFirstOptionClick() {
        return clickElement(INTERCOMPANY_AR_ENTITY_FIRST_OPTION);
    }


    //VISIBLE ELEMENTS

    //Add Vendor Page

    public boolean addVendorFormVisible() {
        return confirmElementIsVisible(ADD_VENDOR_FORM);
    }

    public boolean vendorCodeVisible() {
        return confirmElementIsVisible(VENDOR_CODE);
    }

    public boolean einVisible() {
        return confirmElementIsVisible(VENDOR_EIN);
    }

    public boolean businessNameVisible() {
        return confirmElementIsVisible(BUSINESS_NAME);
    }

    public boolean nameOnTaxReturnVisible() {
        return confirmElementIsVisible(NAME_ON_TAX_RETURN);
    }

    public boolean vendorTypeVisible() {
        return confirmElementIsVisible(VENDOR_TYPE);
    }

    public boolean entityTypeVisible() {
        return confirmElementIsVisible(VENDOR_ENTITY);
    }

    public boolean defaultPaymentTermsVisible() {
        return confirmElementIsVisible(DEFAULT_PAYMENT_TERMS);
    }

    public boolean defaultGlAccountVisible() {
        return confirmElementIsVisible(DEFAULT_GL_ACCOUNT);
    }

    public boolean payOnSameCheckVisible() {
        return confirmElementIsVisible(PAY_ON_SAME_CHECK);
    }

    public boolean serviceLocationVisible() {
        return confirmElementIsVisible(SERVICE_LOCATION);
    }

    public boolean serviceProvidedVisible() {
        return confirmElementIsVisible(SERVICE_PROVIDED);
    }

    public boolean websiteVisible() {
        return confirmElementIsVisible(WEBSITE_URL);
    }

    public boolean locationNameVisible() {
        return confirmElementIsVisible(LOCATION_NAME);
    }

    public boolean countryVisible() {
        return confirmElementIsVisible(COUNTRY);
    }

    public boolean addressLineOneVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_ONE);
    }

    public boolean addressLineTwoVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_TWO);
    }

    public boolean addressLineThreeVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_THREE);
    }

    public boolean cityVisible() {
        return confirmElementIsVisible(CITY);
    }

    public boolean stateVisible() {
        return confirmElementIsVisible(STATE);
    }

    public boolean zipVisible() {
        return confirmElementIsVisible(ZIPCODE);
    }

    public boolean dunsNumberVisible() {
        return confirmElementIsVisible(DUNS_NUMBER);
    }

    public boolean vendorApprovedForAllPropertiesVisible() {
        return confirmElementIsVisible(VENDOR_APPROVED_ALL_PROPERTIES);
    }

    public boolean approvedPropertiesVisible() {
        return confirmElementIsVisible(ADD_PROPERTIES_BUTTON);
    }

    public boolean externalIdVisible() {
        return confirmElementIsVisible(EXTERNAL_ID);
    }

    public boolean notesVisible() {
        return confirmElementIsVisible(NOTES);
    }

    public boolean generate1099Visible() {
        return confirmElementIsVisible(GENERATE_1099);
    }

    public boolean remittanceTypeVisible() {
        return confirmElementIsVisible(REMITTANCE_TYPE);
    }

    public boolean remittanceNameVisible() {
        return confirmElementIsVisible(REMITTANCE_NAME);
    }

    public boolean remittanceCountryVisible() {
        return confirmElementIsVisible(COUNTRY);
    }

    public boolean remittanceAddressOneVisible() {
        return confirmElementIsVisible(REMITTANCE_ADDRESS_LINE_ONE);
    }

    public boolean remittanceAddressTwoVisible() { return confirmElementIsVisible(REMITTANCE_ADDRESS_LINE_TWO); }

    public boolean remittanceAddressThreeVisible() {
        return confirmElementIsVisible(REMITTANCE_ADDRESS_LINE_THREE);
    }

    public boolean remittanceCityVisible() {
        return confirmElementIsVisible(REMITTANCE_CITY);
    }

    public boolean remittanceStateVisible() {
        return confirmElementIsVisible(REMITTANCE_STATE);
    }

    public boolean remittanceZipVisible() {
        return confirmElementIsVisible(REMITTANCE_ZIP);
    }

    public boolean contactFirstNameVisible() {
        return confirmElementIsVisible(CONTACT_FIRST_NAME);
    }

    public boolean contactLastNameVisible() {
        return confirmElementIsVisible(CONTACT_LAST_NAME);
    }

    public boolean contactPositionVisible() {
        return confirmElementIsVisible(CONTACT_POSITION);
    }

    public boolean contactPhoneVisible() {
        return confirmElementIsVisible(CONTACT_PHONE);
    }

    public boolean contactPhoneExtVisible() {
        return confirmElementIsVisible(CONTACT_PHONE_EXT);
    }

    public boolean contactFaxVisible() {
        return confirmElementIsVisible(CONTACT_FAX);
    }

    public boolean contactEmailVisible() {
        return confirmElementIsVisible(CONTACT_EMAIL);
    }

    public boolean accountNumberVisible() {
        return confirmElementIsVisible(ACCOUNT_NUMBER);
    }

    public boolean accountDescriptionVisible() {
        return confirmElementIsVisible(ACCOUNT_DESCRIPTION);
    }

    public boolean accountPropertyVisible() {
        return confirmElementIsVisible(ACCOUNT_PROPERTY);
    }

    public boolean accountDefaultGlAccountVisible() {
        return confirmElementIsVisible(ACCOUNT_DEFAULT_GL_ACCOUNT);
    }
}
