package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.InsuranceSubTab;

import static org.junit.Assert.assertTrue;

public class ShouldLoadInsuranceDashboardPagesWhenUsingMyDashboardNavigationIT extends BaseBrowserTest {

    public ShouldLoadInsuranceDashboardPagesWhenUsingMyDashboardNavigationIT() { super("ri");}

    @Test
    public void ShouldLoadInsuranceDashboardPages_whenUsingMyDashboardNavigation() {

        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        assertTrue("Unable to click 'Residents' tab in My Dashboard",myDashboardNav.clickResidentsTab());
        assertTrue("Unable to click 'Insurance' subtab in My Dashboard",myDashboardNav.clickInsuranceTab());
        InsuranceSubTab insuranceSubTab = new InsuranceSubTab(driver);
        assertTrue("Unable to click 'Add/Update' tab in Insurance subtab", insuranceSubTab.clickAddUpdate());
        assertTrue("Unable to find 'Add/Update' page in Insurance subtab", insuranceSubTab.findAddUpdatePage());
        assertTrue("Unable to click 'Verify' tab in Insurance subtab", insuranceSubTab.clickVerify());
        assertTrue("Unable to find 'Verify' page in Insurance subtab", insuranceSubTab.findVerifyPage());
        assertTrue("Unable to click 'Match' tab in Insurance subtab", insuranceSubTab.clickMatch());
        assertTrue("Unable to find 'Match' page in Insurance subtab", insuranceSubTab.findMatchPage());
        assertTrue("Unable to click 'Expiring Soon' tab in Insurance subtab", insuranceSubTab.clickExpiringSoon());
        assertTrue("Unable to find 'Expiring Soon' page in Insurance subtab", insuranceSubTab.findExpiringSoonPage());

    }

}
