package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AffordableNavTabs extends BasePage {

    public AffordableNavTabs(WebDriver driver) {
        super(driver);
    }

    //PROPERTY: Affordable specific tabs
    private final By PROPERTY_HUD_TAB = By.id("property_affordable_hudxxx");
    private final By PROPERTY_TAX_CREDIT_TAB = By.id("property_affordable_tax_creditsxxx");
    private final By PROPERTY_HOME_TAB = By.id("property_affordable_homexxx");
    private final By PROPERTY_INCOME_LIMITS_TAB = By.id("property_affordable_income_limitsxxx");

    //PROPERTY: methods
    public String confirmHudTab() {
        return getElementText(PROPERTY_HUD_TAB);
    }

    public String confirmTaxCreditTab() {
        return getElementText(PROPERTY_TAX_CREDIT_TAB);
    }

    public String confirmHomeTab() {
        return getElementText(PROPERTY_HOME_TAB);
    }

    public String confirmIncomeLimitsTab() {
        return getElementText(PROPERTY_INCOME_LIMITS_TAB);
    }

    public boolean clickPropertyHudTab() {
        return clickElement(PROPERTY_HUD_TAB);
    }

    public boolean clickPropertyTaxCreditTab() {
        return clickElement(PROPERTY_TAX_CREDIT_TAB);
    }

    public boolean clickPropertyHomeTab() {
        return clickElement(PROPERTY_HOME_TAB);
    }

    public boolean clickPropertyIncomeLimitsTab() {
        return clickElement(PROPERTY_INCOME_LIMITS_TAB);
    }

}
