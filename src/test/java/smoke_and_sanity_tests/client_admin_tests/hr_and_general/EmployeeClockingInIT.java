package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.*;

public class EmployeeClockingInIT extends BaseBrowserTest {

    public EmployeeClockingInIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Entrata123");
    }

    @Test
    public void shouldVerifyEmployeeClockIn_whenUsingFreeSwitchClockIn() {
        //Testcase 2417649

        //Maximize window
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        assertTrue("Unable to maximize window.", myDashboardNav.maximizeWindow());

        //Login to FreeSwitch
        assertTrue("Unable to expand the phone login on MyDashboard.", myDashboardNav.openPhoneLogin());
        assertTrue("Unable to enter a generic phone extension into the login to Freeswitch phone extension field.", myDashboardNav.enterGenericPhoneExtensionToClockIn());
        assertTrue("Unable to click the login to Freeswitch button.", myDashboardNav.loginToFreeswitch());
        assertTrue("Unable to click the logout of Freeswitch button. This is either due to it not being loaded properly or the login failed.", myDashboardNav.logoutOfFreeswitch());

    }

}