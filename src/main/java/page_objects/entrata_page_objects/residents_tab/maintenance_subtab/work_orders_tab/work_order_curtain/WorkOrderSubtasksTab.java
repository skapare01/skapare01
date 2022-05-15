package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderSubtasksTab extends BasePage {

    private final By SUBTASKS_TAB = By.id("maintenance_request_sub_tasks_tab");
    private final By SUBTASKS_OVERVIEW = By.cssSelector("b[class='colorbox highlight-gray']");

    public WorkOrderSubtasksTab(WebDriver driver){ super(driver); }

    public boolean confirmSubtasksTabExists() { return confirmElementIsVisible(SUBTASKS_TAB); }

    public boolean clickSubtasksTab() { return clickElement(SUBTASKS_TAB); }

    public boolean confirmSubtasksOverviewExists() { return confirmElementIsVisible(SUBTASKS_OVERVIEW); }

}
