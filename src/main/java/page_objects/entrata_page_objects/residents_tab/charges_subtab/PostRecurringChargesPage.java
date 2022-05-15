package page_objects.entrata_page_objects.residents_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostRecurringChargesPage extends BasePage {
    //Variables:
    private final By APPLY_BUTTON = By.cssSelector("a[onclick='changeDate()']");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    //Constructor method:
    public PostRecurringChargesPage(WebDriver driver) {
        super(driver);
    }
    
    //Methods:
    public boolean verifyApplyButtonPresent() {
        waitForOverlayAfterClickingPostRecurringCharges();
        return confirmElementIsVisible(APPLY_BUTTON, waitTimes.LUDICROUS_WAIT);
    }
    private void waitForOverlayAfterClickingPostRecurringCharges() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.LONG_WAIT);
    }
}
