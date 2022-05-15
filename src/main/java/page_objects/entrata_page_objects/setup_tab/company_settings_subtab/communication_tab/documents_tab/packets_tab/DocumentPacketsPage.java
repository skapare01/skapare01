package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab.packets_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DocumentPacketsPage extends BasePage {

    private final By ADD_PACKET_BUTTON = By.cssSelector(".button.action.first.js-add-packet");
    private final By PACKET_NAME_FIELD = By.name("document_packet[name]");
    private final By PACKET_TYPE_DROPDOWN = By.cssSelector(".form-select.js-packettype-select");
    private final By LEASE_IN_PACKET_DROPDOWN = By.xpath("//select//option[text()='Lease']");
    private final By TRANSFER_CHECKBOX = By.id("lease_interval_type_id_5");
    private final By NEW_LEASE_CHECKBOX = By.id("lease_interval_type_id_1");
    private final By RENEWAL_CHECKBOX = By.id("lease_interval_type_id_3");
    private final By ACTIVE_YES_SLIDER = By.cssSelector("div.switch-button.slim.js-toggle-active.on");
    private final By ALWAYS_ACTIVE = By.className("link");
    private final By ADD_PROPERTIES = By.id("addbutton");
    private final By ADD_ALL_PROPERTIES = By.cssSelector("span.header.property-group-record.js-all-properties.binded.binded2 i.add");
    private final By PACKET_SAVE_BUTTON = By.id("addbtn_document_packet_frm");
    private final By PACKET_SAVED_MESSAGE = By.xpath("//*[contains(text(), 'Document packets added successfully')]");

    public DocumentPacketsPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickAddPacketButton() {
        return clickElement(ADD_PACKET_BUTTON);
    }

    public boolean addPacketName(String name) {
        return sendKeysToElement(PACKET_NAME_FIELD, name);
    }

    public boolean clickPacketTypeDropdown() {
        return clickElement(PACKET_TYPE_DROPDOWN);
    }

    public boolean clickLeaseInPacketDropdown() {
        return clickElement(LEASE_IN_PACKET_DROPDOWN);
    }

    public boolean clickTransferCheckbox() {
        return clickElement(TRANSFER_CHECKBOX);
    }

    public boolean clickNewLeaseCheckbox() {
        return clickElement(NEW_LEASE_CHECKBOX);
    }

    public boolean clickRenewalCheckbox() {
        return clickElement(RENEWAL_CHECKBOX);
    }

    public boolean findActiveSliderYes() {
        return confirmElementIsVisible(ACTIVE_YES_SLIDER);
    }

    public boolean clickAlwaysActive() {
        return clickElement(ALWAYS_ACTIVE);
    }

    public boolean clickAddProperties() {
        return clickElement(ADD_PROPERTIES);
    }

    public boolean clickAddAllProperties() {
        return clickElement(ADD_ALL_PROPERTIES);
    }

    public boolean clickPacketSaveButton() {
        return clickElement(PACKET_SAVE_BUTTON);
    }

    public boolean findPacketSavedMessage() {
        return confirmElementIsVisible(PACKET_SAVED_MESSAGE);
    }

}

