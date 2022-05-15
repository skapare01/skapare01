package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain.InspectionsCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain.InspectionsHistoryTab;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain.InspectionsTab;

import static org.junit.Assert.assertTrue;

public class ValidateInspectionsTabsIT extends BaseBrowserTest {

    public ValidateInspectionsTabsIT(){ super("dallasentratatest9"); }

    @Test
    public void shouldValidateInspectionsTabsWhenGoingThroughMaintenanceDashboardIT(){

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
        AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
        InspectionsHistoryTab objInspectionsHistoryTab = new InspectionsHistoryTab(driver);
        InspectionsTab objInspectionsTab = new InspectionsTab(driver);
        InspectionsCurtain objInspectionsCurtain = new InspectionsCurtain(driver);

        //navigate to the inspections dashboard
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to click the Inspections tab.", objInspectionsListPage.clickInspectionsTab());
        assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());

        //filter to get only single inspections rather than grouped
        assertTrue("Unable to click the filter button on the Inspections side panel", objAddInspectionCurtain.clickFilterButtonOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the Status drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click All Statuses filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click All Statuses a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to select Not Started and in Progress filter option.", objAddInspectionCurtain.clickNotStartedAndInProgress());
        assertTrue("Unable to click Filter Inspections.", objAddInspectionCurtain.clickFilterInspections());

        //click first inspection listed after filter and verify subtabs
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to verify that the Inspections Subtab exists.", objInspectionsTab.confirmInspectionsSubtabExists());
        assertTrue("Unable to verify that the History Subtab exists.", objInspectionsHistoryTab.confirmHistorySubtabExists());
        assertTrue("Unable to click the History Subtab.", objInspectionsHistoryTab.clickHistorySubtab());
        assertTrue("Unable to verify that the History Log exists.", objInspectionsHistoryTab.confirmHistoryLogExists());

        //close out of inspection and verify inspections dashboard still exists
        assertTrue("Unable to click the Close button.", objInspectionsCurtain.clickCloseButton());
        assertTrue("Unable to verify that the Inspections Dashboard exists.", objInspectionsListPage.confirmViewAllInspectionsExists());

    }
}
