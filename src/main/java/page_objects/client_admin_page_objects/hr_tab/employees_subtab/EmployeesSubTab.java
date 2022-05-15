package page_objects.client_admin_page_objects.hr_tab.employees_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EmployeesSubTab extends BasePage {
    public EmployeesSubTab(WebDriver driver) {
        super(driver);
    }

    // Employees buttons & tabs //
    private final By ADD_EMPLOYEE_BTN = By.xpath("//*[text()=' Add Employee']");

    // Other //
    private final By ADD_EMPLOYEE_INFO_PAGE = By.id("div-basic-info");

    public boolean clickAddEmployeeBtn() {
        return clickElement(ADD_EMPLOYEE_BTN);
    }

    public boolean addEmployeeInfoPage() {
        return confirmElementIsVisible(ADD_EMPLOYEE_INFO_PAGE);
    }
}
