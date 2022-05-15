package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.MakeReadyBoardPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain.*;

import static org.junit.Assert.assertTrue;

public class ValidateMakeReadyTabsIT extends BaseBrowserTest {

    public ValidateMakeReadyTabsIT() { super("dallasentratatest9"); }

    @Test
    public void shouldPreviewTheMakeReadyBoard_whenGoingThroughTheDashboard() {

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        MakeReadyBoardPage objMakeReadyBoardPage = new MakeReadyBoardPage(driver);
        MakeReadySubtasksTab objSubTasksTabMakeReady = new MakeReadySubtasksTab(driver);
        MakeReadyProblemTab objMakeReadyProblemTab = new MakeReadyProblemTab(driver);
        MakeReadyAssignmentTab objAssignmentTab = new MakeReadyAssignmentTab(driver);
        MakeReadyAttachmentTab objMakeReadyAttachmentTab = new MakeReadyAttachmentTab(driver);
        MakeReadyExpensesTab objMakeReadyExpensesTab = new MakeReadyExpensesTab(driver);
        MakeReadyHistoryTab objMakeReadyHistoryTab = new MakeReadyHistoryTab(driver);

        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to click the Make Ready Board tab.", objMakeReadyBoardPage.clickMakeReadyBoardTab());
        assertTrue("Unable to confirm the Make Ready Board table exists.", objMakeReadyBoardPage.verifyMakeReadyBoardTableExists());
        assertTrue("Unable to click the first Make Ready in the table.", objMakeReadyBoardPage.clickFirstMakeReadyOnTable());
        assertTrue("Unable to verify that the Problem tab exists.", objMakeReadyProblemTab.confirmProblemTabExists());
        assertTrue("Unable to verify that the Assignment tab exists.", objAssignmentTab.confirmAssignmentTabExists());
        assertTrue("Unable to verify that the Attachments tab exists.", objMakeReadyAttachmentTab.confirmAttachmentTabExists());
        assertTrue("Unable to verify that the Sub-tasks tab exists.", objSubTasksTabMakeReady.confirmSubtasksTabExists());
        assertTrue("Unable to verify that the Expenses tab exists.", objMakeReadyExpensesTab.confirmExpensesTabExists());
        assertTrue("Unable to verify that the History tab exists.", objMakeReadyHistoryTab.confirmHistoryTabExists());
        assertTrue("Unable to click the Problem tab", objMakeReadyProblemTab.clickProblemTab());
        assertTrue("Unable to verify that the Problem Details section exists.", objMakeReadyProblemTab.confirmProblemDetailsExists());
        assertTrue("Unable to click the Assignment tab.", objAssignmentTab.clickAssignmentTab());
        assertTrue("Unable to confirm the Assignment Overview section exists.", objAssignmentTab.confirmAssignmentOverviewExists());
        assertTrue("Unable to click the Attachments tab.", objMakeReadyAttachmentTab.clickAttachmentTab());
        assertTrue("Unable to confirm the Add Attachments section exists.", objMakeReadyAttachmentTab.confirmAddAttachmentsOverviewExists());
        assertTrue("Unable to click the Subtasks Tab.", objSubTasksTabMakeReady.clickSubtasksTab());
        assertTrue("Unable to confirm the Subtasks Overview section exists.", objSubTasksTabMakeReady.confirmSubtasksOverviewExists());
        assertTrue("Unable to click the Expenses Tab.", objMakeReadyExpensesTab.clickExpensesTab());
        assertTrue("Unable to confirm the Labor Overview section exists.", objMakeReadyExpensesTab.confirmLaborOverviewExists());
        assertTrue("Unable to click the History Tab.", objMakeReadyHistoryTab.clickHistoryTab());
        assertTrue("Unable to confirm that the History Logs are displayed.", objMakeReadyHistoryTab.confirmHistoryLogEntriesExist());
        assertTrue("Unable to click the close button on the Make Ready.", objSubTasksTabMakeReady.clickCloseButton());
        assertTrue("Unable to verify that the Make Ready Board Table exists.", objMakeReadyBoardPage.verifyMakeReadyBoardTableExists());

    }

}
