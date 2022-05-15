package page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.general_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SeoSettings extends BasePage {
    public SeoSettings(WebDriver driver) {
        super(driver);
    }

    private final By SEO_SETTINGS_HEADER = By.xpath("//*[text()='SEO Settings']");
    private final By SEO_SETTINGS_EDIT_BTN = By.id("seo-settings-btn");
    private final By SEO_SETTINGS_PAGE_TITLE_EXTENSION = By.xpath("//*[text()='Page Title Extension:']");
    private final By SEO_SETTINGS_PAGE_TITLE_EXTENSION_TOOL_TIPS = By.id("TITLE_SEO_FORMAT_EXTENSION_WEBSITE_PREFERENCES_HELP");
    private final By SEO_SETTINGS_SHOW_HTML_SITEMAP = By.xpath("//*[text()='Show HTML Sitemap:']");
    private final By SEO_SETTINGS_SHOW_HTML_SITEMAP_TOOL_TIPS = By.id("SHOW_SEO_SITE_MAP_WEBSITE_PREFERENCES_HELP");
    private final By SEO_SETTINGS_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES = By.xpath("//*[text()='Website Hidden from Search Engines:']");
    private final By SEO_SETTINGS_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES_TOOL_TIPS = By.id("HIDE_WEBSITE_FROM_SEARCH_ENGINE");
    private final By SEO_SETTINGS_RESIDENT_PORTAL_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES = By.xpath("//*[text()='Resident Portal Website Hidden from Search Engines:']");
    private final By SEO_SETTINGS_RESIDENT_PORTAL_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES_TOOL_TIPS= By.id("RESIDENT_PORTAL_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES");
    private final By SEO_SETTINGS_ENABLE_404_ERROR_PAGE = By.xpath("//*[text()='Enable 404 Error Page:']");
    private final By SEO_SETTINGS_ENABLE_404_ERROR_PAGE_TOOL_TIPS = By.id("ENABLE_CUSTOM_404_ERROR_PAGE");
    private final By SEO_SETTINGS_STRUCTURED_DATA_PHONE_NUMBER = By.xpath("//*[text()='Structured Data Phone Number:']");
    private final By SEO_SETTINGS_STRUCTURED_DATA_PHONE_NUMBER_TOOL_TIPS = By.id("STRUCTURED_DATA_PHONE_NUMBER");

    public boolean generalSeoSettingsHeader() {
        return confirmElementIsVisible(SEO_SETTINGS_EDIT_BTN);
    }
    public boolean generalSeoSettingsEditBtn() {
        return confirmElementIsVisible(SEO_SETTINGS_HEADER);
    }
    public boolean seoSettingsPageTitleExtension() {
        return confirmElementIsVisible(SEO_SETTINGS_PAGE_TITLE_EXTENSION);
    }
    public boolean seoSettingsPageTitleExtensionToolTips() {
        return clickElement(SEO_SETTINGS_PAGE_TITLE_EXTENSION_TOOL_TIPS);
    }
    public boolean seoSettingsShowHtmlSitemap() {
        return confirmElementIsVisible(SEO_SETTINGS_SHOW_HTML_SITEMAP);
    }
    public boolean seoSettingsShowHtmlSitemapToolTips() {
        return clickElement(SEO_SETTINGS_SHOW_HTML_SITEMAP_TOOL_TIPS);
    }
    public boolean seoSettingsWebsiteHiddenFromSearchEngines() {
        return confirmElementIsVisible(SEO_SETTINGS_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES);
    }
    public boolean seoSettingsWebsiteHiddenFromSearchEnginesToolTips() {
        return clickElement(SEO_SETTINGS_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES_TOOL_TIPS);
    }
    public boolean seoSettingsResidentPortalWebsiteHiddenFromSearchEngines() {
        return confirmElementIsVisible(SEO_SETTINGS_RESIDENT_PORTAL_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES);
    }
    public boolean seoSettingsResidentPortalWebsiteHiddenFromSearchEnginesToolTips() {
        return clickElement(SEO_SETTINGS_RESIDENT_PORTAL_WEBSITE_HIDDEN_FROM_SEARCH_ENGINES_TOOL_TIPS);
    }
    public boolean seoSettingsEnable404ErrorPage() {
        return confirmElementIsVisible(SEO_SETTINGS_ENABLE_404_ERROR_PAGE);
    }
    public boolean seoSettingsEnable404ErrorPageToolTips() {
        return clickElement(SEO_SETTINGS_ENABLE_404_ERROR_PAGE_TOOL_TIPS);
    }
    public boolean seoSettingsStructuredDataPhoneNumber() {
        return confirmElementIsVisible(SEO_SETTINGS_STRUCTURED_DATA_PHONE_NUMBER);
    }
    public boolean seoSettingsStructuredDataPhoneNumberToolTips() {
        return clickElement(SEO_SETTINGS_STRUCTURED_DATA_PHONE_NUMBER_TOOL_TIPS);
    }
}
