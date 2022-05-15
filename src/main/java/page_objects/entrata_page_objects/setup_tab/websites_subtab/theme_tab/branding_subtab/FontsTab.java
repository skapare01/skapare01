package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FontsTab extends BasePage {
    public FontsTab(WebDriver driver) {
        super(driver);
    }

    private final By FONTS_HEADER_TEXT = By.xpath("//*[text()='Fonts']");
    private final By FONTS_EDIT_BTN =By.id("website-branding-fonts-button");
    private final By HEADLINE_FONT_TEXT = By.xpath("//*[text()='Headline Font:']");
    private final By HEADLINE_FONT_TOOL_TIPS =By.id("HEADLINE_FONT_WEBSITE_PREFERENCES_HELP");
    private final By BODY_FONT_TEXT = By.xpath("//*[text()='Body Font:']");
    private final By BODY_FONT_TOOL_TIPS =By.id("BODY_FONT_WEBSITE_PREFERENCES_HELP");

    public boolean fontsHeaderText() {
        return confirmElementIsVisible(FONTS_HEADER_TEXT);
    }
    public boolean fontsEditBtn() {
        return confirmElementIsVisible(FONTS_EDIT_BTN);
    }
    public boolean headlineFontText() {
        return confirmElementIsVisible(HEADLINE_FONT_TEXT);
    }
    public boolean headlineFontToolTips() {
        return clickElement(HEADLINE_FONT_TOOL_TIPS);
    }
    public boolean bodyFontText() {
        return confirmElementIsVisible(BODY_FONT_TEXT);
    }
    public boolean bodyFontToolTips() {
        return clickElement(BODY_FONT_TOOL_TIPS);
    }
}
