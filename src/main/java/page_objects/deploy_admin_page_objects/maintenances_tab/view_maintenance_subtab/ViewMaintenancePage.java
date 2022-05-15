package page_objects.deploy_admin_page_objects.maintenances_tab.view_maintenance_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ViewMaintenancePage extends BasePage {
    public ViewMaintenancePage(WebDriver driver) {
        super(driver);
    }

    //8 Sub-tab Locators of View Maintenance Tab:
    private final By HA_MAINTENANCE_SUBTAB = By.linkText("HA Maintenance");
    private final By STANDARD_MAINTENANCE_SUBTAB = By.linkText("Standard Maintenance");
    private final By PAYMENTS_MAINTENANCE_SUBTAB = By.linkText("Payments Maintenance");
    private final By RESIDENT_INSURE_MAINTENANCE_SUBTAB = By.linkText("ResidentInsure Maintenance");
    private final By RAPID_MAINTENANCE_SUBTAB = By.linkText("Rapid Maintenance");
    private final By SHARED_MAINTENANCE_SUBTAB = By.linkText("Shared Maintenance");
    private final By PDF_SERVICE_MAINTENANCE_SUBTAB = By.linkText("PdfService Maintenance");
    private final By PUPPETEER_SERVICE_MAINTENANCE_SUBTAB = By.linkText("PuppeteerService Maintenance");

    //Release Commands Locators:
    private final By FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU = By.cssSelector("a.button.action.menu.margin10-bottom.binded.binded-hover-intent[title='Freeswitch Queue Consumer Stop and Start']");

    //Freeswitch Queue Consumers Drop Down Option Locators:
    private final By STOP_OPTION_FOR_FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU = By.id("freeswitchQueueConsumerStop");
    private final By START_OPTION_FOR_FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU = By.id("freeswitchQueueConsumerStart");

    //Utility Commands Locators:
    private final By ADD_DATABASE_MAINTENANCE_BUTTON = By.id("databse_maintenance");
    private final By ADD_DATABASE_DR_FAILOVER_BUTTON = By.id("database_dr_failover");


    //8 Sub-tab Methods:
    public boolean clickHaMaintenanceSubtab() {
        return clickElement(HA_MAINTENANCE_SUBTAB);
    }

    public boolean clickStandardMaintenanceSubtab() {
        return clickElement(STANDARD_MAINTENANCE_SUBTAB);
    }

    public boolean clickPaymentsMaintenanceSubtab() {
        return clickElement(PAYMENTS_MAINTENANCE_SUBTAB);
    }

    public boolean clickResidentInsureMaintenanceSubtab() {
        return clickElement(RESIDENT_INSURE_MAINTENANCE_SUBTAB);
    }

    public boolean clickRapidMaintenanceSubtab() {
        return clickElement(RAPID_MAINTENANCE_SUBTAB);
    }

    public boolean clickSharedMaintenanceSubtab() {
        return clickElement(SHARED_MAINTENANCE_SUBTAB);
    }

    public boolean clickPdfServiceMaintenanceSubtab() {
        return clickElement(PDF_SERVICE_MAINTENANCE_SUBTAB);
    }

    public boolean clickPuppeteerServiceMaintenanceSubtab() {
        return clickElement(PUPPETEER_SERVICE_MAINTENANCE_SUBTAB);
    }

    //Release Commands Methods:
    public boolean clickFreeswitchQueueConsumersDropDownMenu() {
        return clickElement(FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU);
    }

    //Freeswitch Queue Consumers Drop Down Option Methods:
    public boolean clickStopOptionFromFreeswitchQueueConsumersDropDownMenu() {
        return clickElement(STOP_OPTION_FOR_FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU);
    }

    public boolean clickStartOptionFromFreeswitchQueueConsumersDropDownMenu() {
        return clickElement(START_OPTION_FOR_FREESWITCH_QUEUE_CONSUMERS_DROP_DOWN_MENU);
    }

    //Utility Commands Methods:
    public boolean clickAddDatabaseMaintenanceButton() {
        return clickElement(ADD_DATABASE_MAINTENANCE_BUTTON);
    }

    public boolean clickAddDatabaseDR_FailoverButton() {
        return clickElement(ADD_DATABASE_DR_FAILOVER_BUTTON);
    }
}
