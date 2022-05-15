package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyDepositsPage extends BasePage {
    public PropertyDepositsPage(WebDriver driver){
        super(driver);}

    private final By BULK_EDIT_PRICING = By.linkText("Bulk Edit Pricing");

    public boolean confirmEditPricingVisible(){return confirmElementIsVisible(BULK_EDIT_PRICING);}
}
