package page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IgnoredSubtab extends BasePage {

    //Constructor
    public IgnoredSubtab(WebDriver driver) {
        super(driver);
    }

    //Ignored Sub-tab Locator
    private final By IGNORED_SUB_TAB_LOCATOR = By.id("ignored");

    //Ignored tab should load by default.
    private final By IGNORED_PROPERTY_FILTER = By.className("selector-body");

    //Ignored tab Filters by Past Locators
    private final By IGNORED_SEVEN_DAYS_FILTER = By.cssSelector("li[val='7 days']");
    private final By IGNORED_THIRTY_DAYS_FILTER = By.cssSelector("li[val='30 days']");
    private final By IGNORED_NINETY_DAYS_FILTER = By.cssSelector("li[val='90 days']");
    private final By IGNORED_SIX_MONTHS_FILTER = By.cssSelector("li[val='180 days']");
    private final By IGNORED_ONE_YEAR_FILTER = By.cssSelector("li[val='365 days']");
    private final By IGNORED_ALL_FILTER = By.cssSelector("li[val='all']");

    //METHODS
    public boolean selectIgnoredSubtabInGoogleQATab() {
        return clickElement(IGNORED_SUB_TAB_LOCATOR);
    }

    //Property Filter Methods
    public boolean findPropertyFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_PROPERTY_FILTER);
    }

    //Past Filter Methods
    public boolean findSevenDayFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_SEVEN_DAYS_FILTER);
    }

    public boolean findThirtyDayFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_THIRTY_DAYS_FILTER);
    }

    public boolean findNinetyDayFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_NINETY_DAYS_FILTER);
    }

    public boolean findSixMonthFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_SIX_MONTHS_FILTER);
    }

    public boolean findOneYearFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_ONE_YEAR_FILTER);
    }

    public boolean findAllFilterInIgnoredSubTab() {
        return confirmElementIsVisible(IGNORED_ALL_FILTER);
    }

}
