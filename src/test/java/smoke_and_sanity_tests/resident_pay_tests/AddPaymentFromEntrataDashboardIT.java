package smoke_and_sanity_tests.resident_pay_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.ARPaymentsPage;

import static org.junit.Assert.assertTrue;


public class AddPaymentFromEntrataDashboardIT extends BaseBrowserTest {
    public AddPaymentFromEntrataDashboardIT()  {
        super("avantic");
    }

    //manual test 2224102

    @Test

    public void addPaymentFromEntrataDashboardThroughMakeResidentPaymentLink() {
        //Test Variables
        String residentSearch = "Facilities";
        String property = "267544";

        MyDashboardNav dashboardPayment = new MyDashboardNav(driver);
        assertTrue("Failed to verify 'Approvals' tab is visible.", dashboardPayment.approvalsTabIsVisible());
        assertTrue("Failed to verify 'Leads' tab is visible.", dashboardPayment.leadsTabIsVisible());
        assertTrue("Failed to verify 'Applicants' tab is visible.", dashboardPayment.applicantsTabIsVisible());
        assertTrue("Failed to verify 'Residents' tab is visible.", dashboardPayment.residentsTabIsVisible());
        assertTrue("Failed to verify 'Res. Portal' tab is visible.", dashboardPayment.resPortalTabIsVisible());
        assertTrue("Failed to verify 'Maintenance' tab is visible.", dashboardPayment.maintenanceTabIsVisible());
        assertTrue("Failed to verify 'Financial' tab is visible.", dashboardPayment.financialTabIsVisible());
        assertTrue("Failed to verify 'Help' tab is visible.", dashboardPayment.helpTabIsVisible());
        assertTrue("Failed to verify 'My Integrated Calendar' link is visible.", dashboardPayment.myIntegratedCalendarIsVisible());
        assertTrue("Failed to verify 'Make Resident Payment' link is visible.", dashboardPayment.makeResidentPaymentIsVisible());
        assertTrue("Failed to verify 'Create Lead' link is visible.", dashboardPayment.createLeadIsVisible());
        assertTrue("Failed to verify 'Calculate First Month Charges' link is visible.", dashboardPayment.calculateFirstMonthChargesIsVisible());
        assertTrue("Failed to verify 'Create Work Order' link is visible.", dashboardPayment.createWorkOrderIsVisible());
        assertTrue("Failed to verify 'Create Invoice' link is visible.", dashboardPayment.createInvoiceIsVisible());
        assertTrue("Failed to verify 'Close Period' link is visible.", dashboardPayment.closePeriodIsVisible());
        assertTrue("Failed to verify 'Advanced Period' link is visible.", dashboardPayment.advancedPeriodIsVisible());
        assertTrue("Failed to verify 'Make Ready Board' link is visible.", dashboardPayment.makeReadyBoardIsVisible());
        assertTrue("Failed to click on 'Make Resident Payment'.", dashboardPayment.clickOnMakeResidentPayment());

        ARPaymentsPage paymentPopUp = new ARPaymentsPage(driver);
        assertTrue("Failed to click on property dropdown.", paymentPopUp.clickOnPropertyDropDown());
        assertTrue("Failed to select a property", paymentPopUp.selectProperty(property));
        assertTrue("Failed to send keys to Resident field.", paymentPopUp.addResidentSearch(residentSearch));
        assertTrue("Failed to add Resident", paymentPopUp.clickOnResident());
        assertTrue("Failed to see 'Payment Code' field.", paymentPopUp.paymentCodeIsVisible());
        assertTrue("Failed to see 'Payment Type' field", paymentPopUp.paymentTypeIsVisible());
        assertTrue("Failed to see 'Amount' field.", paymentPopUp.amountFieldIsVisible());
        assertTrue("Failed to see 'Check Number' field.", paymentPopUp.checkNumberFieldIsVisible());
        assertTrue("Failed to see 'Date Received'.", paymentPopUp.dateReceivedIsVisible());
        assertTrue("Failed to see 'Post Month'.", paymentPopUp.postMonthIsVisible());
        assertTrue("Failed to see 'Notes' field", paymentPopUp.notesFieldIsVisible());
        assertTrue("Failed to see 'Internal Memo'.", paymentPopUp.internalMemoIsVisible());
        assertTrue("Failed to see 'Add Payment' button", paymentPopUp.addPaymentButtonIsVisible());
        assertTrue("Failed to see 'Cancel' button.", paymentPopUp.cancelButtonIsVisible());




    }

}
