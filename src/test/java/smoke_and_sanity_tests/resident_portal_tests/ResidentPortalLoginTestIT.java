package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;

import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;


import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;

public class ResidentPortalLoginTestIT extends BaseBrowserTest {

    public ResidentPortalLoginTestIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Xento123");
    }


    //manual test 2418682

    @Test
    public void shouldLoginToResidentPortal_whenUsingTestLoginCredentials() {

        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to verify Landing Page in Resident Portal.", navigationPage.residentInitialsAreVisibleAtTopRightCorner() );

    }
}
