package smoke_and_sanity_tests.marketing_hub_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.yext_tab.YextPublisherManagementSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.yext_tab.YextSubscriptionsSubtab;

import static org.junit.Assert.assertTrue;

public class YextInterfaceVerificationIT extends BaseBrowserTest {

    public YextInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2703080

    @Test
    public void shouldDisplayYextPublisherManagementTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Yext Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Yext' tab in Marketing Strategy Hub.",
                mshTab.clickYextTab());

        YextPublisherManagementSubtab pubManTab = new YextPublisherManagementSubtab(driver);
        //Navigate to Publisher Management Sub-tab in Yext Tab
        assertTrue("Failed to Navigate to 'Publisher Management' sub-tab in Yext tab.",
                pubManTab.selectPublisherManagementSubTabInYext());
        //Verification of Yext "Publisher Management" tab elements and Filters
        assertTrue("Failed to locate 'Yext' logo in 'Publisher Management' tab.",
                pubManTab.findYextLogoInYextPublisherManagement());
        assertTrue("Failed to locate 'Property' filter in 'Publisher Management' tab.",
                pubManTab.findPropertyFilterInYextPublisherManagement());
        assertTrue("Failed to locate 'Needs Attention' filter in 'Publisher Management' tab.",
                pubManTab.findNeedsAttentionFilterInYextPublisherManagement());
        assertTrue("Failed to locate 'Off' filter in 'Publisher Management' tab.",
                pubManTab.findOffFilterInYextPublisherManagement());
        assertTrue("Failed to locate 'On' filter in 'Publisher Management' tab.",
                pubManTab.findOnFilterInYextPublisherManagement());
        assertTrue("Failed to locate 'Search Publisher' filter in 'Publisher Management' tab.",
                pubManTab.findSearchPublisherFilterInYextPublisherManagement());
        //Verification of Yext "Publisher Management" tab Table Column headers
        assertTrue("Failed to find 'Publisher' column in 'Publisher Management' tab.",
                pubManTab.findPublisherColumnInYextPublisherManagement());
        assertTrue("Failed to find 'Status' column in 'Publisher Management' tab.",
                pubManTab.findStatusColumnInYextPublisherManagement());
        assertTrue("Failed to find 'Potential Issues' column in 'Publisher Management' tab.",
                pubManTab.findPotentialIssuesColumnInYextPublisherManagement());
        assertTrue("Failed to find 'Activity Log' column in 'Publisher Management' tab.",
                pubManTab.findActivityLogColumnInYextPublisherManagement());
        assertTrue("Failed to find 'Publisher On/Off' column in 'Publisher Management' tab.",
                pubManTab.findPublisherOnOffColumnInYextPublisherManagement());
    }

    @Test
    public void shouldDisplayYextSubscriptionsTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Yext Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Yext' tab in Marketing Strategy Hub.",
                mshTab.clickYextTab());

        YextSubscriptionsSubtab subsTab = new YextSubscriptionsSubtab(driver);
        //Navigate to Subscriptions Sub-tab in Yext Tab
        assertTrue("Failed to Navigate to 'Subscriptions' sub-tab in Yext tab.",
                subsTab.selectSubscriptionsSubTabInYextSubscriptionsSubtab());
        //Verification of Yext "Subscriptions" Subtab elements and Filters
        assertTrue("Failed to locate 'Yext' logo in 'Subscriptions' tab.",
                subsTab.findYextLogoInYextSubscriptionsSubtabn());
        assertTrue("Failed to locate 'Search Property' box in 'Subscriptions' tab.",
                subsTab.findPropertySearchBoxInYextSubscriptionsSubtab());
        assertTrue("Failed to locate 'Active' filter in 'Subscriptions' tab.",
                subsTab.findActiveFilterInYextSubscriptionsSubtab());
        assertTrue("Failed to locate 'Pending' filter in 'Subscriptions' tab.",
                subsTab.findPendingFilterInYextSubscriptionsSubtab());
        assertTrue("Failed to locate 'Failed' filter in 'Subscriptions' tab.",
                subsTab.findFailedFilterInYextSubscriptionsSubtab());
        assertTrue("Failed to locate 'Cancelled' filter in 'Subscriptions' tab.",
                subsTab.findCancelledFilterInYextSubscriptionsSubtab());
        assertTrue("Failed to locate 'Inactive' filter in 'Subscriptions' tab.",
                subsTab.findInactiveFilterInYextSubscriptionsSubtab());
        //Verification of Yext "Subscriptions" tab Table Column headers
        assertTrue("Failed to find 'Property' column in 'Subscriptions' tab.",
                subsTab.findPropertyColumnInYextSubscriptionsSubtab());
        assertTrue("Failed to find 'Total Units' column in 'Subscriptions' tab.",
                subsTab.findTotalUnitsColumnInYextSubscriptionsSubtab());
        assertTrue("Failed to find 'Location' column in 'Subscriptions' tab.",
                subsTab.findLocationColumnInYextSubscriptionsSubtab());
        assertTrue("Failed to find 'Status' column in 'Subscriptions' tab.",
                subsTab.findStatusColumnInYextSubscriptionsSubtab());
        assertTrue("Failed to find 'Transmission Log' column in 'Subscriptions' tab.",
                subsTab.findTransmissionLogColumnInYextSubscriptionsSubtab());
        assertTrue("Failed to find 'Subscription Log' column in 'Subscriptions' tab.",
                subsTab.findSubscriptionLogColumnInYextSubscriptionsSubtab());
    }

}
