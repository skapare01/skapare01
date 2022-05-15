package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MyLists extends BasePage {

//My Lists Tab Selectors
    private final By CLICK_NAVIGATE_TO_MY_LISTS = (By.id("left_menu_my_list"));
    private final By CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_SAVED_TAB = (By.id("scheduled_email_filter_saved_tab"));
    private final By CLICK_NAVIGATE_TO_MC_MYLISTS_TEMPORARY_TAB = (By.id("scheduled_email_filter_temporary_tab"));

    //Constructor
    public MyLists(WebDriver driver) { super(driver); }

//My Lists Tab Methods
    public boolean navigateToMyLists() {
        return clickElement(CLICK_NAVIGATE_TO_MY_LISTS);
    }
    public boolean navigateToMessageCenterMyListsSavedTab() { return clickElement(CLICK_NAVIGATE_TO_MESSAGE_CENTER_MYLISTS_SAVED_TAB); }
    public boolean navigateToMessageCenterMyListsTemporaryTab() { return clickElement(CLICK_NAVIGATE_TO_MC_MYLISTS_TEMPORARY_TAB); }

}
