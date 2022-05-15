package page_objects.client_admin_page_objects.support_tab.screening_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Screening_Records extends BasePage {
    private final By SEARCH_OPTION = By.id("screening_search_filter_quick_search");
    private final By SEARCH_OPTION_BUTTON = By.xpath("//*[@id=\"screening_applicants\"]/b/input"); //Need an ID to be associated to this search button as it is not selectable ATM. Test will fail. This selector is a placeholder.
    private final String GENERAL_TEXT_FINDER_PART_ONE = "//*[text()='";
    private final String GENERAL_TEXT_FINDER_PART_TWO = "']";
    private final String TEST_CASE_2260999_APPLICANT_ID = "a: 18074788";
    private final String TEST_CASE_2260999_APPLICANT_NAME = "DSZSZ RERTEXRT";

    public Screening_Records(WebDriver driver) {
        super(driver);
    }

    //This will be used in the future.
    public boolean searchForApplicantId (String applicantId){
        return sendKeysToElement(SEARCH_OPTION, applicantId);
    }

    public boolean clickScreeningSearchButton (){
        return clickElement(SEARCH_OPTION_BUTTON);
    }

    public boolean findSpecificText (String textToBeFound) {
       By elementToBefound = By.xpath(GENERAL_TEXT_FINDER_PART_ONE + textToBeFound + GENERAL_TEXT_FINDER_PART_TWO);
       return confirmElementIsVisible(elementToBefound);
    }

    public boolean searchForApplicantId_TestCase2260999(){
        return sendKeysToElement(SEARCH_OPTION, TEST_CASE_2260999_APPLICANT_ID);
    }

    public boolean findSpecificText_ApplicantName_TestCase2260999(){
        return confirmElementIsVisible(By.xpath(GENERAL_TEXT_FINDER_PART_ONE + TEST_CASE_2260999_APPLICANT_NAME + GENERAL_TEXT_FINDER_PART_TWO));
    }

}