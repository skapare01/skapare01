package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab.LeadsMiscSubtabNav;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifySeparateLeadsAndApplicantsSettingsIT extends BaseBrowserTest {
    //Constructor//
    public ShouldVerifySeparateLeadsAndApplicantsSettingsIT() { super("avantic"); }

    @Test
    public void shouldVerifySeparateLeadsAndApplicantsSettings_whenInCompanySettings() {
        //2256553 - To verify "Separate Leads & Applicants:" setting

        LeadsMiscSubtabNav useLeadsMiscSubtabNav = new LeadsMiscSubtabNav(driver);
        EntrataNavBar useEntrata_NavBar = new EntrataNavBar(driver);
        //Navigate to Setup>Company
        assertTrue("Unable to navigate to the Company Level Settings!", useEntrata_NavBar.clickSetupButton());
        CompanyFirstLevelNavigation useCompanyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Setup->Company->\"Leads\" subtab!", useCompanyFirstLevelNavigation.clickLeadsTab());
        //Navigate to Setup>Company>Leads>Misc
        assertTrue("Unable to navigate to the Setup->Company->Leads->Misc subtab", useLeadsMiscSubtabNav.clickLeadsMiscSubtab());
        //Edit settings and click the different radio buttons
        assertTrue("Unable to use the \"Edit Lead Settings\" button under Setup->Company->Leads->Misc!", useLeadsMiscSubtabNav.setupCompanyLeadsEditMiscSettings());
        assertTrue("Unable to Select the \"Lead reaches the status of:\" radio button! ", useLeadsMiscSubtabNav.clickLeadReachesTheStatusOfRadioButton());
        assertTrue("Unable to Select the \"Any payment is received:\" radio button! ", useLeadsMiscSubtabNav.clickLeadBecomesApplicantWhenPaymentReceivedRadioButton());
        //Testing the different "Lead reaches the status of:" setting options
        assertTrue("Unable to Select the \"Lead reaches the status of:\" radio button! ", useLeadsMiscSubtabNav.clickLeadReachesTheStatusOfRadioButton());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Guest Card Completed)
        assertTrue("Unable to Select the \"Guest Card Completed:\" dropdown option! ", useLeadsMiscSubtabNav.selectGuestCardCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Application Started)
        assertTrue("Unable to Select the \"Application Started\" dropdown option! ", useLeadsMiscSubtabNav.selectAppStartedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Application: Partially Completed)
        assertTrue("Unable to Select the \"Application: Partially Completed\" dropdown option! ", useLeadsMiscSubtabNav.selectApplicationPartiallyCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Application Completed)
        assertTrue("Unable to Select the \"Application Completed\" dropdown option! ", useLeadsMiscSubtabNav.selectApplicationCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Application Approved)
        assertTrue("Unable to Select the \"Application Approved\" dropdown option! ", useLeadsMiscSubtabNav.selectApplicationApprovedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Lease Started)
        assertTrue("Unable to Select the \"Lease Started\" dropdown option! ", useLeadsMiscSubtabNav.selectLeaseStartedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Lease Partially Completed)
        assertTrue("Unable to Select the \"Lease Partially Completed\" dropdown option! ", useLeadsMiscSubtabNav.selectLeasePartiallyCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Lease Completed)
        assertTrue("Unable to Select the \"Lease Completed\" dropdown option! ", useLeadsMiscSubtabNav.selectLeaseCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Lease Approved)
        assertTrue("Unable to Select the \"Lease Approved\" dropdown option! ", useLeadsMiscSubtabNav.selectLeaseApprovedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscSubtabNav.clickChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());
        //Testing the different "Lead reaches the status of:" setting options (Application Started)
        assertTrue("Unable to Select the \"Application Started\" dropdown option! ", useLeadsMiscSubtabNav.selectAppStartedOption());
        assertTrue("Unable to Select the \"Save\" button for the Company>Misc Leads settings!", useLeadsMiscSubtabNav.selectMiscLeadsSettingsSaveButton());
    }
}
