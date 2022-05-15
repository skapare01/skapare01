package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AdCreationSubtab extends BasePage {

    //Constructor
    public AdCreationSubtab(WebDriver driver) {
        super(driver); }

    //Craigslist Module Sub-Tabs
    private final By AD_CREATION_TAB_LOCATOR = By.xpath("//li[text()='Ad Creation']");
    private final By CREATION_TAB_OVERLAY = By.id("loader-gif-container");

    //Craigslist "Ad Creation" Module Action Buttons
    private final By PROPERTY_FILTER_LOCATOR = By.xpath("//i[@class='down-arrow']");
    private final By DEFAULT_PROPERTY_FILTER_SELECTION_LOCATOR = By.xpath("//span[@class='title']");
    private final By FIRST_PROPERTY_IN_PROPERTY_FILTER_LOCATOR = By.cssSelector("li[class='sl-item js-property']:first-of-type");
    private final By CRAIGSLIST_HELP_LINK_LOCATOR = By.xpath("//a[text()='Craigslist Help']");
    private final By PROPERTY_LEVEL_NEW_TEMPLATE_BUTTON_LOCATOR = By.xpath("//a[text()='New Template']");
    private final By SORT_BY_USE_DATE_FILTER_LOCATOR = By.xpath("//select[@class='form-select js-sort-boxes']");

    //"Ad Creation" Ad Specific buttons (Default Property Template)
    private final By SINGLE_PROPERTY_TEMPLATE_LOCATOR = By.cssSelector("div[class='ad-template-box']:not(.corporate)");
    private final By EDIT_BUTTON_LOCATOR = By.xpath("//a[@title='Edit template']");
    private final By DELETE_BUTTON_LOCATOR = By.xpath("//span[@button='Delete']");

    //"Ad Creation" Ad Specific buttons (Default Corporate Template)
    private final By SINGLE_CORPORATE_TEMPLATE_LOCATOR = By.cssSelector("div[class='ad-template-box corporate']");

    //"Ad Creation" General Ad Specific buttons
    private final By DUPLICATE_BUTTON_LOCATOR = By.xpath("//a[@title='Duplicate template']");
    private final By LAST_USED_DATETIME_LOCATOR = By.xpath("//div[contains(text(),'Last Used:')]");
    private final By DEFAULT_IMAGE_COUNT_LOCATOR = By.xpath("//div[contains(text(),'Default Images')]");
    private final By CREATE_AD_BUTTON_LOCATOR = By.xpath("//a[text()='Create Ad']");

    //Filter Options
    private final String OPTION1_OLDEST_LATEST_LOCATOR = "date:date-asc";
    private final String OPTION2_LATEST_OLDEST_LOCATOR = "date:date-desc";

    //Craigslist Ads Tab Overlay
    private final By OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB = By.className("loading-overlay");

    //Page Methods
    public boolean navigateToAdCreationTab() {
        waitForCraigslistAdsTabOverlay();
        return clickElement(AD_CREATION_TAB_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findPropertyFilter_AdCreation() {
        return confirmElementIsVisible(PROPERTY_FILTER_LOCATOR);
    }

    //Property Filter, get Elements
    public String findDefaultPropertyInFilter_AdCreation() {
        return getElementText(DEFAULT_PROPERTY_FILTER_SELECTION_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String findFirstPropertyInFilterDropDown_AdCreation() {
        waitForPropertyFilterOverlay();
        clickElement(PROPERTY_FILTER_LOCATOR);
        return getElementText(FIRST_PROPERTY_IN_PROPERTY_FILTER_LOCATOR,waitTimes.LONG_WAIT);
    }

    public boolean findCraigslistHelpLink_AdCreation() {
        return confirmElementIsVisible(CRAIGSLIST_HELP_LINK_LOCATOR, waitTimes.SHORT_WAIT);
    }

    public boolean findPropertyNewTemplateButton() {
        return confirmElementIsVisible(PROPERTY_LEVEL_NEW_TEMPLATE_BUTTON_LOCATOR);
    }

    public boolean findSortByFilter_UseDate() {
        waitForAdCreationTabOverlay();
        return confirmElementIsVisible(SORT_BY_USE_DATE_FILTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption1_OldestLatest() {
        return selectElementByValue(SORT_BY_USE_DATE_FILTER_LOCATOR,
                OPTION1_OLDEST_LATEST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption2_LatestOldest() {
        return selectElementByValue(SORT_BY_USE_DATE_FILTER_LOCATOR,
                OPTION2_LATEST_OLDEST_LOCATOR, waitTimes.LONG_WAIT);
    }

    //Property Template Methods
    public boolean selectFirstPropertyTemplateInList() {
        return clickElement(SINGLE_PROPERTY_TEMPLATE_LOCATOR);
    }

    public boolean findDateTime_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(LAST_USED_DATETIME_LOCATOR);
    }

    public boolean findImageCount_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(DEFAULT_IMAGE_COUNT_LOCATOR);
    }

    public boolean findCreateAdButton_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(CREATE_AD_BUTTON_LOCATOR);
    }

    public boolean findEditButton_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(EDIT_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDuplicateButton_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(DUPLICATE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDeleteButton_AdCreationPropertyTemplate() {
        return confirmElementIsVisible(DELETE_BUTTON_LOCATOR);
    }

    //Corporate Template Methods
    public boolean selectFirstCorporateTemplateInList() {
        return clickElement(SINGLE_CORPORATE_TEMPLATE_LOCATOR);
    }

    public boolean findDuplicateButton_CorporateTemplateAdCreation() {
        return confirmElementIsVisible(DUPLICATE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDateTime_AdCreationCorporateTemplate() {
        return confirmElementIsVisible(DELETE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findImageCount_AdCreationCorporateTemplate() {
        return confirmElementIsVisible(DEFAULT_IMAGE_COUNT_LOCATOR);
    }

    public boolean findCreateAdButton_AdCreationCorporateTemplate() {
        return confirmElementIsVisible(CREATE_AD_BUTTON_LOCATOR);
    }

    //Overlay Methods (private)
    private void waitForAdCreationTabOverlay() {
        waitForOverlay(CREATION_TAB_OVERLAY);
    }

    private void waitForPropertyFilterOverlay() {
        waitForOverlay(CREATION_TAB_OVERLAY);
    }

    private void waitForCraigslistAdsTabOverlay() {
        waitForOverlay(OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB);
    }


}
