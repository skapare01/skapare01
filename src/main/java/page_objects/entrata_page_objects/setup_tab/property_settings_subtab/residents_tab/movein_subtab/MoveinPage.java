package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveinPage extends BasePage {

    public MoveinPage(WebDriver driver) {
        super(driver);}

    private final By EDIT_MOVEIN = By.id("move-in-button");
    private final By SAVE_BUTTON = By.cssSelector("input[value='Save']");

    public boolean clickEditMovein(){return clickElement(EDIT_MOVEIN);}
    public boolean clickSaveButton(){return clickElement(SAVE_BUTTON);}
    public boolean verifyEditMoveinButtonVisible(){return confirmElementIsVisible(EDIT_MOVEIN);}
}
