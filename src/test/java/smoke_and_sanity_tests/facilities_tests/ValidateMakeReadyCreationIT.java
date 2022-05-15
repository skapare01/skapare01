package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyBoardPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyFilter;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.new_make_ready.NewMakeReady;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateMakeReadyCreationIT extends BaseBrowserTest {

    public ValidateMakeReadyCreationIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldValidateTheAbilityToCreateNewMakeReady_whenGoingThroughMakeReadyDashboard() {

        //navigate to the make ready board and click New Make Ready
        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        MakeReadyBoardPage objMakeReadyBoardPage = new MakeReadyBoardPage(driver);
        assertTrue("Unable to click the Make Ready Board tab.", objMakeReadyBoardPage.clickMakeReadyBoardTab());
        MakeReadyFilter objMakeReadyFilter = new MakeReadyFilter(driver);
        assertTrue("Unable to click the create Make Ready button.", objMakeReadyFilter.clickCreateMakeReadyButton());
        NewMakeReady objNewMakeReady = new NewMakeReady(driver);
        assertTrue("Overlay has not disappeared.", objNewMakeReady.waitForNewMakeReadyOverlay());
        //verify different elements exist on the new make ready page
        assertEquals("Unable to verify that the Property Drop Down is visible.","* Property:", objNewMakeReady.confirmPropertyDropDownVisible());
        assertTrue("Unable to click the property drop down.", objNewMakeReady.clickPropertyDropDownButton());
        assertTrue("Unable to select Lofts at Lorien property drop down.", objNewMakeReady.clickLoftsAtLorienDropDownInNewMakeReadyPopUp()); /* this keeps the new make ready fields consistent */
        //continue to verify elements exist.
        assertEquals("Unable to confirm that the text Created On: is visible", "* Created On:", objNewMakeReady.confirmCreatedOnVisible());
        assertTrue("Unable to verify Template field exists.", objNewMakeReady.confirmTemplateVisible());
        assertEquals("Unable to verify that the text retrieved is Work Order For:","* Work Order For:", objNewMakeReady.confirmWorkOrderForVisible());
        assertTrue("Unable to verify Resident or Unit field exists.", objNewMakeReady.confirmResidentOrUnitVisible());
        assertTrue("Unable to verify Permission to Enter field exists.", objNewMakeReady.confirmPermissionToEnterVisible());
        assertTrue("Unable to verify Entry Notes field exists.", objNewMakeReady.confirmEntryNotesVisible());
        assertTrue("Unable to verify the Alarm/Entry code field exists.", objNewMakeReady.confirmAlarmOrEntryCodeVisible());
        assertTrue("Unable to click the close button on the opened new make ready.", objNewMakeReady.clickNewMakeReadyCloseButton());
    }
}
