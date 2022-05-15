package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.GoogleLeadAdsSubtab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleLeadAdsBasicFunctionalityVerificationIT extends BaseBrowserTest {

    //Constructor
    public GoogleLeadAdsBasicFunctionalityVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 3175858

    @Test
    public void shouldVerifyPropertySearchResultsInGoogleLeadAds_whenPropertyNameEntered() {
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
        //Verification of Google Lead Ads basic functionality and messaging
        assertTrue("Failed to locate and enter text into 'Property Search' box in Google Lead Ads tab.",
                googleLA.sendTextToPropertySearchFilterInGoogleLeadAds("Birchwood"));
        assertEquals("Failed to confirm first property in table matches the searched property in Google Lead Ads tab.",
                "Birchwood",
                googleLA.confirmFirstPropertyMatchesSearchInGoogleLeadAds());
    }

    @Test
    public void shouldVerifyStepByStepInstructionsLinkOpensNewTab_whenClicked() {
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
        //Verification of Step-by-Step Instructions Link and New Tab.
        assertTrue("Failed to locate and click 'Google's step-by-step instructions' Hyperlink in Google Lead Ads sub-tab.",
                googleLA.clickStepByStepHyperLinkInGoogleLeaAds());
        assertTrue("Failed to confirm new tab opened from 'Google's step-by-step instructions' hyperlink in Google Lead Ads sub-tab.",
                googleLA.confirmNewTabOpensForGoogleStepByStepInstructions());
        assertTrue("Failed to return to original Entrata Google Lead Ads tab from new tab.",
                googleLA.returnToOriginalGoogleLeadAdsTab());
    }

    @Test
    public void shouldVerifyCorrectMessagesPopulateInGoogleLeadAds_whenCorrectButtonsAreClicked() {
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
        //Verification of 'Copy Webhook URL' Button  in Google Lead Ads
        assertTrue("Failed to locate and click 'Copy Webhook URL' button in Google Lead Ads sub-tab.",
                googleLA.clickCopyWebhookButtonInGoogleLeadAds());
        assertEquals("Failed to confirm Webhook Copy success message displayed in Google Lead Ads tab.",
                "Webhook successfully copied to clipboard!",
                googleLA.confirmWebhookSuccessfullyCopiedMessageInGoogleLeadAds());
        //Verification of 'Copy Key' Button in Google Lead Ads
        assertTrue("Failed to locate and click 'Copy' icon under 'Key' column in Google Lead Ads sub-tab.",
                googleLA.clickCopyKeyButtonInGoogleLeadAds());
        assertEquals("Failed to confirm Key Copy success message displayed in Google Lead Ads tab.",
                "Key successfully copied to clipboard!",
                googleLA.confirmKeySuccessfullyCopiedMessageInGoogleLeadAds());
        //Verification for 'Generate New Key' Button in Google Lead Ads
        assertTrue("Failed to locate and click 'Generate New Key' button in Google Lead Ads sub-tab.",
                googleLA.clickGenerateNewKeyButtonInGoogleLA());
        assertTrue("Failed to locate and confirm 'Generate New Key' modal populated in Google Lead Ads sub-tab.",
                googleLA.confirmNewKeyModalPopulatesInGoogleLeadAds());
        assertTrue("Failed to locate and confirm 'Cancel' button is visible in 'Generate New Key' modal in Google Lead Ads sub-tab.",
                googleLA.findCancelButtonInGenerateNewKeyModalInGoogleLA());
        assertTrue("Failed to locate and confirm 'Yes, Proceed' button is visible in 'Generate New Key' modal in Google Lead Ads sub-tab.",
                googleLA.findYesProceedButtonInGenerateNewKeyModalInGoogleLA());
        assertTrue("Failed to locate and click 'Cancel' in 'Generate New Key' modal in Google Lead Ads sub-tab.",
                googleLA.clickCancelButtonInGenerateNewKeyModalInGoogleLA());
        assertTrue("Failed to confirm 'New Key Generated' did not populate after clicking 'Cancel' in Google Lead Ads sub-tab.",
                googleLA.confirmNewKeyGeneratedMessageNotVisibleInGoogleLeadAds());
        assertTrue("Failed to locate and click 'Generate New Key' button in Google Lead Ads sub-tab.",
                googleLA.clickGenerateNewKeyButtonInGoogleLA());
        assertTrue("Failed to locate and click 'Yes, Proceed' button in 'Generate New Key' modal in Google Lead Ads sub-tab.",
                googleLA.clickYesButtonProceedInGenerateNewKeyModalInGoogleLA());
        assertEquals("Failed to confirm Key Copy success message displayed in Google Lead Ads tab.",
                "New key successfully generated!",
                googleLA.confirmNewKeyGeneratedMessageIsVisibleInGoogleLeadAds());
    }

}
