package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalContactPropertyPage;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class VerifyContactPropertyFormIT extends BaseBrowserTest {
    public VerifyContactPropertyFormIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Xento123");
    }

    @Test
    public void shouldNavigateToContactPropertyForm_whenClickedFromExtendedMenu() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", navigationPage.clickHamburgerMenu());
        assertTrue("Failed to click on Contact Property button.", navigationPage.clickContactPropertyFromExtendedMenu());

        ResidentPortalContactPropertyPage contactPropertyPage = new ResidentPortalContactPropertyPage(driver);
        assertTrue("Failed to load Contact Property Page.", contactPropertyPage.confirmOnContactPropertyPage());

    }
}
