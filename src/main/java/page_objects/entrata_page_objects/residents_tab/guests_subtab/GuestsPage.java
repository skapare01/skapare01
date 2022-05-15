package page_objects.entrata_page_objects.residents_tab.guests_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GuestsPage extends BasePage {

    public GuestsPage(WebDriver driver) {
        super(driver);
    }

    private final By GUESTS_PAGE =By.id("guest-manager-main");

    public boolean guestsPageVisible() {
        return confirmElementIsVisible(GUESTS_PAGE);
    }
}
