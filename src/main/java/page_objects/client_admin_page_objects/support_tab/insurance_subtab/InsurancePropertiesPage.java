package page_objects.client_admin_page_objects.support_tab.insurance_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InsurancePropertiesPage extends BasePage {

    private final By ADD_BULK_PROPERTIES = By.id("add_bulk_properties");
    private final By SELECT_COMPANY_NAME = By.id("select_client_caption");
    private final By SELECT_PROPERTY_NAME = By.id("select_property_caption");
    private final By SELECT_STATE_NAME = By.id("select_state_caption");
    private final By ZIP_CODE_FIELD = By.id("insurance_carrier_property[postal_code]");
    private final By SEARCH_BUTTON = By.id("search_property");
    private final By NEW_POLICY_BUTTON = By.cssSelector("a[title='New Policy']");

    public InsurancePropertiesPage(WebDriver driver) {
        super(driver);
    }

    public boolean findAddBulkProperties() { return confirmElementIsVisible(ADD_BULK_PROPERTIES); }

    public boolean findSelectCompanyName() { return confirmElementIsVisible(SELECT_COMPANY_NAME); }

    public boolean findSelectPropertyName() { return confirmElementIsVisible(SELECT_PROPERTY_NAME); }

    public boolean findSelectStatName() { return confirmElementIsVisible(SELECT_STATE_NAME); }

    public boolean findZipCodeField() { return confirmElementIsVisible(ZIP_CODE_FIELD); }

    public boolean findSearchButton() { return confirmElementIsVisible(SEARCH_BUTTON); }

    public boolean clickNewPolicyButton() { return clickElement(NEW_POLICY_BUTTON); }

}
