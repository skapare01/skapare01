package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugDashboardNav extends BasePage {

    private final By BUGS_PER_RELEASE_TAB = By.id("bugs_per_release");
    private final By FIRES_PER_RELEASE_TAB = By.id("fires_per_release");
    private final By BUGS_BY_PRODUCT_TAB = By.id("bugs_by_product");
    private final By BUGS_BY_EMPLOYEE_TAB = By.id("bugs_by_employee");
    private final By BUGS_BY_SDM_TAB = By.id("bugs_by_pdm");
    private final By BUGS_BY_PRIORITY_TAB = By.id("bugs_by_priority");
    private final By BUGS_BY_STATUS_TAB = By.id("bugs_by_status");
    private final By PRIORITY_PER_RELEASE_TAB = By.id("priority_per_release");
    private final By PRODUCT_BUGS_VS_FEATURES_TAB = By.id("bugs_vs_features_product_per_release");
    private final By SUMMARIZED_BUGS_REPORT_TAB = By.id("summarize_bugs_report");
    private final By TASKS_BY_PRODUCT_STATUS_TAB = By.id("bugs_by_product_&_status");
    private final By OPEN_BUG_COUNT_BY_MONTH_TAB = By.id("open_bug_count");

    public BugDashboardNav(WebDriver driver){
        super(driver);}

    public boolean clickBugsPerReleaseTab(){return clickElement(BUGS_PER_RELEASE_TAB);}
    public boolean clickFiresPerReleaseTab(){return clickElement(FIRES_PER_RELEASE_TAB);}
    public boolean clickBugsByProductTab(){return clickElement(BUGS_BY_PRODUCT_TAB);}
    public boolean clickBugsByEmployeeTab(){return clickElement(BUGS_BY_EMPLOYEE_TAB);}
    public boolean clickBugsBySDMTab(){return clickElement(BUGS_BY_SDM_TAB);}
    public boolean clickBugsByPriorityTab(){return clickElement(BUGS_BY_PRIORITY_TAB);}
    public boolean clickPriorityPerReleaseTab(){return clickElement(PRIORITY_PER_RELEASE_TAB);}
    public boolean clickBugsByStatusTab(){return clickElement(BUGS_BY_STATUS_TAB);}
    public boolean clickProductBugsTab(){return clickElement(PRODUCT_BUGS_VS_FEATURES_TAB);}
    public boolean clickSummarizedBugsReportTab(){return clickElement(SUMMARIZED_BUGS_REPORT_TAB);}
    public boolean clickTasksByProductStatusTab(){return clickElement(TASKS_BY_PRODUCT_STATUS_TAB);}
    public boolean clickOpenBugCountByMonthTab(){ maximizeWindow();
            return clickElement(OPEN_BUG_COUNT_BY_MONTH_TAB);}

}
