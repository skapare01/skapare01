package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.contact_points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactPointsSettingsRenewalsAndModifications extends BasePage {
    private final By CLICK_CONTACT_POINTS_SETTINGS_RENEWALS_AND_MODIFICATIONS = (By.id("property_communication_contact_points_renewals_and_lease_modificationsxxx"));
    private final By RENEWAL_LEASE_START_CONTACT_POINT = By.xpath("//td[text()='Renewal Lease Start  ']");

    // Edit/Create/Save/Close Contact Point Email Selectors
    private final By SEND_AN_AUTOMATED_EMAIL_CHECKBOX = By.id("automated_email");
    private final By EDIT_EMAIL_BUTTON = By.id("edit-scheduled-task-email");

    private final By CLOSE_FROM_CP_SETUP_BUTTON = By.cssSelector("button[title = 'Close']");


    //Constructor//
    public ContactPointsSettingsRenewalsAndModifications(WebDriver driver) {
        super(driver);
    }


    public boolean contactPointsSettingsRenewalsAndModifications(){ return clickElement(CLICK_CONTACT_POINTS_SETTINGS_RENEWALS_AND_MODIFICATIONS); }
    public boolean clickContactPointLeaseRenewalStart(){ return clickElement(RENEWAL_LEASE_START_CONTACT_POINT); }

    // Edit/Create Contact Point Email Methods
    public boolean closeFromContactPointSetupButton() {return clickElement(CLOSE_FROM_CP_SETUP_BUTTON);}

}

