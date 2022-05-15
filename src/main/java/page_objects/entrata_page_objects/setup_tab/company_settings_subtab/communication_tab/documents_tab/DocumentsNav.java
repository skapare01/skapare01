package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DocumentsNav extends BasePage {

    private final By PACKETS_BUTTON = By.id("li_sub_nav_packets_setupxxx");

    //Constructor
    public DocumentsNav(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean clickPacketsButton() {
        return clickElement(PACKETS_BUTTON);
    }

}
