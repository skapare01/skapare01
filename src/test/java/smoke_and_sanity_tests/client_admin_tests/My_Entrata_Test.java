package smoke_and_sanity_tests.client_admin_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab.MyXentoNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab.TimeOffRequestsPage;
import page_objects.deploy_admin_page_objects.DeployAdminNavBar;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab.ImportData;
import page_objects.login.Login_SK;

import static org.junit.Assert.assertTrue;

public class My_Entrata_Test extends BaseBrowserTest {
    public My_Entrata_Test()
    {
        //super("migrationborapid", SitesEnum.ENTRATA,"Entrata_5074","Xento123");
        super("clientadmin");
       // super("migrationborapid");
    }

    @Test

    public void VisibilityOf_MyEntrata()
    {
        /*Login_SK Mig = new Login_SK(driver);
        assertTrue("Username inserted successfully", Mig.insert_username("sbhandari"));
        assertTrue("Password inserted successfully",Mig.insert_password("Entrata123"));
        assertTrue("Login successfully",Mig.Login_Click());
*/
        MyDashboardNav myEntrata = new MyDashboardNav(driver);
        assertTrue("Successfully click on My Entrata",myEntrata.clickMyXentoTab());

        MyXentoNav Entrata_Nav = new MyXentoNav(driver);
        assertTrue("Successfully click on Time_of_Request",Entrata_Nav.clickTimeOffRequests());



        TimeOffRequestsPage TORP = new TimeOffRequestsPage(driver);
        assertTrue("Successfully click on Add request",TORP.clickAddRequest());
        assertTrue("Successfully click on Cancel",TORP.clickCancelButton());


        assertTrue("Successfully click on Weekend Working",Entrata_Nav.clickWeekendWorkingTab());
        assertTrue("Successfully click on Release support",Entrata_Nav.clickReleaseSupportTab());

        //assertTrue("select all", Mig.check_All());
        /*EntrataNavBar setup_nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation set_first_level = new CompanyFirstLevelNavigation(driver);
        CompanyDataManagementNav data_setup = new CompanyDataManagementNav(driver);
        ImportData import_data = new ImportData(driver);
        assertTrue("Could not click Setup tab.",setup_nav.clickSetupButton());
        assertTrue("Could not click Data Management tab.", set_first_level.clickDataManagementTab());
        assertTrue("Could not click Import Data tab.", data_setup.importDataTabClick());
        assertTrue("Could not find Import Data page.", import_data.importDataPageVisible());*/

    }


}
