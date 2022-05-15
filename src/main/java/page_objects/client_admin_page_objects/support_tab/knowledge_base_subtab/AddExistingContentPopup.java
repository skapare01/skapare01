package page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddExistingContentPopup extends BasePage {
    public AddExistingContentPopup(WebDriver driver){
        super(driver); }
    private final By FIRST_CHECKBOX_ADD_EXISTING_CONTACT = By.cssSelector("input[name = 'help_resource_association[ids][]");
    private final By ADD_TO_COURSE = By.cssSelector("input[value = 'Add to Course']");

    public boolean clickFirstCheckBoxOfAddExistingContact(){return clickElement(FIRST_CHECKBOX_ADD_EXISTING_CONTACT);}

    public boolean clickAddToCourse(){return clickElement(ADD_TO_COURSE);}


}
