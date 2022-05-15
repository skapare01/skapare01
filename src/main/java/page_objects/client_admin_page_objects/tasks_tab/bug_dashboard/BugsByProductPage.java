package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsByProductPage extends BasePage {

    private final By BUGS_BY_PRODUCT_SEARCH_BUTTON = By.id("btnSearch");

    public BugsByProductPage(WebDriver driver){
        super(driver);
    }

    public boolean findBugsByProductSearchButton(){return clickElement(BUGS_BY_PRODUCT_SEARCH_BUTTON);}
}
