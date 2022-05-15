package page_objects.entrata_page_objects.residents_tab.all_residents_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddResidentPage extends BasePage {

    public AddResidentPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_RESIDENT_PAGE = By.id("add_customers");

    public boolean addResidentPageVisible() {
        return confirmElementIsVisible(ADD_RESIDENT_PAGE);
    }
}
