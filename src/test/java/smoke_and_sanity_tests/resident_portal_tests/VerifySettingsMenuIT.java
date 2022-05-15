package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;
import page_objects.resident_portal_page_objects.ResidentPortalSettingsMenuPage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class VerifySettingsMenuIT extends BaseBrowserTest {
    public VerifySettingsMenuIT () {
        super("avanticresidential", RESIDENTPORTAL, "jeffrey12131962adams_gmail.com@r.com", "Xento123");
    }

    @Test
    public void shouldNavigateToSettingsMenu_whenClickedFromExtendedMenu() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", navigationPage.clickHamburgerMenu());
        assertTrue("Failed to click Settings button.", navigationPage.clickSettingsFromExtendedMenu());

        ResidentPortalSettingsMenuPage settingsMenuPage = new ResidentPortalSettingsMenuPage(driver);
        assertTrue("Failed to load Settings Menu page.", settingsMenuPage.confirmOnSettingsMenuPage());

    }

    @Test
    public void shouldNavigateToSettingsMenu_whenClickedFromRightBankMenu() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open right bank menu.", navigationPage.clickResidentProfileIconButton());
        assertTrue("Failed to click Settings button.", navigationPage.clickSettingsFromExtendedMenu());

        ResidentPortalSettingsMenuPage settingsMenuPage = new ResidentPortalSettingsMenuPage(driver);
        assertTrue("Failed to load Settings Menu page.", settingsMenuPage.confirmOnSettingsMenuPage());

    }
}
