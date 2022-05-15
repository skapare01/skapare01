package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyQuickResponses extends BasePage {
//Locate Header Selector

//Create Quick Response tab / button Selectors
    private final By QUICK_RESPONSES_PAGE = By.id("li_nav_quick_responses_setupxxx");
    private final By LOCATE_CREATE_QUICK_RESPONSES = By.xpath("//a[text()=' Create Quick Response']");

//Create Quick Response Page Selectors
    private final By CREATE_QUICK_RESPONSE_NAME_FIELD = By.xpath("//*[@id=\"create_quick_response_frm\"]/fieldset/div[1]/div[1]/b/div[1]/input\n");
    private final By CREATE_QUICK_RESPONSE_SUBJECT_FIELD = By.id("subject");

//Text Body Selectors
private final By QUICK_RESPONSE_TEXT_BODY_FIELD = By.id("quick_response[message]");

//Choose Template - Templates Selectors

//Property Search Text Box Selector
private final By SELECT_PROPERTY_SEARCH_TEXT_FIELD_CREATE_QUICK_RESPONSE = By.xpath("//*[@id=\"test\"]");

// Property Search Select Property Selector
    private final By SELECT_SEARCHED_PROPERTY_CREATE_QUICK_RESPONSE = By.xpath("//*[@id=\"create_quick_response_frm\"]/fieldset/div[1]/div[2]/div/div/ul/li[1]/label/input");


    //Edit Quick Responses Selectors
    private final By EDIT_QUICK_RESPONSE = By.cssSelector("i[class='edit js-edit-response']");

    //Delete Quick Response button Selectors
    private final By DELETE_QUICK_RESPONSE_RED_X_QUICK_RESPONSE_NAME = By.cssSelector("i[class='delete js-delete-response']");

    private final By CONFIRM_DELETE_QUICK_RESPONSE_BUTTON = By.id("quick_response_delete");

    //Preview Quick Response button selectors, Desktop & Mobile
    private final By PREVIEW_TEMPLATE_DESKTOP_VIEW = By.cssSelector("div[class='button action first']");
    private final By PREVIEW_TEMPLATE_MOBILE_VIEW = By.cssSelector("div[class='button action last']");

    //General Page Navigation Selectors

    //Items per Page: Button Selector
    private final By ITEMS_PER_PAGE_DROPDOWN = By.cssSelector("select[name='page_size'][class='form-select wide1']");
    private final By ITEMS_PER_PAGE_20 = By.cssSelector("option[value='20']");

    //Save and Cancel Selectors
    private final By CLICK_QUICK_RESPONSE_SAVE_BUTTON = By.id("submit_response");
    private final By CLICK_HOUSTON_DESKTOP_PREVIEW_CLOSE_BUTTON = By.cssSelector("span[class='ui-button-icon-primary ui-icon ui-icon-closethick']");
    private final By CLICK_HOUSTON_MOBILE_PREVIEW_CLOSE_BUTTON = By.cssSelector("span[class='ui-button-icon-primary ui-icon ui-icon-closethick']");

//Overlay Selector
private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Constructor//
    public CompanyQuickResponses(WebDriver driver) { super(driver); }
    //Locate Header Method

    //Create Quick Response tab / button Method
    public boolean clickQuickResponsesSubTab() {
        return clickElement(QUICK_RESPONSES_PAGE);
    }
    public boolean locateCreateQuickResponses() {return confirmElementIsVisible(LOCATE_CREATE_QUICK_RESPONSES);}
    public boolean clickCreateQuickResponse() {return clickElement(LOCATE_CREATE_QUICK_RESPONSES);}

    //Create Quick Response Page Methods
    public boolean clickAndSendKeysToCreateQuickResponseNameField() {waitForPotentialOverlay(); return sendKeysToElement(CREATE_QUICK_RESPONSE_NAME_FIELD, "Quick Response Name");}
    public boolean clickAndSendKeysToQuickResponseSubjectField() {return sendKeysToElement(CREATE_QUICK_RESPONSE_SUBJECT_FIELD, "Quick Response Subject");}

    //Text Body Methods
    public boolean clickAndSendKeysToQuickResponseTextBody() {return sendKeysToElement(QUICK_RESPONSE_TEXT_BODY_FIELD, "This is the Quick Response Text Body");}
    //Choose Template - Templates Methods

    //Property Search Text Box Method
    public boolean clickAndSendKeysToPropertySearchTextBoxCreateQuickResponse() {return sendKeysToElement(SELECT_PROPERTY_SEARCH_TEXT_FIELD_CREATE_QUICK_RESPONSE, "Cavalier Court");}

    // Property Search Select Property Method
    public boolean clickSearchedPropertyCreateQuickResponse() {return clickElement(SELECT_SEARCHED_PROPERTY_CREATE_QUICK_RESPONSE);}

    //Edit Quick Responses Methods
    public boolean editQuickResponse() {return clickElement(EDIT_QUICK_RESPONSE);}
    public boolean sendKeysToQuickResponseHoustonBodyContent() {return sendKeysToElement(QUICK_RESPONSE_TEXT_BODY_FIELD, "Edit");}

    //Delete Quick Responses button Selectors


    //Preview Quick Response button selectors, Desktop & Mobile
    public boolean clickPreviewHoustonQRDesktopView() {waitForPotentialOverlay(); return clickElement(PREVIEW_TEMPLATE_DESKTOP_VIEW, waitTimes.LONG_WAIT);}
    public boolean clickPreviewHoustonQRMobileView() {waitForPotentialOverlay(); return clickElement(PREVIEW_TEMPLATE_MOBILE_VIEW);}

    //Delete Quick Response Selectors
    public boolean clickDeleteQuickResponseXButtonAnyTemplate() {waitForPotentialOverlay(); return clickElement(DELETE_QUICK_RESPONSE_RED_X_QUICK_RESPONSE_NAME);}

    public boolean clickConfirmDeleteQuickResponseXButton() {return clickElement(CONFIRM_DELETE_QUICK_RESPONSE_BUTTON);}


    //General Page Navigation Methods


    //Items per Page: Button Selector
    public boolean clickItemsPerPageDropdown() {waitForPotentialOverlay(); return clickElement(ITEMS_PER_PAGE_DROPDOWN);}
    public boolean clickItemsPerPage20() {return clickElement(ITEMS_PER_PAGE_20);}

    //Save and Cancel Methods
    public boolean clickCreateQuickResponseSaveButton() {return clickElement(CLICK_QUICK_RESPONSE_SAVE_BUTTON);}

    public boolean clickCloseDesktopPreviewButton() {return clickElement(CLICK_HOUSTON_DESKTOP_PREVIEW_CLOSE_BUTTON);}
    public boolean clickCloseMobilePreviewButton() {return clickElement(CLICK_HOUSTON_MOBILE_PREVIEW_CLOSE_BUTTON);}

    //Overlay Method
    private void waitForPotentialOverlay() { waitForOverlay(LOADING_OVERLAY);}
}
