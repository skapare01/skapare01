package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ChecklistsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ResidentsNav;
import utils.RandomGenerator;

import static org.junit.Assert.*;

public class MoveInChecklistsIT extends BaseBrowserTest {
    public MoveInChecklistsIT(){
        super("campusapartments");}

    @Test
    public void shouldAddMoveInChecklist_whenStudentPropertyIsActive(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        ResidentsNav residentsNav = new ResidentsNav(driver);
        ChecklistsPage checklistsPage = new ChecklistsPage(driver);

        assertTrue("Unable to click setup tab.",navBar.clickSetupButton());
        assertTrue("Unable to click company subtab.", navBar.clickCompanyButton());
        assertTrue("Unable to click residents tab.",companyFirstLevelNavigation.clickResidentsTab());
        assertTrue("Unable to click checklists subtab.", residentsNav.clickChecklistTab());
        assertTrue("Unable to click add checklist button.",checklistsPage.clickAddChecklist());
        String checklistName = RandomGenerator.randomName();
        assertTrue("Unable to enter checklist name in name field.",checklistsPage.enterChecklistName(checklistName));
        assertTrue("Unable to select move-in checklist type.",checklistsPage.selectMoveInChecklistType());
        String descriptionName = RandomGenerator.randomName();
        assertTrue("Unable to enter checklist description.",checklistsPage.enterChecklistDescription(descriptionName));
        assertTrue("Unable to click student occupancy checkbox.", checklistsPage.clickStudentOccupancy());
        String titleName = RandomGenerator.randomName();
        assertTrue("Unable to enter task title.",checklistsPage.enterTaskTitle(titleName));
        assertTrue("Unable to select written response action.",checklistsPage.selectWrittenResponseAction());
        assertTrue("Unable to click save checklist button.",checklistsPage.clickSaveButton());
        assertEquals("Success message text does not match after saving added checklist.","Checklist added successfully. ", checklistsPage.checkSuccessMessage());
        assertTrue("Unable to find added checklist.",checklistsPage.confirmAddedChecklist(checklistName));


    }
}
