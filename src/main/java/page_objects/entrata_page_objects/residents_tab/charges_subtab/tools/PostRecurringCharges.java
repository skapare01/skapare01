package page_objects.entrata_page_objects.residents_tab.charges_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostRecurringCharges extends BasePage {

    public PostRecurringCharges(WebDriver driver) {
        super(driver);
    }

    private final By POST_RECURRING_CHARGE_PAGE = By.id("recurring_charges");

    public boolean postRecurringChargePageVisible() {
        return confirmElementIsVisible(POST_RECURRING_CHARGE_PAGE);
    }
}
