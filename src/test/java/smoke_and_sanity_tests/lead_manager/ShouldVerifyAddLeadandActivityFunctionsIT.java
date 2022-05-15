package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadActivityLog;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import utils.RandomGenerator;

import static junit.framework.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class ShouldVerifyAddLeadandActivityFunctionsIT extends BaseBrowserTest {


    public ShouldVerifyAddLeadandActivityFunctionsIT() {
        super("dittmarcompany");
    }

    @Test
    public void ShouldVerifyAddLead_whenInLeadsAllLeadsAndVerifyLeadSections() {
//2256671 - To verify adding lead from Entrata : Leads tab
//2256728 - Verify Leads tab with Activity tab and Important Information in Lead Pop Up
//2256647 - To verify Add Activity on lead's profile

        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());

        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());

        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());

        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());


        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));

        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());

        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);

        LeadSummary useLeadSummary = new LeadSummary(driver);
        assertTrue("Unable to locate the Lead's \"Lead Summary\" tab!", useLeadSummary.locateLeadSummaryTab());
        assertTrue("Unable to locate the Lead's \"Documents\" tab!", useLeadSummary.locateDocumentsTab());

        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());

        assertTrue("Unable to click the Lead's \"Important Information\" Edit Button!", useLeadSummary.click_EditImportantInformationButton());
        assertTrue("Unable to click the Lead's \"Important Information\" Close Button!", useLeadSummary.click_CloseImportantInformationButton());

        assertTrue("Unable to click the Lead's \"Preferences\" Edit Button!", useLeadSummary.click_EditPreferencesButton());
        assertTrue("Unable to click the Lead's \"Preferences\" Close Button!", useLeadSummary.click_CancelPreferencesButton());

        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectAddNoteActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldVerifyAddAndCancelLeadFunctionsAndAddActivity_whenInLeadsAllLeads() {
// 2256673 - To verify cancelling the lead + 2256706 - Events added in Activity Log

        //Navigating to Leads>All Leads>Add Lead
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        //Section for Adding the lead and lead details + Property
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());

        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));

        //Adding the Floorplan and selecting the application
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"ConventionalTestApplication\" Application selection in the Add Lead Workflow", useAddLeadPage.selectTestApplication());
        //Move-in Date details as well as Method of Contact + Notes
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Locating, and selecting the Originating Lead Source + Saving the Lead
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        //Navigating to the Lead's Activity Log to test adding an Event
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Onsite Visit\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectOnsiteVisitActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Onsite Visit in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Completed\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultCompleted());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
        LeadSummary useLeadSummary = new LeadSummary(driver);
        //Using the Lead Summary to Cancel the Lead + fill out cancellation Details
        assertTrue("Unable to click the \"More Actions\" dropdown!", useLeadSummary.clickMoreActionsDropdown());
        assertTrue("Unable to click the \"Cancel Lead\" option in the \"More Actions\" dropdown!", useLeadSummary.clickCancelLeadButton());
        assertTrue("Unable to click the \"Reason for Cancelling:\" dropdown in the Cancel Lead workflow!", useLeadSummary.clickReasonForCancellingDropdown());
        assertTrue("Unable to click the \"Other\" option as the \"Reason for Cancelling:\" in the Cancel Lead workflow!", useLeadSummary.clickOtherCancellationReason());
        assertTrue("Unable to click the \"Cancel Lead\" confirm button in in the Cancel Lead workflow!", useLeadSummary.clickCancelLeadFinalizeButton());
    }
}