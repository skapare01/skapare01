package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WeekendWorkingRequestsPage extends BasePage {
    public WeekendWorkingRequestsPage(WebDriver driver){
        super(driver);
    }
    private final By ADD_REQUEST = By.cssSelector("#view_weekend_working_requests > a");
    private final By CANCEL_BUTTON = By.id("cancel");

    public boolean clickAddRequest(){return clickElement(ADD_REQUEST);}
    public boolean clickCancelButton(){return clickElement(CANCEL_BUTTON);}
}
