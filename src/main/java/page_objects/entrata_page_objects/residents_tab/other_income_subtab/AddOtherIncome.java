package page_objects.entrata_page_objects.residents_tab.other_income_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddOtherIncome extends BasePage {

    public AddOtherIncome(WebDriver driver) {
        super(driver);
    }

    private final By ADD_OTHER_INCOME_PAGE = By.id("frm_create_misc_income");

    public boolean addOtherIncomePageVisible() {
        return confirmElementIsVisible(ADD_OTHER_INCOME_PAGE);
    }
}
