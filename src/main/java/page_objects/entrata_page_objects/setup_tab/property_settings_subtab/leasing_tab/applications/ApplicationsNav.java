package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApplicationsNav extends BasePage {

    public ApplicationsNav(WebDriver driver) {
        super(driver);}

    private final By ROOMMATE_INTERESTS = By.id("property_leasing_application_student_preferencesxxx");


    public boolean clickRoommateInterestsTab(){return clickElement(ROOMMATE_INTERESTS);}
}
