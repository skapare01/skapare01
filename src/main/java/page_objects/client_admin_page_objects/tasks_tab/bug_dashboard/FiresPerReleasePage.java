package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FiresPerReleasePage extends BasePage {

    private final By PRODUCT_SELECTOR_DROPDOWN = By.id("div_product_multiselector");

    public FiresPerReleasePage(WebDriver driver){
        super(driver);}

    public boolean findProductSelectorDropdown(){return confirmElementIsVisible(PRODUCT_SELECTOR_DROPDOWN);}

}
