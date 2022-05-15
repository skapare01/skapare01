package smoke_and_sanity_tests.entrata_paas_tests.users_and_groups;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab.UsersAndGroupsNav;

import static org.junit.Assert.assertTrue;

public class ShouldCheckUsersAndGroupsWhenUsersAndGroupsTabIsSelectedIT extends BaseBrowserTest {

    public ShouldCheckUsersAndGroupsWhenUsersAndGroupsTabIsSelectedIT(){
        super("khansen");}

    @Test
    public void ShouldCheckUsersAndGroupsWhenUsersAndGroupsTabIsSelectedIT() {

        EntrataNavBar entNavBar = new EntrataNavBar(driver);
        UsersAndGroupsNav usersAndGroupsNav = new UsersAndGroupsNav(driver);
        assertTrue("Unable to click Setup tab", entNavBar.clickSetupButton());
        assertTrue("Unable to click Users & Groups tab", entNavBar.clickUsersAndGroups());
        assertTrue("Unable to click Users tab", usersAndGroupsNav.clickUsersTab());
        assertTrue("Unable to find Add Users button", usersAndGroupsNav.findAddUsersButton());
        assertTrue("Unable to find Filter button", usersAndGroupsNav.findFilterButton());
        assertTrue("Unable to find Tools button", usersAndGroupsNav.findToolsButton());
        assertTrue("Unable to find Download button", usersAndGroupsNav.findDownloadButton());
        assertTrue("Unable to click Groups tab", usersAndGroupsNav.clickGroupsTab());
        assertTrue("Unable to find Add Groups button", usersAndGroupsNav.findAddGroupsButton());

    }

}
