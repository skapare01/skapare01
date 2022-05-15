package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsByPriorityPage extends BasePage {

    private final By PRODUCT_SELECTOR = By.id("div_product_multiselector");

    public BugsByPriorityPage(WebDriver driver){
        super(driver);
    }

    public boolean findProductSelector(){return confirmElementIsVisible(PRODUCT_SELECTOR);}
}
