package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.maintenance_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderPerformanceReport extends BasePage {

    private final By WORK_ORDER_PERFORMANCE_LINK = By.cssSelector("li[data-report-title='Work Order Performance'] a");

    public WorkOrderPerformanceReport(WebDriver driver) {
        super(driver);
    }
    public boolean workOrderPerformanceLinkClick() {
        return clickElement(WORK_ORDER_PERFORMANCE_LINK);
    }
}
