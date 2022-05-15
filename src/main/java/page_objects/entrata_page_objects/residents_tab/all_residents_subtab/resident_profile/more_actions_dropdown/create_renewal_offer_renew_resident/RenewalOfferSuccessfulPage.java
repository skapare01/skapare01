package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RenewalOfferSuccessfulPage extends BasePage {
    private final By OFFER_CREATED_SUCCESSFULLY_PAGE_HEADER = By.xpath("//*[text()='Offers Created successfully']");
    private final By OFFER_CREATED_SUCCESSFULLY_SUCCESS_BANNER = By.cssSelector("p[class='alert success']");
    private final By EMAIL_OFFER_BUTTON = By.cssSelector("a[class='action button js-email_renewal_offers']");
    private final By PRINT_OFFER_BUTTON = By.cssSelector("a[class='action button js-print_renewal_offers']");
    private final By CLOSE_OFFER_BUTTON = By.cssSelector("a[class='action button js-close_renewal_offers']");
    private final By TOP_BANNER_CLOSE_BUTTON = By.cssSelector("I[class='close-button close']");

    public RenewalOfferSuccessfulPage(WebDriver driver) {
        super(driver);
    }

    public boolean offerCreatedSuccessfullyPageHeader() {
        return confirmElementIsVisible(OFFER_CREATED_SUCCESSFULLY_PAGE_HEADER, waitTimes.LONG_WAIT);
    }
    public boolean renewalCreatedSuccessBanner() {
        return confirmElementIsVisible(OFFER_CREATED_SUCCESSFULLY_SUCCESS_BANNER);
    }
    public boolean emailOfferButton() {
        return confirmElementIsVisible(EMAIL_OFFER_BUTTON);
    }
    public boolean printOfferButton() {
        return confirmElementIsVisible(PRINT_OFFER_BUTTON);
    }
    public boolean closeOfferButton() {
        return confirmElementIsVisible(CLOSE_OFFER_BUTTON);
    }
    public boolean topCloseButton() {
        return clickElement(TOP_BANNER_CLOSE_BUTTON);
    }
    public boolean closeRenewalTab(){return closeSecondTabAndReturnToPrimaryTab();}
}
