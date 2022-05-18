package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class import_data_new_tab_SK extends BasePage {

    public import_data_new_tab_SK(WebDriver driver) {
        super(driver);
    }


    private final By import_data_new_CSV = By.id("view_import_data");
    private final By upload_data = By.id("data_upload_submit");
    public boolean new_import_data_page1() {
        return clickElement(import_data_new_CSV);
    }

        public boolean upload() {
            return clickElement(upload_data);
        }




}
