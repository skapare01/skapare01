package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection.NewInspection;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrderFilter;

import static org.junit.Assert.assertTrue;

public class ValidateAbilityToCreateInspectionThroughMaintenanceDashboardIT extends BaseBrowserTest {
    public ValidateAbilityToCreateInspectionThroughMaintenanceDashboardIT(){
        super("dallasentratatest9");}


    @Test
    public void shouldCreateInspection_whenGoingThroughMaintenanceDashboard() {
        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
        AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
        NewInspection objNewInspection = new NewInspection(driver);
        WorkOrderFilter objWorkOrderFilter = new WorkOrderFilter(driver);
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("The Work Orders tab is not selected by default.", objWorkOrderFilter.confirmWorkOrdersTabIsSelected());
        assertTrue("Unable to click the Inspections tab.", objInspectionsListPage.clickInspectionsTab());
        assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());
        assertTrue("Unable to click the Create Inspection button on side bar.", objAddInspectionCurtain.clickCreateInspectionButton());
        assertTrue("No new inspection has been started.", objNewInspection.verifyNewInspectionHasBeenStarted());
    }
}
