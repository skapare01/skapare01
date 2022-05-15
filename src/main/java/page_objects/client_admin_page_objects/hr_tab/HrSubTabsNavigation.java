package page_objects.client_admin_page_objects.hr_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HrSubTabsNavigation extends BasePage {
    public HrSubTabsNavigation(WebDriver driver) {
        super(driver);
    }

    private final By EMPLOYEE_POLICIES_SUB_TAB = By.linkText("Employee Policies");
    private final By EMPLOYEE_SUB_TAB = By.linkText("Employees");
    private final By PAYROLL_SUB_TAB = By.linkText("Payroll");
    private final By RECRUITMENT_SUB_TAB = By.linkText("Recruitment");
    private final By ADD_APPLICATION_BTN = By.xpath("//a[text()='Add Application']");
    private final By ADD_APPLICATION_BASIC_INFORMATION_TEXT = By.xpath("//h6[text()='Basic Information']");

    public boolean clickEmployeePoliciesSubTab() {
        return clickElement(EMPLOYEE_POLICIES_SUB_TAB);
    }
    public boolean clickEmployeesSubTab() {
        return clickElement(EMPLOYEE_SUB_TAB);
    }
    public boolean clickPayrollSubTab() {
        return clickElement(PAYROLL_SUB_TAB);
    }
    public boolean clickRecruitmentSubTab() {
        return clickElement(RECRUITMENT_SUB_TAB);
    }
    public boolean clickAddApplicationBtn() {
        return clickElement(ADD_APPLICATION_BTN);
    }
    public boolean viewAddApplicationBasicInfoText() {
        return confirmElementIsVisible(ADD_APPLICATION_BASIC_INFORMATION_TEXT);
    }
}
