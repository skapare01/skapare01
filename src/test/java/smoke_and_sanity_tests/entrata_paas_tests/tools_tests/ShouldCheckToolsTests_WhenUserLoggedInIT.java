package smoke_and_sanity_tests.entrata_paas_tests.tools_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.CreateNewMessagePage;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.ManageMessagePage;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.privacy_management_tab.DataPrivacyRequestPage;
import page_objects.entrata_page_objects.tools_tab.learning_sessions_subtab.LearningSessionsPage;

import static org.junit.Assert.*;

public class ShouldCheckToolsTests_WhenUserLoggedInIT extends BaseBrowserTest {
    public ShouldCheckToolsTests_WhenUserLoggedInIT(){
        super("avantic"); }
    @Test
    public void shouldCheckCreateNewMessageLinkInMyDashboard_whenEntrataUserLoggedIn(){
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        CreateNewMessagePage createNewMessagePage = new CreateNewMessagePage(driver);
        assertTrue("unable to click create new message",myDashboardNav.clickCreateNewMessage());
        assertTrue("unable to find message field",createNewMessagePage.findMessageTitleField());
    }

    @Test public void shouldCheckManageMessageLinkInMyDashboard_whenEntrataUserLoggedIn(){
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        ManageMessagePage manageMessagePage = new ManageMessagePage(driver);
        assertTrue("unable to click manage messages", myDashboardNav.clickManageMessages());
        assertTrue("unable to find sent tab", manageMessagePage.findSentTab());
        assertTrue("unable to find scheduled tab", manageMessagePage.findScheduledTab());
        assertTrue("unable to find sort by dropdown",manageMessagePage.findSortBy());
    }

    @Test public void shouldNavigateToLearningSessionsModule_whenEntrataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        LearningSessionsPage learningSessionsPage = new LearningSessionsPage(driver);
        assertTrue("unable to click tools tab",entrata_navBar.clickToolsTab());
        assertTrue("unable to click learning sessions",entrata_navBar.clickLearningSessions());
        assertTrue("unable to find create sessions page",learningSessionsPage.clickCreateSession());
        assertTrue("unable to find training name field",learningSessionsPage.findTrainingNameField());
        assertTrue("unable to find user list",learningSessionsPage.findUserList());
    }

    @Test public void shouldNavigateToDataPrivacyRequestPage_whenEntrataUserLoggedIN(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        DataPrivacyRequestPage dataPrivacyRequestPage = new DataPrivacyRequestPage(driver);
        assertTrue("unable to click setup tab", navBar.clickSetupButton());
        assertTrue("unable to click privacy management subtab", companyFirstLevelNavigation.clickPrivacyManagementTab());
        assertTrue("unable to enter first name", dataPrivacyRequestPage.enterFirstName("Milton"));
        assertTrue("unable to enter last name", dataPrivacyRequestPage.enterLastName("Abarca"));
        assertTrue("unable to click find button", dataPrivacyRequestPage.clickFindButton());
        assertTrue("unable to find create request button", dataPrivacyRequestPage.findCreateRequest());
    }
}
