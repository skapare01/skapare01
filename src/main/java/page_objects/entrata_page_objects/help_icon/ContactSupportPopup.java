package page_objects.entrata_page_objects.help_icon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContactSupportPopup extends BasePage {

    private final By SUBJECT_LINE = By.cssSelector("input[name = 'task[title]']");

    public ContactSupportPopup(WebDriver driver){
        super(driver);
    }

    public boolean findSubjectLine(){return confirmElementIsVisible(SUBJECT_LINE);}
}
