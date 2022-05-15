package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.GoogleMyBusinessSubtab;

import static org.junit.Assert.assertTrue;

public class GoogleMyBusinessGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public GoogleMyBusinessGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 3008116

    @Test
    public void shouldDisplayGoogleMyBusinessTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Google Tab
        assertTrue("Failed to Navigate to 'Google' tab in Marketing Strategy Hub.",
                mshTab.clickGoogleTab());

        GoogleMyBusinessSubtab googleMB = new GoogleMyBusinessSubtab(driver);
        //Navigate to 'Google My Business' Sub-tab
        assertTrue("Failed to Navigate to 'My Business' sub-tab in Google tab.",
                googleMB.selectGoogleMyBusinessSubTab());
        //Verification of Google My Business tab elements and Filters
        assertTrue("Failed to locate 'Google My Business' logo in Google My Business tab.",
                googleMB.findMyBusinessPageLogoInGoogleMyBusiness());
        assertTrue("Failed to locate 'Property Search' filter in Google My Business tab.",
                googleMB.findPropertySearchFilterInGoogleMyBusiness());
        assertTrue("Failed to locate 'Free Service' title in Google My Business tab.",
                googleMB.findFreeServiceTitleInGoogleMyBusiness());
        assertTrue("Failed to locate 'Active' filter button in Google My Business tab.",
                googleMB.findActiveFilterInGoogleMyBusiness());
        assertTrue("Failed to locate 'Unsubscribed' filter button in Google My Business tab.",
                googleMB.findUnsubscribedFilterInGoogleMyBusiness());
        assertTrue("Failed to locate 'Feed Interrupted' filter button in Google My Business tab.",
                googleMB.findFeedInterruptedFilterInGoogleMyBusiness());
        //Verification of Google My Business Table Column headers
        assertTrue("Failed to find 'Property' column header in Google My Business tab.",
                googleMB.findPropertyColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Total Units' column header in Google My Business tab.",
                googleMB.findTotalUnitsColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Location' column header in Google My Business tab.",
                googleMB.findLocationColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Status' column header in Google My Business tab.",
                googleMB.findStatusColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Transmission' column header in Google My Business tab.",
                googleMB.findTransmissionLogColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Subscription' column header in Google My Business tab.",
                googleMB.findSubscriptionLogColumnHeaderInGoogleMyBusiness());
        assertTrue("Failed to find 'Update Images' column header in Google My Business tab.",
                googleMB.findUpdateImagesColumnHeaderInGoogleMyBusiness());
    }

}
