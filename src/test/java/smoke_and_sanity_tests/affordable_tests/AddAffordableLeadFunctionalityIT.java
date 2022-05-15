package smoke_and_sanity_tests.affordable_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import utils.RandomGenerator;

public class AddAffordableLeadFunctionalityIT extends BaseBrowserTest {
    public AddAffordableLeadFunctionalityIT() {
        super("1automationrapid");
    }

    @Test //Test Case 2243647
    public void shouldDisplayLeadInCompletedStatus_whenAllRequiredFieldsAndEligibilityAreComplete() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click Leads tab on Dashboard", nav.clickLeadsTab());

        AllLeadsPage add = new AllLeadsPage(driver);
        assertTrue("Unable to click Add Lead on left hand side menu", add.clickAddLeadLeftHandSideMenu());

        AddLeadPage lead = new AddLeadPage(driver);
        assertTrue("Unable to find property drop-down", lead.confirmPropertyDropdownExists());
        assertTrue("Unable to find First Name text box", lead.confirmFirstNameTextBoxExists());
        assertTrue("Unable to locate Last Name text box", lead.confirmLastNameTextBoxExists());
        assertTrue("Unable to locate Phone Number text box", lead.confirmPhoneNumberTextBoxExists());
        assertTrue("Unable to locate Email text box", lead.confirmEmailTextBoxExists());
        assertTrue("Unable to locate Save Lead button", lead.confirmSaveLeadButtonExists());
        assertTrue("Unable to locate Cancel button", lead.confirmCancelExists());
        //Search for property
        assertTrue("Unable to click property drop-down", lead.searchPropertySendKeys("Affordable_Automation"));
        assertTrue("Unable to select the property", lead.searchAffordablePropertyClickProperty());
        //Lead details tab - confirm fields exist
        assertTrue("Unable to click Lead Details Tab", lead.clickLeadDetailsTab());
        assertTrue("Unable to select 'Affordable Application' from Applications dropdown", lead.selectApplicationByValue());
        assertTrue("Unable to click Check Eligibility button", lead.clickCheckEligibility());
        assertTrue("Unable to locate Total Annual Income field", lead.confirmTotalAnnualIncomeField());
        assertTrue("Unable to locate First Name field", lead.confirmFirstNameField());
        assertTrue("Unable to locate Last Name field", lead.confirmLastNameField());
        assertTrue("Unable to locate Birth Date Field", lead.confirmBirthDateField());
        assertTrue("Unable to locate Relationship field", lead.confirmRelationshipField());
        assertTrue("Unable to locate Citizenship field", lead.confirmCitizenshipField());
        assertTrue("Unable to locate Student Toggle switch", lead.confirmStudentToggleExists());
        assertTrue("Unable to locate Disabled Toggle switch", lead.confirmDisabledToggleExists());
        assertTrue("Unable to locate Add Household Member button", lead.confirmAddHouseholdMember());
        assertTrue("Unable to locate Check Eligibility button", lead.confirmCheckEligibilityButton());
        assertTrue("Unable to locate Cancel button", lead.confirmCancelButton());

        //Begin to fill out Check Eligibility form
        assertTrue("Unable to click on Total Annual Income field", lead.clickTotalAnnualIncome());
        assertTrue("Unable to populate Total Annual Income field", lead.enterTotalAnnualIncome("10000"));
        assertTrue("Unable to click First Name", lead.clickFirstNameField());
        assertTrue("Unable to populate First Name field", lead.enterFirstName("Trith"));
        assertTrue("Unable to click Last Name field", lead.clickLastNameField());
        assertTrue("Unable to populate Last Name field", lead.enterLastName("Spith"));
        assertTrue("Unable to enter the month in Birth Date", lead.enterMonthBirthDate("01"));
        assertTrue("Unable to enter the day in Birth Date", lead.enterDayBirthDate("01"));
        assertTrue("Unable to enter the Year in Birth Date", lead.enterYearBirthDate("1960"));
        assertTrue("Unable to select Individual is a citizen or national from drop-down", lead.clickCitizenshipChooseFirstOption());
        assertTrue("Unable to click on Check Eligibility button", lead.clickCheckEligibilityButton());
        assertEquals("The household appears to meet the eligibility requirements for this site and can proceed with the application process. Update and Recheck Eligibility",
                lead.confirmSuccessMessageAfterCheckEligibility());

        //Fill out required fields before saving the lead and confirming the status is 'Eligibility: Complete'.
        String phoneLead = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to enter phone number for new lead", lead.enterPhoneNumberForNewLead(phoneLead));
        assertTrue("Unable to click on Originating Lead Source dropdown", lead.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select result from Originating Lead Source dropdown", lead.dropdownResultsOriginatingLeadSource());
        assertTrue("Unable to select Method of Contact", lead.selectEmailContactMethodByValue());
        assertTrue("Unable to select Result of Contact", lead.clickAndSelectResultOfContactDropdown());
        assertTrue("Unable to enter text in the required Notes textbox", lead.enterTextRequiredNotes("Test"));
        assertTrue("Unable to click Save Lead button", lead.clickSaveLeadButton());
        assertEquals("After Saving Lead - status should read - Eligibility: Complete","Eligibility: Complete",
                lead.confirmEligibilityIsCompleteStatus());
    }

