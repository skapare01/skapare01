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

public class VerifyApplicationCreationFromEntrataConventionalIT extends BaseBrowserTest {

    public VerifyApplicationCreationFromEntrataConventionalIT() {
        super("village");
    }

    @Test
    public void shouldCreateNewApplicationFromEntrata_whenAddingNewLeadAndCreatingNewApplicant() { //OnlineApps_TC_2265292
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Set up Tab was not able to be clicked", nav.clickSetupButton());
        CompanyFirstLevelNavigation docTab = new CompanyFirstLevelNavigation(driver);
        assertTrue("Could not find Company >> Documents sub tab", docTab.clickDocumentsTab());
        RentalApplicationsTab policyDocSetup = new RentalApplicationsTab(driver);
        assertTrue("Could not click on add button for new application", policyDocSetup.addButtonForApplication());
        assertTrue("Could not associate Property Village Bend East", policyDocSetup.associatePropertyVillageBendEast());
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
        assertTrue("Could not click on Leads tab", nav.clickLeadsTab());
        AllLeadsPage allLeads = new AllLeadsPage(driver);
        assertTrue("Could not see Lead Column", allLeads.leadNameColumn());
        assertTrue("Could not see status Column", allLeads.statusColumn());
        assertTrue("Could not see property Column", allLeads.propertyColumn());
        assertTrue("Could not see source Column", allLeads.sourceColumn());
        assertTrue("Could not see created Column", allLeads.createdColumn());
        assertTrue("Could not see last contact Column", allLeads.lastContactColumn());
        assertTrue("Could not see last attempt Column", allLeads.lastAttemptColumn());
        assertTrue("Could not see move in date Column", allLeads.moveInDateColumn());
        assertTrue("could not click on add Lead button", allLeads.clickAddLeadLeftHandSideMenu());
        AddLeadPage addLead = new AddLeadPage(driver);
        assertTrue("could not click property dropdown", addLead.propertyDropdownArrowClick());
        assertTrue("could not find property from dropdown", addLead.selectPropertyFromDropdown());
        assertTrue("first name field not clickable", addLead.firstNameTextFieldClick());
        String firstName = RandomGenerator.randomName();
        assertTrue("could not add text to first name field", addLead.firstNameTextFieldSendKeys(firstName));
        assertTrue("Last name field not clickable", addLead.lastNameTextFieldClick());
        String lastName = RandomGenerator.randomName();
        assertTrue("Could not add text to last name field", addLead.lastNameTextFieldSendKeys(lastName));
        assertTrue("Phone number field not clickable", addLead.addPhoneNumberClick());
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("could not send keys on phone number field", addLead.addPhoneNumberSendKeys(phoneNumber));
        assertTrue("could not find lead details tab", addLead.clickLeadDetailsTab());
        assertTrue("could not find dropdown for application selection", addLead.selectingApplicationDropdown());
        assertTrue("could not select specific conventional application from dropdown", addLead.selectTestApplication());
        assertTrue("could not click on originating lead source dropdown text field",addLead.clickOriginatingLeadSourceDropdown());
        assertTrue("could not select lead source,'unknown'.", addLead.dropdownResultsOriginatingLeadSource());
        assertTrue("could not find leasing agent dropdown", addLead.leasingAgentDropDown());
        assertTrue("could not select leasing agent", addLead.leasingAgentSelect());
        assertTrue("could not find contact method dropdown", addLead.selectEmailContactMethodByValue());
        assertTrue("could not find contact method result dropdown", addLead.contactMethodResultDropdown());
        assertTrue("could not select contact method result", addLead.contactMethodResultSelect());
        assertTrue("Save Application Button does not exist", addLead.clickStartApplicationButton());
        LeadSummary summary = new LeadSummary(driver);
        assertTrue("Could not see applicant in application started status", summary.applicationStartedStatusTextVisible());
    }
}
