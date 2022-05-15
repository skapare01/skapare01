package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import static utils.RandomGenerator.randomNumber;

public class TextMessagingSubTab extends BasePage {
//Click sub-tab Selector
private final By CLICK_TEXT_MESSAGING_SUB_TAB = (By.id("property_communication_general_smsxxx"));

//Text Messaging sub-tab Headers selectors
    private final By LOCATE_TEXT_KEYWORDS_HEADER = (By.xpath("//h3[contains(text(),'Text Keywords')]"));
    private final By LOCATE_OPT_IN_PREFERENCE_HEADER = (By.xpath("//h3[contains(text(),'Opt-in Preference')]"));
    //Edit Keywords + Messages + Opt-In Preference Buttons selectors
    private final By LOCATE_EDIT_KEYWORDS_PROPERTY_SETTINGS_BUTTON = By.id("toggle_edit_mode_property_sms_keyword");
    private final By LOCATE_EDIT_MESSAGES_PROPERTY_SETTINGS_BUTTON = By.id("toggle_edit_mode_property_sms_message");
//Edit / Delete Listed Keyword Selectors
    private final By EDIT_EXISTING_KEYWORD = By.cssSelector("i[class='edit pointer edit_property_sms_keyword']");
    private final By DELETE_EXISTING_KEYWORD = By.cssSelector("i[class='delete pointer delete_property_sms_keyword']");
// Edit / Delete Listed Messsage Selectors
    private final By EDIT_EXISTING_MESSAGE = By.cssSelector("i[class='edit pointer edit_property_sms_message']");
    private final By DELETE_EXISTING_MESSAGE = By.cssSelector("i[class='delete pointer delete_property_sms_message']");



//Add a Keyword in Text Keywords property setup section selectors
    private final By ADD_A_NEW_KEYWORD_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS = By.id("add_property_sms_keyword");
//Add a new Message in Text Messages property setup section selectors
    private final By ADD_A_NEW_MESSAGE_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS = By.id("add_property_sms_message");

//Save/Cancel for "Text Keywords" section selector(s)
    private final By SAVE_BUTTON_TEXT_KEYWORDS_PROPERTY_SETTINGS = By.id("submit_form_property_sms_keywords");

//Save/Cancel for "Text Messages" section selector(s)
    private final By SAVE_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS = By.id("submit_form_property_sms_messages");

//Add a New Keyword Edit Screen selectors
    private final By KEYWORD_ADD_KEYWORD_NAME_BOX = By.name("property_sms_keyword[keyword]");
    private final By MATCHED_RESPONSE_MESSAGE_TEXT_BOX = By.id("property_sms_keyword_matched_message");
    private final By UNMATCHED_RESPONSE_MESSAGE_TEXT_BOX = By.id("property_sms_keyword_unmatched_message");
    private final By CLICK_SAVE_BUTTON_IN_ADD_EDIT_KEYWORD_SCREEN = By.id("save_property_sms_keyword");
//Add a new Message Edit Screen selectors
    private final By RESPONSE_MESSAGE_TEXT_BOX = By.id("property_sms_message_message");
    private final By CLICK_SAVE_MESSAGE_BUTTON_IN_ADD_EDIT_MESSAGE_SCREEN = By.id("save_property_sms_message");
// Delivery Date field/calendar popup selectors
    private final By DELIVERY_DATE_MONTH_FIELD_SELECTOR = By.cssSelector("input[class='month']");
    private final By DELIVERY_DATE_DAY_FIELD_SELECTOR = By.cssSelector("input[class='day']");
    private final By DELIVERY_DATE_YEAR_FIELD_SELECTOR = By.cssSelector("input[class='year']");


//Delivery/Subscription Dropdown Selectors
    private final By SUBSCRIPTION_LIST_DROPDOWN_SELECTOR = By.name("property_sms_message[message_type_id]");
    private final By SUBSCRIPTION_LIST_LEAD_COMMUNICATION_OPTION = By.xpath("//option[text()='Lead Communication']");
    private final By SUBSCRIPTION_LIST_RESIDENT_COMMUNICATION_OPTION = By.xpath("//option[text()='Resident Communication']");


