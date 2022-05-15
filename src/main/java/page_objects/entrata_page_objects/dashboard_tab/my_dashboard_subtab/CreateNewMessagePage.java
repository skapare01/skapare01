package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CreateNewMessagePage extends BasePage {
    public CreateNewMessagePage(WebDriver driver){
        super(driver);}

    private final By CREATE_MESSAGE_MESSAGE_TITLE = By.cssSelector("textarea[name = 'notification[description]']");

    public boolean findMessageTitleField(){return confirmElementIsVisible(CREATE_MESSAGE_MESSAGE_TITLE);}
}
