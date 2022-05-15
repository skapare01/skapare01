package smoke_and_sanity_tests.reputation_advisor_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.ReputationAdvisorNav;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab.ReviewsDashboardSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab.ReviewsSubtab;

import static org.junit.Assert.assertTrue;

public class ReputationAdvisorGeneralInterfaceVerificationFreeContractEnabledIT extends BaseBrowserTest{
    public ReputationAdvisorGeneralInterfaceVerificationFreeContractEnabledIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldDisplayReviewsDashboardUI_whenFreeContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        ReviewsDashboardSubtab dashTab = new ReviewsDashboardSubtab(driver);
        //Navigate to Reviews Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to locate and select the 'Reviews' tab in Reputation sub-tab.",
                repTab.selectReviewsTab());
        assertTrue("Failed to confirm the 'Dashboard' sub-tab is selected by default in Reviews tab.",
                dashTab.confirmDashboardTabSelectedByDefaultInReviewsTab());
        assertTrue("Failed to confirm the 'Dashboard' sub-tab is visible in Reviews tab.",
                dashTab.findDashboardSubtabInReviewsTab());
        //Verification of Reviews Dashboard tab filters for Free version
        assertTrue("Failed to locate the 'Property' filter in Reviews Dashboard sub-tab.",
                dashTab.findPropertyFilterInReviewsDashboard());
        assertTrue("Failed to locate the 'From Date' selector in Reviews Dashboard sub-tab.",
                dashTab.findFromDateSelectorInReviewsDashboard());
        assertTrue("Failed to locate the 'To Date' selector in Reviews Dashboard sub-tab.",
                dashTab.findToDateSelectorInReviewsDashboard());
        assertTrue("Failed to locate the 'Portfolio' filter in Reviews Dashboard sub-tab.",
                dashTab.findPortfolioFilterInReviewsDashboard());
        assertTrue("Failed to locate the 'Year' filter in Reviews Dashboard sub-tab.",
                dashTab.findYearFilterInReviewsDashboard());
        assertTrue("Failed to locate the 'Period' filter in Reviews Dashboard sub-tab.",
                dashTab.findPeriodFilterInReviewsDashboard());
        //Verification of Reviews Dashboard Total Numbers
        assertTrue("Failed to locate the 'Total Reviews' number in Reviews Dashboard sub-tab.",
                dashTab.findTotalReviewsNumberInReviewsDashboard());
        assertTrue("Failed to locate the 'Unresponded' number in Reviews Dashboard sub-tab.",
                dashTab.findUnrespondedNumberInReviewsDashboard());
        assertTrue("Failed to locate the 'Unpublished' number in Reviews Dashboard sub-tab.",
                dashTab.findUnpublishedNumberInReviewsDashboard());
        //Verify "No Attributes" number is NOT visible for Free version.
        assertTrue("Failed to confirm the 'No Attributes' number is NOT visible in Reviews Dashboard sub-tab.",
                dashTab.confirmNoAttributesNumberNotVisibleInReviewsDashboard());
    }

    @Test
    public void shouldDisplayReviewsTabUI_whenFreeContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        ReviewsSubtab revTab = new ReviewsSubtab(driver);
        //Navigate to Reviews Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Reviews' tab in Reputation sub-tab.",
                repTab.confirmVisibilityOfReviewsTab());
        assertTrue("Failed to locate and select the 'Reviews' sub-tab under the Reviews tab.",
                revTab.selectReviewsSubtabInReviewsTab());
        //Verification of Reviews sub-tab Filters for Free Version
        assertTrue("Failed to locate the 'Property' filter in Reviews sub-tab.",
                revTab.findPropertyFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'From Date' selector in Reviews sub-tab.",
                revTab.findFromDateSelectorInReviewsSubTab());
        assertTrue("Failed to locate the 'To Date' selector in Reviews sub-tab.",
                revTab.findToDateSelectorInReviewsSubTab());
        assertTrue("Failed to locate the 'Review Search Field' filter in Reviews sub-tab.",
                revTab.findReviewSearchFieldFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'Ratings' filter in Reviews sub-tab.",
                revTab.findReviewsRatingsFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'Recommended Thumbs Up' filter in Reviews sub-tab.",
                revTab.findRecommendedThumbsUpFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'Recommended Thumbs Down' filter in Reviews sub-tab.",
                revTab.findRecommendedThumbsDownFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'Unresponded' status filter in Reviews sub-tab.",
                revTab.findUnrespondedStatusFilterInReviewsSubTab());
        assertTrue("Failed to locate the 'Unpublished' status filter in Reviews sub-tab.",
                revTab.findUnpublishedStatusFilterInReviewsSubTab());
        //Verification of Reputation Advisor "Reviews" sub-tab total Reviews count.
        assertTrue("Failed to locate the 'Total Reviews' count in Reviews sub-tab.",
                revTab.findTotalReviewsCountInReviewsSubTab());
        //Verification of Reputation Advisor "Reviews" sub-tab Column Headers
        assertTrue("Failed to find 'Rating' column in 'Reviews' sub-tab.",
                revTab.findRatingColumnInReviewsSubTab());
        assertTrue("Failed to find 'Refer' column in 'Reviews' sub-tab.",
                revTab.findReferColumnInReviewsSubTab());
        assertTrue("Failed to find 'Review' column in 'Reviews' sub-tab.",
                revTab.findReviewColumnInReviewsSubTab());
        assertTrue("Failed to find 'Date' column in 'Reviews' sub-tab.",
                revTab.findDateColumnInReviewsSubTab());
        assertTrue("Failed to find 'Author' column in 'Reviews' sub-tab.",
                revTab.findAuthorColumnInReviewsSubTab());
        assertTrue("Failed to find 'Source' column in 'Reviews' sub-tab.",
                revTab.findSourceColumnInReviewsSubTab());
        assertTrue("Failed to find 'Responded' column in 'Reviews' sub-tab.",
                revTab.findRespondedColumnInReviewsSubTab());
        assertTrue("Failed to find 'Published' column in 'Reviews' sub-tab.",
                revTab.findPublishedColumnInReviewsSubTab());
        //Verification that following elements are Invisible for Free Version
        assertTrue("Failed to confirm the 'Sources' filter is NOT visible in Reviews sub-tab.",
                revTab.confirmSourcesFilterNotVisibleInReviewsSubTab());
        assertTrue("Failed to confirm the 'No Attributes' filter is NOT visible in Reviews sub-tab.",
                revTab.confirmNoAttributesStatusFilterNotVisibleInReviewsSubTab());
        assertTrue("Failed to confirm the 'Attributes' column is NOT visible in Reviews sub-tab.",
                revTab.confirmAttributesColumnNotVisibleInReviewsSubTab());
    }
}
