package page_objects.client_admin_page_objects.tasks_tab.sprint_summary_report_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SprintSummaryReport extends BasePage {

    public SprintSummaryReport(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By OVERVIEW_TAB = By.id("overview_tab");
    private final By TASK_LIST = By.id("task_list_tab");
    private final By RELEASE_REPORT_TAB = By.id("release_report_tab");
    private final By OVERVIEW_TABLE = By.id("div_sprint_summary_reports_container");
    private final By TASK_LIST_TABLE = By.id("task_list_tab10");
    private final By RELEASE_REPORT = By.id("release_report");

    //Methods
    public boolean openOverviewTab() {
        return clickElement(OVERVIEW_TAB);
    }

    public boolean openTaskList() {
        return clickElement(TASK_LIST);
    }

    public boolean openReleaseReportTab() {
        return clickElement(RELEASE_REPORT_TAB);
    }

    public boolean confirmOverviewTableLoadedProperly() {
        return confirmElementIsVisible(OVERVIEW_TABLE);
    }

    public boolean confirmTaskListLoadedProperly() {
        return confirmElementIsVisible(TASK_LIST_TABLE, waitTimes.LONG_WAIT);
    }

    public boolean confirmReleaseReportLoadedProperly() {
        return confirmElementIsVisible(RELEASE_REPORT);
    }

}