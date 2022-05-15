package smoke_and_sanity_tests.client_admin_tests.hr_and_general;
import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.hr_tab.employees_subtab.EmployeesSubTab;
import page_objects.client_admin_page_objects.hr_tab.HrSubTabsNavigation;

import static junit.framework.Assert.assertTrue;

public class EmployeesAddEmployeeButtonIT extends BaseBrowserTest {
    public EmployeesAddEmployeeButtonIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "pjaiswal", "Xento123");
    }

    @Test
    public void shouldCheckAddEmployeeFunctionality_whenAddEmployeeButtonIsSelected() {
        ClientAdminNavBar clientNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to locate/select 'HR' tab.",clientNavBar.clickHrTab());
        HrSubTabsNavigation hrSubTabNav = new HrSubTabsNavigation(driver);
        assertTrue("Unable to locate/select 'Employees' sub-tab.",hrSubTabNav.clickEmployeesSubTab());
        EmployeesSubTab employeeTab = new EmployeesSubTab(driver);
        assertTrue("Unable to locate/select 'Add Employee' button.", employeeTab.clickAddEmployeeBtn());
        assertTrue("Unable to locate Employee info page.", employeeTab.addEmployeeInfoPage());
    }
}
