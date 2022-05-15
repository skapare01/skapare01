package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderHistoryTab extends BasePage {

    private final By HISTORY_SUBTAB = By.id("maintenance_request_history_tab");

    private final By HISTORY_ENTRIES = By.id("tab-7b");

    public WorkOrderHistoryTab(WebDriver driver){ super(driver); }

    public boolean clickHistorySubTab() { return clickElement(HISTORY_SUBTAB); }

    public boolean confirmHistorySubTabExists() { return confirmElementIsVisible(HISTORY_SUBTAB); }

    public boolean confirmHistoryEntriesExist() { return confirmElementIsVisible(HISTORY_ENTRIES); }

}
