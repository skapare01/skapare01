package page_objects.entrata_page_objects.residents_tab.gross_rent_change_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GrossRentChangePage extends BasePage {

    public GrossRentChangePage(WebDriver driver) {
        super(driver);
    }

    //Gross Rent Change sub-tab locators
    private final By GROSS_RENT_CHANGE_PROPERTY_COLUMN = By.xpath("//th[text()='Property']");
    private final By GROSS_RENT_CHANGE_CONTRACT_COLUMN = By.xpath("//th[text()='Contract']");
    private final By GROSS_RENT_CHANGE_EFFECTIVE_DATE_COLUMN = By.xpath("//th[text()='Effective Date']");

    //Gross Rent Change methods
    public boolean confirmGrossRentChangeColumn_Property() {
        return confirmElementIsVisible(GROSS_RENT_CHANGE_PROPERTY_COLUMN);
    }

    public boolean confirmGrossRentChangeColumn_Contract() {
        return confirmElementIsVisible(GROSS_RENT_CHANGE_CONTRACT_COLUMN);
    }

    public boolean confirmGrossRentChangeColumn_EffectiveDate() {
        return confirmElementIsVisible(GROSS_RENT_CHANGE_EFFECTIVE_DATE_COLUMN);
    }

}
