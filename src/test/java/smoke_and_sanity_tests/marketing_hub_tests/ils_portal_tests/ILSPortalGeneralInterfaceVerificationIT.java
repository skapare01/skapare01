package smoke_and_sanity_tests.marketing_hub_tests.ils_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab.*;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ILSPortalGeneralInterfaceVerificationIT extends BaseBrowserTest {

    public ILSPortalGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

//Manual Test ID 2239539

    @Test
    public void shouldDisplayILSPortalMultiPropertyViewUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Verification of ILS Portal Filters
        assertTrue("Failed to locate Property Filter for ILS Portal.",
                iLSPortalTab.locatePropertyFilter_ILS_Portal());
        assertEquals("'All Properties' is not selected by Default in ILS Portal.",
                "All Properties",
                iLSPortalTab.locateDefaultPropertyFilterSelection_ILS());
        assertTrue("Failed to locate 'Occupant Types' dropdown in ILS Portal.",
                iLSPortalTab.locateOccupantTypesFilter());
        assertTrue("Failed to locate and select 'Occupant Types'' first option 'All Occupant Types'.",
                iLSPortalTab.selectOccupantFilterOption1_AllTypes());
        assertTrue("Failed to locate and select 'Occupant Types'' second option 'Conventional/Affordable'.",
                iLSPortalTab.selectOccupantFilterOption2_ConvAfford());
        assertTrue("Failed to locate and select 'Occupant Types'' third option 'Student'.",
                iLSPortalTab.selectOccupantFilterOption3_Student());
        assertTrue("Failed to locate ILS Portal's 'Subscribed' filter.",
                iLSPortalTab.findSubscribedFilter());
        assertTrue("Failed to locate ILS Portal's 'All' filter.",
                iLSPortalTab.findAllFilter());
        assertTrue("Failed to locate ILS Portal's 'Unsubscribed' filter.",
                iLSPortalTab.findUnsubscribedFilter());
        assertTrue("Failed to find the 'Search ILS' text box filter in ILS Portal.",
                iLSPortalTab.findSearchILSBox());
        //Verification of ILS Table Details
        assertTrue("Failed to locate ILS Logo in ILS Table.",
                iLSPortalTab.findILSLogoInTable());
        assertTrue("Failed to locate 'Feed Type' in ILS Table.",
                iLSPortalTab.findILSOccupantTypeInTable());
        assertTrue("Failed to locate 'Service Restrictions in ILS Table.",
                iLSPortalTab.findILsServiceRestrictionsInTable());
        assertTrue("Failed to locate the Number of Properties Subscribed an ILS in ILS Table.",
                iLSPortalTab.findILsSubscribedPropertiesNumberInTable());
        assertTrue("Failed locate the 'ILS Request Log' in ILS Table.",
                iLSPortalTab.findILSRequestLogInTable());
        assertTrue("Failed to locate the 'Manage Subscriptions' button in ILS Table.",
                iLSPortalTab.findILSManageSubscriptionsButtonInTable());
        //Verification of invisibility of elements for "Multiple Property" view.
        assertTrue("Subscription Log is incorrectly visible in 'Multi-Property View' in ILS Portal.",
                iLSPortalTab.confirmSubscriptionLogNotPresent_MultiPropertyView());
    }

    @Test
    public void shouldDisplayILSPortalSinglePropertyViewUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Verification of ILS Portal Single Property selection
        assertTrue("Failed to locate and select 'Property Filter' in ILS Portal.",
                iLSPortalTab.selectPropertyFilter_ILSPortal());
        assertTrue("Failed to locate and select 'Remove All' button in property filter.",
                iLSPortalTab.selectRemoveAllPropertiesInPropertyFilter());
        assertTrue("Failed to locate and select first Property in property filter.",
                iLSPortalTab.selectFirstPropertyInPropertyFilter());
        assertTrue("Failed to locate and select 'Filter Properties' button in property filter.",
                iLSPortalTab.selectFilterPropertiesButton_ILSPortal());
        //Verification of ILS Portal Filters
        assertTrue("Failed to locate 'Occupant Types' dropdown in ILS Portal.",
                iLSPortalTab.locateOccupantTypesFilter());
        assertTrue("Failed to locate and select 'Occupant Types'' first option 'All Occupant Types'.",
                iLSPortalTab.selectOccupantFilterOption1_AllTypes());
        assertTrue("Failed to locate and select 'Occupant Types'' second option 'Conventional/Affordable'.",
                iLSPortalTab.selectOccupantFilterOption2_ConvAfford());
        assertTrue("Failed to locate and select 'Occupant Types'' third option 'Student'.",
                iLSPortalTab.selectOccupantFilterOption3_Student());
        assertTrue("Failed to locate ILS Portal's 'Subscribed' filter.",
                iLSPortalTab.findSubscribedFilter());
        assertTrue("Failed to locate ILS Portal's 'All' filter.",
                iLSPortalTab.findAllFilter());
        assertTrue("Failed to locate ILS Portal's 'Unsubscribed' filter.",
                iLSPortalTab.findUnsubscribedFilter());
        assertTrue("Failed to find the 'Search ILS' text box filter in ILS Portal.",
                iLSPortalTab.findSearchILSBox());
        //Verification of ILS Table Details
        assertTrue("Failed to locate ILS Logo in ILS Table.",
                iLSPortalTab.findILSLogoInTable());
        assertTrue("Failed to locate 'Feed Type' in ILS Table.",
                iLSPortalTab.findILSOccupantTypeInTable());
        assertTrue("Failed to locate 'Service Restrictions in ILS Table.",
                iLSPortalTab.findILsServiceRestrictionsInTable());
        assertTrue("Failed to locate 'Subscription Log' in ILS Table.",
                iLSPortalTab.findILsSubscriptionLogInTable());
        assertTrue("Failed locate the 'ILS Request Log' in ILS Table.",
                iLSPortalTab.findILSRequestLogInTable());
        assertTrue("Failed to locate the 'Subscribe' button in ILS Table.",
                iLSPortalTab.findSubscribeButtonInTable());
        //Verification of invisibility of elements for "Single Property" view.
        assertTrue("The number of Properties Subscribed to an ILS is incorrectly visible in 'Single-Property View'.",
                iLSPortalTab.confirmNumberOfPropertiesSubscribedNotPresent_SingleProperty());
        assertTrue("The 'Manage Subscriptions' button for an ILS is incorrectly visible in 'Single-Property View'.",
                iLSPortalTab.confirmILSManageSubscriptionsButtonNotVisible_SingleProperty());
    }

    @Test
    public void shouldDisplayILSServiceRestrictionsModalUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Navigate to 'Service Restrictions' Modal
        assertTrue("Failed to locate and click 'Service Restrictions' link.",
                iLSPortalTab.selectServiceRestrictionsLinkInILSPortal());

        ServiceRestrictionsModal serviceRestrictionsModal = new ServiceRestrictionsModal(driver);
        //Verifying elements of 'Service Restrictions' Modal
        assertTrue("Failed to locate and confirm 'Service Restrictions' Modal opened.",
                serviceRestrictionsModal.confirmServiceRestrictionsModalIsOpen());
        assertTrue("Failed to locate the supported 'Feed Type' in Service Restrictions Modal.",
                serviceRestrictionsModal.findSupportedFeedType_SRModal());
        assertTrue("Failed to locate the ILS Logo in Service Restrictions Modal.",
                serviceRestrictionsModal.findILSLogo_SRModal());
        assertTrue("Failed to locate the ILS Details in Service Restrictions Modal.",
                serviceRestrictionsModal.findILSDetails_SRModal());
        assertTrue("Failed to locate the ILS' supported Occupant Types in Service Restrictions Modal.",
                serviceRestrictionsModal.findSupportedOccupantTypes_SRModal());
        assertTrue("Failed to locate the ILS' 'Restrictions' in Service Restrictions Modal.",
                serviceRestrictionsModal.findRestrictionsDetails_SRModal());
        assertTrue("Failed to locate the 'Close' button in Service Restrictions Modal.",
                serviceRestrictionsModal.selectCloseButton_SRModal());
    }

    @Test
    public void shouldDisplayILSSubscriptionLogModalMultiPropertyViewUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Verify Subscription Log isn't visible in ILS Portal in Multi-Property View
        assertTrue("Subscription Log is incorrectly visible in 'Multi-Property View' in ILS Portal.",
                iLSPortalTab.confirmSubscriptionLogNotPresent_MultiPropertyView());
        //Navigate to Manage Subscriptions.
        assertTrue("Failed to locate and select 'Manage Subscriptions' button in ILS Portal.",
                iLSPortalTab.selectManageSubscriptionsButtonInILSPortal());

        ManageSubscriptionsCurtain manageSubsPg = new ManageSubscriptionsCurtain(driver);
        //Navigate to Manage Subscriptions button and open Curtain
        assertTrue("Failed to locate and select Subscription Log link, 'View', in ILS Portal's 'Manage Subscriptions' curtain.",
                manageSubsPg.selectSubscriptionLogLink_ManageSubsCurtain());

        ILSDirectorySubscriptionLogModal subscriptionLogModal = new ILSDirectorySubscriptionLogModal(driver);
        //Verify elements of Subscription Log Modal.
        assertTrue("The 'Subscription Log' Modal in ILS Portal failed to open.",
                subscriptionLogModal.confirmSubscriptionLogModalIsOpen());
        assertTrue("Failed to locate the 'Date' column in the Subscription Log Modal.",
                subscriptionLogModal.findDateColumnInSubscriptionLogModal());
        assertTrue("Failed to locate the 'Action' column in the Subscription Log Modal.",
                subscriptionLogModal.findActionColumnInSubscriptionLogModal());
        assertTrue("Failed to locate the 'Name' column in the Subscription Log Modal.",
                subscriptionLogModal.findNameColumnInSubscriptionLogModal());
        assertTrue("Failed to locate and select the 'Close' button in the Subscription Log Modal.",
                subscriptionLogModal.selectCloseButtonInSubscriptionLogModal());
        assertTrue("Failed to locate and select the 'Close' button in the Manage Subscriptions Curtain.",
                manageSubsPg.selectCloseButton_ManageSubsCurtain());
    }

    @Test
    public void shouldDisplayILSSubscriptionLogModalSinglePropertyViewUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Verification of ILS Portal Single Property view
        assertTrue("Failed to locate and select 'Property Filter' in ILS Portal.",
                iLSPortalTab.selectPropertyFilter_ILSPortal());
        assertTrue("Failed to locate and select 'Remove All' button in property filter.",
                iLSPortalTab.selectRemoveAllPropertiesInPropertyFilter());
        assertTrue("Failed to locate and select first Property in property filter.",
                iLSPortalTab.selectFirstPropertyInPropertyFilter());
        assertTrue("Failed to locate and select 'Filter Properties' button in property filter.",
                iLSPortalTab.selectFilterPropertiesButton_ILSPortal());
        //Navigate to Subscription Log Modal (Single Property View)
        assertTrue("Failed to locate and select the 'View' button for the 'Subscription Log'.",
                iLSPortalTab.selectViewButton_SubsLogs_ILSPortal());

        ILSDirectorySubscriptionLogModal subscriptionLogModal = new ILSDirectorySubscriptionLogModal(driver);
        //Verify elements of Subscription Log Modal (Single Property View).
        assertTrue("The 'Subscription Log' Modal in ILS Portal failed to open.",
                subscriptionLogModal.confirmSubscriptionLogModalIsOpen());
        assertTrue("Failed to locate the 'Date' column in the Subscription Log Modal.",
                subscriptionLogModal.findDateColumnInSubscriptionLogModal());
        assertTrue("Failed to locate the 'Action' column in the Subscription Log Modal.",
                subscriptionLogModal.findActionColumnInSubscriptionLogModal());
        assertTrue("Failed to locate the 'Name' column in the Subscription Log Modal.",
                subscriptionLogModal.findNameColumnInSubscriptionLogModal());
        assertTrue("Failed to locate and select the 'Close' button in the Subscription Log Modal.",
                subscriptionLogModal.selectCloseButtonInSubscriptionLogModal());
    }

    @Test
    public void shouldDisplayILSRequestLogCurtainUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Navigate to 'ILS Request Log'.
        assertTrue("Failed to locate and select 'View' button for the 'ILS Request Log'.",
                iLSPortalTab.selectViewButton_RequestLog_ILSPortal());

        ILSRequestLogCurtain requestLogModal = new ILSRequestLogCurtain(driver);
        //Verify elements of 'ILS Request Log' Curtain.
        assertTrue("Failed to locate and confirm that the 'ILS Request Log' curtain successfully opened.",
                requestLogModal.confirmCurtainOpened_RequestLogCurtain());
        assertTrue("Failed to locate and confirm visibility of 'Company Name' in Request Log curtain.",
                requestLogModal.confirmCompanyNameVisible_RequestLogCurtain());
        assertTrue("Failed to locate and confirm visibility of 'Company ID' in Request Log curtain.",
                requestLogModal.confirmCompanyIDVisible_RequestLogCurtain());
