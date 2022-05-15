package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.lease_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SummaryPage extends BasePage {
    public SummaryPage(WebDriver driver){
        super(driver);}
    private final By EDIT_LEASE_INFO = By.cssSelector("a[onclick*= 'edit_lease']");
    private final By EDIT_MOVE_IN_DATE = By.cssSelector("a[onclick*= 'edit_move_in_date']");
    private final By EDIT_SPACE_OPTION = By.cssSelector("a[onclick*= 'edit_lease_unit_spaces']");

    // revise move-in date popup
    private final By REVISE_MOVE_IN_DATE_FIELD = By.id("revise_move_in_date_month");
    private final By CLOSE_REVISE_MOVE_IN = By.cssSelector(".ui-dialog-titlebar-close");

    //update space option popup
    private final By SELECT_SPACES_TITLE = By.xpath("//*[contains(text(), 'Select space(s) to disassociate/associate to lease')]");

    public boolean clickEditLeaseInfo(){return clickElement(EDIT_LEASE_INFO);}
    public boolean clickEditMoveinDate(){return clickElement(EDIT_MOVE_IN_DATE);}
    public boolean confirmReviseMoveinDateOpens(){return confirmElementIsVisible(REVISE_MOVE_IN_DATE_FIELD);}
    public boolean clickCloseReviseMoveIN(){return clickElement(CLOSE_REVISE_MOVE_IN);}
    public boolean clickEditSpaceOption(){return clickElement(EDIT_SPACE_OPTION);}
    //checks to makes sure title is present, representing that the page opens
    public boolean confirmUpdateSpaceOptionOpens(){return confirmElementIsVisible(SELECT_SPACES_TITLE);}

}
