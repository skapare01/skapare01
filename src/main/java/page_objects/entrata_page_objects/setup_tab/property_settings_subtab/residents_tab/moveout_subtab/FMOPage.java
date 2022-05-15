package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FMOPage extends BasePage {
    public FMOPage(WebDriver driver){
        super(driver);}

    private final By EDIT_FMO_STATEMENT_SETTING = By.id("fmo-statement-button");

    public boolean confirmVisibilityOfEditFMOButton(){return confirmElementIsVisible(EDIT_FMO_STATEMENT_SETTING);}
}
