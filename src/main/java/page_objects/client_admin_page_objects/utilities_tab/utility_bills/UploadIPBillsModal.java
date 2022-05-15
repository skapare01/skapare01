package page_objects.client_admin_page_objects.utilities_tab.utility_bills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.io.File;

public class UploadIPBillsModal extends BasePage {
    //selectors
    private final By COMPANY_NAME_DROPDOWN = By.id("cid_0");
    private final By UPLOAD_FILE_BUTTON = By.id("document_0");
    private final By PREVIEW_UPLOAD_INVOICE = By.cssSelector("input[value^='Preview']");
    private final By COMPLETE_UPLOAD = By.id("complete_upload");

    private final String testCompany = "Aspen Heights";
    private final String testPDFpath = "src/main/java/resources/dummyPDF.pdf";

    public UploadIPBillsModal(WebDriver driver) {
        super(driver);
    }

    //methods
    public boolean selectTestCompanyFromDropdown() {
        return selectElementByText(COMPANY_NAME_DROPDOWN, testCompany);
    }
    public boolean enterTestFilePathIntoUploadField() {
        File testFile = new File(testPDFpath);
        return sendKeysToElement(UPLOAD_FILE_BUTTON, testFile.getAbsolutePath());
    }
    public boolean clickPreviewUploadInvoice() {
        return clickElement(PREVIEW_UPLOAD_INVOICE);
    }
    public boolean clickCompleteUpload() {
        return clickElement(COMPLETE_UPLOAD, waitTimes.LONG_WAIT);
    }
}
