package page_objects.entrata_page_objects.accounting_tab.ap_export_batches_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class APExportBatchesPage extends BasePage {

    public APExportBatchesPage(WebDriver driver) {super(driver);}

    private final By LISTING_CONTAINER = By.id("ap_export_batches_list_container");

    public boolean confirmVisibilityOfListingContainer() {return confirmElementIsVisible(LISTING_CONTAINER);}
}
