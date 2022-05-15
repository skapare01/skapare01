package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactPointsSettingsApplicants extends BasePage {
    private final By CLICK_CONTACT_POINTS_SETTINGS_APPLICANTS = (By.id("property_communication_contact_points_applicantsxxx"));

    private final By LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS_APPLICANTS = (By.xpath("//td[contains(text(),'Status Changes')]"));
    private final By LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS_APPLICANTS = (By.xpath("//td[contains(text(),'Appointments')]"));
    private final By LOCATE_INCOMING_CONTACT_POINTS_EVENTS_APPLICANTS = (By.xpath("//td[contains(text(),'Incoming Contact')]"));
    private final By LOCATE_OTHER_CONTACT_POINTS_EVENTS_APPLICANTS = (By.xpath("//td[contains(text(),'Other')]"));

    public ContactPointsSettingsApplicants(WebDriver driver) {
        super(driver);
    }


    public boolean contactPointsSettingsApplicants(){ return  clickElement(CLICK_CONTACT_POINTS_SETTINGS_APPLICANTS); }

    public boolean locateStatusChangesContactPointsEventsApplicants(){ return confirmElementIsVisible(LOCATE_STATUS_CHANGES_CONTACT_POINTS_EVENTS_APPLICANTS); }
    public boolean locateAppointmentsContactPointsEventsApplicants(){ return confirmElementIsVisible(LOCATE_APPOINTMENTS_CONTACT_POINTS_EVENTS_APPLICANTS); }
    public boolean locateIncomingContactContactPointsEventsApplicants(){ return confirmElementIsVisible(LOCATE_INCOMING_CONTACT_POINTS_EVENTS_APPLICANTS); }
    public boolean locateOtherContactPointsEventsApplicants(){ return confirmElementIsVisible(LOCATE_OTHER_CONTACT_POINTS_EVENTS_APPLICANTS); }

}

