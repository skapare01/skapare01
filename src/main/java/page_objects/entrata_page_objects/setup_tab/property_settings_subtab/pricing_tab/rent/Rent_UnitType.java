package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Rent_UnitType extends BasePage {

    public Rent_UnitType(WebDriver driver) {
        super(driver);}

    private final By RENT_MATRIX = By.className("matrix");
    private final By MATRIX_LEASE_TERM_SELECTOR = By.id("lt-selector");
    private final By CLOSE_BUTTON = By.cssSelector("button[title = 'Close']");
    private final By BULK_EDIT_PROSPECT_RENTS = By.linkText("Bulk Edit Prospect Rents");

    public boolean clickRentMatrix(){return clickElement(RENT_MATRIX);}
    public boolean verifyVisibilityOfLeaseTermSelector(){return confirmElementIsVisible(MATRIX_LEASE_TERM_SELECTOR);}
    public boolean clickCloseButton(){return clickElement(CLOSE_BUTTON);}
    public boolean verifyVisibilityBulkEditProspectRents(){return confirmElementIsVisible(BULK_EDIT_PROSPECT_RENTS);}

}
