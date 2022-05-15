package page_objects.deploy_admin_page_objects.connect_tab.databases_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DatabasesPage extends BasePage {
    public DatabasesPage(WebDriver driver) {
        super(driver);
    }

    //Main Tab Locators:
    private final By ALL_DATABASES_TAB = By.xpath("//a[text()='All Databases']");

    //Bottom of Page Locators:
    private final By LIST_COUNT_DROP_DOWN_SELECTOR = By.id("list");


    //Main Tab Methods:
    public boolean clickAllDatabasesTab() {
        return clickElement(ALL_DATABASES_TAB);
    }

    //Bottom of Page Methods:
    public boolean confirmListCountDropDownMenuIsVisible() {
        return confirmElementIsVisible(LIST_COUNT_DROP_DOWN_SELECTOR, waitTimes.LONG_WAIT);
    }
}
