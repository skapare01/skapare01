package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Rent_Property extends BasePage {

    public Rent_Property(WebDriver driver) {
        super(driver);}

    private final By BULK_EDIT_PROSPECT_RENTS = By.linkText("Bulk Edit Prospect Rents");


    // bulk edit prospect rents popup
    private final By BULK_ADJUST_PRICING = By.linkText("Bulk Adjust Pricing");
    private final By CLOSE_BUTTON = By.className("close-button");

    public boolean clickBulkEditProspectRents(){return clickElement(BULK_EDIT_PROSPECT_RENTS);}
    public boolean verifyVisibilityOfBulkAdjustPRicing(){return confirmElementIsVisible(BULK_ADJUST_PRICING);}
    public boolean clickCLoseButton(){return clickElement(CLOSE_BUTTON);}
    public boolean verifyVisibilityBulkEditProspectRents(){return confirmElementIsVisible(BULK_EDIT_PROSPECT_RENTS);}
}
