package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.GlobalSubTabs;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckGlobalSubTabsWhenGlobalTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckGlobalSubTabsWhenGlobalTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckGlobalSubTabsWhenGlobalTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
        GlobalSubTabs global = new GlobalSubTabs(driver);
        assertTrue("Unable to locate/click Info sub-tab.", global.infoSubTab());
        assertTrue("Unable to locate/click Domains sub-tab.", global.domainsTab());
        assertTrue("Unable to locate/click Snippets sub-tab.", global.snippetsTab());
        assertTrue("Unable to locate/click Wrappers sub-tab.", global.wrappersTab());
        assertTrue("Unable to locate/click Encryption sub-tab.", global.encryptionTab());
        assertTrue("Unable to locate/click Cookie Settings sub-tab.", global.cookieSettingsTab());
    }
}
