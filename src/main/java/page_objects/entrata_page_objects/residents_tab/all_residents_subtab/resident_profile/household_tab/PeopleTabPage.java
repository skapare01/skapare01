package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PeopleTabPage extends BasePage {

    //Resident Profile People tab Anticipated Family Additions locators
    private final By PEOPLE_ANT_FAM_ADD_SECTION = By.id("anticipated_family_addition");
    private final By PEOPLE_CURRENT_OCCUPANTS_SECTION = By.xpath("//*[@id=\"customer_system_container\"]/div/b/h4");
    private final By EDIT_ANTICIPATED_FAMILY_ADDITIONS_BUTTON = By.id("edit_anticipated_family_addition");
    private final By PREGNANCY = By.cssSelector("input[name='application_subsidy_details[anticipated_addition_pregnancy]']");
    private final By ADOPTION = By.cssSelector("input[name='application_subsidy_details[anticipated_addition_adoption]']");
    private final By FOSTER = By.cssSelector("input[name='application_subsidy_details[anticipated_addition_foster_child]']");
    private final By SUBMIT_ANTICIPATED_FAMILY_ADDITIONS = By.id("submit_anticipated_family_additions");
    private final By SUCCESS_MESSAGE_ANTICIPATED_FAMILY_ADDITIONS_EDIT = By.id("show_msg_inner");
    //People tab Current Occupants locators
    private final By SUMMARY_TAB = By.cssSelector("li[class='summarytab']");
    private final By CLICK_FIRST_CURRENT_OCCUPANT = By.xpath("//*[contains(@onclick, 'javascript:loadPeopleDetails')]");
    private final By EDIT_OCCUPANT_INFORMATION = By.id("edit_basic_info");
    private final By DISABILITY_TOGGLE = By.xpath("//*[contains(@onclick, 'select_disability_type')]");
    private final By DISABILITY_TOGGLE_OFF = By.cssSelector("div[class='js-occupant-disabled onoff slim off']");
    private final By DISABILITY_TYPES_DROPDOWN = By.id("SubsidyDisabilityType_multiselect");
    private final By DISABILITY_TYPE_SELECT_OPTION_ONE = By.id("SubsidyDisabilityType_option_1");
    private final By SAVE_INFORMATION_BUTTON = By.cssSelector("input[value='Save Information']");
    private final By SUCCESS_MESSAGE_AFTER_UPDATING_OCCUPANT_INFO = By.cssSelector("p[class='alert success slim']");
    private final By SECURE_INFO_TAB = By.cssSelector("li[class='securetab']");
    private final By CUSTOMER_INVOICE_MESSAGE = By.cssSelector("textarea[name='lease_customer[customer_invoice_message]']");
    //Demographic info locators
    private final By EDIT_DEMOGRAPHIC_INFORMATION_BUTTON = By.id("edit_resident_demographic_info");
    private final By RACE_DROPDOWN = By.cssSelector("div[class='form-multiselect binded binded-hover-intent']");
    private final By ETHNICITY_DROPDOWN = By.id("subsidy_ethnicity_type_id");
    private final By GENDER_DROPDOWN = By.id("gender");
    private final By SAVE_DEMOGRAPHIC_BUTTON = By.cssSelector("input[class='form-submit submit_demographic']");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public PeopleTabPage(WebDriver driver) {
        super(driver);
    }

    //Resident Profile Anticipated Family Additions People methods
    public boolean confirmPeopleAnticipatedFamilyAdditionsSection() {
        return confirmElementIsVisible(PEOPLE_ANT_FAM_ADD_SECTION);
    }

    public String confirmPeopleCurrentOccupantsSection() {
        return getElementText(PEOPLE_CURRENT_OCCUPANTS_SECTION);
    }

    public boolean editAnticipatedFamilyAdditions() {
        return clickElement(EDIT_ANTICIPATED_FAMILY_ADDITIONS_BUTTON);
    }

    public boolean clearInputPregnancy() {
        return elementClearTextField(PREGNANCY);
    }

    public boolean clearInputAdoption() {
        return elementClearTextField(ADOPTION);
    }

    public boolean clearInputFoster() {
        return elementClearTextField(FOSTER);
    }

    public boolean editPregnancy(String search) {
        return sendKeysToElement(PREGNANCY, search);
    }

    public boolean editAdoption(String search) {
        return sendKeysToElement(ADOPTION, search);
    }

    public boolean editFoster(String search) {
        return sendKeysToElement(FOSTER, search);
    }

    public boolean clickSubmitAnticipatedFamilyAdditions() {
        return clickElement(SUBMIT_ANTICIPATED_FAMILY_ADDITIONS);
    }

    public String successMessageAfterEditAnticipatedFamilyAdditions() {
        return getElementText(SUCCESS_MESSAGE_ANTICIPATED_FAMILY_ADDITIONS_EDIT);
    }

    //Edit Occupants methods
    public boolean clickFirstCurrentOccupant() {
        return clickElement(CLICK_FIRST_CURRENT_OCCUPANT);
    }

    public boolean clickEditOccupantInformationButton() {
        waitForOverlayAfterClickingSummaryTab();
        return clickElement(EDIT_OCCUPANT_INFORMATION);
    }

    public boolean clickDisabilityToggle() {
        waitForOverlayAfterClickingEditOccupantInformation();
        return clickElement(DISABILITY_TOGGLE, waitTimes.LONG_WAIT);
    }

    public boolean confirmThatToggleIsOff() {
        return confirmElementIsVisible(DISABILITY_TOGGLE_OFF);
    }

    public boolean confirmDisabilityTypesDropdown() {
        return confirmElementIsVisible(DISABILITY_TYPES_DROPDOWN, waitTimes.LONG_WAIT);
    }

    public boolean clickDisabilityTypesDropdown() {
        return clickElement(DISABILITY_TYPES_DROPDOWN);
    }

    public boolean selectDisabilityTypeOptionOne() {
        return clickElement(DISABILITY_TYPE_SELECT_OPTION_ONE);
    }

    public boolean scrollToSaveInformationButton() {
        return moveToAnElementWithActions(SAVE_INFORMATION_BUTTON, waitTimes.SHORT_WAIT);
    }

    public boolean clickSaveInformationButton() {
        return clickElement(SAVE_INFORMATION_BUTTON);
    }

    public boolean confirmSuccessMessageAfterUpdatingOccupantInfo() {
        waitForOverlayAfterClickingSave();
        return confirmElementIsVisible(SUCCESS_MESSAGE_AFTER_UPDATING_OCCUPANT_INFO, waitTimes.LONG_WAIT);
    }

    public boolean clickSecureInfoTab() {
        return clickElement(SECURE_INFO_TAB);
    }

    public boolean clickSummaryTab() {
        return clickElement(SUMMARY_TAB);
    }

    public boolean clearTextCustomerInvoiceMessage() {
        return elementClearTextField(CUSTOMER_INVOICE_MESSAGE, waitTimes.LONG_WAIT);
    }

    public boolean enterTextCustomerInvoiceMessage(String text) {
        return sendKeysToElement(CUSTOMER_INVOICE_MESSAGE, text);
    }

    //Demographic info methods
    public boolean clickEditDemographicInfoButton() {
        return clickElement(EDIT_DEMOGRAPHIC_INFORMATION_BUTTON);
    }

    public boolean confirmRaceDropdownExists() {
        return confirmElementIsVisible(RACE_DROPDOWN);
    }

    public boolean confirmEthnicityDropdownExists() {
        return confirmElementIsVisible(ETHNICITY_DROPDOWN);
    }

    public boolean selectGenderByValue(String gender) {
        return selectElementByValue(GENDER_DROPDOWN, gender);
    }

    public boolean clickSaveDemographicButton() {
        return clickElement(SAVE_DEMOGRAPHIC_BUTTON);
    }

    //Overlay - calling in clickEditOccupantInformationButton() method
    private void waitForOverlayAfterClickingSummaryTab() {
        waitForOverlay(LOADING_OVERLAY);
    }
    private void waitForOverlayAfterClickingEditOccupantInformation() {
        waitForOverlay(LOADING_OVERLAY);
    }
    private void waitForOverlayAfterClickingSave() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.LONG_WAIT);
    }

}
