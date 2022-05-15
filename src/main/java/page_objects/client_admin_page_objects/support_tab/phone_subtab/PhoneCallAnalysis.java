package page_objects.client_admin_page_objects.support_tab.phone_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PhoneCallAnalysis extends BasePage {
    private final By CALL_ID = By.id("call_id");
    private final By EXTENDED_SEARCH_BUTTON = By.linkText("Extended Search");
    private final By RESET_FILTER_BUTTON = By.id("resetExtendedSearch");
    private final By TABLE_HEADER_ID = By.cssSelector("a[sort_by='call_id']");
    private final By TABLE_HEADER_DATE = By.cssSelector("a[sort_by='call_datetime']");
    private final By TABLE_HEADER_COMPANY = By.xpath("//*[text()='Company']");
    private final By TABLE_HEADER_PROPERTY = By.cssSelector("a[sort_by='property']");
    private final By TABLE_HEADER_ANSWERED_BY = By.xpath("//*[text()='Answered By']");
    private final By TABLE_HEADER_DURATION= By.xpath("//*[text()='Duration']");
    private final By TABLE_HEADER_PERCENT_LEAD_PROBABILITY = By.cssSelector("a[sort_by='lead_probability']");
    private final By TABLE_HEADER_ACTION = By.xpath("//*[text()='Action']");
    private final By PAGINATION = By.className("paging");
    private final By RECORDS_PER_PAGE = By.id("list");
    private final By ANALYZE_CALL_BUTTON = By.className("RedirectToCallAnalysisForm");
    private final By CALL_ANALYSIS_FORM = By.id("call_analysis_data");

    public PhoneCallAnalysis(WebDriver driver) {
        super(driver);
    }

    public boolean findCallIDSearchField() { return confirmElementIsVisible(CALL_ID,waitTimes.LONG_WAIT); }

    public boolean findExtendedSearchButton() { return confirmElementIsVisible(EXTENDED_SEARCH_BUTTON); }

    public boolean findResetFilterButton() { return confirmElementIsVisible(RESET_FILTER_BUTTON); }

    public boolean findTableHeaderID() { return confirmElementIsVisible(TABLE_HEADER_ID); }

    public boolean findTableHeaderDate() { return confirmElementIsVisible(TABLE_HEADER_DATE); }

    public boolean findTableHeaderCompany() { return confirmElementIsVisible(TABLE_HEADER_COMPANY); }

    public boolean findTableHeaderProperty() { return confirmElementIsVisible(TABLE_HEADER_PROPERTY); }

    public boolean findTableHeaderAnsweredBy() { return confirmElementIsVisible(TABLE_HEADER_ANSWERED_BY); }

    public boolean findTableHeaderDuration() { return confirmElementIsVisible(TABLE_HEADER_DURATION); }

    public boolean findTableHeaderPercentLeadProbability() { return confirmElementIsVisible(TABLE_HEADER_PERCENT_LEAD_PROBABILITY); }

    public boolean findTableHeaderAction() { return confirmElementIsVisible(TABLE_HEADER_ACTION); }

    public boolean findPagination() { return confirmElementIsVisible(PAGINATION); }

    public boolean findRecordsPerPage() { return confirmElementIsVisible(RECORDS_PER_PAGE); }

    public boolean clickAnalyzeCallButton() { return doubleClickElement(ANALYZE_CALL_BUTTON); }

    public boolean findCallAnalysisForm() { return confirmElementIsVisible(CALL_ANALYSIS_FORM); }

}
