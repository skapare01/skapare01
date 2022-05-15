package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Home locators
    private final By VERIFY_HOME_PROPERTY_INFORMATION_SECTION = By.xpath("//*[@id=\"home_property_details_div\"]/h4");
    private final By VERIFY_HOME_RECERTIFICATIONS_SECTION = By.xpath("//*[@id=\"certification_details_div\"]/h3");
    private final By VERIFY_HOME_RENT_LIMITS_SECTION = By.xpath("//*[@id=\"home_rent_limits\"]/h4");
    private final By VERIFY_HOME_PROGRAM_RENTS_SECTION = By.xpath("//*[@id=\"home_program_rents_details_div\"]/h4");

    //Confirm Home sections methods
    public String confirmHomePropertyInfoSection() {
        return getElementText(VERIFY_HOME_PROPERTY_INFORMATION_SECTION);
    }

    public String confirmHomeRecertificationsSection() {
        return getElementText(VERIFY_HOME_RECERTIFICATIONS_SECTION);
    }

    public String confirmHomeRentLimitsSection() {
        return getElementText(VERIFY_HOME_RENT_LIMITS_SECTION);
    }

    public String confirmHomeProgramRentsSections() {
        return getElementText(VERIFY_HOME_PROGRAM_RENTS_SECTION);
    }

}
