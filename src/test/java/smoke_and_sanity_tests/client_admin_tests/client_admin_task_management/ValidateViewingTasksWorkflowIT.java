package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab.AddTask;
import page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab.OpenedTask;
import page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab.ViewTasks;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class ValidateViewingTasksWorkflowIT extends BaseBrowserTest {

    public ValidateViewingTasksWorkflowIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void verify_Tasks_Are_Viewable_When_Navigating_View_Tasks_Screen() {
        //Test case 2224360

        //Navigate to Tasks
        ClientAdminNavBar clientAdmin_navBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to click the Task tab in Client Admin.", clientAdmin_navBar.clickTasksMenu());

        //Confirm the View Tasks Page loaded properly.
        ViewTasks view_tasks = new ViewTasks(driver);
        assertTrue("Change Task Status top menu dropdown is not visible. View Tasks page did not load properly.", view_tasks.confirmChangeTaskStatusTopIsVisible());
        assertTrue("Export to XLS is not visible. View Tasks page did not load properly.", view_tasks.confirmExportToXLSIsVisible());
        assertTrue("The task list is not visible. View Tasks page did not load properly.", view_tasks.confirmSearchedTasksResultsIsVisible());

        //Click first Task ID in Searched Task Results.
        assertTrue("Unable to click on first task ID in searched task results.", view_tasks.clickFirstTaskIdInSearchedTasks());
        assertTrue("Unable to switch to newly opened tab from clicking Task ID.", view_tasks.switchToRecentlyOpenedTab());
        OpenedTask opened_task = new OpenedTask(driver);
        assertTrue("Unable to find the Task Title ID. The Task did not open properly from the Task ID.", opened_task.confirmTaskTitleIsVisible());
        assertTrue("Unable to close current tab and return to first tab.", view_tasks.closeSecondTabAndReturnToPrimaryTab());

        //Click on first Task Title in Searched Task Results.
        assertTrue("Unable to click on first Task Title in searched task results.", view_tasks.clickFirstTaskTitleInSearchedTasks());
        assertTrue("Unable to switch to newly opened tab from clicking Task Title.", view_tasks.switchToRecentlyOpenedTab());
        assertTrue("Unable to find the Task Title ID. The task did not open properly from the Task Title.", opened_task.confirmTaskTitleIsVisible());
        assertTrue("Unable to close current tab and return to the first tab.(2)", view_tasks.closeSecondTabAndReturnToPrimaryTab());

        //Click on the Add Task button and confirm the page loads correctly.
        assertTrue("Unable to click the 'Add Task' button.", view_tasks.clickAddTaskButton());
        assertTrue("Unable to switch to newly opened tab from clicking the Add Task button.", view_tasks.switchToRecentlyOpenedTab());
        AddTask add_task = new AddTask(driver);
        assertTrue("The Add Task page did not load properly.", add_task.confirmCreateTaskIdIsVisible());
        assertTrue("Unable to close the Add Task page and retrun to View Tasks Page.", view_tasks.closeSecondTabAndReturnToPrimaryTab());

        //Search key word and apply filters
        assertTrue("Unable to type in the Keywords filter option.", view_tasks.enterGenericTextIntoKeywords());
        assertTrue("Unable to press enter in the Keywords filter option.", view_tasks.pressEnterInKeywordsFilter());
        assertTrue("Unable to find expected search result of Keywords filter option.", view_tasks.confirmKeywordSearchResult());

        //Search task in quick search
        assertTrue("Unable to enter Generic Task Id into Quick Search", view_tasks.searchGenericTaskID());
        assertTrue("Unable to click Quick Search Result.", view_tasks.clickQuickSearchTopResult());
        assertTrue("Unable to switch to newly opened tab from clicking the Quick Search result.", view_tasks.switchToRecentlyOpenedTab());
        assertTrue("Unable to find the Task Title ID from the Quick Search Result Task.", opened_task.confirmTaskTitleIsVisible());
        assertTrue("Unable to close the Quick Search Result Task page and return to view tasks.", view_tasks.closeSecondTabAndReturnToPrimaryTab());

    }

}