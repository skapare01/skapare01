package page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UploadedListEmails extends BasePage {

//Message Center - Uploaded List Emails Tab
    private final By UPLOADED_LIST_EMAILS = By.id("left_menu_campaign_emails");
    private final By UPLOADED_LISTS_SENT_TAB = By.id("emailCampaignSentTab");
    private final By UPLOADED_LISTS_DRAFTS_TAB = By.id("emailCampaignDraftTab");
//Constructor//
    public UploadedListEmails(WebDriver driver) { super(driver); }

//Message Center - Uploaded List Emails Tab Methods
    public boolean messageCenterUploadedListEmailsTab() { return clickElement(UPLOADED_LIST_EMAILS); }
    public boolean messageCenterUploadedListEmailsSentTab() { return clickElement(UPLOADED_LISTS_SENT_TAB); }
    public boolean messageCenterUploadedListEmailsDraftsTab() { return clickElement(UPLOADED_LISTS_DRAFTS_TAB); }

}