    @Test //Test Case ID: #2243659
    public void shouldValidateMarkCertificationCompleteFunctionality_whenAddingAnAffordableLeadAndMarkingApplicationAsComplete() {
        //Click Leads Tab on Dashboard
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click Leads tab on Dashboard", nav.clickLeadsTab());

        AllLeadsPage add = new AllLeadsPage(driver);
        assertTrue("Unable to click Add Lead on left hand side menu", add.clickAddLeadLeftHandSideMenu());

        AddLeadPage lead = new AddLeadPage(driver);
        assertTrue("Unable to find property drop-down", lead.confirmPropertyDropdownExists());
        assertTrue("Unable to find First Name text box", lead.confirmFirstNameTextBoxExists());
        assertTrue("Unable to locate Last Name text box", lead.confirmLastNameTextBoxExists());
        assertTrue("Unable to locate Phone Number text box", lead.confirmPhoneNumberTextBoxExists());
        assertTrue("Unable to locate Email text box", lead.confirmEmailTextBoxExists());
        assertTrue("Unable to locate Save Lead button", lead.confirmSaveLeadButtonExists());
        assertTrue("Unable to locate Cancel button", lead.confirmCancelExists());
        //Search for property
        assertTrue("Unable to click property drop-down", lead.searchPropertySendKeys("Affordable_Automation"));
        assertTrue("Unable to select the property", lead.searchAffordablePropertyClickProperty());
        //Lead details tab - confirm fields exist
        assertTrue("Unable to click Lead Details Tab", lead.clickLeadDetailsTab());
        assertTrue("Unable to select 'Affordable Application' from Applications dropdown", lead.selectApplicationByValue());
        assertTrue("Unable to click Check Eligibility button", lead.clickCheckEligibility());
        assertTrue("Unable to locate Total Annual Income field", lead.confirmTotalAnnualIncomeField());
        assertTrue("Unable to locate First Name field", lead.confirmFirstNameField());
        assertTrue("Unable to locate Last Name field", lead.confirmLastNameField());
        assertTrue("Unable to locate Birth Date Field", lead.confirmBirthDateField());
        assertTrue("Unable to locate Relationship field", lead.confirmRelationshipField());
        assertTrue("Unable to locate Citizenship field", lead.confirmCitizenshipField());
        assertTrue("Unable to locate Student Toggle switch", lead.confirmStudentToggleExists());
        assertTrue("Unable to locate Disabled Toggle switch", lead.confirmDisabledToggleExists());
        assertTrue("Unable to locate Add Household Member button", lead.confirmAddHouseholdMember());
        assertTrue("Unable to locate Check Eligibility button", lead.confirmCheckEligibilityButton());
        assertTrue("Unable to locate Cancel button", lead.confirmCancelButton());

        //Begin to fill out Check Eligibility form
        assertTrue("Unable to click on Total Annual Income field", lead.clickTotalAnnualIncome());
        assertTrue("Unable to populate Total Annual Income field", lead.enterTotalAnnualIncome("10000"));
        assertTrue("Unable to click First Name", lead.clickFirstNameField());
        assertTrue("Unable to populate First Name field", lead.enterFirstName("Trith"));
        assertTrue("Unable to click Last Name field", lead.clickLastNameField());
        assertTrue("Unable to populate Last Name field", lead.enterLastName("Spith"));
        assertTrue("Unable to enter the month in Birth Date", lead.enterMonthBirthDate("01"));
        assertTrue("Unable to enter the day in Birth Date", lead.enterDayBirthDate("01"));
        assertTrue("Unable to enter the Year in Birth Date", lead.enterYearBirthDate("1960"));
        assertTrue("Unable to select Individual is a citizen or national from drop-down", lead.clickCitizenshipChooseFirstOption());
        assertTrue("Unable to click on Check Eligibility button", lead.clickCheckEligibilityButton());
        assertEquals("The household appears to meet the eligibility requirements for this site and can proceed with the application process. Update and Recheck Eligibility",
                lead.confirmSuccessMessageAfterCheckEligibility());

        //Fill out required fields before saving the lead and confirming the status is 'Eligibility: Complete'.
        String phoneLead = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to enter phone number for new lead", lead.enterPhoneNumberForNewLead(phoneLead));
        assertTrue("Unable to click on Originating Lead Source dropdown", lead.clickOriginatingLeadSourceDropdown());
        assertTrue("Unable to select result from Originating Lead Source dropdown", lead.dropdownResultsOriginatingLeadSource());
        assertTrue("Unable to select Method of Contact", lead.selectEmailContactMethodByValue());
        assertTrue("Unable to select Result of Contact", lead.clickAndSelectResultOfContactDropdown());
        assertTrue("Unable to enter text in the required Notes textbox", lead.enterTextRequiredNotes("Test"));
        assertTrue("Unable to click Save Lead button", lead.clickSaveLeadButton());

        LeadSummary summary = new LeadSummary(driver);
        assertTrue("Failed to click Start Certification button", summary.clickStartCertificationButton());
        assertTrue("Failed to click 'Enter Certification Info Below' button", summary.clickEnterCertificationInfoBelowButton());
        assertTrue("Failed to check Middle Name checkbox", summary.clickMiddleNameCheckbox());
        String email = RandomGenerator.randomPhoneNumber();
        assertTrue("Failed to enter an Email for Lead in the member tab", summary.enterEmailMemberTab(email));
        String phone = RandomGenerator.randomPhoneNumber();
        assertTrue("Failed to enter a Phone Number for Lead in the member tab", summary.enterPhoneNumberMemberTab(phone));
        String socialSecurityNumber = RandomGenerator.randomSocialSecurityNumber();
        assertTrue("Failed to enter SSN number for Lead in the member tab", summary.enterSocialSecurityNumber(socialSecurityNumber));
        assertTrue("Failed to click Mark Complete button", summary.clickMarkCompleteButton());
        assertEquals("After marking certification as complete - status should read - Certification: Complete","Certification: Complete",
                summary.confirmCertificationCompleteStatus());
    }
}