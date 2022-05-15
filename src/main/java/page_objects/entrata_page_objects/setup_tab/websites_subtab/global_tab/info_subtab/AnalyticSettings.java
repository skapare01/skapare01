package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AnalyticSettings extends BasePage {
    public AnalyticSettings(WebDriver driver) {
        super(driver);
    }

    // Analytic Settings Variables//
    private final By ANALYTICS_SETTINGS = By.cssSelector("#b_google_analytics > h3");
    private final By ANALYTICS_EDIT_BTN = By.id("google-analytics-button");
    private final By BING_WEBMASTER_META_TAG_KEY = By.xpath("//*[text()='Bing Webmaster Meta Tag Key:']");
    private final By BING_WEBMASTER_META_TAG_KEY_TOOL_TIPS = By.id("BING_WEBMASTER_TOOL_KEY_WEBSITE_PREFERENCES_HELP");
    private final By BING_ADS_UET_KEY = By.xpath("//*[text()='Bing Ads UET Key:']");
    private final By BING_ADS_UET_KEY_TOOL_TIPS = By.id("BING_ADS_UET_KEY_WEBSITE_PREFERENCES_HELP");
    private final By GOOGLE_ANALYTICS_4_MEASUREMENT_ID = By.xpath("//*[text()='Google Analytics 4 Measurement ID:']");
    private final By GOOGLE_ANALYTICS_4_MEASUREMENT_ID_TOOL_TIPS = By.id("GOOGLE_ANALYTICS_4_MEASUREMENT_ID_WEBSITE_PREFERENCES_HELP");
    private final By GOOGLE_UNIVERSAL_ANALYTICS_TRACKING_ID = By.xpath("//*[text()='\u200BGoogle Universal Analytics Tracking ID:']");
    private final By GOOGLE_UNIVERSAL_ANALYTICS_TRACKING_ID_TOOL_TIPS = By.id("GOOGLE_ANALYTICS_TRACKING_KEY_WEBSITE_PREFERENCES_HELP");
    private final By GOOGLE_UNIVERSAL_ANALYTICS_MACRO_TRACKING_ID = By.xpath("//*[text()='Google Universal Analytics Macro Tracking ID:']");
    private final By GOOGLE_UNIVERSAL_ANALYTICS_MACRO_TRACKING_ID_TOOL_TIPS =By.id("GOOGLE_ANALYTICS_MACRO_TRACKING_KEY");
    private final By GOOGLE_ADS_PHONE_SNIPPET = By.xpath("//*[text()='Google Ads Phone Snippet:']");
    private final By GOOGLE_ADS_PHONE_SNIPPET_TOOL_TIPS = By.id("GOOGLE_ADS_PHONE_SNIPPET");
    private final By GOOGLE_TAG_MANAGER_KEY = By.xpath("//*[text()='Google Tag Manager Key:']");
    private final By GOOGLE_TAG_MANAGER_KEY_TOOL_TIPS = By.id("GOOGLE_TAG_MANAGER_WEBSITE_PREFERENCES_HELP");
    private final By GOOGLE_SEARCH_CONSOLE_META_TAG_KEY = By.xpath("//*[text()='Google Search Console Meta Tag Key:']");
    private final By GOOGLE_SEARCH_CONSOLE_META_TAG_KEY_TOOL_TIPS = By.id("GOOGLE_WEBMASTER_META_TAG_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY = By.xpath("//*[text()='ResidentPortal Google Analytics Tracking Key:']");
    private final By RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY_TOOL_TIPS = By.id("RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_GOOGLE_ANALYTICS_MACRO_TRACKING_KEY = By.xpath("//*[text()='ResidentPortal Google Analytics Macro Tracking Key:']");
    private final By RESIDENT_PORTAL_GOOGLE_ANALYTICS_MACRO_TRACKING_KEY_TOOL_TIPS = By.id("RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY_WEBSITE_PREFERENCES_HELP");

    public boolean analyticSetting() {
        return confirmElementIsVisible(ANALYTICS_SETTINGS);
    }
    public boolean analyticsEditButton() {
        return confirmElementIsVisible(ANALYTICS_EDIT_BTN);
    }
    public boolean bingWebmasterMetaTagKey() {
        return confirmElementIsVisible(BING_WEBMASTER_META_TAG_KEY);
    }
    public boolean bingWebmasterMetaTagKeyToolTips() {
        return confirmElementIsVisible(BING_WEBMASTER_META_TAG_KEY_TOOL_TIPS);
    }
    public boolean bingAdsUETKey() {
        return confirmElementIsVisible(BING_ADS_UET_KEY);
    }
    public boolean bingAdsUETKeyToolTips() {
        return confirmElementIsVisible(BING_ADS_UET_KEY_TOOL_TIPS);
    }
    public boolean locateGoogleAnalytics4MeasurementIdText() {
        return confirmElementIsVisible(GOOGLE_ANALYTICS_4_MEASUREMENT_ID);
    }
    public boolean clickGoogleAnalytics4MeasurementIdToolTips() {
        return clickElement(GOOGLE_ANALYTICS_4_MEASUREMENT_ID_TOOL_TIPS);
    }
    public boolean googleUniversalAnalyticsTrackingId() {
        return confirmElementIsVisible(GOOGLE_UNIVERSAL_ANALYTICS_TRACKING_ID);
    }
    public boolean googleUniversalAnalyticsTrackingIdToolTips() {
        return confirmElementIsVisible(GOOGLE_UNIVERSAL_ANALYTICS_TRACKING_ID_TOOL_TIPS);
    }
    public boolean googleUniversalAnalyticsMacroTrackingId() {
        return confirmElementIsVisible(GOOGLE_UNIVERSAL_ANALYTICS_MACRO_TRACKING_ID);
    }
    public boolean googleUniversalAnalyticsMacroTrackingIdToolTips() {
        return confirmElementIsVisible(GOOGLE_UNIVERSAL_ANALYTICS_MACRO_TRACKING_ID_TOOL_TIPS);
    }
    public boolean googleAdsPhoneSnippet() {
        return confirmElementIsVisible(GOOGLE_ADS_PHONE_SNIPPET);
    }
    public boolean googleAdsPhoneSnippetToolTips() {
        return confirmElementIsVisible(GOOGLE_ADS_PHONE_SNIPPET_TOOL_TIPS);
    }
    public boolean googleTagManagerKey() {
        return confirmElementIsVisible(GOOGLE_TAG_MANAGER_KEY);
    }
    public boolean googleTagManagerKeyToolTips() {
        return confirmElementIsVisible(GOOGLE_TAG_MANAGER_KEY_TOOL_TIPS);
    }
    public boolean googleSearchConsoleMetaTagKey() {
        return confirmElementIsVisible(GOOGLE_SEARCH_CONSOLE_META_TAG_KEY);
    }
    public boolean googleSearchConsoleMetaTagKeyToolTips() {
        return confirmElementIsVisible(GOOGLE_SEARCH_CONSOLE_META_TAG_KEY_TOOL_TIPS);
    }
    public boolean residentPortalGoogleAnalyticsTrackingKey() {
        return confirmElementIsVisible(RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY);
    }
    public boolean residentPortalGoogleAnalyticsTrackingKeyToolTips() {
        return confirmElementIsVisible(RESIDENT_PORTAL_GOOGLE_ANALYTICS_TRACKING_KEY_TOOL_TIPS);
    }
    public boolean residentPortalGoogleAnalyticsMacroTrackingKey() {
        return confirmElementIsVisible(RESIDENT_PORTAL_GOOGLE_ANALYTICS_MACRO_TRACKING_KEY);
    }
    public boolean residentPortalGoogleAnalyticsMacroTrackingKeyToolTips() {
        return confirmElementIsVisible(RESIDENT_PORTAL_GOOGLE_ANALYTICS_MACRO_TRACKING_KEY_TOOL_TIPS);
    }
}

