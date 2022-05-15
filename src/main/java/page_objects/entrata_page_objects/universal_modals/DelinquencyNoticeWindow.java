package page_objects.entrata_page_objects.universal_modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DelinquencyNoticeWindow extends BasePage {

    public DelinquencyNoticeWindow(WebDriver driver) {
        super(driver);
    }

    //Delinquency locators
    private final By DELINQUENCY_NOTICE_WINDOW = By.xpath("//div/span[text()='Delinquency Notice']");
    private final By DELINQUENCY_NOTICE_CLOSE_BUTTON = By.xpath("//button/span[text()='Close']");

    public boolean confirmDelinquencyNoticeWindow() {
        if (confirmElementIsVisible(DELINQUENCY_NOTICE_WINDOW, waitTimes.SHORT_WAIT)) {
            return clickElement(DELINQUENCY_NOTICE_CLOSE_BUTTON, waitTimes.SHORT_WAIT);
        } else {
            System.out.println("Delinquency Notice Window not found");
            return true;
        }
    }

}
