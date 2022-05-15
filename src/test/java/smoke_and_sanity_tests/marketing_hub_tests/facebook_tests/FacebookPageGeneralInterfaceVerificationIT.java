package smoke_and_sanity_tests.marketing_hub_tests.facebook_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FacebookPageSubscriptionLogModal;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FacebookPageTransmissionLogCurtain;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FacebookPageSubtab;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;

import static org.junit.Assert.assertTrue;

public class FacebookPageGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public FacebookPageGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 3175956

    @Test
    public void shouldDisplayFacebookPageTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Facebook Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());

        FacebookPageSubtab fbPage = new FacebookPageSubtab(driver);
        //Navigate to Facebook Page Sub-tab in Facebook Tab
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFaceBookPageSubTab());
        //Verification of Facebook Page elements and Filters
        assertTrue("Failed to locate 'Facebook Page' logo in Facebook Page tab.",
                fbPage.findFacebookPageLogoInFacebookPage());
        assertTrue("Failed to locate 'Property Search' in Facebook Page tab.",
                fbPage.findPropertySearchFilterInFacebookPage());
        assertTrue("Failed to locate 'Active' filter in Facebook Page tab.",
                fbPage.findActiveFilterInFacebookPage());
        assertTrue("Failed to locate 'Unsubscribed' filter in Facebook Page tab.",
                fbPage.findUnsubscribedFilterInFacebookPage());
        assertTrue("Failed to locate 'Feed Interrupted' filter in Facebook Page tab.",
                fbPage.findFeedInterruptedFilterInFacebookPage());
        //Verification of Facebook Page Table Column headers
        assertTrue("Failed to find 'Property' column header in Facebook Page tab.",
                fbPage.findPropertyColumnHeaderInFacebookPage());
        assertTrue("Failed to find 'Total Units' column header in Facebook Page tab.",
                fbPage.findTotalUnitsColumnHeaderInFacebookPage());
        assertTrue("Failed to find 'Location' column header in Facebook Page tab.",
                fbPage.findLocationColumnHeaderInFacebookPage());
        assertTrue("Failed to find 'Status' column header in Facebook Page tab.",
                fbPage.findStatusColumnHeaderInFacebookPage());
        assertTrue("Failed to find 'Transmission' column header in Facebook Page tab.",
                fbPage.findTransmissionLogColumnHeaderInFacebookPage());
        assertTrue("Failed to find 'Subscription' column header in Facebook Page tab.",
                fbPage.findSubscriptionLogColumnHeaderInFacebookPage());
    }

    @Test
    public void shouldConfirmFacebookPageTransmissionLogOpens_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Facebook Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());

        FacebookPageSubtab fbPage = new FacebookPageSubtab(driver);
        //Navigate to Facebook Page Sub-tab in Facebook Tab
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFaceBookPageSubTab());
        assertTrue("Failed to locate and click 'View' button for Transmission log in Facebook Page tab.",
                fbPage.clickTransmissionViewButtonInFacebookPage());

        FacebookPageTransmissionLogCurtain transLog = new FacebookPageTransmissionLogCurtain(driver);
        //Verification of Facebook Page Transmission Log
        assertTrue("Failed to confirm 'Transmission Log' opened in Facebook Page tab.",
                transLog.confirmTransmissionLogOpenedInFacebookPage());
        assertTrue("Failed to locate 'Property Node' in Transmission log in Facebook Page tab.",
                transLog.confirmPropertyNodeVisibleInTransmissionLogInFacebookPage());
        assertTrue("Failed to locate 'Location Node' in Transmission log in Facebook Page tab.",
                transLog.confirmLocationNodeVisibleInTransmissionLogInFacebookPage());
        assertTrue("Failed to locate 'Details Node' in Transmission log in Facebook Page tab.",
                transLog.confirmDetailsNodeVisibleInTransmissionLogInFacebookPage());
        assertTrue("Failed to locate 'Hours Node' in Transmission log in Facebook Page tab.",
                transLog.confirmHoursNodeVisibleInTransmissionLogInFacebookPage());
        assertTrue("Failed to locate Property name in Transmission log in Facebook Page tab.",
                transLog.confirmPropertyNameVisibleInPropertyNodeInTransmissionLogInFacebookPage());
        assertTrue("Failed to locate 'Show Current Data' toggle in Facebook Page tab.",
                transLog.confirmShowCurrentDataToggleVisibleInTransmissionLogInFacebookPage());
    }

    @Test
    public void shouldConfirmFacebookPageSubscriptionLogOpens_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to Facebook Tab in Marketing Strategy Hub
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());

        FacebookPageSubtab fbPage = new FacebookPageSubtab(driver);
        //Navigate to Facebook Page Sub-tab in Facebook Tab
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFaceBookPageSubTab());
        assertTrue("Failed to locate and click 'View' button for Subscription log in Facebook Page tab.",
                fbPage.clickSubscriptionViewButtonInFacebookPage());

        FacebookPageSubscriptionLogModal subsLog = new FacebookPageSubscriptionLogModal(driver);
        //Verification of Facebook Page Subscription Log
        assertTrue("Failed to confirm 'Subscription Log' opened in Facebook Page tab.",
                subsLog.confirmSubscriptionLogOpenedInFacebookPage());
        assertTrue("Failed to locate 'Date' section in Subscription log in Facebook Page tab.",
                subsLog.confirmDateVisibleInSubscriptionLogInFacebookPage());
        assertTrue("Failed to locate 'Action' section in Subscription log in Facebook Page tab.",
                subsLog.confirmActionVisibleInSubscriptionLogInFacebookPage());
        assertTrue("Failed to locate 'Name' section in Subscription log in Facebook Page tab.",
                subsLog.confirmUserNameVisibleInSubscriptionLogInFacebookPage());
    }

}
