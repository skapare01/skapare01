package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;


public class TaxCreditsPage extends BasePage {

    public TaxCreditsPage(WebDriver driver) {
        super(driver);
    }

    RandomGenerator rand = new RandomGenerator();

    //Tax Credit locators
    private final By TAX_CREDIT_PROPERTY_INFO_SECTION = By.xpath("//*[@id=\"tax_credit_property_information\"]/h3");
    private final By TAX_CREDIT_PROGRAMS_SECTION = By.xpath("//*[@id=\"VIEW_TAX_CREDIT_PROGRAMS\"]/h3");
    private final By TAX_CREDIT_CERTIFICATIONS_SECTION = By.xpath("//*[@id=\"tax_credit_certification_div\"]/h3");
    private final By TAX_CREDIT_HOUSEHOLD_COMPOSITION = By.xpath("//*[@id=\"tax_credit_household_composition_div\"]/h4");
    private final By EDIT_TAX_CREDIT_PROPERTY_INFORMATION = By.cssSelector("a[class='button action right nomargin nohref binded-nohref-click']");
    private final By PROJECT_NAME_FIELD = By.cssSelector("input[name='property_subsidy_details[tax_credit_project_name]']");
    //Tax Credit Property Information section locators
    private final By PROGRAM_NUMBER_FIELD = By.cssSelector("input[name='property_subsidy_details[tax_credit_project_number]']");
    private final By TENANT_INCOME_CERTIFICATION = By.id("file_type_id");
    private final By HOLD_HARMLESS_PROJECT_TOGGLE = By.className("js-tax-credit-is-hold-harmless");
    private final By VAWA_TOGGLE = By.xpath("//label[text()='Enable VAWA Compliance Tracking']");
    private final By LOADING_OVERLAY_TAX_CREDIT = By.className("loading-overlay");
    private final By HERA_INCOME_LIMITS = By.xpath("//label[text()='Use HERA Income Limits:']");
    private final String RANDOM_PROGRAM_NUMBER = rand.randomSocialSecurityNumber();
    private final By PROPERTY_INFORMATION_SAVE_BUTTON = By.className("js-save-property-info");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    //Tax Credit Certification section locators
    private final By EDIT_CERTIFICATION_SETTINGS_BUTTON = By.id("tax_credit_certification_details-button");
    private final By TAX_CREDIT_RECERT_REQUIREMENTS_DROPDOWN = By.cssSelector("select[id='TAX_CREDIT_RECERTIFICATION_REQUIREMENTS']");
    private final By RECERTIFY_ON_FIRST_DAY_ANNIVERSARY_MONTH = By.cssSelector("input[value='First Day of the Anniversary Month']");
    private final By RECERTIFY_ON_ANNIVERSARY_DATE = By.cssSelector("input[value='Anniversary Date']");
    private final By CERTIFICATIONS_SAVE_BUTTON = By.cssSelector("input[class='form-submit js-group-submit']");
    private final By CERTIFICATION_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    //Tax Credit set aside program locators
    private final By CLICK_FIRST_SET_ASIDE_PROGRAM = By.cssSelector("#programs-view > table > tbody > tr:nth-child(2) > td");
    private final By GENERAL_TAB = By.id("general_tab");
    private final By RENT_UTILITY_ALLOWANCE_TAB = By.id("rent_and_utility_allowance_tab");
    private final By MAX_GROSS_RENT_AND_RENT_FLOOR_SECTION = By.cssSelector(".js-rent-schedule > b > h4");
    private final By UTILITY_ALLOWANCE_SECTION = By.id("utility_allowance");
    private final By EDIT_MAX_GROSS_RENT_AND_RENT_FLOORS_BUTTON = By.cssSelector("a[class='button action right js-edit-max-rent-and-rent-floors']");
    private final By MAX_GROSS_RENT_TEXT_BOX = By.cssSelector("input[js-data-field-name='max_rent']");
    private final By RENT_FLOOR_TEXT_BOX = By.cssSelector("input[js-data-field-name='min_rent']");
    private final By DEFAULT_TENANT_RENT = By.cssSelector("input[js-data-field-name='default_rent']");
    private final By SUBMIT_BUTTON_EDIT_MAX_GROSS_RENT = By.cssSelector("input[class='form-submit js-form-submit']");
    private final By SUCCESS_MESSAGE_AFTER_UPDATING_MAX_GROSS_RENT = By.cssSelector("p[class='alert success slim']");
    private final By EDIT_UTILITY_ALLOWANCE_BUTTON = By.id("edit_historical_rent_schedules");
    private final By EDIT_UTILITY_ALLOWANCE_TEXT_B0X = By.cssSelector("input[class='js-change-name form-dollar js-utility-allowance']");
    private final By SAVE_BUTTON_UTILITY_ALLOWANCE = By.id("submitted");
    private final By UTILITY_ALLOWANCE_SAVED_AMOUNT = By.cssSelector("#utility_allowance > b > b > table > tbody > tr:nth-child(2) > td:nth-child(3)");

    //Tax Credit sections methods
    public String confirmTaxCreditPropertyInfoSection() {
        return getElementText(TAX_CREDIT_PROPERTY_INFO_SECTION);
    }

    public String confirmTaxCreditProgramsSection() {
        return getElementText(TAX_CREDIT_PROGRAMS_SECTION);
    }

    public String confirmTaxCreditCertificationSection() {
        return getElementText(TAX_CREDIT_CERTIFICATIONS_SECTION);
    }

    public String confirmTaxCreditHouseholdCompositionSection() {
        return getElementText(TAX_CREDIT_HOUSEHOLD_COMPOSITION);
    }

