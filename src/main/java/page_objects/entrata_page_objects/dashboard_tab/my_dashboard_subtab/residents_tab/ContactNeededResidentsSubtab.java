package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactNeededResidentsSubtab extends BasePage {
    public ContactNeededResidentsSubtab(WebDriver driver) { super(driver); }

    //Contact Needed Dashboard Entries Selectors
    private final By FIRST_CONTACT_NEEDED_ENTRY_CONTACT_DROPDOWN = By.xpath("//div[text()='\n" +
            "Contact']");

    //Contact Options Selectors
    private final By SEND_AN_EMAIL_WHATS_NEXT_OPTION = By.id("follow_up");
    private final By ENTER_AN_OUTGOING_CALL_WHATS_NEXT_OPTION = By.id("call_outgoing");
    private final By RESIDENT_VISIT_WHATS_NEXT_OPTION = By.id("resident_visit");
    private final By ENTER_AN_INCOMING_CALL_WHATS_NEXT_OPTION = By.id("incoming_call");
    private final By ENTER_AN_INCOMING_EMAIL_WHATS_NEXT_OPTION = By.id("incoming_email");
    private final By ENTER_AN_INCOMING_TEXT_WHATS_NEXT_OPTION = By.id("incoming_text");
    private final By ENTER_AN_OUTGOING_TEXT_WHATS_NEXT_OPTION = By.id("outgoing_text");
    //Close Button Selectors
    private final By CLOSE_BUTTON_FROM_CURTAIN = By.cssSelector("i[class='close-button close']");
    private final By CLOSE_BUTTON_FROM_POPUP = By.cssSelector("button[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-dialog-titlebar-close']");
    //Overlay Selector
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Contact Needed Dashboard Entries Selectors
    public boolean clickContactDropdownFirstEntry() {waitForPotentialOverlayContactDropdown(); return clickElement(FIRST_CONTACT_NEEDED_ENTRY_CONTACT_DROPDOWN);}
    //Contact Options Click Methods
    public boolean clickSendAnEmailWhatsNextOption() {return clickElement(SEND_AN_EMAIL_WHATS_NEXT_OPTION);}
    public boolean clickEnterAnOutgoingCallWhatsNextOption() {return clickElement(ENTER_AN_OUTGOING_CALL_WHATS_NEXT_OPTION);}
    public boolean clickResidentVisitWhatsNextOption() {return clickElement(RESIDENT_VISIT_WHATS_NEXT_OPTION);}
    public boolean clickEnterAnIncomingCallWhatsNextOption() {return clickElement(ENTER_AN_INCOMING_CALL_WHATS_NEXT_OPTION);}
    public boolean clickEnterAnIncomingEmailWhatsNextOption() {return clickElement(ENTER_AN_INCOMING_EMAIL_WHATS_NEXT_OPTION);}
    public boolean clickEnterAnIncomingTextWhatsNextOption() {return clickElement(ENTER_AN_INCOMING_TEXT_WHATS_NEXT_OPTION);}
    public boolean clickEnterAnOutgoingTextWhatsNextOption() {return clickElement(ENTER_AN_OUTGOING_TEXT_WHATS_NEXT_OPTION);}
    //Close Button Method
    public boolean clickCloseButtonFromCurtain() {return clickElement(CLOSE_BUTTON_FROM_CURTAIN);}
    public boolean clickCloseButtonFromPopup() {return clickElement(CLOSE_BUTTON_FROM_POPUP);}
    //Overlay Method
    private void waitForPotentialOverlayContactDropdown() { waitForOverlay(LOADING_OVERLAY);}
}
