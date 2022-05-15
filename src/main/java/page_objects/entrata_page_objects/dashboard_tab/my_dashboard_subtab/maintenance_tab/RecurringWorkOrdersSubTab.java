package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RecurringWorkOrdersSubTab extends BasePage {

    private final By UPDATE_RECURRING_WORKORDERS_STATUS_BTN = By.xpath("//*[@id='recurring_work_orders_dashboard_table_data']/tbody/tr[1]/td[11]/a");
    private final By CANCEL_UPDATE_RECURRING_WORKORDERS_STATUS_BTN = By.cssSelector("a[class='close']");

    public RecurringWorkOrdersSubTab(WebDriver driver) { super(driver); }

    public boolean clickUpdateStatusButtonInRecurringWorkOrdersTab() {
        return clickElement(UPDATE_RECURRING_WORKORDERS_STATUS_BTN);
    }

    public boolean cancelUpdateStatusOnRecurringWorkOrdersPopUp() {
        return clickElement(CANCEL_UPDATE_RECURRING_WORKORDERS_STATUS_BTN);
    }

}
