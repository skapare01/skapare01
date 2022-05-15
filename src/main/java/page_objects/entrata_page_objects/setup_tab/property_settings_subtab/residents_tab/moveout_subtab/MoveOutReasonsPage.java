package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveOutReasonsPage extends BasePage {
    public MoveOutReasonsPage(WebDriver driver){
        super(driver);}
    private final By EDIT_MOVEOUT_REASONS = By.id("edit-move-out-reasons");

    public boolean confirmVisibilityOfEditMoveOutReasons(){return confirmElementIsVisible(EDIT_MOVEOUT_REASONS);}

}
