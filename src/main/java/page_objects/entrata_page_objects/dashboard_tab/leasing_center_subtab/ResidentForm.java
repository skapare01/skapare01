package page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentForm extends BasePage {
    private final By RESIDENT_TAB_DROPDOWN = By.xpath("//div//option[text()='Resident']");
    private final By RESIDENT_DETAILS = By.cssSelector("div[id='left-body-form-container-div'] [class='form-container-head']");
    private final By RESIDENT_RESIDENT_INFO_TAB = By.cssSelector("li[class='js-resident-info-tab selected']");
    private final By RESIDENT_SUBMIT_MESSAGE_TAB = By.className("js-submit-message-tab");
    private final By RESIDENT_COMPLAINT_ISSUE_PROTOCOL = By.xpath("//*[@id=\"highlight-accordion\"]/div/div/i");
    private final By RESIDENT_ACTIVITY = By.id("view-resident-activity");
    private final By RESIDENT_PAYMENT_INFORMATION = By.id("resident-payment-information");
    private final By RESIDENT_RESIDENT_INFO_TAB_THREE_DOT_TWO = By.cssSelector("li[class='js-basic-info-tab selected']");
    private final By RESIDENT_NEW_WORK_ORDER_TAB_THREE_DOT_TWO = By.cssSelector("li[class='js-new-work-order-tab']");
    private final By RESIDENT_NEW_RESIDENT_NOTE_TAB_THREE_DOT_TWO = By.cssSelector("li[class='js-new-resident-note-tab']");
    private final By WORK_ORDER_FOR_THREE_DOT_TWO = By.xpath("//*[text()=' Work Order For:']");
    private final By UNIT_THREE_DOT_TWO = By.id("maintenance_location_type_unit_val_1");
    private final By PROPERTY_THREE_DOT_TWO = By.id("maintenance_location_type_property_val_1");
    private final By PROBLEM_LOCATION_THREE_DOT_TWO = By.xpath("//*[text()='Problem Location']");
    private final By PRIORITY_THREE_DOT_TWO = By.xpath("//*[text()='Priority:']");
    private final By DESCRIPTION_OF_PROBLEM_THREE_DOT_TWO = By.xpath("//*[text()=' Description of Problem:']");
    private final By OBTAINED_PERMISSION_TO_ENTER_THREE_DOT_TWO = By.xpath("//*[text()=' Obtained permission to Enter:']");
    private final By ENTRY_NOTES_THREE_DOT_TWO = By.xpath("//*[text()=' Entry Notes:']");
    private final By OUTGOING_CALLS_MADE_THREE_DOT_TWO = By.xpath("//*[text()='Outgoing Calls Made: ']");
    private final By CALL_NOTES_THREE_DOT_TWO = By.xpath("//*[text()='Call Notes:']");
    private final By REQUEST_CALL_BACK_FROM_PROPERTY_THREE_DOT_TWO = By.id("property_request_callback");
    private final By ADD_PROBLEM_TO_WORK_ORDER_THREE_DOT_TWO = By.id("js-additional-wo");
    private final By SEND_INFO_VIA_EMAIL_BUTTON_THREE_DOT_TWO = By.id("send-info-email");
    private final By SUBMIT_TO_PROPERTY_BUTTON_THREE_DOT_TWO = By.id("submit_work_order_or_preview");
    private final By KITCHEN_LOCATION_THREE_DOT_TWO = By.cssSelector("select[id='maintenance_location_id_1'] [value='18861']");
    private final By CATEGORY_THREE_DOT_TWO = By.xpath("//*[text()='Category']");
    private final By APPLIANCE_CATEGORY_THREE_DOT_TWO = By.cssSelector("select[id='maintenance_category_id_1'] [value='172117']");
    private final By PROBLEM_THREE_DOT_TWO = By.id("maintenance_problem_id_1");
    private final By DISHWASHER_PROBLEM_THREE_DOT_TWO = By.cssSelector("select[id='maintenance_problem_id_1'] [value='172122']");
    private final By DESCRIPTION_OF_PROBLEM_TEXT_BOX_THREE_DOT_TWO = By.id("problem_description_1");
    private final By OBTAIN_PERMISSION_TO_ENTER_YES_THREE_DOT_TWO = By.cssSelector("ul[class='form-picker radio'] [val='1']");
    private final By FIRST_NAME_IN_RESIDENT_INFO_THREE_DOT_TWO = By.id("first_name");
    private final By LAST_NAME_IN_RESIDENT_INFO_THREE_DOT_TWO = By.id("last_name");
    private final By UNIT_IN_RESIDENT_INFO_THREE_DOT_TWO = By.id("unit_number");
    private final By BLDG_DROPDOWN_IN_RESIDENT_INFO_THREE_DOT_TWO = By.id("building_id");
    private final By FIRST_BUILDING_IN_DROPDOWN_THREE_DOT_TWO = By.cssSelector("#building_id>option:nth-of-type(2)");
    private final By PRIMARY_PHONE_NUMBER_IN_RESIDENT_INFO_THREE_DOT_TWO = By.id("primary_phone_number");
    private final By CALL_ID_NUMBER_THREE_DOT_TWO = By.id("call_id");
    private final By RESIDENT_INFO_TAB_FROM_NEW_WORK_ORDER_THREE_DOT_TWO = By.cssSelector("form[id='work_order_and_resident_form'] [class='js-basic-info-tab']");
    private final By WORK_ORDER_SUBMITTED_SUCCESSFULLY = By.cssSelector("div[id='left-body-form-container-div'] [class='alert success slim']");
    private final By RESIDENT_PROTOCOLS_TAB_THREE_DOT_TWO = By.cssSelector("ul[id='resident-tabs'] [data-target='js-complaint-issue-tab']");
    private final By RESIDENT_EMERGENCY_TAB_THREE_DOT_TWO = By.id("js-emergency-tab");
    private final By RESIDENT_WORK_ORDER_HISTORY_TAB_THREE_DOT_TWO = By.id("js-work-order-history-tab");
    private final By RESIDENT_CALL_HISTORY_TAB_THREE_DOT_TWO = By.id("js-call-history-tab");
    private final By RESIDENT_ACTIVITY_TAB_THREE_DOT_TWO = By.id("js-activity-tab");
    private final By RESIDENT_PAYMENT_INFO_TAB_THREE_DOT_TWO = By.id("js-payment-info-tab");

    public ResidentForm(WebDriver driver) {
        super(driver);
    }

    public boolean clickResidentTabDropdown() { return clickElement(RESIDENT_TAB_DROPDOWN); }

    public boolean findResidentDetails() { return confirmElementIsVisible(RESIDENT_DETAILS);}

    public boolean findResidentResidentInfoTab() { return confirmElementIsVisible(RESIDENT_RESIDENT_INFO_TAB, waitTimes.LONG_WAIT);}

    public boolean findResidentSubmitMessageTab() { return confirmElementIsVisible(RESIDENT_SUBMIT_MESSAGE_TAB);}

    public boolean findResidentComplaintIssueProtocol() { return confirmElementIsVisible(RESIDENT_COMPLAINT_ISSUE_PROTOCOL);}

    public boolean findResidentActivity() { return confirmElementIsVisible(RESIDENT_ACTIVITY);}

    public boolean findResidentPaymentInformation() { return confirmElementIsVisible(RESIDENT_PAYMENT_INFORMATION);}

    public boolean findResidentResidentInfoTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_RESIDENT_INFO_TAB_THREE_DOT_TWO);}

    public boolean findResidentNewWorkOrderTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_NEW_WORK_ORDER_TAB_THREE_DOT_TWO);}

    public boolean findResidentNewResidentNoteTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_NEW_RESIDENT_NOTE_TAB_THREE_DOT_TWO);}

    public boolean clickResidentNewWorkOrderTabThreeDotTwo() { return clickElement(RESIDENT_NEW_WORK_ORDER_TAB_THREE_DOT_TWO);}

    public boolean findWorkOrderForThreeDotTwo() { return confirmElementIsVisible(WORK_ORDER_FOR_THREE_DOT_TWO);}

    public boolean findUnitThreeDotTwo() { return confirmElementIsVisible(UNIT_THREE_DOT_TWO);}

    public boolean findPropertyThreeDotTwo() { return confirmElementIsVisible(PROPERTY_THREE_DOT_TWO);}

    public boolean findProblemLocationThreeDotTwo() { return confirmElementIsVisible(PROBLEM_LOCATION_THREE_DOT_TWO);}

    public boolean findPriorityThreeDotTwo() { return confirmElementIsVisible(PRIORITY_THREE_DOT_TWO);}

    public boolean findDescriptionOfProblemThreeDotTwo() { return confirmElementIsVisible(DESCRIPTION_OF_PROBLEM_THREE_DOT_TWO);}

    public boolean findObtainedPermissionToEnterThreeDotTwo() { return confirmElementIsVisible(OBTAINED_PERMISSION_TO_ENTER_THREE_DOT_TWO);}

    public boolean findEntryNotesThreeDotTwo() { return confirmElementIsVisible(ENTRY_NOTES_THREE_DOT_TWO);}

    public boolean findOutgoingCallsMadeThreeDotTwo() { return confirmElementIsVisible(OUTGOING_CALLS_MADE_THREE_DOT_TWO);}

    public boolean findCallNotesThreeDotTwo() { return confirmElementIsVisible(CALL_NOTES_THREE_DOT_TWO);}

    public boolean findRequestCallBackFromPropertyThreeDotTwo() { return confirmElementIsVisible(REQUEST_CALL_BACK_FROM_PROPERTY_THREE_DOT_TWO);}

    public boolean findAddProblemToWorkOrderThreeDotTwo() { return confirmElementIsVisible(ADD_PROBLEM_TO_WORK_ORDER_THREE_DOT_TWO);}

    public boolean findSendInfoViaEmailButtonThreeDotTwo() { return confirmElementIsVisible(SEND_INFO_VIA_EMAIL_BUTTON_THREE_DOT_TWO);}

    public boolean findSubmitToPropertyButtonThreeDotTwo() { return confirmElementIsVisible(SUBMIT_TO_PROPERTY_BUTTON_THREE_DOT_TWO);}

    public boolean clickUnitThreeDotTwo() { return clickElement(UNIT_THREE_DOT_TWO);}

    public boolean clickProblemLocationThreeDotTwo() { return clickElement(PROBLEM_LOCATION_THREE_DOT_TWO);}

    public boolean clickProblemLocationKitchenThreeDotTwo() { return clickElement(KITCHEN_LOCATION_THREE_DOT_TWO);}

    public boolean findCategoryThreeDotTwo() { return confirmElementIsVisible(CATEGORY_THREE_DOT_TWO);}

    public boolean clickCategoryThreeDotTwo() { return clickElement(CATEGORY_THREE_DOT_TWO);}

    public boolean clickApplianceCategoryThreeDotTwo() { return clickElement(APPLIANCE_CATEGORY_THREE_DOT_TWO);}

    public boolean clickProblemThreeDotTwo() { return  clickElement(PROBLEM_THREE_DOT_TWO);}

    public boolean clickDishwasherProblemThreeDotTwo() { return clickElement(DISHWASHER_PROBLEM_THREE_DOT_TWO);}

    public boolean clickDescriptionOfProblemTextBox() { return clickElement(DESCRIPTION_OF_PROBLEM_TEXT_BOX_THREE_DOT_TWO);}

    public boolean insertDescriptionOfProblemInTextBox(String search) { return sendKeysToElement(DESCRIPTION_OF_PROBLEM_TEXT_BOX_THREE_DOT_TWO, search);}

    public boolean clickYesOnObtainedPermissionToEnter() { return clickElement(OBTAIN_PERMISSION_TO_ENTER_YES_THREE_DOT_TWO);}

    public boolean clickSubmitToPropertyButton() { return clickElement(SUBMIT_TO_PROPERTY_BUTTON_THREE_DOT_TWO);}

    public boolean clickResidentInfoTabThreeDotTwo() { return clickElement(RESIDENT_INFO_TAB_FROM_NEW_WORK_ORDER_THREE_DOT_TWO);}

    public boolean insertFirstNameInResidentInfoThreeDotTwo(String search) { return sendKeysToElement(FIRST_NAME_IN_RESIDENT_INFO_THREE_DOT_TWO, search);}

    public boolean insertLastNameInResidentInfoThreeDotTwo(String search) { return sendKeysToElement(LAST_NAME_IN_RESIDENT_INFO_THREE_DOT_TWO, search);}

    public boolean insertUnitInResidentInfoThreeDotTwo(String search) { return sendKeysToElement(UNIT_IN_RESIDENT_INFO_THREE_DOT_TWO, search);}

    public boolean clickBuildingDropdownInResidentInfoThreeDotTwo() {
        return clickElement(BLDG_DROPDOWN_IN_RESIDENT_INFO_THREE_DOT_TWO);
    }

    public boolean selectFirstBuildingInDropdown() {
        return clickElement(FIRST_BUILDING_IN_DROPDOWN_THREE_DOT_TWO);
    }

    public boolean insertPhoneNumberInResidentInfoThreeDotTwo(String search) { return sendKeysToElement(PRIMARY_PHONE_NUMBER_IN_RESIDENT_INFO_THREE_DOT_TWO, search);}

    public boolean insertCallIDNumberThreeDotTwo(String search) { return sendKeysToElement(CALL_ID_NUMBER_THREE_DOT_TWO, search);}

    public boolean findWorkOrderSubmittedSuccessfullyAlert() { return confirmElementIsVisible(WORK_ORDER_SUBMITTED_SUCCESSFULLY);}

    public boolean findResidentProtocolsTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_PROTOCOLS_TAB_THREE_DOT_TWO);}

    public boolean findResidentEmergencyTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_EMERGENCY_TAB_THREE_DOT_TWO);}

    public boolean findResidentWorkOrderHistoryTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_WORK_ORDER_HISTORY_TAB_THREE_DOT_TWO);}

    public boolean findResidentCallHistoryTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_CALL_HISTORY_TAB_THREE_DOT_TWO);}

    public boolean findResidentActivityTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_ACTIVITY_TAB_THREE_DOT_TWO);}

    public boolean findResidentPaymentInfoTabThreeDotTwo() { return confirmElementIsVisible(RESIDENT_PAYMENT_INFO_TAB_THREE_DOT_TWO);}

}
