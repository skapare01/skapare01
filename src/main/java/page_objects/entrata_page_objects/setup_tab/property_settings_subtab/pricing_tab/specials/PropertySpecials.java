package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.specials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertySpecials extends BasePage {

    private final By ADD_PROPERTY_SPECIAL = By.cssSelector(".js-add-special");
    private final By CLOSE_POP_UP = By.cssSelector(".ui-button-text");

    public PropertySpecials(WebDriver driver) {super(driver);}
    public boolean clickAddPropertySpecial() {return clickElement(ADD_PROPERTY_SPECIAL); }
    public boolean closePopUp() {return clickElement(CLOSE_POP_UP); }
}