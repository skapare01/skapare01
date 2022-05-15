package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.ThemeSubTabs;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckThemeTabSubTabsWhenThemeTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckThemeTabSubTabsWhenThemeTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckThemeTabSubTabsWhenThemeTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select 'Theme' tab.",webSet.themeTab());
        ThemeSubTabs themeSubTabs = new ThemeSubTabs(driver);
        assertTrue("Unable to locate 'Design' sub-tab.",themeSubTabs.designSubTab());
        assertTrue("Unable to locate 'Branding' sub-tab.",themeSubTabs.brandingSubTab());
        assertTrue("Unable to locate 'Journeys' sub-tab.",themeSubTabs.journeysSubTab());
        assertTrue("Unable to locate 'Media' sub-tab.",themeSubTabs.mediaSubTab());
        assertTrue("Unable to locate 'Widgets' sub-tab.",themeSubTabs.widgetsSubTab());
    }
}
