package smoke_and_sanity_tests.deploy_admin_tests.it_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.it_tab.maintenance_subtab.MaintenancePage;
import page_objects.deploy_admin_page_objects.it_tab.maintenance_subtab.add_maintenace_curtain.AddMaintenanceCurtainPage;
import static org.junit.Assert.assertTrue;

public class MaintenanceTabTestsIT extends BaseBrowserTest {
    public MaintenanceTabTestsIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2224923
    public void shouldConfirmMaintenanceSubtabUnderItTab_whenUserClicksOnAddMaintenanceButtonInMaintenanceTabPage() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover the IT tab in the DeployAdmin top navigation bar.", deployAdminNavBar.hoverOverItTab());
        assertTrue("Could not click on the Maintenance sub-tab under the IT tab.", deployAdminNavBar.clickMaintenanceSubtab());

        MaintenancePage maintenancePage = new MaintenancePage(driver);
        assertTrue("Could not click on the Add Maintenance button.", maintenancePage.clickAddMaintenanceButton());

        AddMaintenanceCurtainPage addMaintenanceCurtainPage = new AddMaintenanceCurtainPage(driver);
        assertTrue("Could not click on the cancel link button for the Add Maintenance Curtain page.", addMaintenanceCurtainPage.clickCancelLinkForAddMaintenanceCurtainPage());
    }
}
