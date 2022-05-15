package smoke_and_sanity_tests.client_admin_tests.sales_tab_tests;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.sales_tab.ContractsSubTabNavigation;
import page_objects.client_admin_page_objects.sales_tab.LeadsSubTabNavigation;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckClientAdminSalesTabWhenSalesTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckClientAdminSalesTabWhenSalesTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "kHansen", "Xento123");
    }

    @Test
    public void ShouldCheckSalesContractSubTabWhenContractSubTabIsSelected() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'Sales' tab.",clientNavBar.clickSalesTab());
        assertTrue("Unable to locate/select 'Contracts' sub-tab.",clientNavBar.clickSalesContractSubTab());
        ContractsSubTabNavigation contractNav = new ContractsSubTabNavigation(driver);
        assertTrue("Unable to locate 'Contracts' page header text.",contractNav.contractsPageHeaderText());
    }

    @Test
    public void ShouldCheckSalesOpportunitiesSubTabWhenSalesOpportunitiesSubTabIsSelected() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select Leads 'Sales Opportunities' tab.",clientNavBar.clickLeadsSalesOpportunitiesSubTab());
        LeadsSubTabNavigation leadsNav = new LeadsSubTabNavigation(driver);
        assertTrue("Unable to locate 'Opportunities' page header text.", leadsNav.opportunitiesPageHeaderText());
    }

    @Test
    //Test for EntrataTest ID #3239466
    public void shouldConfirmPeopleOptionOpens_whenSelectedFromSalesLeadsTabsInClientAdmin() {
        ClientAdminNavBar clientAdmin = new ClientAdminNavBar(driver);
        assertTrue("Unable to hover over the Sales tab in ClientAdmin.", clientAdmin.hoverOverSalesTabInClientAdmin());
        assertTrue("Unable to hover over the Leads subtab under the Sales tab.", clientAdmin.hoverOverLeadsSubtabUnderSalesTabInClientAdmin());
        assertTrue("Unable to click on People option under Leads subtab.", clientAdmin.clickPeopleOptionUnderSalesLeadsTabsInClientAdmin());

        LeadsSubTabNavigation leadsNav = new LeadsSubTabNavigation(driver);
        assertTrue("Could not confirm that the Send Mass Email button is visible under the People option.", leadsNav.confirmSendMassEmailButtonIsVisible());
    }
}
