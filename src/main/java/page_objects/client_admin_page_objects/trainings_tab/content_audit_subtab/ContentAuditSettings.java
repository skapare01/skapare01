package page_objects.client_admin_page_objects.trainings_tab.content_audit_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContentAuditSettings extends BasePage {

    private final By GUIDE_TAB = By.id("js-guide_settings");
    private final By FIRST_EDIT_BUTTON = By.cssSelector(".edit_guide");
    private final By AUDIT_MONTH_FIELD = By.cssSelector(".month");
    private final By AUDIT_DAY_FIELD = By.cssSelector(".day");
    private final By AUDIT_YEAR_FIELD = By.cssSelector(".year");
    private final By FREQUENCY_DROPDOWN = By.cssSelector("select[name = 'admin_guide_audit_details[review_frequency_days]']");
    private final By ASSIGNED_DROPDOWN = By.id("content_reviewer_details1_multiselect");
    private final By ASSIGNED_TO_FIRST_OPTION = By.id("content_reviewer_details1_option_1");
    private final By SAVE_EDIT_AUDIT_BUTTON = By.cssSelector(".save_guide_settings");

    public ContentAuditSettings(WebDriver driver){
        super(driver);}

    public boolean clickGuideTab(){return clickElement(GUIDE_TAB);}
    public boolean clickFirstEditButton(){return clickElement(FIRST_EDIT_BUTTON);}
    public boolean enterMonth(String month){return sendKeysToElement(AUDIT_MONTH_FIELD,month);}
    public boolean enterDay(String day){return sendKeysToElement(AUDIT_DAY_FIELD,day);}
    public boolean enterYear(String year){return sendKeysToElement(AUDIT_YEAR_FIELD, year);}
    public boolean selectFrequency(String days){return selectElementByValue(FREQUENCY_DROPDOWN, days);}
    public boolean clickAssignedDropdown(){return clickElement(ASSIGNED_DROPDOWN);}
    public boolean clickAssignedFirstOption(){return clickElement(ASSIGNED_TO_FIRST_OPTION);}
    public boolean clickSaveButton(){return clickElement(SAVE_EDIT_AUDIT_BUTTON);}

}
