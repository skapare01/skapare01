package page_objects.entrata_page_objects.reports_tab.scheduled_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class ScheduledPage extends ReportsBasePage {
    //Locators:
    private final By ADD_SCHEDULE_BUTTON_LOCATOR = By.cssSelector("a[class='js-create-schedule-btn button action right']");
    private final By REPORT_INSTANCE_NAME_LOCATOR = By.cssSelector("input[class='form-search-field searchBox ui-autocomplete-input']");
    private final By GREEN_SAVE_REPORT_SCHEDULE_BUTTON_LOCATOR = By.cssSelector("input[value='Save']");
    private final By SCHEDULED_REPORT_RED_X_LOCATOR = By.cssSelector("i[class='delete add-tip tip-left js-delete-schedule-btn binded']");
    private final By DELETE_BUTTON_LOCATOR = By.xpath("//a[text()='Delete']");
    private final By CREATE_FIRST_REPORT_SCHEDULE_MESSAGE_LOCATOR = By.xpath("//p[contains(text(),'Create your first Report Schedule by clicking the ')]");

    //Constructor method:
    public ScheduledPage(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean clickAddScheduleButton() {
        return clickElement(ADD_SCHEDULE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectReportInstanceFromMenu() {
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        return pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean enterSelectedReportInstanceNameInMenu() {
        return pressEnter(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickSaveReportScheduleButton() {
        return clickElement(GREEN_SAVE_REPORT_SCHEDULE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickRedXForNewlyAddedReportSchedule() {
        return clickElement(SCHEDULED_REPORT_RED_X_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickDeleteScheduledReportButton() {
        return clickElement(DELETE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmCreateYourFirstReportScheduleTextAppears() {
        return confirmElementIsVisible(CREATE_FIRST_REPORT_SCHEDULE_MESSAGE_LOCATOR, waitTimes.LONG_WAIT);
    }
}