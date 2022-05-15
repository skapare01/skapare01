package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.resident_portal_page_objects.ResidentPortalLandingPage;
import page_objects.resident_portal_page_objects.ResidentPortalNavigationPage;
import page_objects.resident_portal_page_objects.ResidentPortalMakePaymentPage;
import page_objects.resident_portal_page_objects.ResidentPortalPaymentsPage;

import static base_tests.SitesEnum.RESIDENTPORTAL;
import static org.junit.Assert.assertTrue;


public class MakePaymentFromPaymentsModuleIT extends BaseBrowserTest {
    public MakePaymentFromPaymentsModuleIT() {
        super("hogwartz", RESIDENTPORTAL, "kathimack_test.lcl@r.com", "Xento123");
    }

    //manual test 3250757

    @Test
    public void shouldAccessMakePaymentOption_whenNavigatingToMakePayment() {
        ResidentPortalLandingPage landingPage = new ResidentPortalLandingPage(driver);
        assertTrue("Failed to find Property Name label.", landingPage.confirmLoggedIntoProperty());

        ResidentPortalNavigationPage navigationPage = new ResidentPortalNavigationPage(driver);
        assertTrue("Failed to open hamburger 'Main Menu'.", navigationPage.clickHamburgerMenu());
        assertTrue("Failed to click on the Payments module in the main menu", navigationPage.clickPaymentsFromMainMenu());

        ResidentPortalPaymentsPage paymentsPage = new ResidentPortalPaymentsPage(driver);
        assertTrue("Failed to click on 'Make Payment' button", paymentsPage.clickMakePaymentButton());

        ResidentPortalMakePaymentPage makePaymentPage = new ResidentPortalMakePaymentPage(driver);
        assertTrue("Failed to see page label 'Make a Payment'.", makePaymentPage.makeAPaymentPageLabelUpperRightCorner());
    }


}