    //Overlay Method Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

// Constructor
public TextMessagingSubTab(WebDriver driver) { super(driver); }

// Click Tab Method
    public boolean clickTextMessagingSubTab() {return clickElement(CLICK_TEXT_MESSAGING_SUB_TAB); }

//Text Messaging sub-tab Find Headers Methods
    public boolean findTextKeywordsHeader() {return clickElement(LOCATE_TEXT_KEYWORDS_HEADER); }
    public boolean findOptInPreferenceHeader() {return clickElement(LOCATE_OPT_IN_PREFERENCE_HEADER); }
//Edit Keywords + Messages + Opt-In Preference Buttons selectors
    public boolean useEditKeywordsPropertySettingsButton() {
    return clickElement(LOCATE_EDIT_KEYWORDS_PROPERTY_SETTINGS_BUTTON, waitTimes.LONG_WAIT); }
    public boolean useEditKeywordsPropertySettingsButtonWithWaitForOverlayMethod() {waitForOverlay(LOADING_OVERLAY);
        return clickElement(LOCATE_EDIT_KEYWORDS_PROPERTY_SETTINGS_BUTTON, waitTimes.LONG_WAIT); }
    public boolean useEditMessagesPropertySettingsButton() {
    return clickElement(LOCATE_EDIT_MESSAGES_PROPERTY_SETTINGS_BUTTON); }
    public boolean useEditMessagesPropertySettingsButtonWithWaitForOverlayMethod() {waitForOverlay(LOADING_OVERLAY);
        return clickElement(LOCATE_EDIT_MESSAGES_PROPERTY_SETTINGS_BUTTON); }




//Edit / Delete Listed Keyword Selectors
    public boolean useEditExistingKeyword() { return clickElement(EDIT_EXISTING_KEYWORD);}
    public boolean useDeleteExistingKeyword() { return clickElement(DELETE_EXISTING_KEYWORD);}

// Edit / Delete Listed Messsage Selectors
    public boolean useEditExistingMessage() { return clickElement(EDIT_EXISTING_MESSAGE);}
    public boolean useDeleteExistingMessage() { return clickElement(DELETE_EXISTING_MESSAGE);}

    // Add a Keyword Methods
public boolean useAddAKeywordPropertySettingsButton() {
    return clickElement(ADD_A_NEW_KEYWORD_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS, waitTimes.LONG_WAIT); }

//Add a Message Methods
public boolean useAddAMessagePropertySettingsButton() {
    return clickElement(ADD_A_NEW_MESSAGE_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS); }

//Save/Cancel for "Text Keywords" section methods
    public boolean useSaveButtonTextKeywordsPropertySettings() {
    return clickElement(SAVE_BUTTON_TEXT_KEYWORDS_PROPERTY_SETTINGS); }


//Save/Cancel for "Text Messages" section methods
    public boolean useSaveButtonTextMessagesPropertySettings() {
    return clickElement(SAVE_BUTTON_TEXT_MESSAGING_PROPERTY_SETTINGS); }



//Add a New Keyword Edit Screen Methods
public boolean addOrEditKeywordTextFieldBoxAndSendKeys() {return sendKeysToElement(KEYWORD_ADD_KEYWORD_NAME_BOX, randomNumber());}
public boolean addOrEditKeywordTextFieldBoxAndSendKeysFollowUp() {return sendKeysToElement(KEYWORD_ADD_KEYWORD_NAME_BOX, randomNumber());}


public boolean clickAndSendKeysToMatchedResponseMessageTextBox() {return sendKeysToElement(MATCHED_RESPONSE_MESSAGE_TEXT_BOX,
        "You have been matched with the property!");}
public boolean clickAndSendKeysToUnmatchedResponseMessageTextBox() {return sendKeysToElement(UNMATCHED_RESPONSE_MESSAGE_TEXT_BOX,
        "You were unable to be matched with an existing lead at the property!");}

public boolean clickSaveButtonFromAddOrEditAKeywordScreen() {return clickElement(CLICK_SAVE_BUTTON_IN_ADD_EDIT_KEYWORD_SCREEN);}

//Add a new Message Edit Screen Methods
    public boolean clickAndSendKeysToResponseMessageTextBox() {
    return sendKeysToElement(RESPONSE_MESSAGE_TEXT_BOX, "Here is a sample text message.");}
    public boolean clickSaveButtonFromAddOrEditAMessageScreen() {return clickElement(CLICK_SAVE_MESSAGE_BUTTON_IN_ADD_EDIT_MESSAGE_SCREEN);}

// Delivery Date field/calendar popup Methods
    public boolean selectAndSendKeysToTheDeliveryDateMonthField() {return sendKeysToElement(DELIVERY_DATE_MONTH_FIELD_SELECTOR, "12");}
    public boolean selectAndSendKeysToTheDeliveryDateDateField() {return sendKeysToElement(DELIVERY_DATE_DAY_FIELD_SELECTOR, "12");}
    public boolean selectAndSendKeysToTheDeliveryDateYearField() {return sendKeysToElement(DELIVERY_DATE_YEAR_FIELD_SELECTOR, "2025");}

//Delivery/Subscription Dropdown Selectors
    public boolean clickSubscriptionListDropdownSelector() {return clickElement(SUBSCRIPTION_LIST_DROPDOWN_SELECTOR);}
    public boolean clickSubscriptionListLeadCommunicationOption() {return clickElement(SUBSCRIPTION_LIST_LEAD_COMMUNICATION_OPTION);}
    public boolean clickSubscriptionListResidentCommunicationOption() {return clickElement(SUBSCRIPTION_LIST_RESIDENT_COMMUNICATION_OPTION);}

}
