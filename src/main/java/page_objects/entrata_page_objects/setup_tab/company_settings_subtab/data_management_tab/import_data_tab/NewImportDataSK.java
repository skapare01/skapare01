package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_objects.BasePage;

import java.util.List;

public class NewImportDataSK extends BasePage {

    public NewImportDataSK(WebDriver driver) {
        super(driver);
    }


    private final By import_data_new_CSV = By.id("view_import_data");
    private final By upload_data = By.id("data_upload_submit");

    private final By choose_locale = By.id("import_target_locale_code");

    private final By property_type = By.name("import_data_details[property_type_id]");

    private final By import_type = By.xpath("//span[@id = 'import_type_select']");

    private final By import_type_select = By.xpath("//*[@id=\"import_data_list\"]//li");

    private final By importListMessage = By.id("import_data_list_message");

    private final By upload_csv = By.id("import_data_file");
    public boolean newImportDataPage1() {
        return clickElement(import_data_new_CSV);
    }
    public boolean choseLocal() {
        return selectElementByValue(choose_locale,"fr_FR");
    }

    public boolean choosePropertyType() {
        return selectElementByValue(property_type,"2");
    }

    public boolean chooseImportType() {
        return clickElement(import_type);
    }

    public boolean selectImportType() {
        return clickElement(import_type_select);
    }



   public boolean selectImportTypeFromDrop()
   {
       return selectFromDropdownForOtherTypeElement(import_type_select,"Occupants");
   }

    public boolean uploadCSV() {

        return sendKeysToElement(upload_csv,"D:\\Regression Testing\\Residential CSV\\05172022\\Done\\occupants (7).xlsx");
    }

    public boolean uploadButton()
    {
        return clickElement(upload_data);

    }

    public void uploadButtonOverlay()
    {
        waitForOverlay(upload_data);
    }

    public boolean ImportDataListMessage()
    {
        return confirmElementIsVisible(importListMessage);
    }


}
