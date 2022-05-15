package page_objects.entrata_page_objects.leads_tab.lead_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.io.File;

public class ProcessScreeningPage extends BasePage {

    private final By PACKAGE_TYPE_DROPDOWN = By.id("resident_verify_applicant_package");
    private final By UPLOAD_BUTTON = By.linkText("Upload");
    private final By UPLOAD_SCREENING_DOCUMENT_CHOOSE_FILE = By.id("screening_document");
    private final By UPLOAD_BUTTON_AFTER_UPLOADING_FILE = By.id("btnSave");
    private final By PROCESS_SCREENING_BUTTON = By.id("btn_process_screening");

    //RV TEST PACKAGE LIST
    private final String CRIMINAL_FAIL = "92857";

    public ProcessScreeningPage(WebDriver driver){
        super(driver);
    }

    public boolean selectCriminalFailPackageFromDropdown(){return selectElementByValue(PACKAGE_TYPE_DROPDOWN, CRIMINAL_FAIL);}
    public boolean clickUploadButton(){return clickElement(UPLOAD_BUTTON);}
    public boolean screeningDocumentAdd() {
        File myFile = new File("src/main/java/resources/dummyPDF.pdf");
        String path = myFile.getAbsolutePath();
        return sendKeysToElement(UPLOAD_SCREENING_DOCUMENT_CHOOSE_FILE, path, waitTimes.LONG_WAIT);
    }
    public boolean clickUploadButtonAfterUploadingFile(){return clickElement(UPLOAD_BUTTON_AFTER_UPLOADING_FILE);}
    public boolean clickProcessScreeningButton(){return clickElement(PROCESS_SCREENING_BUTTON);}
}
