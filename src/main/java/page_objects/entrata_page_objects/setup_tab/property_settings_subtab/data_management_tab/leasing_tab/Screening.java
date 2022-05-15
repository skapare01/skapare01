package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.leasing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Screening extends BasePage {

    public Screening(WebDriver driver) {
        super(driver);
    }

    private final By RESIDENTVERIFYTEXTFINDER = By.xpath("//*[text()='Resident Verify ']");

    public boolean findResidentVerifyText() {
        return confirmElementIsVisible(RESIDENTVERIFYTEXTFINDER);
    }

}