package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SummarizedBugsReportPage extends BasePage {

    private final By FILTER_BY_MONTH_SELECTOR =By.id("select_month");

    public SummarizedBugsReportPage(WebDriver driver){
        super(driver);
    }

    public boolean findFilterByMonthSelector(){return confirmElementIsVisible(FILTER_BY_MONTH_SELECTOR);}
}
