package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CorporateTemplatesSubtab extends BasePage {

    //Craigslist Sub-Tab
    private final By CORPORATE_TEMPLATES_TAB_LOCATOR = By.xpath("//li[text()='Corporate Templates']");
    private final By CORPORATE_TAB_OVERLAY = By.id("loader-gif-container");
    //Craigslist Ads Tab Overlay
    private final By OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB = By.className("loading-overlay");

    //Craigslist "Corporate Templates" Module Action Buttons
    private final By CORPORATE_TEMPLATES_TITLE_LOCATOR = By.xpath("//span[text()='Corporate Templates']");
    private final By CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON = By.xpath("//a[@class='button small green corporate-template-btn js-create-template  show ']");
    private final By SORT_BY_ASSIGNED_FILTER = By.xpath("//select[@class='form-select js-sort-boxes']");

    //"Corporate Templates" Ad Specific buttons
    private final By CRAIGSLIST_SINGLE_AD_LOCATOR = By.xpath("//div[@id='template-grid']/div[1]");
    private final By EDIT_BUTTON_LOCATOR = By.xpath("//a[@title='Edit template']");
    private final By DUPLICATE_BUTTON_LOCATOR = By.xpath("//a[@title='Duplicate template']");
    private final By DELETE_BUTTON_LOCATOR = By.xpath("//span[@button='Delete']");
    private final By LAST_CORPORATE_TEMPLATE = By.cssSelector("div[class='ad-template-box corporate']:last-of-type");
    private final By LAST_CORPORATE_TEMPLATE_EDIT_BUTTON = By.cssSelector("div[class='ad-template-box corporate']:last-of-type > div[class='control-bar'] > a[class='sub-button js-edit-template']");
    private final By LAST_DELETE_BUTTON = By.cssSelector("div[class='ad-template-box corporate']:last-of-type > span[button='Delete']");
    private final By CONFIRM_DELETE_BUTTON = By.cssSelector("a[class='button small actions-btn']");

    //Filter Options
    private final String OPTION1_PROPERTIES_MOST_LEAST_LOCATOR = "propertyCount:numeric-desc";
    private final String OPTION2_PROPERTIES_LEAST_MOST_LOCATOR = "propertyCount:numeric-asc";

    //Constructor
    public CorporateTemplatesSubtab(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean navigateToCorporateTemplatesTab() {
        waitForCraigslistAdsTabOverlay();
        return clickElement(CORPORATE_TEMPLATES_TAB_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean corporateTemplateTitleVisible() {
        waitForCraigslistCorporateSubtabOverlay();
        return confirmElementIsVisible(CORPORATE_TEMPLATES_TITLE_LOCATOR);
    }

    public boolean findCorporateNewTemplateButton() {
        return confirmElementIsVisible(CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON);
    }

    public boolean clickCorporateNewTemplateButton() {
        waitForCraigslistCorporateSubtabOverlay();
        return clickElement(CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON);
    }

    public boolean findCorporateTemplatesSortFilter() {
        return confirmElementIsVisible(SORT_BY_ASSIGNED_FILTER);
    }

    public boolean findCorporateFilterOption1MostLeast() {
        return selectElementByValue(SORT_BY_ASSIGNED_FILTER,
                OPTION1_PROPERTIES_MOST_LEAST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findCorporateFilterOption2LeastMost() {
        return selectElementByValue(SORT_BY_ASSIGNED_FILTER,
                OPTION2_PROPERTIES_LEAST_MOST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectFirstCorporateTemplateInList() {
        return clickElement(CRAIGSLIST_SINGLE_AD_LOCATOR);
    }

    public boolean findEditButtonOnCorporateTemplateAd() {
        return confirmElementIsVisible(EDIT_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDuplicateButtonOnCorporateTemplateAd() {
        return confirmElementIsVisible(DUPLICATE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDeleteButtonOnCorporateTemplateAd() {
        return confirmElementIsVisible(DELETE_BUTTON_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean confirmNewTemplateForVerifyCraigslistAdCreationAndDeletionWasCreated(String textTitle) {
        return confirmElementContainsText(LAST_CORPORATE_TEMPLATE,textTitle);
    }

    public boolean clickEditOptionOfLastCorporateTemplate() {
        return clickElement(LAST_CORPORATE_TEMPLATE_EDIT_BUTTON);
    }

    public boolean moveToLastCorporateTemplate() {
        return moveToAnElementWithActions(LAST_CORPORATE_TEMPLATE);
    }

    public boolean clickLastDeleteButton() {
        return clickElement(LAST_DELETE_BUTTON);
    }

    public boolean clickConfirmDeleteButton() {
        return clickElement(CONFIRM_DELETE_BUTTON);
    }

    //Craigslist Ads Overlay
    private void waitForCraigslistAdsTabOverlay() {
        waitForOverlay(OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB);
    }

    private void waitForCraigslistCorporateSubtabOverlay() {
        waitForOverlay(CORPORATE_TAB_OVERLAY);
    }


}
