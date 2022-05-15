package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MessageCenterCompanySettings extends BasePage {

    private final By MESSAGE_CENTER_COMPANY_SETTINGS = By.id("li_nav_message_center_setupxxx");
    private final By LOCATE_AMBIANCE_LAYOUT = By.xpath("//dt[text()='Ambiance:']");
    private final By LOCATE_ANNOUNCEMENT_LAYOUT = By.xpath("//dt[text()='Announcement:']");
    private final By LOCATE_BASIC_LAYOUT = By.xpath("//dt[text()='Basic:']");
    private final By LOCATE_BULLETIN_LAYOUT = By.xpath("//dt[text()='Bulletin:']");
    private final By LOCATE_CUSTOM_LAYOUT = By.xpath("//dt[text()='Custom:']");
    private final By LOCATE_DETAILS_LAYOUT = By.xpath("//dt[text()='Details:']");
    private final By LOCATE_FOCUS_LAYOUT = By.xpath("//dt[text()='Focus:']");
    private final By LOCATE_HIGHLIGHTS_LAYOUT = By.xpath("//dt[text()='Highlights:']");
    private final By LOCATE_INFORMATIONAL_LAYOUT = By.xpath("//dt[text()='Informational:']");
    private final By LOCATE_POSTER_LAYOUT = By.xpath("//dt[text()='Poster:']");
//Constructor//
    public MessageCenterCompanySettings(WebDriver driver) { super(driver); }

    public boolean clickMessageCenterCompanySettings(){return clickElement(MESSAGE_CENTER_COMPANY_SETTINGS, waitTimes.SHORT_WAIT);}

    public boolean locateAmbianceMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_AMBIANCE_LAYOUT);}
    public boolean locateAnnouncementMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_ANNOUNCEMENT_LAYOUT);}
    public boolean locateBasicMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_BASIC_LAYOUT);}
    public boolean locateBulletinMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_BULLETIN_LAYOUT);}
    public boolean locateCustomMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_CUSTOM_LAYOUT);}
    public boolean locateDetailsMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_DETAILS_LAYOUT);}
    public boolean locateFocusMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_FOCUS_LAYOUT);}
    public boolean locateHighlightsMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_HIGHLIGHTS_LAYOUT);}
    public boolean locateInformationalMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_INFORMATIONAL_LAYOUT);}
    public boolean locatePosterMessageCenterLayoutCompanySettings(){return confirmElementIsVisible(LOCATE_POSTER_LAYOUT);}


}
