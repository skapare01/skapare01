package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class LeaseTermStructuresPage extends BasePage {

    private final By ADD_TERM_STRUCTURE = By.linkText("Add Term Structure");
    private final By LEASE_STRUCTURE_NAME_FIELD = By.id("lease_term_structure_name");
    private final By CANCEL_BUTTON = By.linkText("Cancel");
    private final By FIRST_EDIT_LEASE_TERM_STRUCTURE = By.className("edit");
    private final By ADD_PROPERTY_BUTTON= By.id("addbutton");
    private final By PROPERTY_LIST = By.xpath("//*[text()='Property List']");
    private final By INPUT_PROPERTY_FIELD = By.id("test");
    private final String PROPERTY_NAME = "Campus Hill - Lehigh 2";
    private final By REPUBLIC_PROPERTY = By.id("property_groupid_properties_100002603");
    private final By PROPERTY_ID = By.cssSelector("li[data-listid='605851']");
    private final By SAVE_LEASE_TERM_STRUCTURE_BUTTON = By.cssSelector("input[value='Save']");
    private final By TEST_LEASE_STRUCTURE = By.xpath("//*[text() = 'Test Lease Structure']");

    //Delete Lease Term Test
    private final By EDIT_LEASE_STRUCTURE_BUTTON= By.xpath("//*[@id=\"structures\"]/tbody/tr[last()-1]" + "//i[@class = 'edit']");
    private final By PORT_REPUBLIC_LEASE_TERM = By.cssSelector("td[onclick*= 'lease_term_structure_id=740']+td");
    private final By WEST_SIX_LEASE_TERM = By.cssSelector("td[onclick*= 'lease_term_structure_id=741']+td");
    private final By ADD_LEASE_TERM_PORT_REPUBLIC = By.cssSelector("a[onclick*='lease_term_structure[id]=740']");
    private final By DELETE_LEASE_STRUCTURE_BUTTON = By.cssSelector("input[value='Delete']");
    private final By DELETE_PROPERTY_FROM_LEASE_STRUCTURE = By.cssSelector("i[title = 'Remove']");
    private final By CONFIRM_CHANGE_BUTTON = By.linkText("Yes");
    private final By DELETE_PROPERTY_OVERLAY = By.className("loading-overlay");
    private final By SUCCESS_MESSAGE = By.id("success_msg");

    // add Lease Term Window Test
    private final By OCCUPANCY_DROPDOWN = By.id("occupancy-type");
    private final By RENEWAL_BILL_START_DATE = By.id("masked-lease_start_windows[new_0][renewal_billing_start_date]");
    private final By RENEWAL_LEASE_START_DATE = By.id("masked-lease_start_windows[new_0][renewal_start_date]");
    private final By PROSPECT_LEASE_START_DATE = By.id("masked-lease_start_windows[new_0][start_date]");
    private final By ALL_LEASE_END_DATE = By.id("masked-lease_start_windows[new_0][end_date]");
    private final By ALL_BILL_END_DATE = By.id("masked-lease_start_windows[new_0][billing_end_date]");
    private final By LEASE_TERM_NAME = By.id("datebasedName");
    private final By ADD_PROPERTY_LINK = By.id("properties_count_0");
    private final By ADD_PROPERTY_TO_LEASE_TERM_BUTTON = By.id("addbutton");
    private final By UPDATE_BUTTON = By.id("property_update");
    private final By SAVE_LEASE_TERM_BUTTON = By.cssSelector("input[value='Save']");
    private final By EDIT_LEASE_TERM_STRUCTURES_OVERLAY = By.cssSelector("div[class='ui-widget-overlay ui-front']");
    private final By LEASE_TERM_STRUCTURES_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public LeaseTermStructuresPage(WebDriver driver) {super(driver);}

    public boolean clickAddTermStructure(){return clickElement(ADD_TERM_STRUCTURE);}

    public boolean confirmStructureNameFieldVisible(){return confirmElementIsVisible(LEASE_STRUCTURE_NAME_FIELD);}

    public boolean clickCancelButton(){return clickElement(CANCEL_BUTTON);}
    
    public boolean clickEditLeaseTermStructure(){return clickElement(FIRST_EDIT_LEASE_TERM_STRUCTURE);}

    public boolean enterLeaseTermStructureName() {
        clickElement(LEASE_STRUCTURE_NAME_FIELD);
        return sendKeysToElement(LEASE_STRUCTURE_NAME_FIELD, "Test Lease Structure");
    }

    public boolean clickAddProperty() { return clickElement(ADD_PROPERTY_BUTTON);}

    public boolean addPropertyToLeaseTermStructure() { return confirmElementIsVisible(PROPERTY_LIST); }

    public boolean enterPropertyInSearchFilter(){return sendKeysToElement(INPUT_PROPERTY_FIELD,PROPERTY_NAME,waitTimes.LONG_WAIT);}

    public String addProperty() {
        waitForOverlay(EDIT_LEASE_TERM_STRUCTURES_OVERLAY);
        clickElement(PROPERTY_ID);
        return getElementText(PROPERTY_ID,waitTimes.LONG_WAIT);
    }

    public boolean clickSaveLeaseTermButton() {
        return clickElement(SAVE_LEASE_TERM_STRUCTURE_BUTTON);}

    public boolean findAddedLeaseTerm() { return confirmElementIsVisible(TEST_LEASE_STRUCTURE);}

    //delete lease term test
    public boolean editLeaseStructure() {
        waitForOverlay(LEASE_TERM_STRUCTURES_OVERLAY);
        scrollDownToBottomOfPage();
        return clickElement(EDIT_LEASE_STRUCTURE_BUTTON); }

    public boolean checkDeleteButton() {
        confirmElementIsVisible(SAVE_LEASE_TERM_STRUCTURE_BUTTON);
        return confirmElementIsInvisible(DELETE_LEASE_STRUCTURE_BUTTON);}

    public boolean deletePropertyFromStructure() { return clickElement(DELETE_PROPERTY_FROM_LEASE_STRUCTURE );}

    public boolean confirmChange() { return  clickElement( CONFIRM_CHANGE_BUTTON);}

    public boolean clickDeleteStructure() { waitForOverlay(DELETE_PROPERTY_OVERLAY);
        return clickElement(DELETE_LEASE_STRUCTURE_BUTTON);}

    public boolean checkDeletedStructure() { return confirmElementIsInvisible(TEST_LEASE_STRUCTURE);}
    public boolean waitForSuccessMessage(){
        return    confirmElementIsVisible(SUCCESS_MESSAGE);
    }
    public String getSuccessMessageText(){
        return getElementText(SUCCESS_MESSAGE);
    }

    // add lease term start window test

    public boolean clickOccupancyDropdown() { confirmElementIsVisible(OCCUPANCY_DROPDOWN);
        return selectElementByText(By.xpath("//*[@id=\"occupancy-type\"]"),"Student");}

    public boolean enterLeaseTermName(String name){
        return sendKeysToElement(LEASE_TERM_NAME,name);}

    public boolean inputRenewalBillingStart(String date) { clickElement(RENEWAL_BILL_START_DATE);
        return  sendKeysToElement(RENEWAL_BILL_START_DATE,date);}

    public boolean inputRenewalLeaseStart(String date) { clickElement(RENEWAL_LEASE_START_DATE);
        return sendKeysToElement(RENEWAL_LEASE_START_DATE,date);}

    public boolean inputProspectLeaseStart(String date) { clickElement(PROSPECT_LEASE_START_DATE);
        return sendKeysToElement(PROSPECT_LEASE_START_DATE,date);}

    public boolean inputAllLeaseEnd(String date) { clickElement(ALL_LEASE_END_DATE);
        return sendKeysToElement(ALL_LEASE_END_DATE,date); }

    public String checkAllLeaseEndDate(){
        return getElementText(ALL_LEASE_END_DATE);
    }

    public String checkAllBillDate(){
        return getElementText(ALL_BILL_END_DATE);
    }

    public boolean selectPropertyForLeaseWindow() { return clickElement(ADD_PROPERTY_LINK);}

    public boolean clickAddPropertyToLeaseWindow() { return clickElement(ADD_PROPERTY_TO_LEASE_TERM_BUTTON);}

    public boolean clickUpdateButton() { return clickElement(UPDATE_BUTTON);}

    public boolean clickSave() { return clickElement(SAVE_LEASE_TERM_BUTTON);}

    public boolean clickPortRepublicLeaseTermExpand(){ return clickElement(PORT_REPUBLIC_LEASE_TERM);}

    public boolean clickPortRepublicAddLeaseTerm(){return clickElement(ADD_LEASE_TERM_PORT_REPUBLIC);}

    public boolean moveToAddPropertyButton(){return moveToAnElementWithActions(WEST_SIX_LEASE_TERM);}

    public boolean clickAddRepublicProperty(){ return clickElement(REPUBLIC_PROPERTY);}

}



