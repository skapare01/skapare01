package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_team_tab.ProgressReportPage;

import static org.junit.Assert.*;

public class ProgressReportNavIT extends BaseBrowserTest {
    public ProgressReportNavIT(){
        super ("clientadmin", SitesEnum.CLIENTADMIN,"salurkar","Xento123");
    }

    @Test
    public void shouldCheckNavOfProgressReport_whenPermissionedUserLoggedIn(){
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        ProgressReportPage progressReportPage = new ProgressReportPage(driver);
        assertTrue("unable to click my team tab", myDashboardNav.clickMyTeamTab());
        assertTrue("unable to find my cpa button", progressReportPage.confirmVisibilityOfMyCPA());
        assertTrue("unable to find my learning goals", progressReportPage.confirmVisibilityOfMyLearningGoals());
        assertTrue("unable to find search bar", progressReportPage.confirmVisibilityOfSearchBar());
        assertTrue("unable to click dev team tab", progressReportPage.clickDevTeamTab());
        assertTrue("unable to click team dropdown", progressReportPage.clickTeamDropdown());

    }
}
