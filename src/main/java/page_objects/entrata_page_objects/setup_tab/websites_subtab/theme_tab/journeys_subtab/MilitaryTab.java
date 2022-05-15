package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MilitaryTab extends BasePage {
    public MilitaryTab(WebDriver driver) {
        super(driver);
    }

    // Military Single Occupant Journey variables //
    private final By MILITARY_SINGLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Single Occupant Journey']");
    private final By MILITARY_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("single-occupant-military-journey-button");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_TITLE_TEXT = By.xpath("//*[text()='CTA Title:']");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS = By.id("MILITARY_CTA_SEARCH_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_SUB_TEXT = By.xpath("//*[text()='CTA Sub-Text:']");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_SUB_TEXT_TOOL_TIPS = By.id("MILITARY_CTA_SEARCH_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT = By.xpath("//*[text()='CTA Filter Type:']");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS = By.id("MILITARY_CTA_FILTER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_BUTTON_TEXT = By.xpath("//*[text()='CTA Button Text:']");
    private final By MILITARY_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS = By.id("MILITARY_CTA_SEARCH_BTN_TEXT_WEBSITE_PREFERENCES_HELP");
    // Military Multiple Occupant Journey variables//
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Multiple Occupant Journey']");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("multiple-occupant-military-journey-button");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT = By.xpath("//*[text()='Journey Selector Title:']");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS = By.id("MILITARY_CTA_SELECTOR_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT = By.xpath("//*[text()='Journey Selector Description:']");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS = By.id("MILITARY_CTA_SELECTOR_DESCRIPTION_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT = By.xpath("//*[text()='Journey Selector Image:']");
    private final By MILITARY_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT = By.xpath("//*[text()='CTA Selection Button Text:']");
    private final By MILITARY_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS = By.id("MILITARY_CTA_SELECTOR_BUTTON_TEXT_WEBSITE_PREFERENCES_HELP");

    // Military Single Occupant Journey methods//
    public boolean militarySingleOccupantJourneyHeader() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean militarySingleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean militarySingleOccupantCtaTitleText() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_CTA_TITLE_TEXT);
    }
    public boolean militarySingleOccupantCtaTitleToolTips() {
        return clickElement(MILITARY_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS);
    }
    public boolean militarySingleOccupantCtaSubText() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_CTA_SUB_TEXT);
    }
    public boolean militarySingleOccupantCtaSubTextToolTips() {
        return clickElement(MILITARY_SINGLE_OCCUPANT_CTA_SUB_TEXT_TOOL_TIPS);
    }
    public boolean militarySingleOccupantCtaFilterTypeText() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT);
    }
    public boolean militarySingleOccupantCtaFilterTypeToolTips() {
        return clickElement(MILITARY_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS);
    }
    public boolean militarySingleOccupantCtaButtonText() {
        return confirmElementIsVisible(MILITARY_SINGLE_OCCUPANT_CTA_BUTTON_TEXT);
    }
    public boolean militarySingleOccupantCtaButtonTextToolTips() {
        return clickElement(MILITARY_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS);
    }
    // Military Multiple Occupant Journey methods//
    public boolean militaryMultipleOccupantJourneyHeader() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean militaryMultipleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean militaryMultipleOccupantJourneySelectorTitleText() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT);
    }
    public boolean militaryMultipleOccupantJourneySelectorTitleToolTips() {
        return clickElement(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS);
    }
    public boolean militaryMultipleOccupantJourneySelectorDescriptionText() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT);
    }
    public boolean militaryMultipleOccupantJourneySelectorDescriptionToolTips() {
        return clickElement(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS);
    }
    public boolean militaryMultipleOccupantJourneySelectorImageText() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT);
    }
    public boolean militaryMultipleOccupantCtaSelectionButtonText() {
        return confirmElementIsVisible(MILITARY_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT);
    }
    public boolean militaryMultipleOccupantCtaSelectionButtonTextToolTips() {
        return clickElement(MILITARY_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS);
    }
}
