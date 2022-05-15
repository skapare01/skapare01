package page_objects.client_admin_page_objects.clients_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SimplementationPage extends BasePage {
    public SimplementationPage(WebDriver driver){
        super(driver); }

    private final By CREATE_PORTAL = By.cssSelector(".js-create-portal");

    public boolean findCreatePortalButton(){return confirmElementIsVisible(CREATE_PORTAL);}
}
