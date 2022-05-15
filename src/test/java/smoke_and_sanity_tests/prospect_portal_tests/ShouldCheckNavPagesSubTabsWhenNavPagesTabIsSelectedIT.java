package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.NavPagesSubTabs;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckNavPagesSubTabsWhenNavPagesTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckNavPagesSubTabsWhenNavPagesTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckNavPagesSubTabsWhenNavPagesTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select 'Nav/Pages' tab.", webSet.navPagesTab());
        NavPagesSubTabs navPages = new NavPagesSubTabs(driver);
        assertTrue("Unable to locate Navigation sub-tab.", navPages.navigationSubTab());
        assertTrue("Unable to locate ProspectPortal sub-tab.", navPages.prospectPortalSubTab());
        assertTrue("Unable to locate 'ResidentPortal' sub-tab.", navPages.residentPortalSubTab());
        assertTrue("Unable to locate 'Custom Pages' sub-tab.", navPages.customPagesSubTab());
        assertTrue("Unable to locate 'Landing Pages' sub-tab.", navPages.landingPagesSubTab());
        assertTrue("Unable to locate 'Root Pages' sub-tab.", navPages.rootPagesSubTab());
        assertTrue("Unable to locate 'Social Media' sub-tab.", navPages.socialMediaSubTab());
    }
}
