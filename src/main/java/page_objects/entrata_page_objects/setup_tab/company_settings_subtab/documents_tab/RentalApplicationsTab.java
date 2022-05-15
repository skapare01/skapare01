package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.documents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.io.File;

public class RentalApplicationsTab extends BasePage {
     private final By OVERLAY_LOADING_WHEEL_BEFORE_ADD_BUTTON= By.className("loading-overlay");
     private final By NEW_APPLICATION_ADD_BUTTON = By.cssSelector("img[src='/images/documents/icons/add.gif']");
     private final By CHECKMARK_PROPERTY_VILLAGE_BEND_EAST = By.id("property_id_540119");
     private final By CHECKMARK_PROPERTY_CAVALIER_COURT = By.id("property_id_531730");
     private final By CHECKMARK_PROPERTY_MILITARY_PROPERTY = By.id("property_id_495654");
     private final By NEW_APPLICATION_TITLE = By.cssSelector("input[name='company_application[title]']");
     private final By APPLICATION_TYPE_DROPDOWN = By.name("company_application[occupancy_type_id]");
     private final By APPLICATION_TYPE_DROPDOWN_SELECT_CONVENTIONAL = By.xpath("//*[text()='Conventional']");
     private final By APPLICATION_TYPE_DROPDOWN_SELECT_MILITARY = By.xpath("//*[text()='Military']");
     private final By NEW_APPLICATION_SAVE_BUTTON = By.cssSelector("input[type='submit']");
     private final By POLICY_DOCUMENTS_TAB_BUTTON = By.cssSelector("input[value='Policy Documents']");
     private final By ADD_NEW_POLICY_DOCUMENT = By.cssSelector("input[value='Add']");
     private final By POLICY_DOC_NAME_TEXT_FIELD = By.id("document_name");
     private final By POLICY_DOC_FINAL_SAVE = By.cssSelector("#add_edit_document_addenda > div.buttonContainer > input:nth-child(2)");
     private final By UPLOAD_DOC_BUTTON_FOR_NEW_APPLICATION = By.xpath("//a[text()='upload']");
     private final By FILE_ADD_CHOOSING_FILE = By.name("policy_document_file");
     private final By FILE_ADD_SAVE_BUTTON = By.id("btnSave");
     private final By EXIT_WINDOW_FOR_ADDING_POLICY_DOC = By.xpath("//div[text()='[x]']");

     //list of applications
    private final By SID_RENTAL_APP = By.cssSelector("td[onclick*= '12725']");

     public RentalApplicationsTab(WebDriver driver) {
            super(driver);
        }

     private void overlayBeforeAddButtonForApplication() {
        waitForOverlay(OVERLAY_LOADING_WHEEL_BEFORE_ADD_BUTTON);
     }
     public boolean addButtonForApplication() {
         overlayBeforeAddButtonForApplication();
         return clickElement(NEW_APPLICATION_ADD_BUTTON);
     }
     public boolean applicationTypeDropdown() {
         return clickElement(APPLICATION_TYPE_DROPDOWN);
     }
     public boolean saveButtonForAddNewApp() {
         return clickElement(NEW_APPLICATION_SAVE_BUTTON);
     }
     public boolean policyDocsTab() {
         return clickElement(POLICY_DOCUMENTS_TAB_BUTTON);
     }
     public boolean addButtonPolicyDocuments() {
         return clickElement(ADD_NEW_POLICY_DOCUMENT);
     }
     public boolean policyDocName() {
         return sendKeysToElement(POLICY_DOC_NAME_TEXT_FIELD, "PolicyDoc");
     }
     public boolean policyDocFinalSave() {
         return clickElement(POLICY_DOC_FINAL_SAVE);
     }
     public boolean uploadDocButton() {
         return clickElement(UPLOAD_DOC_BUTTON_FOR_NEW_APPLICATION, waitTimes.LONG_WAIT);
     }
     public boolean fileAdd() {
        File myFile = new File("src/main/java/resources/dummyPDF.pdf");
        String path = myFile.getAbsolutePath();
        return sendKeysToElement(FILE_ADD_CHOOSING_FILE, path, waitTimes.LONG_WAIT);
     }
     public boolean saveButtonForAddPolicyDoc() {
         return clickElement(FILE_ADD_SAVE_BUTTON);
     }
     public boolean exitPolicyDocWindow() {
         return clickElement(EXIT_WINDOW_FOR_ADDING_POLICY_DOC);
     }

     //Conventional Specific Application Methods
     public boolean newApplicationTitleConventional() {
         return sendKeysToElement(NEW_APPLICATION_TITLE, "ConventionalTestApplication");
     }
     public boolean applicationTypeDropDownSelectConventional() {
         return clickElement(APPLICATION_TYPE_DROPDOWN_SELECT_CONVENTIONAL);
     }
     public boolean associatePropertyVillageBendEast() {
         return clickElement(CHECKMARK_PROPERTY_VILLAGE_BEND_EAST);
     }
     public boolean associatePropertyCavalierCourt() {
        return clickElement(CHECKMARK_PROPERTY_CAVALIER_COURT);
    }

     //Military Specific Application Methods
     public boolean newApplicationTitleMilitary() {
         return sendKeysToElement(NEW_APPLICATION_TITLE, "MilitaryTestApplication");
     }
     public boolean applicationTypeDropDownSelectMilitary() {
         return clickElement(APPLICATION_TYPE_DROPDOWN_SELECT_MILITARY);
     }
     public boolean associatePropertyMilitaryProperty() {
         return clickElement(CHECKMARK_PROPERTY_MILITARY_PROPERTY);
     }

     // methods to select applications
    public boolean clickSidRentalApplicaiton(){return clickElement(SID_RENTAL_APP);}



 }
