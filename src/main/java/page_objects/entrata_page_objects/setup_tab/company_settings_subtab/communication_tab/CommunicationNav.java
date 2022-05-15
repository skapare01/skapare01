package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CommunicationNav extends BasePage {

    private final By DOCUMENTS_BUTTON = By.id("li_nav_documents_setupxxx");

    //Constructor
    public CommunicationNav(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean clickDocumentsButton() {
        return clickElement(DOCUMENTS_BUTTON);
    }

}
