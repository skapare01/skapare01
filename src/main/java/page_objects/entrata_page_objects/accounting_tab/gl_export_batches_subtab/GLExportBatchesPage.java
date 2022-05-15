package page_objects.entrata_page_objects.accounting_tab.gl_export_batches_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GLExportBatchesPage extends BasePage {

    public GLExportBatchesPage(WebDriver driver) {super(driver);}

    private final By GL_EXPORT_BATCHES_LISTING_CONTAINER = By.id("printGridGlExportBatches");

    public boolean ConfirmVisibilityOfGLExportBatchesListingContainer() {return confirmElementIsVisible(GL_EXPORT_BATCHES_LISTING_CONTAINER);}

}
