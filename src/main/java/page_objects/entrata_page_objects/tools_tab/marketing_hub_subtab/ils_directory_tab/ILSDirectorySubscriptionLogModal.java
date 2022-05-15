package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ILSDirectorySubscriptionLogModal extends BasePage {

    //Constructor
    public ILSDirectorySubscriptionLogModal(WebDriver driver) {
        super(driver); }

    //Subscription Log Modal elements
    private final By SUBSCRIPTION_LOG_MODAL_LOCATOR = By.cssSelector("div[aria-describedby='mod']");
    private final By SUBSCRIPTION_LOG_DATE_LOCATOR = By.xpath("//th[text()='Date']");
    private final By SUBSCRIPTION_LOG_ACTION_LOCATOR = By.xpath("//th[text()='Action']");
    private final By SUBSCRIPTION_LOG_NAME_LOCATOR = By.xpath("//th[text()='Name']");
    private final By SUBSCRIPTION_LOG_CLOSE_BUTTON_LOCATOR = By.cssSelector("button[title='Close']");

    //Methods
    public boolean confirmSubscriptionLogModalIsOpen() {
        return confirmElementIsVisible(SUBSCRIPTION_LOG_MODAL_LOCATOR);
    }

    public boolean findDateColumnInSubscriptionLogModal() {
        return confirmElementIsVisible(SUBSCRIPTION_LOG_DATE_LOCATOR);
    }

    public boolean findActionColumnInSubscriptionLogModal() {
        return confirmElementIsVisible(SUBSCRIPTION_LOG_ACTION_LOCATOR);
    }

    public boolean findNameColumnInSubscriptionLogModal() {
        return confirmElementIsVisible(SUBSCRIPTION_LOG_NAME_LOCATOR);
    }

    public boolean selectCloseButtonInSubscriptionLogModal() {
        return clickElement(SUBSCRIPTION_LOG_CLOSE_BUTTON_LOCATOR);
    }


}
