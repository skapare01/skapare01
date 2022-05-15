package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalMessagesAndAlertsPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class VerifyMessagesAndAlertsIT extends BaseBrowserTest {
    public VerifyMessagesAndAlertsIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Xento123");
    }

    @Test
    public void shouldNavigateToMessagesAndAlerts_whenClickedFromExtendedMenu() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", navigationPage.clickHamburgerMenu());
        assertTrue("Failed to click on Messages & Alerts button.", navigationPage.clickMessagesAndAlertsFromExtendedMenu());

        ResidentPortalMessagesAndAlertsPage messagesAndAlertsPage = new ResidentPortalMessagesAndAlertsPage(driver);
        assertTrue("Failed to load Messages & Alerts page.", messagesAndAlertsPage.confirmOnMessagesAndAlertsPage());

    }
}
