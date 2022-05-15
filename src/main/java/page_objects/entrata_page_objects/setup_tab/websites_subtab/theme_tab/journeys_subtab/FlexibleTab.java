package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FlexibleTab extends BasePage {
    public FlexibleTab(WebDriver driver) {
        super(driver);
    }

    // Flexible Single Occupant Journey variables //
    private final By FLEXIBLE_SINGLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Single Occupant Journey']");
    private final By FLEXIBLE_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("single-flexible-journey-button");
    private final By FLEX_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT = By.xpath("//*[text()='Active Applications:']");
    private final By FLEX_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS = By.id("FLEXIBLE_CTA_ACTIVE_APPLICATIONS_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT = By.xpath("//*[text()='Application Selection Instructional Text:']");
    private final By FLEX_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS = By.id("FLEXIBLE_APPLICATION_SELECTION_CUSTOM_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_SINGLE_OCCUPANT_CTA_TITLE_TEXT = By.xpath("//*[text()='CTA Title:']");
    private final By FLEX_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS = By.id("FLEXIBLE_CTA_SEARCH_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_SINGLE_OCCUPANT_CTA_SUB_TEXT = By.xpath("//*[text()='CTA Sub-Text:']");
    private final By FLEX_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT = By.xpath("//*[text()='CTA Filter Type:']");
    private final By FLEX_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS = By.id("FLEXIBLE_CTA_FILTER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_SINGLE_OCCUPANT_OCCUPANT_COUNT_TEXT = By.xpath("//*[text()='Occupant Count:']");
    private final By FLEX_SINGLE_OCCUPANT_OCCUPANT_COUNT_TOOL_TIPS = By.id("FLEXIBLE_CTA_OCCUPANT_COUNT_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_SINGLE_OCCUPANT_CTA_BUTTON_TEXT = By.xpath("//*[text()='CTA Button Text:']");
    private final By FLEX_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS = By.id("FLEXIBLE_CTA_SEARCH_BTN_TEXT_WEBSITE_PREFERENCES_HELP");
    // Flexible Multiple Occupant Journey variables//
    private final By FLEXIBLE_MULTIPLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Multiple Occupant Journey']");
    private final By FLEXIBLE_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("multiple-flexible-journey-button");
    private final By FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT = By.xpath("//*[text()='Journey Selector Title:']");
    private final By FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS = By.id("FLEXIBLE_CTA_SELECTOR_DESCRIPTION_WEBSITE_PREFERENCES_HELP");
    private final By FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT = By.xpath("//*[text()='Journey Selector Description:']");
    private final By FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT = By.xpath("//*[text()='Journey Selector Image:']");
    private final By FLEX_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT = By.xpath("//*[text()='CTA Selection Button Text:']");
    private final By FLEX_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS = By.id("FLEXIBLE_CTA_SELECTOR_BUTTON_TEXT_WEBSITE_PREFERENCES_HELP");

    // Flexible Single Occupant Journey methods//
    public boolean flexibleSingleOccupantJourneyHeader() {
        return confirmElementIsVisible(FLEXIBLE_SINGLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean flexibleSingleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(FLEXIBLE_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean flexSingleOccupantActiveApplicationsText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT);
    }
    public boolean flexSingleOccupantActiveApplicationsToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS);
    }
    public boolean flexSingleOccupantApplicationSelectionInstructionalText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT);
    }
    public boolean flexSingleOccupantApplicationSelectionInstructionalTextToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS);
    }
    public boolean flexSingleOccupantCtaTitleText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_CTA_TITLE_TEXT);
    }
    public boolean flexSingleOccupantCtaTitleToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS);
    }
    public boolean flexSingleOccupantCtaSubText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_CTA_SUB_TEXT);
    }
    public boolean flexSingleOccupantCtaFilterTypeText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT);
    }
    public boolean flexSingleOccupantCtaFilterTypeToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS);
    }
    public boolean flexSingleOccupantOccupantCountText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_OCCUPANT_COUNT_TEXT);
    }
    public boolean flexSingleOccupantOccupantCountToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_OCCUPANT_COUNT_TOOL_TIPS);
    }
    public boolean flexSingleOccupantCtaButtonText() {
        return confirmElementIsVisible(FLEX_SINGLE_OCCUPANT_CTA_BUTTON_TEXT);
    }
    public boolean flexSingleOccupantCtaButtonTextToolTips() {
        return clickElement(FLEX_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS);
    }
    // Flexible Multiple Occupant Journey methods//
    public boolean flexibleMultipleOccupantJourneyHeader() {
        return confirmElementIsVisible(FLEXIBLE_MULTIPLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean flexibleMultipleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(FLEXIBLE_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean flexMultipleOccupantJourneySelectorTitleText() {
        return confirmElementIsVisible(FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT);
    }
    public boolean flexMultipleOccupantJourneySelectorTitleToolTips() {
        return clickElement(FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS);
    }
    public boolean flexMultipleOccupantJourneySelectorDescriptionText() {
        return confirmElementIsVisible(FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT);
    }
    public boolean flexMultipleOccupantJourneySelectorImageText() {
        return confirmElementIsVisible(FLEX_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT);
    }
    public boolean flexMultipleOccupantCtaSelectionButtonText() {
        return confirmElementIsVisible(FLEX_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT);
    }
    public boolean flexMultipleOccupantCtaSelectionButtonTextToolTips() {
        return clickElement(FLEX_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS);
    }
}
