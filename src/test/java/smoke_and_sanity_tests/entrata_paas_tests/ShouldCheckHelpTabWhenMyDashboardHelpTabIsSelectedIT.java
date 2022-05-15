package smoke_and_sanity_tests.entrata_paas_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.help_tab.HelpTabNavBar;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckHelpTabWhenMyDashboardHelpTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckHelpTabWhenMyDashboardHelpTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckHelpTabWhenHelpTabIsSelected() {
        MyDashboardNav myDashNav = new MyDashboardNav(driver);
        assertTrue("Unable to locate 'Help' tab.", myDashNav.clickHelpTab());
        HelpTabNavBar helpNavBar = new HelpTabNavBar(driver);
        assertTrue("Unable to locate 'Training' sub-tab.", helpNavBar.clickTrainingSubTab());
        assertTrue("Unable to locate 'Support Tickets' sub-tab.", helpNavBar.clickSupportTicketsSubTab());
    }
}
