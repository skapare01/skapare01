package smoke_and_sanity_tests.deploy_admin_tests.reports_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.reports_tab.hardware_config_subtab.HardwareConfigPage;
import static org.junit.Assert.assertTrue;

public class ConfirmHardwareConfigTabIT extends BaseBrowserTest {
    public ConfirmHardwareConfigTabIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2235910
    public void shouldLoadHardwareConfigPage_whenSubTabIsSelectedUnderReportsTab() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over Reports tab in DeployAdmin.", deployAdminNavBar.hoverOverReportsTab());
        assertTrue("Could not click on Hardware Config sub-tab under Reports tab.", deployAdminNavBar.clickHardwareConfig());

        HardwareConfigPage hardwareConfigPage = new HardwareConfigPage(driver);
        assertTrue("Could not confirm that Refresh Status button is present in Hardware Config page.", hardwareConfigPage.confirmRefreshStatusButtonIsVisible());
    }
}
