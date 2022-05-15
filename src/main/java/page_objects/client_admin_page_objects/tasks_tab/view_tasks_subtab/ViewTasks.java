package page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ViewTasks extends BasePage {

    public ViewTasks(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CHANGE_TASK_STATUS_TOP_DROPDOWN = By.id("change_task_status");
    private final By EXPORT_TO_XLS = By.cssSelector("#task_container > div.view-data-table-header > div > div.table-controls > h2 > a");
    private final By SEARCHED_TASKS_RESULT = By.id("view_tasks");
    private final By FIRST_TASK_ID_IN_SEARCHED_TASKS_RESULTS = By.cssSelector("td:nth-child(3) > a");
    private final By FIRST_TASK_TITLE_IN_SEARCHED_TASKS_RESULTS = By.cssSelector("td:nth-child(4) > a");
    private final By ADD_TASK_BUTTON = By.cssSelector("#task_filter_form > a");
    private final By KEYWORDS_FILTER = By.id("taskTitle");
    private final String KEYWORD_BRIAN = "brian";
    private final By KEYWORD_BRIAN_SEARCH_RESULT_ID = By.id("custom_task_row_id_1770615");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By TASK_QUICK_SEARCH = By.id("tasks_quick_search");
    private final String GENERIC_TASK_TO_SEARCHED = "1234564";
    private final By QUICK_SEARCH_TOP_RESULT = By.xpath("//*[@id=\"tasks_quick_search_searchData\"]/div/table/tbody/tr[2]");

    //Methods
    public boolean confirmChangeTaskStatusTopIsVisible() {
        return confirmElementIsVisible(CHANGE_TASK_STATUS_TOP_DROPDOWN);
    }

    public boolean confirmExportToXLSIsVisible() {
        return confirmElementIsVisible(EXPORT_TO_XLS);
    }

    public boolean confirmSearchedTasksResultsIsVisible() {
        return confirmElementIsVisible(SEARCHED_TASKS_RESULT);
    }

    public boolean clickFirstTaskIdInSearchedTasks() {
        return clickElement(FIRST_TASK_ID_IN_SEARCHED_TASKS_RESULTS);
    }

    public boolean clickFirstTaskTitleInSearchedTasks() {
        return clickElement(FIRST_TASK_TITLE_IN_SEARCHED_TASKS_RESULTS);
    }

    public boolean clickAddTaskButton() {
        return clickElement(ADD_TASK_BUTTON);
    }

    public boolean enterGenericTextIntoKeywords() {
        return sendKeysToElement(KEYWORDS_FILTER, KEYWORD_BRIAN);
    }

    public boolean pressEnterInKeywordsFilter() {
        return pressEnter(KEYWORDS_FILTER);
    }

    public boolean confirmKeywordSearchResult() {
        waitForOverlay(LOADING_OVERLAY);
        return confirmElementIsVisible(KEYWORD_BRIAN_SEARCH_RESULT_ID);
    }

    public boolean searchGenericTaskID() {
        return sendKeysToElement(TASK_QUICK_SEARCH, GENERIC_TASK_TO_SEARCHED);
    }

    public boolean clickQuickSearchTopResult() {
        return clickElement(QUICK_SEARCH_TOP_RESULT);
    }

}