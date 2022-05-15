package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderExpensesTab extends BasePage {

    private final By EXPENSES_SUBTAB = By.id("maintenance_request_expenses_tab");
    private final By LABOR_OVERVIEW = By.id("labor");
    private final By LABOR_SUBTAB = By.id("maintenance_request_labor_tab");
    private final By MATERIALS_SUBTAB = By.id("maintenance_request_material_tab");
    private final By MILEAGE_SUBTAB = By.id("maintenance_request_mileage_tab");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public WorkOrderExpensesTab(WebDriver driver) {
        super(driver);
    }

    public boolean clickExpensesSubTab() {
        return clickElement(EXPENSES_SUBTAB);
    }

    public boolean confirmExpensesSubTabExists() {
        return confirmElementIsVisible(EXPENSES_SUBTAB);
    }

    public boolean confirmLaborOverviewExists() {
        return confirmElementIsVisible(LABOR_OVERVIEW);
    }

    public boolean confirmLaborSubTabExists() {
        waitForOverlayAfterClickingExpensesSubTab();
        return confirmElementIsVisible(LABOR_SUBTAB);
    }

    public boolean confirmMaterialsSubTabExists() {
        return confirmElementIsVisible(MATERIALS_SUBTAB);
    }

    public boolean confirmMileageSubTabExists() {
        return confirmElementIsVisible(MILEAGE_SUBTAB);
    }

    private void waitForOverlayAfterClickingExpensesSubTab() {
        waitForOverlay(LOADING_OVERLAY);
    }

}
