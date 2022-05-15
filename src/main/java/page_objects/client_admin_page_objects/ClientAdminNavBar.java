package page_objects.client_admin_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import wait_times.WaitTimes;

public class ClientAdminNavBar extends BasePage {

    //Top Navigation Bar Locators
    private final By DASHBOARD_TAB = By.id("Dashboard");
    private final By CLIENTS_TAB = By.id("Clients");
    private final By TASKS_TAB = By.id("Tasks");
    private final By SALES_TAB =  By.id("Sales");
    private final By SUPPORT_TAB = By.id("Support");
    private final By DEVELOPMENT_TAB = By.id("Development");
    private final By REPORTS_TAB = By.id("nav_modules_2711");
    private final By HR_TAB = By.id("HR");
    private final By TRAININGS_TAB = By.id("Trainings");
    private final By IT_TAB = By.id("IT");
    private final By QUICK_MENU = By.id("quickNav");
    private final By UTILITIES_TAB = By.id("Utilities");

    //Dashboard Sub-tabs
    private final By HOVER_TESTS_SUBTAB = By.xpath("//*[text()='Tests']"); //Refer to below comment//
    private final By CLICK_TESTS_SUBTAB = By.linkText("Tests"); //Created this 'duplicate' Tests sub-tab variable due to selectors not working for both hover action and click action//
    private final By QUESTIONS_OPTION = By.linkText("Questions");
    private final By TRAINING_SESSIONS_SUBTAB = By.linkText("Training Sessions");

    //Clients Sub-tabs
    private final By ADD_CLIENT_SUBTAB = By.linkText("Add Client");
    private final By SIMPLEMENTATION_SUBTAB = By.linkText("Simplementation");
    private final By CLIENT_CONTRACTS_SUB_TAB = By.xpath("//*[@id=\"ps_lead_tab_container\"]/ul/li[8]/a");
    private final By CLIENT_CONTRACT = By.linkText("1127137");
    private final By CLIENT_CONTRACT_DETAILS = By.id("contract-popup");
    private final By CLIENT_HOME_TAB = By.id("home");
    private final By HOME_PROPERTIES_SUB_TAB = By.id("properties");
    private final By PROPERTIES_DETAIL_PAGE = By.id("ps_lead_subtab_container");
    private final By ADD_BULK_PROPERTIES_BTN = By.className("add");
    private final By ADD_BULK_PROPERTIES_PAGE = By.id("bulk_properties");
    private final By CLIENT_HOME_OVERLAY = By.cssSelector("[class='loading-overlay bg-img-medium']");

    //Sales Sub-tabs
    private final By CONTRACTS_SUB_TAB = By.linkText("Contracts");
    private final By LEADS_SUB_TAB = By.xpath("//*[text()='Leads']");
    private final By LEADS_SALES_OPPORTUNITIES = By.xpath("//a[text()='Sales Opportunities']");
    private final By LEADS_PEOPLE_TAB = By.xpath("//a[text()='People']");

    //Marketing Sub-tabs

    //Support Sub-tabs
    private final By SUPPORT_ILS_PORTAL_SUB_TAB = By.xpath("//a[text()='ILS Portal']");
    private final By SUPPORT_SCREENING_MENU = By.xpath("//*[text()='Screening']");
    private final By SUPPORT_SCREENING_DATA_PROVIDERS_MENU = By.linkText("Screening Data Providers");
    private final By SUPPORT_COMPETITORS = By.linkText("Competitors");
    private final By SUPPORT_SCREENING_MANUAL_REVIEW = By.xpath("//*[text()='Screening Manual Review']");
    private final By SUPPORT_INSURANCE = By.cssSelector(".sub-nav > li:nth-child(5) > a");
    private final By SUPPORT_TOOL_TIPS = By.linkText("Tool Tips");
    private final By SUPPORT_KNOWLEDGE_BASE = By.linkText("Knowledge Base");
    private final By SUPPORT_PHONE_SUB_TAB = By.linkText("Phone");
    private final By SUPPORT_PHONE_CALL_ANALYSIS_SUB_TAB = By.linkText("CallAnalysis");

