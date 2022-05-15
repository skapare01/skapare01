package page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ToDoListSubtab extends BasePage {

    //Constructor
    public ToDoListSubtab(WebDriver driver) {
        super(driver);
    }

    //To-Do List Sub-tab Locator
    private final By TO_DO_LIST_SUB_TAB_LOCATOR = By.id("social_to_do_list");
    private final By TO_DO_LIST_SUB_TAB_DEFAULT_SELECTED_LOCATOR = By.cssSelector("li[class='js-sub-tab-link js-load-tab selected']");

    //To-Do List Sub-tab General Elements and Filters
    private final By TO_DO_LIST_PROPERTY_FILTER = By.className("selector-body");

    //To-Do List Cards
    private final By TO_DO_LIST_PENDING_APPROVAL_CARD = By.className("selector-body");
    private final By TO_DO_LIST_REVISION_REQUIRED_CARD = By.className("selector-body");
    private final By TO_DO_LIST_FAILED_TO_POST_CARD = By.className("selector-body");

    //METHODS
    public boolean selectToDoListSubtabInPostingToolTab() {
        return clickElement(TO_DO_LIST_SUB_TAB_LOCATOR);
    }

    public boolean confirmToDoListTabSelectedByDefaultInPostingToolTab() {
        return confirmElementIsVisible(TO_DO_LIST_SUB_TAB_DEFAULT_SELECTED_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findPropertyFilterInToDoListSubTab() {
        return confirmElementIsVisible(TO_DO_LIST_PROPERTY_FILTER);
    }

    public boolean findPendingApprovalCardInToDoListSubTab() {
        return confirmElementIsVisible(TO_DO_LIST_PENDING_APPROVAL_CARD);
    }

    public boolean findRevisionRequiredCardInToDoListSubTab() {
        return confirmElementIsVisible(TO_DO_LIST_REVISION_REQUIRED_CARD);
    }

    public boolean findFailedToPostCardInToDoListSubTab() {
        return confirmElementIsVisible(TO_DO_LIST_FAILED_TO_POST_CARD);
    }

}
