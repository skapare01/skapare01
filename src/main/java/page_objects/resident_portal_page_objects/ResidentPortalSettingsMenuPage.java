package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalSettingsMenuPage extends BasePage {

    //Variables
    private final By SETTINGS_MENU_PAGE_TITLE_LABEL = By.xpath("//h1/strong[text()='Settings']");

    //Constructor
    public ResidentPortalSettingsMenuPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean confirmOnSettingsMenuPage() {
        return confirmElementIsVisible(SETTINGS_MENU_PAGE_TITLE_LABEL);
    }
}
