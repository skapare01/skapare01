package page_objects.client_admin_page_objects.hr_tab.employee_policies_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EmployeePoliciesPage extends BasePage {

    public EmployeePoliciesPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_POLICY_BUTTON = By.cssSelector("a[class='action button js-add_or_edit_employee_policy']");

    public boolean addPolicyButtonClick() {
        return clickElement(ADD_POLICY_BUTTON);
    }
}
