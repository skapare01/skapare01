package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ManageMessagePage extends BasePage {
    public ManageMessagePage(WebDriver driver){
        super(driver);}

    private final By SENT_TAB = By.cssSelector("li[data-tabname = 'sent']");
    private final By SCHEDULED_TAB = By.cssSelector("li[data-tabname = 'scheduled']");
    private final By SORT_BY_DROPDOWN = By.id("sort_criteria");

    public boolean findSentTab(){return confirmElementIsVisible(SENT_TAB);}
    public boolean findScheduledTab(){return confirmElementIsVisible(SCHEDULED_TAB);}
    public boolean findSortBy(){return confirmElementIsVisible(SORT_BY_DROPDOWN);}
}
