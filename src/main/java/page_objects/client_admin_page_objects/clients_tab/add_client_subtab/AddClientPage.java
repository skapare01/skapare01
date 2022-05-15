package page_objects.client_admin_page_objects.clients_tab.add_client_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddClientPage extends BasePage {
    public AddClientPage(WebDriver driver) {
        super(driver);
    }

    private final By CLIENT_NAME_TEXT_FIELD = By.id("company_name");;

    public boolean confirmClientNameTextFieldIsVisibleInAddClientPage() {
        clickOkButtonOfAlertMessage();
        return confirmElementIsVisible(CLIENT_NAME_TEXT_FIELD);
    }
}
