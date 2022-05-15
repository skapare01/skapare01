package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NewInspection extends BasePage {

    //Filter Options
    private final String RESIDENT = "Resident";
    private final String VALUE_1 = "1";
    private final String VALUE_2 = "2";
    private final String VALUE_3 = "3";

    //Page Elements
    private final By MODAL_INSPECTION_CONTAINER = By.id("modal_container0");
    private final By INSPECTION_STATUS_BOX = By.cssSelector("h4[class='align-center pad5-bottom']");
    private final By SIGN_HERE_BUTTON = By.cssSelector("a[onclick*='Sign this Inspection']");
    private final By SIGN_THIS_INSPECTION_POPUP = By.id("small_modal");
    private final By CLOSE_NOT_STARTED_AND_IN_PROGRESS_INSPECTION_BUTTON = By.cssSelector("body > div.modal-large.responsive-large-dialog > div.modal-head > div.header-action-icons > i");
    private final By SELECT_A_PROPERTY_DROP_DOWN_ARROW = By.xpath("//*[@id=\"create_inspection\"]/div[2]/dl[1]/dd/div/i");
    private final By FIRST_PROPERTY = By.xpath("//*[@id=\"create_inspection\"]/div[2]/dl[1]/dd/div/ul/li[1]");
    private final By INSPECTION_TYPE_FIELD = By.id("inspection_type_id");
    private final By INSPECTED_BY_FIELD = By.id("customer_type");
    private final By SCHEDULE_FOR_FUTURE_DATE_FIELD = By.id("div_inspection_scheduled_date");
    private final By INSPECTION_DUE_DATE_FIELD = By.id("div_inspection_due_date");
    private final By SELECT_AN_INSPECTION_FIELD = By.id("inspection_form_id");
    private final By SECOND_OPTION_FROM_SELECT_AN_INSPECTION_DROP_DOWN = By.xpath("//*[@id=\"inspection_form_id\"]/option[2]");
    private final By RESIDENT_FIELD = By.id("customer_name");
    private final By FIRST_RESIDENT_IN_RESIDENT_FIELD = By.xpath("//*[@id=\"resident_container\"]/dd[1]/div/div[2]/table/tbody/tr[2]");
    private final By SCHEDULE_FOR_FUTURE_DATE_CALENDAR_ICON = By.xpath("//*[@id=\"scheduled_date_container\"]/dd/div[2]");
    private final By SCHEDULE_FOR_FUTURE_DATE_DATE_PICKER_TODAY = By.cssSelector("td[class=' ui-datepicker-days-cell-over  ui-datepicker-today']");
    private final By INSPECTION_DUE_DATE_CALENDAR_ICON = By.xpath("//*[@id=\"inspection_due_date_container\"]/dd/div[2]");
    private final By INSPECTION_DUE_DATE_DATE_PICKER_TODAY = By.cssSelector("td[class=' ui-datepicker-days-cell-over  ui-datepicker-today']");
    private final By SCHEDULE_BUTTON = By.cssSelector("input[class='form-submit']");
    private final By INSPECTION_CREATED_SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");

    public NewInspection(WebDriver driver) {
        super(driver);
    }

    public boolean clickScheduleButton() { return clickElement(SCHEDULE_BUTTON); }

    public boolean confirmInspectionCreatedSuccessBanner() { return confirmElementIsVisible(INSPECTION_CREATED_SUCCESS_BANNER); }

    public boolean clickTodaysDateOnInspectionDueDateCalendar() { return clickElement(INSPECTION_DUE_DATE_DATE_PICKER_TODAY); }

    public boolean clickInspectionDueDateCalendarIcon() { return clickElement(INSPECTION_DUE_DATE_CALENDAR_ICON); }

    public boolean clickTodaysDateOnScheduleForFutureDateCalendar() { return clickElement(SCHEDULE_FOR_FUTURE_DATE_DATE_PICKER_TODAY); }

    public boolean clickScheduleForFutureDateCalendarIcon() { return clickElement(SCHEDULE_FOR_FUTURE_DATE_CALENDAR_ICON); }

    public boolean clickFirstResidentInResidentFieldTable() { return clickElement(FIRST_RESIDENT_IN_RESIDENT_FIELD); }

    public boolean typeAnAIntoResidentField(String text) { return sendKeysToElement(RESIDENT_FIELD, text); }

    public boolean confirmResidentFieldIsVisible() { return confirmElementIsVisible(RESIDENT_FIELD); }

    public boolean clickResidentFromInspectedByDropDown() { return selectElementByValue(INSPECTED_BY_FIELD, RESIDENT); }

    public boolean clickInspectedByDropDown() { return clickElement(INSPECTED_BY_FIELD); }

    public boolean clickSecondOptionFromSelectAnInspectionDropDown() { return clickElement(SECOND_OPTION_FROM_SELECT_AN_INSPECTION_DROP_DOWN); }

    public boolean clickSelectAnInspectionDropDown() { return clickElement(SELECT_AN_INSPECTION_FIELD); }

    public boolean clickInspectionTypeDropDown() { return clickElement(INSPECTION_TYPE_FIELD); }

    public boolean clickValueOneFromInspectionTypeDropDown() { return selectElementByValue(INSPECTION_TYPE_FIELD, VALUE_1); }

    public boolean clickValueTwoFromInspectionTypeDropDown() { return selectElementByValue(INSPECTION_TYPE_FIELD, VALUE_2); }

    public boolean clickValueThreeFromInspectionTypeDropDown() { return selectElementByValue(INSPECTION_TYPE_FIELD, VALUE_3); }

    public boolean verifyInspectionDueDateFieldExists() { return confirmElementIsVisible(INSPECTION_DUE_DATE_FIELD); }

    public boolean verifyScheduleForFutureDateExists() { return confirmElementIsVisible(SCHEDULE_FOR_FUTURE_DATE_FIELD); }

    public boolean verifyInspectedByFieldExists() { return confirmElementIsVisible(INSPECTED_BY_FIELD); }

    public boolean verifyInspectionTypeExists() { return confirmElementIsVisible(INSPECTION_TYPE_FIELD); }

    public boolean selectFirstPropertyFromSelectAProperty() { return clickElement(FIRST_PROPERTY, waitTimes.LONG_WAIT); }

    public boolean clickSelectAPropertyDropDownArrow() { return clickElement(SELECT_A_PROPERTY_DROP_DOWN_ARROW, waitTimes.LONG_WAIT); }

    public boolean clickCloseInspectionButton() { return clickElement(CLOSE_NOT_STARTED_AND_IN_PROGRESS_INSPECTION_BUTTON, waitTimes.UNREASONABLE_WAIT); }

    public boolean verifyNewInspectionHasBeenStarted(){
        return confirmElementIsVisible(MODAL_INSPECTION_CONTAINER);
    }

    public String verifyInspectionHasNotStartedStatus() { return getElementText(INSPECTION_STATUS_BOX, waitTimes.LONG_WAIT); }

    public boolean clickSignHere() { return clickElement(SIGN_HERE_BUTTON, waitTimes.UNREASONABLE_WAIT); }

    public boolean confirmSignThisInspectionPopUpAppears() { return confirmElementIsVisible(SIGN_THIS_INSPECTION_POPUP); }

}