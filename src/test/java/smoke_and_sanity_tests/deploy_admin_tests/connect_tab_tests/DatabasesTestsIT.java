package smoke_and_sanity_tests.deploy_admin_tests.connect_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.deploy_admin_page_objects.connect_tab.databases_subtab.DatabasesPage;
import static org.junit.Assert.assertTrue;

public class DatabasesTestsIT extends BaseBrowserTest {
    public DatabasesTestsIT() {
        super("deploy", SitesEnum.DEPLOYADMIN, "sgarud", "Xento123");
    }

    @Test
    //Test for EntrataTest ID #2224594
    public void shouldVerifyAllDatabasesPageLoads_whenTabIsClickedOnFromDatabasesTab() {
        DeployAdminNavBar deployAdminNavBar = new DeployAdminNavBar(driver);
        assertTrue("Could not hover over the Connect tab in DeployAdmin.", deployAdminNavBar.hoverOverConnectTab());
        assertTrue("Could not click the Databases option under the Connect tab.", deployAdminNavBar.clickDatabasesSubtab());

        DatabasesPage databasesPage = new DatabasesPage(driver);
        assertTrue("Could not click on All Databases tab.", databasesPage.clickAllDatabasesTab());
        assertTrue("Could not confirm that the list count drop down menu is visible at the bottom of the page.", databasesPage.confirmListCountDropDownMenuIsVisible());
    }
}
