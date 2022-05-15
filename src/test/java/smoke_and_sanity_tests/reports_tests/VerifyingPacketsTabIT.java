package smoke_and_sanity_tests.reports_tests;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import base_tests.BaseBrowserTest;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

public class VerifyingPacketsTabIT extends BaseBrowserTest {
    public VerifyingPacketsTabIT() {super("avantic");}

    @Test
    public void shouldOpenPacketsPage_whenSubtabIsClickedOn () {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Cant Find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Could not click on Packets subtab.", navigateTo.packetsSelect());
        ReportsNav smoke = new ReportsNav(driver);
        assertTrue("Report Packets tab did not load.", smoke.checkReportPacketsLoaded());
    }
}
