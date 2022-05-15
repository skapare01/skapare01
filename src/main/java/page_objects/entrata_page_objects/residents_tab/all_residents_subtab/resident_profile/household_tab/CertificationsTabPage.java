package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CertificationsTabPage extends BasePage {

    //Resident Profile Certifications tab locators
    private final By CERTIFICATION_INFO_SECTION = By.xpath("//*[@id=\"certification_dates\"]/b/h4");
    private final By CERTIFICATIONS_SECTION = By.id("certifications");

    public CertificationsTabPage(WebDriver driver) {
        super(driver);
    }

    //Resident Profile Certification methods
    public String confirmCertificationInfo() {
        return getElementText(CERTIFICATION_INFO_SECTION);
    }

    public boolean confirmCertificationsSection() {
        return confirmElementIsVisible(CERTIFICATIONS_SECTION);
    }
}
