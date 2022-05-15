package page_objects.entrata_page_objects.leads_tab.lead_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadActivityLog extends BasePage {

    //Navigate to Activity Log Page
    private final By CLICK_ACTIVITY_LOG_PAGE = By.id("application_history_tab_tab");
    private final By LEAD_SUBMITTED_ACTIVITY = By.xpath("//span[contains(text(),'Guest Card Submitted')]");

    //Add Activity General Selectors
    private final By ADD_ACTIVITY_BUTTON = By.id("addActivity");
    private final By EVENT_TYPE_DROPDOWN = By.id("event_type");
    private final By ADD_ACTIVITY_NOTES_FIELD = By.id("noteField");
    //Results Selectors
    private final By RESULT_DROPDOWN = By.id("event_result");
    private final By RESULT_CANCELLED = By.xpath("option[contains(text(),'\n" +
            "Cancelled')]");
    private final By RESULT_COMPLETED = By.xpath("//*[@id=\"event_result\"]/option[3]");


    private final By RESULT_MISSED = By.xpath("option[contains(text(),'\n" +
            "Missed')]");
    private final By RESULT_RESCHEDULED = By.xpath("option[contains(text(),'\n" +
            "Rescheduled')]");

    private final By RESULT_UNQUALIFIED = By.xpath("//option[contains(text(),'Unqualified')]");
    private final By RESULT_RESPONSE_SENT = By.xpath("//*[@id=\"event_result\"]/option[3]\n");


    //Add Activity Options Selectors
    private final By ADD_NOTE_OPTION = By.xpath("//option[contains(text(),'Add Note')]");
    private final By ONSITE_VISIT_OPTION = By.xpath("//option[contains(text(),' Onsite Visit')]");
    private final By INCOMING_CALL_OPTION = By.xpath("//option[contains(text(),'  Incoming Call')]");
    private final By INCOMING_EMAIL_OPTION = By.xpath("//option[contains(text(),'  Incoming Email')]");
    private final By OUTGOING_CALL_OPTION = By.xpath("//option[contains(text(),' Outgoing Call')]");
    private final By INCOMING_TEXT_OPTION = By.xpath("//option[contains(text(),'  Incoming Text')]");
    private final By OUTGOING_TEXT_OPTION = By.xpath("//option[contains(text(),'  Outgoing Text')]");
    private final By SELF_GUIDED_TOUR_OPTION = By.xpath("//option[contains(text(),'  Self-Guided Tour')]");
    private final By VIRTUAL_TOUR_OPTION = By.xpath("//option[contains(text(),'  Virtual Tour')]");

    //Unit Specific Add Activity Selectors
    private final By PROPERTY_TOUR_YES_NO_TOGGLE = By.id("property_tour_only");
    private final By UNIT_SHOWN_MODAL_POPUP_BUTTON = By.id("tour_first");
    private final By VIEW_UNAVAILABLE_UNITS_BUTTON = By.id("unavailable_unit_button");
    private final By UNIT_6974_22_SELECT_RADIO_BUTTON = By.id("unit_space_1516062");
    private final By UNIT_SEARCH_CONTINUE_BUTTON = By.cssSelector("input[value='Continue']");
    private final By COMPLETE_REVIEW_UNIT_DETAILS_BUTTON = By.cssSelector("input[value='Complete']");

    //Add Activity Submit / Cancel Selectors
    private final By SUBMIT_CREATE_ACTIVITY_BUTTON = By.id("submit_add_history");

    // Locate Lead Activity Selectors
    private final By LOCATE_SENT_EMAIL = By.xpath("//p[text()='New Test Subject Line']");

    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
//Constructor
    public LeadActivityLog(WebDriver driver) { super(driver); }
    //Navigate to Activity Log Page
    public boolean clickActivityLogPage() {waitForActivityLogPotentialOverlay();  return clickElement(CLICK_ACTIVITY_LOG_PAGE, waitTimes.UNREASONABLE_WAIT);}
    public boolean locateLeadSubmittedActivity() {return confirmElementIsVisible(LEAD_SUBMITTED_ACTIVITY,waitTimes.LONG_WAIT);}

    //Add Activity General Methods
    public boolean useAddActivityButton() {waitForActivityLogPotentialOverlay(); return clickElement(ADD_ACTIVITY_BUTTON, waitTimes.LONG_WAIT);}
    public boolean useAddActivityEventTypeDropdown() {waitForActivityLogPotentialOverlay(); return clickElement(EVENT_TYPE_DROPDOWN);}
    public boolean addActivityNotesTextField() {waitForActivityLogPotentialOverlay(); return sendKeysToElement(ADD_ACTIVITY_NOTES_FIELD,"Adding Test Event");}

    //Result Methods
    public boolean clickResultOfAddActivityDropdown() {return clickElement(RESULT_DROPDOWN);}
    public boolean clickResultCompleted() {return clickElement(RESULT_COMPLETED);}
    public boolean clickResultUnqualified() {return clickElement(RESULT_UNQUALIFIED);}
    public boolean clickResultResponseSent() {return clickElement(RESULT_RESPONSE_SENT);}

    // Locate Lead Activity Methods
    public boolean locateSentEmail() {return confirmElementIsVisible(LOCATE_SENT_EMAIL);}

    //Add Activity Options Methods
    public boolean selectAddNoteActivityEvent() { return clickElement(ADD_NOTE_OPTION);}
    public boolean selectOnsiteVisitActivityEvent() { return clickElement(ONSITE_VISIT_OPTION);}
    public boolean selectIncomingCallActivityEvent() { return clickElement(INCOMING_CALL_OPTION);}
    public boolean selectIncomingEmailActivityEvent() { return clickElement(INCOMING_EMAIL_OPTION);}
    public boolean selectOutgoingCallActivityEvent() { return clickElement(OUTGOING_CALL_OPTION);}
    public boolean selectIncomingTextActivityEvent() { return clickElement(INCOMING_TEXT_OPTION);}
    public boolean selectOutgoingTextActivityEvent() { return clickElement(OUTGOING_TEXT_OPTION);}
    public boolean selectSelfGuidedTourActivityEvent() {return clickElement(SELF_GUIDED_TOUR_OPTION);}
    public boolean selectVirtualTourActivityEvent() {return clickElement(VIRTUAL_TOUR_OPTION);}

    //Unit Specific Add Activity Methods
    public boolean selectPropertyTourYesNoToggle() {return clickElement(PROPERTY_TOUR_YES_NO_TOGGLE);}
    public boolean selectUnitShownButtonModalPopup() {return clickElement(UNIT_SHOWN_MODAL_POPUP_BUTTON);}

    public boolean selectViewUnavailableUnitsButton() {return clickElement(VIEW_UNAVAILABLE_UNITS_BUTTON);}
    public boolean selectUnit6974_22_RadioButton() {return clickElement(UNIT_6974_22_SELECT_RADIO_BUTTON);}
    public boolean selectUnitSearchContinueButton() {return clickElement(UNIT_SEARCH_CONTINUE_BUTTON);}
    public boolean selectCompleteReviewUnitDetailsButton() {return clickElement(COMPLETE_REVIEW_UNIT_DETAILS_BUTTON);}

    //Add Activity Submit / Cancel Methods
    public boolean selectSubmitCreateActivityButton() {return clickElement(SUBMIT_CREATE_ACTIVITY_BUTTON);}

    //Overlay Method
    private void waitForActivityLogPotentialOverlay() { waitForOverlay(LOADING_OVERLAY);}
}
