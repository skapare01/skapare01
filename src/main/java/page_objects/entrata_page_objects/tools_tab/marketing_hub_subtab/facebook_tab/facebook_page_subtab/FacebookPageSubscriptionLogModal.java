package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FacebookPageSubscriptionLogModal extends BasePage {

    //Transmission Log element Locators
    private final By FACEBOOK_PAGE_SUBSCRIPTION_LOG_WINDOW_LOCATOR = By.id("mod");
    private final By FACEBOOK_PAGE_SUBS_LOG_DATE_SECTION_LOCATOR = By.xpath("//th[text()='Date']");
    private final By FACEBOOK_PAGE_SUBS_LOG_ACTION_SECTION_LOCATOR = By.xpath("//th[text()='Action']");
    private final By FACEBOOK_PAGE_SUBS_LOG_USER_SECTION_LOCATOR = By.xpath("//th[text()='Name']");

    //Constructor
    public FacebookPageSubscriptionLogModal(WebDriver driver) {
        super(driver); }

    //METHODS
    public boolean confirmSubscriptionLogOpenedInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_SUBSCRIPTION_LOG_WINDOW_LOCATOR);
    }

    public boolean confirmDateVisibleInSubscriptionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_SUBS_LOG_DATE_SECTION_LOCATOR);
    }

    public boolean confirmActionVisibleInSubscriptionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_SUBS_LOG_ACTION_SECTION_LOCATOR);
    }

    public boolean confirmUserNameVisibleInSubscriptionLogInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_SUBS_LOG_USER_SECTION_LOCATOR);
    }

}
