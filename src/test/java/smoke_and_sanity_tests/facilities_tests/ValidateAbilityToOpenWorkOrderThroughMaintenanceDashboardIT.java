package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.AddWorkOrderCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrderFilter;
import static org.junit.Assert.assertTrue;

public class ValidateAbilityToOpenWorkOrderThroughMaintenanceDashboardIT extends BaseBrowserTest {

        public ValidateAbilityToOpenWorkOrderThroughMaintenanceDashboardIT(){
            super("dallasentratatest9");}

        @Test
        public void shouldUpdateWorkOrderStatus_whenGoingThroughWorkOrderOverview() {
            EntrataNavBar objNavBar = new EntrataNavBar(driver);
            WorkOrderFilter objWorkOrderFilter = new WorkOrderFilter(driver);
            AddWorkOrderCurtain objAddWorkOrderCurtain = new AddWorkOrderCurtain(driver);

            assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
            assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
            assertTrue("Unable to verify that the work orders tab has opened.", objWorkOrderFilter.confirmWorkOrdersTabIsSelected());
            assertTrue("Unable to click Create New Work Order button on side panel.", objAddWorkOrderCurtain.clickCreateWorkOrderButton());
            assertTrue("Unable to verify a new Work Order modal has opened.", objAddWorkOrderCurtain.confirmNewWorkOrderModalExists());

        }
}
