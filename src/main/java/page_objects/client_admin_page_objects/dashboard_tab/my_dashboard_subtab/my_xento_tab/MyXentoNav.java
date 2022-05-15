package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MyXentoNav extends BasePage {
    public MyXentoNav(WebDriver driver){
        super(driver);}

    private final By TIME_OFF_REQUESTS_TAB = By.id("time_off_requests");
    private final By WEEKEND_WORKING_TAB = By.id("view_weekend_working_requests");
    private final By WORK_FROM_HOME_TAB = By.id("view_work_from_home_requests");
    private final By RELEASE_SUPPORT_TAB = By.id("view_release_support_requests");
    private final By WORK_FROM_OFFICE_TAB = By.id("view_work_from_office_requests");

    public boolean clickTimeOffRequests(){return clickElement(TIME_OFF_REQUESTS_TAB);}
    public boolean clickWeekendWorkingTab(){return clickElement(WEEKEND_WORKING_TAB);}
    public boolean clickWorkFromHomeTab(){return clickElement(WORK_FROM_HOME_TAB);}
    public boolean clickReleaseSupportTab(){return clickElement(RELEASE_SUPPORT_TAB);}
    public boolean clickWorkFromOfficeTab(){return clickElement(WORK_FROM_OFFICE_TAB);}

}