    //Development Sub-tabs
    private final By SETUP_SUBTAB = By.linkText("Setup");
    private final By SETUP_PROPERTY_SETTING_GROUPS = By.linkText("Property Setting Groups");
    private final By SETUP_PROPERTY_SETTING_KEYS = By.linkText("Property Setting Keys");

    //Accounting Sub-tabs

    //HR Sub-tabs
    private final By REVIEWS = By.xpath("//li[@class='has-child']//a[@href='/?module=employee_assessment_types-new']");

    //Utilities Sub-tabs
    private final By UTILITY_BILLS = By.linkText("Utility Bills");

    //Reports Sub-tabs
    private final By REPORTS_HOME_SUB_TAB = By.linkText("Home");
    private final By REPORTS_HOME_PAGE = By.id("home-reports");
    private final By LEGACY_REPORTS_SUB_TAB = By.linkText("Legacy Reports");
    private final By LEGACY_REPORTS_MENU = By.id("reports_menu");
    private final By TRAINING_REPORTS_SUB_MENU_ITEM = By.linkText("Training Reports");

    //Other
    private final By QUICK_SEARCH = By.id("quick_search");
    private final By CID_SEARCH_RESULT = By.cssSelector("tr[class='fastLookup2-tr']"); //First search result from quick search

    //Product Specific Locators.
    private final String SMOKE_AUTOMATION_RAPID_CID = "17515";
    private final By PINE_TREE_CONDOS = By.linkText("Pinetree Condos");
    private final String AVANTIC_RESIDENTIAL = "13576";

    //Tasks Tab
    private final By ROOT_CAUSE_ANALYSIS_SUBTAB = By.linkText("Root Cause Analysis");
    private final By SPRINT_SUMMARY_REPORT = By.linkText("Sprint Summary Report");
    private final By BUG_DASHBOARD = By.linkText("Bug Dashboard");
    private final By ADD_TASK = By.linkText("Add Task");
    private final By TASK_TYPES = By.linkText("Task Types");
    private final By RECURRING_TASKS = By.linkText("Recurring Tasks");

    //IT Tab
    private final By ASSET_MANAGEMENT = By.linkText ("Asset Management");
    private final By USERS_AND_GROUPS = By.linkText("Users & Groups");

    //Trainings Tab
    private final By CONTENT_AUDIT_DASH = By.linkText("Content Audit Dashboard");

    //Quick Menu subtabs
    private final By HELP_PORTAL = By.linkText("Help Portal");

    //User Profile
    private final By USER_PROFILE = By.id("profileNav");
    private final By LOGOUT_USER = By.linkText("Logout");

