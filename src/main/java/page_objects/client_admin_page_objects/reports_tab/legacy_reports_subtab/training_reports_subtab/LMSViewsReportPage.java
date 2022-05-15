package page_objects.client_admin_page_objects.reports_tab.legacy_reports_subtab.training_reports_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LMSViewsReportPage extends BasePage {

    private final By HELP_RESOURCE_DETAILS_RADIO_BUTTON = By.cssSelector("input[class='form-radio margin10-left report-type']");
    private final By CLIENTS_MULTISELECT = By.id("Clients_multiselect");
    private final By CLIENTS_MULTISELECT_SELECT_ALL_CHECKBOX = By.id("Clients_option_0");
    private final By FROM_DATE_PICKER = By.cssSelector("div[class='form-icon date ui-datepicker-trigger']");
    private final By CONTENT_TYPE_MULTISELECT = By.id("contents_multiselect_caption");
    private final By CONTENT_TYPE_MULTISELECT_SELECT_ALL_CHECKBOX = By.id("contents_option_0");
    private final By STATUS_MULTISELECT = By.cssSelector("select[name='filter[status]']");
    private final By STATUS_MULTISELECT_PUBLISHED_OPTION = By.cssSelector("option[value='1']");
    private final By ACTION_MULTISELECT = By.cssSelector("select[name='filter[action]']");
    private final By ACTION_MULTISELECT_ADDED_OPTION = By.cssSelector("option[value='added']");
    private final By SUBMIT_BUTTON = By.cssSelector("input[class='form-submit js-submit_lms_view_report_filter']");
    private final By LMS_VIEWS_REPORT_TABLE = By.id("sort_table_template_container");

    public LMSViewsReportPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickHelpResourceDetailsRadioButton() {
        return clickElement(HELP_RESOURCE_DETAILS_RADIO_BUTTON);
    }

    public boolean clickClientsMultiselect() {
        return clickElement(CLIENTS_MULTISELECT);
    }

    public boolean clickSelectAllClientsMultiselect() {
        return clickElement(CLIENTS_MULTISELECT_SELECT_ALL_CHECKBOX);
    }

    public boolean clickFromDatePicker() {
        return clickElement(FROM_DATE_PICKER);
    }

    public boolean clickContentTypeMultiselect() {
        return clickElement(CONTENT_TYPE_MULTISELECT);
    }

    public boolean clickSelectAllContentTypeMultiselect() {
        return clickElement(CONTENT_TYPE_MULTISELECT_SELECT_ALL_CHECKBOX);
    }

    public boolean clickStatusMultiselect() {
        return clickElement(STATUS_MULTISELECT);
    }

    public boolean clickStatusMultiselectPublishedOption() {
        return clickElement(STATUS_MULTISELECT_PUBLISHED_OPTION);
    }

    public boolean clickActionMultiselect() {
        return clickElement(ACTION_MULTISELECT);
    }

    public boolean clickActionMultiselectAddedOption() {
        return clickElement(ACTION_MULTISELECT_ADDED_OPTION);
    }

    public boolean clickSubmitButton() {
        return clickElement(SUBMIT_BUTTON);
    }

    public boolean verifyLMSViewsReportTableIsVisible() {
        return confirmElementIsVisible(LMS_VIEWS_REPORT_TABLE);
    }

}
