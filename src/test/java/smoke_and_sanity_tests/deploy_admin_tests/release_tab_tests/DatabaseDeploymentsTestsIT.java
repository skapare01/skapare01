package smoke_and_sanity_tests.deploy_admin_tests.release_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.release_tab.database_deployments_subtab.DatabaseDeploymentsPage;

import static org.junit.Assert.assertTrue;

public class DatabaseDeploymentsTestsIT extends BaseBrowserTest {
    public DatabaseDeploymentsTestsIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2223040 and ID#2224590
    public void shouldConfirmElementsInDatabaseDeploymentsPage_whenOptionIsSelectedFromReleaseTab() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Release tab in DeployAdmin.", deployAdminNavBar.hoverOverReleaseTab());
        assertTrue("Could not click the Database Deployments option under the Release tab.", deployAdminNavBar.clickDatabaseDeploymentsSubtab());

        DatabaseDeploymentsPage databaseDeploymentsPage = new DatabaseDeploymentsPage(driver);
        assertTrue("Could not click on SQL Execution tab.", databaseDeploymentsPage.clickSqlExecutionTab());
        assertTrue("Could not click on Weekly Release tab.", databaseDeploymentsPage.clickWeeklyReleaseTab());
        assertTrue("Could not click on Weekly Procedure Execution tab.", databaseDeploymentsPage.clickWeeklyProcedureExecutionTab());
        assertTrue("Could not click on Weekly Views Execution tab.", databaseDeploymentsPage.clickWeeklyViewsExecutionTab());
        assertTrue("Could not confirm that the Add Deployment button is visible.", databaseDeploymentsPage.confirmAddDeploymentButtonIsVisible());
    }
}
