package regression_tests.resident_utility;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.DataEntryClientAdminDashboardTab;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;

public class ShouldVerifyTheDataEntryDashboardIT extends BaseBrowserTest {
    public ShouldVerifyTheDataEntryDashboardIT() { super("clientadmin", CLIENTADMIN, "dkamle", "Entrata123"); }


    @Test
    public void ShouldVerifyDataEntryDashboardData_whenNavigatingClientProfileIT(){
    //Resident Utility Test Case: "2405801 - Verify the data entry dashboard UI"

MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
//Confirm Data Entry Tab Loaded.
assertTrue("Unable to open the \"Data Entry\" ClientAdmin>Dashboard Tab", myDashboardNav.openDataEntryTab());
DataEntryClientAdminDashboardTab dataEntryClientAdminDashboardTab = new DataEntryClientAdminDashboardTab(driver);
assertTrue("The \"Data Entry\" screen did not load properly.", dataEntryClientAdminDashboardTab.confirmUtilityExpenseManagementIsVisible());
//Locate the Data Block Item Headers
assertTrue("The \"Open Items\" header was unable to be located!", dataEntryClientAdminDashboardTab.confirmOpenItemsHeaderIsVisible());
assertTrue("The \"Late Items\" header was unable to be located!", dataEntryClientAdminDashboardTab.confirmLateItemsHeaderIsVisible());
assertTrue("The \"Target\" header was unable to be located!", dataEntryClientAdminDashboardTab.confirmTargetHeaderIsVisible());
assertTrue("The \"Due Date Day(s)\" header was unable to be located!", dataEntryClientAdminDashboardTab.confirmDueDateDaysHeaderIsVisible());
assertTrue("The \"Longest Time\" header was unable to be located!", dataEntryClientAdminDashboardTab.confirmLongestTimeHeaderIsVisible());
//Locate the Action buttons on the screen
assertTrue("The \"Process\" button was unable to be located!", dataEntryClientAdminDashboardTab.locateUtilityExpenseManagementProcessButton());
assertTrue("The \"View\" button was unable to be located!", dataEntryClientAdminDashboardTab.locateUtilityExpenseManagementViewButton());
assertTrue("The \"Reset\" button was unable to be located!", dataEntryClientAdminDashboardTab.locateResetWebRetrievalsButtonAny());
//Locate the Data Blocks are present
assertTrue("The \"Utility Expense Management\" block of data was unable to be located!", dataEntryClientAdminDashboardTab.confirmUtilityExpenseManagementIsVisible());
assertTrue("The \"Resident Utility\" block of data was unable to be located!", dataEntryClientAdminDashboardTab.confirmResidentUtilityDataBlockIsVisible());
assertTrue("The \"Invoice Processing\" block of data was unable to be located!", dataEntryClientAdminDashboardTab.confirmInvoiceProcessingDataBlockIsVisible());
//Locating the Individual Data Block rows for Utility Expense Management
assertTrue("The \"UEM Web Retrieval\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmResidentUtilityWebRetrievalRowIsVisible());
assertTrue("The \"Unassociated UEM Bills\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedUtilityExpenseManagementBillsRowIsVisible());
assertTrue("The \"Unassociated UEM Bills In Review\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedUtilityExpenseManagementBillsInReviewRowIsVisible());
assertTrue("The \"Unprocessed UEM Bills\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedUtilityExpenseManagementBillsRowIsVisible());
assertTrue("The \"Unprocessed UEM Bills In Review\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedUtilityExpenseManagementBillsInReviewRowIsVisible());
assertTrue("The \"Unprocessed UEM Summary Bills\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedUtilityExpenseManagementSummaryBillsRowIsVisible());
assertTrue("The \"UEM Summary Bills In Review\" row of data under the Utility Expense Management section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUtilityExpenseManagementSummaryBillsInReviewRowIsVisible());
//Locating the Individual Data Block rows for Resident Utility
assertTrue("The \"RU Web Retrieval\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmResidentUtilityWebRetrievalRowIsVisible());
assertTrue("The \"Unassociated RU Bills\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedResidentUtilityBillsRowIsVisible());
assertTrue("The \"Unassociated RU Bills In Review\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedResidentUtilityBillsInReviewRowIsVisible());
assertTrue("The \"Unprocessed RU Bills\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedResidentUtilityBillsRowIsVisible());
assertTrue("The \"Unprocessed RU Bills In Review\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedResidentUtilityBillsInReviewRowIsVisible());
assertTrue("The \"Unprocessed RU Summary Bills\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedResidentUtilitySummaryBillsRowIsVisible());
assertTrue("The \"RU Summary Bills In Review\" row of data under the Resident Utility section was unable to be located!", dataEntryClientAdminDashboardTab.confirmResidentUtilitySummaryBillsInReviewRowIsVisible());
//Locating the Individual Data Block rows for Invoice Processing
assertTrue("The \"Unassociated IP Bills\" row of data under the Invoice Processing section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedInvoiceProcessingBillsRowIsVisible());
assertTrue("The \"Unassociated IP Bills in Review\" row of data under the Invoice Processing section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnassociatedInvoiceProcessingBillsInReviewRowIsVisible());
assertTrue("The \"Unprocessed IP Bills\" row of data under the Invoice Processing section was unable to be located!", dataEntryClientAdminDashboardTab.confirmUnprocessedInvoiceProcessingBillsRowIsVisible());
assertTrue("The \"IP Bills In Review\" row of data under the Invoice Processing section was unable to be located!", dataEntryClientAdminDashboardTab.confirmInvoiceProcessingBillsInReviewRowIsVisible());
    }
}
