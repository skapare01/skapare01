package page_objects.entrata_page_objects.residents_tab.other_income_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OtherIncomePage extends BasePage {

    public OtherIncomePage(WebDriver driver) {
        super(driver);
    }

    private final By RESIDENT_PAGE = By.id("customer_system");
    private final By FIRST_LISTED_RESIDENT = By.cssSelector("tr[title*='Lease Id'");
    private final By ADD_OTHER_INCOME_BUTTON = By.cssSelector("a[onclick*='Add Other Income']");


    public boolean firstListedResidentClick() {
        return clickElement(FIRST_LISTED_RESIDENT);
    }

    public boolean residentPageVisible() {
        return confirmElementIsVisible(RESIDENT_PAGE);
    }

    public boolean addOtherIncomeButtonClick() {
        return clickElement(ADD_OTHER_INCOME_BUTTON);
    }
}
