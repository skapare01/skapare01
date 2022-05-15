package page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AdditionalInformationPage extends BasePage {

    private final By ADDRESS_LINE_ONE = By.cssSelector("input[name = 'customer_addresses[12][postal_addresses][default][addressLine1]']");
    private final By CITY = By.cssSelector("input[name = 'customer_addresses[12][postal_addresses][default][locality]']");
    private final By STATE_DROPDOWN = By.cssSelector("select[name = 'customer_addresses[12][postal_addresses][default][administrativeArea]']");
    private final By ZIPCODE = By.cssSelector("input[name = 'customer_addresses[12][postal_addresses][default][postalCode]']");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By FINANCIAL_BUTTON = By.xpath("//*[@id=\"next-prev-step\"]/a[2]");

    //State dropdown options
    private final String UTAH = "UT";



    public AdditionalInformationPage(WebDriver driver){
        super(driver);}

    private void waitForLoadingOverlay(){waitForOverlay(LOADING_OVERLAY);}
    public boolean enterAddressLineOne(String address){waitForLoadingOverlay(); return sendKeysToElement(ADDRESS_LINE_ONE,address);}
    public boolean enterCityName(String cityName){return sendKeysToElement(CITY, cityName);}
    public boolean selectUtahState(){return selectElementByValue(STATE_DROPDOWN,UTAH);}
    public boolean enterZipCode(String zipCode){return sendKeysToElement(ZIPCODE,zipCode);}
    public boolean clickFinancialButton() {return clickElement(FINANCIAL_BUTTON);}
}
