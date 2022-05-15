package page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BasicInfoPage extends BasePage {

    private final By NO_MIDDLE_NAME_CHECKBOX = By.id("applicant_has_middle_name");
    private final By US_CITIZEN_YES_OPTION = By.id("is_alien_yes");
    private final By DATE_OF_BIRTH_MONTH = By.xpath("//input[@id = 'birth_date_masked']/following-sibling::input[1]");
    private final By DATE_OF_BIRTH_DAY = By.xpath("//input[@id = 'birth_date_masked']/following-sibling::input[2]");
    private final By DATE_OF_BIRTH_YEAR = By.xpath("//input[@id = 'birth_date_masked']/following-sibling::input[3]");
    private final By SELECT_SSN_FOR_TEST_CLIENT = By.id("tax_number_masked");

    private final By UNIT_PREFERENCE_TAB = By.xpath("//*[@id=\"next-prev-step\"]/a[2]");

    // SSN OPTIONS (Test client only)
    private final String FAKE_SSN_ONE = "100000001";


    public BasicInfoPage(WebDriver driver){
        super(driver);}

    public boolean clickNoMiddleNameCheckbox(){return clickElement(NO_MIDDLE_NAME_CHECKBOX);}
    public boolean clickUSCitizenYesOption(){return clickElement(US_CITIZEN_YES_OPTION);}
    public boolean enterBirthMonth(String month){return sendKeysToElement(DATE_OF_BIRTH_MONTH, month);}
    public boolean enterBirthDay(String day){return sendKeysToElement(DATE_OF_BIRTH_DAY,day);}
    public boolean enterBirthYear(String year){return sendKeysToElement(DATE_OF_BIRTH_YEAR,year);}
    public boolean selectSSNTestClientOptionOne(){return selectElementByValue(SELECT_SSN_FOR_TEST_CLIENT,FAKE_SSN_ONE);}
    public boolean clickUnitPreferenceTab(){return clickElement(UNIT_PREFERENCE_TAB);}
    public boolean acceptTheSwitchingPagesAlert(){return clickOkButtonOfAlertMessage();}

}
