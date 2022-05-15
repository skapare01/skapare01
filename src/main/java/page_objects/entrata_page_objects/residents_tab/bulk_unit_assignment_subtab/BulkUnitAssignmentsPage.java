package page_objects.entrata_page_objects.residents_tab.bulk_unit_assignment_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkUnitAssignmentsPage extends BasePage {

    public BulkUnitAssignmentsPage(WebDriver driver){
        super(driver);
    }

    private final By BULK_UNIT_ASSIGNMENT_TAB = By.linkText("Bulk Unit Assignments");
    private final By UNIT_MIX_MODULE = By.id("unit_mix");
    private final By SEND_MESSAGING = By.linkText("Send Messaging");
    private final By SEND_NOTIFICATIONS = By.cssSelector(".send-notifications");
    private final By APPLICATION_STATUS_DROPDOWN = By.id("application_stage_status_id");

    //*[@id="sub-navigation"]/ul/li[2]/a


    public boolean clickBulkUnitAssignment(){return clickElement(BULK_UNIT_ASSIGNMENT_TAB);}
    public boolean verifyVisibilityOfUnitMix(){return confirmElementIsVisible(UNIT_MIX_MODULE);}
    public boolean clickSendMessaging(){return clickElement(SEND_MESSAGING);}
    public boolean clickSendNotifications(){return clickElement(SEND_NOTIFICATIONS);}
    public boolean confirmVisiblityOfStatusDropdown(){return clickElement(APPLICATION_STATUS_DROPDOWN);}


}
