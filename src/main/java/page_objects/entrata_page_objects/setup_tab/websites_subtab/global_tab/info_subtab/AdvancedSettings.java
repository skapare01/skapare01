package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AdvancedSettings extends BasePage {
    public AdvancedSettings(WebDriver driver) {
        super(driver);
    }

    private final By ADVANCED_SETTINGS_LINK = By.xpath("//*[text()=' Advanced Settings']");
    private final By ADVANCED_SETTINGS_HEADER_TEXT = By.id("b_advanced_settings");
    private final By ADVANCED_SETTINGS_HEADER_TEXT_EDIT_BTN = By.id("advanced-content-button");
    private final By ADOBE_DYNAMIC_TAG_MANAGEMENT_URL = By.xpath("//*[text()='Adobe Dynamic Tag Management URL:']");
    private final By ADOBE_DYNAMIC_TAG_MANAGEMENT_URL_TOOL_TIPS = By.id("ADOBE_DTM_PATH_WEBSITE_PREFERENCES_HELP");
    private final By WEBSITE_CHAT_HTML = By.xpath("//*[text()='Website Chat HTML:']");
    private final By WEBSITE_CHAT_HTML_TOOL_TIPS = By.id("HIDE_WEBSITE_CHAT_HTML_FROM_APPLICATION_PAGE");
    private final By WEBSITE_CHAT_HTML_CONTENT = By.xpath("//*[text()='Website Chat HTML Content:']");
    private final By WEBSITE_CHAT_HTML_CONTENT_TOOL_TIPS = By.id("WEBSITE_CHAT_HTML_WEBSITE_PREFERENCES_HELP");
    private final By APPLY_NOW = By.xpath("//*[text()='Apply Now:']");
    private final By APPLY_NOW_TOOL_TIPS = By.id("HIDE_APPLY_NOW_LINK_HELP");
    private final By GOOGLE_RECAPTCHA_SITE_KEY = By.xpath("//*[text()='Google Recaptcha Site Key:']");
    private final By GOOGLE_RECAPTCHA_SITE_KEY_TOOL_TIPS = By.id("GOOGLE_RECAPTCHA_SITE_KEY_WEBSITE_PREFERENCES_HELP");
    private final By GOOGLE_RECAPTCHA_SECRET_KEY = By.xpath("//*[text()='Google Recaptcha Secret Key:']");
    private final By GOOGLE_RECAPTCHA_SECRET_KEY_TOOL_TIPS = By.id("GOOGLE_RECAPTCHA_SECRET_KEY_WEBSITE_PREFERENCES_HELP");
    private final By EQUAL_HOUSING_OPPORTUNITY_EXTERNAL_LINK= By.xpath("//*[text()='Equal Housing Opportunity External Link:']");
    private final By EQUAL_HOUSING_OPPORTUNITY_EXTERNAL_LINK_TOOL_TIPS = By.id("EQUAL_HOUSING_OPPORTUNITY_EXTERNAL_URL_WEBSITE_PREFERENCES_HELP");
    private final By EHO_LINK_ALT_TEXT_OVERRIDE= By.xpath("//*[text()='EHO Link Alt Text Override:']");
    private final By EHO_LINK_ALT_TEXT_OVERRIDE_TOOL_TIPS = By.id("EHO_LINK_ALT_TEXT");
    private final By ADA_ICON_EXTERNAL_LINK= By.xpath("//*[text()='ADA Icon External Link:']");
    private final By ADA_ICON_EXTERNAL_LINK_TOOL_TIPS= By.id("ADA_ICON_EXTERNAL_LINK");
    private final By ADA_LINK_ALT_TEXT_OVERRIDE = By.xpath("//*[text()='ADA Link Alt Text Override:']");
    private final By ADA_LINK_ALT_TEXT_OVERRIDE_TOOL_TIPS = By.id("ADA_LINK_ALT_TEXT");
    private final By TERMS_OF_USE_EXTERNAL_LINK = By.xpath("//*[text()='Terms of Use External Link:']");
    private final By TERMS_OF_USE_EXTERNAL_LINK_TOOL_TIPS = By.id("TERM_OF_USE_EXTERNAL_LINK");
    private final By PRIMARY_PRIVACY_POLICY_EXTERNAL_LINK = By.xpath("//*[text()='Primary Privacy Policy External Link:']");
    private final By PRIMARY_PRIVACY_POLICY_EXTERNAL_LINK_TOOL_TIPS = By.id("PRIMARY_PRIVACY_POLICY_EXTERNAL_LINK");
    private final By PRIMARY_PRIVACY_POLICY_DISPLAY_TEXT = By.xpath("//*[text()='Primary Privacy Policy Display Text:']");
    private final By PRIMARY_PRIVACY_POLICY_DISPLAY_TEXT_TOOL_TIPS = By.id("PRIMARY_PRIVACY_POLICY_DISPLAY_TEXT");
    private final By SECONDARY_PRIVACY_POLICY_EXTERNAL_LINK= By.xpath("//*[text()='Secondary Privacy Policy External Link:']");
    private final By SECONDARY_PRIVACY_POLICY_EXTERNAL_LINK_TOOL_TIPS = By.id("SECONDARY_PRIVACY_POLICY_EXTERNAL_LINK");
    private final By SECONDARY_PRIVACY_POLICY_DISPLAY_TEXT = By.xpath("//*[text()='Secondary Privacy Policy Display Text:']");
    private final By SECONDARY_PRIVACY_POLICY_DISPLAY_TEXT_TOOL_TIPS = By.id("SECONDARY_PRIVACY_POLICY_DISPLAY_TEXT");
    private final By HIDE_WEBSITE_ENTRATA_ADMIN_ONLY = By.xpath("//*[text()='Hide Website (Entrata Admin Only):']");

    public boolean advancedSettingsLink() {
        return clickElement(ADVANCED_SETTINGS_LINK);
    }
    public boolean advancedSettingsHeaderText() {
        return confirmElementIsVisible(ADVANCED_SETTINGS_HEADER_TEXT);
    }
    public boolean advancedSettingsHeaderTextEditBtn() {
        return confirmElementIsVisible(ADVANCED_SETTINGS_HEADER_TEXT_EDIT_BTN);
    }
    public boolean adobeDynamicTagManagementUrl() {
        return confirmElementIsVisible(ADOBE_DYNAMIC_TAG_MANAGEMENT_URL);
    }
    public boolean adobeDynamicTagManagementUrlToolTips() {
        return clickElement(ADOBE_DYNAMIC_TAG_MANAGEMENT_URL_TOOL_TIPS);
    }
    public boolean websiteChatHtml() {
        return confirmElementIsVisible(WEBSITE_CHAT_HTML);
    }
    public boolean websiteChatHtmlToolTips() {
        return clickElement(WEBSITE_CHAT_HTML_TOOL_TIPS);
    }
    public boolean websiteChatHtmlContent() {
        return confirmElementIsVisible(WEBSITE_CHAT_HTML_CONTENT);
    }
    public boolean websiteChatHtmlContentToolTips() {
        return clickElement(WEBSITE_CHAT_HTML_CONTENT_TOOL_TIPS);
    }
    public boolean applyNow() {
        return confirmElementIsVisible(APPLY_NOW);
    }
    public boolean applyNowToolTips() {
        return clickElement(APPLY_NOW_TOOL_TIPS);
    }
    public boolean googleRecaptchaSiteKey() {
        return confirmElementIsVisible(GOOGLE_RECAPTCHA_SITE_KEY);
    }
    public boolean googleRecaptchaSiteKeyToolTips() {
        return clickElement(GOOGLE_RECAPTCHA_SITE_KEY_TOOL_TIPS);
    }
    public boolean googleRecaptchaSecretKey() {
        return confirmElementIsVisible(GOOGLE_RECAPTCHA_SECRET_KEY);
    }
    public boolean googleRecaptchaSecretKeyToolTips() {
        return clickElement(GOOGLE_RECAPTCHA_SECRET_KEY_TOOL_TIPS);
    }
    public boolean equalHousingOpportunityExternalLink() {
        return confirmElementIsVisible(EQUAL_HOUSING_OPPORTUNITY_EXTERNAL_LINK);
    }
    public boolean equalHousingOpportunityExternalLinkToolTips(){
        return clickElement(EQUAL_HOUSING_OPPORTUNITY_EXTERNAL_LINK_TOOL_TIPS);
    }
    public boolean ehoLinkAltTextOverride() {
        return confirmElementIsVisible(EHO_LINK_ALT_TEXT_OVERRIDE);
    }
    public boolean ehoLinkAltTextOverrideToolTips() {
        return clickElement(EHO_LINK_ALT_TEXT_OVERRIDE_TOOL_TIPS);
    }
    public boolean adaIconExternalLink() {
        return confirmElementIsVisible(ADA_ICON_EXTERNAL_LINK);
    }
    public boolean adaIconExternalLinkToolTips() {
        return clickElement(ADA_ICON_EXTERNAL_LINK_TOOL_TIPS);
    }
    public boolean adaLinkAltTextOverride() {
        return confirmElementIsVisible(ADA_LINK_ALT_TEXT_OVERRIDE);
    }
    public boolean adaLinkAltTextOverrideToolTips() {
        return clickElement(ADA_LINK_ALT_TEXT_OVERRIDE_TOOL_TIPS);
    }
    public boolean termsOfUseExternalLink() {
        return confirmElementIsVisible(TERMS_OF_USE_EXTERNAL_LINK);
    }
    public boolean termsOfUseExternalLinkToolTips() {
        return clickElement(TERMS_OF_USE_EXTERNAL_LINK_TOOL_TIPS);
    }
    public boolean primaryPrivacyPolicyExternalLink() {
        return confirmElementIsVisible(PRIMARY_PRIVACY_POLICY_EXTERNAL_LINK);
    }
    public boolean primaryPrivacyPolicyExternalLinkToolTips() {
        return clickElement(PRIMARY_PRIVACY_POLICY_EXTERNAL_LINK_TOOL_TIPS);
    }
    public boolean primaryPrivacyPolicyDisplayText() {
        return confirmElementIsVisible(PRIMARY_PRIVACY_POLICY_DISPLAY_TEXT);
    }
    public boolean primaryPrivacyPolicyDisplayTextToolTips() {
        return clickElement(PRIMARY_PRIVACY_POLICY_DISPLAY_TEXT_TOOL_TIPS);
    }
    public boolean secondaryPrivacyPolicyExternalLink() {
        return confirmElementIsVisible(SECONDARY_PRIVACY_POLICY_EXTERNAL_LINK);
    }
    public boolean secondaryPrivacyPolicyExternalLinkToolTips() {
        return clickElement(SECONDARY_PRIVACY_POLICY_EXTERNAL_LINK_TOOL_TIPS);
    }
    public boolean secondaryPrivacyPolicyDisplayText() {
        return confirmElementIsVisible(SECONDARY_PRIVACY_POLICY_DISPLAY_TEXT);
    }
    public boolean secondaryPrivacyPolicyDisplayTextToolTips() {
        return clickElement(SECONDARY_PRIVACY_POLICY_DISPLAY_TEXT_TOOL_TIPS);
    }
    public boolean hideWebsiteEntrataAdminOnly() {
        return confirmElementIsVisible(HIDE_WEBSITE_ENTRATA_ADMIN_ONLY);
    }
}
