package page_objects.entrata_page_objects.residents_tab.deposits_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DepositsPage extends BasePage {

    public DepositsPage(WebDriver driver) {
        super(driver);
    }

    private final By DEPOSITS_PAGE = By.id("div-view-listing");

    public boolean depositsPageVisible() {
        return confirmElementIsVisible(DEPOSITS_PAGE);
    }
}
