package page_objects.entrata_page_objects.tools_tab.message_center_subtab.new_email_screens;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MessageCenterEmailNewEmailDraft extends BasePage {

// Message Center Draft New Email Items
private final By CLICK_CREATE_MESSAGE_CENTER_EMAIL = (By.id("message_center_create_email"));
//Use the MessageCenterNav for this ^^^, don't use this selector.

//Subject / Email Draft Selectors
private final By FIND_MESSAGE_CENTER_EMAIL_COMPOSE_MESSAGE_SUBJECT_LINE = (By.id("scheduled_email_subject"));
private final By LEAD_EMAIL_SUBJECT_LINE = By.id("application_email_subject");
private final By CLICK_MESSAGE_CENTER_EMAIL_JUMP_TO_SEND_OPTIONS_FROM_COMPOSE_MESSAGE = (By.id("step-3"));
private final By CLICK_MAINBODYCONTENT_BASIC_LAYOUT = (By.id("MAIN_BODY_CONTENT"));
//Recipients Locators
private final By MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_FIELD_LOCATE = (By.cssSelector("input[class='form-search-field scheduled-email-filter-search-field']"));
private final By MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_AND_CLICK_SEARCHED_RESULT = (By.xpath("//*[@id=\"scheduled_email_filter_lists\"]/tr/td[3]/a/i"));
//Have to use the xPath as there isn't a greater selector to use ^^^
private final By REMOVE_SELECTED_RECIPIENT_LIST_FROM_SELECTION = (By.cssSelector("i[class='trash']"));
private final By CLICK_MESSAGE_CENTER_EMAIL_SAVE_AND_CONTINUE_FROM_RECIPIENTS = (By.cssSelector("a[class='button large light-blue js-save-step tabindex-action']"));

//Email Design Selectors
private final By CLICK_MESSAGE_CENTER_EMAIL_SELECT_DESIGN_LAYOUT_BASIC = (By.id("email_template_2"));
private final By CLICK_MESSAGE_CENTER_EMAILS_BEING_SENT_FROM = (By.name("property_preferences[MESSAGE_CENTER_EMAIL_RELAY][value]"));
private final By CLICK_ENTER_EMAIL_BCC_VALID_AND_FAILED = (By.cssSelector(".bcc-input.bcc-input-field"));
//Send Options Buttons Selectors
private final By CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_SEND_ONCE = (By.id("send_once_tab"));
private final By CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_SEND_LATER = (By.id("send_later_tab"));
private final By CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_RECURRING_EVENT = (By.id("recurring_tab"));
private final By CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_AUTOMATED_EVENT = (By.id("automated_tab"));
private final By CLICK_SEND_EMAIL_BUTTON = By.id("applicationEmailSendButton");

//Schedule Email / Previous Step / Discard Email Options
    private final By CLICK_SCHEDULE_EMAIL = (By.id("scheduled_email_save"));
    private final By CLICK_PREVIOUS_STEP = (By.cssSelector("a[class='button large light-gray margin5-right text-dark-gray js-previous-step tabindex-action']"));
    private final By CLICK_DISCARD_BUTTON = (By.cssSelector("a[class='button large light-gray text-dark-gray js-discard-close add rights-edit add-tip tip-top tabindex-action binded']"));

//Discard Confirm / Cancel
    private final By CLICK_CONFIRM_DISCARD_BUTTON = (By.cssSelector("a[class='button small actions-btn']"));
    private final By CLICK_CANCEL_DISCARD_BUTTON = (By.cssSelector("a[class='button small-gray margin10-right close-tip']"));

//Close Button(s)
    private final By CLICK_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By CLICK_CONFIRM_CLOSE_FROM_POPUP = By.id("logout_alert_container");

//Overlay Selector - Using this primarily for the selection of the "Basic" Message Center Layout for the time being.
private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

//Constructor
    public MessageCenterEmailNewEmailDraft(WebDriver driver) {
        super(driver);
    }

// MC Draft New Email Items Methods
    public boolean selectCreateMessageCenterEmail() { return clickElement(CLICK_CREATE_MESSAGE_CENTER_EMAIL); }
    //Use the MessageCenterNav for this ^^^, don't use this selector.
    public boolean findMessageCenterEmailComposeMessageSubjectLine() { return confirmElementIsVisible(FIND_MESSAGE_CENTER_EMAIL_COMPOSE_MESSAGE_SUBJECT_LINE); }
    public boolean messageCenterEmailComposeMessageSubjectLineSendKeys() { return sendKeysToElement(FIND_MESSAGE_CENTER_EMAIL_COMPOSE_MESSAGE_SUBJECT_LINE, "New Test Subject Line"); }
    public boolean messageCenterLeadEmailComposeMessageSubjectLineSendKeys() { return sendKeysToElement(LEAD_EMAIL_SUBJECT_LINE, "New Test Subject Line"); }
    public boolean messageCenterEmailJumpToSendOptionsFromComposeMessage(){ return clickElement(CLICK_MESSAGE_CENTER_EMAIL_JUMP_TO_SEND_OPTIONS_FROM_COMPOSE_MESSAGE); }

//Using the "Basic" Layout option in MC Draft Screen Methods
    public boolean messageCenterEmailClickMainBodyContentBasicLayout() { return clickElement(CLICK_MAINBODYCONTENT_BASIC_LAYOUT); }
    public boolean messageCenterEmailSendKeysMainBodyContentBasicLayout(){
    return sendKeysToElement(CLICK_MAINBODYCONTENT_BASIC_LAYOUT, "New Test Email Body Content!"); }

//Use of the Recipient Search field to locate and input a "List" Name Methods
    public boolean messageCenterEmailRecipientsSearchFieldLocate(){ return clickElement(MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_FIELD_LOCATE); }
    public boolean messageCenterEmailRecipientsSearchFieldSendKeys() { return sendKeysToElement(MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_FIELD_LOCATE, "Movie"); }
    public boolean messageCenterEmailRecipientsSearchFieldSendKeysAmazonDeliveries() { return sendKeysToElement(MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_FIELD_LOCATE, "Amazon Deliveries"); }
    public boolean messageCenterEmailRecipientsSearchAndClickSearchedResult(){ return clickElement(MESSAGE_CENTER_EMAIL_RECIPIENTS_SEARCH_AND_CLICK_SEARCHED_RESULT); }
    public boolean messageCenterEmailRemoveSearchedResultFromSelection(){ return clickElement(REMOVE_SELECTED_RECIPIENT_LIST_FROM_SELECTION); }

//Save and Continue Option from the Recipients/List Area (Step 1) Methods
    public boolean messageCenterEmailSaveAndContinueFromRecipients() { return clickElement(CLICK_MESSAGE_CENTER_EMAIL_SAVE_AND_CONTINUE_FROM_RECIPIENTS); }
//Message Center Compose Screen Methods
    public boolean messageCenterEmailSelectMessageDesignLayoutBasic() { waitForOverlay(LOADING_OVERLAY); return clickElement(CLICK_MESSAGE_CENTER_EMAIL_SELECT_DESIGN_LAYOUT_BASIC); }
    public boolean messageCenterEmailsBeingSentFrom() { return clickElement(CLICK_MESSAGE_CENTER_EMAILS_BEING_SENT_FROM); }
// Entering Valid + Invalid Emails into the BCC field to validate Test Case - "Message Center_Test_2226226" Methods
    public boolean enterEmailBccValidAndFailed() { return clickElement(CLICK_ENTER_EMAIL_BCC_VALID_AND_FAILED); }
    public boolean sendKeysToBCCValidAndFailed() { return sendKeysToElement(CLICK_ENTER_EMAIL_BCC_VALID_AND_FAILED, "test@tester.org test@tester "); }
// Message Center Send Options Clicks / Buttons Methods
    public boolean identifyMessageCenterEmailSendOptionsSendOnceOption() { return clickElement(CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_SEND_ONCE); }
    public boolean identifyMessageCenterEmailSendOptionsSendLaterOption() { return clickElement(CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_SEND_LATER); }
    public boolean identifyMessageCenterEmailSendOptionsRecurringEventOption() { return clickElement(CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_RECURRING_EVENT); }
    public boolean identifyMessageCenterEmailSendOptionsAutomatedEventOption() { return clickElement(CLICK_MESSAGE_CENTER_EMAILS_SEND_OPTIONS_AUTOMATED_EVENT); }
//Schedule/Cancel email Options Methods
    public boolean clickScheduleEmailFromSendOptions() {return clickElement(CLICK_SCHEDULE_EMAIL);}
    public boolean clickPreviousStepFromSendOptions() {return clickElement(CLICK_PREVIOUS_STEP);}
    public boolean clickDiscardOptionFromSendOptions() { waitForOverlay(LOADING_OVERLAY); return clickElement(CLICK_DISCARD_BUTTON, waitTimes.DEFAULT_WAIT);}
    public boolean clickConfirmDiscardButtonFromSendOptions() {return clickElement(CLICK_CONFIRM_DISCARD_BUTTON, waitTimes.DEFAULT_WAIT);}
    public boolean clickCancelDiscardButtonFromSendOptions() {return clickElement(CLICK_CANCEL_DISCARD_BUTTON, waitTimes.DEFAULT_WAIT);}
    public boolean clickSendEmailButton() {return clickElement(CLICK_SEND_EMAIL_BUTTON);}

    // Close Methods
    public boolean clickCloseButtonFromSendOptions() {return clickElement(CLICK_CLOSE_BUTTON, waitTimes.DEFAULT_WAIT);}
    public boolean clickConfirmCloseButtonFromPopup() {return pressEnter(CLICK_CONFIRM_CLOSE_FROM_POPUP);}
}

