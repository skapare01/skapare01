package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IncomeLimitsPage extends BasePage {

    public IncomeLimitsPage(WebDriver driver) {
        super(driver);
    }

    //Income Limits locators
    private final By INCOME_LIMITS_METRO = By.xpath("//*[@id=\"tax_credit_hud_metro_area\"]/b/h3");
    private final By INCOME_LIMITS_HUD = By.xpath("//*[@id=\"HUD_hud_income_limits\"]/h4");
    private final By INCOME_LIMITS_HOME = By.xpath("//*[@id=\"subsidy_home_income_limit\"]/h4");
    private final By INCOME_LIMITS_FEDERAL = By.xpath("//*[@id=\"tax_credit_income_limits\"]/b[1]/h4");
    private final By INCOME_LIMITS_CUSTOM = By.xpath("//*[@id=\"tax_credit_income_limits\"]/b[2]/h4");
    private final By EDIT_METRO_AREA = By.id("tax_credit_hud_metro_area_details-button");
    private final By METRO_AREA_DROPDOWN = By.cssSelector("select[id='INCOME_LIMIT_HUD_METRO_AREA']");
    private final By FEDERAL_RADIO_BUTTON = By.cssSelector("input[value='federal']");
    private final By CUSTOM_RADIO_BUTTON = By.cssSelector("input[value='custom']");
    private final By CANCEL = By.cssSelector("a[class='js-group-cancel']");
    private final By SAVE_BUTTON = By.cssSelector("input[type='submit']");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");

    //Confirm Income Limits methods
    public String confirmIncomeLimitsMetro() {
        return getElementText(INCOME_LIMITS_METRO);
    }

    public String confirmIncomeLimitsHud() {
        return getElementText(INCOME_LIMITS_HUD);
    }

    public String confirmIncomeLimitsHome() {
        return getElementText(INCOME_LIMITS_HOME);
    }

    public String confirmIncomeLimitsFederal() {
        return getElementText(INCOME_LIMITS_FEDERAL);
    }

    public String confirmIncomeLimitsCustom() {
        return getElementText(INCOME_LIMITS_CUSTOM);
    }

    public boolean confirmCancelExists() {
        return confirmElementIsVisible(CANCEL);
    }

    public boolean clickEditMetroAreaButton() {
        return clickElement(EDIT_METRO_AREA);
    }

    public boolean confirmFederalRadioButtonExists() {
        return confirmElementIsVisible(FEDERAL_RADIO_BUTTON);
    }

    public boolean confirmCustomRadionButtonExists() {
        return confirmElementIsVisible(CUSTOM_RADIO_BUTTON);
    }

    public boolean selectMetroAreaByValueDropdown(String value) {
        return selectElementByValue(METRO_AREA_DROPDOWN, value);
    }

    public boolean clickSaveButton() {
        return clickElement(SAVE_BUTTON);
    }

    public boolean confirmSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }


}
