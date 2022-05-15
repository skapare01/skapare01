package smoke_and_sanity_tests.reputation_advisor_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.ReputationAdvisorNav;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab.AnsweredSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab.IgnoredSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab.UnansweredSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab.CalendarSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab.PostHistorySubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab.SocialAccountsSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab.ToDoListSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab.ReviewsDashboardSubtab;
import page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab.ReviewsSubtab;

import static org.junit.Assert.assertTrue;

public class ReputationAdvisorGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public ReputationAdvisorGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2258184

    //Reviews Smoke Tests
    @Test
    public void shouldDisplayReputationAdvisorSubTabs_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        //Navigate to Reputation Advisor Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        //Verification of Reputation Advisor Product Tabs
        assertTrue("Failed to locate and select 'Reviews' Tab in Reputation Advisor sub-tab.",
                repTab.selectReviewsTab());
        assertTrue("Failed to locate and select 'Posting Tool' Tab in Reputation Advisor sub-tab.",
                repTab.selectPostingToolTab());
        assertTrue("Failed to locate and select 'Google Q&A' Tab in Reputation Advisor sub-tab.",
                repTab.selectGoogleQATab());
    }

    @Test
    public void shouldDisplayReviewsDashboardUI_whenPaidContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReviewsDashboardSubtab dashTab = new ReviewsDashboardSubtab(driver);
        //Navigate to Reviews Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm the 'Dashboard' sub-tab is selected by default in Reviews tab.",
                dashTab.confirmDashboardTabSelectedByDefaultInReviewsTab());
        //Verification of Reviews Dashboard sub-tab filters for Paid version
        assertTrue("Failed to find and select the 'Property Filter' in Reviews Dashboard sub-tab.",
                dashTab.clickPropertyFilterInReviewsDashboard());
        assertTrue("Failed to find and select the 'Add All' button in Property filter in Reviews Dashboard sub-tab.",
                dashTab.clickAddAllPropertiesInReviewsDashboard());
        assertTrue("Failed to find and select the 'Filter Properties' button in Property filter in Reviews Dashboard sub-tab.",
                dashTab.clickFilterPropertiesButtonInReviewsDashboard());
        //Verify "No Attributes" number is visible for paid version.
        assertTrue("Failed to confirm the 'No Attributes' number IS visible in Reviews Dashboard sub-tab.",
                dashTab.findNoAttributesNumberInReviewsDashboard());
    }

    @Test
    public void shouldDisplayReviewsTabUI_whenPaidContractEnabled() {
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
        //Verification of Reviews sub-tab filters for Paid version
        assertTrue("Failed to locate and select the 'Property Filter' in Reviews sub-tab.",
                revTab.clickPropertyFilterInReviewsSubTab());
        assertTrue("Failed to locate and select the 'Add All' button in Property filter in Reviews sub-tab.",
                revTab.clickAddAllPropertiesInReviewsSubTab());
        assertTrue("Failed to locate and select the 'Filter Properties' button in Property filter in Reviews sub-tab.",
                revTab.clickFilterPropertiesButtonInReviewsSubTab());
        assertTrue("Failed to confirm the 'Sources' filter IS visible in Reviews sub-tab.",
                revTab.findSourcesFilterInReviewsSubTab());
        assertTrue("Failed to confirm the 'No Attributes' filter IS visible in Reviews sub-tab.",
                revTab.findNoAttributesStatusFilterInReviewsSubTab());
        //Verification of Reputation Advisor "Reviews" sub-tab total Reviews count.
        assertTrue("Failed to locate the 'Total Reviews' count in Reviews sub-tab.",
                revTab.findTotalReviewsCountInReviewsSubTab());
        //Verification of Reputation Advisor "Reviews" sub-tab Column Headers for Paid Version
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
        assertTrue("Failed to find 'Property' column in 'Reviews' sub-tab.",
                revTab.findPropertyColumnInReviewsSubTab());
        assertTrue("Failed to find 'Responded' column in 'Reviews' sub-tab.",
                revTab.findRespondedColumnInReviewsSubTab());
        assertTrue("Failed to find 'Attributes' column in 'Reviews' sub-tab.",
                revTab.findAttributesColumnInReviewsSubTab());
        assertTrue("Failed to find 'Published' column in 'Reviews' sub-tab.",
                revTab.findPublishedColumnInReviewsSubTab());
    }

    //Posting Tool Smoke Tests
    @Test
    public void shouldDisplayToDoListTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        ToDoListSubtab tdTab = new ToDoListSubtab(driver);
        //Navigate to To-Do List Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Posting Tool' tab in Reputation sub-tab.",
                repTab.selectPostingToolTab());
        assertTrue("Failed to confirm the 'To-Do List' sub-tab is selected by default in Posting Tool tab.",
                tdTab.confirmToDoListTabSelectedByDefaultInPostingToolTab());
        assertTrue("Failed to locate and select the 'To-Do List' sub-tab under the Posting Tool tab.",
                tdTab.selectToDoListSubtabInPostingToolTab());
        //Verification of To-Do List sub-tab filters
        assertTrue("Failed to locate the 'Property Filter' in 'To-Do List' sub-tab.",
                tdTab.findPropertyFilterInToDoListSubTab());
        assertTrue("Failed to locate the 'Pending Approval' Card in 'To-Do List' sub-tab.",
                tdTab.findPendingApprovalCardInToDoListSubTab());
        assertTrue("Failed to locate the 'Revision Required' Card in 'To-Do List' sub-tab.",
                tdTab.findRevisionRequiredCardInToDoListSubTab());
        assertTrue("Failed to locate the 'Failed to Post' Card in 'To-Do List' sub-tab.",
                tdTab.findFailedToPostCardInToDoListSubTab());
    }

    @Test
    public void shouldDisplaySocialAccountsTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        SocialAccountsSubtab socTab = new SocialAccountsSubtab(driver);
        //Navigate to Social Accounts Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Posting Tool' tab in Reputation sub-tab.",
                repTab.selectPostingToolTab());
        assertTrue("Failed to locate and select the 'Social Accounts' sub-tab under the Posting Tool tab.",
                socTab.selectSocialAccountsSubtabInPostingToolTab());
        //Verification of Social Accounts sub-tab filters
        assertTrue("Failed to locate the 'Property Filter' in 'Social Accounts' sub-tab.",
                socTab.findPropertyFilterInSocialAccountsSubTab());
        assertTrue("Failed to locate the 'All Accounts' button in 'Social Accounts' sub-tab.",
                socTab.findAllAccountsButtonInSocialAccountsSubTab());
        assertTrue("Failed to locate the 'Facebook' button in 'Social Accounts' sub-tab.",
                socTab.findFacebookButtonInSocialAccountsSubTab());
        assertTrue("Failed to locate the 'Twitter' button in 'Social Accounts' sub-tab.",
                socTab.findTwitterButtonInSocialAccountsSubTab());
        assertTrue("Failed to locate the 'Instagram' button in 'Social Accounts' sub-tab.",
                socTab.findInstagramButtonInSocialAccountsSubTab());
    }

    @Test
    public void shouldDisplayPostHistoryTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        PostHistorySubtab phTab = new PostHistorySubtab(driver);
        //Navigate to Post History Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Posting Tool' tab in Reputation sub-tab.",
                repTab.selectPostingToolTab());
        assertTrue("Failed to locate and select the 'Post History' sub-tab under the Posting Tool tab.",
                phTab.selectPostHistorySubtabInPostingToolTab());
        //Verification of Post History sub-tab filters
        assertTrue("Failed to locate the 'Property Filter' in 'Post History' sub-tab.",
                phTab.findPropertyFilterInPostHistorySubTab());
        assertTrue("Failed to locate the 'All Accounts' button in 'Post History' sub-tab.",
                phTab.findAllAccountsButtonInPostHistorySubTab());
        assertTrue("Failed to locate the 'Facebook' button in 'Post History' sub-tab.",
                phTab.findFacebookButtonInPostHistorySubTab());
        assertTrue("Failed to locate the 'Twitter' button in 'Post History' sub-tab.",
                phTab.findTwitterButtonInPostHistorySubTab());
        assertTrue("Failed to locate the 'Instagram' button in 'Post History' sub-tab.",
                phTab.findInstagramButtonInPostHistorySubTab());
        assertTrue("Failed to locate the 'From Date' selector in 'Post History' sub-tab.",
                phTab.findFromDateSelectorInPostHistorySubTab());
        assertTrue("Failed to locate the 'To Date' selector in 'Post History' sub-tab.",
                phTab.findToDateSelectorInPostHistorySubTab());
        assertTrue("Failed to locate the 'Reset Filters' link in 'Post History' sub-tab.",
                phTab.findResetFiltersLinkInPostHistorySubTab());
        assertTrue("Failed to locate the 'Filter' button in 'Post History' sub-tab.",
                phTab.findFilterButtonInPostHistorySubTab());
    }

    @Test
    public void shouldDisplayCalendarTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        CalendarSubtab calTab = new CalendarSubtab(driver);
        //Navigate to Calendar Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Posting Tool' tab in Reputation sub-tab.",
                repTab.selectPostingToolTab());
        assertTrue("Failed to locate and select the 'Calendar' sub-tab under the Posting Tool tab.",
                calTab.selectCalendarSubtabInPostingToolTab());
        //Verification of Calendar sub-tab filters
        assertTrue("Failed to locate the 'Property Filter' in 'Calendar' sub-tab.",
                calTab.findPropertyFilterInCalendarSubTab());
        assertTrue("Failed to locate the 'All Accounts' button in 'Calendar' sub-tab.",
                calTab.findAllAccountsButtonInCalendarSubTab());
        assertTrue("Failed to locate the 'Facebook' button in 'Calendar' sub-tab.",
                calTab.findFacebookButtonInCalendarSubTab());
        assertTrue("Failed to locate the 'Twitter' button in 'Calendar' sub-tab.",
                calTab.findTwitterButtonInCalendarSubTab());
        assertTrue("Failed to locate the 'Instagram' button in 'Calendar' sub-tab.",
                calTab.findInstagramButtonInCalendarSubTab());
    }

    //Google Q&A Smoke Tests
    @Test
    public void shouldDisplayUnansweredTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        UnansweredSubtab uaTab = new UnansweredSubtab(driver);
        //Navigate to Unanswered Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Google Q&A' tab in Reputation sub-tab.",
                repTab.selectGoogleQATab());
        assertTrue("Failed to confirm the 'Unanswered' sub-tab is selected by default in Google Q&A tab.",
                uaTab.confirmUnansweredSubtabSelectedByDefault());
        assertTrue("Failed to locate and select the 'Unanswered' sub-tab under the Google Q&A tab.",
                uaTab.selectUnansweredSubtabInGoogleQATab());
        //Verification of Unanswered Sub-tab Filters
        assertTrue("Failed to locate the 'Property Filter' in 'Unanswered' sub-tab.",
                uaTab.findPropertyFilterInUnansweredSubTab());
        assertTrue("Failed to locate the '7 Day' filter button in 'Unanswered' sub-tab.",
                uaTab.findSevenDayFilterInUnansweredSubTab());
        assertTrue("Failed to locate the '30 Day' filter button in 'Unanswered' sub-tab.",
                uaTab.findThirtyDayFilterInUnansweredSubTab());
        assertTrue("Failed to locate the '90 Day' filter button in 'Unanswered' sub-tab.",
                uaTab.findNinetyDayFilterInUnansweredSubTab());
        assertTrue("Failed to locate the '6 Month' filter button in 'Unanswered' sub-tab.",
                uaTab.findSixMonthFilterInUnansweredSubTab());
        assertTrue("Failed to locate the '1 Year' filter button in 'Unanswered' sub-tab.",
                uaTab.findOneYearFilterInUnansweredSubTab());
        assertTrue("Failed to locate the 'All' filter button in 'Unanswered' sub-tab.",
                uaTab.findAllFilterInUnansweredSubTab());
    }

    @Test
    public void shouldDisplayAnsweredTabUI_whenContractEnabled() {
        //Navigate to Answered Sub-tab
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        assertTrue("Failed to confirm visibility of the 'Google Q&A' tab in Reputation sub-tab.",
                repTab.selectGoogleQATab());
        AnsweredSubtab aTab = new AnsweredSubtab(driver);
        assertTrue("Failed to locate and select the 'Answered' sub-tab under the Google Q&A tab.",
                aTab.selectAnsweredSubTabInGoogleQATab());
        //Verification of Answered Sub-tab Filters
        assertTrue("Failed to locate the 'Property Filter' in 'Answered' sub-tab.",
                aTab.findPropertyFilterInAnsweredSubTab());
        assertTrue("Failed to locate the '7 Day' filter button in 'Answered' sub-tab.",
                aTab.findSevenDayFilterInAnsweredSubTab());
        assertTrue("Failed to locate the '30 Day' filter button in 'Answered' sub-tab.",
                aTab.findThirtyDayFilterInAnsweredSubTab());
        assertTrue("Failed to locate the '90 Day' filter button in 'Answered' sub-tab.",
                aTab.findNinetyDayFilterInAnsweredSubTab());
        assertTrue("Failed to locate the '6 Month' filter button in 'Answered' sub-tab.",
                aTab.findSixMonthFilterInAnsweredSubTab());
        assertTrue("Failed to locate the '1 Year' filter button in 'Answered' sub-tab.",
                aTab.findOneYearFilterInAnsweredSubTab());
        assertTrue("Failed to locate the 'All' filter button in 'Answered' sub-tab.",
                aTab.findAllFilterInAnsweredSubTab());
    }

    @Test
    public void shouldDisplayIgnoredTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        ReputationAdvisorNav repTab = new ReputationAdvisorNav(driver);
        IgnoredSubtab iTab = new IgnoredSubtab(driver);
        //Navigate to Ignored Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Reputation' sub-tab.",
                toolsTab.clickReputationSubTab());
        assertTrue("Failed to confirm visibility of the 'Google Q&A' tab in Reputation sub-tab.",
                repTab.selectGoogleQATab());
        assertTrue("Failed to locate and select the 'Ignored' sub-tab under the Google Q&A tab.",
                iTab.selectIgnoredSubtabInGoogleQATab());
        //Verification of Ignored Sub-tab Filters
        assertTrue("Failed to locate the 'Property Filter' in 'Ignored' sub-tab.",
                iTab.findPropertyFilterInIgnoredSubTab());
        assertTrue("Failed to locate the '7 Day' filter button in 'Ignored' sub-tab.",
                iTab.findSevenDayFilterInIgnoredSubTab());
        assertTrue("Failed to locate the '30 Day' filter button in 'Ignored' sub-tab.",
                iTab.findThirtyDayFilterInIgnoredSubTab());
        assertTrue("Failed to locate the '90 Day' filter button in 'Ignored' sub-tab.",
                iTab.findNinetyDayFilterInIgnoredSubTab());
        assertTrue("Failed to locate the '6 Month' filter button in 'Ignored' sub-tab.",
                iTab.findSixMonthFilterInIgnoredSubTab());
        assertTrue("Failed to locate the '1 Year' filter button in 'Ignored' sub-tab.",
                iTab.findOneYearFilterInIgnoredSubTab());
        assertTrue("Failed to locate the 'All' filter button in 'Ignored' sub-tab.",
                iTab.findAllFilterInIgnoredSubTab());
    }

}
