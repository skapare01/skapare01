package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UploadedLists extends BasePage {
//Message Center -> Uploaded Lists Selectors
    private final By UPLOADED_LISTS = By.id("left_menu_campaign_list");
    private final By UPLOADED_LISTS_SAVED_TAB = By.id("savedTab");
    private final By UPLOADED_LISTS_USED_LIST_TAB = By.id("usedListTab");
//Constructor
    public UploadedLists(WebDriver driver) { super(driver); }

//Message Center -> Uploaded Lists Methods
    public boolean clickUploadedLists() {return clickElement(UPLOADED_LISTS);}
    public boolean clickUploadedListsSavedTab() {return clickElement(UPLOADED_LISTS_SAVED_TAB);}
    public boolean clickUploadedListsUsedListTab() {return clickElement(UPLOADED_LISTS_USED_LIST_TAB);}

}
