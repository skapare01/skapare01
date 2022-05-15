package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.company_reports_subtab.CompanyReportsPage;

public class VerifyAddingCompanyReportToMyReportsIT extends BaseBrowserTest {
    public VerifyAddingCompanyReportToMyReportsIT() {
        super("avantic");
    }

    @Test
    public void shouldAddReportToMyReports_whenOptionsAreSelectedInCompanyReportsTab() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Could not move to Reports tab.", entrataNavBar.moveToReportsTab());
        assertTrue("Could not click Company Reports subtab.", entrataNavBar.companyReportsSelect());

        CompanyReportsPage companyReports = new CompanyReportsPage(driver);
        assertTrue("Could not click on 3 dot option next to report.", companyReports.clickThreeDotOptionNextToReport());
        assertTrue("Could not click on Add to My Reports option.", companyReports.clickAddToMyReportsOption());
        assertTrue("Could not click on Add New Report Group button.", companyReports.clickAddNewGroupButton());
        assertTrue("Could not enter in random report group name in text field.", companyReports.enterNewReportGroupName());
        assertTrue("Could not click green Add to My Reports button.", companyReports.clickGreenAddToMYReportsButton());
        assertTrue("Could not confirm that success banner message appeared for adding a report to My Reports tab/page.", companyReports.confirmSuccessBannerAppeared());
    }
}
