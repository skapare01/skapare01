package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.GoogleLeadAdsSubtab;

import static org.junit.Assert.assertTrue;

public class GoogleLeadAdsGeneralInterfaceVerificationIT extends BaseBrowserTest {

    public GoogleLeadAdsGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 3175992

    @Test
    public void shouldDisplayGoogleLeadAdsTabUI_whenContractEnabled() {
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

        GoogleLeadAdsSubtab googleLA = new GoogleLeadAdsSubtab(driver);
        //Navigate to Google Lead Ads Sub-tab
        assertTrue("Failed to Navigate to 'Lead Ads' sub-tab in Google tab.",
                googleLA.selectGoogleLeadAdsSubTab());
        //Verification of Google Lead Ads tab elements and Filters
        assertTrue("Failed to locate 'Google Lead Ads' logo in Google Lead Ads tab.",
                googleLA.findLeadAdsPageLogoInGoogleLeadAds());
        assertTrue("Failed to locate 'Property Search' in Google Lead Ads tab.",
                googleLA.findPropertySearchFilterInGoogleLeadAds());
        assertTrue("Failed to locate 'Step-By-Step Instructions' link in Google Lead Ads tab.",
                googleLA.findStepByStepInstructionsInGoogleLeadAds());
        assertTrue("Failed to locate 'Copy Webhook URL' button in Google Lead Ads tab.",
                googleLA.findCopyWebhookButtonInGoogleLeadAds());
        //Verification of Google Lead Ads Table Column headers
        assertTrue("Failed to find 'Property' column header in Google Lead Ads tab.",
                googleLA.findPropertyColumnHeaderInGoogleLeadAds());
        assertTrue("Failed to find 'Location' column header in Google Lead Ads tab.",
                googleLA.findLocationColumnHeaderInGoogleLeadAds());
        assertTrue("Failed to find 'Status' column header in Google Lead Ads tab.",
                googleLA.findStatusColumnHeaderInGoogleLeadAds());
        assertTrue("Failed to find 'Key' column header in Google Lead Ads tab.",
                googleLA.findKeyColumnHeaderInGoogleLeadAds());
        assertTrue("Failed to find 'Copy' icon under 'Key' column in Google Lead Ads tab.",
                googleLA.findCopyButtonUnderKeyColumnInGoogleLeadAds());
        assertTrue("Failed to find 'Generate New Key' button in Google Lead Ads tab.",
                googleLA.findGenerateNewKeyButtonInGoogleLA());
    }
}
