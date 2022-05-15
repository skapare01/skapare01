package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab.details_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralPropertyInformation extends BasePage {
    //Locators:
    private final By PROPERTY_LOOK_UP_CODE_VALUE_LOCATOR = By.cssSelector("#general_property_information-view > div:nth-child(14) > table > tbody > tr > td:nth-child(2)");
    public String PROPERTY_LOOK_UP_CODE_VALUE_IN_PROPERTY_SETTINGS = "";

    //Constructor method:
    public GeneralPropertyInformation(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean confirmPropertyLookUpCodeIsPresentInPropertySettings() {
        getPropertiesLookupCodeValue();
        return confirmElementIsVisible(PROPERTY_LOOK_UP_CODE_VALUE_LOCATOR, waitTimes.LONG_WAIT);
    }
    private String getPropertiesLookupCodeValue() {
        PROPERTY_LOOK_UP_CODE_VALUE_IN_PROPERTY_SETTINGS = getElementText(PROPERTY_LOOK_UP_CODE_VALUE_LOCATOR, waitTimes.LONG_WAIT);
        return PROPERTY_LOOK_UP_CODE_VALUE_IN_PROPERTY_SETTINGS;
    }
}
