package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyBoardPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain.MakeReadySubtasksTab;

import static org.junit.Assert.assertTrue;

public class ValidateSubtasksAreVisibleIT extends BaseBrowserTest {
    public ValidateSubtasksAreVisibleIT() {
        super("dallasentratatest9");
    }

    @Test
    public void ShouldValidateTheAbilityToCreateNewMakeReadyWhenGoingThroughMakeReadyDashboard() {

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        MakeReadyBoardPage objMakeReadyBoardPage = new MakeReadyBoardPage(driver);
        MakeReadySubtasksTab objSubTasksTabMakeReady = new MakeReadySubtasksTab(driver);

        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to click the Make Ready Board tab.", objMakeReadyBoardPage.clickMakeReadyBoardTab());
        assertTrue("Unable to click the first Make Ready on the table.", objMakeReadyBoardPage.clickFirstMakeReadyOnTable());
        assertTrue("The subtasks tab is not selected.", objSubTasksTabMakeReady.verifySubtasksTabIsSelected());
        assertTrue("Unable to click the close button.", objSubTasksTabMakeReady.clickCloseButton());

    }
}