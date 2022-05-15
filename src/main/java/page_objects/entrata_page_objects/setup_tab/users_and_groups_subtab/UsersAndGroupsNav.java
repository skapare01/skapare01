package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UsersAndGroupsNav extends BasePage {
    public UsersAndGroupsNav(WebDriver driver) {
        super(driver);
    }

    private final By USERS_TAB = By.id("users_tab");
    private final By GROUPS_TAB = By.id("groups_tab");
    private final By ADD_USERS_BUTTON = By.cssSelector("a.add_company_users_info");
    private final By FILTER_BUTTON = By.id("open-filter-by-default");
    private final By TOOLS_BUTTON = By.cssSelector("i.dark-search.transition");
    private final By DOWNLOAD_BUTTON = By.cssSelector("i.dark-download.transition");
    private final By ADD_GROUPS_BUTTON = By.cssSelector("a.create_company_group_info");

    public boolean clickUsersTab() {
        return clickElement(USERS_TAB);
    }

    public boolean clickGroupsTab() {
        return clickElement(GROUPS_TAB);
    }

    public boolean findAddUsersButton() { return confirmElementIsVisible(ADD_USERS_BUTTON); }

    public boolean findFilterButton() { return confirmElementIsVisible(FILTER_BUTTON); }

    public boolean findToolsButton() { return confirmElementIsVisible(TOOLS_BUTTON); }

    public boolean findDownloadButton() { return confirmElementIsVisible(DOWNLOAD_BUTTON); }

    public boolean findAddGroupsButton() { return confirmElementIsVisible(ADD_GROUPS_BUTTON); }

}
