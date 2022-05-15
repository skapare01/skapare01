package page_objects.entrata_page_objects.accounting_tab.owners_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OwnersPage extends BasePage {

    public OwnersPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_OWNER_BUTTON = By.cssSelector("a[onclick*='Add Owner']");
    private final By ADD_OWNER_FORM = By.id("add_Owner");
    private final By OWNER_SELECT = By.cssSelector("tr[class='aRow js-view-owner ']");
    private final By OWNER_PAGE = By.id("owner_main_container");

    public boolean addOwnerButtonClick() {
        return clickElement(ADD_OWNER_BUTTON);
    }

    public boolean ownerSelect() {
        return clickElement(OWNER_SELECT);
    }

    public boolean addOwnerFormVisible() {
        return confirmElementIsVisible(ADD_OWNER_FORM);
    }

    public boolean ownerPageVisible() {
        return confirmElementIsVisible(OWNER_PAGE);
    }
}
