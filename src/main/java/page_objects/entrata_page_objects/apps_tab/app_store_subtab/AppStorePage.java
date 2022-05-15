package page_objects.entrata_page_objects.apps_tab.app_store_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AppStorePage extends BasePage {

    public AppStorePage(WebDriver driver) {super(driver);}

    private final By MY_PRODUCTS_TAB = By.id("view_my_products_tab");

    public boolean confirmVisibilityOfMyProductsTab() {return confirmElementIsVisible(MY_PRODUCTS_TAB);}
}
