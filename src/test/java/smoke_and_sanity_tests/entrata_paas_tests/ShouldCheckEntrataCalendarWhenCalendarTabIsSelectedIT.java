package smoke_and_sanity_tests.entrata_paas_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.entrata_sidebar_calendar_tab.EntrataSideBarCalendar;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckEntrataCalendarWhenCalendarTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckEntrataCalendarWhenCalendarTabIsSelectedIT() {
        super("1automationrapid");
    }

    @Test
    public void ShouldCheckCalendarWhenFullCalendarButtonIsSelected() {
        MyDashboardNav myDashNav = new MyDashboardNav(driver);
        assertTrue("Unable to locate/select Entrata Calendar Tab.", myDashNav.clickEntrataCalendarTab());
        assertTrue("Unable to locate/select 'Full Calendar' button.", myDashNav.clickFullCalendarBtn());
        EntrataSideBarCalendar eCalendar = new EntrataSideBarCalendar(driver);
        assertTrue("Unable to locate Calendar landing page.", eCalendar.calendarLandingPage());
    }
}
