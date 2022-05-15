package smoke_and_sanity_tests.client_admin_tests.reports_tab_tests;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckReportsWhenReportsTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckReportsWhenReportsTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "khansen", "Xento123");
    }

    @Test
    public void ShouldCheckLegacyReportsWhenLegacyReportsTabIsSelected() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate 'Reports' tab.", clientNavBar.selectReportsTab());
        assertTrue("Unable to locate 'Legacy Reports' sub-tab.", clientNavBar.selectLegacyReportsSubTab());
        assertTrue("Unable to locate 'Legacy Reports' menu.", clientNavBar.legacyReportsMenu());
    }

    @Test
    public void ShouldCheckReportsHomeSubTabWhenLegacyHomeSubTabIsSelected() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        ClientAdminClientProfile caClientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to locate/select 'Clients' tab.", clientNavBar.clickClientsTab());
        assertTrue("Unable to locate/select 'Pinetree Condos' client.", clientNavBar.selectPineTreeCondos());
        // Client Profile //
        assertTrue("Unable to switch to recently opened tab.", caClientProfile.switchToClientProfileTab());
        // Client NavBar //
        assertTrue("Unable to locate/select 'Reports' tab.", clientNavBar.selectReportsTab());
        assertTrue("Unable to locate/select Reports 'Home' sub-tab.", clientNavBar.clickReportsHomeSubTab());
        assertTrue("Unable to locate Home Reports page.", clientNavBar.reportsHomePage());
    }
}
