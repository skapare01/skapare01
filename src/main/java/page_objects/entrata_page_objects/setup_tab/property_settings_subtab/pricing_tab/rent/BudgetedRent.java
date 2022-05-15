package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BudgetedRent extends BasePage {
    public BudgetedRent(WebDriver driver){
        super(driver);}
    private final By BULK_ADD_BUDGETED_RENT = By.id("js-bulk-add-budgeted-rent");

    public boolean verifyBulkAddBudgetedRent(){return confirmElementIsVisible(BULK_ADD_BUDGETED_RENT);}
}
