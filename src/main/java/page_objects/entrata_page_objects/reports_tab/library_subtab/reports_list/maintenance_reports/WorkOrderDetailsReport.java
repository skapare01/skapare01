package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.maintenance_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderDetailsReport extends BasePage {

    private final By WORK_ORDER_DETAIL_LINK = By.cssSelector("li[data-report-title='Work Order Details'] a");

    public WorkOrderDetailsReport(WebDriver driver) {
        super(driver);
    }
    public boolean workOrderDetailsLinkClick() {
        return clickElement(WORK_ORDER_DETAIL_LINK);
    }
}
