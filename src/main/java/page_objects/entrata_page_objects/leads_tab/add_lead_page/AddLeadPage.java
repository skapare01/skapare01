package page_objects.entrata_page_objects.leads_tab.add_lead_page;
import utils.RandomGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddLeadPage extends BasePage {

    RandomGenerator rand = new RandomGenerator();

    //Guest Information locators
    private final By PROPERTY_DROPDOWN = By.id("search_property_dropdown");
    private final By PROPERTY_DROPDOWN_ARROW = By.cssSelector("i[class='form-icon dropdown disable-dropdown-add-lead ']");
    private final By FIRST_NAME_TEXT_BOX = By.id("primary_name_first");
    private final By LAST_NAME_TEXT_BOX = By.id("primary_name_last");
    private final By PHONE_NUMBER_TEXT_BOX = By.id("phone_numbers[0][phone_number]-base");
    private final By EMAIL_TEXT_BOX = By.id("applicant_username");
    private final By SAVE_LEAD_BUTTON = By.id("process_lead");
    private final By ADD_LEAD_START_APPLICATION_BUTTON = By.id("process_application");
    private final By CONFIRM_CANCEL = By.className("close-large-dialog");

    //Select Property when creating lead locators
    private final By SELECT_PROPERTY = By.xpath("//*[contains(@id, 'ui-id')]");
    private final By SELECT_AFFORDABLE_PROPERTY = By.xpath("//li/a[text()='Affordable_Automation']");
    private final By SELECT_SPECIFIC_PROPERTY_VILLAGE_BEND_EAST = By.xpath("//li//a[text()='The Village Bend East']");

    //Lead Details tab locators(must enter property to see this tab)
    private final By LEAD_DETAILS_TAB = By.id("lead_details_tab");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By ORIGINATING_LEAD_SOURCE_DROPDOWN = By.xpath("//*[@id=\"lead_source\"]/i");
    private final By DROPDOWN_RESULT_ORIGINATING_LEAD_SOURCE = By.xpath("//a[contains(text(),'Unknown')]");
    private final By METHOD_OF_CONTACT_DROPDOWN = By.id("contact_method");
    private final By RESULT_OF_CONTACT_DROPDOWN = By.id("event_result_id");
    private final By ENTER_TEXT_REQUIRED_NOTES = By.cssSelector("textarea[class='form-textarea rows6']");
    private final By SELECT_APPLICATION_DROPDOWN = By.id("company_application_id");
    private final String AFFORDABLE_APPLICATION = "12789";
    private final By SELECT_NEW_TEST_APPLICATION_CUSTOM_CONVENTIONAL = By.xpath("//*[text()='ConventionalTestApplication']");
    private final By LEASING_AGENT_DROPDOWN = By.id("leasing_agent");
    private final By LEASING_AGENT_SELECT_HOUSE = By.cssSelector("option[value='311857']");
    private final By CONTACT_METHOD_RESULT_DROPDOWN = By.id("event_result_id");
    private final By CONTACT_METHOD_RESULT_SELECTION = By.cssSelector("#event_result_id > option:nth-child(2)");
    private final By CONTACT_METHOD_RESULT_NOTES = By.name("event[notes]");
    private final By MOVE_IN_DATE_MONTH = By.xpath("//*[@id=\"lease_start_date_control\"]/input[2]\n");
    private final By MOVE_IN_DATE_DAY = By.xpath("//*[@id=\"lease_start_date_control\"]/input[3]");
    private final By MOVE_IN_DATE_YEAR = By.xpath("//*[@id=\"lease_start_date_control\"]/input[4]");

    //Unit Preferences Section Selectors
    private final By FLOOR_PLAN_DROPDOWN = By.id("property_floorplan_id");
    private final By TWO_BED_TWO_BATH_FLOORPLAN = By.xpath("//option[text()='2BR/2BA']");

    //Lead Details >> Check Eligibility locators
    private final By CHECK_ELIGIBILITY = By.cssSelector("a[class='button action js-check-subsidy-eligibility']");
    private final By TOTAL_ANNUAL_INCOME = By.id("total_annual_income");
    private final By FIRST_NAME_BOX = By.id("name_first_0");
    private final By LAST_NAME_BOX = By.id("name_last_0");
    private final By BIRTH_DATE_FIELD = By.cssSelector("div[class='form-date datepicker wide4 binded']");
    private final By RELATIONSHIP_FIELD = By.cssSelector("select[class='form-select js-relationship js-update-stripes']");
    private final By CITIZENSHIP_FIELD = By.id("citizenship_0");
    private final By STUDENT_FIELD = By.id("student_status_0");
    private final By DISABLED_FIELD = By.xpath("//*[@id=\"check_subsidy_eligibility\"]/div[1]/fieldset/div[8]/div");
    private final By ADD_HOUSEHOLD_MEMBER_BUTTON = By.xpath("//*[@id=\"check_subsidy_eligibility\"]/b/i");
    private final By CHECK_ELIGIBILITY_BUTTON = By.cssSelector("input[value='Check Eligibility']");
    private final By CANCEL_BUTTON = By.className("cancel-modal");
    private final By ENTER_MONTH_BIRTH_DATE = By.xpath("//*[@id=\"check_subsidy_eligibility\"]/div[1]/fieldset/div[2]/div[1]/input[2]");
    private final By ENTER_DAY_BIRTH_DATE = By.xpath("//*[@id=\"check_subsidy_eligibility\"]/div[1]/fieldset/div[2]/div[1]/input[3]");
    private final By ENTER_YEAR_BIRTH_DATE = By.xpath("//*[@id=\"check_subsidy_eligibility\"]/div[1]/fieldset/div[2]/div[1]/input[4]");
    private final By SUCCESS_MESSAGE_CHECK_ELIGIBILITY = By.xpath("//*[@id=\"lead_details\"]/b/b/p");
    private final By ENTER_PHONE_NUMBER_NEW_LEAD = By.id("phone_numbers[0][phone_number]-base");

    //Lead Details >> Method of contact dropdown options
    private final String EMAIL_METHOD_OF_CONTACT = "1";
    private final String CALL_METHOD_OF_CONTACT = "3";

    //Lead Details >> Result of contact dropdown options
    private final String NO_RESPONSE_REQUIRED_RESULT_OF_CONTACT = "2894597";
    private final String INTERESTED_RESULT_OF_CONTACT = "41";

    //Military Specific Locators
    private final By SELECT_SPECIFIC_PROPERTY_MILITARY_PROPERTY = By.xpath("//li//a[text()='Military Property']");
    private final By SELECT_NEW_TEST_APPLICATION_CUSTOM_MILITARY = By.xpath("//*[text()='MilitaryTestApplication']");
    private final By DOES_NOT_HAVE_MATERNAL_LAST_NAME_CHECKBOX = By.id("primary_applicant_has_name_last_matronymic");
    private final By MILITARY_STATUS_DROPDOWN = By.id("career");
    private final By MILITARY_BRANCH_DROPDOWN = By.id("primary-military");
    private final By MILITARY_BRANCH_DROPDOWN_SELECT_ARMY = By.xpath("//option[normalize-space()='Army']");
    private final By MILITARY_RANK_OVERLAY_AFTER_BRANCH_SELECTION = By.cssSelector("div[class='loading-overlay bg-img-small']");
    private final By MILITARY_RANK_DROPDOWN = By.name("customer_military_details[career][military_rank_id]");
    private final By MILITARY_RANK_DROPDOWN_SELECT_PRIVATE = By.xpath("//option[normalize-space()='Private']");
    private final By MILITARY_PAY_GRADE_OVERLAY_AFTER_RANK_SELECTION = By.cssSelector("div[class='loading-overlay bg-img-small']");
    private final By MILITARY_PAY_GRADE_DROPDOWN = By.name("customer_military_details[career][military_pay_grade_id]");
    private final By MILITARY_ARRIVAL_DATE_DATE_PICKER = By.cssSelector("#military-career > b > b > div.column-right.half > div > div.js-status.js-active-career.hide-career-military-component-foreignmilitary > dl:nth-child(1) > dd > div.form-icon.date.ui-datepicker-trigger");
    private final By MILITARY_ARRIVAL_DATE_SELECT_FIRST_DAY_OF_MONTH = By.xpath("//a[text()='1']");
    private final By MILITARY_DUTY_EMAIL_ADDRESS_TEXT_BOX = By.name("customer_military_details[career][duty_email_address]");
    private final By MILITARY_CAREER = By.id("military_career_tab");

    //Overlay Locator
    private final By OVERLAY_SELECTOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Verify Eligibility is Complete
    private final By VERIFY_ELIGIBILITY_IS_COMPLETE = By.cssSelector("h4[class='align-center pad1-bottom']");

    public AddLeadPage(WebDriver driver) {
        super(driver);
    }

    //Overlays
    private void overlayAfterAddLeadSelectProperty() {
        waitForOverlay(OVERLAY_SELECTOR);
    }
    private void overlayAfterAllLeadSelectApplication() {
        waitForOverlay(OVERLAY_SELECTOR);
    }
    private void overlayAfterAddLeadSelectPropertyLeadManager() { waitForOverlay(OVERLAY_SELECTOR); }

    //Property Dropdown Methods
    public boolean selectPropertySearch() {return clickElement(PROPERTY_DROPDOWN);}

    //Property Dropdown Methods
    public boolean propertyDropdownArrowClick() {
        return clickElement(PROPERTY_DROPDOWN_ARROW);
    }
    public boolean selectPropertyFromDropdown() {
        return clickElement(SELECT_SPECIFIC_PROPERTY_VILLAGE_BEND_EAST);
    }
    public boolean selectSpecificPropertyFromDropdown(String property){
       String specificProperty = String.format("//li//a[text()= '%s']",property);
       By propertyToAdd = By.xpath(specificProperty);
       return clickElement(propertyToAdd);
    }

    //Guest Information methods
    public boolean confirmPropertyDropdownExists() {
        return confirmElementIsVisible(PROPERTY_DROPDOWN, waitTimes.LONG_WAIT);
    }
    public boolean confirmFirstNameTextBoxExists() {
        return confirmElementIsVisible(FIRST_NAME_TEXT_BOX, waitTimes.LONG_WAIT);
    }
    public boolean firstNameTextFieldClick() {
        overlayAfterAddLeadSelectProperty();
        return clickElement(FIRST_NAME_TEXT_BOX,waitTimes.LONG_WAIT);
    }
    public boolean firstNameTextFieldSendKeys(String firstName) {
        overlayAfterAddLeadSelectProperty();
        return sendKeysToElement(FIRST_NAME_TEXT_BOX, firstName);
    }
    public boolean sendKeysToFirstNameFieldLeadManager(String name) {overlayAfterAddLeadSelectPropertyLeadManager(); return sendKeysToElement(FIRST_NAME_TEXT_BOX, name);}
    public boolean lastNameTextFieldSendKeysLeadManager(String name) { return sendKeysToElement(LAST_NAME_TEXT_BOX, name); }
    public boolean confirmLastNameTextBoxExists() {
        return confirmElementIsVisible(LAST_NAME_TEXT_BOX, waitTimes.LONG_WAIT);
    }
    public boolean lastNameTextFieldClick() {
        return clickElement(LAST_NAME_TEXT_BOX);
    }
    public boolean lastNameTextFieldSendKeys(String lastName) {
        return sendKeysToElement(LAST_NAME_TEXT_BOX, lastName);
    }
    public boolean confirmPhoneNumberTextBoxExists() {
        return confirmElementIsVisible(PHONE_NUMBER_TEXT_BOX, waitTimes.LONG_WAIT);
    }
    public boolean addPhoneNumberClick() {
        return clickElement(PHONE_NUMBER_TEXT_BOX);
    }
    public boolean addPhoneNumberSendKeys(String phoneNumber) {
        return sendKeysToElement(PHONE_NUMBER_TEXT_BOX, phoneNumber);
    }
    public boolean confirmEmailTextBoxExists() {
        return confirmElementIsVisible(EMAIL_TEXT_BOX, waitTimes.LONG_WAIT);
    }
    public boolean clickAndSendKeysToTheEmailTextBox(String emailAddress) { return sendKeysToElement(EMAIL_TEXT_BOX, emailAddress); }
    public boolean confirmSaveLeadButtonExists() {
        return confirmElementIsVisible(SAVE_LEAD_BUTTON, waitTimes.LONG_WAIT);
    }
    public boolean confirmCancelExists() {
        return confirmElementIsVisible(CONFIRM_CANCEL, waitTimes.LONG_WAIT);
    }
    public boolean enterPhoneNumberForNewLead(String phoneLead) {
        return sendKeysToElement(ENTER_PHONE_NUMBER_NEW_LEAD, phoneLead);
    }
    public boolean searchPropertySendKeys(String select) {
        return sendKeysToElement(PROPERTY_DROPDOWN, select);
    }
    public boolean searchingCavalierCourtPropertySendKeys() {return sendKeysToElement(PROPERTY_DROPDOWN, "Cavalier Court");}
    public boolean searchAffordablePropertyClickProperty() {
        return clickElement(SELECT_AFFORDABLE_PROPERTY);
    }
    public boolean searchPropertyClickProperty() {
        return clickElement(SELECT_PROPERTY, waitTimes.LONG_WAIT);
    }
    public boolean clickSaveLeadButton() {
        return clickElement(SAVE_LEAD_BUTTON);
    }
    public boolean clickStartApplicationButton() {
        return clickElement(ADD_LEAD_START_APPLICATION_BUTTON);
    }

    //Lead Details tab methods
    public boolean clickLeadDetailsTab() {
        overlayAfterAddLeadSelectProperty();
        return clickElement(LEAD_DETAILS_TAB, waitTimes.UNREASONABLE_WAIT);
    }
    public boolean clickOriginatingLeadSourceDropdown() {
        overlayAfterAllLeadSelectApplication();
        return clickElement(ORIGINATING_LEAD_SOURCE_DROPDOWN);
    }
    public boolean clickAndSendKeysToLeadMoveInDateMonth(){return sendKeysToElement(MOVE_IN_DATE_MONTH, "08", waitTimes.LONG_WAIT);}
    public boolean clickAndSendKeysToLeadMoveInDateDay(){return sendKeysToElement(MOVE_IN_DATE_DAY, "01");}
    public boolean clickAndSendKeysToLeadMoveInDateYear(){return sendKeysToElement(MOVE_IN_DATE_YEAR, "2022");}
    public boolean dropdownResultsOriginatingLeadSource() {
        return clickElement(DROPDOWN_RESULT_ORIGINATING_LEAD_SOURCE);
    }
    // Lead Details >> method of contact dropdown methods
    public boolean selectEmailContactMethodByValue() {
        return selectElementByValue(METHOD_OF_CONTACT_DROPDOWN, EMAIL_METHOD_OF_CONTACT);
    }
    public boolean selectPhoneContactMethod(){return selectElementByValue(METHOD_OF_CONTACT_DROPDOWN,CALL_METHOD_OF_CONTACT);}

    // Lead Details << result of contact dropdown methods

    public boolean clickAndSelectResultOfContactDropdown() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.DEFAULT_WAIT);
        return selectElementByValue(RESULT_OF_CONTACT_DROPDOWN, NO_RESPONSE_REQUIRED_RESULT_OF_CONTACT);
    }
    public boolean selectInterestedResultOfContact(){ waitForOverlay(LOADING_OVERLAY);
        return selectElementByValue(RESULT_OF_CONTACT_DROPDOWN,INTERESTED_RESULT_OF_CONTACT);
    }
    public boolean clickAndSelectResultOfContactDropdownNoResponseSent() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.DEFAULT_WAIT);
        return selectElementByValue(RESULT_OF_CONTACT_DROPDOWN, "32");
    }
    public boolean contactMethodResultDropdown() {
        return clickElement(CONTACT_METHOD_RESULT_DROPDOWN);
    }
    public boolean contactMethodResultSelect() {
        return clickElement(CONTACT_METHOD_RESULT_SELECTION);
    }
    public boolean contactMethodResultNotes() {
        return sendKeysToElement(CONTACT_METHOD_RESULT_NOTES,"This is a test");
    }

    //Unit Preferences Section Methods
    public boolean selectFloorPlanDropdown() {return clickElement(FLOOR_PLAN_DROPDOWN);}
    public boolean selectFloorPlan2Bed2Bath() {return clickElement(TWO_BED_TWO_BATH_FLOORPLAN);}

    public boolean enterTextRequiredNotes(String note) {
        return sendKeysToElement(ENTER_TEXT_REQUIRED_NOTES, note);
    }
    public boolean selectingApplicationDropdown() {
        return clickElement(SELECT_APPLICATION_DROPDOWN);
    }
    public boolean selectTestApplication() {
        return clickElement(SELECT_NEW_TEST_APPLICATION_CUSTOM_CONVENTIONAL, waitTimes.UNREASONABLE_WAIT);
    }
    public boolean leasingAgentDropDown() {
        return clickElement(LEASING_AGENT_DROPDOWN);
    }
    public boolean leasingAgentSelect() {
        return clickElement(LEASING_AGENT_SELECT_HOUSE);
    }

    //Lead Details select Affordable Application by value
    public boolean selectApplicationByValue() {
        return selectElementByValue(SELECT_APPLICATION_DROPDOWN, AFFORDABLE_APPLICATION);
    }

    //Check Eligibility methods
    public boolean clickCheckEligibility() {
        overlayAfterAllLeadSelectApplication();
        return clickElement(CHECK_ELIGIBILITY);
    }
    public boolean confirmTotalAnnualIncomeField() {
        return confirmElementIsVisible(TOTAL_ANNUAL_INCOME);
    }
    public boolean confirmFirstNameField() {
        return confirmElementIsVisible(FIRST_NAME_BOX);
    }
    public boolean confirmLastNameField() {
        return confirmElementIsVisible(LAST_NAME_BOX);
    }
    public boolean confirmBirthDateField() {
        return confirmElementIsVisible(BIRTH_DATE_FIELD);
    }
    public boolean confirmRelationshipField() {
        return confirmElementIsVisible(RELATIONSHIP_FIELD);
    }
    public boolean confirmCitizenshipField() {
        return confirmElementIsVisible(CITIZENSHIP_FIELD);
    }
    public boolean confirmStudentToggleExists() {
        return confirmElementIsVisible(STUDENT_FIELD);
    }
    public boolean confirmDisabledToggleExists() {
        return confirmElementIsVisible(DISABLED_FIELD);
    }
    public boolean confirmAddHouseholdMember() {
        return confirmElementIsVisible(ADD_HOUSEHOLD_MEMBER_BUTTON);
    }
    public boolean confirmCheckEligibilityButton() {
        return confirmElementIsVisible(CHECK_ELIGIBILITY_BUTTON);
    }
    public boolean confirmCancelButton() {
        return confirmElementIsVisible(CANCEL_BUTTON);
    }

    //Populate check eligibility methods
    public boolean clickTotalAnnualIncome() {
        return clickElement(TOTAL_ANNUAL_INCOME);
    }
    public boolean enterTotalAnnualIncome(String enter) {
        return sendKeysToElement(TOTAL_ANNUAL_INCOME, enter);
    }
    public boolean clickFirstNameField() {
        return clickElement(FIRST_NAME_BOX);
    }
    public boolean enterFirstName(String enter) {
        return sendKeysToElement(FIRST_NAME_BOX, enter);
    }
    public boolean clickLastNameField() {
        return clickElement(LAST_NAME_BOX);
    }
    public boolean enterLastName(String enter) {
        return sendKeysToElement(LAST_NAME_BOX, enter);
    }
    public boolean enterMonthBirthDate(String enter) {
        return sendKeysToElement(ENTER_MONTH_BIRTH_DATE, enter);
    }
    public boolean enterDayBirthDate(String enter) {
        return sendKeysToElement(ENTER_DAY_BIRTH_DATE, enter);
    }
    public boolean enterYearBirthDate(String enter) {
        return sendKeysToElement(ENTER_YEAR_BIRTH_DATE, enter);
    }
    public boolean clickCitizenshipChooseFirstOption() {
        return selectElementByValue(CITIZENSHIP_FIELD, "1");
    }
    public boolean clickCheckEligibilityButton() {
        return clickElement(CHECK_ELIGIBILITY_BUTTON);
    }
    public String confirmSuccessMessageAfterCheckEligibility() {
        return getElementText(SUCCESS_MESSAGE_CHECK_ELIGIBILITY, waitTimes.LONG_WAIT);
    }

    //Confirm eligibility is in complete status method
    public String confirmEligibilityIsCompleteStatus() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.LONG_WAIT);
        return getElementText(VERIFY_ELIGIBILITY_IS_COMPLETE, waitTimes.LONG_WAIT);
    }

    //Military Specific Methods
    public boolean selectTestApplicationMilitary() {
        return clickElement(SELECT_NEW_TEST_APPLICATION_CUSTOM_MILITARY);
    }
    public boolean selectPropertyFromDropdownMilitary() {
        return clickElement(SELECT_SPECIFIC_PROPERTY_MILITARY_PROPERTY);
    }
    public boolean doesNotHaveMaternalLastNameCheckBox() {
        return clickElement(DOES_NOT_HAVE_MATERNAL_LAST_NAME_CHECKBOX);
    }
    public boolean militaryStatusDropdownDefaultVisible() {
        return confirmElementIsVisible(MILITARY_STATUS_DROPDOWN);
    }
    public boolean militaryBranchDropdownClick() {
        return clickElement(MILITARY_BRANCH_DROPDOWN);
    }
    public boolean militaryBranchDropdownSelectArmy() {
        return clickElement(MILITARY_BRANCH_DROPDOWN_SELECT_ARMY);
    }
    public boolean militaryRankDropdown() {
        waitForOverlay(MILITARY_RANK_OVERLAY_AFTER_BRANCH_SELECTION);
        return clickElement(MILITARY_RANK_DROPDOWN);
    }
    public boolean militaryRankSelectPrivate() {
        return clickElement(MILITARY_RANK_DROPDOWN_SELECT_PRIVATE);
    }
    public boolean militaryPayGradeDropdownVisible() {
        waitForOverlay(MILITARY_PAY_GRADE_OVERLAY_AFTER_RANK_SELECTION);
        return confirmElementIsVisible(MILITARY_PAY_GRADE_DROPDOWN);
    }
    public boolean arrivalDateDatePickerClick() {
        return clickElement(MILITARY_ARRIVAL_DATE_DATE_PICKER);
    }
    public boolean arrivalDateClickFirstDayOfMonth() {
        return clickElement(MILITARY_ARRIVAL_DATE_SELECT_FIRST_DAY_OF_MONTH);
    }
    public boolean dutyEmailAddressSendKeys() {
        return sendKeysToElement(MILITARY_DUTY_EMAIL_ADDRESS_TEXT_BOX, RandomGenerator.randomMilitaryEmail());
    }
    public boolean clickMilitaryCareerTab(){return clickElement(MILITARY_CAREER);}
}
