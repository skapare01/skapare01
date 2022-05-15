package smoke_and_sanity_tests.client_admin_tests.hr_and_general;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.left_pane_tabs.LeftPanePurchaseRequestTab;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckPurchaseRequestInMyDashboardWhenPurchaseRequestSideTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckPurchaseRequestInMyDashboardWhenPurchaseRequestSideTabIsSelectedIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "pjaiswal", "Xento123");
    }

    @Test
    public void shouldCheckPurchaseRequestWhenPurchaseRequestSideTabIsSelected() {
        MyDashboardNav dashNav = new MyDashboardNav(driver);
        assertTrue("Unable to locate 'Purchase Request' tab in My Dashboard Left pane.",dashNav.clickPurchaseRequestSideBarTab());
        LeftPanePurchaseRequestTab leftPane = new LeftPanePurchaseRequestTab(driver);
        assertTrue("Unable to locate 'Add Request' button.", leftPane.clickAddRequestBtn());
        assertTrue("Unable to locate 'Purchase Request' header text",leftPane.locatePurchaseRequestHeaderText());
    }
}
