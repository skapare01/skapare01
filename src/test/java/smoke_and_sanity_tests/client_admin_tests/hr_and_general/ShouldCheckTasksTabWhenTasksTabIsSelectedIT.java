package smoke_and_sanity_tests.client_admin_tests.hr_and_general;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.add_task.AddTaskPage;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckTasksTabWhenTasksTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckTasksTabWhenTasksTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "pjaiswal", "Xento123");
    }

    @Test
    public void shouldCheckAddTaskSubTab_whenAddTaskSubTabIsSelected() {
        ClientAdminNavBar clientNav = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'Tasks' tab.",clientNav.moveToTasksTab());
        assertTrue("Unable to locate/select 'Add Task' option Tasks in drop down menu.",clientNav.clickAddTask());
        AddTaskPage addTask = new AddTaskPage(driver);
        assertTrue("Unable to locate Add Task 'Type' text.",addTask.viewAddTaskTypeText());
    }
}