package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab.*;
import static org.junit.Assert.assertTrue;

public class LeaveRequestsIT extends BaseBrowserTest {
    public LeaveRequestsIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"spandey","Xento123");
    }

    @Test
    public void shouldCheckLeaveRequestTabs_whenPermissionedUserLoggedIn() {
        MyDashboardNav nav = new MyDashboardNav(driver);
        MyXentoNav xento = new MyXentoNav(driver);
        TimeOffRequestsPage timeOffRequestsPage = new TimeOffRequestsPage(driver);
        WeekendWorkingRequestsPage weekendWorkingRequestsPage = new WeekendWorkingRequestsPage(driver);
        WorkFromHomeRequestsPage workFromHomeRequestsPage = new WorkFromHomeRequestsPage(driver);
        ReleaseSupportRequestsPage releaseSupportRequestsPage = new ReleaseSupportRequestsPage(driver);
        WorkFromOfficeRequestsPage workFromOfficeRequestsPage = new WorkFromOfficeRequestsPage(driver);
        assertTrue("unable to click my Xento tab",nav.clickMyXentoTab());
        assertTrue("unable to click time off requests tab",xento.clickTimeOffRequests());
        assertTrue("unable to click add request", timeOffRequestsPage.clickAddRequest());
        assertTrue("unable to click cancel", timeOffRequestsPage.clickCancelButton());
        assertTrue("unable to click weekend working requests tab",xento.clickWeekendWorkingTab());
        assertTrue("unable to click add request", weekendWorkingRequestsPage.clickAddRequest());
        assertTrue("unable to click add request", weekendWorkingRequestsPage.clickCancelButton());
        assertTrue("unable to click work from home tab",xento.clickWorkFromHomeTab());
        assertTrue("unable to click add request", workFromHomeRequestsPage.clickAddRequest());
        assertTrue("unable to click add request", workFromHomeRequestsPage.clickCancelButton());
        assertTrue("unable to click release support tab", xento.clickReleaseSupportTab());
        assertTrue("unable to click add request", releaseSupportRequestsPage.clickAddRequest());
        assertTrue("unable to click add request", releaseSupportRequestsPage.clickCancelButton());
        assertTrue("unable to click work from office requests tab", xento.clickWorkFromOfficeTab());
        assertTrue("unable to click add request", workFromOfficeRequestsPage.clickAddRequest());
        assertTrue("unable to click add request", workFromOfficeRequestsPage.clickCancelButton());



    }
}
