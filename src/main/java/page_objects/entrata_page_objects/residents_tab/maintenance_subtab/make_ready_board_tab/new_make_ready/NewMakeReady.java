package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.new_make_ready;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_objects.BasePage;

public class NewMakeReady extends BasePage {

    private final By PROPERTY_DROP_DOWN = By.cssSelector("dt[class='req align-left width100']");
    private final By CREATED_ON = By.cssSelector("label[class='req align-left width100']");
    private final By TEMPLATE = By.id("maintenance_template");
    private final By WORK_ORDER_FOR = By.xpath("//*[contains(text(),'Work Order For')]");
    private final By RESIDENT_OR_UNIT = By.id("wo-unit-details");
    private final By PERMISSION_TO_ENTER = By.id("entry-permission");
    private final By ENTRY_NOTES = By.id("entry-notes");
    private final By ALARM_OR_ENTRY_CODE = By.id("alarm_code");
    private final By NEW_MAKE_READY_CLOSE_BUTTON = By.cssSelector("i[onclick*='psi.patterns.closeLargeDialog();']");
    private final By NEW_MAKE_READY_MODAL = By.id("add_edit_maintenance_request");
    private final By NEW_MAKE_READY_OVERLAY = By.xpath("/html/body/div[8]");
    private final By NEW_MAKE_READY_LOFTS_AT_LORIEN_PROPERTY = By.cssSelector("li[id='58021']");
    private final By PROPERTY_DROP_DOWN_BUTTON = By.xpath("//*[@id=\"add_edit_maintenance_request\"]/div[1]/div[1]/div/fieldset/div[2]/div[1]/dl/dd/div/i");
    // super long xpath but that's the only one I could find to work for this drop down.

    public NewMakeReady(WebDriver driver){ super(driver); }

    public boolean waitForNewMakeReadyOverlay() { waitForOverlay(NEW_MAKE_READY_OVERLAY);
        return confirmElementIsVisible(NEW_MAKE_READY_MODAL);}

    public boolean clickPropertyDropDownButton() { return clickElement(PROPERTY_DROP_DOWN_BUTTON); }

    public boolean clickLoftsAtLorienDropDownInNewMakeReadyPopUp() { return clickElement(NEW_MAKE_READY_LOFTS_AT_LORIEN_PROPERTY, waitTimes.LONG_WAIT); }

    public boolean clickNewMakeReadyCloseButton() { return clickElement(NEW_MAKE_READY_CLOSE_BUTTON); }

    public String confirmPropertyDropDownVisible() { return getElementText(PROPERTY_DROP_DOWN); }

    public String confirmCreatedOnVisible() { return getElementText(CREATED_ON); }

    public String confirmWorkOrderForVisible() { return getElementText(WORK_ORDER_FOR); }

    public boolean confirmTemplateVisible() { return confirmElementIsVisible(TEMPLATE); }

    public boolean confirmResidentOrUnitVisible() { return confirmElementIsVisible(RESIDENT_OR_UNIT); }

    public boolean confirmPermissionToEnterVisible() { return confirmElementIsVisible(PERMISSION_TO_ENTER); }

    public boolean confirmEntryNotesVisible() { return confirmElementIsVisible(ENTRY_NOTES); }

    public boolean confirmAlarmOrEntryCodeVisible() { return confirmElementIsVisible(ALARM_OR_ENTRY_CODE); }

}
