package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyCommunicationNav extends BasePage {

    private final By COMMUNICATIONS_SUB_TAB = By.id("li_nav_communication_setupxxx");

    //Constructor
    public CompanyCommunicationNav(WebDriver driver) { super(driver); }

    //Methods
    public boolean clickCommunicationsSubTab() {
        return clickElement(COMMUNICATIONS_SUB_TAB);
    }

}
