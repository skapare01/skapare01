package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.add_task.AddTaskPage;

import static org.junit.Assert.*;

public class ValidateAddTaskFunctionalityIT extends BaseBrowserTest {
    public ValidateAddTaskFunctionalityIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"bliddell","Xento123");}
    @Test
    public void shouldValidateAddTaskFunctionality_whenAddTaskIsClickedOn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        assertTrue("Cannot hover over tasks tab.",nav.moveToTasksTab());
        assertTrue("Cannot click add task subtab.",nav.clickAddTask());
        AddTaskPage addTaskPage = new AddTaskPage(driver);
        assertTrue("Unable to select feature task type from task type dropdown.", addTaskPage.selectFeatureDropdown());
        assertTrue("Unable to click create task button.", addTaskPage.clickCreateTaskButton());
        assertEquals("Error message does not match expected test after attempting to save with missing information.","Description is required. Product is required. Assigned To is required. Please select task impact.",addTaskPage.getErrorMessage());
    }


}
