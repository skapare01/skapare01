package regression_tests.facilities_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab.InspectionsSubtab;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection.NewInspection;

import static org.junit.Assert.assertTrue;

public class ValidateAbilityToCreateNewInspectionForResidentIT extends BaseBrowserTest {

    public ValidateAbilityToCreateNewInspectionForResidentIT() { super("dallasentratatest9"); }

    @Test
    public void shouldCreateNewInspectionForResident(){

        //navigate to inspections dashboard and open a new inspection
        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
        assertTrue("Unable to click the Inspections tab.", objInspectionsListPage.clickInspectionsTab());
        AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
        assertTrue("Unable to click Create Inspection button in Inspections Subtab.", objAddInspectionCurtain.clickCreateInspectionButton());
        InspectionsSubtab objInspectionsSubtab = new InspectionsSubtab(driver);
        assertTrue("Unable to verify that the modal head shows an Inspection started.", objInspectionsSubtab.confirmInspectionStarted());
        //select a property
        NewInspection objNewInspection = new NewInspection(driver);
        assertTrue("Unable to click the drop down arrow from the Select A Property section.", objNewInspection.clickSelectAPropertyDropDownArrow());
        assertTrue("Unable to select the first property from the Select A Property drop down.", objNewInspection.selectFirstPropertyFromSelectAProperty());
        //verify inspection type, inspected by, schedule for future date, and inspection due date are visible
        assertTrue("Unable to verify that the Inspection Type field has populated.", objNewInspection.verifyInspectionTypeExists());
        assertTrue("Unable to verify that the Inspected By field has populated.", objNewInspection.verifyInspectedByFieldExists());
        assertTrue("Unable to verify that the Schedule for Future Date field has populated.", objNewInspection.verifyScheduleForFutureDateExists());
        assertTrue("Unable to verify that the Inspection Due Date field has populated.", objNewInspection.verifyInspectionDueDateFieldExists());
        //click inspection type drop down and make sure all fields are clickable
        assertTrue("Unable to click Inspection Type drop down.", objNewInspection.clickInspectionTypeDropDown());
        assertTrue("Unable to click value 1 from drop down.", objNewInspection.clickValueOneFromInspectionTypeDropDown());
        assertTrue("Unable to click Inspection Type drop down.", objNewInspection.clickInspectionTypeDropDown());
        assertTrue("Unable to click value 2 from drop down", objNewInspection.clickValueTwoFromInspectionTypeDropDown());
        assertTrue("Unable to click Inspection Type drop down.", objNewInspection.clickInspectionTypeDropDown());
        assertTrue("Unable to click value 3 from drop down", objNewInspection.clickValueThreeFromInspectionTypeDropDown());
        //click select an inspection and choose an inspection
        assertTrue("Unable to click the Select an Inspection drop down.", objNewInspection.clickSelectAnInspectionDropDown());
        assertTrue("Unable to click the first inspection template from the select an inspection drop down.", objNewInspection.clickSecondOptionFromSelectAnInspectionDropDown());
        //click inspected by drop down and select resident
        assertTrue("Unable to click the Inspected By drop down.", objNewInspection.clickInspectedByDropDown());
        assertTrue("Unable to select resident from the drop down.", objNewInspection.clickResidentFromInspectedByDropDown());
        //verify resident field appears and select a resident
        assertTrue("Unable to verify that the Resident field has appeared.", objNewInspection.confirmResidentFieldIsVisible());
        assertTrue("Unable to type an 'a' in the Resident text box.", objNewInspection.typeAnAIntoResidentField("a"));
        assertTrue("Unable to select the first resident in the table.", objNewInspection.clickFirstResidentInResidentFieldTable());
        //select a future date from Schedule for Future Date
        assertTrue("Unable to click the calendar icon on Schedule for Future Date.", objNewInspection.clickScheduleForFutureDateCalendarIcon());
        assertTrue("Unable to click today's due date on the inspection due date calendar.", objNewInspection.clickTodaysDateOnScheduleForFutureDateCalendar());
        //select a future date from Inspection Due Date
        assertTrue("Unable to click the calendar icon on Inspection Due Date.", objNewInspection.clickInspectionDueDateCalendarIcon());
        assertTrue("unable to click today's date on the Inspection Due Date calendar.", objNewInspection.clickTodaysDateOnInspectionDueDateCalendar());
        //click schedule
        assertTrue("Unable to click the Schedule Button.", objNewInspection.clickScheduleButton());
        //confirm inspection created success banner
        assertTrue("Unable to confirm success banner appeared for inspection that was created.", objNewInspection.confirmInspectionCreatedSuccessBanner());

    }
}
