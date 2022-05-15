package smoke_and_sanity_tests.marketing_hub_tests.facebook_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_lead_ads_subtab.FaceBookLeadAdsSubtab;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FaceBookLeadAdsGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public FaceBookLeadAdsGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2807219

    @Test
    public void shouldDisplayFaceBookLeadAdsUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Facebook Lead Ads Subtab.
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Facebook Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());

        FaceBookLeadAdsSubtab fbLeadAds = new FaceBookLeadAdsSubtab(driver);
        //Navigate to Facebook "Lead Ads" sub-tab in Facebook tab.
        assertTrue("Failed to Navigate to 'Lead Ads' sub-tab in Facebook tab.",
                fbLeadAds.selectLeadAdsSubTabInFacebookLeadAds());
        //Verification of Facebook Lead Ads elements and Filters
        assertTrue("Failed to locate 'Lead Ads' logo in Facebook Lead Ads tab.",
                fbLeadAds.findLeadAdsLogoInFacebookLeadAds());
        assertTrue("Failed to locate 'Property Search' in Facebook Lead Ads tab.",
                fbLeadAds.findPropertySearchFilterInFacebookLeadAds());
        assertTrue("Failed to locate 'Active' filter in Facebook Lead Ads tab.",
                fbLeadAds.findActiveFilterInFacebookLeadAds());
        assertTrue("Failed to locate 'All' filter in Facebook Lead Ads tab.",
                fbLeadAds.findAllFilterInFacebookLeadAds());
        assertTrue("Failed to locate 'Disabled' filter in Facebook Lead Ads tab.",
                fbLeadAds.findDisabledFilterInFacebookLeadAds());
        assertEquals("Failed to confirm 'All' filter is selected by default in Facebook Lead Ads tab.",
                "All", fbLeadAds.getTextOfDefaultFilterSelectedInFacebookLeadAds());
        //Verification of Facebook Lead Ads Table Column headers
        assertTrue("Failed to find 'Property' column header in Facebook Lead Ads tab.",
                fbLeadAds.findPropertyColumnHeaderInFacebookLeadAds());
        assertTrue("Failed to find 'Location' column header in Facebook Lead Ads tab.",
                fbLeadAds.findLocationColumnHeaderInFacebookLeadAds());
        assertTrue("Failed to find 'Status' column header in Facebook Lead Ads tab.",
                fbLeadAds.findStatusColumnHeaderInFacebookLeadAds());
        assertTrue("Failed to find 'Subscription Logs' column header in Facebook Lead Ads tab.",
                fbLeadAds.findSubscriptionLogsColumnHeaderInFacebookLeadAds());
    }


}
