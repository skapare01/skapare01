package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GoogleLeadAdsSubtab extends BasePage {

    //Google Lead Ads Tab
    private final By GOOGLE_LEAD_ADS_SUB_TAB_LOCATOR = By.id("google_lead_adsxxx");

    //Google Lead Ads General Locators
    private final By GOOGLE_LEAD_ADS_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/google_lead_ads_logo.png\']");
    private final By GOOGLE_LEAD_ADS_PROPERTY_SEARCH_FILTER = By.id("search-property");
    private final By GOOGLE_LEAD_ADS_STEP_BY_STEP_INSTRUCTIONS_LOCATOR = By.xpath("//a[contains(text(),'step-by-step instructions')]");
    private final By GOOGLE_LEAD_ADS_COPY_WEBHOOK_BUTTON = By.cssSelector("button[title='Copy to Clipboard']");
    private final By GOOGLE_LEAD_ADS_WEBHOOK_SUCCESSFULLY_COPIED_MESSAGE = By.id("copy-webhook-url");

    //Google Lead Ads Table Locators
    private final By GOOGLE_LEAD_ADS_FIRST_PROPERTY_IN_TABLE = By.cssSelector("tr[data-title='Birchwood'] > td");
    //Google Lead Ads Column Headers
    private final By GOOGLE_LEAD_ADS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By GOOGLE_LEAD_ADS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By GOOGLE_LEAD_ADS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By GOOGLE_LEAD_ADS_KEY_COLUMN_HEADER = By.xpath("//th[text()='Key']");
    //Google Lead Ads Table Buttons
    private final By GOOGLE_LEAD_ADS_COPY_KEY_ICON_BUTTON = By.cssSelector("a[title='Copy to Clipboard']");
    private final By GOOGLE_LEAD_ADS_KEY_SUCCESSFULLY_COPIED_MESSAGE = By.id("copy-google-key");
    //Google Lead Ads Generate New Key Methods
    private final By GOOGLE_LEAD_ADS_GENERATE_NEW_KEY_BUTTON = By.cssSelector("a[button='Yes, Proceed']");
    private final By GOOGLE_LEAD_ADS_GENERATE_NEW_KEY_MODAL = By.cssSelector("span[class='tip tip-n']");
    private final By GENERATE_NEW_KEY_MODAL_CANCEL_BUTTON = By.cssSelector("a[class='button small-gray margin10-right close-tip']");
    private final By GENERATE_NEW_KEY_MODAL_YES_PROCEED_BUTTON = By.cssSelector("a[onclick*='MarketingHub.processGenerateNewKey']");
    private final By GENERATE_NEW_KEY_SUCCESSFULLY_GENERATED_MESSAGE = By.id("message");

    //Constructor
    public GoogleLeadAdsSubtab(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean selectGoogleLeadAdsSubTab() {
        return clickElement(GOOGLE_LEAD_ADS_SUB_TAB_LOCATOR);
    }

    public boolean findLeadAdsPageLogoInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilterInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_PROPERTY_SEARCH_FILTER);
    }

    public boolean sendTextToPropertySearchFilterInGoogleLeadAds(String propertyName) {
        return sendKeysToElement(GOOGLE_LEAD_ADS_PROPERTY_SEARCH_FILTER, propertyName);
    }

    //Step-by-Step Instructions Methods
    public boolean findStepByStepInstructionsInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_STEP_BY_STEP_INSTRUCTIONS_LOCATOR);
    }

    public boolean clickStepByStepHyperLinkInGoogleLeaAds() {
        return clickElement(GOOGLE_LEAD_ADS_STEP_BY_STEP_INSTRUCTIONS_LOCATOR);
    }

    public boolean confirmNewTabOpensForGoogleStepByStepInstructions() {
        return switchToRecentlyOpenedTab();
    }

    public boolean returnToOriginalGoogleLeadAdsTab() {
        return closeSecondTabAndReturnToPrimaryTab();
    }

    //Copy Webhook Methods
    public boolean findCopyWebhookButtonInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_COPY_WEBHOOK_BUTTON);
    }

    public boolean clickCopyWebhookButtonInGoogleLeadAds() {
        return clickElement(GOOGLE_LEAD_ADS_COPY_WEBHOOK_BUTTON);
    }

    public String confirmWebhookSuccessfullyCopiedMessageInGoogleLeadAds() {
        return getElementText(GOOGLE_LEAD_ADS_WEBHOOK_SUCCESSFULLY_COPIED_MESSAGE);
    }

    //Google Lead Ads Table List Methods
    public String confirmFirstPropertyMatchesSearchInGoogleLeadAds() {
        return getElementText(GOOGLE_LEAD_ADS_FIRST_PROPERTY_IN_TABLE);
    }

    //Google Lead Ads Table Column Headers
    public boolean findPropertyColumnHeaderInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findLocationColumnHeaderInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnHeaderInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_STATUS_COLUMN_HEADER);
    }

    public boolean findKeyColumnHeaderInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_KEY_COLUMN_HEADER);
    }

    public boolean findCopyButtonUnderKeyColumnInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_COPY_KEY_ICON_BUTTON);
    }

    //Key Column Copy Button Methods
    public boolean clickCopyKeyButtonInGoogleLeadAds() {
        return clickElement(GOOGLE_LEAD_ADS_COPY_KEY_ICON_BUTTON);
    }

    public String confirmKeySuccessfullyCopiedMessageInGoogleLeadAds() {
        return getElementText(GOOGLE_LEAD_ADS_KEY_SUCCESSFULLY_COPIED_MESSAGE);
    }

    //Generate New Key Methods
    public boolean findGenerateNewKeyButtonInGoogleLA() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_GENERATE_NEW_KEY_BUTTON);
    }

    public boolean clickGenerateNewKeyButtonInGoogleLA() {
        return clickElement(GOOGLE_LEAD_ADS_GENERATE_NEW_KEY_BUTTON);
    }

    public boolean confirmNewKeyModalPopulatesInGoogleLeadAds() {
        return confirmElementIsVisible(GOOGLE_LEAD_ADS_GENERATE_NEW_KEY_MODAL);
    }

    public boolean findCancelButtonInGenerateNewKeyModalInGoogleLA() {
        return confirmElementIsVisible(GENERATE_NEW_KEY_MODAL_CANCEL_BUTTON);
    }

    public boolean findYesProceedButtonInGenerateNewKeyModalInGoogleLA() {
        return confirmElementIsVisible(GENERATE_NEW_KEY_MODAL_YES_PROCEED_BUTTON);
    }

    public boolean clickCancelButtonInGenerateNewKeyModalInGoogleLA() {
        return clickElement(GENERATE_NEW_KEY_MODAL_CANCEL_BUTTON);
    }

    public boolean clickYesButtonProceedInGenerateNewKeyModalInGoogleLA() {
        return clickElement(GENERATE_NEW_KEY_MODAL_YES_PROCEED_BUTTON);
    }

    public String confirmNewKeyGeneratedMessageIsVisibleInGoogleLeadAds() {
        return getElementText(GENERATE_NEW_KEY_SUCCESSFULLY_GENERATED_MESSAGE);
    }

    public boolean confirmNewKeyGeneratedMessageNotVisibleInGoogleLeadAds() {
        return confirmElementIsInvisible(GENERATE_NEW_KEY_SUCCESSFULLY_GENERATED_MESSAGE);
    }

}
