package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_dashboard_side_bar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MyDashboardSideBarNavigation extends BasePage {
    public MyDashboardSideBarNavigation(WebDriver driver) {
        super(driver);
    }

    private final By PURCHASE_REQUEST_SIDE_TAB = By.id("97_count");

    public boolean clickPurchaseRequestSideTab() {
        return clickElement(PURCHASE_REQUEST_SIDE_TAB);
    }
}
