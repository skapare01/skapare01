package smoke_and_sanity_tests.deploy_admin_tests.dashboard_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.dashboard_tab.users_and_permissions_subtab.UsersAndPermissionsPage;

import static org.junit.Assert.assertTrue;

public class UsersAndPermissionsTestsIT extends BaseBrowserTest {
    public UsersAndPermissionsTestsIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2224503
    public void shouldConfirmLoginHistoryTab_whenSelectedInUserProfileInDeployAdmin() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not click on Users & Permissions subtab under the Dashboard tab in DeployAdmin.", deployAdminNavBar.clickUsersAndPermissionsSubtab());

        UsersAndPermissionsPage usersAndPermissionsPage = new UsersAndPermissionsPage(driver);
        assertTrue("Could not click on Sandeep Garud's user name row.", usersAndPermissionsPage.clickOnSandeepGarudUserRow());
        assertTrue("Could not click on Login History tab in Sandeep's user profile curtain page.", usersAndPermissionsPage.clickOnLoginHistoryTabInSandeepGarudsUserProfile());
        assertTrue("Could not confirm that the list count drop down menu is visible at the bottom of the page.", usersAndPermissionsPage.confirmRecordsPerPageListDropDownMenuIsVisible());
        assertTrue("Could not click on the Close X button in the top right hand corner of the screen.", usersAndPermissionsPage.clickCloseXButtonForUserProfileCurtainPage());
    }
}
