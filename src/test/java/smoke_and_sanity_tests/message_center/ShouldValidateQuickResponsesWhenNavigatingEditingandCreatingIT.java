package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.CompanyQuickResponses;

import static junit.framework.Assert.assertTrue;

public class ShouldValidateQuickResponsesWhenNavigatingEditingandCreatingIT extends BaseBrowserTest {


    public ShouldValidateQuickResponsesWhenNavigatingEditingandCreatingIT() { super("dittmarcompany"); }

    @Test
    public void shouldValidateTheQuickResponses_whenNavigatingCreatingEditingAndDeleting() {
        // 2224051 - To Create, Edit and Delete quick response
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        //Navigate to Setup>Company
        assertTrue("Couldn't navigate to the \"Setup\" -> \"Company\" section of the Navigation Bar!", useEntrataNavBar.clickSetupButton());
        CompanyFirstLevelNavigation useCompanyFirstLevelNav = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the \"Company\"-> \"Communication\" tab", useCompanyFirstLevelNav.clickCommunicationTab());
        CompanyQuickResponses useCompanyQuickResponses = new CompanyQuickResponses(driver);
        //Navigate to Company>Quick Responses section
        assertTrue("Unable to navigate to the \"Company\"-> \"Communication\" -> \"Quick Responses\" tab", useCompanyQuickResponses.clickQuickResponsesSubTab());
        //Create Quick Response and steps for required fields
        assertTrue("Unable to use the \"Create Quick Response\" button!", useCompanyQuickResponses.clickCreateQuickResponse());
        assertTrue("Unable to click and send keys to the \"Subject\" field in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickAndSendKeysToQuickResponseSubjectField());
        assertTrue("Unable to click and send keys to the \"Quick Response:\" text body field in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickAndSendKeysToQuickResponseTextBody());
        assertTrue("Unable to click and send keys to the \"Name\" field in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickAndSendKeysToCreateQuickResponseNameField());
        assertTrue("Unable to click and send keys to the Property Name search field in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickAndSendKeysToPropertySearchTextBoxCreateQuickResponse());
        //Clicking the Property selection and saving the new Quick Response
        assertTrue("Unable to click the \"Cavalier Court\" property option in the \"Select Properties:\" section in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickSearchedPropertyCreateQuickResponse());
        assertTrue("Unable to click the \"Save\" button in the \"Create Quick Response\" editor!", useCompanyQuickResponses.clickCreateQuickResponseSaveButton());
        //Previewing the Desktop/Mobile views of the Template
        assertTrue("Unable to click the \"Desktop\" preview button for the \"Houston\" template!", useCompanyQuickResponses.clickPreviewHoustonQRDesktopView());
        assertTrue("Unable to click the \"Close\" Button in the Desktop preview button for the \"Houston\" template!", useCompanyQuickResponses.clickCloseDesktopPreviewButton());
        assertTrue("Unable to click the \"Mobile\" preview button for the \"Houston\" template!", useCompanyQuickResponses.clickPreviewHoustonQRMobileView());
        assertTrue("Unable to click the \"Close\" Button in the Mobile preview button for the \"Houston\" template!", useCompanyQuickResponses.clickCloseMobilePreviewButton());
        //Editing an existing quick response template
        assertTrue("Unable to click the \"Edit\" button for the \"Houston\" Quick Response Template!", useCompanyQuickResponses.editQuickResponse());
        assertTrue("Unable to click and send keys to the body content of the \"Houston\" Quick Response Template!", useCompanyQuickResponses.sendKeysToQuickResponseHoustonBodyContent());
        assertTrue("Unable to click the \"Save\" button when adding data to the \"Houston\" Quick Response Template!", useCompanyQuickResponses.clickCreateQuickResponseSaveButton());
        //Items Per Page to display all Templates
        assertTrue("Unable to click the \"Items per page:\" dropdown for the \"Quick Responses\" page!", useCompanyQuickResponses.clickItemsPerPageDropdown());
        assertTrue("Unable to click the \"Items per page:\" option for \"20\" for the \"Quick Responses\" page!", useCompanyQuickResponses.clickItemsPerPage20());
        //Deleting and Confirming Delete for a template
        assertTrue("Unable to click the \"Delete\" red X button for the \"RI Uninsured Notification\" Quick Response Template!", useCompanyQuickResponses.clickDeleteQuickResponseXButtonAnyTemplate());
        assertTrue("Unable to click the confirm \"Delete\" button for the \"RI Uninsured Notification\" Quick Response Template!", useCompanyQuickResponses.clickConfirmDeleteQuickResponseXButton());
    }
}
