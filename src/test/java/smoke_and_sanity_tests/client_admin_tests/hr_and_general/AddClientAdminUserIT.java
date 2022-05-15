package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.it_tab.users_and_groups.AddUserPage;
import page_objects.client_admin_page_objects.it_tab.users_and_groups.UsersAndGroups;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;
import static utils.RandomGenerator.randomEmail;
import static utils.RandomGenerator.randomUsername;

public class AddClientAdminUserIT extends BaseBrowserTest {

    public AddClientAdminUserIT() {
        super("clientadmin", CLIENTADMIN, "rjensen", "Entrata123");
    }

    @Test
    public void shouldAddNewUser_WhenRequiredFieldsAreCompleted() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        UsersAndGroups usersAndGroups = new UsersAndGroups(driver);
        AddUserPage addUserPage = new AddUserPage(driver);

        assertTrue("Failed to find IT tab.", clientAdminNavBar.moveToITTab());
        assertTrue("Failed to click Users & Groups sub tab.", clientAdminNavBar.clickUsersAndGroups());
        assertTrue("Failed to click Add User button.", usersAndGroups.addUserButtonClick());
        assertTrue("Failed to input a username.", addUserPage.addUsername(randomUsername()));
        assertTrue("Failed to select Employee Type.", addUserPage.employeeTypeSelect("1"));
        assertTrue("Failed to select Department.", addUserPage.departmentSelect("4"));
        assertTrue("Failed to input First Name.", addUserPage.firstNameInput(randomName()));
        assertTrue("Failed to input Last Name.", addUserPage.lastNameInput(randomName()));
        assertTrue("Failed to input Email.", addUserPage.emailInput(randomEmail()));
        assertTrue("Failed to click the submit 'Add User' button.", addUserPage.addUserButtonSubmitClick());
        assertTrue("Failed to Add User. Error message was detected.", addUserPage.errorAlertMessageInvisible());
    }
}
