package regression_tests.lead_manager_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.documents_tab.RentalApplicationsTab;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static utils.RandomGenerator.randomName;
import static utils.RandomGenerator.randomPhoneNumber;

public class ShouldVerifyLeadShiftingToApplicationStartedStatusIT extends BaseBrowserTest {

    public ShouldVerifyLeadShiftingToApplicationStartedStatusIT() { super("dittmarcompany"); }

    @Test
    public void ShouldVerifyLeadShiftingToAppStartedStatus_whenCreatingTheLeadAndUsingStartApplicationButtonFromProfile() {
        //2256555 - To verify lead shifting in Application : Started status
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        //Navigate to Setup>Company>Documents
        assertTrue("Unable to navigate to Setup->\"Company\" settings page!", useNavBar.clickSetupButton());
        CompanyFirstLevelNavigation docTab = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not find Company >> Documents sub tab", docTab.clickDocumentsTab());
        RentalApplicationsTab policyDocSetup = new RentalApplicationsTab(driver);
        //Set up a Policy Document to be used in the Application
        assertTrue("Could not click on add button for new application", policyDocSetup.addButtonForApplication());
        assertTrue("Could not associate the Property \"Cavalier Court\"", policyDocSetup.associatePropertyCavalierCourt());
        assertTrue("Could not add new Application Title Name", policyDocSetup.newApplicationTitleConventional());
        assertTrue("Could not Find Dropdown for application Type", policyDocSetup.applicationTypeDropdown());
        assertTrue("Could not find conventional application Type to click on", policyDocSetup.applicationTypeDropDownSelectConventional());
        assertTrue("Could not find save Button for add new Application", policyDocSetup.saveButtonForAddNewApp());
        assertTrue("Could not click on policy Docs tab", policyDocSetup.policyDocsTab());
        assertTrue("Could not click on add button to add new policy", policyDocSetup.addButtonPolicyDocuments());
        assertTrue("Could not add Policy Doc Name", policyDocSetup.policyDocName());
        assertTrue("Could not find policy doc final save", policyDocSetup.policyDocFinalSave());
        assertTrue("Could not find upload doc button", policyDocSetup.uploadDocButton());
        assertTrue("Could not add file", policyDocSetup.fileAdd());
        assertTrue("Could not save added file to policy", policyDocSetup.saveButtonForAddPolicyDoc());
        assertTrue("Could not exit Policy Doc Window",policyDocSetup.exitPolicyDocWindow());
        //Navigate to Leads>All Leads and start adding a new Applicant
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        //Add Lead workflow: Add property
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Add Lead workflow: First Name, Last Name, Email, and Phone Number

        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(randomPhoneNumber()));

        //Add Lead workflow: Selecting Floorplan and the Originating Lead Source ("Unknown")
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Selecting the Application(s) that we've created for use (Default apps will NOT work in Trunk, need the added app from here or another test)
        assertTrue("Unable to select the \"Applications\" dropdown in the Add Lead Workflow", useAddLeadPage.selectingApplicationDropdown());
        assertTrue("Unable to select the \"ConventionalTestApplication\" Application selection in the Add Lead Workflow", useAddLeadPage.selectTestApplication());
        //Adding in the Move in Date details, Method of Contact, and Result of Contact + a Note
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Saving the Lead
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadSummary useLeadSummary = new LeadSummary(driver);
        //Selecting "What's Next" Dropdown and Starting the Application
        assertTrue("Unable to select the \"What's Next:\" dropdown arrow button after adding the Lead in the Lead Summary!", useLeadSummary.clickWhatsNextDropdownArrow());
        assertTrue("Unable to select the \"Start Application\" button from the \"What's Next:\" dropdown arrow in the Lead Summary!", useLeadSummary.clickStartApplicationButton());
        //Verifying that the Application was Started successfully
        assertEquals("Application status did not change to match 'Application: Started'.", "Application: Started", useLeadSummary.applicationStatusGetText());
    }

}
