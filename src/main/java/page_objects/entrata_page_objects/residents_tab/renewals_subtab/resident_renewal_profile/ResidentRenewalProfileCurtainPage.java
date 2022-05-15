package page_objects.entrata_page_objects.residents_tab.renewals_subtab.resident_renewal_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentRenewalProfileCurtainPage extends BasePage {
    private final By RESIDENT_RENEWAL_MORE_ACTIONS_DROPDOWN = By.xpath("//a[contains(text(),'More Actions')]");
    private final By MORE_ACTIONS_DROPDOWN_CANCEL_RENEWAL = By.xpath("//li[contains(text(),'Cancel Renewal')]");
    private final By RENEWAL_OFFER_CANCELLED_STATUS_TEXT = By.xpath("//h4[text()='Renewal Offer: Cancelled']");

    public ResidentRenewalProfileCurtainPage(WebDriver driver) {
        super(driver);
    }

    public boolean residentRenewalMoreActionsDropdown() {
        switchToRecentlyOpenedTab();
        return clickElement(RESIDENT_RENEWAL_MORE_ACTIONS_DROPDOWN);
    }
    public boolean moreActionsClickCancelRenewalProgress() {
        return clickElement(MORE_ACTIONS_DROPDOWN_CANCEL_RENEWAL);
    }
    public boolean renewalOfferCancelledTextVisible() {
        return confirmElementIsVisible(RENEWAL_OFFER_CANCELLED_STATUS_TEXT);
    }
}
