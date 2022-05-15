package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HudPage extends BasePage {

    public HudPage(WebDriver driver) {
        super(driver);
    }

    //HUD locators
    private final By VERIFY_HUD_PROPERTY_INFO_SECTION = By.xpath("//*[@id=\"hud_property_details_div\"]/h3");
    private final By VERIFY_HUD_CERTIFICATION_SECTION = By.xpath("//*[@id=\"certification_details_div\"]/h3");
    private final By VERIFY_HUD_CONTRACTS_SECTION = By.xpath("//*[@id=\"hud_programs\"]/h3");
    //HUD certification settings locators
    private final By EDIT_CERTIFICATION_SETTINGS = By.id("certification_details-button");
    private final By ANNUAL_RECERTIFICATION_TIMING_DROPDOWN = By.id("ANNUAL_RECERTIFICATION_TIMING");
    private final By SAVE_BUTTON = By.xpath("//*[@id=\"certification_details-edit\"]/div[5]/div/input[2]");
    private final By CANCEL_BUTTON = By.linkText("Cancel");
    private final By BUILDING_COLUMN_BUILDINGS_RECERTIFY = By.xpath("//th[text()='Building']");
    private final By RECERTIFICATION_DATE_COLUMN_BUILDINGS_RECERTIFY = By.xpath("//th[text()='Recertification Date']");
    private final By ERROR_DISPLAYED_WHEN_MONTH_DAY_NOT_ENTERED = By.cssSelector("span[class='text-red']");
    private final By LOADING_OVERLAY_AFTER_DROPDOWN_SELECTION = By.className("loading-overlay");
    private final By BUILD_TWO_MONTH_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][101310][Month]']");
    private final By BUILD_TWO_DAY_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][101310][Day]']");
    private final By BUILDING_ONE_MONTH_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][85179][Month]']");
    private final By BUILDING_ONE_DAY_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][85179][Day]']");
    private final By OSHO_MONTH_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][107270][Month]']");
    private final By OSHO_DAY_SELECTION = By.cssSelector("select[name='subsidy_recertification_details[buildings][107270][Day]']");
    private final By MONTH_DROPDOWN_ALL_HOUSEHOLDS = By.cssSelector("select[name='subsidy_recertification_details[detail][date][Month]']");
    private final By DAY_DROPDOWN_ALL_HOUSEHOLDS = By.cssSelector("select[name='subsidy_recertification_details[detail][date][Day]']");
    //HUD Property Information locators
    private final By EDIT_HUD_PROPERTY_INFO_BUTTON = By.id("hud_property_details-button");
    private final By PROJECT_NAME_PROPERTY_INFO = By.id("HUD_PROJECT_NAME");
    private final By PROJECT_NUMBER_PROPERTY_INFO = By.id("HUD_PROJECT_NUMBER");
    private final By PROJECT_IMAX_ID = By.id("HUD_PROJECT_IMAX_ID_ENCRYPTED");
    private final By PROJECT_IMAX_PASSWORD = By.id("TEMP_HUD_RECIPIENT_IMAX_PASSWORD_ENCRYPTED");
    private final By RECIPIENT_IMAX_ID = By.id("TEMP_HUD_RECIPIENT_IMAX_PASSWORD_ENCRYPTED");
    private final By TRACS_VERSION_DROPDOWN = By.id("HUD_TRACS_VERSION");
    private final By HUD_PROP_INFO_SAVE_BUTTON = By.cssSelector("input[value='Save']");
    private final By HUD_PROP_INFO_CANCEL_LINK = By.linkText("Cancel");
    private final By SUCCESS_MESSAGE_HUD_PROP_INFO = By.cssSelector("p[class='alert success slim']");
    //HUD add new contract locators
    private final By ADD_CONTRACT_BUTTON = By.id("add_hud_program");
    private final By PROJECT_TYPE_DROPDOWN = By.cssSelector("select[name='subsidy_projects[subsidy_program_type_id]']");
    private final By CONTRACT_NUMBER = By.cssSelector("input[name='subsidy_projects[project_number]']");
    private final By CONTRACTED_UNITS_ALL_UNITS_RADIO_BUTTON = By.xpath("//*[contains(text(), 'All Units')]");
    private final By CONTRACTED_UNITS_SELECT_UNITS = By.xpath("//*[contains(text(), 'Select Units')]");
    private final By START_DATE_ADD_CONTRACT = By.cssSelector("div[class='form-icon date ui-datepicker-trigger']");
    private final By SELECT_TODAY = By.xpath("//div/button[text()='Today']");
    private final By EXPIRATION_DATE_ADD_CONTRACT = By.xpath("//*[@id=\"frm_add_hud_program\"]/fieldset[1]/div[6]/div[2]");
    private final By SAVE_CONTRACT_BUTTON = By.cssSelector("input[value='Save Contract']");

    //Confirm HUD sections methods
    public String confirmHudPropertyInfoSection() {
        return getElementText(VERIFY_HUD_PROPERTY_INFO_SECTION);
    }

    public String confirmHudCertificationSection() {
        return getElementText(VERIFY_HUD_CERTIFICATION_SECTION);
    }

    public String confirmHudContractsSection() {
        return getElementText(VERIFY_HUD_CONTRACTS_SECTION);
    }

    //HUD Certifications section methods
    public boolean clickEditCertificationSettingsButton() {
        return clickElement(EDIT_CERTIFICATION_SETTINGS);
    }

    public boolean confirmAnnualRecertificationDropdown() {
        return confirmElementIsVisible(ANNUAL_RECERTIFICATION_TIMING_DROPDOWN);
    }

    public boolean confirmSaveButton() {
        return confirmElementIsVisible(SAVE_BUTTON);
    }

    public boolean confirmCancelButton() {
        return confirmElementIsVisible(CANCEL_BUTTON);
    }

    public boolean confirmBuildingColumnBuildingsRecertify() {
        waitForOverlayBuildingDropdown();
        return confirmElementIsVisible(BUILDING_COLUMN_BUILDINGS_RECERTIFY);
    }

    public boolean confirmRecertificationDatesColumnBuildingRecertify() {
        return confirmElementIsVisible(RECERTIFICATION_DATE_COLUMN_BUILDINGS_RECERTIFY);
    }

    public boolean selectAnnualRecertificationTimingByValue(String value) {
        return selectElementByValue(ANNUAL_RECERTIFICATION_TIMING_DROPDOWN, value);
    }

    public boolean clickSaveButton() {
        return clickElement(SAVE_BUTTON);
    }

    //Select by value methods for Buildings recertify on a specific date dropdown
    public boolean selectMonthBuildTwoByValue(String value) {
        return selectElementByValue(BUILD_TWO_MONTH_SELECTION, value);
    }

    public boolean selectDayBuildTwoByValue(String value) {
        return selectElementByValue(BUILD_TWO_DAY_SELECTION, value);
    }

    public boolean selectMonthBuildingOneByValue(String value) {
        return selectElementByValue(BUILDING_ONE_MONTH_SELECTION, value);
    }

    public boolean selectDayBuildingOneByValue(String value) {
        return selectElementByValue(BUILDING_ONE_DAY_SELECTION, value);
    }

    public boolean selectMonthOshoByValue(String value) {
        return selectElementByValue(OSHO_MONTH_SELECTION, value);
    }

    public boolean selectDayOshoByValue(String value) {
        return selectElementByValue(OSHO_DAY_SELECTION, value);
    }

    //Select by value methods for All Households recertify on specific date dropdown
    public boolean selectMonthAllHouseholdsByValue(String value) {
        return selectElementByValue(MONTH_DROPDOWN_ALL_HOUSEHOLDS, value);
    }

    public boolean selectDayAllHouseholdsByValue(String value) {
        return selectElementByValue(DAY_DROPDOWN_ALL_HOUSEHOLDS, value);
    }

    //Confirm Error message method
    public boolean confirmErrorWhenMonthDayNotEntered() {
        return confirmElementIsVisible(ERROR_DISPLAYED_WHEN_MONTH_DAY_NOT_ENTERED);
    }

    //HUD Property Information methods
    public boolean clickEditHUDPropertyInformationButton() {
        return clickElement(EDIT_HUD_PROPERTY_INFO_BUTTON);
    }

    public boolean clearTextProjectNamePropInfoHud() {
        return elementClearTextField(PROJECT_NAME_PROPERTY_INFO);
    }

    public boolean enterProjectNamePropInfoHud(String enter) {
        return sendKeysToElement(PROJECT_NAME_PROPERTY_INFO, enter);
    }

    public boolean clearTextProjectNumberPropInfoHud() {
        return elementClearTextField(PROJECT_NUMBER_PROPERTY_INFO);
    }

    public boolean enterProjectNumberPropInfoHud(String enter) {
        return sendKeysToElement(PROJECT_NUMBER_PROPERTY_INFO, enter);
    }

    public boolean clearTextImaxIdPropInfoHud() {
        return elementClearTextField(PROJECT_IMAX_ID);
    }

    public boolean enterImaxIdPropInfoHud(String enter) {
        return sendKeysToElement(PROJECT_IMAX_ID, enter);
    }

    public boolean clearTextImaxPasswordPropInfoHud() {
        return elementClearTextField(PROJECT_IMAX_PASSWORD);
    }

    public boolean enterImaxPasswordPropInfoHud(String enter) {
        return sendKeysToElement(PROJECT_IMAX_PASSWORD, enter);
    }

    public boolean clearTextImaxRecipientIdPropInfoHud() {
        return elementClearTextField(RECIPIENT_IMAX_ID);
    }

    public boolean enterImaxRecipientIdPropInfoHud(String enter) {
        return sendKeysToElement(RECIPIENT_IMAX_ID, enter);
    }

    public boolean selectTracsVersionDropdownByValue() {
        return selectElementByValue(TRACS_VERSION_DROPDOWN, "1");
    }

    public boolean clickSaveButtonHudPropertyInformation() {
        return clickElement(HUD_PROP_INFO_SAVE_BUTTON);
    }

    public boolean confirmCancelLinkHudPropInfoExists() {
        return confirmElementIsVisible(HUD_PROP_INFO_CANCEL_LINK);
    }

    public boolean confirmSuccessMessageHudPropInfo() {
        return confirmElementIsVisible(SUCCESS_MESSAGE_HUD_PROP_INFO);
    }

    //Add new Contract HUD methods
    public boolean clickAddContractButton() {
        return clickElement(ADD_CONTRACT_BUTTON);
    }

    public boolean confirmContractNumberExists() {
        waitForOverlayBuildingDropdown();
        return confirmElementIsVisible(CONTRACT_NUMBER);
    }

    public boolean confirmContractedUnitsAllUnitsRadioButtonExists() {
        return confirmElementIsVisible(CONTRACTED_UNITS_ALL_UNITS_RADIO_BUTTON);
    }

    public boolean confirmContractedUnitsSelectUnitsRadioButtonExists() {
        return confirmElementIsVisible(CONTRACTED_UNITS_SELECT_UNITS);
    }

    public boolean selectProjectTypeByValue() {
        return selectElementByValue(PROJECT_TYPE_DROPDOWN, "4");
    }

    public boolean clickStartDateCalendarIcon() {
        return clickElement(START_DATE_ADD_CONTRACT);
    }

    public boolean clickTodayCalendarIcon() {
        return clickElement(SELECT_TODAY);
    }

    public boolean clickExpirationDateCalendarIcon() {
        return clickElement(EXPIRATION_DATE_ADD_CONTRACT, waitTimes.LONG_WAIT);
    }

    public boolean clickSaveContractButton() {
        return clickElement(SAVE_CONTRACT_BUTTON);
    }

    //Overlay method
    private void waitForOverlayBuildingDropdown() {
        waitForOverlay(LOADING_OVERLAY_AFTER_DROPDOWN_SELECTION);
    }


}
