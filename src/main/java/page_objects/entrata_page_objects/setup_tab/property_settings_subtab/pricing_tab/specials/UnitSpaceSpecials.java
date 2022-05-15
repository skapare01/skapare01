package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.specials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UnitSpaceSpecials extends BasePage {

    private final By ADD_UNIT_SPACE_SPECIAL = By.cssSelector(".js-add-unit-space-special");

    public UnitSpaceSpecials(WebDriver driver) {
        super(driver);
    }
    public boolean clickAddUnitSpaceSpecial() {return clickElement(ADD_UNIT_SPACE_SPECIAL); }


}