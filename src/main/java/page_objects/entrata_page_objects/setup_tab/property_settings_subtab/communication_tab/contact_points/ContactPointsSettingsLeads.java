package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactPointsSettingsLeads extends BasePage {


    private final By SELECT_CONTACT_POINTS_SETTINGS_LEADS = (By.id("property_communication_contact_pointsxxx"));
    private final By SELECT_LOCATE_EDIT_GC_COMPLETED_FROM_ENTRATA_SITE_TABLET =
            (By.cssSelector("tr[data-title='Guest Card Completed - from Entrata/Site Tablet']"));

    private final By LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS = (By.xpath("//td[contains(text(),'Status Changes')]"));
    private final By LOCATE_QUOTES_CONTACT_POINTS_EVENTS = (By.xpath("//td[contains(text(),'Quotes')]"));
    private final By LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS = (By.xpath("//td[contains(text(),'Appointments')]"));
    private final By LOCATE_INCOMING_CONTACT_CONTACT_POINTS_EVENTS = (By.xpath("//td[contains(text(),'Incoming Contact')]"));
    private final By LOCATE_OTHER_CONTACT_POINTS_EVENTS = (By.xpath("//td[contains(text(),'Other')]"));

    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

//Constructor//
    public ContactPointsSettingsLeads(WebDriver driver) { super(driver); }


    public boolean contactPointsSettingsLeads() {waitForPotentialOverlay(); return clickElement(SELECT_CONTACT_POINTS_SETTINGS_LEADS); }

//Locate Contact Point Methods
    public boolean locateEditGuestCardCompletedFromEntrataSiteTablet() { return confirmElementIsVisible(SELECT_LOCATE_EDIT_GC_COMPLETED_FROM_ENTRATA_SITE_TABLET); }
    public boolean locateStatusChangesContactPointsEvents(){ return confirmElementIsVisible(LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS); }
    public boolean locateQuotesContactPointsEvents(){ return confirmElementIsVisible(LOCATE_QUOTES_CONTACT_POINTS_EVENTS); }
    public boolean locateAppointmentsContactPointsEvents(){ return confirmElementIsVisible(LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS); }
    public boolean locateIncomingContactContactPointsEvents(){ return confirmElementIsVisible(LOCATE_INCOMING_CONTACT_CONTACT_POINTS_EVENTS); }
    public boolean locateOtherContactPointsEvents(){ return confirmElementIsVisible(LOCATE_OTHER_CONTACT_POINTS_EVENTS); }



    //Overlay Method
    private void waitForPotentialOverlay() { waitForOverlay(LOADING_OVERLAY);}
}
