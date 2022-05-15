package page_objects.deploy_admin_page_objects.release_tab.database_deployments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DatabaseDeploymentsPage extends BasePage {
    public DatabaseDeploymentsPage(WebDriver driver) {
        super(driver);
    }

    //Main Tab Locators:
    private final By SQL_EXECUTION_TAB = By.xpath("//a[text()='SQL Execution']");
    private final By WEEKLY_RELEASE_TAB = By.xpath("//a[text()='Weekly Release']");
    private final By WEEKLY_PROCEDURE_EXECUTION_TAB = By.xpath("//a[text()='Weekly Procedure Execution']");
    private final By WEEKLY_VIEWS_EXECUTION_TAB = By.xpath("//a[text()='Weekly Views Execution']");

    //Top Button Locators:
    private final By ADD_DEPLOYMENT_BUTTON = By.cssSelector("a[onclick='addDeployment();'] i");

    //Main Tab Methods:
    public boolean clickSqlExecutionTab() {
        return clickElement(SQL_EXECUTION_TAB);
    }

    public boolean clickWeeklyReleaseTab() {
        return clickElement(WEEKLY_RELEASE_TAB);
    }

    public boolean clickWeeklyProcedureExecutionTab() {
        return clickElement(WEEKLY_PROCEDURE_EXECUTION_TAB);
    }

    public boolean clickWeeklyViewsExecutionTab() {
        return clickElement(WEEKLY_VIEWS_EXECUTION_TAB);
    }

    //Top Button Methods:
    public boolean confirmAddDeploymentButtonIsVisible() {
        return confirmElementIsVisible(ADD_DEPLOYMENT_BUTTON);
    }
}
