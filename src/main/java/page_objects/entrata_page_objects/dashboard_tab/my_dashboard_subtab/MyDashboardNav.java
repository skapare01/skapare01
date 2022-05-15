package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MyDashboardNav extends BasePage {

    //Constructor
    public MyDashboardNav(WebDriver driver) {
        super(driver);
    }

    //Top My Dashboard Tabs
    private final By APPROVALS_TAB = By.id("dashboard_approvalsxxx");
    private final By LEADS_TAB = By.id("dashboard_leadsxxx");
    private final By APPLICANTS_TAB = By.id("dashboard_applicantsxxx");
    private final By RESIDENTS_TAB = By.id("dashboard_residentsxxx");
    private final By RESIDENT_PORTAL_TAB = By.id("dashboard_resident_portalxxx");
    private final By MAINTENANCE_TAB = By.id("dashboard_maintenancexxx");
    private final By FINANCIAL_TAB = By.id("dashboard_financialxxx");
    private final By HELP_TAB = By.id("dashboard_supportxxx");

    //Approvals Sub-tabs

    //Leads Sub-tabs

    //Applicants Sub-tabs

    //Residents Sub-tabs
    private final By RECERTIFICATION_NOTICES_TAB = By.id("dashboard_residents_recertification_noticesxxx");
    private final By CONTACT_NEEDED_SUB_TAB = By.id("dashboard_residents_follow_upxxx");
    private final By NOT_PROGRESSING_SUB_TAB = By.id("dashboard_residents_not_progressingxxx");
    private final By MOVE_IN_REVIEWS_SUB_TAB = By.id("dashboard_residents_movein_reviewsxxx");
    private final By MOVE_INS_SUB_TAB = By.id("dashboard_residents_move_insxxx");
    private final By EVICTIONS_SUB_TAB = By.id("dashboard_residents_evictionsxxx");
    private final By MOVE_OUTS_SUB_TAB = By.id("dashboard_residents_move_outsxxx");
    private final By RENEWALS_SUB_TAB = By.id("dashboard_residents_renewalsxxx");
    private final By TRANSFERS_SUB_TAB = By.id("dashboard_residents_transfersxxx");
    private final By EXTENSIONS_SUB_TAB = By.id("dashboard_residents_extensionsxxx");
    private final By RENTABLE_ITEM_SUB_TAB = By.id("dashboard_residents_rentable_itemsxxx");
    private final By INSURANCE_SUB_TAB = By.id("dashboard_residents_insurancexxx");
    private final By REVIEWS_SUB_TAB = By.id("dashboard_residents_reviewsxxx");
    private final By POSTING_TOOL_SUB_TAB = By.id("dashboard_residents_posting_toolxxx");
    private final By VEHICLES_SUB_TAB = By.id("dashboard_residents_vehiclesxxx");
    private final By CORPORATE_COMPLAINTS_SUB_TAB = By.id("dashboard_residents_corporate_complaintsxxx");
    private final By VIOLATIONS_SUB_TAB = By.id("dashboard_residents_violationsxxx");
    private final By HAZARDS_SUB_TAB = By.id("dashboard_residents_hazardsxxx");
    private final By ACCOMMODATIONS_SUB_TAB = By.id("dashboard_residents_accommodationsxxx");

    //Resident Portal Sub-tabs

    //Maintenance Sub-tabs
    private final By WORK_ORDERS_SUB_TAB = By.id("dashboard_maintenance_work_ordersxxx");
    private final By RECURRING_WORKORDERS_TAB = By.id("dashboard_maintenance_recurring_work_ordersxxx");
    private final By INSPECTIONS = By.id("dashboard_maintenance_inspectionsxxx");

    //Financial Sub-tabs
    private final By NOTICES_SUB_TAB = By.id("dashboard_financial_noticesxxx");

    //Help Sub-tabs

    // Left Pane Variables
    private final By PURCHASE_REQUEST = By.xpath("//*[text()='Purchase Request']");

    //Right Pane Variables
    private final By MY_INTEGRATED_CALENDAR = By.cssSelector("li[class='link integrated-calendar']");
    private final By MAKE_RESIDENT_PAYMENT = By.cssSelector("li[class='link'][onclick*='Add Payment']");
    private final By CREATE_LEAD = By.cssSelector("li[class='link'][onclick*='Create Lead']");
    private final By CALCULATE_FIRST_MONTH_CHARGES = By.cssSelector("li[class='link'][onclick*='Calculate First Month Charges']");
    private final By CREATE_WORK_ORDER = By.id("create-new-work-order-from-dashboard");
    private final By CREATE_INVOICE = By.cssSelector("li[class='link'][onclick*='Add Invoice']");
    private final By CLOSE_PERIOD = By.id("liClosePeriod");
    private final By ADVANCED_PERIOD = By.id("liAdvancePeriod");
    private final By MAKE_READY_BOARD = By.id("liMakeReadyBoard");
    private final By CREATE_NEW_MESSAGE = By.cssSelector("li[data-content-id = 'create_or_edit_notification']");
    private final By MANAGE_MESSAGES = By.cssSelector("li[data-content-id = 'manage_notifications']");

    //Right Pane Calendar Variables
    private final By ENTRATA_CALENDAR_TAB = By.xpath("//*[@id=\"side-tabs\"]/ul/li[2]");
    private final By FULL_CALENDAR_BTN = By.id("view-full-calendar");

    //Right Pane Property Filter Variables
    private final By DASHBOARD_PROPERTY_FILTER = By.cssSelector("li[title='Filter']");
    private final By DASHBOARD_FILTER_REMOVE_PROPERTIES = By.cssSelector("i[title='Remove']");
    private final By DASHBOARD_FILTER_ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By DASHBOARD_FILTER_PROPERTY_LIST_DROPDOWN = By.cssSelector("span[class='header property-group-record js-all-properties binded binded2']");
    private final By DASHBOARD_FILTER_ADD_SPECIFIC_PROPERTY_VILLAGE_BEND = By.xpath("//li[3]//label//span[text()='The Village Bend']");
    private final By DASHBOARD_FILTER_SUBMIT_FILTER_BUTTON = By.cssSelector("input[value='Filter']");
    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    //METHODS

    //Approvals Tab Methods
    public boolean approvalsTabIsVisible() { return confirmElementIsVisible(APPROVALS_TAB);}

    //Leads Tab Methods
    public boolean clickLeadsTab() {
        return clickElement(LEADS_TAB);
    }
    public boolean leadsTabIsVisible() { return confirmElementIsVisible(LEADS_TAB);}

    //Applicants Tab Methods
    public boolean applicantsTabIsVisible() { return confirmElementIsVisible(APPLICANTS_TAB);}

    //Residents Tab Methods
    public boolean clickResidentsTab() {
        return clickElement(RESIDENTS_TAB);
    }
    public boolean residentsTabIsVisible()  {
        return clickElement(RESIDENTS_TAB);
    }
    public boolean clickRecertificationNotices() {
        return clickElement(RECERTIFICATION_NOTICES_TAB);
    }
    public boolean contactNeededSubTab() {
        return confirmElementIsVisible(CONTACT_NEEDED_SUB_TAB);
    }
    public boolean notProgressingSubTab() {
        return confirmElementIsVisible(NOT_PROGRESSING_SUB_TAB);
    }
    public boolean clickResidentsNotProgressingSubTab() {waitForPotentialOverlayMyDashboardNavigation(); return clickElement(NOT_PROGRESSING_SUB_TAB); }
    public boolean moveInReviewsSubTab() {
        return confirmElementIsVisible(MOVE_IN_REVIEWS_SUB_TAB);
    }
    public boolean moveInsSubTab() {
        return confirmElementIsVisible(MOVE_INS_SUB_TAB);
    }
    public boolean evictionsSubTab() {
        return confirmElementIsVisible(EVICTIONS_SUB_TAB);
    }
    public boolean moveOutsSubTab() {
        return confirmElementIsVisible(MOVE_OUTS_SUB_TAB);
    }
    public boolean renewalsSubTab() {
        return confirmElementIsVisible(RENEWALS_SUB_TAB);
    }
    public boolean renewalsSubTabClick() {
        return clickElement(RENEWALS_SUB_TAB);
    }
    public boolean transfersSubTab() {
        return confirmElementIsVisible(TRANSFERS_SUB_TAB);
    }
    public boolean extensionsSubTab() {
        return confirmElementIsVisible(EXTENSIONS_SUB_TAB);
    }
    public boolean rentableItemsSubTab() {
        return confirmElementIsVisible(RENTABLE_ITEM_SUB_TAB);
    }
    public boolean residentReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_SUB_TAB);
    }
    public boolean postingToolSubTab() {
        return confirmElementIsVisible(POSTING_TOOL_SUB_TAB);
    }
    public boolean vehiclesSubTab() {
        return confirmElementIsVisible(VEHICLES_SUB_TAB);
    }
    public boolean escalationsSubTab() {
        return confirmElementIsVisible(CORPORATE_COMPLAINTS_SUB_TAB);
    }
    public boolean violationsSubTab() {
        return confirmElementIsVisible(VIOLATIONS_SUB_TAB);
    }
    public boolean hazardsSubTab() {
        return confirmElementIsVisible(HAZARDS_SUB_TAB);
    }
    public boolean accommodationsSubTab() {
        return confirmElementIsVisible(ACCOMMODATIONS_SUB_TAB);
    }
    public boolean clickInsuranceTab() { return clickElement(INSURANCE_SUB_TAB); }

    //Resident Portal Tab Methods
    public boolean resPortalTabIsVisible() { return confirmElementIsVisible(RESIDENT_PORTAL_TAB);}

    //Maintenance Tab Methods
    public boolean clickMaintenanceTab() {
        return clickElement(MAINTENANCE_TAB);
    }
    public boolean clickWorkOrdersSubTab() { return clickElement(WORK_ORDERS_SUB_TAB); }
    public boolean clickRecurringWorkOrdersSubTab() { return clickElement(RECURRING_WORKORDERS_TAB); }
    public boolean maintenanceTabIsVisible() { return confirmElementIsVisible(MAINTENANCE_TAB); }
    public boolean clickInspectionsSubTab() { return clickElement(INSPECTIONS); }

    //Financial Tab Methods
    public boolean clickFinancialTab() {
        return clickElement(FINANCIAL_TAB);
    }
    public boolean financialTabIsVisible() { return confirmElementIsVisible(FINANCIAL_TAB);}
    public boolean noticesSubTabClick() {
        return clickElement(NOTICES_SUB_TAB);
    }

    //Help Tab Methods
    public boolean clickHelpTab() {
        return clickElement(HELP_TAB);
    }
    public boolean helpTabIsVisible() { return confirmElementIsVisible(HELP_TAB);}

    // Left Pane Methods
    public boolean clickPurchaseRequestSideBarTab() {
        return clickElement(PURCHASE_REQUEST, waitTimes.LONG_WAIT);
    }

    //Right Pane Methods
    public boolean myIntegratedCalendarIsVisible() { return confirmElementIsVisible(MY_INTEGRATED_CALENDAR);}
    public boolean makeResidentPaymentIsVisible() { return confirmElementIsVisible(MAKE_RESIDENT_PAYMENT);}
    public boolean createLeadIsVisible() { return confirmElementIsVisible(CREATE_LEAD);}
    public boolean calculateFirstMonthChargesIsVisible() { return confirmElementIsVisible(CALCULATE_FIRST_MONTH_CHARGES);}
    public boolean createWorkOrderIsVisible() { return confirmElementIsVisible(CREATE_WORK_ORDER);}
    public boolean createInvoiceIsVisible() { return confirmElementIsVisible(CREATE_INVOICE);}
    public boolean closePeriodIsVisible() { return confirmElementIsVisible(CLOSE_PERIOD);}
    public boolean advancedPeriodIsVisible() { return confirmElementIsVisible(ADVANCED_PERIOD);}
    public boolean makeReadyBoardIsVisible() {return confirmElementIsVisible(MAKE_READY_BOARD);}
    public boolean clickOnMakeResidentPayment() { return clickElement(MAKE_RESIDENT_PAYMENT);}
    public boolean clickCreateNewMessage(){
        scrollDownToBottomOfPage();
        return clickElement(CREATE_NEW_MESSAGE);}
    public boolean clickManageMessages(){
        scrollDownToBottomOfPage();
        return clickElement(MANAGE_MESSAGES);}

    //Right Pane Calendar Variables
    public boolean clickEntrataCalendarTab() {
        return clickElement(ENTRATA_CALENDAR_TAB);
    }
    public boolean clickFullCalendarBtn() {
        return clickElement(FULL_CALENDAR_BTN);
    }

    //Right Pane Property Filter Methods
    public boolean dashboardFilter() {
        return clickElement(DASHBOARD_PROPERTY_FILTER);
    }
    public boolean dashboardFilterRemoveAllProperties() {
        return clickElement(DASHBOARD_FILTER_REMOVE_PROPERTIES);
    }
    public boolean dashboardFilterAddPropertyButton() {
        return clickElement(DASHBOARD_FILTER_ADD_PROPERTY_BUTTON);
    }
    public boolean dashboardFilterPropertyListDropdown() {
        return clickElement(DASHBOARD_FILTER_PROPERTY_LIST_DROPDOWN);
    }
    public boolean dashboardFilterAddProperty() {
        return clickElement(DASHBOARD_FILTER_ADD_SPECIFIC_PROPERTY_VILLAGE_BEND);
    }
    public boolean dashboardFilterButton() {
        return clickElement(DASHBOARD_FILTER_SUBMIT_FILTER_BUTTON);
    }

    //Overlay Method
    private void waitForPotentialOverlayMyDashboardNavigation() { waitForOverlay(LOADING_OVERLAY);}
}
