package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OpenBugCountByMonthPage extends BasePage {

    private final By MONTH_SELECTOR = By.id("open_bug_select_month");

    public OpenBugCountByMonthPage(WebDriver driver){
        super(driver);
    }

    public boolean findMonthSelector(){return confirmElementIsVisible(MONTH_SELECTOR);}
}
