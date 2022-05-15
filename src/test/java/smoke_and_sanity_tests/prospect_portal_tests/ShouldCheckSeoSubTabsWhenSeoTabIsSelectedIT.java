package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.SeoSubTabs;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckSeoSubTabsWhenSeoTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckSeoSubTabsWhenSeoTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckSeoSubTabsWhenSeoTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate website settings SEO tab.", webSet.seoTab());
        SeoSubTabs seo = new SeoSubTabs(driver);
        assertTrue("Unable to locate SEO 'General' sub-tab.",seo.generalSubTab());
        assertTrue("Unable to locate SEO settings 'Canonical URLs' sub-tab.",seo.canonicalUrlsSubTab());
    }
}
