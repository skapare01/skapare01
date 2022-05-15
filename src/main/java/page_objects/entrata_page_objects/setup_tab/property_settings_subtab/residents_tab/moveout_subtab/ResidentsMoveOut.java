package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentsMoveOut extends BasePage {
    public ResidentsMoveOut(WebDriver driver){
        super(driver);
    }

    private final By EDIT_MOVE_OUT_SETTINGS = By.id("move_out_preferences-button");


    public boolean verifyVisibilityOfEditMoveOutSettings(){return confirmElementIsVisible(EDIT_MOVE_OUT_SETTINGS);}
}
