package smoke_and_sanity_tests.client_admin_tests.client_tab_tests;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckClientPropertiesWhenPropertiesSubTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckClientPropertiesWhenPropertiesSubTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "kHansen", "Xento123");
    }

    @Test
    public void ShouldCheckPropertiesFunctionalityWhenPropertiesSubTabIsSelectedIT() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        ClientAdminClientProfile caClientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to locate/select 'Clients' tab.", clientNavBar.clickClientsTab());
        assertTrue("Unable to locate/select 'Pinetree Condos' client.", clientNavBar.selectPineTreeCondos());
        // Client Profile //
        assertTrue("Unable to switch to recently opened tab.", caClientProfile.switchToClientProfileTab());
        // Client NavBar //
        assertTrue("Unable to locate/select Home 'Properties' sub-tab.", clientNavBar.clickHomeTabPropertiesSubTab());
        assertTrue("Unable to locate Properties details page.", clientNavBar.homePropertiesDetailPage());
    }

}
