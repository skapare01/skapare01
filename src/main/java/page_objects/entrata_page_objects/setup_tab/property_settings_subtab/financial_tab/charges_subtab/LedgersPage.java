package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LedgersPage extends BasePage {
    public LedgersPage (WebDriver driver){
        super(driver);
    }
    private final By ASSOCIATE_LEDGERS_BUTTON = By.linkText("Associate Ledgers");

    public boolean verifyAssociateLedgers(){return confirmElementIsVisible(ASSOCIATE_LEDGERS_BUTTON);}
}
