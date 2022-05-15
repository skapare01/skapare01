package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RootCauseAnalysisNav extends BasePage {

    private final By URGENT_IMMEDIATE_TAB = By.id("urgent_vs_immediate");
    private final By KEY_CLIENT_TASK_TAB = By.id("key_client_task");
    private final By QA_VS_NONQA_TAB = By.id("nonqa_vs_qa");
    private final By PRIORITY_BUGS_TAB = By.id("priority_bug");
    private final By RESOLUTION_TIMELINE_TAB = By.id("resolution_timeline");
    private final By ROOT_CAUSE_COUNT_TAB = By.id("root_cause_count");
    private final By OUTAGE_REPORT_TAB = By.id("outage_report");
    private final By PRECAUTIONARY_MEAS_TAB = By.id("precautionary_measurement");
    private final By FOLLOW_UP_STATUS_TAB = By.id("follow_up_detail");
    private final By SYSTEM_UP_TIME_TAB = By.id("system_up_time");

    public RootCauseAnalysisNav(WebDriver driver){
        super(driver);
    }

    public boolean clickUrgentImmediateTab(){return clickElement(URGENT_IMMEDIATE_TAB);}
    public boolean clickKeyClientTab(){return clickElement(KEY_CLIENT_TASK_TAB);}
    public boolean clickQATAB(){return clickElement(QA_VS_NONQA_TAB);}
    public boolean clickPriorityBugsTab(){return clickElement(PRIORITY_BUGS_TAB);}
    public boolean clickResolutionTimelineTab(){return clickElement(RESOLUTION_TIMELINE_TAB);}
    public boolean clickRootCauseCountTab(){return clickElement(ROOT_CAUSE_COUNT_TAB);}
    public boolean clickOutageReportTab(){return clickElement(OUTAGE_REPORT_TAB);}
    public boolean clickPrecautionaryMeasTab(){return clickElement(PRECAUTIONARY_MEAS_TAB);}
    public boolean clickFollowUpStatusTab(){return clickElement(FOLLOW_UP_STATUS_TAB);}
    public boolean clickSystemUpTimeTab(){return clickElement(SYSTEM_UP_TIME_TAB);}
}
