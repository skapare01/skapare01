package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactPointsSettingsResidents extends BasePage {

private final By SELECT_CONTACT_POINTS_SETTINGS_RESIDENTS = (By.id("property_communication_contact_points_residentsxxx"));

    private final By LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS_RESIDENTS = (By.xpath("//td[contains(text(),'Status Changes')]"));
    private final By LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS_RESIDENTS = (By.xpath("//td[contains(text(),'Appointments')]"));
    private final By LOCATE_INCOMING_CONTACT_POINTS_EVENTS_RESIDENTS = (By.xpath("//td[contains(text(),'Incoming Contact')]"));
    private final By LOCATE_RESIDENT_PORTAL_POINTS_EVENTS_RESIDENTS = (By.xpath("//td[contains(text(),'Resident Portal')]"));
    private final By LOCATE_OTHER_CONTACT_POINTS_EVENTS_RESIDENTS = (By.xpath("//td[contains(text(),'Other')]"));

    public ContactPointsSettingsResidents(WebDriver driver) { super(driver); }


    public boolean contactPointsSettingsResidents() {
    return clickElement(SELECT_CONTACT_POINTS_SETTINGS_RESIDENTS);
    }

    public boolean locateStatusChangesContactPointsEventsResidents(){ return confirmElementIsVisible(LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS_RESIDENTS); }
    public boolean locateAppointmentsContactPointsEventsResidents(){ return confirmElementIsVisible(LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS_RESIDENTS); }
    public boolean locateIncomingContactContactPointsEventsResidents(){ return confirmElementIsVisible(LOCATE_INCOMING_CONTACT_POINTS_EVENTS_RESIDENTS); }
    public boolean locateResidentPortalContactPointsEventsResidents(){ return confirmElementIsVisible(LOCATE_RESIDENT_PORTAL_POINTS_EVENTS_RESIDENTS); }
    public boolean locateOtherContactPointsEventsResidents(){ return confirmElementIsVisible(LOCATE_OTHER_CONTACT_POINTS_EVENTS_RESIDENTS); }
}


