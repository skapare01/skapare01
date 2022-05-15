package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.social_media_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SocialMediaSubTab extends BasePage {
    public SocialMediaSubTab(WebDriver driver) {
        super(driver);
    }

    private final By SOCIAL_MEDIA_SETTINGS_HEADER = By.xpath("//*[text()='Social Media Settings']");
    private final By SOCIAL_MEDIA_EDIT_BTN = By.id("social-media-content-button");
    private final By SOCIAL_MEDIA_SETTINGS_PIN_IT_BUTTON = By.xpath("//*[text()='Pin-It Button:']");
    private final By SOCIAL_MEDIA_SETTINGS_PIN_IT_BUTTON_TOOL_TIPS = By.id("ACTIVATE_PINIT_BUTTON_WEBSITE_PREFERENCES_HELP");
    private final By SOCIAL_MEDIA_SETTINGS_TWITTER_USERNAME = By.xpath("//*[text()='Twitter Username:']");
    private final By SOCIAL_MEDIA_SETTINGS_TWITTER_USERNAME_TOOL_TIPS = By.id("TWITTER_SITE_OWNER_WEBSITE_PREFERENCES_HELP");

    public boolean socialMediaSettingsHeader() {
        return confirmElementIsVisible(SOCIAL_MEDIA_SETTINGS_HEADER);
    }
    public boolean socialMediaSettingsEditBtn() {
        return confirmElementIsVisible(SOCIAL_MEDIA_EDIT_BTN);
    }
    public boolean socialMediaSettingsPinItButton() {
        return confirmElementIsVisible(SOCIAL_MEDIA_SETTINGS_PIN_IT_BUTTON);
    }
    public boolean socialMediaSettingsPinItButtonToolTips() {
        return clickElement(SOCIAL_MEDIA_SETTINGS_PIN_IT_BUTTON_TOOL_TIPS);
    }
    public boolean socialMediaTwitterUsername() {
        return confirmElementIsVisible(SOCIAL_MEDIA_SETTINGS_TWITTER_USERNAME);
    }
    public boolean socialMediaTwitterUsernameToolTips() {
        return clickElement(SOCIAL_MEDIA_SETTINGS_TWITTER_USERNAME_TOOL_TIPS);
    }
}