    //Constructor
    public ClientAdminNavBar(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean moveToSupportMenu(){
        return moveToAnElementWithActions(SUPPORT_TAB,waitTimes.LONG_WAIT);
    }

    public boolean clickSupportTab() {
        return clickElement(SUPPORT_TAB);
    }

    public boolean selectILSPortalSubtab() {
        return clickElement(SUPPORT_ILS_PORTAL_SUB_TAB, waitTimes.LONG_WAIT);
    }

    public boolean openSupportScreening(){
        return clickElement(SUPPORT_SCREENING_MENU);
    }

    public boolean moveToScreeningMenuOfSupport(){
        return moveToAnElementWithActions(SUPPORT_SCREENING_MENU);
    }

    public boolean openScreeningDataProviders(){
        return clickElement(SUPPORT_SCREENING_DATA_PROVIDERS_MENU);
    }

    public boolean openScreeningManualReview() {
        return  clickElement(SUPPORT_SCREENING_MANUAL_REVIEW);
    }

    public boolean searchForSmokeAutomationRapidCID() {
        return sendKeysToElement(QUICK_SEARCH, SMOKE_AUTOMATION_RAPID_CID);
    }

    public boolean searchForAvanticResidentialCID() {
        return sendKeysToElement(QUICK_SEARCH, AVANTIC_RESIDENTIAL, waitTimes.LONG_WAIT);
    }

    public boolean pressEnterInQuickSearch() {
        return pressEnter(QUICK_SEARCH);
    }

    public boolean openQuickSearchResult() {
        return clickElement(CID_SEARCH_RESULT, waitTimes.LONG_WAIT);
    }

    public boolean clickSupportMenu() { return clickElement(SUPPORT_TAB); }

    public boolean clickSupportCompetitors() { return clickElement(SUPPORT_COMPETITORS); }

    public boolean clickUtilitiesTab() {
        return clickElement(UTILITIES_TAB);
    }

    // Dashboard Tab Methods
    public boolean moveToDashboardsTab(){return moveToAnElementWithActions(DASHBOARD_TAB);}

    public boolean moveToTestsSubtab(){return moveToAnElementWithActions(HOVER_TESTS_SUBTAB);}

    public boolean clickDashboardTestsSubTab() {
        return clickElement(CLICK_TESTS_SUBTAB);
    }

    // Clients Tab Methods
    public boolean clickClientsTab() {
        return clickElement(CLIENTS_TAB);
    }

    public boolean selectPineTreeCondos() {
        return clickElement(PINE_TREE_CONDOS);
    }

    public boolean clickSupportInsurance() { return clickElement(SUPPORT_INSURANCE); }

    public boolean clickContractsSubTab() {
        return clickElement(CLIENT_CONTRACTS_SUB_TAB,waitTimes.LONG_WAIT);
    }

    public boolean selectClientContract() {
        return clickElement(CLIENT_CONTRACT);
    }

    public boolean contractDetailsPage() {
        return clickElement(CLIENT_CONTRACT_DETAILS);
    }

    public boolean clickClientHomeTab() {
        return clickElement(CLIENT_HOME_TAB);
    }

    public boolean clickHomeTabPropertiesSubTab() {
        waitForOverlay(CLIENT_HOME_OVERLAY);
        return clickElement(HOME_PROPERTIES_SUB_TAB, waitTimes.LONG_WAIT);
    }

    public boolean clickAddBulkPropertiesBtn() {
        return clickElement(ADD_BULK_PROPERTIES_BTN);
    }

    public boolean homePropertiesDetailPage() {
        return confirmElementIsVisible(PROPERTIES_DETAIL_PAGE);
    }

    public boolean viewAddBulkPropertiesPage() {
        return confirmElementIsVisible(ADD_BULK_PROPERTIES_PAGE);
    }

    // Tasks Tab Methods //
    public boolean moveToTasksTab() {
        return moveToAnElementWithActions(TASKS_TAB);
    }

    public boolean clickTasksTab() {
        return clickElement(TASKS_TAB);
    }

    public boolean clickRecurringTasks() {
        return clickElement(RECURRING_TASKS);
    }

    public boolean clickBugDashboard(){return clickElement(BUG_DASHBOARD,waitTimes.LONG_WAIT);}

    public boolean clickAddTask(){return clickElement(ADD_TASK);}

    public boolean clickSprintSummaryReport() {
        return clickElement(SPRINT_SUMMARY_REPORT);
    }

    public boolean clickTasksMenu() {
        return clickElement(TASKS_TAB);
    }

    public boolean clickTaskTypes() {
        return clickElement(TASK_TYPES);
    }

    // Sales Tab Methods //
    public boolean clickSalesTab() {
        return clickElement(SALES_TAB);
    }

    public boolean clickSalesContractSubTab() {
        return clickElement(CONTRACTS_SUB_TAB);
    }

    public boolean clickLeadsSalesOpportunitiesSubTab() {
        moveToAnElementWithActions(SALES_TAB);
        moveToAnElementWithActions(LEADS_SUB_TAB);
        return clickElement(LEADS_SALES_OPPORTUNITIES);
    }

    public boolean hoverOverSalesTabInClientAdmin() {
        return moveToAnElementWithActions(SALES_TAB);
    }

    public boolean hoverOverLeadsSubtabUnderSalesTabInClientAdmin() {
        return moveToAnElementWithActions(LEADS_SUB_TAB);
    }

    public boolean clickPeopleOptionUnderSalesLeadsTabsInClientAdmin() {
        return clickElement(LEADS_PEOPLE_TAB);
    }

    // Marketing Tab Methods //

    // Support Tab Methods //
    
    public boolean clickKnowledgeBaseListItem() {
        return clickElement(SUPPORT_KNOWLEDGE_BASE, waitTimes.LONG_WAIT);
    }

    public boolean moveToPhoneSubTab() { return moveToAnElementWithActions(SUPPORT_PHONE_SUB_TAB); }

    public boolean clickPhoneCallAnalysisSubTab() { return clickElement(SUPPORT_PHONE_CALL_ANALYSIS_SUB_TAB); }

    // Reports //

    public boolean clickReportsHomeSubTab() {
        return clickElement(REPORTS_HOME_SUB_TAB);
    }

    public boolean reportsHomePage() {
        return confirmElementIsVisible(REPORTS_HOME_PAGE, waitTimes.LONG_WAIT);
    }

    public boolean selectReportsTab(){
        return clickElement(REPORTS_TAB);
    }

    public boolean selectLegacyReportsSubTab() {
        return clickElement(LEGACY_REPORTS_SUB_TAB);
    }

    public boolean legacyReportsMenu() {
        return confirmElementIsVisible(LEGACY_REPORTS_MENU);
    }

    public boolean clickSupportToolTips(){return clickElement(SUPPORT_TOOL_TIPS);}

    public boolean moveToDevelopmentTab(){return moveToAnElementWithActions(DEVELOPMENT_TAB);}

    public boolean moveToSetupSubtab(){return moveToAnElementWithActions(SETUP_SUBTAB);}

    public boolean clickPropertySettingGroups(){return clickElement(SETUP_PROPERTY_SETTING_GROUPS);}

    public boolean clickPropertySettingsKey(){return clickElement(SETUP_PROPERTY_SETTING_KEYS);}

    public boolean clickSimplementation(){return clickElement(SIMPLEMENTATION_SUBTAB);}

    public boolean moveToClientsTab(){return moveToAnElementWithActions(CLIENTS_TAB);}

    public boolean clickRootCauseAnalysis(){return clickElement(ROOT_CAUSE_ANALYSIS_SUBTAB);}

    public boolean clickAddClientSubtab() { return clickElement(ADD_CLIENT_SUBTAB, waitTimes.LONG_WAIT); }

    public boolean moveToReportsTab() {
        return moveToAnElementWithActions(REPORTS_TAB);
    }

    public boolean moveToLegacyReportsMenuItem() {
        return moveToAnElementWithActions(LEGACY_REPORTS_SUB_TAB);
    }

    public boolean clickTrainingReportsSubMenuItem() {
        return clickElement(TRAINING_REPORTS_SUB_MENU_ITEM);
    }

    //HR Methods //
    public boolean clickHrTab() {
        return clickElement(HR_TAB);
    }

    public boolean moveToHrTab() {
        return moveToAnElementWithActions(HR_TAB);
    }

    public boolean clickReviewsSubTab() {
        return clickElement(REVIEWS);
    }

    // Training Methods //
    public boolean clickTrainingTab() {
        return clickElement(TRAININGS_TAB);
    }

    public boolean moveToTrainingTab(){return moveToAnElementWithActions(TRAININGS_TAB);}

    public boolean clickQuestionsOption(){return clickElement(QUESTIONS_OPTION);}

    public boolean trainingSessionsSubtabClick() {
        return clickElement(TRAINING_SESSIONS_SUBTAB);
    }

    // IT Tab //
    public boolean moveToITTab () {return moveToAnElementWithActions(IT_TAB, waitTimes.LONG_WAIT);}

    public boolean clickAssetManagement() {return clickElement(ASSET_MANAGEMENT);}

    public boolean clickUsersAndGroups() {
        return clickElement(USERS_AND_GROUPS);
    }

    // Trainings Tab

    public boolean clickContentAuditDash(){return clickElement(CONTENT_AUDIT_DASH,waitTimes.LONG_WAIT);}

    public boolean moveToQuickMenu(){return moveToAnElementWithActions(QUICK_MENU);}

    public boolean clickHelpPortal(){
        return clickElement(HELP_PORTAL, waitTimes.LONG_WAIT);
    }

    //Utilities Tab
    public boolean clickUtilityBillsSubTab() {
        return clickElement(UTILITY_BILLS);
    }

    //User Profile
    public boolean clickUserProfileDropdown() {
        waitForOverlay(CLIENT_HOME_OVERLAY);
        return clickElement(USER_PROFILE);
    }
    public boolean clickLogOut() {
        return clickElement(LOGOUT_USER);
    }
}