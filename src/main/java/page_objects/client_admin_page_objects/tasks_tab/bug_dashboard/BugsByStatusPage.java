package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsByStatusPage extends BasePage {

    private final By PRODUCT_SELECTOR = By.id("div_product_multiselector");

    public BugsByStatusPage(WebDriver driver){
        super(driver);
    }

    public boolean findProductSelectorDropdown(){return confirmElementIsVisible(PRODUCT_SELECTOR);}
}
