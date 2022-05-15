package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class VerifyLibraryTabIT extends BaseBrowserTest {
    public VerifyLibraryTabIT() {
        super("avantic");
    }
    private EntrataNavBar navigateTo;
    private ReportsNav smokeTests;

    @Test
    public void shouldLoadReportingLibrary_whenClicked () {
        navigateTo = new EntrataNavBar(driver);
        smokeTests = new ReportsNav(driver);
        assertTrue("Cant Find Reporting Tab",navigateTo.moveToReportsTab());
        assertTrue("Cant Click on library",navigateTo.librarySelect());
        assertTrue("Library tab failed to load", smokeTests.confirmReportsLibraryLoads());
    }
}
