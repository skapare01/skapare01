package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InspectionsCurtain extends BasePage {

    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close'");

    public InspectionsCurtain(WebDriver driver) { super(driver); }

    public boolean clickCloseButton() { return clickElement(CLOSE_BUTTON); }

}
