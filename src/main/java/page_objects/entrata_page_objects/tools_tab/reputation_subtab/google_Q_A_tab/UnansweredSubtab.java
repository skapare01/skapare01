package page_objects.entrata_page_objects.tools_tab.reputation_subtab.google_Q_A_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UnansweredSubtab extends BasePage {


    //Constructor
    public UnansweredSubtab(WebDriver driver) {
        super(driver);
    }

    //Unanswered Sub-tab Locator
    private final By UNANSWERED_SUB_TAB_LOCATOR = By.id("new_question");
    private final By UNASNWERED_SUB_TAB_DEFAULT_SELECTED = By.cssSelector("li[class='js-sub-tab-link js-load-tab selected']");

    //Unanswered tab should load by default.
    private final By UNANSWERED_PROPERTY_FILTER = By.className("selector-body");

    //Unanswered tab Filters by Past Locators
    private final By UNANSWERED_SEVEN_DAYS_FILTER = By.cssSelector("li[val='7 days']");
    private final By UNANSWERED_THIRTY_DAYS_FILTER = By.cssSelector("li[val='30 days']");
    private final By UNANSWERED_NINETY_DAYS_FILTER = By.cssSelector("li[val='90 days']");
    private final By UNANSWERED_SIX_MONTHS_FILTER = By.cssSelector("li[val='180 days']");
    private final By UNANSWERED_ONE_YEAR_FILTER = By.cssSelector("li[val='365 days']");
    private final By UNANSWERED_ALL_FILTER = By.cssSelector("li[val='all']");

    //METHODS
    public boolean selectUnansweredSubtabInGoogleQATab() {
        return clickElement(UNANSWERED_SUB_TAB_LOCATOR);
    }

    public boolean confirmUnansweredSubtabSelectedByDefault() {
        return confirmElementIsVisible(UNASNWERED_SUB_TAB_DEFAULT_SELECTED);
    }

    //Property Filter Methods
    public boolean findPropertyFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_PROPERTY_FILTER);
    }

    //Past Filter Methods
    public boolean findSevenDayFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_SEVEN_DAYS_FILTER);
    }

    public boolean findThirtyDayFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_THIRTY_DAYS_FILTER);
    }

    public boolean findNinetyDayFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_NINETY_DAYS_FILTER);
    }

    public boolean findSixMonthFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_SIX_MONTHS_FILTER);
    }

    public boolean findOneYearFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_ONE_YEAR_FILTER);
    }

    public boolean findAllFilterInUnansweredSubTab() {
        return confirmElementIsVisible(UNANSWERED_ALL_FILTER);
    }

}
