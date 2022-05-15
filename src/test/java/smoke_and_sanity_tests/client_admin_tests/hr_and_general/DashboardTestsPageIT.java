package smoke_and_sanity_tests.client_admin_tests.hr_and_general;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.dashboard_tab.tests_subtab.DashboardTestsSubTab;
import static junit.framework.Assert.assertTrue;

public class DashboardTestsPageIT extends BaseBrowserTest {
    public DashboardTestsPageIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "Pjaiswal", "Xento123");
    }

    @Test
    public void shouldCheckTestsAddTestButton_whenAddTestButtonIsSelected() {
        ClientAdminNavBar clientNav = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select Dashboard 'Tests' sub-tab.", clientNav.clickDashboardTestsSubTab());
        DashboardTestsSubTab testSubTab = new DashboardTestsSubTab(driver);
        assertTrue("Unable to locate/select 'Add Test' button.", testSubTab.clickDashboardTestsAddTestButton());
        assertTrue("Unable to locate Test Details page.", testSubTab.viewAddTestDetailsPage());
    }
}