package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class StudentTab extends BasePage {
    public StudentTab(WebDriver driver) {
        super(driver);
    }

    // Student Single Occupant Journey variables //
    private final By STUDENT_SINGLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Single Occupant Journey']");
    private final By STUDENT_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("single-occupant-student-journey-button");
    private final By STUDENT_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT = By.xpath("//*[text()='Active Applications:']");
    private final By STUDENT_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS = By.id("STUDENT_CTA_ACTIVE_APPLICATIONS_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT = By.xpath("//*[text()='Application Selection Instructional Text:']");
    private final By STUDENT_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS = By.id("STUDENT_APPLICATION_SELECTION_CUSTOM_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_TITLE_TEXT = By.xpath("//*[text()='CTA Title:']");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS = By.id("STUDENT_CTA_SEARCH_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_SUB_TEXT = By.xpath("//*[text()='CTA Sub-Text:']");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_SUB_TEXT_TOOL_TIPS = By.id("STUDENT_CTA_SEARCH_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT = By.xpath("//*[text()='CTA Filter Type:']");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS = By.id("STUDENT_CTA_FILTER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_ROOM_TYPE = By.xpath("//*[text()='Room Type:']");
    private final By STUDENT_SINGLE_OCCUPANT_ROOM_TYPE_TOOL_TIPS = By.id("STUDENT_CTA_ROOM_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_BUTTON_TEXT = By.xpath("//*[text()='CTA Button Text:']");
    private final By STUDENT_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS = By.id("STUDENT_CTA_SEARCH_BTN_TEXT_WEBSITE_PREFERENCES_HELP");
    // Student Multiple Occupant Journey variables//
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_HEADER = By.xpath("//h3[text()='Multiple Occupant Journey']");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN = By.id("multiple-occupant-student-journey-button");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT = By.xpath("//*[text()='Journey Selector Title:']");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS = By.id("STUDENT_CTA_SELECTOR_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT = By.xpath("//*[text()='Journey Selector Description:']");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS = By.id("STUDENT_CTA_SELECTOR_DESCRIPTION_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT = By.xpath("//*[text()='Journey Selector Image:']");
    private final By STUDENT_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT = By.xpath("//*[text()='CTA Selection Button Text:']");
    private final By STUDENT_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS = By.id("STUDENT_CTA_SELECTOR_BUTTON_TEXT_WEBSITE_PREFERENCES_HELP");

    // Student Single Occupant Journey methods//
    public boolean studentSingleOccupantJourneyHeader() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean studentSingleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean studentSingleOccupantActiveApplicationsText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TEXT);
    }
    public boolean studentSingleOccupantActiveApplicationsToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_ACTIVE_APPLICATIONS_TOOL_TIPS);
    }
    public boolean studentSingleOccupantApplicationSelectionInstructionalText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT);
    }
    public boolean studentSingleOccupantApplicationSelectionInstructionalTextToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_APPLICATION_SELECTION_INSTRUCTIONAL_TEXT_TOOL_TIPS);
    }
    public boolean studentSingleOccupantCtaTitleText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_CTA_TITLE_TEXT);
    }
    public boolean studentSingleOccupantCtaTitleToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_CTA_TITLE_TOOL_TIPS);
    }
    public boolean studentSingleOccupantCtaSubText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_CTA_SUB_TEXT);
    }
    public boolean studentSingleOccupantCtaSubTextToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_CTA_SUB_TEXT_TOOL_TIPS);
    }
    public boolean studentSingleOccupantCtaFilterTypeText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TEXT);
    }
    public boolean studentSingleOccupantCtaFilterTypeToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_CTA_FILTER_TYPE_TOOL_TIPS);
    }
    public boolean studentSingleOccupantRoomTypeText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_ROOM_TYPE);
    }
    public boolean studentSingleOccupantRoomTypeToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_ROOM_TYPE_TOOL_TIPS);
    }
    public boolean studentSingleOccupantCtaButtonText() {
        return confirmElementIsVisible(STUDENT_SINGLE_OCCUPANT_CTA_BUTTON_TEXT);
    }
    public boolean studentSingleOccupantCtaButtonTextToolTips() {
        return clickElement(STUDENT_SINGLE_OCCUPANT_CTA_BUTTON_TEXT_TOOL_TIPS);
    }
    // Student Multiple Occupant Journey methods//
    public boolean studentMultipleOccupantJourneyHeader() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_HEADER);
    }
    public boolean studentMultipleOccupantJourneyEditBtn() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_EDIT_BTN);
    }
    public boolean studentMultipleOccupantJourneySelectorTitleText() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TEXT);
    }
    public boolean studentMultipleOccupantJourneySelectorTitleToolTips() {
        return clickElement(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_TITLE_TOOL_TIPS);
    }
    public boolean studentMultipleOccupantJourneySelectorDescriptionText() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TEXT);
    }
    public boolean studentMultipleOccupantJourneySelectorDescriptionToolTips() {
        return clickElement(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_DESCRIPTION_TOOL_TIPS);
    }
    public boolean studentMultipleOccupantJourneySelectorImageText() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_JOURNEY_SELECTOR_IMAGE_TEXT);
    }
    public boolean studentMultipleOccupantCtaSelectionButtonText() {
        return confirmElementIsVisible(STUDENT_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT);
    }
    public boolean studentMultipleOccupantCtaSelectionButtonTextToolTips() {
        return clickElement(STUDENT_MULTIPLE_OCCUPANT_CTA_SELECTION_BUTTON_TEXT_TOOL_TIPS);
    }
}
