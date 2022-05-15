package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrderFilter;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrdersListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain.WorkOrderProblemTab;

import static org.junit.Assert.assertTrue;

public class ValidateAbilityToOpenRecurringWorkOrdersIT extends BaseBrowserTest {

    public ValidateAbilityToOpenRecurringWorkOrdersIT() { super("dallasentratatest9"); }

    @Test
    public void shouldOpenRecurringWorkOrdersWhenGoingThroughWorkOrderDashboard() {

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        WorkOrderFilter objWorkOrderFilter = new WorkOrderFilter(driver);
        assertTrue("Unable to click the filter button on the Work Orders side panel.", objWorkOrderFilter.clickWorkOrderFilterBtn());
        assertTrue("Unable to click the Work Order Type drop down.", objWorkOrderFilter.clickMaintenanceRequestTypesList());
        assertTrue("Unable to deselect the Service Requests type option in the Work Order Type drop down.", objWorkOrderFilter.clickServiceRequestsFilterType());
        assertTrue("Unable to click Filter Maintenance button.", objWorkOrderFilter.clickFilterMaintenance());
        WorkOrdersListPage objWorkOrdersListPage = new WorkOrdersListPage(driver);
        assertTrue("Unable to click the first work order in the table.", objWorkOrdersListPage.clickFirstWorkOrder());
        WorkOrderProblemTab objWorkOrderProblemTab = new WorkOrderProblemTab(driver);
        assertTrue("Unable to verify that the selected work order is of type Recurring", objWorkOrderProblemTab.confirmWorkOrderTypeIsRecurring().contains("Recurring"));
        assertTrue("Unable to click the close button.", objWorkOrderProblemTab.clickCloseButton());

    }
}
