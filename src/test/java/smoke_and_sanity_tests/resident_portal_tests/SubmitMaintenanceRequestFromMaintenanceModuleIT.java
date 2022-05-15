package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;
import page_objects.resident_portal_page_objects.ResidentPortalMaintenancePage;
import page_objects.resident_portal_page_objects.ResidentPortalRequestMaintenancePage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class SubmitMaintenanceRequestFromMaintenanceModuleIT extends BaseBrowserTest {
    public SubmitMaintenanceRequestFromMaintenanceModuleIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Xento123");
    }

    @Test
    public void shouldAccessRequestMaintenanceOption_whenNavigatingToMaintenanceModule() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", navigationPage.clickHamburgerMenu());
        assertTrue("Failed to click to expand My Apartment menu.", navigationPage.expandMyApartmentMenu());
        assertTrue("Failed to confirm the My Apartment menu is expanded.", navigationPage.confirmMyApartmentMenuExpanded());
        assertTrue("Failed to click on Maintenance button in the Extended Menu.", navigationPage.clickMaintenanceFromExtendedMenu());

        ResidentPortalMaintenancePage maintenancePage = new ResidentPortalMaintenancePage(driver);
        assertTrue("Failed to load Maintenance Page.", maintenancePage.confirmOnMaintenancePage());
        assertTrue("Failed to click on Request Maintenance.", maintenancePage.clickOnRequestMaintenance());

        ResidentPortalRequestMaintenancePage requestMaintenancePage = new ResidentPortalRequestMaintenancePage(driver);
        assertTrue("Failed to load Request Maintenance Page.", requestMaintenancePage.confirmOnMaintenancePage());
    }
}
