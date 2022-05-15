package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab.RecurringWorkOrdersSubTab;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab.WorkOrdersSubTab;

import static org.junit.Assert.assertTrue;

public class ValidateAbilityToUpdateStatusFromDashboard extends BaseBrowserTest {

    public ValidateAbilityToUpdateStatusFromDashboard() {
        super("dallasentratatest9");
    }

    @Test
    public void shouldUpdateStatusFromMyDashboard_whenOperatingThroughDashboard() {
        MyDashboardNav objMyDashboardNav = new MyDashboardNav(driver);
        RecurringWorkOrdersSubTab objRecurringWorkOrdersSubTab = new RecurringWorkOrdersSubTab(driver);
        WorkOrdersSubTab objWorkOrdersSubTab = new WorkOrdersSubTab(driver);

        assertTrue("Unable to click the maintenance button on the dashboard.", objMyDashboardNav.clickMaintenanceTab());
        assertTrue("Unable to click on the work orders tab in the maintenance dashboard.", objMyDashboardNav.clickWorkOrdersSubTab());
        assertTrue("Unable to click the update status button within the work orders tab.", objWorkOrdersSubTab.clickUpdateStatusButtonInWorkOrdersSubTab());
        assertTrue("Unable to close work order status page.", objWorkOrdersSubTab.closeUpdateWorkOrderStatusPage());
        assertTrue("Unable to click recurring work orders tab in the maintenance dashboard.", objMyDashboardNav.clickRecurringWorkOrdersSubTab());
        assertTrue("Unable to click update status button in the recurring work orders tab.", objRecurringWorkOrdersSubTab.clickUpdateStatusButtonInRecurringWorkOrdersTab());
        assertTrue("Unable to close update status pop up.", objRecurringWorkOrdersSubTab.cancelUpdateStatusOnRecurringWorkOrdersPopUp());

    }
}