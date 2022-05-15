package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SocialMediaSettings extends BasePage {
    public SocialMediaSettings(WebDriver driver) {
        super(driver);
    }

    private final By SOCIAL_MEDIA_ANALYTICS_SETTINGS = By.xpath("//*[text()='Social Media Analytics Settings']");
    private final By SOCIAL_MEDIA_ANALYTICS_SETTINGS_EDIT_BTN = By.id("social-media-button");
    private final By FACEBOOK_PIXEL_TRACKING_CODE= By.xpath("//*[@id=\"social-media-view\"]/div[1]/label");
    private final By FACEBOOK_PIXEL_TRACKING_CODE_TOOL_TIPS = By.id("FACEBOOK_PIXEL_TRACKING_CODE_NEW");
    private final By PINTEREST_META_TAG_KEY = By.xpath("//*[text()='Pinterest Meta Tag Key:']");
    private final By PINTEREST_META_TAG_KEY_TOOL_TIPS = By.id("PINTEREST_VERIFICATION_CODE");

    public boolean socialMediaAnalyticsSettings() {
        return confirmElementIsVisible(SOCIAL_MEDIA_ANALYTICS_SETTINGS);
    }
    public boolean socialMediaEditBtn() {
        return confirmElementIsVisible(SOCIAL_MEDIA_ANALYTICS_SETTINGS_EDIT_BTN);
    }
    public boolean facebookPixelTrackingCode() {
        return confirmElementIsVisible(FACEBOOK_PIXEL_TRACKING_CODE);
    }
    public boolean facebookPixelTrackingCodeToolTips() {
        return clickElement(FACEBOOK_PIXEL_TRACKING_CODE_TOOL_TIPS);
    }
    public boolean pinterestMetaTagKey() {
        return confirmElementIsVisible(PINTEREST_META_TAG_KEY);
    }
    public boolean pinterestMetaTagKeyToolTips() {
        return clickElement(PINTEREST_META_TAG_KEY_TOOL_TIPS);
    }
}

