package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralTab extends BasePage {
    public GeneralTab(WebDriver driver) {
        super(driver);
    }

    private final By JOURNEYS_GENERAL_SETTINGS_HEADER = By.xpath("//h3[text()='General Settings']");
    private final By JOURNEYS_GENERAL_SETTINGS_EDIT_BTN = By.id("general-journey-button");
    private final By JOURNEYS_GENERAL_CTA_TITLE_TEXT = By.xpath("//*[text()='CTA Title:']");
    private final By JOURNEYS_GENERAL_CTA_TITLE_TOOL_TIPS = By.id("GENERAL_CTA_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By JOURNEYS_GENERAL_CTA_SUB_TEXT = By.xpath("//*[text()='CTA Sub-Text:']");
    private final By JOURNEYS_MULTI_PROPERTY_SETTINGS_HEADER = By.xpath("//h3[text()='Multi-Property Settings']");
    private final By JOURNEYS_MULTI_PROPERTY_SETTINGS_EDIT_BTN = By.id("general-multi-property-journey-button");
    private final By JOURNEYS_MULTI_PROPERTY_TITLE_TEXT = By.xpath("//*[text()='Title:']");
    private final By JOURNEYS_MULTI_PROPERTY_TITLE_TOOL_TIPS = By.id("MULTI_PROPERTY_CTA_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By JOURNEYS_MULTI_PROPERTY_DESCRIPTION_TEXT = By.xpath("//*[text()='Description:']");
    private final By JOURNEYS_MULTI_PROPERTY_DESCRIPTION_TOOL_TIPS = By.id("MULTI_PROPERTY_CTA_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By JOURNEYS_MULTI_PROPERTY_CTA_FILTER_TYPE_TEXT = By.xpath("//*[text()='CTA Filter Type:']");
    private final By JOURNEYS_MULTI_PROPERTY_CTA_FILTER_TYPE_TOOL_TIPS = By.id("MULTI_PROPERTY_CTA_FILTER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By JOURNEYS_MULTI_PROPERTY_BUTTON_TEXT = By.xpath("//*[text()='Button Text:']");
    private final By JOURNEYS_MULTI_PROPERTY_BUTTON_TEXT_TOOL_TIPS = By.id("MULTI_PROPERTY_CTA_BTN_TEXT_WEBSITE_PREFERENCES_HELP");

    public boolean journeysGeneralSettingsHeader() {
        return confirmElementIsVisible(JOURNEYS_GENERAL_SETTINGS_HEADER);
    }
    public boolean journeysGeneralSettingsEditBtn() {
        return confirmElementIsVisible(JOURNEYS_GENERAL_SETTINGS_EDIT_BTN);
    }
    public boolean journeysGeneralCtaTitleText() {
        return confirmElementIsVisible(JOURNEYS_GENERAL_CTA_TITLE_TEXT);
    }
    public boolean journeysGeneralCtaTitleToolTips() {
        return clickElement(JOURNEYS_GENERAL_CTA_TITLE_TOOL_TIPS);
    }
    public boolean journeysGeneralCtaSubText() {
        return confirmElementIsVisible(JOURNEYS_GENERAL_CTA_SUB_TEXT);
    }
    public boolean journeysMultiPropertySettingsHeader() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_SETTINGS_HEADER);
    }
    public boolean journeysMultiPropertyEditBtn() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_SETTINGS_EDIT_BTN);
    }
    public boolean journeysMultiPropertyTitleText() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_TITLE_TEXT);
    }
    public boolean journeysMultiPropertyTitleToolTips() {
        return clickElement(JOURNEYS_MULTI_PROPERTY_TITLE_TOOL_TIPS);
    }
    public boolean journeysMultiPropertyDescriptionText() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_DESCRIPTION_TEXT);
    }
    public boolean journeysMultiPropertyDescriptionToolTips() {
        return clickElement(JOURNEYS_MULTI_PROPERTY_DESCRIPTION_TOOL_TIPS);
    }
    public boolean journeysMultiPropertyCtaFilterTypeText() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_CTA_FILTER_TYPE_TEXT);
    }
    public boolean journeysMultiPropertyCtaFilterTypeToolTips() {
        return clickElement(JOURNEYS_MULTI_PROPERTY_CTA_FILTER_TYPE_TOOL_TIPS);
    }
    public boolean journeysMultiPropertyButtonText() {
        return confirmElementIsVisible(JOURNEYS_MULTI_PROPERTY_BUTTON_TEXT);
    }
    public boolean journeysMultiPropertyButtonTextToolTips() {
        return clickElement(JOURNEYS_MULTI_PROPERTY_BUTTON_TEXT_TOOL_TIPS);
    }
}
