package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HistoricalRent extends BasePage {
    public HistoricalRent(WebDriver driver){
        super(driver);}

private final By BULK_UPDATE_SELECTED_UNITS = By.linkText("Bulk Update Selected Units");

    public boolean verifyBulkUpdateSelectedUnits(){return confirmElementIsVisible(BULK_UPDATE_SELECTED_UNITS);}
}
