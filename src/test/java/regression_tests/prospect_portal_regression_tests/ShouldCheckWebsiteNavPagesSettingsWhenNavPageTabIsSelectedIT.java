package regression_tests.prospect_portal_regression_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.NavPagesSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.custom_pages_subtab.CustomPagesSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.landing_pages_subtab.LandingPagesSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.navigation_subtab.NavigationSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.ProspectPortalTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.amenities_tab.AmenitiesTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.apply_now_tab.ApplyNowTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.blog_tab.BlogTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab.FloorPlanTabConventional;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab.FloorPlanTabMilitary;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab.FloorPlanTabStudent;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.high_rise_tab.HighRiseTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.home_tab.HomeTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.neighborhood_tab.NeighborhoodTabGeneral;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.neighborhood_tab.NeighborhoodTabGooglePlaces;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.photos_and_tours_tab.PhotosAndToursTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.property_overview_tab.PropertyOverviewTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.reviews_tab.ReviewsTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.sidebar_tab.SidebarTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.resident_portal_subtab.ResidentPortalSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.root_pages_subtab.RootPagesSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.social_media_subtab.SocialMediaSubTab;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckWebsiteNavPagesSettingsWhenNavPageTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckWebsiteNavPagesSettingsWhenNavPageTabIsSelectedIT() {
        super("kHansen");
    }

    @Test
    // Navigation //
    public void ShouldCheckNavigationSettingsWhenNavigationTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate Navigation sub-tab.", navPages.navigationSubTab());
        NavigationSubTab navPage = new NavigationSubTab(driver);
        assertTrue("Unable to locate Navigation Prospect Portal Main Navigation Header.", navPage.navProspectPortalMainNavigationHeader());
        assertTrue("Unable to locate Navigation Edit button.", navPage.navigationEditBtn());
        assertTrue("Unable to locate Navigation Name text.", navPage.navigationName());
        assertTrue("Unable to locate Navigation Renamed text.", navPage.navigationRenamed());
        assertTrue("Unable to locate Navigation Status text.", navPage.navigationStatus());
        assertTrue("Unable to locate Main Navigation text.", navPage.navMainNavigationText());
        assertTrue("Unable to locate Navigation Amenities text.", navPage.navigationAmenitiesText());
        assertTrue("Unable to locate Navigation Apply Now text.", navPage.navigationApplyNowText());
        assertTrue("Unable to locate Navigation Blog text.", navPage.navigationBlogText());
        assertTrue("Unable to locate Navigation Careers text.", navPage.navigationCareersText());
        assertTrue("Unable to locate Navigation Contact text.", navPage.navigationContactText());
        assertTrue("Unable to locate Navigation Corporate Contact text.", navPage.navigationCorporateContactText());
        assertTrue("Unable to locate Navigation Directions text.", navPage.navigationDirectionsText());
        assertTrue("Unable to locate Navigation Floor Plans text.", navPage.navigationFloorPlansText());
        assertTrue("Unable to locate Navigation Home text.", navPage.navigationHomeText());
        assertTrue("Unable to locate Navigation Photos text.", navPage.navigationPhotosText());
        assertTrue("Unable to locate Navigation Apartment Search text.", navPage.navigationApartmentSearchText());
        assertTrue("Unable to locate Navigation Residents text.", navPage.navigationResidentsText());
        assertTrue("Unable to locate Navigation Pay Rent text.", navPage.navigationPayRentText());
        assertTrue("Unable to locate Navigation FAQs text.", navPage.navigationFaqsText());
    }
    @Test
    // ProspectPortal Amenities //
    public void ShouldCheckNavPagesProspectPortalAmenitiesSettingsWhenAmenitiesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal Amenities tab.", ppTabs.amenitiesTab());
        AmenitiesTab ppAmenities = new AmenitiesTab(driver);
        assertTrue("Unable to locate ProspectPortal Amenities Page header text.", ppAmenities.ppAmenitiesPageHeader());
        assertTrue("Unable to locate ProspectPortal Amenities Edit button", ppAmenities.ppAmenitiesEditBtn());
        assertTrue("Unable to locate ProspectPortal Amenities Disclaimer Text.", ppAmenities.ppamenitiesDisclaimerText());
        assertTrue("Unable to locate ProspectPortal Amenities Disclaimer Tool Tips.", ppAmenities.ppamenitiesDisclaimerToolTips());
        assertTrue("Unable to locate ProspectPortal Amenities Type Text.", ppAmenities.ppamenitiesTypeText());
        assertTrue("Unable to locate ProspectPortal Amenities Type Tool Tips.", ppAmenities.ppamenitiesTypeToolTips());
        assertTrue("Unable to locate ProspectPortal Amenities Page Layout text.", ppAmenities.ppamenitiesPageLayoutText());
        assertTrue("Unable to locate ProspectPortal Amenities Page Layout Tool Tips.", ppAmenities.ppamenitiesPageLayoutToolTips());
    }
    @Test
    // ProspectPortal Apply Now //
    public void ShouldCheckNavPagesProspectPortalApplyNowSettingsWhenApplyNowTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Apply Now' tab.", ppTabs.applyNowTab());
        ApplyNowTab ppApplyNow = new ApplyNowTab(driver);
        assertTrue("Unable to locate ProspectPortal 'Apply Now' Page header.", ppApplyNow.ppApplyNowPageHeader());
        assertTrue("Unable to locate ProspectPortal Apply Now Edit button", ppApplyNow.ppApplyNowEditBtn());
        assertTrue("Unable to locate ProspectPortal Apply Now Overwrite SEO Title Tag text", ppApplyNow.ppApplyNowOverwriteSeoTitleTag());
        assertTrue("Unable to locate ProspectPortal Apply Now Overwrite SEO Title Tag Tool Tips", ppApplyNow.ppApplyNowOverwriteSeoTitleTagToolTips());
        assertTrue("Unable to locate ProspectPortal Apply Now SEO Keywords text.", ppApplyNow.ppApplyNowSeoKeyWords());
        assertTrue("Unable to locate ProspectPortal Apply Now SEO Keywords Tool Tips.", ppApplyNow.ppApplyNowSeoKeyWordsToolTips());
        assertTrue("Unable to locate ProspectPortal Apply Now Overwrite SEO Meta Description text.", ppApplyNow.ppApplyNowOverwriteSeoMetaDescription());
        assertTrue("Unable to locate ProspectPortal Apply Now Overwrite SEO Meta Description Tool Tips.", ppApplyNow.ppApplyNowOverwriteSeoMetaDescriptionToolTips());
    }
    @Test
    // ProspectPortal Blog //
    public void ShouldCheckNavPagesProspectPortalBlogSettingsWhenBlogTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Blog' tab.", ppTabs.blogTab());
        BlogTab ppBlog = new BlogTab(driver);
        assertTrue("Unable to locate ProspectPortal Blog Settings Header text.", ppBlog.ppBlogSettingsHeader());
        assertTrue("Unable to locate ProspectPortal Blog Edit button", ppBlog.ppBlogSettingsEditBtn());
        assertTrue("Unable to locate ProspectPortal Blog Description text.", ppBlog.ppBlogDescription());
        assertTrue("Unable to locate ProspectPortal Blog Description Tool Tips.", ppBlog.ppBlogDescriptionToolTips());
        assertTrue("Unable to locate ProspectPortal Blog Page Heading text.", ppBlog.ppBlogPageHeading());
        assertTrue("Unable to locate ProspectPortal Blog Page Heading Tool Tips.", ppBlog.ppBlogPageHeadingToolTips());
        assertTrue("Unable to locate ProspectPortal Blog Keyword (Comma Separated) text.", ppBlog.ppBlogKeywordCommaSeparated());
        assertTrue("Unable to locate ProspectPortal Blog Keyword (Comma Separated) Tool Tips.", ppBlog.ppBlogKeywordCommaSeparatedToolTips());
        assertTrue("Unable to locate ProspectPortal Blog SideBar Location text.", ppBlog.ppBlogSidebarLocation());
        assertTrue("Unable to locate ProspectPortal Blog SideBar Location Tool Tips.", ppBlog.ppBlogSidebarLocationToolTips());
        assertTrue("Unable to locate ProspectPortal Blog Title text.", ppBlog.ppBlogTitle());
        assertTrue("Unable to locate ProspectPortal Blog Title Tool Tips.", ppBlog.ppBlogTitleToolTips());
        assertTrue("Unable to locate ProspectPortal Blog Import Wordpress CSV Header.", ppBlog.ppBlogImportWordpressCsvHeader());
        assertTrue("Unable to locate ProspectPortal Blog Download Sample CSV button.", ppBlog.ppBlogDownloadSampleCsvBtn());
        assertTrue("Unable to locate ProspectPortal Blog Import Wordpress CSV Choose File button.", ppBlog.ppBlogImportWordpressCsvChooseFileBtn());
        assertTrue("Unable to locate ProspectPortal Blog Import button.", ppBlog.ppBlogWordpressCsvImportBtn());
    }
    @Test
    // ProspectPortal Floor Plan Conventional //
    public void ShouldCheckNavPagesProspectPortalFloorPlanConventionalSettingsWhenFloorPlansTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Floor Plan' tab.", ppTabs.floorPlanTab());
        FloorPlanTabConventional ppConventionalFloorPlan = new FloorPlanTabConventional(driver);
        assertTrue("Unable to locate ProspectPortal Conventional Floor Plan header.", ppConventionalFloorPlan.ppConventionalFloorPlanHeader());
        assertTrue("Unable to locate ProspectPortal Conventional Floor Plan Edit button", ppConventionalFloorPlan.ppConventionalFloorPlanEditBtn());
        assertTrue("Unable to locate Conventional 'User Flow' text.", ppConventionalFloorPlan.ppConventionalUserFlowText());
        assertTrue("Unable to locate Conventional User Flow Tool Tips.", ppConventionalFloorPlan.ppConventionalUserFlowToolTips());
        assertTrue("Unable to locate Conventional Floor Plan Layout text.", ppConventionalFloorPlan.ppConventionalFloorPlanLayout());
        assertTrue("Unable to locate Conventional Floor Plan Layout Tool Tips.", ppConventionalFloorPlan.ppConventionalFloorPlanLayoutToolTips());
        assertTrue("Unable to locate Conventional Floor Plan Groups text.", ppConventionalFloorPlan.ppConventionalFloorPlanGroups());
        assertTrue("Unable to locate Conventional Floor Plan Groups Tool Tips.", ppConventionalFloorPlan.ppConventionalFloorPlanGroupsToolTips());
        assertTrue("Unable to locate Conventional Rename Availability Alert text.", ppConventionalFloorPlan.ppConventionalRenameAvailabilityAlert());
        assertTrue("Unable to locate Conventional Rename Availability Alert Tool Tips.", ppConventionalFloorPlan.ppConventionalRenameAvailabilityAlertToolTips());
        assertTrue("Unable to locate Conventional Rename 'Only One Left!' CTA text.", ppConventionalFloorPlan.ppConventionalRenameOnlyOneLeftCta());
        assertTrue("Unable to locate Conventional Rename 'Only One Left!' CTA ToolTips.", ppConventionalFloorPlan.ppConventionalRenameOnlyOneLeftCtaToolTips());
        assertTrue("Unable to locate Conventional Rename 'Deposit' text.", ppConventionalFloorPlan.ppConventionalRenameDeposit());
        assertTrue("Unable to locate Conventional Rename 'Deposit' Tool Tips", ppConventionalFloorPlan.ppConventionalRenameDepositToolTips());
        assertTrue("Unable to locate Conventional Rename 'Request Info' text.", ppConventionalFloorPlan.ppConventionalRenameRequestInfo());
        assertTrue("Unable to locate Conventional Rename 'Request Info' Tool Tips.", ppConventionalFloorPlan.ppConventionalRenameRequestInfoToolTips());
        assertTrue("Unable to locate Conventional Request Info External Url text.", ppConventionalFloorPlan.ppConventionalRequestInfoExternalUrl());
        assertTrue("Unable to locate Conventional Request Info External Url Tool Tips", ppConventionalFloorPlan.ppConventionalRequestInfoExternalUrlToolTips());
        assertTrue("Unable to locate Conventional Viewer Background Color text.", ppConventionalFloorPlan.ppConventionalViewerBackgroundColor());
        assertTrue("Unable to locate Conventional Viewer Background Color Tool Tips.", ppConventionalFloorPlan.ppConventionalViewerBackgroundColorToolTips());
        assertTrue("Unable to locate Conventional Associated Floor Plans Number text.", ppConventionalFloorPlan.ppConventionalAssociatedFloorPlansNumber());
        assertTrue("Unable to locate Conventional Associated Floor Plans Number Tool Tips.", ppConventionalFloorPlan.ppConventionalAssociatedFloorPlansNumberToolTips());
        assertTrue("Unable to locate Conventional Floor Plan Disclaimer text.", ppConventionalFloorPlan.ppConventionalDisclaimerText());
        assertTrue("Unable to locate Conventional Floor Plan Disclaimer Tool Tips.", ppConventionalFloorPlan.ppConventionalDisclaimerToolTips());
        assertTrue("Unable to locate Conventional Floor Plan Deposit Disclaimer Text.", ppConventionalFloorPlan.ppConventionalDepositDisclaimerText());
        assertTrue("Unable to locate Conventional Floor Plan Deposit Disclaimer Text Tool Tips.", ppConventionalFloorPlan.ppConventionalDepositDisclaimerToolTips());
    }
    @Test
    // ProspectPortal Floor Plan Student //
    public void ShouldCheckNavPagesProspectPortalFloorPlanStudentSettingsWhenFloorPlansTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Floor Plan' tab.", ppTabs.floorPlanTab());
        FloorPlanTabStudent ppStudentFloorPlan = new FloorPlanTabStudent(driver);
        assertTrue("Unable to locate Student Floor Plan header.", ppStudentFloorPlan.ppStudentFloorPlanHeader());
        assertTrue("Unable to locate ProspectPortal Student Floor Plan Edit button", ppStudentFloorPlan.ppStudentFloorPlanEditBtn());
        assertTrue("Unable to locate Student User 'Flow' text.", ppStudentFloorPlan.ppStudentUserFlowText());
        assertTrue("Unable to locate Student User Flow Tool Tips.", ppStudentFloorPlan.ppStudentUserFlowToolTips());
        assertTrue("Unable to locate Student Page Layout text.", ppStudentFloorPlan.ppStudentLayoutText());
        assertTrue("Unable to locate Student Page Layout Tool Tips.", ppStudentFloorPlan.ppStudentLayoutToolTips());
        assertTrue("Unable to locate Student Floor Plan Groups text.", ppStudentFloorPlan.ppStudentFloorPlanGroups());
        assertTrue("Unable to locate Student Floor Plan Groups Tool Tips.", ppStudentFloorPlan.ppStudentFloorPlanGroupsToolTips());
        assertTrue("Unable to locate Student Rename 'Deposit' text.", ppStudentFloorPlan.ppStudentRenameDeposit());
        assertTrue("Unable to locate Student Rename 'Deposit' Tool Tips.", ppStudentFloorPlan.ppStudentRenameDepositToolTips());
        assertTrue("Unable to locate Student Rename 'Request Info' text.", ppStudentFloorPlan.ppStudentRenameRequestInfo());
        assertTrue("Unable to locate Student Rename 'Request Info' Tool Tips", ppStudentFloorPlan.ppStudentRenameRequestInfoToolTips());
        assertTrue("Unable to locate Student Request Info External Url text.", ppStudentFloorPlan.ppStudentRequestInfoExternalUrl());
        assertTrue("Unable to locate Student Request Info External Url Tool Tips.", ppStudentFloorPlan.ppStudentRequestInfoExternalUrlToolTips());
        assertTrue("Unable to locate Student Viewer Background Color text.", ppStudentFloorPlan.ppStudentViewerBackgroundColor());
        assertTrue("Unable to locate Student Viewer Background Color Tool Tips.", ppStudentFloorPlan.ppStudentViewerBackgroundColorToolTips());
        assertTrue("Unable to locate Student Disclaimer Text.", ppStudentFloorPlan.ppStudentDisclaimerText());
        assertTrue("Unable to locate Student Disclaimer Text Tool Tips.", ppStudentFloorPlan.ppStudentDisclaimerTextToolTips());
        assertTrue("Unable to locate Student Deposit Disclaimer text.", ppStudentFloorPlan.ppStudentDepositDisclaimer());
        assertTrue("Unable to locate Student Deposit Disclaimer Tool Tips.", ppStudentFloorPlan.ppStudentDepositDisclaimerToolTips());
    }
    @Test
    // ProspectPortal Floor Plan Military //
    public void ShouldCheckNavPagesProspectPortalFloorPlanMilitarySettingsWhenFloorPlansTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Floor Plan' tab.", ppTabs.floorPlanTab());
        FloorPlanTabMilitary ppMilitaryFloorPlan = new FloorPlanTabMilitary(driver);
        assertTrue("Unable to locate ProspectPortal Military Floor Plan header.", ppMilitaryFloorPlan.ppMilitaryFloorPlanHeader());
        assertTrue("Unable to locate ProspectPortal Military Floor Plan Edit button.", ppMilitaryFloorPlan.ppMilitaryFloorPlanEditBtn());
        assertTrue("Unable to locate ProspectPortal Military Disclaimer Text header.", ppMilitaryFloorPlan.ppMilitaryDisclaimerText());
        assertTrue("Unable to locate ProspectPortal Military Disclaimer Text Tool Tips.", ppMilitaryFloorPlan.ppMilitaryDisclaimerTextToolTips());
        assertTrue("Unable to locate ProspectPortal Military Deposit Disclaimer text", ppMilitaryFloorPlan.ppMilitaryDepositDisclaimer());
        assertTrue("Unable to locate ProspectPortal Military Deposit Disclaimer Tool Tips.", ppMilitaryFloorPlan.ppMilitaryDepositDisclaimerToolTips());
        assertTrue("Unable to locate ProspectPortal Military Floor Plan Layout text.", ppMilitaryFloorPlan.ppMilitaryFloorPlanLayout());
        assertTrue("Unable to locate ProspectPortal Military Floor Plan Layout Tool Tips.", ppMilitaryFloorPlan.ppMilitaryFloorPlanLayoutToolTips());
        assertTrue("Unable to locate ProspectPortal Military Floor Plan Groups text.", ppMilitaryFloorPlan.ppMilitaryFloorPlanGroups());
        assertTrue("Unable to locate ProspectPortal Military Floor Plan Groups Tool Tips.", ppMilitaryFloorPlan.ppMilitaryFloorPlanGroupsToolTips());
        assertTrue("Unable to locate ProspectPortal Military Rename Availability Alert text.", ppMilitaryFloorPlan.ppMilitaryRenameAvailabilityAlert());
        assertTrue("Unable to locate ProspectPortal Military Rename Availability Alert Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRenameAvailabilityAlertToolTips());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Only One Left' CTA text.", ppMilitaryFloorPlan.ppMilitaryRenameOnlyOneLeftCTA());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Only One Left' CTA Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRenameOnlyOneLeftCTAToolTips());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Deposit' text.", ppMilitaryFloorPlan.ppMilitaryRenameDeposit());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Deposit' Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRenameDepositToolTips());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Request Info' text.", ppMilitaryFloorPlan.ppMilitaryRenameRequestInfo());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Request Info' Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRenameRequestInfoToolTips());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Waitlist' text.", ppMilitaryFloorPlan.ppMilitaryRenameWaitList());
        assertTrue("Unable to locate ProspectPortal Military Rename 'Waitlist' Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRenameWaitListToolTips());
        assertTrue("Unable to locate ProspectPortal Military Waitlist Redirect Message text.", ppMilitaryFloorPlan.ppMilitaryWaitListRedirectMessage());
        assertTrue("Unable to locate ProspectPortal Military Waitlist Redirect Message Tool Tips.", ppMilitaryFloorPlan.ppMilitaryWaitListRedirectMessageToolTips());
        assertTrue("Unable to locate ProspectPortal Military Request Info External URL text.", ppMilitaryFloorPlan.ppMilitaryRequestInfoExternalURL());
        assertTrue("Unable to locate ProspectPortal Military Request Info External URL Tool Tips.", ppMilitaryFloorPlan.ppMilitaryRequestInfoExternalURLToolTips());
        assertTrue("Unable to locate ProspectPortal Military Viewer Background Color text.", ppMilitaryFloorPlan.ppMilitaryViewerBackgroundColor());
        assertTrue("Unable to locate ProspectPortal Military Viewer Background Color Tool Tips.", ppMilitaryFloorPlan.ppMilitaryViewerBackgroundColorToolTips());
        assertTrue("Unable to locate ProspectPortal Military Associated Floor Plans Number text.", ppMilitaryFloorPlan.ppMilitaryAssociatedFloorPlansNumber());
        assertTrue("Unable to locate ProspectPortal Military Associated Floor Plans Number Tool Tips.", ppMilitaryFloorPlan.ppMilitaryAssociatedFloorPlansNumberToolTips());
    }
    @Test
    // ProspectPortal High Rise //
    public void ShouldCheckNavPagesProspectPortalHighRiseSettingsWhenHighRiseTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'High Rise' tab.", ppTabs.highRiseTab());
        HighRiseTab ppHighRise = new HighRiseTab(driver);
        assertTrue("Unable to locate ProspectPortal High Rise High Rise Colors Header.", ppHighRise.ppHighRiseColorsHeader());
        assertTrue("Unable to locate ProspectPortal High Rise Edit button", ppHighRise.ppHighRiseColorsEditBtn());
        assertTrue("Unable to locate ProspectPortal High Rise Available Units Color.", ppHighRise.ppHighRiseAvailableUnitsColor());
        assertTrue("Unable to locate ProspectPortal High Rise Available Units Color Tool Tips.", ppHighRise.ppHighRiseAvailableUnitsColorToolTips());
        assertTrue("Unable to locate ProspectPortal High Rise Floors/Units Filter Color text.", ppHighRise.ppHighRiseFloorsUnitsFilterColor());
        assertTrue("Unable to locate ProspectPortal High Rise Floors/Units Filter Color Tool Tips.", ppHighRise.ppHighRiseFloorsUnitsFilterColorToolTips());
        assertTrue("Unable to locate ProspectPortal High Rise Floor/Unit Hover Color text.", ppHighRise.ppHighRiseFloorUnitHoverColor());
        assertTrue("Unable to locate ProspectPortal High Rise Floor/Unit Hover Color Tool Tips.", ppHighRise.ppHighRiseFloorUnitHoverColorToolTips());
        assertTrue("Unable to locate ProspectPortal High Rise Selected Floor Color text.", ppHighRise.ppHighRiseSelectedFloorColor());
        assertTrue("Unable to locate ProspectPortal High Rise Selected Floor Color Tool Tips.", ppHighRise.ppHighRiseSelectedFloorColorToolTips());
        assertTrue("Unable to locate ProspectPortal High Rise Unavailable Units Color text.", ppHighRise.ppHighRiseUnavailableUnitsColor());
        assertTrue("Unable to locate ProspectPortal High Rise Unavailable Units Color Tool Tips.", ppHighRise.ppHighRiseUnavailableUnitsColorToolTips());
    }
    @Test
    // ProspectPortal Home //
    public void ShouldCheckNavPagesProspectPortalHomeSettingsWhenHomeTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Home' tab.", ppTabs.homeTab());
        HomeTab ppHome = new HomeTab(driver);
        assertTrue("Unable to locate ProspectPortal Home Page Header.", ppHome.ppHomePageHeader());
        assertTrue("Unable to locate ProspectPortal Home Page Edit button.", ppHome.ppHomePageEditBtn());
        assertTrue("Unable to locate ProspectPortal Home Apartment Search text.", ppHome.ppHomeApartmentSearch());
        assertTrue("Unable to locate ProspectPortal Home Apartment Search Tool Tips.", ppHome.ppHomeApartmentSearchToolTips());
        assertTrue("Unable to locate ProspectPortal Home Overwrite SEO Meta Description text.", ppHome.ppHomeOverwriteSEOMetaDescription());
        assertTrue("Unable to locate ProspectPortal Home Landing Page Heading text.", ppHome.ppHomeLandingPageHeading());
        assertTrue("Unable to locate ProspectPortal Home SEO Keywords text.", ppHome.ppHomeSEOKeywords());
        assertTrue("Unable to locate ProspectPortal Home Landing Page.", ppHome.ppHomeLandingPage());
        assertTrue("Unable to locate ProspectPortal Home Landing Page Tool Tips.", ppHome.ppHomeLandingPageToolTips());
        assertTrue("Unable to locate ProspectPortal Home Landing Page Text.", ppHome.ppHomeLandingPageText());
        assertTrue("Unable to locate ProspectPortal Home Overwrite SEO Title Tag.", ppHome.ppHomeOverwriteSEOTitleTag());
        assertTrue("Unable to locate ProspectPortal Home Logo Text.", ppHome.ppHomeLogoText());
    }
    @Test
    // ProspectPortal Neighborhood Google Places //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalNeighborhoodGooglePlacesSettingsWhenNeighborhoodTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Neighborhood' tab.", ppTabs.neighborhoodTab());
        NeighborhoodTabGooglePlaces ppNeighborhoodGoogle = new NeighborhoodTabGooglePlaces(driver);
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Header.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHeader());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Edit button", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesEditBtn());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Accounting.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesAccounting());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Airport.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesAirport());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Amusement Park.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesAmusementPark());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Aquarium.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesAquarium());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Art Gallery.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesArtGallery());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places ATM.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesAtm());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bakery", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBakery());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bank.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBank());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bar", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBar());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Beauty Salon.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBeautySalon());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bicycle Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBicycleStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Book Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBookStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bowling Alley.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBowlingAlley());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Bus Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesBusStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Cafe.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCafe());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Camp Ground.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCampGround());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Car Dealer.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCarDealer());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Car Rental.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCarRental());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Car Repair", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCarRepair());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places CarWash.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCarWash());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Casino.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCasino());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Cemetery.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCemetery());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Church.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesChurch());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places City Hall.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCityHall());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Clothing Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesClothingStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Convenience Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesConvenienceStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Courthouse.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesCourthouse());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Dentist.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesDentist());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Department Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesDepartmentStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Doctor.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesDoctor());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Electrician.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesElectrician());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Electronics Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesElectronicsStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Embassy.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesEmbassy());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Fire Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesFireStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Florist.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesFlorist());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Funeral Home.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesFuneralHome());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Furniture Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesFurnitureStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Gas Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesGasStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Gym.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesGym());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Hair Care.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHairCare());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Hardware Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHardwareStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Hindu Temple.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHinduTemple());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Home Goods Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHomeGoodsStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Hospital.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesHospital());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Insurance Agency.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesInsuranceAgency());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Jewelry Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesJewelryStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Laundry.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLaundry());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Lawyer.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLawyer());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Liquor Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLiquorStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Local Government Office.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLocalGovernmentOffice());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Locksmith.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLocksmith());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Lodging.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesLodging());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Meal Delivery.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMealDelivery());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Meal Takeaway.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMealTakeaway());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Mosque.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMosque());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Movie Rental.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMovieRental());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Movie Theater.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMovieTheater());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Moving Company.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMovingCompany());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Museum.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesMuseum());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Night Club.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesNightClub());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Painter.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPainter());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Park.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPark());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Parking.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesParking());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Pet Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPetStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Pharmacy.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPharmacy());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Physiotherapist.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPhysiotherapist());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Plumber.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPlumber());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Police.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPolice());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Post Office.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesPostOffice());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Real Estate Agency.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesRealEstateAgency());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Restaurant.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesRestaurant());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Roofing Contractor.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesRoofingContractor());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places RV Park.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesRvPark());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places School.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesSchool());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Shoe Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesShoeStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Shopping Mall.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesShoppingMall());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Spa.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesSpa());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Stadium.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlaceStadium());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Storage.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesStorage());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Store.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesStore());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Subway Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesSubwayStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Supermarket.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesSupermarket());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Synagogue.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesSynagogue());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Taxi Stand.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesTaxiStand());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Train Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesTrainStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Transit Station.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesTransitStation());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Travel Agency.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesTravelAgency());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Veterinary Care.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesVeterinaryCare());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places Zoo.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesZoo());
        assertTrue("Unable to locate ProspectPortal Neighborhood Google Places No Default Selected.", ppNeighborhoodGoogle.ppNeighborhoodGooglePlacesNoDefaultSelected());
    }
    @Test
    // ProspectPortal Neighborhood General Settings //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalNeighborhoodGeneralSettingsWhenNeighborhoodTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Neighborhood' tab.", ppTabs.neighborhoodTab());
        NeighborhoodTabGeneral ppNeighborhoodGeneral = new NeighborhoodTabGeneral(driver);
        assertTrue("Unable to locate ProspectPortal Neighborhood General Header.", ppNeighborhoodGeneral.ppNeighborhoodGeneralHeader());
        assertTrue("Unable to locate ProspectPortal Neighborhood General Edit button", ppNeighborhoodGeneral.ppNeighborhoodGeneralEditBtn());
        assertTrue("Unable to locate ProspectPortal Neighborhood General Marker Type.", ppNeighborhoodGeneral.ppNeighborhoodGeneralMarkerType());
        assertTrue("Unable to locate ProspectPortal Neighborhood General Marker Type Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralMarkerTypeToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood Pin Color.", ppNeighborhoodGeneral.ppNeighborhoodGeneralPinColor());
        assertTrue("Unable to locate ProspectPortal Neighborhood Pin Color Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralPinColorToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood Places Marker Type.", ppNeighborhoodGeneral.ppNeighborhoodGeneralPlacesMarkerType());
        assertTrue("Unable to locate ProspectPortal Neighborhood Places Marker Type Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralPlacesMarkerTypeToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood Starting Map Zoom.", ppNeighborhoodGeneral.ppNeighborhoodGeneralStartingMapZoom());
        assertTrue("Unable to locate ProspectPortal Neighborhood Starting Map Zoom Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralStartingMapZoomToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood SEO Content Layout.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSeoContentLayout());
        assertTrue("Unable to locate ProspectPortal Neighborhood SEO Content Layout Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSeoContentLayoutToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood SEO Content Position.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSeoContentPosition());
        assertTrue("Unable to locate ProspectPortal Neighborhood SEO Content Position Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSeoContentPositionToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood Sort Place Results BY Distance From Property.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSortPlaceResultsBYDistanceFromProperty());
        assertTrue("Unable to locate ProspectPortal Neighborhood Sort Place Results BY Distance From Property Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSortPlaceResultsBYDistanceFromPropertyToolTips());
        assertTrue("Unable to locate ProspectPortal Neighborhood Skins Tool.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSkins());
        assertTrue("Unable to locate ProspectPortal Neighborhood Skins Tool Tips.", ppNeighborhoodGeneral.ppNeighborhoodGeneralSkinsToolTips());
    }
    @Test
    // ProspectPortal Photos & Tours Settings //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalPhotosAndToursSettingsWhenPhotosAndToursTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Photos & Tours' tab.", ppTabs.photosAndToursTab());
        PhotosAndToursTab ppPhotosTours = new PhotosAndToursTab(driver);
        assertTrue("Unable to locate ProspectPortal Photos & Tours Page Header.", ppPhotosTours.ppPhotosAndToursPageHeader());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Edit button", ppPhotosTours.ppPhotosAndToursEditBtn());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Page Type.", ppPhotosTours.ppPhotosAndToursPageType());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Page Type Tool Tips.", ppPhotosTours.ppPhotosAndToursPageTypeToolTips());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Photos Layout.", ppPhotosTours.ppPhotosAndToursPhotosLayout());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Photos Layout Tool Tips.", ppPhotosTours.ppPhotosAndToursPhotosLayoutToolTips());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Videos Layout.", ppPhotosTours.ppPhotosAndToursVideosLayout());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Videos Layout Tool Tips.", ppPhotosTours.ppPhotosAndToursVideosLayoutToolTips());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Photo Descriptions.", ppPhotosTours.ppPhotosAndToursPhotoDescriptions());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Photo Descriptions Tool Tips.", ppPhotosTours.ppPhotosAndToursPhotoDescriptionsToolTips());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Viewer Background Color.", ppPhotosTours.ppPhotosAndToursViewerBackgroundColor());
        assertTrue("Unable to locate ProspectPortal Photos & Tours Viewer Background Color Tool Tips.", ppPhotosTours.ppPhotosAndToursViewerBackgroundColorToolTips());
    }
    @Test
    // ProspectPortal Property Overview //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalPropertyOverviewSettingsWhenPropertyOverviewTabIsSelected(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Property Overview' tab.", ppTabs.propertyOverviewTab());
        PropertyOverviewTab ppPropertyOverview = new PropertyOverviewTab(driver);
        assertTrue("Unable to locate ProspectPortal Property Overview Page Header.", ppPropertyOverview.ppPropertyOverviewPageHeader());
        assertTrue("Unable to locate ProspectPortal Property Overview Edit button", ppPropertyOverview.ppPropertyOverviewEditBtn());
        assertTrue("Unable to locate ProspectPortal Property Overview Allow Prospect Generated Quotes.", ppPropertyOverview.ppPropertyOverviewAllowProspectGeneratedQuotes());
        assertTrue("Unable to locate ProspectPortal Property Overview Allow Prospect Generated Quotes Tool Tips.", ppPropertyOverview.ppPropertyOverviewAllowProspectGeneratedQuotesToolTips());
        assertTrue("Unable to locate ProspectPortal Property Overview Photo Media Overlay.", ppPropertyOverview.ppPropertyOverviewPhotoMediaOverlay());
        assertTrue("Unable to locate ProspectPortal Property Overview Photo Media Overlay Tool Tips.", ppPropertyOverview.ppPropertyOverviewPhotoMediaOverlayToolTips());
    }
    @Test
    // ProspectPortal Reviews //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalReviewsSettingsWhenReviewsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Reviews' tab.", ppTabs.reviewsTab());
        ReviewsTab ppReviews = new ReviewsTab(driver);
        assertTrue("Unable to locate ProspectPortal Ratings And Reviews Header", ppReviews.ppRatingsAndReviewsHeader());
        assertTrue("Unable to locate ProspectPortal Ratings & Reviews Edit button", ppReviews.ppReviewsEditBtn());
        assertTrue("Unable to locate ProspectPortal Reviews Rename Ratings & Reviews.", ppReviews.ppReviewsRenameRatingsAndReviews());
        assertTrue("Unable to locate ProspectPortal Reviews Rename Ratings & Reviews Tool Tips.", ppReviews.ppReviewsRenameRatingsAndReviewsToolTips());
    }
    @Test
    // ProspectPortal Sidebar //
    public void ShouldCheckWebsiteSettingsNavPagesProspectPortalSidebarSettingsWhenSidebarTabIsSelected(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        ProspectPortalTabs ppTabs = new ProspectPortalTabs(driver);
        assertTrue("Unable to locate ProspectPortal 'Sidebar' tab.", ppTabs.sidebarTab());
        SidebarTab ppSidebar = new SidebarTab(driver);
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Header.", ppSidebar.ppSidebarWidgetsHeader());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Edit button.", ppSidebar.ppSidebarWidgetsEditBtn());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets text.", ppSidebar.ppSidebarWidgetsText());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Status text.", ppSidebar.ppSidebarWidgetsStatusText());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Property Video.", ppSidebar.ppSidebarWidgetsPropertyVideo());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Property Brochure.", ppSidebar.ppSidebarWidgetsPropertyBrochure());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Contact.", ppSidebar.ppSidebarWidgetsContact());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Pet Policy.", ppSidebar.ppSidebarWidgetsPetPolicy());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Location.", ppSidebar.ppSidebarWidgetsLocation());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Important Links.", ppSidebar.ppSidebarWidgetsImportantLinks());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Office Hours.", ppSidebar.ppSidebarWidgetsOfficeHours());
        assertTrue("Unable to locate ProspectPortal Sidebar Widgets Ratings & Reviews.", ppSidebar.ppSidebarWidgetsRatingsAndReviews());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Header.", ppSidebar.ppSidebarSettingsHeader());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Edit button", ppSidebar.ppSidebarSettingsEditBtn());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Contact Us Rename.", ppSidebar.ppSidebarSettingsContactUsRename());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Contact Us Rename Tool Tips.", ppSidebar.ppSidebarSettingsContactUsRenameToolTips());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Important Links Rename.", ppSidebar.ppSidebarSettingsImportantLinksRename());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Important Links Rename Tool Tips.", ppSidebar.ppSidebarSettingsImportantLinksRenameToolTips());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Sidebar.", ppSidebar.ppSidebarSettingsSidebar());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Sidebar Tool Tips.", ppSidebar.ppSidebarSettingsSidebarToolTips());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Sidebar Location.", ppSidebar.ppSidebarSettingsSidebarLocation());
        assertTrue("Unable to locate ProspectPortal Sidebar Settings Sidebar Location Tool Tips.", ppSidebar.ppSidebarSettingsSidebarLocationToolTips());
    }
    @Test
    // Resident Portal //
    public void ShouldCheckWebsiteSettingsNavPagesResidentPortalSettingsWhenResidentPortalTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate 'ResidentPortal' sub-tab.", navPages.residentPortalSubTab());
        ResidentPortalSubTab residentPortal = new ResidentPortalSubTab(driver);
        assertTrue("Unable to locate ResidentPortal Header.", residentPortal.residentPortalHeader());
        assertTrue("Unable to locate Resident Portal Edit button.", residentPortal.residentPortalEditBtn());
        assertTrue("Unable to locate Resident Portal 'Resident Login Box Title' text.", residentPortal.residentPortalResidentLoginBoxTitle());
        assertTrue("Unable to locate Resident Portal Resident Login Box Title Tool Tips.", residentPortal.residentPortalResidentLoginBoxTitleToolTips());
        assertTrue("Unable to locate Resident Portal 'Login From Entrata' text.", residentPortal.residentPortalLoginFromEntrata());
        assertTrue("Unable to locate Resident Portal Login From Entrata Tool Tips.", residentPortal.residentPortalLoginFromEntrataToolTips());
        assertTrue("Unable to locate Resident Portal 'Page Custom Text' text.", residentPortal.residentPortalPageCustomText());
        assertTrue("Unable to locate Resident Portal Page Custom Text Tool Tips.", residentPortal.residentPortalPageCustomTextToolTips());
        assertTrue("Unable to locate 'Resident Portal 4.0' text.", residentPortal.residentPortalFour());
        assertTrue("Unable to locate Resident Portal 4.0 Tool Tips.", residentPortal.residentPortalFourToolTips());
        assertTrue("Unable to locate Resident Portal 'Account Creation Section' text.", residentPortal.residentPortalAccountCreationSection());
        assertTrue("Unable to locate Resident Portal Account Creation Section Tool Tips.", residentPortal.residentPortalAccountCreationSectionToolTips());
        assertTrue("Unable to locate Resident Portal 'Brand As' text.", residentPortal.residentPortalBrandAs());
        assertTrue("Unable to locate Resident Portal Brand As Tool Tips.", residentPortal.residentPortalBrandAsToolTips());
    }
    @Test
    // Custom Pages //
    public void ShouldCheckWebsiteSettingsNavPagesCustomPagesSettingsWhenCustomPagesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate 'Custom Pages' sub-tab.", navPages.customPagesSubTab());
        CustomPagesSubTab customPages = new CustomPagesSubTab(driver);
        assertTrue("Unable to locate Custom Pages Header.", customPages.customPagesHeader());
        assertTrue("Unable to locate Custom Pages Add Page Button.", customPages.customPagesAddPageBtn());
        assertTrue("Unable to locate Custom Pages Added Pages window.", customPages.customPagesAddedWindow());
    }
    @Test
    // Landing Pages //
    public void ShouldCheckWebsiteSettingsNavPagesLandingPagesSettingsWhenLandingPagesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate 'Landing Pages' sub-tab.", navPages.landingPagesSubTab());
        LandingPagesSubTab landingPages = new LandingPagesSubTab(driver);
        assertTrue("Unable to locate Landing Pages Contact Form Landing Page Header.", landingPages.landingPageContactFormLandingPageHeader());
        assertTrue("Unable to locate Landing Pages Edit button", landingPages.landingPagesContactFormLandingPageEditBtn());
        assertTrue("Unable to locate Landing Pages Use Contact Landing Form.", landingPages.landingPageUseContactLandingForm());
        assertTrue("Unable to locate Landing Pages Use Contact Landing Form Tool Tips.", landingPages.landingPageUseContactLandingFormToolTips());
        assertTrue("Unable to locate Landing Pages Landing Page Heading.", landingPages.landingPagesLandingPageHeading());
        assertTrue("Unable to locate Landing Pages Landing Page Heading Tool Tips.", landingPages.landingPagesLandingPageHeadingToolTips());
        assertTrue("Unable to locate Landing Pages Title.", landingPages.landingPagesTitle());
        assertTrue("Unable to locate Landing Pages Title Tool Tips.", landingPages.landingPagesTitleToolTips());
        assertTrue("Unable to locate Landing Pages Description.", landingPages.landingPagesDescription());
        assertTrue("Unable to locate Landing Pages Description Tool Tips.", landingPages.landingPagesDescriptionToolTips());
        assertTrue("Unable to locate Landing Pages Custom URL.", landingPages.landingPagesCustomUrl());
        assertTrue("Unable to locate Landing Pages Custom URL Tool Tips.", landingPages.landingPagesCustomUrlToolTips());
        assertTrue("Unable to locate Landing Pages Lead Source.", landingPages.landingPagesLeadSource());
        assertTrue("Unable to locate Landing Pages Lead Source Tool Tips.", landingPages.landingPagesLeadSourceToolTips());
        assertTrue("Unable to locate Landing Pages Confirmation Page Content.", landingPages.landingPagesConfirmationPageContent());
        assertTrue("Unable to locate Landing Pages Confirmation Page Content Tool Tips.", landingPages.landingPagesConfirmationPageContentToolTips());
    }
    @Test
    // Root Pages //
    public void ShouldCheckWebsiteSettingsNavPagesRootPagesSettingsWhenRootPagesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate 'Root Pages' sub-tab.", navPages.rootPagesSubTab());
        RootPagesSubTab rootPages = new RootPagesSubTab(driver);
        assertTrue("Unable to locate Root Pages Header.", rootPages.rootPagesHeader());
        assertTrue("Unable to locate Add Root Page button.", rootPages.addRootPageBtn());
        assertTrue("Unable to locate Root Pages added window.", rootPages.rootPagesListWindow());
    }
    @Test
    // Social Media //
    public void ShouldCheckWebsiteSettingsNavPagesSocialMediaSettingsWhenSocialMediaTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Nav/Pages tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate 'Social Media' sub-tab.", navPages.socialMediaSubTab());
        SocialMediaSubTab socialMedia = new SocialMediaSubTab(driver);
        assertTrue("Unable to locate Social Media Settings Header.", socialMedia.socialMediaSettingsHeader());
        assertTrue("Unable to locate Social Media Edit button.", socialMedia.socialMediaSettingsEditBtn());
        assertTrue("Unable to locate Social Media Settings Pin-It Button.", socialMedia.socialMediaSettingsPinItButton());
        assertTrue("Unable to locate Social Media Settings Pin-It Button Tool Tips.", socialMedia.socialMediaSettingsPinItButtonToolTips());
        assertTrue("Unable to locate Social Media Settings Twitter Username.", socialMedia.socialMediaTwitterUsername());
        assertTrue("Unable to locate Social Media Settings Twitter Username Tool Tips.", socialMedia.socialMediaTwitterUsernameToolTips());
    }
}
