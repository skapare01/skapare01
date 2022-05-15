package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyBoardPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyFilter;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain.MakeReadySubtasksTab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ValidateMakeReadyFilterIT extends BaseBrowserTest {

    public ValidateMakeReadyFilterIT() { super("dallasentratatest9"); }

    @Test
    public void shouldSaveMakeReadyFilterWhenGoingThroughMaintenanceDashboard(){

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        MakeReadyBoardPage objMakeReadyBoardPage = new MakeReadyBoardPage(driver);
        assertTrue("Unable to click the Make Ready Board tab.", objMakeReadyBoardPage.clickMakeReadyBoardTab());
        MakeReadyFilter objMakeReadyFilter = new MakeReadyFilter(driver);
        assertTrue("Unable to click the Filter Make Ready button.", objMakeReadyFilter.clickFilterMakeReadyButton());
        assertTrue("Unable to verify that the Property Groups Filter Area exists.", objMakeReadyFilter.confirmPropertyGroupsFilterArea());
        assertTrue("Unable to verify that other filterable data fields exist.", objMakeReadyFilter.confirmDataFieldsToFilterAreVisible());
        assertTrue("Unable to click All Properties to remove it from the filter.", objMakeReadyFilter.clickAllProperties());
        assertTrue("Unable to click the Add button.", objMakeReadyFilter.clickAddButton());
        assertTrue("Unable to click All Properties after clicking the add button.", objMakeReadyFilter.clickAllPropertiesDownArrowFromAfterTheAddPropertiesButton());
        assertTrue("Unable to click Lofts at Lorien after clicking add in Make Readies filter.", objMakeReadyFilter.clickLoftsOfLorienInAddProperties());
        assertTrue("Unable to click Filter Make Readies.", objMakeReadyFilter.clickFilterMakeReadiesButton());
        assertTrue("Unable to click the first Make Ready on the dashboard.", objMakeReadyBoardPage.clickFirstMakeReadyOnTable());
        MakeReadySubtasksTab objSubTasksTabMakeReady = new MakeReadySubtasksTab(driver);
        assertEquals("Unable to verify that the property selected is Lofts of Lorien.", "Lofts at Lorien", objSubTasksTabMakeReady.confirmLoftsOfLorienIsTheSelectedPropertyForMakeReady());

    }
}
