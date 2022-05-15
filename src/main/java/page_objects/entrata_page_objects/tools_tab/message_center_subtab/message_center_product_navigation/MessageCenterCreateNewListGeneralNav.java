package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class MessageCenterCreateNewListGeneralNav extends BasePage {
    public MessageCenterCreateNewListGeneralNav(WebDriver driver) {
        super(driver);
    }

    RandomGenerator randomGenerator = new RandomGenerator();
// Create List Option Selector
    private final By CLICK_MESSAGE_CENTER_CREATE_NEW_LIST_NAME_THIS_LIST = By.id("filter_name");


//List types selectors, need to be xPath's since this is the most direct way to find these elements
    private final By CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS = By.id("scheduled_email_type");
    private final By CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS_TYPE_RESIDENTS = By.xpath("//*[@id=\"scheduled_email_type\"]/option[2]");
    private final By CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS_TYPE_LEADS_AND_APPLICANTS = By.xpath("//*[@id=\"scheduled_email_type\"]/option[3]");

// Save & Continue Button(s) Selectors
    private final By CLICK_MESSAGE_CENTER_SAVE_AND_CONTINUE_BUTTON = By.xpath("//a[text()='Save & Continue']");
    private final By CLICK_MESSAGE_CENTER_SAVE_AND_CONTINUE_BUTTON_PAGE_2 = By.cssSelector("a[class='button small light-blue js-step-three']");

    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

//Generate / Save List Selectors
    private final By CLICK_MESSAGE_CENTER_CREATE_NEW_LIST_GENERATE_LIST = By.cssSelector("input[class='form-submit js-list-generation']");
    private final By GENERATE_LIST_SAVE_LIST = By.id("save_generated_list");
    public String name1;
    public String name2;



//Name this list Methods
    public boolean messageCenterCreateNewListNameThisList(String listTitle){
        return sendKeysToElement(CLICK_MESSAGE_CENTER_CREATE_NEW_LIST_NAME_THIS_LIST, listTitle); }
    public boolean messageCenterCreateNewListNameThisList2(String listTitle2){
        return sendKeysToElement(CLICK_MESSAGE_CENTER_CREATE_NEW_LIST_NAME_THIS_LIST, listTitle2); }
    public String getName1(){return name1;}
    public String getName2(){return name2;}

//Select Recipients Method
    public boolean messageCenterCreateNewListSelectRecipients(){ return clickElement(CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS); }

//Methods for navigating to and around "My Lists" live in the "MessageCenterNav" page object under: Page_Objects->Message_Center->Smoke_Navigation_MC_Product
    public boolean messageCenterCreateNewListSelectRecipientsTypeResidents() { return clickElement(CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS_TYPE_RESIDENTS); }
    public boolean messageCenterCreateNewListSelectRecipientsTypeLeadsAndApplicants() { return clickElement(CLICK_CREATE_NEW_LIST_SELECT_RECIPIENTS_TYPE_LEADS_AND_APPLICANTS); }

// Save & Continue Methods
    public boolean messageCenterCreateNewListSaveAndContinue(){ return clickElement(CLICK_MESSAGE_CENTER_SAVE_AND_CONTINUE_BUTTON);}
    public boolean messageCenterCreateNewListSaveAndContinuePage2(){return clickElement(CLICK_MESSAGE_CENTER_SAVE_AND_CONTINUE_BUTTON_PAGE_2);}

// Overlay Method
    private void overlayMethod(){waitForOverlay(LOADING_OVERLAY); }

//Generate / Save List Methods
    public boolean messageCenterCreateNewListGenerateList(){overlayMethod(); return clickElement(CLICK_MESSAGE_CENTER_CREATE_NEW_LIST_GENERATE_LIST); }
    public boolean generateListSaveList(){overlayMethod(); return clickElement(GENERATE_LIST_SAVE_LIST); }

}
