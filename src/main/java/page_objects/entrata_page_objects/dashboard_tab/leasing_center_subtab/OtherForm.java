package page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OtherForm extends BasePage {
    private final By OTHER_BASIC_INFO_TAB = By.cssSelector("li[class='js-basic-info-tab selected']");
    private final By OTHER_SUBMIT_MESSAGE_TAB = By.className("js-submit-message-tab");
    private final By PROPERTY_SELECTOR_DROPDOWN_ICON = By.cssSelector("i[class='form-icon dropdown']");
    private final By PROPERTY_SEARCH_BAR = By.className("search-input");
    private final By THE_VILLAGE_CLIFFS_PROPERTY = By.xpath("//*[text()='The Village Cliffs']");
    private final By OTHER_TAB_DROPDOWN = By.xpath("//div//option[text()='Other']");
    private final By OTHER_DETAILS = By.cssSelector("div[id='left-body-form-container-div'] [class='form-container-head']");
    private final By GENERAL_VENDOR_PROTOCOL = By.xpath("//*[@id=\"highlight-accordion\"]/div/div/i");
    private final By GENERAL_SOLICITOR_PROTOCOL = By.xpath("//*[text()='General Solicitor Protocol']");
    private final By MARKET_SURVEY_PROTOCOL = By.xpath("//*[text()='Market Survey Protocol']");
    private final By TEST_CALLS_PROTOCOL = By.xpath("//*[text()='Test Calls Protocol']");

    public OtherForm(WebDriver driver) {
        super(driver);
    }

    public boolean clickOtherTabDropdown() { return clickElement(OTHER_TAB_DROPDOWN);}

    public boolean findOtherBasicInfoTab() { return confirmElementIsVisible(OTHER_BASIC_INFO_TAB);}

    public boolean findOtherSubmitMessage() { return confirmElementIsVisible(OTHER_SUBMIT_MESSAGE_TAB);}

    public boolean clickPropertySelectorDropdownIcon() { return clickElement(PROPERTY_SELECTOR_DROPDOWN_ICON);}

    public boolean enterKeysIntoPropertySearchBar(String search) { return sendKeysToElement(PROPERTY_SEARCH_BAR, search);}

    public boolean submitKeysIntoPropertySearchBar() { return pressEnter(PROPERTY_SEARCH_BAR);}

    public boolean findTheVillageCliffsProperty() { return confirmElementIsVisible(THE_VILLAGE_CLIFFS_PROPERTY);}

    public boolean findOtherDetails() { return confirmElementIsVisible(OTHER_DETAILS);}

    public boolean findGeneralVendorProtocol() { return confirmElementIsVisible(GENERAL_VENDOR_PROTOCOL);}

    public boolean findGeneralSolicitorProtocol() { return confirmElementIsVisible(GENERAL_SOLICITOR_PROTOCOL);}

    public boolean findMarketSurveyProtocol() { return confirmElementIsVisible(MARKET_SURVEY_PROTOCOL);}

    public boolean findTestCallsProtocol() { return confirmElementIsVisible(TEST_CALLS_PROTOCOL);}
}