    //Tax Credit Property Information methods
    public boolean clickEditPropertyInformation() {
        waitForOverlay(LOADING_OVERLAY_TAX_CREDIT);
        return clickElement(EDIT_TAX_CREDIT_PROPERTY_INFORMATION);
    }

    public boolean confirmTenantIncomeCertificationField() {
        return confirmElementIsVisible(TENANT_INCOME_CERTIFICATION);
    }

    public boolean clickHoldHarmlessProjectToggle() {
        return clickElement(HOLD_HARMLESS_PROJECT_TOGGLE);
    }

    public boolean confirmHERAIncomeLimitsToggle() {
        return confirmElementIsVisible(HERA_INCOME_LIMITS);
    }

    public boolean confirmVAWAToggle() {
        return confirmElementIsVisible(VAWA_TOGGLE);
    }

    public boolean enterProjectName(String enter) {
        return sendKeysToElement(PROJECT_NAME_FIELD, enter);
    }

    public boolean enterProgramNumber() {
        return sendKeysToElement(PROGRAM_NUMBER_FIELD, RANDOM_PROGRAM_NUMBER);
    }

    public boolean clickSaveButton() {
        return clickElement(PROPERTY_INFORMATION_SAVE_BUTTON);
    }

    public boolean clearProjectNameField() {
        return elementClearTextField(PROJECT_NAME_FIELD);
    }

    public boolean clearProgramNumberField() {
        return elementClearTextField(PROGRAM_NUMBER_FIELD);
    }

    public boolean confirmSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    //Tax Credit Certification methods
    public boolean clickEditCertificationSettingsButton() {
        return clickElement(EDIT_CERTIFICATION_SETTINGS_BUTTON);
    }

    public boolean selectPerformAnnualCertificationsOption(String value) {
        return selectElementByValue(TAX_CREDIT_RECERT_REQUIREMENTS_DROPDOWN, "5");
    }

    public boolean clickFirstDayOfAnniversaryMonthRadioButton() {
        return clickElement(RECERTIFY_ON_FIRST_DAY_ANNIVERSARY_MONTH);
    }

    public boolean clickAnniversaryDateRadioButton() {
        return clickElement(RECERTIFY_ON_ANNIVERSARY_DATE);
    }

    public boolean clickSaveButtonCertificationSettings() {
        return clickElement(CERTIFICATIONS_SAVE_BUTTON);
    }

    public boolean confirmCertificationsSuccessMessage() {
        return confirmElementIsVisible(CERTIFICATION_SUCCESS_MESSAGE);
    }

    //Tax Credit set aside program methods
    public boolean clickSetAsideFirstResult() {
        return clickElement(CLICK_FIRST_SET_ASIDE_PROGRAM);
    }

    public boolean confirmGeneralTab() {
        return confirmElementIsVisible(GENERAL_TAB);
    }

    public boolean clickRentUtilityAllowanceTab() {
        return clickElement(RENT_UTILITY_ALLOWANCE_TAB);
    }

    public boolean confirmRentUtilityAllowanceTab() {
        return confirmElementIsVisible(RENT_UTILITY_ALLOWANCE_TAB);
    }

    public String confirmMaxGrossRentAndRentFloorSection() {
        return getElementText(MAX_GROSS_RENT_AND_RENT_FLOOR_SECTION);
    }

    public boolean confirmUtilityAllowanceSection() {
        return confirmElementIsVisible(UTILITY_ALLOWANCE_SECTION);
    }

    public boolean clickEditMaxGrossRentAndRentFloorsButton() {
        return clickElement(EDIT_MAX_GROSS_RENT_AND_RENT_FLOORS_BUTTON);
    }

    public boolean clearTextMaxGrossRentTextBox() {
        return elementClearTextField(MAX_GROSS_RENT_TEXT_BOX);
    }

    public boolean enterAmountMaxGrossRentTextBox(String amount) {
        return sendKeysToElement(MAX_GROSS_RENT_TEXT_BOX, amount);
    }

    public boolean clearTextRentFloorTextBox() {
        return elementClearTextField(RENT_FLOOR_TEXT_BOX);
    }

    public boolean enterAmountRentFloorTextBox(String amount) {
        return sendKeysToElement(RENT_FLOOR_TEXT_BOX, amount);
    }

    public boolean clearTextDefaultTenantRentTextBox() {
        return elementClearTextField(DEFAULT_TENANT_RENT);
    }

    public boolean enterAmountDefaultTenantRentTextBox(String amount) {
        return sendKeysToElement(DEFAULT_TENANT_RENT, amount);
    }

    public boolean clickSubmitButtonEditMaxGrossRent() {
        return clickElement(SUBMIT_BUTTON_EDIT_MAX_GROSS_RENT);
    }

    public boolean confirmSuccessMessageAfterEditingMaxGrossRent() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_AFTER_UPDATING_MAX_GROSS_RENT);
    }

    public boolean clickEditUtilityAllowanceButton() {
        return clickElement(EDIT_UTILITY_ALLOWANCE_BUTTON);
    }

    public boolean clearTextEditUtilityAllowance() {
        return elementClearTextField(EDIT_UTILITY_ALLOWANCE_TEXT_B0X);
    }

    public boolean enterAmountUtilityAllowance(String amount) {
        return sendKeysToElement(EDIT_UTILITY_ALLOWANCE_TEXT_B0X, amount);
    }

    public boolean clickSaveAfterEditingUtilityAllowance() {
        return clickElement(SAVE_BUTTON_UTILITY_ALLOWANCE);
    }

    public String confirmSavedUtilityAmount() {
        waitForUtilityAllowanceEditOverlay();
        return getElementText(UTILITY_ALLOWANCE_SAVED_AMOUNT);
    }

    private void waitForUtilityAllowanceEditOverlay() {
        waitForOverlay(LOADING_OVERLAY_TAX_CREDIT);
    }

}
