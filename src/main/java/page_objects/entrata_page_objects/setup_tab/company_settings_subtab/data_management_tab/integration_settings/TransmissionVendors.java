package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TransmissionVendors extends BasePage{

    public TransmissionVendors(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By RESIDENTVERIFY = By.xpath("//*[text()='Resident Verify']");

    //Methods
    public boolean verifyResidentVerifyIsVisible() {
        return confirmElementIsVisible(RESIDENTVERIFY);
    }

}