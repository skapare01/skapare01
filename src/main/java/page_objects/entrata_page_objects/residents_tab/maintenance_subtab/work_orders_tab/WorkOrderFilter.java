package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderFilter extends BasePage {

    private final By WORK_ORDERS_SIDE_PANEL_FILTER = By.id("open-filter-by-default");
    private final By CREATE_WORK_ORDER_FROM_FILTER = By.cssSelector("a[onclick*='createNewWorkOrder']");
    private final By SERVICE_REQUESTS_FILTER_TYPE = By.id("maintenance_request_types_2");
    private final By MAINTENANCE_REQUEST_TYPES_LIST = By.id("maintenance_request_types_list");
    private final By FILTER_MAINTENANCE = By.cssSelector("a[class*='button action first green text-white bold font14 generate-report submit-filter']");
    private final By RECURRING_WORK_ORDER_TYPE = By.id("maintenance_request_types_3");
    private final By SEARCH_TYPE_RESIDENT_OPTION = By.cssSelector("li[val='resident']");
    private final By UNIT_STATUS_DROP_DOWN = By.id("unit_status_types_list");
    private final By ADVANCED_FILTERS_BUTTON = By.cssSelector("div[class='link view-data-adv-search margin0-top js-view-data-adv-search']");
    private final By UNIT_STATUS_DROP_DOWN_UNITS_ON_NOTICE_OPTION = By.id("unit_status_types_9");

    public WorkOrderFilter(WebDriver driver) { super(driver); }

    public boolean clickUnitsOnNoticeDropDown() { return clickElement(UNIT_STATUS_DROP_DOWN_UNITS_ON_NOTICE_OPTION); }

    public boolean clickAdvancedFiltersButton() { return clickElement(ADVANCED_FILTERS_BUTTON); }

    public boolean clickUnitStatusDropDown() { return clickElement(UNIT_STATUS_DROP_DOWN); }

    public boolean clickResidentSearchTypeInTheWorkOrderFilter() { return clickElement(SEARCH_TYPE_RESIDENT_OPTION); }

    public boolean clickServiceRequestsFilterType() { return clickElement(SERVICE_REQUESTS_FILTER_TYPE); }

    public boolean clickWorkOrderFilterBtn() { return clickElement(WORK_ORDERS_SIDE_PANEL_FILTER); }

    public boolean confirmWorkOrdersTabIsSelected() { return confirmElementIsVisible(CREATE_WORK_ORDER_FROM_FILTER); }

    public boolean clickMaintenanceRequestTypesList() { return clickElement(MAINTENANCE_REQUEST_TYPES_LIST); }

    public boolean clickFilterMaintenance() { return clickElement(FILTER_MAINTENANCE); }

    public boolean clickRecurringWorkOrderType() { return clickElement(RECURRING_WORK_ORDER_TYPE); }

}
