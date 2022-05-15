package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NewTemplateModal extends BasePage {

    public NewTemplateModal(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CONTINUE_BUTTON = By.linkText("Continue");

    //Ad Title Variables
    private final By AD_TITLE = By.id("ad-title-field");
    private final String CORPORATE_AUTOMATION_TEST_GENERIC_TITLE = "Corporate Ad Creation automation test name to be deleted";

    //Text Content Variables

    //Ad Images Variables

    //Property Association Variables.
    private final By FIRST_PROPERTY_IN_LIST = By.xpath("//i[@class='add']");
    private final By SAVE_TEMPLATE = By.xpath("//a[@class='button small green margin10-right js-save-template']");

    //Methods
    public boolean clickContinueButton() {
        return clickElement(CONTINUE_BUTTON);
    }

    //Ad Title Methods
    public boolean enterCorporateTemplateGenericTitle() {
        return sendKeysToElement(AD_TITLE, CORPORATE_AUTOMATION_TEST_GENERIC_TITLE);
    }

    //Text Content Methods

    //Ad Images Methods

    //Property Association Methods
    public boolean clickFirstPropertyInList() {
        return clickElement(FIRST_PROPERTY_IN_LIST);
    }

    public boolean clickSaveTemplate() {
        return clickElement(SAVE_TEMPLATE);
    }

}