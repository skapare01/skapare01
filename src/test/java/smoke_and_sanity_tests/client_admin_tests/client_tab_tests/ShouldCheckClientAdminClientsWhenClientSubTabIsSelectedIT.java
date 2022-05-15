package smoke_and_sanity_tests.client_admin_tests.client_tab_tests;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckClientAdminClientsWhenClientSubTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckClientAdminClientsWhenClientSubTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "kHansen", "Xento123");
    }

    @Test
    public void ShouldCheckClientsSubTabAddNewOpportunityWhenClientIsSelected() {
        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'Clients' tab.", caNav.clickClientsTab());
        assertTrue("Unable to locate/select 'Pinetree Condos' client.", caNav.selectPineTreeCondos());
        ClientAdminClientProfile caClientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to switch to recently opened tab.", caClientProfile.switchToClientProfileTab());
        assertTrue("Unable to locate/select 'Opportunities' tab.", caClientProfile.selectClientHomeOpportunitiesTab());
        assertTrue("Unable to locate/select 'Create New Opportunity' button.", caClientProfile.clickCreateNewOpportunityBtn());
        assertTrue("Unable to locate 'Opportunity Info' header text.", caClientProfile.opportunityInfoHeaderText());
    }

    @Test
    public void ShouldCheckClientContractsWhenContractsIsSelect() {
        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);
        ClientAdminClientProfile caClientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to locate/select 'Clients' tab.", caNav.clickClientsTab());
        assertTrue("Unable to locate/select 'Pinetree Condos' client.", caNav.selectPineTreeCondos());
        assertTrue("Unable to switch to recently opened tab.", caClientProfile.switchToClientProfileTab());
        assertTrue("Unable to locate/select 'Contracts' sub-tab.", caNav.clickContractsSubTab());
        assertTrue("Unable to locate/select client contract.", caNav.selectClientContract());
        assertTrue("Unable to locate client contract details page.", caNav.contractDetailsPage());
    }
}
