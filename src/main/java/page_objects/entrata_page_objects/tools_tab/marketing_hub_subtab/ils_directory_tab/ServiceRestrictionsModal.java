package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ServiceRestrictionsModal extends BasePage {

    //Constructor
    public ServiceRestrictionsModal(WebDriver driver) {
        super(driver); }

    //Service Restrictions Modal
    private final By SERVICE_RESTRICTIONS_MODAL_LOCATOR = By.cssSelector("div[aria-describedby='mod']");
    private final By SUPPORTED_FEED_TYPE_LOCATOR = By.cssSelector("span[class='block margin5-top text-green']");
    private final By SERVICE_RESTRICTIONS_ILS_LOGO_LOCATOR = By.className("block");
    private final By SERVICE_RESTRICTIONS_ILS_DETAILS_LOCATOR = By.xpath("//div[contains(text(),'About')]");
    private final By SERVICE_RESTRICTIONS_OCCUPANT_TYPES_LOCATOR = By.xpath("//div[contains(text(),'Supported Occupant Types')]");
    private final By SERVICE_RESTRICTIONS_DETAILS_LOCATOR = By.xpath("//div[(text()='Restrictions')]");
    private final By CLOSE_SERVICE_RESTRICTIONS_MODAL_LOCATOR = By.cssSelector("span[class='ui-button-icon-primary ui-icon ui-icon-closethick']");

    //Methods
    public boolean confirmServiceRestrictionsModalIsOpen() {
        return confirmElementIsVisible(SERVICE_RESTRICTIONS_MODAL_LOCATOR);
    }

    public boolean findSupportedFeedType_SRModal() {
        return confirmElementIsVisible(SUPPORTED_FEED_TYPE_LOCATOR);
    }

    public boolean findILSLogo_SRModal() {
        return confirmElementIsVisible(SERVICE_RESTRICTIONS_ILS_LOGO_LOCATOR);
    }

    public boolean findILSDetails_SRModal() {
        return confirmElementIsVisible(SERVICE_RESTRICTIONS_ILS_DETAILS_LOCATOR);
    }

    public boolean findSupportedOccupantTypes_SRModal() {
        return confirmElementIsVisible(SERVICE_RESTRICTIONS_OCCUPANT_TYPES_LOCATOR);
    }

    public boolean findRestrictionsDetails_SRModal() {
        return confirmElementIsVisible(SERVICE_RESTRICTIONS_DETAILS_LOCATOR);
    }

    public boolean selectCloseButton_SRModal() {
        return clickElement(CLOSE_SERVICE_RESTRICTIONS_MODAL_LOCATOR);
    }

}
