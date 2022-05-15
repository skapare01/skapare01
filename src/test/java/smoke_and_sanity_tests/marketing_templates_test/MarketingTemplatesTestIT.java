package smoke_and_sanity_tests.marketing_templates_test;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.ThemeSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.widgets_subtab.WidgetsPage;

import static org.junit.Assert.assertTrue;

public class MarketingTemplatesTestIT extends BaseBrowserTest {

    public MarketingTemplatesTestIT() {
        super("avantic");
    }

    @Test //TC: 3251632
    public void shouldFindPropertyWebsiteWidgetsPage_whenWidgetsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        WebsiteListPage websiteListPage = new WebsiteListPage(driver);
        WebsiteSettingsTabs websiteSettingsTabs = new WebsiteSettingsTabs(driver);
        ThemeSubTabs themeSubTabs = new ThemeSubTabs(driver);
        WidgetsPage widgetsPage = new WidgetsPage(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Websites sub tab.", navBar.clickWebsites());
        assertTrue("Could not select a Website.", websiteListPage.firstListedWebsiteClick());
        assertTrue("Could not select Theme tab.", websiteSettingsTabs.themeTab());
        assertTrue("Could not select Widgets tab.", themeSubTabs.widgetsSubTab());
        assertTrue("Could not find Widgets page.", widgetsPage.widgetsPageVisible());
    }
}
