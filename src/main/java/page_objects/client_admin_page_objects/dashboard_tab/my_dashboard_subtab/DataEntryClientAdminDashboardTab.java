package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DataEntryClientAdminDashboardTab extends BasePage {

    public DataEntryClientAdminDashboardTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    //Utility Expense Management Data Block Selectors
    private final By UTILITY_EXPENSE_MANAGEMENT_DATA_BLOCK = By.id("utility_expense_management");
    private final By OPEN_ITEMS_HEADER = By.xpath("//th[text()='Open Items']");
    private final By LATE_ITEMS_HEADER = By.xpath("//th[text()='Late Items']");
    private final By TARGET_HEADER = By.xpath("//th[text()='Target']");
    private final By DUE_DATE_DAYS_HEADER = By.xpath("//th[text()='Due date day(s)']");
    private final By LONGEST_TIME_HEADER = By.xpath("//th[text()='Longest Time']");

    private final By UTILITY_EXPENSE_MANAGEMENT_WEB_RETRIEVAL_ROW = By.xpath("//td[text()='UEM Web Retrieval']");
    private final By UNASSOCIATED_UTILITY_EXPENSE_MANAGEMENT_BILLS_ROW = By.xpath("//td[text()='Unassociated UEM Bills']");
    private final By UNASSOCIATED_UTILITY_EXPENSE_MANAGEMENT_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='Unassociated UEM Bills In Review']");
    private final By UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_BILLS_ROW = By.xpath("//td[text()='Unprocessed UEM Bills']");
    private final By UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='Unprocessed UEM Bills In Review']");
    private final By UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_SUMMARY_BILLS_ROW = By.xpath("//td[text()='Unprocessed UEM Summary Bills']");
    private final By UTILITY_EXPENSE_MANAGEMENT_SUMMARY_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='UEM Summary Bills In Review']");
    //Utility Expense Management Action buttons selectors
    private final By UTILITY_EXPENSE_MANAGEMENT_PROCESS_BUTTON = By.cssSelector("i[class='approve link process-web-retrievals']");
    private final By UTILITY_EXPENSE_MANAGEMENT_VIEW_BUTTON = By.cssSelector("a[class='button action view_web_retrievals']");
    private final By RESET_WEB_RETRIEVALS_BUTTON_ANY = By.cssSelector("i[class='sync reset_queue_waiting']");

    //Resident Utility Data Block Selectors
    private final By RESIDENT_UTILITY_DATA_BLOCK = By.id("resident_utility");

    private final By RESIDENT_UTILITY_WEB_RETRIEVAL_ROW = By.xpath("//td[text()='RU Web Retrieval']");
    private final By UNASSOCIATED_RESIDENT_UTILITY_BILLS_ROW = By.xpath("//td[text()='Unassociated RU Bills']");
    private final By UNASSOCIATED_RESIDENT_UTILITY_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='Unassociated RU Bills In Review']");
    private final By UNPROCESSED_RESIDENT_UTILITY_BILLS_ROW = By.xpath("//td[text()='Unprocessed RU Bills']");
    private final By UNPROCESSED_RESIDENT_UTILITY_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='Unprocessed RU Bills In Review']");
    private final By UNPROCESSED_RESIDENT_UTILITY_SUMMARY_BILLS_ROW = By.xpath("//td[text()='Unprocessed RU Summary Bills']");
    private final By RESIDENT_UTILITY_SUMMARY_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='RU Summary Bills In Review']");
    //Invoice Processing Data Block Selectors
    private final By INVOICE_PROCESSING_BLOCK = By.id("invoice_processing");

    private final By UNASSOCIATED_INVOICE_PROCESSING_BILLS_ROW = By.xpath("//td[text()='Unassociated IP Bills']");
    private final By UNASSOCIATED_INVOICE_PROCESSING_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='Unassociated IP Bills in Review']");
    private final By UNPROCESSED_INVOICE_PROCESSING_BILLS_ROW = By.xpath("//td[text()='Unprocessed IP Bills']");
    private final By INVOICE_PROCESSING_BILLS_IN_REVIEW_ROW = By.xpath("//td[text()='IP Bills In Review']");
    //Methods
    public boolean confirmUtilityExpenseManagementIsVisible() {
        return confirmElementIsVisible(UTILITY_EXPENSE_MANAGEMENT_DATA_BLOCK);
    }
    //Utility Expense Management Data Block Locating Methods
    public boolean confirmOpenItemsHeaderIsVisible() { return confirmElementIsVisible(OPEN_ITEMS_HEADER); }
    public boolean confirmLateItemsHeaderIsVisible() { return confirmElementIsVisible(LATE_ITEMS_HEADER); }
    public boolean confirmTargetHeaderIsVisible() { return confirmElementIsVisible(TARGET_HEADER); }
    public boolean confirmDueDateDaysHeaderIsVisible() { return confirmElementIsVisible(DUE_DATE_DAYS_HEADER); }
    public boolean confirmLongestTimeHeaderIsVisible() { return confirmElementIsVisible(LONGEST_TIME_HEADER); }

    public boolean confirmUnassociatedUtilityExpenseManagementBillsRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_UTILITY_EXPENSE_MANAGEMENT_BILLS_ROW); }
    public boolean confirmUnassociatedUtilityExpenseManagementBillsInReviewRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_UTILITY_EXPENSE_MANAGEMENT_BILLS_IN_REVIEW_ROW); }
    public boolean confirmUnprocessedUtilityExpenseManagementBillsRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_BILLS_ROW); }
    public boolean confirmUnprocessedUtilityExpenseManagementBillsInReviewRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_BILLS_IN_REVIEW_ROW); }
    public boolean confirmUnprocessedUtilityExpenseManagementSummaryBillsRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_UTILITY_EXPENSE_MANAGEMENT_SUMMARY_BILLS_ROW); }
    public boolean confirmUtilityExpenseManagementSummaryBillsInReviewRowIsVisible() { return confirmElementIsVisible(UTILITY_EXPENSE_MANAGEMENT_SUMMARY_BILLS_IN_REVIEW_ROW); }
    //Utility Expense Management Action buttons selectors
    public boolean locateUtilityExpenseManagementProcessButton(){return confirmElementIsVisible(UTILITY_EXPENSE_MANAGEMENT_PROCESS_BUTTON);}
    public boolean locateUtilityExpenseManagementViewButton(){return confirmElementIsVisible(UTILITY_EXPENSE_MANAGEMENT_VIEW_BUTTON);}
    public boolean locateResetWebRetrievalsButtonAny(){return confirmElementIsVisible(RESET_WEB_RETRIEVALS_BUTTON_ANY);}
    //Resident Utility Data Block Methods
    public boolean confirmResidentUtilityDataBlockIsVisible() { return confirmElementIsVisible(RESIDENT_UTILITY_DATA_BLOCK); }

    public boolean confirmResidentUtilityWebRetrievalRowIsVisible() { return confirmElementIsVisible(RESIDENT_UTILITY_WEB_RETRIEVAL_ROW); }
    public boolean confirmUnassociatedResidentUtilityBillsRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_RESIDENT_UTILITY_BILLS_ROW); }
    public boolean confirmUnassociatedResidentUtilityBillsInReviewRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_RESIDENT_UTILITY_BILLS_IN_REVIEW_ROW); }
    public boolean confirmUnprocessedResidentUtilityBillsRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_RESIDENT_UTILITY_BILLS_ROW); }
    public boolean confirmUnprocessedResidentUtilityBillsInReviewRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_RESIDENT_UTILITY_BILLS_IN_REVIEW_ROW); }
    public boolean confirmUnprocessedResidentUtilitySummaryBillsRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_RESIDENT_UTILITY_SUMMARY_BILLS_ROW); }
    public boolean confirmResidentUtilitySummaryBillsInReviewRowIsVisible() { return confirmElementIsVisible(RESIDENT_UTILITY_SUMMARY_BILLS_IN_REVIEW_ROW); }
    //Invoice Processing Data Block Methods
    public boolean confirmInvoiceProcessingDataBlockIsVisible() { return confirmElementIsVisible(INVOICE_PROCESSING_BLOCK); }

    public boolean confirmUnassociatedInvoiceProcessingBillsRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_INVOICE_PROCESSING_BILLS_ROW); }
    public boolean confirmUnassociatedInvoiceProcessingBillsInReviewRowIsVisible() { return confirmElementIsVisible(UNASSOCIATED_INVOICE_PROCESSING_BILLS_IN_REVIEW_ROW); }
    public boolean confirmUnprocessedInvoiceProcessingBillsRowIsVisible() { return confirmElementIsVisible(UNPROCESSED_INVOICE_PROCESSING_BILLS_ROW); }
    public boolean confirmInvoiceProcessingBillsInReviewRowIsVisible() { return confirmElementIsVisible(INVOICE_PROCESSING_BILLS_IN_REVIEW_ROW); }


}