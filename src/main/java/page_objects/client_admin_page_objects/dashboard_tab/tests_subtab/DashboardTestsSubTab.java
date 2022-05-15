package page_objects.client_admin_page_objects.dashboard_tab.tests_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DashboardTestsSubTab extends BasePage {
    public DashboardTestsSubTab(WebDriver driver) {
        super(driver);
    }

    private final By DASHBOARD_TESTS_ADD_TEST_BUTTON =By.id("add_test");
    private final By ADD_TEST_TEST_DETAILS_PAGE = By.id("test_details");

    public boolean clickDashboardTestsAddTestButton() {
        return clickElement(DASHBOARD_TESTS_ADD_TEST_BUTTON);
    }

    public boolean viewAddTestDetailsPage() {
        return confirmElementIsVisible(ADD_TEST_TEST_DETAILS_PAGE);
    }
}
