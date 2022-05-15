package smoke_and_sanity_tests.client_admin_tests.client_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.add_client_subtab.AddClientPage;

import static org.junit.Assert.assertTrue;

public class AddClientTestsIT extends BaseBrowserTest {
    public AddClientTestsIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "wbell", "Xento123");
    }

    @Test
    //EntrataTest ID #3239452
    public void shouldOpenAddClientCurtain_whenTabIsSelectedUnderClientsTab() {
        ClientAdminNavBar clientAdmin = new ClientAdminNavBar(driver);
        assertTrue("Could not move cursor to Clients tab in ClientAdmin.", clientAdmin.moveToClientsTab());
        assertTrue("Could not click on Add Client subtab.", clientAdmin.clickAddClientSubtab());

        AddClientPage addClient = new AddClientPage(driver);
        assertTrue("Could not confirm Client Name text field is present in Add Client curtain page.", addClient.confirmClientNameTextFieldIsVisibleInAddClientPage());
    }
}
