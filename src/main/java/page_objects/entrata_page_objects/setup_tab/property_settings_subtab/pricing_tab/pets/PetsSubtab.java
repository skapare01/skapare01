package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.pets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PetsSubtab extends BasePage {

    private final By ADD_PET_TYPE_BUTTON = By.id("btn_add_pet_rate_association");

    public PetsSubtab(WebDriver driver) {
        super(driver);
    }

    public boolean clickAddPetTypeButton() {return clickElement(ADD_PET_TYPE_BUTTON); }


}
