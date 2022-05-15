package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrdersSubTab extends BasePage {

    private final By UPDATE_STATUS_BTN_WORKORDERS_SUBTAB = By.xpath("//*[@id='service_work_orders_dashboard_table_data']/tbody/tr[1]/td[11]/a");
    private final By CLOSE_UPDATE_WORKORDERS_STATUS_POPUP = By.cssSelector("a[class='close']");

    public WorkOrdersSubTab(WebDriver driver) { super(driver); }

    public boolean clickUpdateStatusButtonInWorkOrdersSubTab() {
        return clickElement(UPDATE_STATUS_BTN_WORKORDERS_SUBTAB, waitTimes.LONG_WAIT);
    }

    public boolean closeUpdateWorkOrderStatusPage() {
        return clickElement(CLOSE_UPDATE_WORKORDERS_STATUS_POPUP);
    }



}
