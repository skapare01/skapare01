package page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadForm extends BasePage {
    private final By LEAD_FORM = By.id("call-type-select");
    private final By REQUIRED_INFO_TAB = By.cssSelector("li[class='js-build-rapport-tab selected']");
    private final By FLOOR_PLANS_AND_UNITS_TAB = By.cssSelector("li[class='js-floor-plans-units-tab ']");
    private final By BENEFIT_SELLING_TAB = By.className("js-benefits-selling-tab");
    private final By QUALIFICATIONS_TAB = By.className("js-qualifications-tab");
    private final By APPOINTMENT_TAB = By.className("js-appointment-tab");
    private final By ADDITIONAL_NOTES_TAB = By.className("js-notes-tab");
    private final By RESET_FORM_LINK = By.id("reset-guest-card");
    private final By PROPERTY_SELECTOR_DROPDOWN = By.cssSelector("div[class='form-select-dropdown dashboard-property-select']");
    private final By FORM_SELECTOR_DROPDOWN = By.id("call-type-select");
    private final By WORK_ORDER_TAB_DROPDOWN = By.xpath("//div//option[text()='Work Order']");
    private final By RESIDENT_TAB_DROPDOWN = By.xpath("//div//option[text()='Resident']");
    private final By OTHER_TAB_DROPDOWN = By.xpath("//div//option[text()='Other']");
    private final By WORKFORCE_MANAGEMENT_TAB = By.id("workforce_management");
    private final By REQUIREMENTS_SUB_TAB = By.cssSelector("li[class='js-left_side_tab selected']");
    //need to add calendar
    private final By SCHEDULES_SUB_TAB = By.id("scheduling");
    private final By SELECT_OPTION_DROPDOWN = By.id("select_scheduling_show_call_agents_by");
    private final By DEPARTMENT_DROPDOWN = By.xpath("//div//option[text()='Department']");
    private final By TEAM_DROPDOWN = By.xpath("//div//option[text()='Team']");
    private final By QUEUE_DROPDOWN = By.xpath("//div//option[text()='Queue']");
    private final By INTRADAY_MANAGEMENT_SUB_TAB = By.id("intraday_management");
    //calendar again
    private final By MY_LEASING_CENTER_TAB = By.id("my_leasing_center");
    private final By MY_SCHEDULE = By.id("my-schedule");
    private final By GENERAL_LEASING_CENTER = By.cssSelector("#selected-report > div.column-left.side > div > b:nth-child(2) > div.head");
    private final By MANAGERIAL_REPORTS = By.cssSelector("#selected-report > div.column-left.side > div > b:nth-child(3) > div.head");
    private final By MY_SUPPORT_TAB = By.id("my_support");
    private final By MY_SCHEDULE_TAB = By.id("div_my_schedule");
    private final By GENERAL_SUPPORT_QA_UNDER_MY_SCHEDULE_TAB = By.cssSelector("#ul_support_qa_standard_dashboard_left_side_sub_tabs > div.column-left.side > div > b.accordion.menubox.close.square-corners.open > div.head");
    private final By RANKINGS_UNDER_MY_SCHEDULE_TAB = By.cssSelector("#ul_support_qa_standard_dashboard_left_side_sub_tabs > div.column-left.side > div > b:nth-child(3) > div.head");
    private final By SUPPORT_TASKS_RANKING_UNDER_MY_SCHEDULE_TAB = By.cssSelector("#ul_support_qa_standard_dashboard_left_side_sub_tabs > div.column-left.side > div > b:nth-child(4) > div.head");
    private final By MANAGERIAL_REPORTS_UNDER_MY_SCHEDULE_TAB = By.cssSelector("#ul_support_qa_standard_dashboard_left_side_sub_tabs > div.column-left.side > div > b:nth-child(5) > div.head");
    private final By ENTRATA_ROYALE_BETA_TAB = By.id("Entrata Royale [Beta]");
    private final By GAMIFICATION_AGENT_SCREEN_DISPLAYED = By.id("CallAgentLogin");
    private final By ROYALE_ADMIN_TAB = By.className("sub-nav");
    private final By MARKETPLACE_TAB = By.xpath("//div//li[text()='Marketplace']");
    private final By REDEMPTIONS_TAB = By.xpath("//div//li[text()='Redemptions']");
    private final By MONTHLY_CHALLENGE_TAB = By.xpath("//div//li[text()='Monthly Challenge']");
    private final By PERFORMANCE_TAB = By.xpath("//div//li[text()='Performance']");
    private final By MISC_TAB = By.xpath("//div//li[text()='Misc']");
    private final By GUEST_CARD_DETAILS = By.xpath("//div//span[text()='Guest Card Details: ']");
    private final By PROPERTY_DETAILS = By.id("middle-body-tabs-container-div");
    private final By GREETINGS = By.xpath("//div//span[text()='Thank you for calling The Village. My name is ____________.  What community are you calling from today? ']");
    private final By BENEFIT_SELLING = By.xpath("//*[@id=\"highlight-accordion\"]/div/div/i");
    private final By QUALIFICATION_REQUIREMENTS_AND_POLICIES = By.id("qualification-requirements-and-policies");
    private final By AMENITIES = By.id("amenities");
    private final By UTILITIES = By.id("utilities");
    private final By LEAD_ACTIVITY_IF_EXISTING_LEAD = By.xpath("//*[@id=\"div-lead-activity-total-container\"]/div/i");
    private final By GENERAL_INFORMATION = By.className("leasing-contacts-container-priority-contacts");
    private final By CONTACT_INFORMATION = By.xpath("//div[text()='Property Information']");
    private final By HOURS = By.cssSelector("div[id='right-body-container-div'] [class='head']");
    private final By PROPERTY_CUSTOMIZATION = By.xpath("//div[text()='Property Customization']");

    public LeadForm(WebDriver driver) {
        super(driver);
    }

    public boolean findLeadForm() {
        return confirmElementIsVisible(LEAD_FORM);
    }

    public boolean findRequiredInfoTab() {
        return confirmElementIsVisible(REQUIRED_INFO_TAB);
    }

    public boolean findFloorPlansAndUnitsTab() {
        return confirmElementIsVisible(FLOOR_PLANS_AND_UNITS_TAB);
    }

    public boolean findBenefitSellingTab() {
        return confirmElementIsVisible(BENEFIT_SELLING_TAB);
    }

    public boolean findQualificationsTab() {
        return confirmElementIsVisible(QUALIFICATIONS_TAB);
    }

    public boolean findAppointmentTab() {
        return confirmElementIsVisible(APPOINTMENT_TAB);
    }

    public boolean findAdditionalNotesTab() {
        return confirmElementIsVisible(ADDITIONAL_NOTES_TAB);
    }

    public boolean findResetFormLink() {
        return confirmElementIsVisible(RESET_FORM_LINK);
    }

    public boolean findPropertySelectorDropdown() {
        return confirmElementIsVisible(PROPERTY_SELECTOR_DROPDOWN);
    }

    public boolean clickFormSelectorDropdown() {
        return clickElement(FORM_SELECTOR_DROPDOWN);
    }

    public boolean findWorkOrderTab() { return confirmElementIsVisible(WORK_ORDER_TAB_DROPDOWN); }

    public boolean findResidentTab() { return confirmElementIsVisible(RESIDENT_TAB_DROPDOWN); }

    public boolean findOtherTab() { return confirmElementIsVisible(OTHER_TAB_DROPDOWN); }

    public boolean findGuestCardDetails() { return confirmElementIsVisible(GUEST_CARD_DETAILS);}

    public boolean findPropertyDetails() { return confirmElementIsVisible(PROPERTY_DETAILS);}

    public boolean findGreetings() { return confirmElementIsVisible(GREETINGS);}

    public boolean findBenefitSelling() { return confirmElementIsVisible(BENEFIT_SELLING);}

    public boolean findQualificationRequirementsAndPolicies() { return confirmElementIsVisible(QUALIFICATION_REQUIREMENTS_AND_POLICIES);}

    public boolean findAmenities() { return confirmElementIsVisible(AMENITIES);}

    public boolean findUtilities() { return confirmElementIsVisible(UTILITIES);}

    public boolean findLeadActivityIfExistingLead() { return confirmElementIsVisible(LEAD_ACTIVITY_IF_EXISTING_LEAD);}

    public boolean findGeneralInformation() { return  confirmElementIsVisible(GENERAL_INFORMATION);}

    public boolean findContactInformation() { return confirmElementIsVisible(CONTACT_INFORMATION);}

    public boolean findHours() { return confirmElementIsVisible(HOURS);}

    public boolean findPropertyCustomization() { return confirmElementIsVisible(PROPERTY_CUSTOMIZATION);}
    //Will be used later for another test
    public boolean clickWorkforceManagementTab() { return clickElement(WORKFORCE_MANAGEMENT_TAB);}

    public boolean findRequirementsSubTab() { return confirmElementIsVisible(REQUIREMENTS_SUB_TAB);}

    public boolean clickSchedulesSubTab() { return clickElement(SCHEDULES_SUB_TAB);}

    public boolean clickSelectOptionDropdown() { return clickElement(SELECT_OPTION_DROPDOWN);}

    public boolean findDepartmentDropdown() { return confirmElementIsVisible(DEPARTMENT_DROPDOWN);}

    public boolean findTeamDropdown() { return confirmElementIsVisible(TEAM_DROPDOWN);}

    public boolean findQueueDropdown() { return confirmElementIsVisible(QUEUE_DROPDOWN);}

    public boolean clickIntradayManagementSubTab() { return clickElement(INTRADAY_MANAGEMENT_SUB_TAB);}

    public boolean clickMyLeasingCenterTab() { return clickElement(MY_LEASING_CENTER_TAB);}

    public boolean findMyScheduleUnderMyData() { return confirmElementIsVisible(MY_SCHEDULE);}

    public boolean findGeneralLeasingCenterUnderMyData() { return confirmElementIsVisible(GENERAL_LEASING_CENTER);}

    public boolean findManagerialReportsUnderMyData() { return confirmElementIsVisible(MANAGERIAL_REPORTS);}

    public boolean clickMySupportTabUnderDashboardMenu() { return clickElement(MY_SUPPORT_TAB);}

    public boolean findMyScheduleTabUnderMyData() { return confirmElementIsVisible(MY_SCHEDULE_TAB);}

    public boolean findGeneralSupportQAUnderMyScheduleTab() { return confirmElementIsVisible(GENERAL_SUPPORT_QA_UNDER_MY_SCHEDULE_TAB);}

    public boolean findRankingsUnderMyScheduleTab() { return  confirmElementIsVisible(RANKINGS_UNDER_MY_SCHEDULE_TAB);}

    public boolean findSupportTaskRankingUnderMyScheduleTab() { return confirmElementIsVisible(SUPPORT_TASKS_RANKING_UNDER_MY_SCHEDULE_TAB);}

    public boolean findManagerialReportsUnderMyScheduleTab() { return confirmElementIsVisible(MANAGERIAL_REPORTS_UNDER_MY_SCHEDULE_TAB);}

    public boolean clickEntrataRoyaleBetaTab() { return clickElement(ENTRATA_ROYALE_BETA_TAB);}

    public boolean findGamificationAgentScreenLogin() { return confirmElementIsVisible(GAMIFICATION_AGENT_SCREEN_DISPLAYED);}

    public boolean clickRoyaleAdminTab() { return clickElement(ROYALE_ADMIN_TAB);}

    public boolean findMarketplaceTab() { return confirmElementIsVisible(MARKETPLACE_TAB);}

    public boolean findRedemptionsTab() { return confirmElementIsVisible(REDEMPTIONS_TAB);}

    public boolean findMonthlyChallengeTab() { return confirmElementIsVisible(MONTHLY_CHALLENGE_TAB);}

    public boolean findPerformanceTab() { return confirmElementIsVisible(PERFORMANCE_TAB);}

    public boolean findMiscTab() { return confirmElementIsVisible(MISC_TAB);}
}

