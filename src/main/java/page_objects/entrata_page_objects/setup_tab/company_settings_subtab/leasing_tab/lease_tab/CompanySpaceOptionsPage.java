package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.BasePage;

public class CompanySpaceOptionsPage extends BasePage {
    public CompanySpaceOptionsPage(WebDriver driver) {super(driver);}



    public final By PRIVATE_SPACE_OPTION = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[2]/td[1]");
    public final By SHARED_SPACE_OPTION = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[3]/td[1]");

    private final By OVERLAY = By.className("loading-overlay");
    private final By PRIVATE_PROPERTY_COUNT= By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[2]/td[5]/span");
    private final By SHARED_PROPERTY_COUNT = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[3]/td[5]/span");
    private final By PRIVATE_EDIT_ICON = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[2]/td[6]/i");
    private final By SHARED_EDIT_ICON = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[3]/td[6]/i");
    private final By ADD_SPACE_OPTION = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/a");
    private final By SPACE_COUNT_DROPDOWN = By.id("unit_space_count");
    private final By CUSTOM_SPACE_OPTION_TITLE = By.name("space_configuration[name]");
    private final By OCCUPANCY_TYPE_DROPDOWN = By.cssSelector("div[data-options-category = 'Occupancy type']");
    private final By STUDENT_OCCUPANCY_TYPE = By.cssSelector("input[value = '10']");
    private final By ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By PROPERTY_NAME = By.className("property-name");
    private final By SAVE_SPACE_OPTION = By.id("save-space-option");
    private final By SUCCESS_MESSAGE = By.xpath("//div[@id=\"company_setup_sub_container\"]/p");
    private final By BEST_SPACE_OPTION = By.xpath("//*[text() = 'Best Space Option']");
    private final By EDIT_COMPANY_SPACE_OPTION = By.xpath("//*[@id=\"company_setup_sub_container\"]/b/b/table/tbody/tr[last()]/td[6]/i");
    private final By DELETE_PROPERTY_FROM_SPACE = By.xpath("//*[@id=\"selected-property_groupid-173769\"]/label/i");
    private final By CONFIRM_CHANGES = By.xpath("/html/body/div[10]/div/div[1]/a");
    private final By DELETE_SPACE_OPTION = By.cssSelector("input[value='Delete']");






    public void waitForOverlay(){  waitForOverlay(OVERLAY);}
    public String checkForPrivateSpaceOption(){ waitForOverlay();
        return getElementText(PRIVATE_SPACE_OPTION);}
    public String checkForSharedSpaceOption(){return getElementText(SHARED_SPACE_OPTION);}
    public String checkPrivatePropertyCount(){return getElementText(PRIVATE_PROPERTY_COUNT);}
    public String checkSharedPropertyCounty(){return getElementText(SHARED_PROPERTY_COUNT);}
    public boolean checkForPrivateEditIcon(){return confirmElementIsInvisible(PRIVATE_EDIT_ICON);}
    public boolean checkForSharedEditIcon(){return confirmElementIsInvisible(SHARED_EDIT_ICON);}
    public boolean clickAddSpaceOption(){return clickElement(ADD_SPACE_OPTION);}

    public boolean selectSpaceCount(String count){return selectElementByValue(SPACE_COUNT_DROPDOWN,count);}
    public boolean enterSpaceOptionTitle(String title){return sendKeysToElement(CUSTOM_SPACE_OPTION_TITLE,title); }
    public boolean selectStudentOccupancy() {
        try {
            WebElement dropdown = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.elementToBeClickable(OCCUPANCY_TYPE_DROPDOWN));
            Actions newAction = new Actions(driver);
            newAction.moveToElement(dropdown).doubleClick().perform();
            clickElement(STUDENT_OCCUPANCY_TYPE);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean clickAddProperty(){ clickElement(CUSTOM_SPACE_OPTION_TITLE);  return clickElement(ADD_PROPERTY_BUTTON);}
    public boolean clickProperty(){ return clickElement(PROPERTY_NAME, waitTimes.LONG_WAIT);}
    public boolean clickSaveButton(){return clickElement(SAVE_SPACE_OPTION);}
    public String checkSuccessMessage() {waitForOverlay(OVERLAY);
        return getElementText(SUCCESS_MESSAGE);}
    public boolean confirmAddedSpaceOption(){ waitForOverlay(OVERLAY); scrollDownToBottomOfPage(); return confirmElementIsVisible(BEST_SPACE_OPTION);}
    public boolean clickEditSpaceOption(){ waitForOverlay(OVERLAY);
        scrollDownToBottomOfPage();
        return clickElement(EDIT_COMPANY_SPACE_OPTION);}
    public boolean clickDeletePropertyFromSpaceOption(){return clickElement(DELETE_PROPERTY_FROM_SPACE);}
    public boolean clickConfirmButton(){ return clickElement(CONFIRM_CHANGES);}
    public boolean clickDeleteSpaceOption() {
        return clickElement(DELETE_SPACE_OPTION);}

    public boolean confirmDelete(){
        try {
            driver.switchTo().alert().accept();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false; } }
}



