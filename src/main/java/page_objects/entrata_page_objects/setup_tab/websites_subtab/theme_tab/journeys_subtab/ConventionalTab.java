package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ConventionalTab extends BasePage {
    public ConventionalTab(WebDriver driver) {
        super(driver);
    }

    // Single Occupant Journey variables //
    private final By CONVENTIONAL_SINGLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Single Occupant Journey']");
    private final By CONVENTIONAL_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("single-occupant-conventional-journey-button");
    private final By SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT = By.xpath("//*[text()='Active Applications:']");
    private final By SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS = By.id("CTA_ACTIVE_APPLICATIONS_WEBSITE_PREFERENCES_HELP");
    private final By SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT = By.xpath("//*[text()='Application Selection Instructional Text:']");
    private final By SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS = By.id("CONVENTIONAL_APPLICATION_SELECTION_CUSTOM_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By SINGLE_OCCUPANT_CTA_TITLE_TEXT = By.xpath("//*[text()='CTA Title:']");
    private final By SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS = By.id("CONVENTIONAL_CTA_SEARCH_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By SINGLE_OCCUPANT_CTA_SUB_TEXT = By.xpath("//*[text()='CTA Sub-Text:']");
    private final By SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT = By.xpath("//*[text()='CTA Filter Type:']");
    private final By SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS = By.id("CONVENTIONAL_CTA_FILTER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By SINGLE_OCCUPANT_BEDROOM_COUNT_TEXT = By.xpath("//*[text()='Bedroom Count:']");
    private final By SINGLE_OCCUPANT_BEDROOM_COUNT_TOOL_TIPS = By.id("CONVENTIONAL_CTA_WIDGET_BEDROOMS_WEBSITE_PREFERENCES_HELP");
    private final By SINGLE_OCCUPANT_CTA_BUTTON_TEXT = By.xpath("//*[text()='CTA Button Text:']");
    private final By SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS = By.id("CONVENTIONAL_CTA_SEARCH_BTN_TEXT_WEBSITE_PREFERENCES_HELP");
    // Multiple Occupant Journey variables//
    private final By CONVENTIONAL_MULTIPLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Multiple Occupant Journey']");
    private final By CONVENTIONAL_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("multiple-occupant-conventional-journey-button");
    private final By MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT = By.xpath("//*[text()='Journey Selector Title:']");
    private final By MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS = By.id("CONVENTIONAL_CTA_SELECTOR_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT = By.xpath("//*[text()='Journey Selector Description:']");
    private final By MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS = By.id("CONVENTIONAL_CTA_SELECTOR_DESCRIPTION_WEBSITE_PREFERENCES_HELP");
    private final By MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT = By.xpath("//*[text()='Journey Selector Image:']");
    private final By MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT = By.xpath("//*[text()='CTA Selection Button Text:']");
    private final By MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS = By.id("CONVENTIONAL_CTA_SELECTOR_BUTTON_TEXT_WEBSITE_PREFERENCES_HELP");

    // Single Occupant Journey methods//
    public boolean conventionalSingleOccupantJourneyHeader() {
        return confirmElementIsVisible(CONVENTIONAL_SINGLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean conventionalSingleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(CONVENTIONAL_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean singleOccupantActiveApplicationsText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT);
    }
    public boolean singleOccupantActiveApplicationsToolTips() {
        return clickElement(SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS);
    }
    public boolean singleOccupantApplicationSelectionInstructionalText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT);
    }
    public boolean singleOccupantApplicationSelectionInstructionalTextToolTips() {
        return clickElement(SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS);
    }
    public boolean singleOccupantCtaTitleText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_CTA_TITLE_TEXT);
    }
    public boolean singleOccupantCtaTitleToolTips() {
        return clickElement(SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS);
    }
    public boolean singleOccupantCtaSubText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_CTA_SUB_TEXT);
    }
    public boolean singleOccupantCtaFilterTypeText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT);
    }
    public boolean singleOccupantCtaFilterTypeToolTips() {
        return clickElement(SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS);
    }
    public boolean singleOccupantBedroomCountText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_BEDROOM_COUNT_TEXT);
    }
    public boolean singleOccupantBedroomCountToolTips() {
        return clickElement(SINGLE_OCCUPANT_BEDROOM_COUNT_TOOL_TIPS);
    }
    public boolean singleOccupantCtaButtonText() {
        return confirmElementIsVisible(SINGLE_OCCUPANT_CTA_BUTTON_TEXT);
    }
    public boolean singleOccupantCtaButtonTextToolTips() {
        return clickElement(SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS);
    }
    // Multiple Occupant Journey methods//
    public boolean conventionalMultipleOccupantJourneyHeader() {
        return confirmElementIsVisible(CONVENTIONAL_MULTIPLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean conventionalMultipleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(CONVENTIONAL_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean multipleOccupantJourneySelectorTitleText() {
        return confirmElementIsVisible(MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT);
    }
    public boolean multipleOccupantJourneySelectorTitleToolTips() {
        return clickElement(MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS);
    }
    public boolean multipleOccupantJourneySelectorDescriptionText() {
        return confirmElementIsVisible(MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT);
    }
    public boolean multipleOccupantJourneySelectorDescriptionToolTips() {
        return clickElement(MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS);
    }
    public boolean multipleOccupantJourneySelectorImageText() {
        return confirmElementIsVisible(MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT);
    }
    public boolean multipleOccupantCtaSelectionButtonText() {
        return confirmElementIsVisible(MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT);
    }
    public boolean multipleOccupantCtaSelectionButtonTextToolTips() {
        return confirmElementIsVisible(MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS);
    }
}
