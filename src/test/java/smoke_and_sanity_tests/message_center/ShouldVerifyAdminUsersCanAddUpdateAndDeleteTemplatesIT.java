package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.ManageEmailTemplates;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifyAdminUsersCanAddUpdateAndDeleteTemplatesIT extends BaseBrowserTest {


    public ShouldVerifyAdminUsersCanAddUpdateAndDeleteTemplatesIT() { super("dittmarcompany"); }

@Test
    public void shouldVerifyAdminUsersCanAddUpdateAndDelete_whenWorkingWithTemplates() {
    // 2254537 - To validate Admin user can allowed to add, update & delete any template.


    //Navigate to Tools->Message Center
    EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
    assertTrue("Unable to navigate to the Tools tab in Dashboard -> Tools!", useEntrataNavBar.clickToolsTab());
    assertTrue("Couldn't navigate to the \"Message Center\" area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
    //Navigating to the Email Template Library
    ManageEmailTemplates useManageEmailTemplates = new ManageEmailTemplates(driver);
    assertTrue("Unable to navigate to the Tools->Message Center->\"Manage Email Templates\" section!", useManageEmailTemplates.clickManageEmailTemplatesButton());
    //Creating a new Template, and Adding the Recipient type (Residents)
    assertTrue("Unable to navigate to the Tools->Message Center->Manage Email Templates->\"New Template\" section!", useManageEmailTemplates.clickNewTemplateButton());
    assertTrue("Unable to click the Manage Email Templates->\"Recipient Type\" dropdown section!", useManageEmailTemplates.clickRecipientTypeDropdown());
    assertTrue("Unable to click the Manage Email Templates->\"Recipient Type\" \"Residents\" dropdown selection!", useManageEmailTemplates.clickRecipientTypeDropdownResidents());
    //Adding the "Selected Properties" to the template
    assertTrue("Unable to click the \"Selected Properties\" dropdown!", useManageEmailTemplates.clickSelectedPropertiesDropdown());
    assertTrue("Unable to click the \"Selected Properties\" \"Add\" button!", useManageEmailTemplates.clickSelectedPropertiesAddButton());
    assertTrue("Unable to click and send keys to the \"Selected Properties\" search bar!", useManageEmailTemplates.clickAndSendKeysToTheSelectedPropertiesSearchCavalierCourt());
    assertTrue("Unable to click the Add for the Searched Property in the \"Selected Properties\" search bar!", useManageEmailTemplates.clickAddSearchedProperty());
    //Adding the Template required details (Name, Subject, Layout, Body Content) and Saving the Template
    assertTrue("Unable to click and send keys to the \"Template Name:\" field!", useManageEmailTemplates.clickAndSendKeysToTheTemplateName());
    assertTrue("Unable to click and send keys to the subject line for the New Template \"Default Message Subject\" field!", useManageEmailTemplates.clickAndSendKeysToTheTemplateSubjectLine());
    assertTrue("Unable to select the New Template Layout: \"Basic\" in the Create New Template workflow!", useManageEmailTemplates.clickBasicTemplateSelection());
    assertTrue("Unable to send keys to the \"Main Body Content\" field in the Create New Template workflow!", useManageEmailTemplates.clickAndSendKeysToMainBodyContentBasic());
    assertTrue("Unable to click the \"Save Template\" button in the Create New Template workflow!", useManageEmailTemplates.clickSaveTemplateButton());
    //Searching for the recently created template
    assertTrue("Unable to click and send keys to the \"Search\" field in the Email Template Library!", useManageEmailTemplates.clickAndSendKeysToTheEmailTemplateSearchField());
    assertTrue("Unable to locate the \"Test Template Name\" Template in the Email Template Library search!", useManageEmailTemplates.locateSearchedTemplateTesting());
    assertTrue("Unable to use the \"Clear Filters\" button in the Email Template Library!", useManageEmailTemplates.clickClearFiltersButton());
    //Selecting an existing template and editing it
    assertTrue("Unable to select the \"Dolley Tour Time Initial Inquiry\" template in the \"Manage Email Templates\" section!", useManageEmailTemplates.clickDolleyTourTimeInitialInquiryTemplate());
    assertTrue("Unable to click the \"Edit\" button in the \"Manage Email Templates\" section!", useManageEmailTemplates.clickEditButton());
    //Sending keys to the Email Body Content and saving the changes
    assertTrue("Unable to click and send keys to the \"Email Body Content\" section in the \"Application Approval\" Template!", useManageEmailTemplates.clickAndSendKeysToMainBodyContentBasic());
    assertTrue("Unable to click the \"Save Template\" button in the Create New Template workflow!", useManageEmailTemplates.clickSaveTemplateButton());
    //Searching and selecting the first result to Move the template
    assertTrue("Unable to click and send keys to the \"Search\" field in the Email Template Library!", useManageEmailTemplates.clickAndSendKeysToTheEmailTemplateSearchField());
    assertTrue("Unable to click the \"Select\" box on the first searched result in the Email Template Library!", useManageEmailTemplates.clickFirstSearchedTemplateSelectBox());
    assertTrue("Unable to click the \"Move\" button after selecting the searched result in the Email Template Library!", useManageEmailTemplates.clickMoveButton());
    //Create a new folder to move the template to
    assertTrue("Unable to click the \"New Folder\" button after selecting the Template>Move workflow in the Template Library!", useManageEmailTemplates.clickNewFolderButton());
    assertTrue("Unable to click and send keys to the \"Folder Name\" section in the New Folder workflow!", useManageEmailTemplates.clickAndSendKeysToFolderNameTextBox());
    assertTrue("Unable to click the \"Submit\" button after setting up a new folder in the Move Template workflow!", useManageEmailTemplates.clickSubmitOnAddNewFolderWorkflow());
    //Selecting the recently created folder to move the template into, and performing the move action
    assertTrue("Unable to select the Folder to move the template to in the Move Template workflow!", useManageEmailTemplates.clickFolderToMoveTemplateTo());
    assertTrue("Unable to select the \"Move Selected\" button in the Move Template workflow!", useManageEmailTemplates.clickMoveSelectedButton());
    assertTrue("Unable to select the \"Move\" confirm button for the \"Move Selected\" workflow of the Move Template workflow!", useManageEmailTemplates.confirmMoveSelectedButton());
    //Searching the template moved to the folder and deleting it
    assertTrue("Unable to click and send keys to the \"Search\" field in the Email Template Library!", useManageEmailTemplates.clickAndSendKeysToTheEmailTemplateSearchField());
    assertTrue("Unable to click the \"Select\" box on the first searched result in the Email Template Library!", useManageEmailTemplates.clickFirstSearchedTemplateSelectBox());
    assertTrue("Unable to click the \"Delete\" button after selecting the searched Template result in the Email Template Library!", useManageEmailTemplates.clickDeleteButton());
    assertTrue("Unable to click the Confirm \"Delete\" button after selecting the searched Template result in the Email Template Library!", useManageEmailTemplates.clickConfirmDeleteButton());
}
}
