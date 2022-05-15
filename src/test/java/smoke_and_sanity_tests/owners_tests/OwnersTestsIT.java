package smoke_and_sanity_tests.owners_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.owners_subtab.OwnersPage;

import static org.junit.Assert.assertTrue;

public class OwnersTestsIT extends BaseBrowserTest {

    public OwnersTestsIT() {
        super("avantic");
    }

    @Test //TC: 3241113
    public void shouldFindAddOwnerForm_whenAddOwnerButtonIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        OwnersPage ownersPage = new OwnersPage(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Owners tab.", navBar.clickOwnersTab());
        assertTrue("Could not click Add Owner button.", ownersPage.addOwnerButtonClick());
        assertTrue("Could not find Add Owner form.", ownersPage.addOwnerFormVisible());
    }

    @Test //TC: 3241118
    public void shouldFindViewOwnerPage_whenAnOwnerIsClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        OwnersPage ownersPage = new OwnersPage(driver);
        assertTrue("Could not find Accounting tab.", navBar.hoverAccountingTab());
        assertTrue("Could not select Owners tab.", navBar.clickOwnersTab());
        assertTrue("Could not select an Owner.", ownersPage.ownerSelect());
        assertTrue("Could not find View Owner page.", ownersPage.ownerPageVisible());
    }
}
