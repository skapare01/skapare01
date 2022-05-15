package page_objects.deploy_admin_page_objects.dashboard_tab.users_and_permissions_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UsersAndPermissionsPage extends BasePage {
    public UsersAndPermissionsPage(WebDriver driver) {
        super(driver);
    }

    private final By SANDEEP_GARUD_USER_ROW_LOCATOR = By.xpath("//td[text()='Sandeep Garud']");
    private final By LOGIN_HISTORY_TAB_FOR_SANDEEP_GARUD = By.xpath("//a[text()='Login History']");
    private final By RECORDS_PER_PAGE_LIST_DROP_DOWN_LOCATOR = By.id("list");
    private final By CLOSE_X_BUTTON_FOR_USER_PROFILE_CURTAIN_PAGE = By.cssSelector("i[class='close-button close']");


    public boolean clickOnSandeepGarudUserRow() { return clickElement(SANDEEP_GARUD_USER_ROW_LOCATOR); }

    public boolean clickOnLoginHistoryTabInSandeepGarudsUserProfile() { return clickElement(LOGIN_HISTORY_TAB_FOR_SANDEEP_GARUD); }

    public boolean confirmRecordsPerPageListDropDownMenuIsVisible() { return confirmElementIsVisible(RECORDS_PER_PAGE_LIST_DROP_DOWN_LOCATOR); }

    public boolean clickCloseXButtonForUserProfileCurtainPage() { return clickElement(CLOSE_X_BUTTON_FOR_USER_PROFILE_CURTAIN_PAGE); }

}
