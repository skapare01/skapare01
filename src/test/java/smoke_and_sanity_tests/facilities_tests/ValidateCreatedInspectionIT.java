package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection.NewInspection;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateCreatedInspectionIT extends BaseBrowserTest {

    public ValidateCreatedInspectionIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldValidateCreatedInspection_whenOnInspectionDashboard() {

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to click the \"Residents\" tab.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the \"Maintenance\" header subtab.", objNavBar.clickMaintenanceSubTab());
        InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
        assertTrue("Unable to click the \"Inspections\" subtab.", objInspectionsListPage.clickInspectionsTab());
        AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
        assertTrue("Unable to click the \"Filter\" button on the Inspections side panel", objAddInspectionCurtain.clickFilterButtonOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the \"Inspections\" Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the \"Status\" drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click \"All Statuses\" filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click \"All Statuses\" a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to select \"Not Started\" and \"In Progress\" filter option.", objAddInspectionCurtain.clickNotStartedAndInProgress());
        assertTrue("Unable to click \"Filter Inspections\".", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        NewInspection objNewInspection = new NewInspection(driver);
        //You can't filter inspections further to get just Status: Not Started or Status: In Progress. So I've written this assertTrue statement that checks whether either requirement is met.
        assertTrue( "Unable to verify that the inspection opened has a status of either Not Started or In Progress.", "Status: Not Started".equals(objNewInspection.verifyInspectionHasNotStartedStatus()) || "Status: In Progress".equals(objNewInspection.verifyInspectionHasNotStartedStatus()));
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());
        assertTrue("Unable to click the \"Filter\" button on the Inspections side panel", objAddInspectionCurtain.clickFilterButtonOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the \"Status\" drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click \"All Statuses\" filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click \"All Statuses\" a second time to remove filter options under \"Statuses\".", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click \"Under Review\" status in the inspections filter.", objAddInspectionCurtain.clickUnderReviewStatusFilter());
        assertTrue("Unable to click \"Filter Inspections\".", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());
        assertTrue("Unable to click the \"Filter\" button on the Inspections side panel", objAddInspectionCurtain.clickFilterButtonOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the \"Status\" drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click \"All Statuses\" filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click \"All Statuses\" a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click \"Under Review\" status in the inspections filter.", objAddInspectionCurtain.clickApprovedStatusFilter());
        assertTrue("Unable to click \"Filter Inspections\".", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());

    }
}
