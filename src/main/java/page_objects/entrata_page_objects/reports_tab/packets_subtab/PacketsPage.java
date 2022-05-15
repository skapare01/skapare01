package page_objects.entrata_page_objects.reports_tab.packets_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;
import utils.RandomGenerator;

public class PacketsPage extends ReportsBasePage {
    //Locators:
    private final By ADD_PACKETS_BUTTON_LOCATOR = By.cssSelector("a[class='button action js-add-edit-packet right']");
    private final By PERMISSIONS_RADIO_BUTTON_LOCATOR = By.cssSelector("input[value='3927']");
    private final By NAME_TEXT_FIELD_LOCATOR = By.name("report_packet[name]");
    private final By CANCEL_LINK_LOCATOR = By.cssSelector("a[class='js-form-dialog-cancel']");
    private final By REPORT_INSTANCE_NAME_LOCATOR = By.cssSelector("input[class='form-search-field ui-autocomplete-input']");
    private final By GREEN_SAVE_PACKET_BUTTON_LOCATOR = By.cssSelector("input[value='Save Packet']");
    private final By REPORT_PACKET_WAS_ADDED_SUCCESSFULLY_LOCATOR = By.cssSelector("p[class='alert success slim']");

    //Constructor method:
    public PacketsPage(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean clickAddPacketsButton() {
        return clickElement(ADD_PACKETS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickPermissionsRadioButton() {
        return clickElement(PERMISSIONS_RADIO_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForPacketName() {
        RandomGenerator rg = new RandomGenerator();
        return sendKeysToElement(NAME_TEXT_FIELD_LOCATOR, rg.randomName(), waitTimes.LONG_WAIT);
    }

    public boolean scrollToCancelLink() {
        return moveToAnElementWithActions(CANCEL_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectReportInstanceFromMenu() {
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        return pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean enterSelectedReportInstanceNameInMenu() {
        return pressEnter(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickSavePacketButton() {
        return clickElement(GREEN_SAVE_PACKET_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmReportPacketWasSavedSuccessfullyTextAppeared() {
        return clickElement(REPORT_PACKET_WAS_ADDED_SUCCESSFULLY_LOCATOR, waitTimes.LONG_WAIT);
    }
}
