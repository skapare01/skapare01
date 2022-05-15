package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckWebsiteTabsOnceAWebsiteIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckWebsiteTabsOnceAWebsiteIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckWebsiteTabsOnceWebsiteIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select 'Theme' tab.",webSet.themeTab());
        assertTrue("Unable to select 'Global' Tab", webSet.globalTab());
        assertTrue("Unable to select 'Nav/Pages' tab.", webSet.navPagesTab());
        assertTrue("Unable to select 'Properties' tab.", webSet.propertiesTab());
        assertTrue("Unable to select 'SEO' tab.",webSet.seoTab());
        assertTrue("Unable to locate 'Multi-Property' tab.", webSet.multiPropertyTab());
        assertTrue("Unable to locate 'Website Ads' tab.", webSet.websiteAdsTab());
    }
}
