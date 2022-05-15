package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ILSRequestLogCurtain extends BasePage {

//Constructor
    public ILSRequestLogCurtain(WebDriver driver) {
        super(driver); }

//ILS Portal Module Tabs
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

//ILS Request Log Curtain Locators
    private final By ILS_REQUEST_LOG_CURTAIN_LOCATOR = By.id("trans-log");
    private final By REQUEST_LOG_COMPANY_NAME_LOCATOR = By.cssSelector("div[class='right align-right']");
    private final By REQUEST_LOG_COMPANY_ID_LOCATOR = By.xpath("//span[contains(text(),'Company ID:')]");
    private final By REQUEST_LOG_RAW_DATA_LOCATOR = By.cssSelector("a[class='right action button download-raw-data']");
    private final By REQUEST_LOG_ILS_LOGO_LOCATOR = By.xpath("//*[@id=\"trans-log\"]/div[2]/img");
    private final By REQUEST_LOG_PROPERTY_FILTER_LOCATOR = By.className("down-arrow");
    private final By REQUEST_LOG_DATE_SELECTOR_FILTER_LOCATOR = By.id("sel_log_date_selector");
    private final By REQUEST_LOG_TIME_SELECTOR_FILTER_LOCATOR = By.id("sel_log_selector");
    private final By REQUEST_LOG_SHOW_CURRENT_DATA_TOGGLE_LOCATOR = By.cssSelector("div[data-patter='switchbutton']");
    private final By REQUEST_LOG_PROPERTY_LOG_DETAILS_LOCATOR = By.id("trans-log-details");
    private final By ILS_REQUEST_LOG_CLOSE_BUTTON_LOCATOR = By.cssSelector("i[class='close-button close']");

    //Conditional Request Log Elements
    private final By REQUEST_LOG_BLUE_CURRENT_DATA_LOCATOR = By.cssSelector("em[class='text-light-blue js-toggle-show-element']");

    //Methods
    public boolean confirmCurtainOpened_RequestLogCurtain() {
        return confirmElementIsVisible(ILS_REQUEST_LOG_CURTAIN_LOCATOR);
    }

    public boolean confirmCompanyNameVisible_RequestLogCurtain() {
        waitForRequestLogOverlay();
        return confirmElementIsVisible(REQUEST_LOG_COMPANY_NAME_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean confirmCompanyIDVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_COMPANY_ID_LOCATOR);
    }

    public boolean confirmRawDataButtonVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_RAW_DATA_LOCATOR);
    }

    public boolean confirmIlsLogoVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_ILS_LOGO_LOCATOR);
    }

    //Request Log Filter Verification Methods
    public boolean confirmPropertyFilterVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_PROPERTY_FILTER_LOCATOR);
    }

    public boolean confirmDateSelectorFilterVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_DATE_SELECTOR_FILTER_LOCATOR);
    }

    public boolean confirmTimeLogSelectorFilterVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_TIME_SELECTOR_FILTER_LOCATOR);
    }

    public boolean confirmShowCurrentDataToggleVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_SHOW_CURRENT_DATA_TOGGLE_LOCATOR);
    }

    public boolean confirmLogDetailsVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_PROPERTY_LOG_DETAILS_LOCATOR);
    }

    public boolean toggleOnShowCurrentData_RequestLogCurtain() {
        return clickElement(REQUEST_LOG_SHOW_CURRENT_DATA_TOGGLE_LOCATOR);
    }

    public boolean confirmBlueCurrentDataVisible_RequestLogCurtain() {
        return confirmElementIsVisible(REQUEST_LOG_BLUE_CURRENT_DATA_LOCATOR);
    }

    public boolean selectCloseButton_RequestLogCurtain() {
        return clickElement(ILS_REQUEST_LOG_CLOSE_BUTTON_LOCATOR);
    }

    //Overlay Methods
    private void waitForRequestLogOverlay() {
        waitForOverlay(LOADING_OVERLAY);
    }

}
