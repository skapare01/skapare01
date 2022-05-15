package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.privacy_management_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DataPrivacyRequestPage extends BasePage {
    public DataPrivacyRequestPage (WebDriver driver){
        super(driver);}

    private final By FIRST_NAME_FIELD = By.cssSelector("input[name = 'find_customers[name_first]']");
    private final By LAST_NAME_FIELD = By.cssSelector("input[name = 'find_customers[name_last]']");
    private final By FIND_BUTTON = By.cssSelector(".js-find-customers");
    private final By CREATE_REQUEST = By.cssSelector(".js-show-confirmation-dialog");

    public boolean enterFirstName(String name){return sendKeysToElement(FIRST_NAME_FIELD,name);}
    public boolean enterLastName(String name){return sendKeysToElement(LAST_NAME_FIELD,name);}
    public boolean clickFindButton(){return clickElement(FIND_BUTTON);}
    public boolean findCreateRequest(){return confirmElementIsVisible(CREATE_REQUEST);}
}
