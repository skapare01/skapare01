package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderProblemTab extends BasePage {

    private final By PROBLEM_SUBTAB = By.cssSelector("a[class='req'][onclick*='loadMaintenanceRequestTab'");
    private final By PROBLEM_DETAILS_BOX = By.id("maintenance_request_system_container");
    private final By RECURRING_WORK_ORDER_BOX = By.cssSelector("a[class='nohref binded-nohref-click']");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By HAZARD_NOTE_MODAL = By.id("hazard_note_modal");
    private final By ACKNOWLEDGE_BUTTON = By.cssSelector("input[class*='form-submit cancel-modal blue acknowledge']");

    public WorkOrderProblemTab(WebDriver driver){ super(driver); }

    public boolean clickCloseButton() { return clickElement(CLOSE_BUTTON); }

    public String confirmWorkOrderTypeIsRecurring() { return getElementText(RECURRING_WORK_ORDER_BOX); }

    public boolean clickProblemSubTab() { hazardAlertPopUp(); return clickElement(PROBLEM_SUBTAB); }

    public boolean confirmProblemSubTabExists() { return confirmElementIsVisible(PROBLEM_SUBTAB); }

    public boolean confirmProblemDetailsBoxExists() { return confirmElementIsVisible(PROBLEM_DETAILS_BOX); }

    private void hazardAlertPopUp() {
        try {
            if (confirmElementIsVisible(HAZARD_NOTE_MODAL)) {
                clickElement(ACKNOWLEDGE_BUTTON);
                System.out.println("Clicked acknowledge button on the hazard pop up. Continuing to test.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
