package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChatAndEmailServices extends BasePage {

    private final By SELECT_CHAT_AND_EMAIL_SERVICES_TAB = By.id("li_nav_smtp_credentialsxxx");
//Constructor//
    public ChatAndEmailServices(WebDriver driver) { super(driver); }

    public boolean clickChatAndEmailServicesTab() { return clickElement(SELECT_CHAT_AND_EMAIL_SERVICES_TAB, waitTimes.SHORT_WAIT); }
}