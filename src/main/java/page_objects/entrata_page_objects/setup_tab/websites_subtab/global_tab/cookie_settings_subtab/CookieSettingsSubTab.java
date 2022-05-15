package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.cookie_settings_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CookieSettingsSubTab extends BasePage {
    public CookieSettingsSubTab(WebDriver driver) {
        super(driver);
    }

    private final By COOKIE_PREFERENCES_HEADER = By.xpath("//*[text()='Cookie Preferences']");
    private final By ADD_COOKIE_BTN= By.xpath("//*[text()=' Add Cookie']");
    private final By COOKIE_NAME_PREFERENCE = By.xpath("//*[text()='Name']");
    private final By COOKIE_CATEGORY_PREFERENCE = By.xpath("//*[text()='Category']");
    private final By COOKIE_DESCRIPTION_PREFERENCE = By.xpath("//*[text()='Description']");
    private final By COOKIE_TOKEN_PREFERENCE = By.xpath("//*[text()='Token']");
    private final By COOKIE_PRIVACY_ITEM_TYPE_PREFERENCE = By.xpath("//*[text()='Privacy Item Type']");
    private final By COOKIE_ACTIONS_PREFERENCE = By.xpath("//*[text()='Actions']");
    private final By COOKIE_BANNER_TEXT_HEADER = By.id("website-content");
    private final By COOKIE_BANNER_TEXT_EDIT_BTN = By.id("cookie-banner-text-settings-button");
    private final By COOKIE_BANNER_TEXT = By.xpath("//*[text()='Cookie Banner Text:']");
    private final By COOKIE_BANNER_TEXT_TOOL_TIPS = By.id("COOKIE_BANNER_TEXT_HELP");

    public boolean cookiePreferencesHeader() {
        return confirmElementIsVisible(COOKIE_PREFERENCES_HEADER);
    }
    public boolean addCookieBtn() {
        return confirmElementIsVisible(ADD_COOKIE_BTN);
    }
    public boolean cookieNamePreference() {
        return confirmElementIsVisible(COOKIE_NAME_PREFERENCE);
    }
    public boolean cookieCategoryPreference() {
        return confirmElementIsVisible(COOKIE_CATEGORY_PREFERENCE);
    }
    public boolean cookieDescriptionPreference() {
        return confirmElementIsVisible(COOKIE_DESCRIPTION_PREFERENCE);
    }
    public boolean cookieTokenPreference() {
        return confirmElementIsVisible(COOKIE_TOKEN_PREFERENCE);
    }
    public boolean cookiePrivacyItemTypePreference() {
        return confirmElementIsVisible(COOKIE_PRIVACY_ITEM_TYPE_PREFERENCE);
    }
    public boolean cookieActionsPreference() {
        return confirmElementIsVisible(COOKIE_ACTIONS_PREFERENCE);
    }
    public boolean cookieBannerTextHeader() {
        return confirmElementIsVisible(COOKIE_BANNER_TEXT_HEADER);
    }
    public boolean cookieBannerEditBtn() {
        return confirmElementIsVisible(COOKIE_BANNER_TEXT_EDIT_BTN);
    }
    public boolean cookieBannerText() {
        return confirmElementIsVisible(COOKIE_BANNER_TEXT);
    }
    public boolean cookieBannerTextToolTips() {
        return clickElement(COOKIE_BANNER_TEXT_TOOL_TIPS);
    }
}
