package smoke_and_sanity_tests.online_applications_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.documents_tab.RentalApplicationsTab;
import utils.RandomGenerator;

import static junit.framework.Assert.assertTrue;

public class VerifyApplicationCreationFromEntrataMilitaryIT extends BaseBrowserTest {

    public VerifyApplicationCreationFromEntrataMilitaryIT() {
        super("demoold");
    }

    @Test
    public void shouldCreateNewMilitaryApplicationFromEntrata_whenAddingLeadAndCreatingNewApplicant() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Set up Tab was not able to be clicked", nav.clickSetupButton());
        CompanyFirstLevelNavigation docTab = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not find Company >> Documents sub tab", docTab.clickDocumentsTab());
        RentalApplicationsTab policyDocSetup = new RentalApplicationsTab(driver);
        assertTrue("Could not click on add button for new application", policyDocSetup.addButtonForApplication());
        assertTrue("Could not associate Military Property", policyDocSetup.associatePropertyMilitaryProperty());
        assertTrue("Could not add new Application Title Name", policyDocSetup.newApplicationTitleMilitary());
        assertTrue("Could not Find Dropdown for application Type", policyDocSetup.applicationTypeDropdown());
        assertTrue("Could not find conventional application Type to click on", policyDocSetup.applicationTypeDropDownSelectMilitary());
        assertTrue("Could not find save Button for add new Application", policyDocSetup.saveButtonForAddNewApp());
        assertTrue("Could not click on policy Docs tab", policyDocSetup.policyDocsTab());
        assertTrue("Could not click on add button to add new policy", policyDocSetup.addButtonPolicyDocuments());
        assertTrue("Could not add Policy Doc Name", policyDocSetup.policyDocName());
        assertTrue("Could not find policy doc final save", policyDocSetup.policyDocFinalSave());
        assertTrue("Could not find upload doc button", policyDocSetup.uploadDocButton());
        assertTrue("Could not add file", policyDocSetup.fileAdd());
        assertTrue("Could not save added file to policy", policyDocSetup.saveButtonForAddPolicyDoc());
        assertTrue("Could not exit Policy Doc Window",policyDocSetup.exitPolicyDocWindow());
        assertTrue("Could not click on Leads tab", nav.clickLeadsTab());
        AllLeadsPage allLeads = new AllLeadsPage(driver);
        assertTrue("could not click on add Lead button", allLeads.clickAddLeadLeftHandSideMenu());
        AddLeadPage addLead = new AddLeadPage(driver);
        //Required Fields
        assertTrue("could not click property dropdown", addLead.propertyDropdownArrowClick());
        assertTrue("could not find property from dropdown", addLead.selectPropertyFromDropdownMilitary());
        assertTrue("first name field not clickable", addLead.firstNameTextFieldClick());
        String firstName = RandomGenerator.randomName();
        assertTrue("could not add text to first name field", addLead.firstNameTextFieldSendKeys(firstName));
        assertTrue("Last name field not clickable", addLead.lastNameTextFieldClick());
        String lastName = RandomGenerator.randomName();
        assertTrue("Could not add text to last name field", addLead.lastNameTextFieldSendKeys(lastName));
        assertTrue("Phone number field not clickable", addLead.addPhoneNumberClick());
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("could not send keys on phone number field", addLead.addPhoneNumberSendKeys(phoneNumber));
        assertTrue("Could not click 'I don't have maternal last name' checkbox", addLead.doesNotHaveMaternalLastNameCheckBox());
        assertTrue("Could not click lead details tab",addLead.clickLeadDetailsTab());
        assertTrue("could not find dropdown for application selection", addLead.selectingApplicationDropdown());
        assertTrue("could not select specific new application from dropdown", addLead.selectTestApplicationMilitary());
        assertTrue("could not click on originating lead source dropdown text field",addLead.clickOriginatingLeadSourceDropdown());
        assertTrue("could not select lead source,'unknown'.", addLead.dropdownResultsOriginatingLeadSource());
        assertTrue("could not find contact method dropdown", addLead.selectEmailContactMethodByValue());
        assertTrue("could not find contact method result dropdown", addLead.contactMethodResultDropdown());
        assertTrue("could not select contact method result", addLead.contactMethodResultSelect());
        assertTrue("could not enter contact method result notes", addLead.contactMethodResultNotes());
        //Military Career Section
        assertTrue("Could not click Military Career Dropdown",addLead.clickMilitaryCareerTab());
        assertTrue("Could not see Military Status Dropdown", addLead.militaryStatusDropdownDefaultVisible());
        assertTrue("Could not click Military Branch Dropdown", addLead.militaryBranchDropdownClick());
        assertTrue("Could not select military branch 'Army'", addLead.militaryBranchDropdownSelectArmy());
        assertTrue("Could not click Military rank Dropdown", addLead.militaryRankDropdown());
        assertTrue("Could not select private from Military rank Dropdown", addLead.militaryRankSelectPrivate());
        assertTrue("Could not see Military pay grade dropdown", addLead.militaryPayGradeDropdownVisible());
        assertTrue("Could not click on arrival date date picker", addLead.arrivalDateDatePickerClick());
        assertTrue("Could not click arrival date of today", addLead.arrivalDateClickFirstDayOfMonth());
        assertTrue("Could not enter in random duty email address", addLead.dutyEmailAddressSendKeys());
        //Submit and verify new Military Applicant
        assertTrue("Could not click start application button", addLead.clickStartApplicationButton());
        LeadSummary summary = new LeadSummary(driver);
        assertTrue("Could not see applicant in application started status", summary.applicationStartedStatusTextVisible());
    }
}
