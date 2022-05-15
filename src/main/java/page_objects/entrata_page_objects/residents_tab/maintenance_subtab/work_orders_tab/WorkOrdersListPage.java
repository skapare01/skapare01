package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrdersListPage extends BasePage {

    private final By FIRST_CLICKABLE_WORK_ORDER = By.xpath("//*[@id='property-1']/tr[2]");
    private final By UPDATE_STATUS_DROP_DOWN_ARROW = By.cssSelector("a[class='button action menu nomargin  binded binded-hover-intent']");
    private final By AWAITING_PARTS_UPDATE_STATUS_DROP_DOWN = By.xpath("//li[contains(text(),'Awaiting Parts')]");
    private final By WORK_ORDER_STATUS = By.xpath("//*[@id='maintenance_status_types_actions']/div[1]/h4");
    private final By FILTER_STATUS_CHANGE_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By ALERT_WORK_ORDER_POP_UP = By.id("hazard_note_modal");
    private final By ACKNOWLEDGE_BUTTON_ALERT_POP_UP = By.cssSelector("input[value='Acknowledge']");

    public WorkOrdersListPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickFirstWorkOrder() {waitForWorkOrderLoadingOverlay();
        return clickElement(FIRST_CLICKABLE_WORK_ORDER, waitTimes.LONG_WAIT);
    }

    private void waitForWorkOrderLoadingOverlay() { waitForOverlay(FILTER_STATUS_CHANGE_OVERLAY, waitTimes.UNREASONABLE_WAIT); }

    public boolean clickUpdateStatusDropDown() {
        acknowledgeAlertWorkOrderPopUp();
        return clickElement(UPDATE_STATUS_DROP_DOWN_ARROW, waitTimes.LONG_WAIT);
    }

    public boolean clickAwaitingPartsFromUpdatedStatusDropDown() { return clickElement(AWAITING_PARTS_UPDATE_STATUS_DROP_DOWN, waitTimes.LONG_WAIT); }

    public String confirmWorkOrderStatusHasBeenUpdated() { return getElementText(WORK_ORDER_STATUS, waitTimes.LONG_WAIT); }

    private void acknowledgeAlertWorkOrderPopUp() {
        if(confirmElementIsVisible(ALERT_WORK_ORDER_POP_UP)) {
            clickElement(ACKNOWLEDGE_BUTTON_ALERT_POP_UP);
            System.out.println("Successfully found hazard pop up form and clicked the 'Acknowledge' button.");
        }
        System.out.println("No hazard form was found. Moving on with test.");
    }

    private void waitForStatusChangeOverlay() {
        waitForOverlay(FILTER_STATUS_CHANGE_OVERLAY, waitTimes.LONG_WAIT);
    }
}
