package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderChargesTab extends BasePage {

    private final By CHARGES_SUBTAB = By.id("maintenance_request_charges_tab");

    private final By CHARGES_OVERVIEW = By.id("charges");

    public WorkOrderChargesTab(WebDriver driver){ super(driver); }

    public boolean clickChargesSubTab() { return clickElement(CHARGES_SUBTAB); }

    public boolean confirmChargesSubTabExists() { return confirmElementIsVisible(CHARGES_SUBTAB); }

    public boolean confirmChargesOverviewExists() { return confirmElementIsVisible(CHARGES_OVERVIEW); }

}
