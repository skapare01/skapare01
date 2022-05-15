package smoke_and_sanity_tests.prospect_portal_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebPageCheck;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import static junit.framework.Assert.assertTrue;

public class AcceptWebsiteCookiesOnMultipleWebBrowsersIT extends BaseBrowserTest {
    public AcceptWebsiteCookiesOnMultipleWebBrowsersIT() {
        super("1automationrapid");
    }

    @Test
    public void shouldCheckAcceptCookiesFunctionality_whenUsingChromeWebBrowser() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to select 'AutomationPPUX' website.", webList.automationPpUxWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to select/locate 'View Website' button.", webSet.viewWebsiteBtn());
        WebPageCheck webPage = new WebPageCheck(driver);
        assertTrue("Unable to locate Cookies banner for website using Google Chrome web browser.", webPage.cookiesBar());
        assertTrue("Unable to click 'I Accept All Cookies' for website using Google Chrome web browser.", webPage.clickIAcceptAllCookiesButton());
    }
    // More 'cookie accept' web browser tests will be added later once/if drivers are set up for other browsers //
}
