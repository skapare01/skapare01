package page_objects.entrata_page_objects.tools_tab.call_tracker_logs_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CallTrackerLogs extends BasePage {
    private final By NAME_PHONE_ID_TEXT_BOX = By.id("advanced_search_generic_data");
    private final By CALL_DATE_FROM = By.id("start_date");
    private final By CALL_DATE_TO = By.id("end_date");
    private final By PROPERTY_DROPDOWN = By.id("properties_multiselect");
    private final By CALL_LOCATION_DROPDOWN = By.id("call_tracker_call_source_id");
    private final By CALL_TYPE_DROPDOWN = By.id("call_type_multiselect");
    private final By CALL_RESULT_DROPDOWN= By.id("call_result_multiselect");
    private final By LEAD_SOURCE_DROPDOWN = By.id("lead_source_multiselect");
    private final By ANSWER_STATUS_DROPDOWN = By.id("answer_status_multiselect");
    private final By VOICE_MESSAGE_DROPDOWN = By.id("call_tracker_filter_voicemail_status_type");
    private final By ARCHIVED_DROPDOWN = By.id("call_tracker_filter_archived");
    private final By SCORED_DROPDOWN = By.name("call_tracker_call_filter[call_analyzed]");
    private final By SEARCH_BUTTON = By.id("advance_search_calls_submit");
    private final By RESET_BUTTON = By.id("link_reset_quick_search");
    private final By ARCHIVE_CALL_ACTION_BUTTON = By.id("archive-btn");
    private final By UNARCHIVE_CALL_ACTION_BUTTON = By.id("unarchive-btn");
    private final By BEGIN_DOWNLOAD_ACTION_BUTTON = By.linkText("Begin Download");
    private final By DOWNLOAD_READY_ACTION_BUTTON = By.linkText("Download Ready");
    private final By REFRESH_ACTION_BUTTON = By.linkText("Refresh");
    private final By DOWNLOAD_ALL_ACTION_BUTTON = By.linkText("Download All");
    private final By ID_HEADER = By.xpath("//*[text()='ID']");
    private final By CALLER_HEADER = By.xpath("//*[text()='Caller']");
    private final By PROPERTY_HEADER = By.xpath("//*[text()='Property']");
    private final By CALL_STATUS_HEADER = By.xpath("//*[text()='Call Status']");
    private final By SUB_STATUS_HEADER = By.xpath("//*[text()='Sub  Status']");
    private final By SOURCE_HEADER = By.xpath("//*[text()='Source']");
    private final By RECEIVED_HEADER = By.xpath("//*[text()='Received']");
    private final By RESULT_HEADER = By.xpath("//*[text()='Result']");
    private final By SCORE_HEADER = By.xpath("//*[text()='Score']");
    private final By NOTES_ACTION_ICON = By.cssSelector("i.note-add[title='Note']");
    private final By VIEW_HISTORY_ACTION_ICON = By.cssSelector("i.history[title='History']");
    private final By PAGINATION = By.className("paging");

    public CallTrackerLogs(WebDriver driver) {
        super(driver);
    }

    public boolean findNamePhoneIDTextBox() { return confirmElementIsVisible(NAME_PHONE_ID_TEXT_BOX); }
    public boolean findCallDateFrom() { return confirmElementIsVisible(CALL_DATE_FROM); }
    public boolean findCallDateTo() { return confirmElementIsVisible(CALL_DATE_TO); }
    public boolean findPropertyDropdown() { return confirmElementIsVisible(PROPERTY_DROPDOWN); }
    public boolean findCallLocationDropdown() { return confirmElementIsVisible(CALL_LOCATION_DROPDOWN); }
    public boolean findCallTypeDropdown() { return confirmElementIsVisible(CALL_TYPE_DROPDOWN); }
    public boolean findCallResultDropdown() { return confirmElementIsVisible(CALL_RESULT_DROPDOWN); }
    public boolean findLeadSourceDropdown() { return confirmElementIsVisible(LEAD_SOURCE_DROPDOWN); }
    public boolean findAnswerStatusDropdown() { return confirmElementIsVisible(ANSWER_STATUS_DROPDOWN); }
    public boolean findVoiceMessageDropdown() { return confirmElementIsVisible(VOICE_MESSAGE_DROPDOWN); }
    public boolean findArchivedDropdown() { return confirmElementIsVisible(ARCHIVED_DROPDOWN); }
    public boolean findScoredDropdown() { return confirmElementIsVisible(SCORED_DROPDOWN); }
    public boolean findSearchButton() { return confirmElementIsVisible(SEARCH_BUTTON); }
    public boolean findResetButton() { return confirmElementIsVisible(RESET_BUTTON); }
    public boolean findArchiveCallActionButton() { return confirmElementIsVisible(ARCHIVE_CALL_ACTION_BUTTON); }
    public boolean findUnarchiveCallActionButton() { return confirmElementIsVisible(UNARCHIVE_CALL_ACTION_BUTTON); }
    public boolean findBeginDownloadActionButton() { return confirmElementIsVisible(BEGIN_DOWNLOAD_ACTION_BUTTON); }
    public boolean findDownloadReadyActionButton() { return confirmElementIsVisible(DOWNLOAD_READY_ACTION_BUTTON); }
    public boolean findRefreshActionButton() { return confirmElementIsVisible(REFRESH_ACTION_BUTTON); }
    public boolean findDownloadAllActionButton() { return confirmElementIsVisible(DOWNLOAD_ALL_ACTION_BUTTON); }
    public boolean findIDColumnHeader() { return confirmElementIsVisible(ID_HEADER); }
    public boolean findCallerColumnHeader() { return confirmElementIsVisible(CALLER_HEADER); }
    public boolean findPropertyColumnHeader() { return confirmElementIsVisible(PROPERTY_HEADER); }
    public boolean findCallStatusColumnHeader() { return confirmElementIsVisible(CALL_STATUS_HEADER); }
    public boolean findSubStatusColumnHeader() { return confirmElementIsVisible(SUB_STATUS_HEADER); }
    public boolean findSourceColumnHeader() { return confirmElementIsVisible(SOURCE_HEADER); }
    public boolean findReceivedColumnHeader() { return confirmElementIsVisible(RECEIVED_HEADER); }
    public boolean findResultColumnHeader() { return confirmElementIsVisible(RESULT_HEADER); }
    public boolean findScoreColumnHeader() { return confirmElementIsVisible(SCORE_HEADER); }
    public boolean findNotesActionIcon() { return confirmElementIsVisible(NOTES_ACTION_ICON); }
    public boolean findViewHistoryActionIcon() { return confirmElementIsVisible(VIEW_HISTORY_ACTION_ICON); }
    public boolean findPagination() { return confirmElementIsVisible(PAGINATION); }
}
