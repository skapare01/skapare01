package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class VerifyScheduledTabIT extends BaseBrowserTest {
    public VerifyScheduledTabIT() {
        super("avantic");
    }

    @Test
    public void shouldLoadScheduledReportsTab_whenClicked () {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("Scheduled Reports is missing from dropdown.", navigateTo.scheduledReports());

        ReportsNav smokeTests = new ReportsNav(driver);
        assertTrue("Scheduled Reports tab failed to Load.", smokeTests.confirmScheduledReportsLoads());
    }
}