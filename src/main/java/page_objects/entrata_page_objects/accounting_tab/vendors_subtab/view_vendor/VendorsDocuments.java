package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.io.File;

public class VendorsDocuments extends BasePage {

    public VendorsDocuments(WebDriver driver) {
        super(driver);
    }

    private final By DOCUMENTS_TAB = By.cssSelector("a[onclick*='ap_payee_documents']");
    private final By DOCUMENTS_INFO = By.id("view_vendor_document");
    private final By UPLOAD_NEW_DOCUMENT = By.cssSelector("a[onclick*='Upload New Document']");
    private final By CHOOSE_FILE_BUTTON = By.id("ap_payee_file_name");
    private final By TYPE = By.id("file_type_id");
    private final By LOCATION = By.id("ap_payee_location_id");
    private final By UPLOAD_BUTTON = By.cssSelector("input[value='Upload']");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    public boolean documentsTabClick() {
        return clickElement(DOCUMENTS_TAB);
    }

    public boolean uploadNewDocumentClick() {
        return clickElement(UPLOAD_NEW_DOCUMENT);
    }

    public boolean uploadFile() {
        File myFile = new File("src/main/java/resources/test.pdf");
        String path = myFile.getAbsolutePath();

        return sendKeysToElement(CHOOSE_FILE_BUTTON, path);
    }

    public boolean fileTypeSelect()  { return selectElementByIndex(TYPE, 1); }

    public boolean fileLocationSelect() {
        return selectElementByIndex(LOCATION, 1);
    }

    public boolean uploadButtonClick() {
        return clickElement(UPLOAD_BUTTON);
    }


    //Visibility

    public boolean documentsInfoVisible() {
        return confirmElementIsVisible(DOCUMENTS_INFO);
    }

    public boolean chooseFileButtonVisible() {
        return confirmElementIsVisible(CHOOSE_FILE_BUTTON);
    }

    public boolean typeVisible() {
        return confirmElementIsVisible(TYPE);
    }

    public boolean locationVisible() {
        return confirmElementIsVisible(LOCATION);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
