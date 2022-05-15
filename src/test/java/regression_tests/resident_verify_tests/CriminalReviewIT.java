package regression_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.add_lead_page.AddLeadPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application.*;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;
import page_objects.entrata_page_objects.leads_tab.lead_profile.ProcessScreeningPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.documents_tab.RentalApplicationsTab;
import page_objects.login.ClientAdminLoginPage;
import utils.RandomGenerator;

import static org.junit.Assert.assertTrue;

public class CriminalReviewIT extends BaseBrowserTest {

    public CriminalReviewIT(){
        super("rvtest");}

    @Test
    public void shouldCompleteCriminalManualReview_whenProcessScreeningCompletedAndFollowedOverToManualReviewScreen(){
        //uploads policy docs on application
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.",nav.clickSetupButton());
        assertTrue("Unable to click company subtab",nav.clickCompanyButton());
        CompanyFirstLevelNavigation firstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to click documents subtab",firstLevelNavigation.clickDocumentsTab());
        RentalApplicationsTab rentalApplicationsTab = new RentalApplicationsTab(driver);
        assertTrue("Unable to select SidRentalAPP", rentalApplicationsTab.clickSidRentalApplicaiton());
        assertTrue("Unable to click policy documents button",rentalApplicationsTab.policyDocsTab());
        assertTrue("Unable to click upload policy doc for screening authorization form",rentalApplicationsTab.uploadDocButton());
        assertTrue("Unable to add dummy pdf file",rentalApplicationsTab.fileAdd());
        assertTrue("Unable to save upload",rentalApplicationsTab.saveButtonForAddPolicyDoc());
        assertTrue("Unable to click policy doc for consumer authorization form",rentalApplicationsTab.uploadDocButton());
        assertTrue("Unable to upload dummy pdf document.",rentalApplicationsTab.fileAdd());
        assertTrue("Unable to click save button",rentalApplicationsTab.saveButtonForAddPolicyDoc());
        assertTrue("Unable to click close policy document button",rentalApplicationsTab.exitPolicyDocWindow());
        // add lead portion
        assertTrue("Unable to click Leads Tab.",nav.clickLeadsTab());
        AllLeadsPage allLeadsPage = new AllLeadsPage(driver);
        assertTrue("Unable to click add lead button.",allLeadsPage.clickAddLeadLeftHandSideMenu());
        AddLeadPage addLeadPage = new AddLeadPage(driver);
        assertTrue("Unable to click property down arrow.",addLeadPage.propertyDropdownArrowClick());
        assertTrue("Unable to click 'Screening' property.",addLeadPage.selectSpecificPropertyFromDropdown("RV_Sid_PMEnable"));
        String firstName = RandomGenerator.randomUsername();
        assertTrue("Unable to click first name box.", addLeadPage.firstNameTextFieldClick());
        assertTrue("Unable to enter text in first name field.", addLeadPage.firstNameTextFieldSendKeys(firstName));
        String lastName = RandomGenerator.randomLastName();
        assertTrue("Unable to enter text in last name field.",addLeadPage.lastNameTextFieldSendKeys(lastName));
        String phoneNumber = RandomGenerator.randomPhoneNumber();
        assertTrue("Unable to enter phone number in phone number field.",addLeadPage.addPhoneNumberSendKeys(phoneNumber));
        assertTrue("Unable to enter email address in email field", addLeadPage.clickAndSendKeysToTheEmailTextBox("testscreening234@test.com"));
        assertTrue("Unable to select 'call' from result of contact dropdown",addLeadPage.selectPhoneContactMethod());
        assertTrue("Unable to select 'no response sent' from result of contact dropdown.", addLeadPage.selectInterestedResultOfContact());
        assertTrue("Unable to click start application button.",addLeadPage.clickStartApplicationButton());
        LeadSummary leadSummary = new LeadSummary(driver);
        assertTrue("Unable to click on applicant name link to enter application",leadSummary.clickApplicantNameLink(lastName + ", " + firstName));
        // complete application portion
        BasicInfoPage basicInfoPage = new BasicInfoPage(driver);
        assertTrue("Unable to click 'I do not have a middle name' checkbox",basicInfoPage.clickNoMiddleNameCheckbox());
        assertTrue("Unable to click yes option for are you a citizen question", basicInfoPage.clickUSCitizenYesOption());
        assertTrue("Unable to enter birth month in date of birth field.",basicInfoPage.enterBirthMonth("05"));
        assertTrue("Unable to enter birth day in date of birth field", basicInfoPage.enterBirthDay("08"));
        assertTrue("Unable to enter year of birth in date of birth field",basicInfoPage.enterBirthYear("2000"));
        assertTrue("Unable to select ssn from dropdown", basicInfoPage.selectSSNTestClientOptionOne());
        assertTrue("Unable to click unit preference tab.",basicInfoPage.clickUnitPreferenceTab());
        assertTrue("Unable to accept alert when switching to unit preferences page",basicInfoPage.acceptTheSwitchingPagesAlert());
        UnitPreferencePage unitPreferencePage = new UnitPreferencePage(driver);
        assertTrue("Unable to click first select floorplan button",unitPreferencePage.clickFirstSelectButton());
        assertTrue("Unable to click first unit from list.", unitPreferencePage.clickFirstUnitOnList());
        assertTrue("Unable to select first leasing option.",unitPreferencePage.clickFirstLeasingOption());
        assertTrue("Unable to click additional info tab.",unitPreferencePage.clickAdditionalInfoTab());
        AdditionalInformationPage additionalInformationPage = new AdditionalInformationPage(driver);
        assertTrue("Unable to enter address line one.",additionalInformationPage.enterAddressLineOne("123 main"));
        assertTrue("Unable to enter city name.",additionalInformationPage.enterCityName("Lehi"));
        assertTrue("Unable to select state of Utah from state dropdown.",additionalInformationPage.selectUtahState());
        assertTrue("Unable to enter zip code",additionalInformationPage.enterZipCode("84043"));
        assertTrue("Unable to click financial button",additionalInformationPage.clickFinancialButton());
        ApplicationNav applicationNav = new ApplicationNav(driver);
        assertTrue("Unable to click mark complete button in application",applicationNav.clickMarkApplicationCompleteButton());
        assertTrue("Unable to click process screening.",leadSummary.clickProcessScreening());
        ProcessScreeningPage processScreeningPage = new ProcessScreeningPage(driver);
        assertTrue("Unable to click criminal fail package from package dropdown",processScreeningPage.selectCriminalFailPackageFromDropdown());
        assertTrue("Unable to click upload button",processScreeningPage.clickUploadButton());
        assertTrue("Unable to add dummy pdf file as screening document",processScreeningPage.screeningDocumentAdd());
        assertTrue("Unable to click upload button after selecting file to upload",processScreeningPage.clickUploadButtonAfterUploadingFile());
        assertTrue("Unable to click process screening button on process screening popup",processScreeningPage.clickProcessScreeningButton());
        ClientAdminLoginPage clientAdminLoginPage = new ClientAdminLoginPage(driver);
        assertTrue("Unable to navigate to client admin after opening new tab.",clientAdminLoginPage.openNewTabAndNavigateToClientAdmin());
        assertTrue("Unable to enter client admin user name.",clientAdminLoginPage.enterClientAdminUsername("bbrogdon"));
        assertTrue("Unable to enter client admin password.", clientAdminLoginPage.enterClientAdminPassword(System.getProperty("clientadmin.login.password")));
        assertTrue("Unable to hit enter after typing password", clientAdminLoginPage.pressEnterOnPassword());
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to support tab.",clientAdminNavBar.moveToSupportMenu());
        assertTrue("Unable to move to the screening subtab.",clientAdminNavBar.moveToScreeningMenuOfSupport());
        assertTrue("Unable to click on support > screening >screening manual review",clientAdminNavBar.openScreeningManualReview());

    }
}
