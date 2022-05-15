package regression_tests.prospect_portal_regression_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.SeoSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.canonical_urls_subtab.CanonicalUrls;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.general_subtab.SeoSettings;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.general_subtab.SeoUrlOptions;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckWebsiteSeoSettingsWhenSeoTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckWebsiteSeoSettingsWhenSeoTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    // General SEO URL Options //
    public void ShouldCheckSeoGeneralSeoUrlOptionsSettingsWhenGeneralSubTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate website settings SEO tab.",webSet.seoTab());
        SeoSubTabs seo = new SeoSubTabs(driver);
        assertTrue("Unable to locate SEO 'General' sub-tab.",seo.generalSubTab());
        SeoUrlOptions urlOptions = new SeoUrlOptions(driver);
        assertTrue("Unable to locate SEO URL Options header.",urlOptions.seoUrlOptionsHeader());
        assertTrue("Unable to locate SEO URL Options Edit Button.",urlOptions.seoUrlOptionsEditBtn());
        assertTrue("Unable to locate SEO URL Options City Extension setting.",urlOptions.seoUrlOptionsCityExtension());
        assertTrue("Unable to locate SEO URL Options City Extension setting Tool Tips.",urlOptions.seoUrlOptionsCityExtensionToolTips());
        assertTrue("Unable to locate SEO URL Options Property Extension setting.",urlOptions.seoUrlOptionsPropertyExtension());
        assertTrue("Unable to locate SEO URL Options Property Extension setting Tool Tips.",urlOptions.seoUrlOptionsPropertyExtensionToolTips());
    }
    @Test
    // General SEO Settings //
    public void ShouldCheckSeoGeneralSeoSettingsWhenGeneralSubTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate website settings 'SEO' tab.",webSet.seoTab());
        SeoSubTabs seo = new SeoSubTabs(driver);
        assertTrue("Unable to locate SEO 'General' sub-tab.",seo.generalSubTab());
        SeoSettings seoSettings = new SeoSettings(driver);
        assertTrue("Unable to locate SEO Settings header.", seoSettings.generalSeoSettingsHeader());
        assertTrue("Unable to locate SEO Settings Edit button.", seoSettings.generalSeoSettingsEditBtn());
        assertTrue("Unable to locate SEO Settings Page Title Extension text.", seoSettings.seoSettingsPageTitleExtension());
        assertTrue("Unable to locate SEO Settings Page Title Extension Tool Tips.", seoSettings.seoSettingsPageTitleExtensionToolTips());
        assertTrue("Unable to locate SEO Settings Show HTML Sitemap text.", seoSettings.seoSettingsShowHtmlSitemap());
        assertTrue("Unable to locate SEO Settings Show HTML Sitemap Tool Tips.", seoSettings.seoSettingsShowHtmlSitemapToolTips());
        assertTrue("Unable to locate SEO Settings Website Hidden From Search Engines text.", seoSettings.seoSettingsWebsiteHiddenFromSearchEngines());
        assertTrue("Unable to locate SEO Settings Website Hidden From Search Engines Tool Tips.", seoSettings.seoSettingsWebsiteHiddenFromSearchEnginesToolTips());
        assertTrue("Unable to locate SEO Settings Resident Portal Website Hidden From Search Engines text.", seoSettings.seoSettingsResidentPortalWebsiteHiddenFromSearchEngines());
        assertTrue("Unable to locate SEO Settings Resident Portal Website Hidden From Search Engines Tool Tips.", seoSettings.seoSettingsResidentPortalWebsiteHiddenFromSearchEnginesToolTips());
        assertTrue("Unable to locate SEO Settings Enable 404 Error Page text.", seoSettings.seoSettingsEnable404ErrorPage());
        assertTrue("Unable to locate SEO Settings Enable 404 Error Page Tool Tips.", seoSettings.seoSettingsEnable404ErrorPageToolTips());
        assertTrue("Unable to locate SEO Settings Structured Data Phone Number text.", seoSettings.seoSettingsStructuredDataPhoneNumber());
        assertTrue("Unable to locate SEO Settings Structured Data Phone Number Tool Tips.", seoSettings.seoSettingsStructuredDataPhoneNumberToolTips());
    }
    @Test
    // Canonical URLs //
    public void ShouldCheckSeoCanonicalUrlSettingsWhenCanonicalUrlsSubTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate website settings 'SEO' tab.",webSet.seoTab());
        SeoSubTabs seo = new SeoSubTabs(driver);
        assertTrue("Unable to locate SEO settings 'Canonical URLs' sub-tab.",seo.canonicalUrlsSubTab());
        CanonicalUrls seoUrls = new CanonicalUrls(driver);
        assertTrue("Unable to locate SEO Canonical URLs header.", seoUrls.canonicalUrlsHeader());
        assertTrue("Unable to locate SEO Canonical URLs Search Bar.", seoUrls.canonicalUrlSearchBar());
        assertTrue("Unable to add text to SEO Canonical URLs Search Bar.", seoUrls.canonicalUrlSearchBarAddText());
        assertTrue("Unable to locate SEO Canonical URLs 'Import from CSV' button.", seoUrls.canonicalUrlsImportFromCsvBtn());
        assertTrue("Unable to locate SEO Canonical URLs 'Ass URL' button.", seoUrls.canonicalUrlsAddUrlBtn());
        assertTrue("Unable to locate SEO Canonical URLs 'Link' text.", seoUrls.canonicalUrlsLinkText());
        assertTrue("Unable to locate SEO Canonical URLs 'URL' text.", seoUrls.canonicalUrlsUrlText());
        assertTrue("Unable to locate SEO Canonical URLs 'Created' text.", seoUrls.canonicalUrlsCreatedText());
        assertTrue("Unable to locate SEO Canonical URLs 'Last Update' text.", seoUrls.canonicalUrlsLastUpdateText());
        assertTrue("Unable to locate SEO Canonical URLs 'Actions' text.", seoUrls.canonicalUrlsActionText());
    }
}
