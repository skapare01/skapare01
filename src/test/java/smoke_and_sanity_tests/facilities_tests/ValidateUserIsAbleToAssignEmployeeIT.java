package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;

import static org.junit.Assert.assertTrue;

public class ValidateUserIsAbleToAssignEmployeeIT extends BaseBrowserTest {


    public ValidateUserIsAbleToAssignEmployeeIT(){
        super("dallasentratatest9");}

@Test
public void shouldValidateUserIsAbleToAssignEmployee_whenAssigningFromInspectionTab() {

    EntrataNavBar objNavBar = new EntrataNavBar(driver);
    InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
    AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
    assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
    assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
    assertTrue("Unable to click the Inspections tab.", objInspectionsListPage.clickInspectionsTab());
    assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());
    assertTrue("Unable to click the filter button on the Inspections side panel", objAddInspectionCurtain.clickFilterButtonOnInspectionsSidePanel());
    assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
    assertTrue("unable to click the Status drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
    assertTrue("Unable to click All Statuses filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
    assertTrue("Unable to click All Statuses a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
    assertTrue("Unable to select Not Started and in Progress filter option.", objAddInspectionCurtain.clickNotStartedAndInProgress());
    assertTrue("Unable to click Filter Inspections.", objAddInspectionCurtain.clickFilterInspections());
    assertTrue("Unable to click the Assign button for an inspection.", objInspectionsListPage.clickAssignBtn());
    assertTrue("Unable to click assignable list to show drop down.", objInspectionsListPage.selectGaneshD1FromAssignableDropDown());
    assertTrue("Unable to click the save button from the Assign To pop-up.", objInspectionsListPage.clickSaveButtonFromAssignInspection());
    assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());
    assertTrue("Unable to verify the success message after assigning inspection to employee.", objInspectionsListPage.confirmSuccessMessage());
    }
}
