package page_objects.client_admin_page_objects.sales_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsSubTabNavigation extends BasePage {
    public LeadsSubTabNavigation(WebDriver driver) {
        super(driver);
    }

    private final By SALES_OPPORTUNITIES_HEADER_TEXT = By.id("quick_search_opportunities");
    private final By SEND_MASS_EMAIL_BUTTON = By.id("send-mass-email");

    public boolean opportunitiesPageHeaderText() {
        return confirmElementIsVisible(SALES_OPPORTUNITIES_HEADER_TEXT);
    }

    public boolean confirmSendMassEmailButtonIsVisible() { return confirmElementIsVisible(SEND_MASS_EMAIL_BUTTON); }

}
