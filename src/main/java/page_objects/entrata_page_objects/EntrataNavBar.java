package page_objects.entrata_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EntrataNavBar extends BasePage {

    //Constructor
    public EntrataNavBar(WebDriver driver) {
        super(driver); }

    //Top Navigation Bar Locators
    private final By LEADS_TAB = By.id("main-nav-prospects");
    private final By RESIDENTS_TAB = By.id("residents");
    private final By CORPORATE_TAB = By.id("corporate");
    private final By ACCOUNTING_TAB = By.id("accounting");
    private final By TOOLS_TAB_LOCATOR = By.id("tools");
    private final By REPORTS_TAB_LOCATOR = By.id("reports");
    private final By APPS_TAB = By.id("apps");
    private final By SETUP_TAB = By.id("settings");
    private final By HELP_ICON = By.id("support");

    //Dashboard Sub-tabs Locators
    private final By PRICING_TAB = By.cssSelector(".sub-nav li:nth-child(3)");
    private final By LEASING_CENTER_TAB = By.linkText("Leasing Center");
    private final By SIMPLEMENTATION_PORTAL = By.linkText("Simplementation Portal");

    //Leads Sub-tabs Locators
    private final By LEADS_REFERRERS_SUBTAB = By.linkText("Referrers");

    //Applicants Sub-tabs Locators

    //Residents Sub-tabs Locators
    private final By AFFORDABLE = By.linkText("Affordable");
    private final By CHARGES_TAB = By.linkText("Charges");
    private final By DEPOSITS_TAB = By.linkText("Deposits");
    private final By MAINTENANCE = By.linkText("Maintenance");
    private final By OTHER_INCOME_TAB = By.linkText("Other Income");
    private final By AR_PAYMENTS_LOCATOR = By.linkText("AR Payments");
    private final By RENEWALS_TAB = By.linkText("Renewals");
    private final By PACKAGES_TAB = By.linkText("Packages");
    private final By HAP_REQUESTS_TAB = By.linkText("HAP Requests");
    private final By TRACS_TRANSMISSIONS_TAB = By.linkText("TRACS Transmissions");
    private final By SPECIAL_CLAIMS_TAB = By.linkText("Special Claims");
    private final By GROSS_RENT_CHANGE_TAB = By.linkText("Gross Rent Change");
    private final By GUESTS_TAB = By.cssSelector("a[href='?module=customer_guestsxxx']");


    //Corporate Sub-tabs Locators
    private final By JOB_COSTING = By.cssSelector("a[href='?module=jobsxxx']");
    private final By CONTRACTS = By.cssSelector("a[href='?module=ap_contractsxxx']");

    //Accounting Sub-tabs Locators
    private final By VENDORS_BUTTON = By.cssSelector("a[href='?module=ap_payees_systemxxx&ap_payee_type[id]=1']");
    private final By PURCHASE_ORDER_LISTING_SCREEN = By.linkText("Purchase Orders");
    private final By ASSET_LIST = By.cssSelector("a[href='?module=assets_trackingxxx']");
    private final By INVOICE_LISTING_SCREEN = By.linkText("Invoices");
    private final By AP_PAYMENTS_LISTING_SCREEN = By.linkText("AP Payments");
    private final By RECONCILIATIONS_LISTING_SCREEN = By.linkText("Reconciliations");
    private final By JOURNAL_ENTRIES_BUTTON = By.cssSelector("a[href='?module=general_journalxxx']");
    private final By BUDGETS_TAB = By.cssSelector("a[href='?module=budgetsxxx']");
    private final By CLOSINGS_TAB = By.linkText("Closings");
    private final By MANAGEMENT_FEES_BUTTON = By.cssSelector("a[href='?module=management_feesxxx']");
    private final By OWNERS_TAB = By.linkText("Owners");

    //Tools Sub-tabs Locators
    private final By MESSAGE_CENTER_TAB = By.linkText("Message Center");
    private final By CALL_TRACKER_LOGS_SUB_TAB = By.linkText("Call Tracker Logs");
    private final By REPUTATION_TAB_LOCATOR = By.linkText("Reputation");
    private final By MARKETING_HUB_TAB_LOCATOR = By.linkText("Marketing Hub");
    private final By DOCUMENTS_TAB = By.cssSelector(".sub-nav li:nth-child(1)");
    private final By SMART_COMMUNITY = By.cssSelector("a[href='?module=smart_community_systemxxx']");
    private final By LEARNING_SESSIONS_TAB = By.linkText("Learning Sessions");

    //Reports Sub-tabs Locators
    private final By LIBRARY_TAB = By.cssSelector("li[data-module-title ='Library'] a");
    private final By MY_REPORTS = By.cssSelector("li[data-module-title ='My Reports'] a");
    private final By COMPANY_REPORTS = By.cssSelector("li[data-module-title ='Company Reports'] a");
    private final By REPORT_HISTORY = By.cssSelector("li[data-module-title ='History'] a");
    private final By SCHEDULED_REPORTS = By.cssSelector("li[data-module-title ='Scheduled'] a");
    private final By REPORTING_ARCHIVE = By.cssSelector("li[data-module-title ='Archive'] a");
    private final By INBOX_TAB = By.cssSelector("li[data-module-title ='Inbox'] a");
    private final By PACKETS_TAB = By.cssSelector("li[data-module-title ='Packets'] a");

    //Apps Sub-tabs Locators
    private final By APP_STORE_TAB = By.linkText("App Store");
    private final By CONTRACTS_TAB = By.linkText("Contracts");
    private final By BILLING_ACCOUNTS_TAB = By.cssSelector("li[data-module-title ='Billing Accounts'] a");
    private final By BILLING_REQUESTS_TAB = By.linkText("Billing Requests");
    private final By ORDER_FORMS_TAB = By.linkText("Order Forms");
    private final By _1099_MISC_E_FILE = By.linkText("1099 MISC E-File");

    //Setup Sub-tabs Locators
    private final By COMPANY_TAB = By.cssSelector(".sub-nav li:nth-child(1)");
    private final By PROPERTIES_TAB = By.cssSelector(".sub-nav li:nth-child(2)");
    private final By USERS_AND_GROUPS_TAB = By.linkText("Users & Groups");
    private final By WEBSITES_TAB = By.linkText("Websites");

    //Help Icon Dropdown Locators
    private final By PROFILES = By.linkText("Profiles");
    private final By TICKETS_LINK = By.linkText("Tickets");
    private final By CREATE_A_SUPPORT_TICKET = By.linkText("Create a Support Ticket");
    private final By PRODUCT_UPDATES = By.linkText("Product Updates");

    //METHODS

    //Dashboard Tab Methods
    public boolean clickPricingTab() {
        return clickElement(PRICING_TAB);
    }

    public boolean clickLeasingCenterTab() {
        return clickElement(LEASING_CENTER_TAB);
    }

    public boolean clickSimplementationPortalTab() {
        return clickElement(SIMPLEMENTATION_PORTAL);
    }

    //Leads Tab Methods
    public boolean clickLeadsTab() {
        return clickElement(LEADS_TAB);
    }

    public boolean clickLeadsReferrersSubtab() {
        return clickElement(LEADS_REFERRERS_SUBTAB);
    }
    //Applicants Tab Methods

    //Residents Tab Methods
    public boolean clickResidentsTab() {
        return clickElement(RESIDENTS_TAB);
    }

    public boolean residentsTabHover() {
        return moveToAnElementWithActions(RESIDENTS_TAB);
    }

    public boolean clickChargesTab() {
        return clickElement(CHARGES_TAB);
    }

    public boolean clickDepositsTab() {
        return clickElement(DEPOSITS_TAB);
    }

    public boolean clickMaintenanceSubTab() {
        return clickElement(MAINTENANCE);
    }

    public boolean clickOtherIncomeTab() {
        return clickElement(OTHER_INCOME_TAB);
    }

    public boolean clickARPaymentsTab() {
        return clickElement(AR_PAYMENTS_LOCATOR);
    }

    public boolean clickRenewalsTab() {
        return clickElement(RENEWALS_TAB);
    }

    public boolean clickPackagesTab() {
        return clickElement(PACKAGES_TAB);
    }

    public boolean clickGuestsSubTab() {
        return clickElement(GUESTS_TAB);
    }

    public boolean clickAffordableSubTab() {
        return clickElement(AFFORDABLE);
    }

    public boolean clickHapRequestsSubTab() {
        return clickElement(HAP_REQUESTS_TAB);
    }

    public boolean clickTracsTransmissionsSubTab() {
        return clickElement(TRACS_TRANSMISSIONS_TAB);
    }

    public boolean clickSpecialClaimsSubTab() {
        return clickElement(SPECIAL_CLAIMS_TAB);
    }

    public boolean clickGrossRentChangeSubTab() {
        return clickElement(GROSS_RENT_CHANGE_TAB);
    }
    
    //Corporate Tab Methods
    public boolean hoverCorporateTab() {
        return moveToAnElementWithActions(CORPORATE_TAB);
    }

    public boolean selectJobCostingInDropdown() {
        return clickElement(JOB_COSTING);
    }

    public boolean selectContractsInDropdown() {
        return clickElement(CONTRACTS);
    }

    //Accounting Tab Methods
    public boolean clickAccountingTab() {
        return clickElement(ACCOUNTING_TAB);
    }

    public boolean hoverAccountingTab() {
        return moveToAnElementWithActions(ACCOUNTING_TAB, waitTimes.LONG_WAIT);
    }

    public boolean selectVendorsInDropdown() {
        return clickElement(VENDORS_BUTTON);
    }

    public boolean clickPurchaseOrderListingScreen() {
        return clickElement(PURCHASE_ORDER_LISTING_SCREEN);
    }

    public boolean clickAssetList() {
        return clickElement(ASSET_LIST);
    }

    public boolean clickInvoiceListingScreen() {
        return clickElement(INVOICE_LISTING_SCREEN);
    }

    public boolean clickAPPaymentsListingScreen() {
        return clickElement(AP_PAYMENTS_LISTING_SCREEN);
    }

    public boolean clickReconciliationsListingScreen() {
        return clickElement(RECONCILIATIONS_LISTING_SCREEN);
    }

    public boolean selectJournalEntriesSubTab() {
        return clickElement(JOURNAL_ENTRIES_BUTTON);
    }

    public boolean budgetsTabClick() {
        return clickElement(BUDGETS_TAB);
    }

    public boolean clickOwnersTab() {
        return clickElement(OWNERS_TAB);
    }

    public boolean clickClosingsTab() {
        return clickElement(CLOSINGS_TAB);
    }

    public boolean clickManagementFeesInDropdown() {
        return clickElement(MANAGEMENT_FEES_BUTTON);
    }

    //Tools Tab Methods
    public boolean clickToolsTab() {
        return clickElement(TOOLS_TAB_LOCATOR);
    }

    public boolean moveToToolsTab() {
        return moveToAnElementWithActions(TOOLS_TAB_LOCATOR);
    }

    public boolean clickMessageCenterSubTab() {
        return clickElement(MESSAGE_CENTER_TAB);
    }

    public boolean clickCallTrackerLogsSubTab() { return clickElement(CALL_TRACKER_LOGS_SUB_TAB); }

    public boolean clickReputationSubTab() {
        return clickElement(REPUTATION_TAB_LOCATOR);
    }

    public boolean clickMarketingHubSubTab() {
        return clickElement(MARKETING_HUB_TAB_LOCATOR);
    }

    public boolean clickSmartCommunitySubTab() {
        return clickElement(SMART_COMMUNITY);
    }

    //Reports Tab Methods
    public boolean moveToReportsTab(){
        return moveToAnElementWithActions(REPORTS_TAB_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean moveToLibrary () {
        return moveToAnElementWithActions(LIBRARY_TAB, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean librarySelect () {
        return clickElement(LIBRARY_TAB, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean myReportsSelect () {
        return clickElement(MY_REPORTS, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean companyReportsSelect () {
        return clickElement(COMPANY_REPORTS, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean reportHistory () {
        return clickElement(REPORT_HISTORY, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean scheduledReports () {
        return clickElement(SCHEDULED_REPORTS, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean reportingArchive () {
        return clickElement(REPORTING_ARCHIVE, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean inboxSelect () {
        return clickElement(INBOX_TAB, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean packetsSelect () {
        return clickElement(PACKETS_TAB, waitTimes.UNREASONABLE_WAIT);
    }

    //Apps Tab Methods
    public boolean clickAppsTab() {
        return moveToAnElementWithActions(APPS_TAB);
    }

    public boolean clickAppStoreTab() {
        return clickElement(APP_STORE_TAB);
    }

    public boolean clickBillingAccountsSubtab() {
        return clickElement(BILLING_ACCOUNTS_TAB);
    }

    public boolean clickContractsTab() { return clickElement(CONTRACTS_TAB);}

    public boolean clickBillingRequestsTab() { return clickElement(BILLING_REQUESTS_TAB);}

    public boolean clickOrderFormsTab() { return clickElement(ORDER_FORMS_TAB);}

    public boolean click1099MISCEFileTab() { return clickElement(_1099_MISC_E_FILE);}

    //Setup Tab Methods
    public boolean clickSetupButton() {
        return clickElement(SETUP_TAB, waitTimes.LONG_WAIT);
    }

    public boolean clickCompanyButton() {
        return clickElement(COMPANY_TAB);
    }

    public boolean clickPropertiesButton() {
        return clickElement(PROPERTIES_TAB);
    }

    public boolean clickWebsites() {
        return clickElement(WEBSITES_TAB);
    }

    public boolean clickDocumentsTab() {
        return clickElement(DOCUMENTS_TAB);
    }

    public boolean clickUsersAndGroups() {
        return clickElement(USERS_AND_GROUPS_TAB);
    }

    //Entrata Profile Methods
    public boolean clickProfilesSubtab() {return clickElement(PROFILES);}

    public boolean clickLearningSessions() {return clickElement(LEARNING_SESSIONS_TAB);}

    public boolean clickHelp() {return clickElement(HELP_ICON);}

    public boolean clickTicketsLink() {return clickElement(TICKETS_LINK);}

    public boolean clickCreateASupportTicket() {return clickElement(CREATE_A_SUPPORT_TICKET);}

    public boolean clickProductUpdates() {return clickElement(PRODUCT_UPDATES);}


}
