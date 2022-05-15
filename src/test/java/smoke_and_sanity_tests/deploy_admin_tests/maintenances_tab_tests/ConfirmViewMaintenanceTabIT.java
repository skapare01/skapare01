package smoke_and_sanity_tests.deploy_admin_tests.maintenances_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.ViewMaintenancePage;
import static org.junit.Assert.assertTrue;

public class ConfirmViewMaintenanceTabIT extends BaseBrowserTest {
    public ConfirmViewMaintenanceTabIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2224975
    public void shouldValidateViewMaintenancePageLoads_whenSelectedUnderMaintenancesTab() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Maintenances tab in DeployAdmin.", deployAdminNavBar.hoverOverMaintenancesTab());
        assertTrue("Could not click on the View Maintenance sub-tab under the Maintenances tab.", deployAdminNavBar.clickViewMaintenanceSubtab());

        ViewMaintenancePage viewMaintenancePage = new ViewMaintenancePage(driver);
        assertTrue("Could not click on the HA Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickHaMaintenanceSubtab());
        assertTrue("Could not click on the Standard Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickStandardMaintenanceSubtab());
        assertTrue("Could not click on the Payments Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickPaymentsMaintenanceSubtab());
        assertTrue("Could not click on the ResidentInsure Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickResidentInsureMaintenanceSubtab());
        assertTrue("Could not click on the Rapid Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickRapidMaintenanceSubtab());
        assertTrue("Could not click on the Shared Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickSharedMaintenanceSubtab());
        assertTrue("Could not click on the PdfService Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickPdfServiceMaintenanceSubtab());
        assertTrue("Could not click on the PuppeteerService Maintenance sub-tab under the View Maintenance tab.", viewMaintenancePage.clickPuppeteerServiceMaintenanceSubtab());
    }
}
