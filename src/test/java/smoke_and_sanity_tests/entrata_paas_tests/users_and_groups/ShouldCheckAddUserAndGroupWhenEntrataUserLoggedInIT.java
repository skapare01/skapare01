package smoke_and_sanity_tests.entrata_paas_tests.users_and_groups;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab.*;

import static org.junit.Assert.*;


public class ShouldCheckAddUserAndGroupWhenEntrataUserLoggedInIT extends BaseBrowserTest {
    public ShouldCheckAddUserAndGroupWhenEntrataUserLoggedInIT(){
        super("avantic");}

    @Test
    public void shouldCheckAddUserPopup_whenEntrataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersPage usersPage = new UsersPage(driver);
        assertTrue("unable to click setup tab", entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups",entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to click add users",usersPage.clickAddUser());
        assertTrue("unable to find first name field",usersPage.findFirstNameField());
        assertTrue("unable to find last name field",usersPage.findLastNameField());
        assertTrue("unable to find username field",usersPage.findUserName());

    }
    @Test
    public void shouldCheckAddGroupPopup_whenEntrataUserLoggedIn() {
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersAndGroupsNav usersAndGroupsNav = new UsersAndGroupsNav(driver);
        GroupsPage groupsPage = new GroupsPage(driver);
        assertTrue("unable to click setup button", entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups", entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to click groups tab", usersAndGroupsNav.clickGroupsTab());
        assertTrue("unable to click add group", groupsPage.clickAddGroupButton());
        assertTrue("unable to find group name field", groupsPage.findGroupNameField());
        assertTrue("unable to find description field", groupsPage.findDescriptionField());
    }
    @Test
    public void shouldCheckAddBulkUserPopup_whenEntrataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersPage usersPage = new UsersPage(driver);
        assertTrue("unable to click setup button", entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups", entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to move to tools icon",usersPage.moveToTools());
        assertTrue("unable to click on bulk add user",usersPage.clickAddBulkUsers());
        assertTrue("unable to find company user table", usersPage.findCompanyUserTable());
    }

    @Test public void shouldCheckBulkEnableCompanyUsers_whenEntrataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersPage usersPage = new UsersPage(driver);
        BulkEnableOrDisableCompanyUserPage bulkEnableOrDisableCompanyUserPage = new BulkEnableOrDisableCompanyUserPage(driver);
        assertTrue("unable to click setup button",entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups", entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to move to tools icon",usersPage.moveToTools());
        assertTrue("unable to click bulk enable company users",usersPage.clickBulkEnableUsers());
        assertTrue("unable to click enabled users", bulkEnableOrDisableCompanyUserPage.clickEnabledUsersTab());
        assertTrue("unable to find disable button",bulkEnableOrDisableCompanyUserPage.findDisabledButton());
        assertTrue("unable to click disabled users tab", bulkEnableOrDisableCompanyUserPage.clickDisableUsersTab());
        assertTrue("find enable button",bulkEnableOrDisableCompanyUserPage.findEnabledButton());
    }

    @Test public void shouldCheckGroupTabsAreClickable_whenEntataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersAndGroupsNav usersAndGroupsNav = new UsersAndGroupsNav(driver);
        GroupsPage groupsPage = new GroupsPage(driver);
        GroupProfilePage groupProfilePage = new GroupProfilePage(driver);
        assertTrue("unable to click setup button",entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups", entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to click groups tab", usersAndGroupsNav.clickGroupsTab());
        assertTrue("unable to click first group",groupsPage.clickFirstGroup());
        assertTrue("unable to click Assignments",groupProfilePage.clickAssignments());
        assertTrue("unable to click group info", groupProfilePage.clickGroupInfo());
        assertTrue("unable to click permissions",groupProfilePage.clickPermissions());
        assertTrue("unable to click assigned users", groupProfilePage.clickAssignedUsers());
        assertTrue("unable to click training", groupProfilePage.clickTraining());
        assertTrue("unable to click change Log", groupProfilePage.clickChangeLog());
    }
    @Test public void shouldCheckUserTabsAreClickable_whenEntrataUserLoggedIn(){
        EntrataNavBar entrata_navBar = new EntrataNavBar(driver);
        UsersPage usersPage = new UsersPage(driver);
        UserProfilePage userProfilePage = new UserProfilePage(driver);
        assertTrue("unable to click setup button",entrata_navBar.clickSetupButton());
        assertTrue("unable to click users and groups", entrata_navBar.clickUsersAndGroups());
        assertTrue("unable to click first user",usersPage.clickFirstUser());
        assertTrue("unable to click assignments",userProfilePage.clickAssignments());
        assertTrue("unable to click profile", userProfilePage.clickProfile());
        assertTrue("unable to click permissions",userProfilePage.clickPermissions());
        assertTrue("unable to click assigned users", userProfilePage.clickCourses());
        assertTrue("unable to click documents",userProfilePage.clickDocuments());
        assertTrue("unable to click change log", userProfilePage.clickChangeLog());
        assertTrue("unable to click login history",userProfilePage.clickLoginHistory());



    }


}
