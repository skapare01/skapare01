package smoke_and_sanity_tests.client_admin_tests.client_profile_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;

import static org.junit.Assert.assertTrue;

public class ValidateDocumentsTabInClientProfileIT extends BaseBrowserTest {
    public ValidateDocumentsTabInClientProfileIT() {
        super ("clientadmin", SitesEnum.CLIENTADMIN, "wbell", "Xento123");
    }

    @Test
    //EntrataTest test case ID #2243211
    public void shouldConfirmDocumentsPageExists_whenClickedOnInClientProfile() {
        ClientAdminNavBar clientAdminNav = new ClientAdminNavBar(driver);
        assertTrue("Could not enter CID for client in Quick Search field.", clientAdminNav.searchForSmokeAutomationRapidCID());
        assertTrue("Could not press Enter key in Quick Search field.", clientAdminNav.pressEnterInQuickSearch());
        assertTrue("Could not click on first search result from Quick Search.", clientAdminNav.openQuickSearchResult());

        ClientAdminClientProfile clientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Could not switch to new client profile tab in browser.", clientProfile.switchToClientProfileTab());
        assertTrue("Could not click on Info tab in client profile.", clientProfile.clickClientInfoTab());
        assertTrue("Could not click on Documents subtab under the Info tab.", clientProfile.clickClientDocumentsSubTab());
        assertTrue("Could not click on Add Documents button.", clientProfile.clickAddDocumentsButton());
        assertTrue("Could not confirm that green Save button is present for Add Documents window.", clientProfile.confirmGreenSaveButtonIsPresentForAddDocumentWindow());
    }
}
