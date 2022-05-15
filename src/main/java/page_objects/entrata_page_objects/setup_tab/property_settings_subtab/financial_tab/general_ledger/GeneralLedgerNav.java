package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralLedgerNav extends BasePage {
    public GeneralLedgerNav(WebDriver driver){
        super(driver);}

private final By DETAILS_TAB = By.id("property_financial_general_ledger_detailsxxx");
    private final By GROSS_POTENTIAL_RENT_TAB = By.id("property_financial_general_ledger_gross_potential_rentxxx");


    public boolean clickDetailsTab(){return clickElement(DETAILS_TAB);}
    public boolean clickGrossPotentialRentTab(){return clickElement(GROSS_POTENTIAL_RENT_TAB);}
    }

