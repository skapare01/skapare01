package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.bug_dashboard.*;

import static org.junit.Assert.assertTrue;

public class BugDashboardTestsIT extends BaseBrowserTest {
    public BugDashboardTestsIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"bliddell","Xento123");
    }

    @Test
    public void shouldNavigateTabsOfBugDashboard_whenUserLoggedIn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        assertTrue("Unable to find tasks tab.",nav.clickTasksTab());
        assertTrue("Unable to click bug dashboard subtab.",nav.clickBugDashboard());
        BugDashboardNav bugDashboardNav = new BugDashboardNav(driver);
        assertTrue("Unable to click 'bugs per release' tab.", bugDashboardNav.clickBugsPerReleaseTab());
        BugsPerReleasePage bugsPerReleasePage = new BugsPerReleasePage(driver);
        assertTrue("Unable to find 'bugs per release' chart.",bugsPerReleasePage.findBugsPerReleaseChart());
        assertTrue("Unable to click 'fires per release' tab.",bugDashboardNav.clickFiresPerReleaseTab());
        FiresPerReleasePage firesPerReleasePage = new FiresPerReleasePage(driver);
        assertTrue("Unable to find product selector dropdown on 'fires by release' page.", firesPerReleasePage.findProductSelectorDropdown());
        assertTrue("Unable to click 'bugs by product' tab.", bugDashboardNav.clickBugsByProductTab());
        BugsByProductPage bugsByProductPage = new BugsByProductPage(driver);
        assertTrue("Unable to find search button on 'bugs by product' page.",bugsByProductPage.findBugsByProductSearchButton());
        assertTrue("Unable to click 'bugs by employee' tab.",bugDashboardNav.clickBugsByEmployeeTab());
        BugsByEmployeePage bugsByEmployeePage = new BugsByEmployeePage(driver);
        assertTrue("Unable to find search button on 'bugs by employee' page.",bugsByEmployeePage.findBugsByEmployeeSearchButton());
        assertTrue("Unable to click 'bugs by SDM' tab.",bugDashboardNav.clickBugsBySDMTab());
        BugsBySDMPage bugsBySDMPage = new BugsBySDMPage(driver);
        assertTrue("Unable to find 'bugs by software development manager' chart.",bugsBySDMPage.findOpenBugExcludesDropdown());
        assertTrue("Unable to click 'bugs by priority' tab.",bugDashboardNav.clickBugsByPriorityTab());
        BugsByPriorityPage bugsByPriorityPage = new BugsByPriorityPage(driver);
        assertTrue("Unable to find product selector dropdown on 'bugs by priority' page.", bugsByPriorityPage.findProductSelector());
        assertTrue("Unable to click 'bugs by status' tab.",bugDashboardNav.clickBugsByStatusTab());
        BugsByStatusPage bugsByStatusPage = new BugsByStatusPage(driver);
        assertTrue("Unable to find product selector dropdown on 'bugs by status' page.", bugsByStatusPage.findProductSelectorDropdown());
        assertTrue("Unable to click 'priority per release' tab.",bugDashboardNav.clickPriorityPerReleaseTab());
        PriorityPerReleasePage priorityPerReleasePage = new PriorityPerReleasePage(driver);
        assertTrue("Unable to find priority bug per release chart.",priorityPerReleasePage.findPriorityBugsPerReleaseChart());
        assertTrue("Unable to click 'product bugs vs features' tab.",bugDashboardNav.clickProductBugsTab());
        ProductBugsVsFeatures productBugsVsFeatures = new ProductBugsVsFeatures(driver);
        assertTrue("Unable to find 'bugs vs features closed per release' chart.",productBugsVsFeatures.findBugsVsFeaturesChart());
        assertTrue("Unable to click 'summarized bugs report' tab.",bugDashboardNav.clickSummarizedBugsReportTab());
        SummarizedBugsReportPage summarizedBugsReportPage = new SummarizedBugsReportPage(driver);
        assertTrue("Unable to find month selector dropdown.",summarizedBugsReportPage.findFilterByMonthSelector());
        assertTrue("Unable to click 'tasks by product & status' tab.",bugDashboardNav.clickTasksByProductStatusTab());
        TasksByProductAndStatus tasksByProductAndStatus = new TasksByProductAndStatus(driver);
        assertTrue("Unable to find task type dropdown on 'tasks by product and status' page.", tasksByProductAndStatus.findTaskTypeSelector());
        assertTrue("Unable to click 'open bug count by month' tab.",bugDashboardNav.clickOpenBugCountByMonthTab());
        OpenBugCountByMonthPage openBugCountByMonthPage = new OpenBugCountByMonthPage(driver);
        assertTrue("Unable to find month selector dropdown.", openBugCountByMonthPage.findMonthSelector());
        








    }
}
