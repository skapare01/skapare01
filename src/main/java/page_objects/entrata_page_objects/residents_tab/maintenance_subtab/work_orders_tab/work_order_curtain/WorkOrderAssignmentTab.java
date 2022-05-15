package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderAssignmentTab extends BasePage {

    private final By ASSIGNMENT_SUBTAB = By.id("maintenance_request_assignment_tab");

    private final By ASSIGNMENT_OVERVIEW_BOX = By.cssSelector("b[class='colorbox highlight-gray']");

    public WorkOrderAssignmentTab(WebDriver driver){ super(driver); }

    public boolean clickAssignmentSubTab() { return clickElement(ASSIGNMENT_SUBTAB); }

    public boolean confirmAssignmentSubTabExists() { return confirmElementIsVisible(ASSIGNMENT_SUBTAB); }

    public boolean confirmAssignmentOverviewBoxExists() { return confirmElementIsVisible(ASSIGNMENT_OVERVIEW_BOX); }

}
