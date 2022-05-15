package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.recurring_tasks_subtab.RecurringTasks;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.*;

public class ValidateRecurringTasksIT extends BaseBrowserTest {

    public ValidateRecurringTasksIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void shouldVerifyRecurringTaskCountUpdates_whenDeletingRecurringTasks() {
        //Testcase 2224421

        //Navigate to Recurring Tasks
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to Tasks tab.", clientAdminNavBar.moveToTasksTab());
        assertTrue("Unable to select the Recurring Tasks subtab on the Task Tab dropdown.", clientAdminNavBar.clickRecurringTasks());

        //Store the current count of the recurring tasks.
        RecurringTasks recurringTasks = new RecurringTasks(driver);
        assertEquals("Unable to get the recurring tasks count and store it.", recurringTasks.storedRecurringTaskCount(), recurringTasks.storedNumber);

        //Bulk edit to delete tasks from the recurring tasks.
        assertTrue("Unable to click the bulk edit checkbox on the first task on the Recurring Tasks List.", recurringTasks.clickRecurringTaskCheckbox1());
        assertTrue("Unable to click the bulk edit checkbox on the second task on the Recurring Tasks List.", recurringTasks.clickRecurringTaskCheckbox2());
        assertTrue("Unable to click the bulk delete button.", recurringTasks.clickBulkDeleteButton());
        assertTrue("Unable to click the bulk delete button.", recurringTasks.clickBulkDeleteButtonConfirmDelete());

        //Verify that the recurring tasks count is now different.
        RecurringTasks afterBulkDelete = new RecurringTasks(driver);
        assertTrue("The recurring task count did not change.", recurringTasks.didTheTextChange());
        assertNotEquals("The Recurring Tasks count is still the same.", afterBulkDelete.storedRecurringTaskCount(), recurringTasks.storedNumber);
    }

}