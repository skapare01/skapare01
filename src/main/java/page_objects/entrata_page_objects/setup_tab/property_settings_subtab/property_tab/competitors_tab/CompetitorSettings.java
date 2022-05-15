package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompetitorSettings extends BasePage {

    private final By COMPETITOR_SETTINGS_OVERLAY = By.cssSelector(".loading-overlay");
    private final By COMPETITORS_SELECTED_COMPETITORS = By.cssSelector(".valign-middle.text-707070.font12.align-left");
    private final By COMPETITORS_COMPETITOR_LIST = By.cssSelector(".margin5-top.left.competitor_list_label");
    private final By ADD_COMPETITOR_BUTTON = By.cssSelector(".test.button.action.add_competitor.width-auto i.add");
    private final By COMPETITOR_NAME_FIELD = By.id("property_competitors[property_name]");
    private final By COMPETITOR_ADDRESS_FIELD = By.id("property_competitors[street_line1]");
    private final By COMPETITOR_CITY_FIELD = By.id("property_competitors[city]");
    private final By COMPETITOR_STATE_DROPDOWN = By.id("property_competitors[state]");
    private final By COMPETITOR_ZIP_CODE_FIELD = By.id("property_competitors[postal_code]");
    private final By ADD_COMPETITOR_SAVE_BUTTON = By.cssSelector(".form-submit");
    private final By COMPETITOR_SAVED_MESSAGE = By.xpath("//*[contains(text(), 'Competitor data added Successfully.')]");

    public CompetitorSettings(WebDriver driver) {
        super(driver);
    }

    private void competitorSettingsOverlay() { waitForOverlay(COMPETITOR_SETTINGS_OVERLAY); }

    private void maximizeCompetitorScreen() { maximizeWindow(); }

    public boolean waitForOverlayAndFindSelectedCompetitors() {
        competitorSettingsOverlay();
        return confirmElementIsVisible(COMPETITORS_SELECTED_COMPETITORS);
    }

    public boolean waitForOverlayAndFindCompetitorList() {
        competitorSettingsOverlay();
        return confirmElementIsVisible(COMPETITORS_COMPETITOR_LIST, waitTimes.LONG_WAIT); }

    public boolean clickAddCompetitor() {
        maximizeCompetitorScreen();
        competitorSettingsOverlay();
        return doubleClickElement(ADD_COMPETITOR_BUTTON);
    }

    public boolean addCompetitorName(String name) { return sendKeysToElement(COMPETITOR_NAME_FIELD, name, waitTimes.LONG_WAIT); }

    public boolean addCompetitorAddress(String address) { return sendKeysToElement(COMPETITOR_ADDRESS_FIELD, address, waitTimes.LONG_WAIT); }

    public boolean addCompetitorCity(String city) { return sendKeysToElement(COMPETITOR_CITY_FIELD, city, waitTimes.LONG_WAIT); }

    public boolean selectCompetitorState(String state) {
        return selectElementByValue(COMPETITOR_STATE_DROPDOWN, state);
    }

    public boolean addCompetitorZipCode(String zip) { return sendKeysToElement(COMPETITOR_ZIP_CODE_FIELD, zip, waitTimes.LONG_WAIT); }

    public boolean clickAddCompetitorSaveButton() { return clickElement(ADD_COMPETITOR_SAVE_BUTTON); }

    public boolean findAddCompetitorSaveMessage() { return confirmElementIsVisible(COMPETITOR_SAVED_MESSAGE, waitTimes.LONG_WAIT); }

}
