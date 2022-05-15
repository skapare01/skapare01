package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderCurtain extends BasePage {

    private final By WORK_ORDER_SUBTABS_GROUP = By.id("modal_body");

    public WorkOrderCurtain(WebDriver driver) { super(driver); }

    public boolean confirmWorkOrderSubtabsAppear() { return confirmElementIsVisible(WORK_ORDER_SUBTABS_GROUP); }

}
