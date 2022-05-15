package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.hr_tab.HrSubTabsNavigation;
import page_objects.client_admin_page_objects.hr_tab.employee_policies_subtab.AddPolicyPage;
import page_objects.client_admin_page_objects.hr_tab.employee_policies_subtab.EmployeePoliciesPage;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;
import static utils.RandomGenerator.randomName;

public class AddEmployeePolicyIT extends BaseBrowserTest {

    public AddEmployeePolicyIT() {
        super("clientadmin", CLIENTADMIN, "rjensen", "Entrata123");
    }

    @Test
    public void shouldAddEmployeePolicy_whenPolicyFormIsCompleted() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        HrSubTabsNavigation hrSubTabsNavigation = new HrSubTabsNavigation(driver);
        EmployeePoliciesPage employeePoliciesPage = new EmployeePoliciesPage(driver);
        AddPolicyPage addPolicyPage = new AddPolicyPage(driver);

        assertTrue("Could not find HR tab.", clientAdminNavBar.moveToHrTab());
        assertTrue("Could not click Employee Policies sub tab.", hrSubTabsNavigation.clickEmployeePoliciesSubTab());
        assertTrue("Could not click Add Policy button.", employeePoliciesPage.addPolicyButtonClick());
        assertTrue("Could not input Policy Name.", addPolicyPage.policyNameInput(randomName()));
        assertTrue("Could not input Policy Description.", addPolicyPage.policyDescriptionInput("This text is being inserted as part of the test."));
        assertTrue("Could not click Policy States dropdown.", addPolicyPage.policyStatesDropdownClick());
        assertTrue("Could not click 'All' from States dropdown.", addPolicyPage.policyStatesAllOptionClick());
        assertTrue("Could not click Policy Form to remove dropdown.", addPolicyPage.policyFormClick());
        assertTrue("Could not click Policy Employees dropdown.", addPolicyPage.policyEmployeeDropdownClick());
        assertTrue("Could not click 'All' from Employees dropdown.", addPolicyPage.policyEmployeeAllOptionClick());
        assertTrue("Could not click Policy Form to remove dropdown.", addPolicyPage.policyFormClick());
        assertTrue("Could not click Policy Designations dropdown.", addPolicyPage.policyDesignationDropdownClick());
        assertTrue("Could not click 'All' from Designations dropdown.", addPolicyPage.policyDesignationAllOptionClick());
        assertTrue("Could not click Policy Form to remove dropdown.", addPolicyPage.policyFormClick());
        assertTrue("Could not move to Publish checkbox.", addPolicyPage.moveToPublishCheckbox());
        assertTrue("Could not move to upload PDF file button.", addPolicyPage.moveToPolicyFileUpload());
        assertTrue("Could not upload a PDF file.", addPolicyPage.policyFileUpload());
        assertTrue("Could not move to Publish checkbox.", addPolicyPage.moveToPublishCheckbox());
        assertTrue("Could not click on Publish checkbox.", addPolicyPage.policyPublishCheckboxClick());
        assertTrue("Could not click 'Save' policy button.", addPolicyPage.savePolicyButtonCLick());
        assertTrue("Could not find green success banner.", addPolicyPage.policySuccessBannerVisible());
    }
}
