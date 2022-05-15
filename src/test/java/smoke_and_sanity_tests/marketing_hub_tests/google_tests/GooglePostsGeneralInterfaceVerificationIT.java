package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Ignore;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab.GooglePostsSubtab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GooglePostsGeneralInterfaceVerificationIT extends BaseBrowserTest {

    public GooglePostsGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2579367

    @Ignore //TODO Ignoring tests until product team makes product more reliable and testable. 4/6/22
    @Test
    public void shouldConfirmGooglePostTabPropertyFilterAndGooglePostsCardUIVisible_whenContractEnabled() {
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

        GooglePostsSubtab googleP = new GooglePostsSubtab(driver);
        //Navigate to Google Posts Sub-tab in Google Tab
        assertTrue("Failed to Navigate to 'Google Posts' sub-tab in Google tab.",
                googleP.clickGooglePostsSubTab());
        //Verification of Google Posts tab elements and Filters
        assertTrue("Failed to locate 'Property Search' filter in Google Posts tab.",
                googleP.findPropertySearchFilterInGooglePosts());
        assertEquals("Failed to confirm text of selected property is visible in filter in Google Posts tab.",
                "Birchwood",
                googleP.getTextOfSelectedPropertyInFilterInGooglePosts());
        assertEquals("Failed to confirm that first Property is selected by default in Google Posts tab.",
                googleP.getTextOfSelectedPropertyInFilterInGooglePosts(),
                googleP.getTextOfFirstPropertyInPropertyFilterInGooglePosts());
        assertTrue("Failed to locate and select 'Google Posts' screen in Google Posts tab.",
                googleP.selectGooglePostScreen());
        assertTrue("Failed to locate 'Google Posts' logo in Google Posts tab.",
                googleP.findMyBusinessPageLogoInGooglePosts());
        assertTrue("Failed to locate 'Google Posts' Name in Google Posts tab.",
                googleP.findGooglePostsNameInGooglePosts());
        assertTrue("Failed to locate 'Google Account' Account Name in Google Posts tab.",
                googleP.findGoogleAccountNameInGooglePosts());
        assertTrue("Failed to locate 'Google Account' Account Image in Google Posts tab.",
                googleP.findGoogleAccountImageInGooglePosts());
        //Verification of Google Account link and New tab
        assertTrue("Failed to locate and click 'Google My Business' Account Name Hyperlink in Google Posts tab.",
                googleP.clickBusinessAccountHyperLinkInGooglePosts());
        assertTrue("Failed to confirm new tab opened from Google Account hyperlink in Google Posts tab.",
                googleP.confirmNewTabOpensForGoogleAccountInGooglePosts());
        assertTrue("Failed to return to original Entrata Google Posts tab from new tab.",
                googleP.returnToOriginalGooglePostsTabInGooglePosts());
        //Verification of Google Posts Card
        assertEquals("Failed to confirm 'Google Posts' card's title is 'Google Posts' in Google Posts tab.",
                "Google Posts",
                googleP.getTextOfGooglePostsCardTitleInGooglePosts());
        assertTrue("Failed to locate 'Create Post' button in Google Posts tab.",
                googleP.findCreatePostsButtonInGooglePosts());
        //Verification of Google Posts Card Table Column headers
        assertTrue("Failed to find 'Image' column in Google Posts tab.",
                googleP.findImageColumnInGooglePosts());
        assertTrue("Failed to find 'Post Text' column header in Google Posts tab.",
                googleP.findPostTextColumnHeaderInGooglePosts());
        assertTrue("Failed to find 'Post Date' column header in Google Posts tab.",
                googleP.findPostDateColumnHeaderInGooglePosts());
        assertTrue("Failed to find 'End Date' column header in Google Posts tab.",
                googleP.findEndDateColumnHeaderInGooglePosts());
        assertTrue("Failed to find 'Created By' column header in Google Posts tab.",
                googleP.findCreatedByColumnHeaderInGooglePosts());
        assertTrue("Failed to find 'Views' column header in Google Posts tab.",
                googleP.findViewsColumnHeaderInGooglePosts());
        assertTrue("Failed to find 'Edit' icon in Google Posts card in Google Posts tab.",
                googleP.findEditIconColumnInGooglePosts());
    }

    @Ignore //TODO Ignoring tests until product team makes product more reliable and testable. 4/6/22
    @Test
    public void shouldConfirmGooglePostTabActivityGraphCardUIVisible_whenContractEnabled() {
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

        GooglePostsSubtab googleP = new GooglePostsSubtab(driver);
        //Navigate to Google Posts Sub-tab in Google Tab
        assertTrue("Failed to Navigate to 'Google Posts' sub-tab in Google tab.",
                googleP.clickGooglePostsSubTab());
        //Verification of Google Posts tab "Activity Graph" card elements
        assertTrue("Failed to locate 'Post Activity Graph' card in Google Posts tab.",
                googleP.findPostActivityGraphCardInGooglePosts());
        assertTrue("Failed to locate 'Post Activity Graph' card Graph in Google Posts tab.",
                googleP.findPostActivityGraphInGooglePosts());
        assertTrue("Failed to locate 'Views' in 'Post Activity Graph' card in Google Posts tab.",
                googleP.findPostActivityGraphCardViewsInGooglePosts());
        //Google "Posts Activity Graph" Card Date Filter Verification
        assertTrue("Failed to locate 'Post Activity Graph' card 'Date' filter in Google Posts tab.",
                googleP.findPostActivityGraphCardDateFilterInGooglePosts());
        assertTrue("Failed to locate first filter option 'Last 7 Days' in Activity Graph Card.",
                googleP.selectSortByFilterOption1SevenDaysInGooglePosts());
        assertTrue("Failed to locate second filter option 'Last 30 Days' in Activity Graph Card.",
                googleP.selectSortByFilterOption2ThirtyDaysInGooglePosts());
        assertTrue("Failed to locate third filter option 'Last 3 Months' in Activity Graph Card.",
                googleP.selectSortByFilterOption3ThreeMonthsInGooglePosts());
        assertTrue("Failed to locate fourth filter option 'Last 6 Months' in Activity Graph Card.",
                googleP.selectSortByFilterOption4SixMonthsInGooglePosts());
        assertTrue("Failed to locate fifth filter option 'Last Year' in Activity Graph Card.",
                googleP.selectSortByFilterOption5OneYearInGooglePosts());
    }

}
