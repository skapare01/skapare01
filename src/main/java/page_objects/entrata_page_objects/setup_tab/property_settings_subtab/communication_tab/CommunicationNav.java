package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CommunicationNav extends BasePage {

    public CommunicationNav(WebDriver driver) {
        super(driver);
    }

    private final By GENERAL_SUBTAB = By.id("property_communication_general_brandingxxx");
    private final By SELECT_CLICK_PROPERTY_COMMUNICATION = (By.id("property_communicationxxx"));
    private final By CONTACT_POINTS = By.id("property_communication_contact_pointsxxx");
//Overlay Method Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
//General Subtab Selector
    public boolean clickGeneralSubtab() {
        return clickElement(GENERAL_SUBTAB);
    }
//Click Property Communication Method with Overlay Method
    public boolean clickPropertyCommunication() { waitForOverlay(LOADING_OVERLAY);
        return clickElement(SELECT_CLICK_PROPERTY_COMMUNICATION, waitTimes.SHORT_WAIT);
    }
    public boolean clickContactPoints(){return clickElement(CONTACT_POINTS);}

}