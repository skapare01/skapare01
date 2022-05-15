package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.vendors_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Compliance extends BasePage {

    public Compliance(WebDriver driver) {
        super(driver);
    }

    private final By COMPLIANCE_TAB = By.id("li_sub_nav_compliance_rulesetsxxx");
    private final By ADD_ENTRATA_COMPLIANCE_RULE_SET = By.cssSelector("a[onclick*='Add Compliance Rule Set']");
    private final By ADD_THIRD_PARTY_COMPLIANCE_RULE = By.cssSelector("a[onclick*='Add 3rd Party Compliance Rule']");
    private final By RULE_SET_FORM = By.id("categorization_ruleset");


    public boolean complianceTabClick() {
        return clickElement(COMPLIANCE_TAB);
    }

    public boolean addEntrataRuleSetButtonClick() {
        return clickElement(ADD_ENTRATA_COMPLIANCE_RULE_SET);
    }

    public boolean addThirdPartyRuleSetButtonClick() {
        return clickElement(ADD_THIRD_PARTY_COMPLIANCE_RULE);
    }

    public boolean ruleSetFormVisible() {
        return confirmElementIsVisible(RULE_SET_FORM);
    }
}
