package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DesignSettingsTab extends BasePage {
    public DesignSettingsTab(WebDriver driver) {
        super(driver);
    }

    private final By DESIGN_SPECIFIC_SETTINGS_HEADER = By.xpath("//h3[text()='Design Specific Settings']");
    private final By DESIGN_SPECIFIC_SETTINGS_EDIT_BTN = By.id("template-settings-button");
    private final By DESIGN_SPECIFIC_HEADER_LAYOUT_TEXT = By.xpath("//*[text()='Header Layout:']");
    private final By DESIGN_SPECIFIC_HEADER_LAYOUT_TOOL_TIPS = By.id("HEADER_LAYOUT_WEBSITE_PREFERENCES_HELP");
    private final By DESIGN_SPECIFIC_LANDING_TEXT_LAYOUT_TEXT = By.xpath("//*[text()='Landing Text Layout:']");
    private final By DESIGN_SPECIFIC_LANDING_TEXT_TOOL_TIPS = By.id("LANDING_TEXT_LAYOUT_WEBSITE_PREFERENCES_HELP");
    private final By DESIGN_SPECIFIC_WIDGET_ROW_TWO_LAYOUT_TEXT = By.xpath("//*[text()='Widget Row 2 Layout:']");
    private final By DESIGN_SPECIFIC_WIDGET_ROW_TWO_TOOL_TIPS = By.id("WIDGET_ROW_2_LAYOUT_WEBSITE_PREFERENCES_HELP");
    private final By DESIGN_SPECIFIC_FOOTER_LAYOUT_TEXT = By.xpath("//*[text()='Footer Layout:']");
    private final By DESIGN_SPECIFIC_FOOTER_LAYOUT_TOOL_TIPS = By.id("FOOTER_LAYOUT_WEBSITE_PREFERENCES_HELP");

    public boolean brandingDesignSpecificSettingsHeader() {
       return confirmElementIsVisible(DESIGN_SPECIFIC_SETTINGS_HEADER);
    }
    public boolean brandingDesignSpecificSettingsEditBtn() {
        return confirmElementIsVisible(DESIGN_SPECIFIC_SETTINGS_EDIT_BTN);
    }
    public boolean designSpecificHeaderLayoutText() {
      return confirmElementIsVisible(DESIGN_SPECIFIC_HEADER_LAYOUT_TEXT);
    }
    public boolean designSpecificHeaderLayoutToolTips() {
        return clickElement(DESIGN_SPECIFIC_HEADER_LAYOUT_TOOL_TIPS);
    }
    public boolean designSpecificLandingTextLayoutText() {
       return confirmElementIsVisible(DESIGN_SPECIFIC_LANDING_TEXT_LAYOUT_TEXT);
    }
    public boolean designSpecificLandingTextLayoutToolTips() {
        return clickElement(DESIGN_SPECIFIC_LANDING_TEXT_TOOL_TIPS);
    }
    public boolean designSpecificWidgetRowTwoLayoutText() {
        return confirmElementIsVisible(DESIGN_SPECIFIC_WIDGET_ROW_TWO_LAYOUT_TEXT);
    }
    public boolean designSpecificWidgetRowTwoLayoutToolTips() {
        return clickElement(DESIGN_SPECIFIC_WIDGET_ROW_TWO_TOOL_TIPS);
    }
    public boolean designSpecificFooterLayoutText() {
        return confirmElementIsVisible(DESIGN_SPECIFIC_FOOTER_LAYOUT_TEXT);
    }
    public boolean designSpecificFooterLayoutToolTips() {
        return clickElement(DESIGN_SPECIFIC_FOOTER_LAYOUT_TOOL_TIPS);
    }
}
