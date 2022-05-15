package page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab.rapid_maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class StopAndStartFreeswitchQueueConsumerRapidWindows extends BasePage {
    public StopAndStartFreeswitchQueueConsumerRapidWindows(WebDriver driver) {
        super(driver);
    }

    //Locators for pop-up windows:
    private final By CLOSE_X_BUTTON = By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-icon-only.ui-dialog-titlebar-close[title='Close']");
    private final By GREEN_YES_BUTTON = By.id("js-add-maintenance");
    private final By BLUE_CANCEL_LINK = By.linkText("Cancel");
    private final By STOP_FREESWITCH_QUEUE_CONSUMER_TEXT_IN_WINDOW = By.xpath("//label[text()='Are you sure want to stop freeswitch queue consumer for Rapid?']");
    private final By START_FREESWITCH_QUEUE_CONSUMER_TEXT_IN_WINDOW = By.xpath("//label[text()='Are you sure want to start freeswitch queue consumer for Rapid?']");


    //Methods to click/confirm pop-up window locators:
    public boolean clickCloseXButton() {
        return clickElement(CLOSE_X_BUTTON);
    }

    public boolean confirmGreenYesButtonIsPresent() {
        return confirmElementIsVisible(GREEN_YES_BUTTON);
    }

    public boolean clickBlueCancelLink() {
        return clickElement(BLUE_CANCEL_LINK);
    }

    public boolean confirmStopFreeswitchQueueConsumerTextIsPresent() {
        return confirmElementIsVisible(STOP_FREESWITCH_QUEUE_CONSUMER_TEXT_IN_WINDOW);
    }

    public boolean confirmStartFreeswitchQueueConsumerTextIsPresent() {
        return confirmElementIsVisible(START_FREESWITCH_QUEUE_CONSUMER_TEXT_IN_WINDOW);
    }
}
