package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveOutNav extends BasePage {
    public MoveOutNav(WebDriver driver){
        super(driver);}
    private final By FMO_TAB = By.id("property_residents_moveout_fmo_statementxxx");
    private final By MOVEOUT_REASONS_TAB = By.id("property_residents_moveout_reasonsxxx");

    public boolean clickFMOTab(){return clickElement(FMO_TAB);}
    public boolean clickMoveOutReasonsTab(){return  clickElement(MOVEOUT_REASONS_TAB);}
}
