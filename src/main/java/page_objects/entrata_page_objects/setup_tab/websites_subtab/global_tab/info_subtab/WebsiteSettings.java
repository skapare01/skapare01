package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WebsiteSettings extends BasePage {
    public WebsiteSettings(WebDriver driver) {
        super(driver);
    }

    private final By WEBSITE_SETTINGS = By.xpath("//*[@id=\"b_website_settings\"]/h3");
    private final By WEBSITE_SETTINGS_EDIT_BTN = By.id("website-content-button");
    private final By ADA_ICON = By.xpath("//*[text()='ADA Icon:']");
    private final By ADA_ICON_TOOL_TIPS = By.id("SHOW_ADA_ICON_HELP");
    private final By TTY_NUMBER = By.xpath("//*[text()='TTY Number:']");
    private final By TTY_NUMBER_TOOL_TIPS = By.id("ADA_PHONE_NUMBER_WEBSITE_PREFERENCES_HELP");
    private final By EMAIL_US_LINK = By.xpath("//*[text()='Email Us Link:']");
    private final By EMAIL_US_LINK_TOOL_TIPS = By.id("EMAIL_US_HELP");
    private final By ENTRATA_LOGIN = By.xpath("//*[text()='Entrata Login:']");
    private final By ENTRATA_LOGIN_TOOL_TIPS = By.id("DISALLOW_LOGIN_FROM_ENTRATA_TO_PROSPECT_PORTAL_HELP");
    private final By ENTRATA_SEO_LINKS = By.xpath("//*[text()='Entrata SEO Links:']");
    private final By ENTRATA_SEO_LINKS_TOOL_TIPS = By.id("HIDE_SEO_LINK_TEXT_HELP");
    private final By GOOGLE_MAP_API_KEY = By.xpath("//*[text()='Google Map API Key:']");
    private final By GOOGLE_MAP_API_KEY_TOOL_TIPS = By.id("RESPONSIVE_GOOGLE_MAPS_API_KEY");
    private final By LANGUAGES = By.xpath("//*[text()='Languages:']");
    private final By LANGUAGES_TOOL_TIPS = By.id("SELECT_LANGUAGES_WEBSITE_PREFERENCES_HELP");
    private final By LANGUAGE_TRANSLATOR = By.xpath("//*[text()='Language Translator:']");
    private final By LANGUAGE_TRANSLATOR_TOOL_TIPS = By.id("SHOW_LANGUAGE_TRANSLATE_HELP");
    private final By LANGUAGES_TRANSLATOR_IN_TOP_NAVIGATION = By.xpath("//*[text()='Languages Translator in Top Navigation:']");
    private final By LANGUAGES_TRANSLATOR_IN_TOP_NAVIGATION_TOOL_TIPS = By.id("SHOW_LANGUAGE_TRANSLATE_IN_TOP_NAVIGATION_HELP");
    private final By PRESS_RELEASES_LINK= By.xpath("//*[text()='Press Releases Link:']");
    private final By PRESS_RELEASES_LINK_TOOL_TIPS = By.id("SHOW_PRESS_RELEASES_HELP");
    private final By ACCESSIBILITY_STATEMENT_LINK = By.xpath("//*[text()='Accessibility Statement Link:']");
    private final By ACCESSIBILITY_STATEMENT_LINK_TOOL_TIPS = By.id("SHOW_ACCESSIBILITY_STATEMENT_HELP");
    private final By PHONE_NUMBER_FORMAT = By.xpath("//*[text()='Phone # Format:']");
    private final By PHONE_NUMBER_FORMAT_TOOL_TIPS = By.id("PHONE_NUMBER_FORMAT_HELP");

    public boolean websiteSettings() {
        return confirmElementIsVisible(WEBSITE_SETTINGS);
    }
    public boolean websiteSettingsEditBtn() {
        return confirmElementIsVisible(WEBSITE_SETTINGS_EDIT_BTN);
    }
    public boolean adaIcon() {
        return confirmElementIsVisible(ADA_ICON);
    }
    public boolean adaIconToolTips() {
        return clickElement(ADA_ICON_TOOL_TIPS);
    }
    public boolean ttyNumber() {
        return confirmElementIsVisible(TTY_NUMBER);
    }
    public boolean ttyNumberToolTips() {
        return clickElement(TTY_NUMBER_TOOL_TIPS);
    }
    public boolean emailUsLink() {
        return confirmElementIsVisible(EMAIL_US_LINK);
    }
    public boolean emailUsLinkToolTips() {
        return clickElement(EMAIL_US_LINK_TOOL_TIPS);
    }
    public boolean entrataLogin() {
        return confirmElementIsVisible(ENTRATA_LOGIN);
    }
    public boolean entrataLoginToolTips() {
        return clickElement(ENTRATA_LOGIN_TOOL_TIPS);
    }
    public boolean entrataSEOLinks() {
        return confirmElementIsVisible(ENTRATA_SEO_LINKS);
    }
    public boolean entrataSEOLinksToolTips() {
        return clickElement(ENTRATA_SEO_LINKS_TOOL_TIPS);
    }
    public boolean googleMapApiKey() {
        return confirmElementIsVisible(GOOGLE_MAP_API_KEY);
    }
    public boolean googleMapApiKeyToolTips() {
        return clickElement(GOOGLE_MAP_API_KEY_TOOL_TIPS);
    }
    public boolean languages() {
        return confirmElementIsVisible(LANGUAGES);
    }
    public boolean languagesToolTips() {
        return clickElement(LANGUAGES_TOOL_TIPS);
    }
    public boolean languageTranslator() {
        return confirmElementIsVisible(LANGUAGE_TRANSLATOR);
    }
    public boolean languageTranslatorToolTips() {
        return clickElement(LANGUAGE_TRANSLATOR_TOOL_TIPS);
    }
    public boolean languagesTranslatorInTopNavigation() {
        return confirmElementIsVisible(LANGUAGES_TRANSLATOR_IN_TOP_NAVIGATION);
    }
    public boolean languagesTranslatorInTopNavigationToolTips() {
        return clickElement(LANGUAGES_TRANSLATOR_IN_TOP_NAVIGATION_TOOL_TIPS);
    }
    public boolean pressReleasesLink() {
        return confirmElementIsVisible(PRESS_RELEASES_LINK);
    }
    public boolean pressReleasesLinkToolTips() {
        return clickElement(PRESS_RELEASES_LINK_TOOL_TIPS);
    }
    public boolean accessibilityStatementLink() {
        return confirmElementIsVisible(ACCESSIBILITY_STATEMENT_LINK);
    }
    public boolean accessibilityStatementLinkToolTips() {
        return clickElement(ACCESSIBILITY_STATEMENT_LINK_TOOL_TIPS);
    }
    public boolean phoneNumFormat() {
        return confirmElementIsVisible(PHONE_NUMBER_FORMAT);
    }
    public boolean phoneNumFormatToolTips() {
        return clickElement(PHONE_NUMBER_FORMAT_TOOL_TIPS);
    }
}
