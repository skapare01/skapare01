package page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderForm extends BasePage {
    private final By WORK_ORDER_DETAILS = By.cssSelector("div[id='left-body-form-container-div'] [class='form-container-head']");
    private final By RESIDENT_INFO_TAB = By.cssSelector("li[class='js-basic-info-tab selected']");
    private final By ADD_WORK_ORDER_TAB = By.className("js-new-wo-1-tab");
    private final By EDIT_EXISTING_WORK_ORDER_TAB = By.className("js-edit-wo-1-tab");
    private final By ADDITIONAL_INFO_TAB = By.className("js-add-wo-1-tab");
    private final By WORK_ORDER_TAB_DROPDOWN = By.xpath("//div//option[text()='Work Order']");
    private final By PROPERTY_DETAILS_IN_WORK_ORDER_TAB = By.cssSelector("div[id='b-scroller'] [class='flex flex-between-pkg margin30-bottom']");
    private final By MAINTENANCE_AND_EMERGENCY_PROTOCOL = By.xpath("//*[@class=\"maintenance-contacts level1 open\"]/div/i");
    private final By WORK_ORDER_HISTORY = By.id("maintenance-requests-history");
    private final By CALL_HISTORY = By.id("call-history");

    public WorkOrderForm(WebDriver driver) {
        super(driver);
    }

    public boolean findWorkOrderDetails() { return confirmElementIsVisible(WORK_ORDER_DETAILS);}

    public boolean clickWorkOrderTabDropdown() { return clickElement(WORK_ORDER_TAB_DROPDOWN); }

    public boolean findResidentInfoTab() { return confirmElementIsVisible(RESIDENT_INFO_TAB); }

    public boolean findAddWorkOrderTab() { return confirmElementIsVisible(ADD_WORK_ORDER_TAB); }

    public boolean findEditExistingWorkOrderTab() { return confirmElementIsVisible(EDIT_EXISTING_WORK_ORDER_TAB); }

    public boolean findAdditionalInfoTab() { return confirmElementIsVisible(ADDITIONAL_INFO_TAB); }

    public boolean findPropertyDetailsInWorkOrderTab() { return confirmElementIsVisible(PROPERTY_DETAILS_IN_WORK_ORDER_TAB);}

    public boolean findMaintenanceAndEmergencyProtocol() { return confirmElementIsVisible(MAINTENANCE_AND_EMERGENCY_PROTOCOL);}

    public boolean findWorkOrderHistory() { return confirmElementIsVisible(WORK_ORDER_HISTORY);}

    public boolean findCallHistory() { return confirmElementIsVisible(CALL_HISTORY);}
}
