package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadActivityLog;
import utils.RandomGenerator;

import static junit.framework.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class ShouldVerifyAddLeadAndLeadActivitiesIT extends BaseBrowserTest {

    public ShouldVerifyAddLeadAndLeadActivitiesIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifyAddingLeadAndAddingLeadActivities_whenInTheLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details

        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));

        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Note"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Add Note\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectAddNoteActivityEvent());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddOnSiteVisitActivity_whenInLeadActivityLog() {
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Onsite Visit"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Onsite Visit\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectOnsiteVisitActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Onsite Visit in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Completed\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultCompleted());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddIncomingCallActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Incoming Call"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Call\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingCallActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddIncomingEmailActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Incoming Email"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Email\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingEmailActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Response Sent\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultResponseSent());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddOutgoingCallActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Outgoing Call"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Outgoing Call\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectOutgoingCallActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddIncomingTextActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Incoming Text"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Incoming Text\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectIncomingTextActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Response Sent\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultResponseSent());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddOutgoingTextActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Outgoing Text"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Outgoing Text\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectOutgoingTextActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Unqualified\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultUnqualified());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }

    @Test
    public void shouldAddLeadAndAddSelfGuidedTourActivity_whenInLeadActivityLog() {
        //2256647 - To verify Add Activity on lead's profile
        //Navigating to Leads->All Leads
        EntrataNavBar useNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the \"Leads\" tab!", useNavBar.clickLeadsTab());
        //Using the "Add Lead" Button
        AllLeadsPage leadsTab = new AllLeadsPage(driver);
        assertTrue("Unable to select the \"Add Lead\" button in the \"Leads\" tab!", leadsTab.clickAddLeadLeftHandSideMenu());
        //Using the Property Search and selecting the property
        AddLeadPage useAddLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to select the \"Property Search\" button in the \"Add Leads\" workflow!", useAddLeadPage.selectPropertySearch());
        assertTrue("Unable to click and search for the \"Cavalier Court\" Property!", useAddLeadPage.searchingCavalierCourtPropertySendKeys());
        assertTrue("Unable to select the searched property \"Cavalier Court\" in the Property Search!", useAddLeadPage.searchPropertyClickProperty());
        //Adding Basic Lead Details
        assertTrue("Unable to send keys to the \"Legal First Name\" field in the Add Lead Workflow!", useAddLeadPage.sendKeysToFirstNameFieldLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Last Name\" field in the Add Lead Workflow", useAddLeadPage.lastNameTextFieldSendKeysLeadManager(randomName()));
        assertTrue("Unable to click and send keys to the \"Email\" field in the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToTheEmailTextBox("automatedtest@test.org"));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to click and send keys to the \"Phone Number\" field in the Add Lead Workflow", useAddLeadPage.addPhoneNumberSendKeys(phoneNumber));
        //Selecting Floorplan and Originating Lead Source of "Unknown"
        assertTrue("Unable to click the \"Floor Plan\" dropdown selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlanDropdown());
        assertTrue("Unable to select the \"2BR/2BA\" FloorPlan selection in the Add Lead Workflow", useAddLeadPage.selectFloorPlan2Bed2Bath());
        assertTrue("Unable to select the \"Originating Lead Source\" section in the Add Lead Workflow", useAddLeadPage.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select the \"Unknown\" \"Originating Lead Source\" option in the Add Lead Workflow", useAddLeadPage.dropdownResultsOriginatingLeadSource());
        //Move-in Date Details add
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Month\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateMonth());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Day\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateDay());
        assertTrue("Unable to select and send keys to the \"Move-In Date\" \"Year\" field in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSendKeysToLeadMoveInDateYear());
        //Adding the Method of Contact, Result of Contact, and Adding info to the 'Notes' section of the Add Lead Workflow
        assertTrue("Unable to select the \"Method of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.selectEmailContactMethodByValue());
        assertTrue("Unable to select the \"Result of Contact\" Dropdown in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.clickAndSelectResultOfContactDropdownNoResponseSent());
        assertTrue("Unable to select and send keys to the \"Notes:\" textbox for the \"Result of Contact\" in the \"Lead Details\" section of the Add Lead Workflow", useAddLeadPage.contactMethodResultNotes());
        //Save Lead button
        assertTrue("Unable to select the \"Save Lead\" button in the Add Lead Workflow", useAddLeadPage.clickSaveLeadButton());
        LeadActivityLog useLeadActivityLog = new LeadActivityLog(driver);
        //Navigating to the Lead's Activity Log
        assertTrue("Unable to navigate to the Lead's \"Activity Log\" section!", useLeadActivityLog.clickActivityLogPage());
        //Locate the "Lead Submitted" event that should have been created
        assertTrue("Unable to locate the Lead's \"Lead Submitted\" event in the lead \"Activity Log\" section!", useLeadActivityLog.locateLeadSubmittedActivity());
        //Add Activity for "Self Guided Tour"
        assertTrue("Unable to use the \"Add Activity\" Button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityButton());
        assertTrue("Unable to use the \"Event Type\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.useAddActivityEventTypeDropdown());
        assertTrue("Unable to use the \"Self Guided Tour\" dropdown button in the Lead->\"Activity Log\" section!", useLeadActivityLog.selectSelfGuidedTourActivityEvent());
        assertTrue("Unable to select and send keys to the \"Notes\" selection in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.addActivityNotesTextField());
        assertTrue("Unable to use the \"Result\" dropdown when adding the event for \"Outgoing Call\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultOfAddActivityDropdown());
        assertTrue("Unable to use the \"Completed\" option in the \"Result\" dropdown when adding the event for \"Onsite Visit\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.clickResultCompleted());
        assertTrue("Unable to use the \"Property Tour\" Yes/No Toggle when adding the event for \"Self-Guided Tour\" in the Lead\"->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectPropertyTourYesNoToggle());
        assertTrue("Unable to select the \"Submit\" button for creating an Activity in the Lead->\"Activity Log\"->\"Add Activity\" section!", useLeadActivityLog.selectSubmitCreateActivityButton());
    }
}
