package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.tools.*;
import page_objects.entrata_page_objects.residents_tab.bulk_unit_assignment_subtab.BulkUnitAssignmentsPage;

import static org.junit.Assert.*;

public class ShouldCheckStudentModulesInResidentsTabWhenStudentPropertyIsActiveIT extends BaseBrowserTest {
    public ShouldCheckStudentModulesInResidentsTabWhenStudentPropertyIsActiveIT(){
        super( "dallasentratatest9"); }

@Test
    public void shouldCheckBasicVisibilityOfBUA_WhenClientHasActiveStudentProperty(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    BulkUnitAssignmentsPage bulkUnitAssignments = new BulkUnitAssignmentsPage(driver);
    assertTrue("Unable to click residents tab.",nav.clickResidentsTab());
    assertTrue("Unable to click bulk unit assignment subtab.",bulkUnitAssignments.clickBulkUnitAssignment());
    assertTrue("Unable to find unit mix element.",bulkUnitAssignments.verifyVisibilityOfUnitMix());
    assertTrue("Unable to click send messaging button.",bulkUnitAssignments.clickSendMessaging());
    assertTrue("Unable to click send notifications button.", bulkUnitAssignments.clickSendNotifications());
    assertTrue("Unable to see status dropdown on send notifications screen.", bulkUnitAssignments.confirmVisiblityOfStatusDropdown());
}

@Test
    public void shouldConfirmBulkPlaceOnNoticeOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkPlaceOnNoticePage bulkPlaceOnNotice = new BulkPlaceOnNoticePage(driver);
    assertTrue("Unable to click residents tab.",nav.clickResidentsTab());
    assertTrue("Unable to find tools icon.",tools.moveToToolSIcon());
    assertTrue("Unable to click bulk place on notice button.", tools.clickOnBulkPlaceOnNotice());
    assertTrue("Unable to find search button on bulk place on notice screen.",bulkPlaceOnNotice.ConfirmVisibilityOfSearchButton());}

@Test
public void shouldConfirmBulkMoveInOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkMoveInPage bulkMoveIn = new BulkMoveInPage(driver);
    assertTrue("Unable to click residents tab.",nav.clickResidentsTab());
    assertTrue("Unable to find tools icon.",tools.moveToToolSIcon());
    assertTrue("Unable to click bulk move-in button.", tools.clickBulkMoveIN());
    assertTrue("Unable to locate search button on bulk move-in screen.", bulkMoveIn.confirmVisibilityOfSearchButton());}

@Test
public void shouldConfirmBulkMoveOutOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkMoveOutPage bulkMoveOut = new BulkMoveOutPage(driver);
    assertTrue("Unable to click residents tab.",nav.clickResidentsTab());
    assertTrue("Unable to find tools icon.",tools.moveToToolSIcon());
    assertTrue("Unable to click bulk move-out button.", tools.clickBulkMoveOut());
    assertTrue("Unable to locate search button on bulk move-out screen.", bulkMoveOut.confirmVisibilityOfSearchButton());}

@Test
    public void shouldConfirmMoveInBoardOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage icon = new AllResidentsPage(driver);
    MoveInBoardPage moveInBoardPage = new MoveInBoardPage(driver);
    assertTrue("Unable to click residents tab.",nav.clickResidentsTab());
    assertTrue("Unable to find move in board icon on side bar.",icon.moveToMoveInBoardIcon());
    assertTrue("Unable to click move-in board link.",icon.clickMoveInBoardLink());
    assertTrue("Unable to find download csv link on move-in board screen.", moveInBoardPage.confirmVisibilityOfDownloadLink());

}
@Test
public void shouldConfirmMoveOutBoardOpens_WhenUserClicksOnLink() {
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage icon = new AllResidentsPage(driver);
    MoveOutBoardPage moveOutBoardPage = new MoveOutBoardPage(driver);
    assertTrue("Unable to click residents tab.", nav.clickResidentsTab());
    assertTrue("Unable to find move in board icon on side bar.", icon.moveToMoveInBoardIcon());
    assertTrue("Unable to click move-out board link", icon.clickMoveOutBoardLink());
    assertTrue("Unable to find download csv link on move-out board screen", moveOutBoardPage.confirmVisibilityOfDownloadLink());
}


}

