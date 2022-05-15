package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.task_types_subtab.TaskTypes;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class ValidateTaskTypesIT extends BaseBrowserTest {

    public ValidateTaskTypesIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void confirmTaskTypesLoadCorrectly_whenViewingTheTaskTypesPage() {
        //Navigate to Task Types
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to click the Tasks menu.", clientAdminNavBar.clickTasksMenu());
        assertTrue("Unable to select the Tasks Types.", clientAdminNavBar.clickTaskTypes());

        //Verify the Task Types page loaded properly.
        TaskTypes taskTypes = new TaskTypes(driver);
        assertTrue("The Task Types page did not load properly.", taskTypes.confirmTaskTypesTableIsVisible());

    }

}