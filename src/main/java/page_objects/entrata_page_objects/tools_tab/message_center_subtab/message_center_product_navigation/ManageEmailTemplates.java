package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class ManageEmailTemplates extends BasePage {

    RandomGenerator randomGenerator = new RandomGenerator();

    //Constructor
    public ManageEmailTemplates(WebDriver driver) { super(driver); }


// "Click Manage Email Templates" button selector
    private final By MANAGE_EMAIL_TEMPLATES_BUTTON = By.id("left_menu_manage_email_templates");
    //Template Search Field Selector
    private final By EMAIL_TEMPLATE_LIBRARY_SEARCH_FIELD = By.id("search-field");
    // Locate Templates Selectors
    private final By APPLICATION_APPROVAL_TEMPLATE = By.xpath("//span[text()='Application Approval']");
    private final By DOLLEY_TOUR_TIME_INITIAL_INQUIRY_TEMPLATE = By.xpath("//span[text()='Dolley Tour Time Initial Inquiry']");

    // Edit, Preview, Move, and Trash Selectors
    private final By EDIT_BUTTON = By.cssSelector("li[class='action-btn edit-btn js-edit-content']");
    private final By MOVE_BUTTON = By.cssSelector("li[class='action-btn move-btn js-move-content tabindex-action']");
    private final By DELETE_BUTTON = By.cssSelector("li[class='action-btn delete-btn js-delete-selection action add-tip tip-left binded']");

    private final By CONFIRM_DELETE_SELECTED_TEMPLATE_BUTTON = By.cssSelector("a[class='button small actions-btn']");

    // Add New Folder Workflow Selectors
    private final By NEW_FOLDER_BUTTON = By.cssSelector("a[class='new-folder-btn js-create-new-folder']");
    private final By FOLDER_NAME_TEXT_BOX = By.id("template-library-folder-name");
    private final By ADD_FOLDER_SUBMIT_BUTTON = By.cssSelector("input[class='form-submit js-submit-folder from-move-screen']");

    private final By CLICK_FOLDER_TO_MOVE_TEMPLATE = By.cssSelector("li[class='folder-item js-select-folder']");
    private final By MOVE_SELECTED_BUTTON = By.cssSelector("a[class='move-btn js-move-selected-files action add-tip tip-left binded']");
    private final By CONFIRM_MOVE_SELECTED_ENTRY = By.cssSelector("a[class='button small actions-btn']");


    // New Template Selector
    private final By NEW_EMAIL_TEMPLATE_BUTTON = By.cssSelector("a[class='action-btn upload js-new-template tabindex-action']");

    //Find Searched Template Selector
    private final String RANDOM_NAME = randomGenerator.randomName();
    private final String FORMAT_ONE = String.format("//*[contains(text(), '%s')]",RANDOM_NAME);
    private final By LOCATE_TESTING_TEMPLATE = By.xpath(FORMAT_ONE);
    private final By SEARCHED_RESULT_FIRST_SELECT_BOX = By.id("search-check-1");

    // New/Edit Template Selectors
    private final By TEMPLATE_NAME_FIELD = By.id("email_template_name");
    private final By TEMPLATE_DEFAULT_MESSAGE_SUBJECT = By.id("email_template_subject");

    //Select Properties Dropdown and Selection Selectors
    private final By SELECT_PROPERTIES_DROPDOWN = By.cssSelector("div[class='head selector tabindex-action']");
    private final By SELECTED_PROPERTIES_ADD_BUTTON = By.id("addbutton");
    private final By PROPERTY_SEARCH_ADD_PROPERTY_FIELD = By.id("test");
    private final By CLICK_ADD_SEARCHED_PROPERTY = By.cssSelector("span[class='property-name margin0']");
    private final By CLICK_ADD_SEARCHED_PROPERTY_CAVALIER_COURT = By.xpath("//span[text()='Cavalier Court']");

    //Choose a Layout Selectors
    private final By BASIC_TEMPLATE_LAYOUT = By.id("email_template_2");

    //Recipient Type Dropdown selectors
    private final By RECIPIENT_TYPE_DROPDOWN = By.id("scheduled_email_type_id");

    private final By RECIPIENT_TYPE_RESIDENTS = By.xpath("//option[text()='Residents']");

    //Edit Body Content Selectors
    private final By MAIN_BODY_CONTENT_BOX = By.id("MAIN_BODY_CONTENT_TEMPLATE_LIBRARY");

    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");


    //Save / Discard Template Selectors
    private final By SAVE_TEMPLATE_BUTTON = By.id("save_email_template_button");

    //Clear Filters Selector
    private final By CLEAR_FILTERS_BUTTON = By.id("email_template_library_clear_filters");

    // "Click Manage Email Templates" button Method
    public boolean clickManageEmailTemplatesButton() {return clickElement(MANAGE_EMAIL_TEMPLATES_BUTTON);}

    //Template Search Field
    public boolean clickAndSendKeysToTheEmailTemplateSearchField() {waitForPotentialOverlay(); return sendKeysToElement(EMAIL_TEMPLATE_LIBRARY_SEARCH_FIELD, RANDOM_NAME);}

    // Locate Templates Methods
    public boolean clickApplicationApprovalTemplate() {waitForPotentialOverlay(); return clickElement(APPLICATION_APPROVAL_TEMPLATE);}
    public boolean clickDolleyTourTimeInitialInquiryTemplate() {waitForPotentialOverlay(); return clickElement(DOLLEY_TOUR_TIME_INITIAL_INQUIRY_TEMPLATE);}

    // Edit, Preview, Move, and Trash Methods
    public boolean clickEditButton() {return clickElement(EDIT_BUTTON);}
    public boolean clickMoveButton() {return clickElement(MOVE_BUTTON);}
    public boolean clickDeleteButton() {return clickElement(DELETE_BUTTON);}
    public boolean clickConfirmDeleteButton() {return clickElement(CONFIRM_DELETE_SELECTED_TEMPLATE_BUTTON);}


    public boolean clickFolderToMoveTemplateTo() {waitForPotentialOverlay(); return clickElement(CLICK_FOLDER_TO_MOVE_TEMPLATE);}
    public boolean clickMoveSelectedButton() {waitForPotentialOverlay(); return clickElement(MOVE_SELECTED_BUTTON);}

    public boolean confirmMoveSelectedButton() {waitForPotentialOverlay(); return clickElement(CONFIRM_MOVE_SELECTED_ENTRY);}



    // Add New Folder Workflow Methods
    public boolean clickNewFolderButton() {waitForPotentialOverlay(); return clickElement(NEW_FOLDER_BUTTON);}
    public boolean clickAndSendKeysToFolderNameTextBox() {return sendKeysToElement(FOLDER_NAME_TEXT_BOX, RANDOM_NAME);}
    public boolean clickSubmitOnAddNewFolderWorkflow() {return clickElement(ADD_FOLDER_SUBMIT_BUTTON);}

    // New Template Method
    public boolean clickNewTemplateButton() {return clickElement(NEW_EMAIL_TEMPLATE_BUTTON);}

    //Find Searched Template Method
    public boolean locateSearchedTemplateTesting() {waitForPotentialOverlay(); return confirmElementIsVisible(LOCATE_TESTING_TEMPLATE);}
    public boolean clickFirstSearchedTemplateSelectBox() {waitForPotentialOverlay(); return clickElement(SEARCHED_RESULT_FIRST_SELECT_BOX);}

    // New/Edit Template Methods
    public boolean clickAndSendKeysToTheTemplateName() {return sendKeysToElement(TEMPLATE_NAME_FIELD, RANDOM_NAME);}
    public boolean clickAndSendKeysToTheTemplateSubjectLine() {return sendKeysToElement(TEMPLATE_DEFAULT_MESSAGE_SUBJECT, "Test Template Subject Line");}

    public boolean clickAndSendKeysToTheSelectedPropertiesSearchCavalierCourt() {return sendKeysToElement(PROPERTY_SEARCH_ADD_PROPERTY_FIELD, "Cavalier Court");}
    public boolean clickAddSearchedProperty() {return clickElement(CLICK_ADD_SEARCHED_PROPERTY_CAVALIER_COURT);}



    //Select Properties Dropdown and Selection Methods
    public boolean clickSelectedPropertiesDropdown() {return clickElement(SELECT_PROPERTIES_DROPDOWN);}
    public boolean clickSelectedPropertiesAddButton() {return clickElement(SELECTED_PROPERTIES_ADD_BUTTON);}


    //Choose a Layout Methods
    public boolean clickBasicTemplateSelection() {return clickElement(BASIC_TEMPLATE_LAYOUT);}


    //Recipient Type Dropdown Methods
    public boolean clickRecipientTypeDropdown() {return clickElement(RECIPIENT_TYPE_DROPDOWN);}
    public boolean clickRecipientTypeDropdownResidents() {return clickElement(RECIPIENT_TYPE_RESIDENTS);}

    //Edit Body Content Methods
    public boolean clickAndSendKeysToMainBodyContentBasic() {waitForPotentialOverlay(); return sendKeysToElement(MAIN_BODY_CONTENT_BOX,"Testing Main Body");}

    //Overlay Method
    private void waitForPotentialOverlay() {waitForOverlay(LOADING_OVERLAY);}
    //Save / Discard Template Selectors
    public boolean clickSaveTemplateButton() {waitForPotentialOverlay(); return clickElement(SAVE_TEMPLATE_BUTTON);}
    //Clear Filters Method
    public boolean clickClearFiltersButton() {waitForPotentialOverlay(); return clickElement(CLEAR_FILTERS_BUTTON);}

}
