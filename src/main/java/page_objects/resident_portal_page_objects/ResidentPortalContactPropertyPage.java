package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalContactPropertyPage extends BasePage {

    //Variables
    private final By CONTACT_PROPERTY_PAGE_TITLE_LABEL = By.xpath("//h1/strong[text()='New Message']");

    //Constructor
    public ResidentPortalContactPropertyPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean confirmOnContactPropertyPage() {
        return confirmElementIsVisible(CONTACT_PROPERTY_PAGE_TITLE_LABEL);
    }

}
