package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class VerifyMyReportingTabIT extends BaseBrowserTest {
    public VerifyMyReportingTabIT() {
        super("avantic");
    }

    @Test
    public void shouldLoadMyReportingTab_whenClicked () {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        ReportsNav smokeTests = new ReportsNav(driver);

        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("My Reports is missing from dropdown.", navigateTo.myReportsSelect());
        assertTrue("My Reports tab failed to Load.", smokeTests.confirmMyReportsLoads());
    }
}
