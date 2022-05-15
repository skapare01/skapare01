package regression_tests.prospect_portal_regression_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebPageCheck;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckWebsiteNavigationsWhenOnWebsiteLandingPage extends BaseBrowserTest {
    public ShouldCheckWebsiteNavigationsWhenOnWebsiteLandingPage() {
        super("1automationRapid");
    }

    @Test
    public void ShouldCheckWebsitesFloorPlanDetailsWhenFloorPlansIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select 'AutomationPPUX' website.", webList.automationPpUxWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select/locate 'View Website' button.", webSet.viewWebsiteBtn());
        WebPageCheck webPage = new WebPageCheck(driver);
        assertTrue("Unable to locate Cookies Bar.", webPage.cookiesBar());
        assertTrue("Unable to accept website cookies.", webPage.clickIAcceptAllCookiesButton());
        assertTrue("Unable to select 'Floor Plans' menu option.", webPage.prospectPortalFloorPlans());
        assertTrue("Unable to select PPUXFloor Floor Plan Availability.", webPage.floorPlanAvailability());
        assertTrue("Unable to select Floor Plan unit.", webPage.availableUnitsSelection());
        assertTrue("Unable to select Lease Term Length.", webPage.leaseLengthSelection());
        assertTrue("Unable to select Apply Online.", webPage.applyOnlineBtn());
    }
    @Test
    public void ShouldCheckWebsitesPropertyAmenitiesWhenAmenitiesIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select 'AutomationPPUX' website.", webList.automationPpUxWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select/locate 'View Website' button.", webSet.viewWebsiteBtn());
        WebPageCheck webPage = new WebPageCheck(driver);
        assertTrue("Unable to locate Cookies Bar.", webPage.cookiesBar());
        assertTrue("Unable to accept website cookies.", webPage.clickIAcceptAllCookiesButton());
        assertTrue("Unable to locate 'Amenities' text link.", webPage.prospectPortalAmenities());
        assertTrue("Unable to locate 'Amenities' header text.", webPage.amenitiesHeaderText());
    }
}
