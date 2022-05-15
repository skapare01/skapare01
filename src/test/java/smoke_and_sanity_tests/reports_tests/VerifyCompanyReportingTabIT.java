package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class VerifyCompanyReportingTabIT extends BaseBrowserTest {
    public VerifyCompanyReportingTabIT() {
        super("avantic");
    }

    @Test
    public void shouldLoadCompanyReportingTab_whenClicked () {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("Company Reports is missing from dropdown.", navigateTo.companyReportsSelect());

        ReportsNav smokeTests = new ReportsNav(driver);
        assertTrue("Company Reports tab failed to Load.", smokeTests.confirmCompanyReportsLoads());
    }
}