//TODO Will re-add this verification once reliable data is setup sometime next week and is available to run these asserts against. 1/7/22
//        assertTrue("Failed to locate and confirm visibility of 'Raw Data' button in Request Log curtain.",
//                requestLogModal.confirmRawDataButtonVisible_RequestLogCurtain());
        assertTrue("Failed to locate and confirm visibility of 'ILS Logo' in Request Log curtain.",
                requestLogModal.confirmIlsLogoVisible_RequestLogCurtain());
        //Verify Filter Elements in "Request Log" Curtain.
        assertTrue("Failed to locate and confirm visibility of 'Property Filter' in Request Log curtain.",
                requestLogModal.confirmPropertyFilterVisible_RequestLogCurtain());
//TODO Will re-add these verifications once reliable data is setup sometime next week and is available to run these asserts agains. 1/7/22
//        assertTrue("Failed to locate and confirm visibility of 'Date Selector Filter' in Request Log curtain.",
//                requestLogModal.confirmDateSelectorFilterVisible_RequestLogCurtain());
//        assertTrue("Failed to locate and confirm visibility of 'Time Log Selector Filter' in Request Log curtain.",
//                requestLogModal.confirmTimeLogSelectorFilterVisible_RequestLogCurtain());
//        assertTrue("Failed to locate and confirm visibility of 'Show Current Data' toggle in Request Log curtain.",
//                requestLogModal.confirmShowCurrentDataToggleVisible_RequestLogCurtain());
//        assertTrue("Failed to locate and confirm visibility of 'Log Details' in Request Log curtain.",
//                requestLogModal.confirmLogDetailsVisible_RequestLogCurtain());
//        assertTrue("Failed to locate and select 'Show Current Data' toggle in Request Log curtain.",
//                requestLogModal.toggleOnShowCurrentData_RequestLogCurtain());
//        assertTrue("Failed to locate and confirm current data is visible in 'blue text' in Request Log curtain.",
//                requestLogModal.confirmBlueCurrentDataVisible_RequestLogCurtain());
        assertTrue("Failed to locate and select the 'Close' button in the 'ILS Request Log' curtain.",
                requestLogModal.selectCloseButton_RequestLogCurtain());
    }

    @Test
    public void shouldDisplayILSManageSubscriptionsCurtainUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubNav mshTab = new MarketingHubNav(driver);
        //Navigate to ILS Portal Tab
        assertTrue("Failed to Navigate to 'ILS Directory' tab in Marketing Strategy Hub.",
                mshTab.clickILSPortalTab());

        ILSDirectoryPage iLSPortalTab = new ILSDirectoryPage(driver);
        //Navigate to 'Manage Subscriptions" Button.
        assertTrue("Failed to locate and select 'Manage Subscriptions' button in ILS Portal.",
                iLSPortalTab.selectManageSubscriptionsButtonInILSPortal());

        ManageSubscriptionsCurtain manageSubsPg = new ManageSubscriptionsCurtain(driver);
        //Verify "Manage Subscriptions" Curtain Filters.
        assertTrue("Failed to locate ILS Logo in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmILSLogoVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Active' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmActiveFilter_ManageSubsCurtain());
        assertTrue("Failed to locate 'Denied' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmDeniedFilter_ManageSubsCurtain());
        assertTrue("Failed to locate 'Unsubscribed' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmUnsubscribeFilter_ManageSubsCurtain());
        assertTrue("Failed to locate 'Pending' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmPendingFilter_ManageSubsCurtain());
        assertTrue("Failed to locate 'Feed Interrupted' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmFeedInterruptedFilter_ManageSubsCurtain());
        assertTrue("Failed to locate 'Property Search' filter in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmPropertySearchFilter_ManageSubsCurtain());
        //Verify "Manage Subscriptions" Curtain Details.
        assertTrue("Failed to locate 'Occupant Type' in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmOccupancyTypeVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Total Units' in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmTotalUnitsVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Location' in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmLocationVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Status' in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmStatusVisible_ManageSubsCurtain());
//TODO This is dependant on the ILS, itself. Not all ILS's have Minimal Feed as an option.
//        assertTrue("Failed to locate 'Minimal Feed' in 'Manage Subscriptions' curtain in ILS Portal.",
//                manageSubsPg.confirmMinimalFeedVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Request Log' in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmRequestLogVisible_ManageSubsCurtain());
        assertTrue("Failed to locate 'Subscribe/Unsubscribe' button in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.confirmSubUnsubButtonVisible_ManageSubsCurtain());
//TODO Due to the nature of the API, we cannot guarantee there will always be a pending subscription to Cancel. DevSeed Needed.
//        assertTrue("Failed to locate 'Cancel Subscription' button in 'Manage Subscriptions' curtain in ILS Portal.",
//                manageSubsPg.confirmCancelSubVisible_ManageSubsCurtain());
        assertTrue("Failed to locate and select 'Close' button in 'Manage Subscriptions' curtain in ILS Portal.",
                manageSubsPg.selectCloseButton_ManageSubsCurtain());
    }

}
