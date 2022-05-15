package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Rent_UnitSpace extends BasePage {
    public Rent_UnitSpace(WebDriver driver){
        super(driver);}

    private final By BULK_EDIT_RENEWAL_RENTS = By.linkText("Bulk Edit Renewal Rents");

    public boolean verifyBulkEditRenewalRents(){return confirmElementIsVisible(BULK_EDIT_RENEWAL_RENTS);}
}
