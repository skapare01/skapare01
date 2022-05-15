package page_objects.client_admin_page_objects.support_tab.tooltips_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver){
        super(driver);}
    private final By ADD_TOOLTIP = By.id("js-add_tool_tip");

    public boolean confirmAddToolTipVisible(){return confirmElementIsVisible(ADD_TOOLTIP);}
}
