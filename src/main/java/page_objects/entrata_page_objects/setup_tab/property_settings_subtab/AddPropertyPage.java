package page_objects.entrata_page_objects.setup_tab.property_settings_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddPropertyPage extends BasePage {

    private final By PROPERTY_TYPE_DROPDOWN = By.id("property_type_id");

    public AddPropertyPage(WebDriver driver){
        super(driver);}

    public boolean findPropertyTypeDropdown(){return clickElement(PROPERTY_TYPE_DROPDOWN);}
}
