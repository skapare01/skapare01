package smoke_and_sanity_tests.online_applications_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.documents_tab.RentalApplicationsTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebPageCheck;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.village_bend_east_prospect_portal.VillageBendEastPortalApplyOnlinePage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.NavPagesSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.navigation_subtab.NavigationSubTab;
import static junit.framework.Assert.assertTrue;

public class VerifyCreateLeadStartApplicationFromProspectPortalConventionalIT extends BaseBrowserTest {

    public VerifyCreateLeadStartApplicationFromProspectPortalConventionalIT() {
        super("village");
    }

    @Test
    public void shouldCreateLeadAndStartApplication_whenAddingNewAccountInPortal() { //Test Case ID: #2581539
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
        assertTrue("Set up Tab was not able to be clicked", nav.clickSetupButton());
        assertTrue("Websites subtab was not able to be clicked", nav.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Village Bend East could not be clicked", webList.villageBendEastWebsite());
        WebsiteSettingsTabs webSettings = new WebsiteSettingsTabs(driver);
        assertTrue("Could not click on nav pages tab", webSettings.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Could not click on Nav Pages tab, navigation sub tab", navPages.navigationSubTab());
        NavigationSubTab navSub = new NavigationSubTab(driver);
        assertTrue("Could not click edit button for prospect portal main navigation", navSub.navigationEditButtonClick());
        assertTrue("Could not click on show button for Apply Now under main navigation", navSub.navigationApplyNowShowButtonClick());
        assertTrue("Could not click save button after editing main navigation", navSub.navigationEditMainNavSaveButton());
        assertTrue("Could not click on view website button", webSettings.viewWebsiteBtn());
        WebPageCheck page = new WebPageCheck(driver);
        assertTrue("Could not see cookies bar", page.cookiesBar());
        assertTrue("Could not click I accept all cookies Button", page.clickIAcceptAllCookiesButton());
        assertTrue("Could not click on Apply Button", page.prospectPortalApply());
        VillageBendEastPortalApplyOnlinePage apply = new VillageBendEastPortalApplyOnlinePage(driver);
        assertTrue("Could not click on Application type dropdown", apply.applicationTypeDropdown());
        assertTrue("Could not select specific conventional application, ConventionalTestApplication", apply.applicationTypeDropdownSelectTestApplication());
        assertTrue("Could not enter in first name", apply.firstNameTextBoxSendKeys());
        assertTrue("Could not enter in last name", apply.lastNameTextBoxSendKeys());
        assertTrue("Could not enter in primary phone number", apply.primaryPhoneNumberTextBoxSendKeys());
        assertTrue("Could not see 'add phone number' option", apply.addPhoneNumberButtonIsVisible());
        assertTrue("Could not enter in email address", apply.emailTextBoxSendKeys());
        assertTrue("Could not enter in password", apply.passwordTextBoxSendKeys());
        assertTrue("Could not enter in confirmed password", apply.confirmPasswordTextBoxSendKeys());
        assertTrue("Could not click on 'how did you hear about us' dropdown", apply.howDidYouHearAboutUsDropdown());
        assertTrue("Could not select specific lead source,'other'.", apply.howDidYouHearAboutUsDropdownSelectOther());
        assertTrue("Could not click on create application button", apply.createAccountBtn());
        assertTrue("Could not see application steps, application was not created successfully", apply.applicationPageVerifyStepsBar());
    }
}
