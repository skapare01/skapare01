package smoke_and_sanity_tests.marketing_hub_tests.craigslist_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.ActiveAdsSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.AdCreationSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.ArchivedAdsSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.CorporateTemplatesSubtab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CraigslistGeneralInterfaceVerificationIT extends BaseBrowserTest {


    public CraigslistGeneralInterfaceVerificationIT() {
        super("demoold");
    }

    //Manual Test ID 2257387

    @Test
    public void shouldVerifyCorporateTemplatesTabIsVisible_whenCraigslistProductEnabled() {
        EntrataNavBar mshTabNav = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                mshTabNav.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                mshTabNav.clickMarketingHubSubTab());

        MarketingHubNav clTab = new MarketingHubNav(driver);
        //Navigate to Craigslist Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Craigslist Ads' Tab.",
                clTab.clickCraigslistTab());

        CorporateTemplatesSubtab corpTemplatesTab = new CorporateTemplatesSubtab(driver);
        //Navigate to Craigslist Tab (Corporate Templates Sub-tab)
        assertTrue("Failed to navigate to 'Corporate Templates' Tab.",
                corpTemplatesTab.navigateToCorporateTemplatesTab());
        //Corporate Template Header Verification
        assertTrue("Failed to locate 'Corporate Templates' title.",
                corpTemplatesTab.corporateTemplateTitleVisible());
        assertTrue("Failed to locate 'New Template' button.",
                corpTemplatesTab.findCorporateNewTemplateButton());
        //Corporate Template "Filters" Verification
        assertTrue("Failed to select and/or find Corporate Template 'Sort By:' Filter.",
                corpTemplatesTab.findCorporateTemplatesSortFilter());
        assertTrue("Failed to find Corporate Template 'Sort By' Filter's first option 'Assigned Properties (most - Least).",
                corpTemplatesTab.findCorporateFilterOption1MostLeast());
        assertTrue("Failed to find Corporate Template 'Sort By' Filter's first option 'Assigned Properties (Least - Most).",
                corpTemplatesTab.findCorporateFilterOption2LeastMost());
        //Corporate Template "Ad" Elements Verification
        assertTrue("Failed to select first Corporate Template Ad in list.",
                corpTemplatesTab.selectFirstCorporateTemplateInList());
        assertTrue("Failed to find and verify 'Edit' button on Corporate Template Ad.",
                corpTemplatesTab.findEditButtonOnCorporateTemplateAd());
        assertTrue("Failed to find and verify 'Duplicate' button on Corporate Template Ad.",
                corpTemplatesTab.findDuplicateButtonOnCorporateTemplateAd());
        assertTrue("Failed to find and verify 'Delete' button on Corporate Template Ad.",
                corpTemplatesTab.findDeleteButtonOnCorporateTemplateAd());
    }

    @Test
    public void shouldVerifyAdCreationTabIsVisible_whenNavigatingCraigslistProduct() {
        EntrataNavBar mshTabNav = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                mshTabNav.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                mshTabNav.clickMarketingHubSubTab());

        MarketingHubNav clTab = new MarketingHubNav(driver);
        //Navigate to Craigslist Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Craigslist Ads' Tab.",
                clTab.clickCraigslistTab());

        AdCreationSubtab adCreationTab = new AdCreationSubtab(driver);
        //Navigate to Craigslist Tab (Ad Creation Sub-Tab)
        assertTrue("Failed to navigate to 'Ad Creation' sub-tab under 'Craigslist Ads'.",
                adCreationTab.navigateToAdCreationTab());
        //Ad Creation Tab Header Verifications
        assertTrue("Failed to locate the property filter on 'Ad Creation' tab.",
                adCreationTab.findPropertyFilter_AdCreation());
        assertEquals("The first Property in the Property Filter drop down is not selected by default.",
                adCreationTab.findDefaultPropertyInFilter_AdCreation(),
                adCreationTab.findFirstPropertyInFilterDropDown_AdCreation());
        assertTrue("Failed to locate 'Craigslist Help' link on page.",
                adCreationTab.findCraigslistHelpLink_AdCreation());
        assertTrue("Failed to locate Property level 'New Template' button on page.",
                adCreationTab.findPropertyNewTemplateButton());
        //Ad Creation Sort By Filter Verification
        assertTrue("Failed to select 'Sort By' filter 'Use Date'.",
                adCreationTab.findSortByFilter_UseDate());
        assertTrue("Failed to locate first filter option 'Use Date (oldest - latest).",
                adCreationTab.selectSortByFilterOption1_OldestLatest());
        assertTrue("Failed to locate second filter option 'Use Date (Latest - Oldest).",
                adCreationTab.selectSortByFilterOption2_LatestOldest());
        //Ad Creation - Property Template Verification
        assertTrue("Failed to select first 'Property Template' in list.",
                adCreationTab.selectFirstPropertyTemplateInList());
        assertTrue("Failed to locate the 'Last Used' date and time on Property Template.",
                adCreationTab.findDateTime_AdCreationPropertyTemplate());
        assertTrue("Failed to locate the 'Default Image' count on Property Template.",
                adCreationTab.findImageCount_AdCreationPropertyTemplate());
        assertTrue("Failed to locate the 'Create Ad' button on Property Template.",
                adCreationTab.findCreateAdButton_AdCreationPropertyTemplate());
        assertTrue("Failed to locate 'Edit' button on Property Template.",
                adCreationTab.findEditButton_AdCreationPropertyTemplate());
        assertTrue("Failed to locate 'Duplicate' button on Property Template.",
                adCreationTab.findDuplicateButton_AdCreationPropertyTemplate());
        assertTrue("Failed to locate 'Delete' button on Property Template.",
                adCreationTab.findDeleteButton_AdCreationPropertyTemplate());
        //Ad Creation - Corporate Template Verification
        assertTrue("Failed to select first 'Corporate Template' in list.",
                adCreationTab.selectFirstCorporateTemplateInList());
        assertTrue("Failed to locate 'Last Used' date and time on Corporate Template.",
                adCreationTab.findDateTime_AdCreationCorporateTemplate());
        assertTrue("failed to locate 'Default Image' count on Corporate Template.",
                adCreationTab.findImageCount_AdCreationCorporateTemplate());
        assertTrue("Failed to locate 'Create Ad' button on Corporate Template.",
                adCreationTab.findCreateAdButton_AdCreationCorporateTemplate());
        assertTrue("Failed to locate 'Duplicate' button on Corporate Template.",
                adCreationTab.findDuplicateButton_CorporateTemplateAdCreation());
    }

    @Test
    public void shouldVerifyActiveAdsTabIsVisible_whenNavigatingCraigslistProduct() {
        EntrataNavBar mshTabNav = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                mshTabNav.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                mshTabNav.clickMarketingHubSubTab());

        MarketingHubNav clTab = new MarketingHubNav(driver);
        //Navigate to Craigslist Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Craigslist Ads' Tab.",
                clTab.clickCraigslistTab());

        ActiveAdsSubtab activeAdsTab = new ActiveAdsSubtab(driver);
        //Navigate to Craigslist Tab (Active Ads Sub-Tab)
        assertTrue("Failed to Navigate to 'Active Ads' Tab.",
                activeAdsTab.navigateToActiveAdsTab());
        //Header Verification
        assertTrue("Failed to locate the property filter on 'Active Ads' tab.",
                activeAdsTab.findPropertyFilter_ActiveAds());
        assertEquals("The first Property in the Property Filter drop down is not selected by default.",
                activeAdsTab.findDefaultPropertyInFilter_ActiveAds(),
                activeAdsTab.findFirstPropertyInFilterDropDown_ActiveAds());
        assertTrue("Failed to locate 'Craigslist Help' link on page.",
                activeAdsTab.findCraigslistHelpLink_ActiveAds());
        //Sort By Filter Verification
        assertTrue("Failed to select 'Sort By' filter 'Creation Date'.",
                activeAdsTab.findSortByFilter_CreationDate());
        assertTrue("Failed to locate first filter option 'Creation Date (newest - oldest)'.",
                activeAdsTab.selectSortByFilterOption1_NewestOldest());
        assertTrue("Failed to locate second filter option 'Creation Date (oldest - newest)'.",
                activeAdsTab.selectSortByFilterOption2_OldestNewest());
        assertTrue("Failed to locate first filter option 'Views (most - least)'.",
                activeAdsTab.selectSortByFilterOption3_Views_MostLeast());
        assertTrue("Failed to locate second filter option 'Views (least - most)'.",
                activeAdsTab.selectSortByFilterOption4_Views_LeastMost());
        //Active Ad Specific Verification
        assertTrue("Failed to select first 'Active Ad' in list.",
                activeAdsTab.selectFirstActiveAdInList());
        assertTrue("Failed to locate the 'Created' datetime on 'Active Ad'.",
                activeAdsTab.findCreatedDateTime_ActiveAds());
        assertTrue("Failed to locate the 'Website Views' count on 'Active Ad'.",
                activeAdsTab.findWebsiteViewCount_ActiveAds());
        assertTrue("Failed to locate the 'Floor Plan' name on 'Active Ad'.",
                activeAdsTab.findFloorPlanName_ActiveAds());
        assertTrue("Failed to locate 'Ad Preview' button on 'Active Ad'.",
                activeAdsTab.findAdPreviewButton_ActiveAds());
        assertTrue("Failed to locate 'Archive Ad' button on 'Active Ad'.",
                activeAdsTab.findArchiveAdButton_ActiveAds());
    }

    @Test
    public void shouldVerifyArchivedAdsTabIsVisible_whenNavigatingCraigslistProduct() {
        EntrataNavBar mshTabNav = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                mshTabNav.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                mshTabNav.clickMarketingHubSubTab());

        MarketingHubNav clTab = new MarketingHubNav(driver);
        //Navigate to Craigslist Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Craigslist Ads' Tab.",
                clTab.clickCraigslistTab());

        ArchivedAdsSubtab archivedAdsTab = new ArchivedAdsSubtab(driver);
        //Navigate to Craigslist Tab (Archived Ads Sub-Tab)
        assertTrue("Failed to Navigate to 'Archived Ads' Tab.",
                archivedAdsTab.navigateToArchivedAdsTab());
        //Header Verification
        assertTrue("Failed to locate the property filter on 'Archived Ads' tab.",
                archivedAdsTab.findPropertyFilter_ArchivedAds());
        assertEquals("The first Property in the Property Filter drop down is not selected by default.",
                archivedAdsTab.findDefaultPropertyInFilter_ArchivedAds(),
                archivedAdsTab.findFirstPropertyInFilterDropDown_ArchivedAds());
        assertTrue("Failed to locate 'Craigslist Help' link on page.",
                archivedAdsTab.findCraigslistHelpLink_ArchivedAds());
        //Sort By Filter Verification
        assertTrue("Failed to select 'Sort By' filter 'Creation Date'.",
                archivedAdsTab.findSortByFilter_CreationDate());
        assertTrue("Failed to locate first filter option 'Creation Date (newest - oldest)'.",
                archivedAdsTab.selectSortByFilterOption1_NewestOldest());
        assertTrue("Failed to locate second filter option 'Creation Date (oldest - newest)'.",
                archivedAdsTab.selectSortByFilterOption2_OldestNewest());
        assertTrue("Failed to locate first filter option 'Views (most - least)'.",
                archivedAdsTab.selectSortByFilterOption3_Views_MostLeast());
        assertTrue("Failed to locate second filter option 'Views (least - most)'.",
                archivedAdsTab.selectSortByFilterOption4_Views_LeastMost());
        //Archived Ad Specific Verification
        assertTrue("Failed to select first 'Archived Ad' in list.",
                archivedAdsTab.selectFirstArchivedAdInList());
        assertTrue("Failed to locate the 'Created' datetime on 'Archived Ad'.",
                archivedAdsTab.findCreatedDateTime_ArchivedAds());
        assertTrue("Failed to locate the 'Website Views' count on 'Archived Ad'.",
                archivedAdsTab.findWebsiteViewCount_ArchivedAd());
        assertTrue("Failed to locate the 'Floor Plan' name on 'Archived Ad'.",
                archivedAdsTab.findFloorPlanName_ArchivedAds());
        assertTrue("Failed to locate 'Ad Preview' button on 'Archived Ad'.",
                archivedAdsTab.findAdPreviewButton_ArchivedAds());
    }

}