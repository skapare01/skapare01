package page_objects.resident_insure_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentInsureWebsitePage extends BasePage {

    private final By RI_WEBSITE_ZIP_CODE_FIELD = By.id("upper_zip_code");
    private final By RI_WEBSITE_GET_QUOTE_BUTTON = By.cssSelector("button.get-quote-btn");

    public ResidentInsureWebsitePage(WebDriver driver) {
        super(driver);
    }

    public boolean switchToResidentInsureWebsite () {
        return switchToRecentlyOpenedTab();
    }

    public boolean findWebsiteZipCodeField() { return confirmElementIsVisible(RI_WEBSITE_ZIP_CODE_FIELD); }

    public boolean findWebsiteGetQuoteButton() { return confirmElementIsVisible(RI_WEBSITE_GET_QUOTE_BUTTON); }

}
