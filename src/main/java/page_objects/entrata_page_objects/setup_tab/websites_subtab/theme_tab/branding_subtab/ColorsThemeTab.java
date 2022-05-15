package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ColorsThemeTab extends BasePage {
    public ColorsThemeTab(WebDriver driver) {
        super(driver);
    }

    private final By COLORS_HEADER = By.xpath("//h3[text()='Colors']");
    private final By COLORS_EDIT_BTN = By.id("website-branding-colors-button");
    private final By ENABLE_COLOR_CONTRAST_ACCESSIBILITY_TEXT = By.xpath("//*[text()='Enable Color Contrast Accessibility:']");
    private final By THEME_TEXT = By.xpath("//*[text()='Theme:']");
    private final By BRAND_COLOR_TEXT = By.xpath("//*[text()='Brand Color:']");
    private final By TOOL_TIPS= By.id("TEMPLATE_THEME_COLORS_WEBSITE_PREFERENCES_HELP");
    private final By ACCENT_COLOR_ONE_TEXT = By.xpath("//*[text()='Accent Color One:']");
    private final By ACCENT_COLOR_TWO_TEXT = By.xpath("//*[text()='Accent Color Two:']");
    private final By ACCENT_COLOR_THREE_TEXT = By.xpath("//*[text()='Accent Color Three:']");
    private final By SITE_PLAN_ACTIVE_PIN_COLOR_TEXT = By.xpath("//*[text()='Site Plan Active Pin Color:']");

    public boolean colorsHeaderText() {
        return confirmElementIsVisible(COLORS_HEADER);
    }
    public boolean colorsEditBtn() {
        return confirmElementIsVisible(COLORS_EDIT_BTN);
    }
    public boolean enableColorContrastAccessibilityText() {
        return confirmElementIsVisible(ENABLE_COLOR_CONTRAST_ACCESSIBILITY_TEXT);
    }
    public boolean themeText() {
        return confirmElementIsVisible(THEME_TEXT);
    }
    public boolean brandColorText() {
        return confirmElementIsVisible(BRAND_COLOR_TEXT);
    }
    public boolean colorToolTips() {
        return clickElement(TOOL_TIPS);
    }
    public boolean accentColorOneText() {
        return confirmElementIsVisible(ACCENT_COLOR_ONE_TEXT);
    }
    public boolean accentColorTwoText() {
        return confirmElementIsVisible(ACCENT_COLOR_TWO_TEXT);
    }
    public boolean accentColorThreeText() {
        return confirmElementIsVisible(ACCENT_COLOR_THREE_TEXT);
    }
    public boolean sitePlanActivePinColorText() {
        return confirmElementIsVisible(SITE_PLAN_ACTIVE_PIN_COLOR_TEXT);
    }
}
