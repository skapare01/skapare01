package regression_tests.client_admin_regression_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.it_tab.users_and_groups.UsersAndGroups;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class ValidateUsersAndGroups extends BaseBrowserTest {

    public ValidateUsersAndGroups() {
        super("clientadmin", CLIENTADMIN, "akavanaugh", "Xento123");
    }

    @Test
    public void confirmUsersAndGroupsLoadsProperly_whenPageIsOpened() {
        //Test Case 2224586

        //Navigate to Users and Groups
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to IT tab.", navBar.moveToITTab());
        assertTrue("Unable to select Users and Groups Sub-tab.", navBar.clickUsersAndGroups());

        //Confirm Users and Groups page loads properly.
        UsersAndGroups usersAndGroups = new UsersAndGroups(driver);
        assertTrue("Unable to confirm add user is visible.", usersAndGroups.confirmAddUsersIsVisible());
        assertTrue("Unable to confirm Show Disabled is visible.", usersAndGroups.confirmShowDisabledIsVisible());
        assertTrue("Unable to confirm Users Tab is visible.", usersAndGroups.confirmUsersTabIsVisible());
        assertTrue("Unable to confirm Groups Tab is visible.", usersAndGroups.confirmGroupsTabIsVisible());
        assertTrue("Unable to confirm Ps Modules Tab is visible.", usersAndGroups.confirmPsModulesTabIsVisible());
        assertTrue("Unable to confirm Roles Tab is visible.", usersAndGroups.confirmRolesTabIsVisible());
        assertTrue("Unable to confirm Ps Modules Permissions Tab is visible.", usersAndGroups.confirmPsModulesPermissionsTabIsVisible());

    }

}