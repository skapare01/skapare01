package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MessageCenterNav extends BasePage {
    public MessageCenterNav(WebDriver driver) {
        super(driver);
    }
//General Nav through Message Center Areas
    private final By CLICK_MESSAGE_CENTER_EMAIL_SENT_TAB = (By.id("emailTransmissionTab"));
    private final By CLICK_MESSAGE_CENTER_EMAIL_DRAFTS_TAB = (By.id("draftTab"));
    private final By CLICK_NAVIGATE_TO_MY_LISTS = (By.id("left_menu_my_list"));
    private final By CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_SAVED_TAB = (By.id("scheduled_email_filter_saved_tab"));
    private final By CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_TEMPORARY_TAB = (By.id("scheduled_email_filter_temporary_tab"));

    private final By CLICK_OPEN_CREATE_NEW_MESSAGE_CENTER_ITEM = (By.cssSelector("a[class='button large menu binded binded-hover-intent']"));
    private final By FIND_VIEW_CREATE_MESSAGE_CENTER_EMAIL = (By.id("message_center_create_email"));
    private final By FIND_CREATE_NEW_MESSAGE_CENTER_LIST = (By.cssSelector("li[onclick='MessageCenter.loadContactList(false, false, 1);']"));
    // Used in viewNewlyCreatedList method to find recently created list with random title
    private final String FIRST_HALF_LIST_NAME_SELECTOR = "//*[text()='";
    private final String SECOND_HALF_LIST_NAME_SELECTOR = "']";



//Create new Message Center Items from Dashboard -> "Create New" option
    private final By CLICK_CREATE_NEW_MESSAGE_CENTER_ITEM = By.cssSelector("a[class='button large menu binded binded-hover-intent']");
    private final By CLICK_MESSAGE_CENTER_SELECT_CREATE_LIST_OPTION = (By.cssSelector("li[onclick='MessageCenter.loadContactList(false, false, 1);']"));
    private final By CLICK_CREATE_MESSAGE_CENTER_EMAIL = (By.id("message_center_create_email"));
    private final By CLICK_CREATE_UPLOAD_LIST = (By.cssSelector("li[onclick='EmailCampaign.loadUploadListDialog();']"));
    private final By CLICK_CREATE_UPLOADED_LIST_EMAIL = (By.cssSelector("li[onclick='EmailCampaign.ComposeEmailDialog();']"));

//Message Center SelectCreateEmergencyTextMessage -- ID
    private final By CLICK_CREATE_EMERGENCY_TEXT_MESSAGE = (By.id("text_message_create_emergency_text_message_new"));

 //General Smoke Navigation
    public boolean messageCenterEmailSentTab() {
        return clickElement(CLICK_MESSAGE_CENTER_EMAIL_SENT_TAB);
    }
    public boolean messageCenterEmailDraftsTab() {
        return clickElement(CLICK_MESSAGE_CENTER_EMAIL_DRAFTS_TAB);
    }
    public boolean navigateToMyLists() {
        return clickElement(CLICK_NAVIGATE_TO_MY_LISTS);
    }
    public boolean navigateToMessageCenterMyListsSavedTab() {
        return clickElement(CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_SAVED_TAB);
    }
    public boolean navigateToMessageCenterMyListsTemporaryTab() { return clickElement(CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_TEMPORARY_TAB); }
    public boolean openCreateNewMessageCenterItem() {
        return clickElement(CLICK_OPEN_CREATE_NEW_MESSAGE_CENTER_ITEM);
    }
    public boolean viewCreateMessageCenterEmail() { return confirmElementIsVisible(FIND_VIEW_CREATE_MESSAGE_CENTER_EMAIL); }
    public boolean viewCreateMessageCenterList() { return confirmElementIsVisible(FIND_CREATE_NEW_MESSAGE_CENTER_LIST); }
    public boolean viewNewlyCreatedList(String nameToBeFound) {
        return confirmElementIsVisible(By.xpath(FIRST_HALF_LIST_NAME_SELECTOR + nameToBeFound + SECOND_HALF_LIST_NAME_SELECTOR));
    }

    //For Opening the Message Center "Create" (New) Options, Emails, Lists, Uploaded Lists, Emergency SMS
    public boolean createNewMessageCenterItem(){
                    return clickElement(CLICK_CREATE_NEW_MESSAGE_CENTER_ITEM);
                }

//Select Message Center "Create New" item from Message Center Dashboard.
    public boolean selectCreateMessageCenterEmail() { return clickElement(CLICK_CREATE_MESSAGE_CENTER_EMAIL); }
    public boolean messageCenterSelectCreateListOption(){
        return clickElement(CLICK_MESSAGE_CENTER_SELECT_CREATE_LIST_OPTION);
    }
    public boolean messageCenterSelectCreateUploadList(){
            return clickElement(CLICK_CREATE_UPLOAD_LIST);
        }
    public boolean messageCenterSelectCreateUploadedListEmail(){ return clickElement(CLICK_CREATE_UPLOADED_LIST_EMAIL); }
    public boolean messageCenterSelectCreateEmergencyTextMessage(){return clickElement(CLICK_CREATE_EMERGENCY_TEXT_MESSAGE); }
}

