package page_objects.entrata_page_objects.apps_tab.order_forms_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OrderFormsPage extends BasePage {

    public OrderFormsPage(WebDriver driver) {super(driver);}

    private final By LISTING_CONTAINER = By.id("frm_view_order_forms");

    public boolean confirmVisibilityOfOrderFormsListingContainer() { return confirmElementIsVisible(LISTING_CONTAINER, waitTimes.LONG_WAIT);}
}
