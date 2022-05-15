package smoke_and_sanity_tests.resident_utility_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.*;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class VerifyUtilityDashboardPagesIT extends BaseBrowserTest {

    public VerifyUtilityDashboardPagesIT() {
        super("clientadmin", CLIENTADMIN, "dkamle", "Xento123");
    }

    @Test
    public void verifyUtilityDashboardPagesLoad_whenDashboardClicked() {

        //Confirm Utilities Implementation Tab loaded.
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        assertTrue("Unable to open the \"Utilities Implementation\" ClientAdmin>Dashboard Tab", myDashboardNav.openUtilitiesImplementationTab());
        UtilitiesImplementationClientAdminDashboardTab utilitiesImplementationClientAdminDashboardTab = new UtilitiesImplementationClientAdminDashboardTab(driver);
        assertTrue("Implementation Consultants Multi-Select is not visible.", utilitiesImplementationClientAdminDashboardTab.confirmImplementationConsultantsMultiSelectIsVisible());

        //Confirm Data Entry Tab Loaded.
        assertTrue("Unable to open the \"Data Entry\" ClientAdmin>Dashboard Tab", myDashboardNav.openDataEntryTab());
        DataEntryClientAdminDashboardTab dataEntryClientAdminDashboardTab = new DataEntryClientAdminDashboardTab(driver);
        assertTrue("The \"Data Entry\" screen did not load properly.", dataEntryClientAdminDashboardTab.confirmUtilityExpenseManagementIsVisible());

        //Confirm Utility Billing Dashboard Tab loads properly.
        assertTrue("Unable to open the \"Utility Billing Dashboard\" ClientAdmin>Dashboard Tab", myDashboardNav.openUtilityBillingDashboardTab());
        UtilityBillingDashboardClientAdminTab utilityBillingDashboard = new UtilityBillingDashboardClientAdminTab(driver);
        assertTrue("The \"Utility Billing Dashboard\" Screen did not load properly.", utilityBillingDashboard.confirmUtilityBillingDashboardIsVisible());

        //Confirm UEM Dashboard loaded properly.
        assertTrue("Unable to open the \"UEM\" ClientAdmin>Dashboard Tab", myDashboardNav.openUemDashboardTab());
        UEMDashboardClientAdminTab uemDashboardClientAdminTab = new UEMDashboardClientAdminTab(driver);
        assertTrue("The \"UEM\" Dashboard Tab did not load properly.", uemDashboardClientAdminTab.confirmUtilityManagementSpecialistMultiselectIsVisible());

        //Confirm IP Dashboard loaded properly.
        assertTrue("Unable to open the \"IP Dashboard\" ClientAdmin>Dashboard Tab", myDashboardNav.openIpDashboardTab());
        IPDashboardClientAdminTab ipDashboardClientAdminTab = new IPDashboardClientAdminTab(driver);
        assertTrue("The \"IP Dashboard\" Tab did not load properly.", ipDashboardClientAdminTab.confirmIpPerformanceReportIsVisible());

        //Confirm COA Dashboard loaded properly.
        assertTrue("Unable to open the \"COA Dashboard\" ClientAdmin>Dashboard Tab", myDashboardNav.openCoaDashboardTab());
        COADashboardClientAdminTab coaDashboard = new COADashboardClientAdminTab(driver);
        assertTrue("The \"COA Dashboard\" Tab did not load properly.", coaDashboard.confirmClientMultiselectIsVisible());

    }

}