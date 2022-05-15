package page_objects.entrata_page_objects.accounting_tab.vendors_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_objects.BasePage;

import java.util.Objects;

public class VendorsPage extends BasePage {


    public VendorsPage(WebDriver driver) {
        super(driver);
    }

    private final By FIRST_LISTED_VENDOR = By.cssSelector("tr[class='aRow js-view-ap-payee']");
    private final By BULK_EDIT_VENDORS = By.id("BulkEditVendors");
    private final By ADD_NEW_VENDOR_BUTTON = By.cssSelector("a[onclick*='Add Vendor']");
    private final By TOOLS = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By IMPORT_VENDORS_BUTTON = By.cssSelector("a[onclick*='Import Vendors']");
    private final By IMPORT_VENDORS_FORM = By.id("import_vendors_popup");
    private final By CLOSE_FILTER = By.className("view-data-close");
    private final By VIEW_VENDOR = By.id("ap_payee_popup_div");
    private final By VENDOR_STATUS_BOX = By.id("ap_payee_status_container");
    private final By VENDOR_QUICK_VIEW_BOX = By.id("quick_view");
    private final By VENDOR_QUICK_VIEW_EDIT_BUTTON = By.id("quickeditButton");
    private final By VENDOR_ADD_ACTIVITY_BOX = By.id("vendor_activity_container_side_bar");
    private final By ACTION_MENU = By.cssSelector("a[class='button action menu nomargin binded binded-hover-intent']");
    private final By PLACE_ON_HOLD = By.cssSelector("li[onclick*='ap_payee_status_type[id]=3']");
    private final By MAKE_INACTIVE = By.cssSelector("li[onclick*='ap_payee_status_type[id]=2']");
    private final By PERMANENTLY_DELETE = By.cssSelector("li[class='deleteVendor binded']");
    private final By DELETE_POPUP_FORM = By.id("overlayForm");
    private final By DELETE_CONFIRM = By.id("confirmation_continue");
    private final By CANCEL_DELETION_HYPERLINK = By.id("confirmation_cancel");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");

    //Edit Vendor Info

    private final By EDIT_VENDOR_INFO = By.id("edit_vendor_info");
    private final By BUSINESS_NAME = By.name("ap_payee[company_name]");
    private final By PAYMENT_TERMS = By.name("ap_payee[ap_payee_term_id]");
    private final By SAVE_VENDOR_INFO_EDIT = By.id("submit_vendor_information");

    public boolean firstListedVendorClick() {
        return clickElement(FIRST_LISTED_VENDOR);
    }

    public boolean bulkEditVendorsButtonClick() {
        return clickElement(BULK_EDIT_VENDORS);
    }

    public boolean closeVendorFilter() {
        return clickElement(CLOSE_FILTER);
    }

    public boolean addNewVendor() {
        return clickElement(ADD_NEW_VENDOR_BUTTON);
    }

    public boolean toolsHover() {
        return moveToAnElementWithActions(TOOLS);
    }

    public boolean importVendorsClick() {
        return clickElement(IMPORT_VENDORS_BUTTON);
    }

    public boolean actionMenuClick() {
        return clickElement(ACTION_MENU);
    }

    public boolean permanentlyDeleteVendorClick() { return clickElement(PERMANENTLY_DELETE); }

    public boolean confirmDeleteClick() {
        return clickElement(DELETE_CONFIRM);
    }

    //Edit Vendor Info

    public boolean editVendorInfoClick() {
        return clickElement(EDIT_VENDOR_INFO);
    }

    public boolean businessNameInput(String name) {
        elementClearTextField(BUSINESS_NAME);
        return sendKeysToElement(BUSINESS_NAME, name);
    }

    public boolean paymentTermsSelect() {
        WebElement element = driver.findElement(PAYMENT_TERMS);
        String value = element.getAttribute("value");
        if (Objects.equals(value, "23058")) {
            return selectElementByValue(PAYMENT_TERMS, "23059");
        } else {
            return selectElementByValue(PAYMENT_TERMS, "23058");
        }
    }

    public boolean saveVendorEditInfoButtonClick() {
        return clickElement(SAVE_VENDOR_INFO_EDIT);
    }


    //Visibility

    public boolean vendorStatusBoxVisible() {
        return confirmElementIsVisible(VENDOR_STATUS_BOX);
    }

    public boolean vendorQuickViewBoxVisible() {
        return confirmElementIsVisible(VENDOR_QUICK_VIEW_BOX);
    }

    public boolean vendorQuickViewButtonVisible() {
        return confirmElementIsVisible(VENDOR_QUICK_VIEW_EDIT_BUTTON);
    }

    public boolean vendorAddActivityBoxVisible() {
        return confirmElementIsVisible(VENDOR_ADD_ACTIVITY_BOX);
    }

    public boolean placeOnHoldVisible() {
        return confirmElementIsVisible(PLACE_ON_HOLD);
    }

    public boolean makeInactiveVisible() {
        return confirmElementIsVisible(MAKE_INACTIVE);
    }

    public boolean permanentlyDeleteVisible() {
        return confirmElementIsVisible(PERMANENTLY_DELETE);
    }

    public boolean deletePopupFormVisible() {
        return confirmElementIsVisible(DELETE_POPUP_FORM);
    }

    public boolean deleteConfirmVisible() {
        return confirmElementIsVisible(DELETE_CONFIRM);
    }

    public boolean cancelDeleteHyperlinkVisible() {
        return confirmElementIsVisible(CANCEL_DELETION_HYPERLINK);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER, waitTimes.LONG_WAIT);
    }

    public boolean viewVendorVisible() {
        return confirmElementIsVisible(VIEW_VENDOR);
    }

    public boolean importVendorsFormVisible() {
        return confirmElementIsVisible(IMPORT_VENDORS_FORM);
    }
}
