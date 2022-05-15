package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddWorkOrderCurtain extends BasePage {

    private final By CREATE_WORK_ORDER_BUTTON = By.cssSelector("a[onclick*='createNewWorkOrder'");

    private final By NEW_WORK_ORDER_MODAL = By.id("add_edit_maintenance_request");

    public AddWorkOrderCurtain(WebDriver driver) { super(driver); }

    public boolean clickCreateWorkOrderButton() { return clickElement(CREATE_WORK_ORDER_BUTTON); }

    public boolean confirmNewWorkOrderModalExists() { return confirmElementIsVisible(NEW_WORK_ORDER_MODAL); }

}
