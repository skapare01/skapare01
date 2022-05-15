package page_objects.entrata_page_objects.apps_tab._1099_misc_e_file_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class _1099_MISC_E_FilePage extends BasePage {

    public _1099_MISC_E_FilePage(WebDriver driver) {super(driver);}

    private final By EMAIL_INPUT = By.cssSelector("name='email'");

    public boolean confirmVisibilityOfMainContent1() { return confirmElementIsVisible(EMAIL_INPUT);}
}
