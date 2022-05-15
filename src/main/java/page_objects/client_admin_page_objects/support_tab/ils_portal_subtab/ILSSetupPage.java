package page_objects.client_admin_page_objects.support_tab.ils_portal_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ILSSetupPage extends BasePage {

    //Constructor
    public ILSSetupPage(WebDriver driver) {
        super(driver);
    }

    //ILS Setup Tab Locator
    private final By ILS_SETUP_TAB_LOCATOR = By.id("internet_listing_services");
    private final By ILS_SETUP_TAB_SELECTED_LOCATOR = By.cssSelector("li[id='internet_listing_services'][class='selected']");

    //ILS Setup Tab Column Header Locators
    private final By ILS_SETUP_ILS_ID_COLUMN_HEADER = By.xpath("//a[text()='ILS ID']");
    private final By ILS_SETUP_ILS_NAME_COLUMN_HEADER = By.xpath("//a[text()='ILS Name']");
    private final By ILS_SETUP_DIRECTORY_ID_COLUMN_HEADER = By.xpath("//a[text()='Directory Name']");
    private final By ILS_SETUP_SERVICE_RESTRICTIONS_COLUMN_HEADER = By.xpath("//th[text()='Service Restrictions']");
    private final By ILS_SETUP_IS_PUBLISHED_COLUMN_HEADER = By.xpath("//th[text()='Is Published']");
    private final By ILS_SETUP_IS_ENABLED_COLUMN_HEADER = By.xpath("//th[text()='Is Enabled']");
    private final By ILS_SETUP_LAST_UPDATED_COLUMN_HEADER = By.xpath("//th[text()='Last Updated']");

    //Methods
    public boolean navigateToILSSetupTab() {
        return clickElement(ILS_SETUP_TAB_LOCATOR);
    }

    public boolean confirmPageLandedOnILSSetupTab() {
        return confirmElementIsVisible(ILS_SETUP_TAB_SELECTED_LOCATOR);
    }

    //ILS Setup tab Column Header Methods
    public boolean findILSIDColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_ILS_ID_COLUMN_HEADER);
    }

    public boolean findILSNameColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_ILS_NAME_COLUMN_HEADER);
    }

    public boolean findDirectoryIDColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_DIRECTORY_ID_COLUMN_HEADER);
    }

    public boolean findServiceRestrictionsColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_SERVICE_RESTRICTIONS_COLUMN_HEADER);
    }

    public boolean findIsPublishedColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_IS_PUBLISHED_COLUMN_HEADER);
    }

    public boolean findIsEnabledColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_IS_ENABLED_COLUMN_HEADER);
    }

    public boolean findLastUpdatedColumnHeader_ILSSetup() {
        return confirmElementIsVisible(ILS_SETUP_LAST_UPDATED_COLUMN_HEADER);
    }

}
