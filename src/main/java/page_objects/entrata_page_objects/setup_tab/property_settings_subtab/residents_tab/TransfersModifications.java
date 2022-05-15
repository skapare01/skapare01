package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TransfersModifications extends BasePage {
    //Subtabs
    private final By PROP_SET_TRANSFERS_SUB_TAB = By.id("property_residents_transfers_generalxxx");
    private final By PROP_SET_MID_LEASE_MOD_SUB_TAB = By.id("property_residents_transfers_midlease_modificationsxxx");
    private final By PROP_SET_TRANSFER_QUOTES_SUB_TAB = By.id("property_residents_transfers_quotesxxx");
    private final By PROP_SET_TRANSFER_REASONS_SUB_TAB = By.id("property_residents_transfers_reasonsxxx");
    //Transfer Quotes Variables
    private final By VERIFY_ENABLE_QUOTES = By.xpath("//td[text()='Enable Quotes:']");
    private final By EDIT_TRANSFER_QUOTES_BUTTON= By.id("settings-button");
    private final By ENABLE_DISABLE_TRANSFER_QUOTE_TOGGLE = By.cssSelector("div[data-offcontent='sub_quotes_edit']");
    private final By SETTING_QUOTE_VALID_FOR_HOURS_REQUIRED_FIELD = By.id("TRANSFER_QUOTE_IS_VALID_FOR");
    private final By SETTING_TRANSFER_QUOTE_EXPIRES_AT_FIELD = By.id("TRANSFER_QUOTE_EXPIRES_AT");
    private final By SETTING_TRANSFER_QUOTE_PRIMARY_COLOR = By.id("TRANSFER_QUOTE_PRIMARY_COLOR");
    private final By SETTING_TRANSFER_QUOTE_FROM_MANAGEMENT_TITLE = By.xpath("//*[text()='From The Management']");
    private final By SETTING_TRANSFER_QUOTE_FROM_MANAGEMENT_TEXT = By.id("TRANSFER_QUOTE_FROM_THE_MANAGEMENT");
    private final By SETTING_TRANSFER_QUOTE_DISCLAIMER_TEXT_FIELD = By.id("TRANSFER_QUOTE_DISCLAIMERS");
    private final By SETTING_TRANSFER_QUOTE_HIDE_MONTHLY_RENT_TOGGLE = By.xpath("//*[text()='Hide Monthly Rent (by term)']");
    private final By SETTING_TRANSFER_QUOTE_CUSTOM_QUOTE_URL = By.xpath("//*[text()='Customized Quote URL']");
    private final By SETTING_TRANSFER_QUOTE_SHOW_ADA_ICON = By.xpath("//*[text()='Show ADA Icon on Quote']");
    private final By SETTING_TRANSFER_QUOTE_RESIDENT_PORTAL_DISCLAIMER_TEXT = By.id("RESIDENT_PORTAL_DISCLAIMER_TEXT");
    private final By SETTING_TRANSFER_QUOTE_ALLOW_RES_TO_EDIT_OCCUPANTS= By.xpath("//*[text()='Allow Resident to Edit Occupants at Time of Transfer Quotes']");
    private final By SETTING_TRANSFER_QUOTE_SAVE_BUTTON = By.xpath("//input[@type='submit']");
    private final By TRANSFER_QUOTE_AFTER_SAVE_SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");

    public TransfersModifications(WebDriver driver) {
        super(driver);
    }

    //Transfers
    public boolean TransferModificationTransferTabVisible() {
        return confirmElementIsVisible(PROP_SET_TRANSFERS_SUB_TAB);
    }

    //MidLease Modifications
    public boolean TransferModificationMidLeaseModTabVisible() {
        return confirmElementIsVisible(PROP_SET_MID_LEASE_MOD_SUB_TAB);
    }

    //Transfer Quotes
    public boolean TransferModificationTransferQuotesTabVisible() {
        return confirmElementIsVisible(PROP_SET_TRANSFER_QUOTES_SUB_TAB);
    }
    public boolean TransferModificationTransferQuotesTabClick() {
        return clickElement(PROP_SET_TRANSFER_QUOTES_SUB_TAB);
    }
    public boolean EnableQuotesSettingExists() {
        return confirmElementIsVisible(VERIFY_ENABLE_QUOTES);
    }
    public boolean editEnableQuoteSetting() {
        return clickElement(EDIT_TRANSFER_QUOTES_BUTTON);
    }
    public boolean toggleEnableQuoteSetting() {
        return clickElement(ENABLE_DISABLE_TRANSFER_QUOTE_TOGGLE);
    }
    public boolean quoteIsValidForHoursField() {
        return confirmElementIsVisible(SETTING_QUOTE_VALID_FOR_HOURS_REQUIRED_FIELD, waitTimes.LONG_WAIT);
    }
    public boolean quoteIsValidForHoursFieldEnterRequired() {
        return clickElement(SETTING_QUOTE_VALID_FOR_HOURS_REQUIRED_FIELD);
    }
    public boolean quoteIsValidForHoursFieldEnterRequiredClearTextField() {
        return elementClearTextField(SETTING_QUOTE_VALID_FOR_HOURS_REQUIRED_FIELD);
    }
    public boolean quoteIsValidForHoursFieldEnterRequiredSetHours(){
        return sendKeysToElement(SETTING_QUOTE_VALID_FOR_HOURS_REQUIRED_FIELD, "48");
    }
    public boolean quoteExpiresAtField() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_EXPIRES_AT_FIELD);
    }
    public boolean quotePrimaryColorField() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_PRIMARY_COLOR);
    }
    public boolean quoteFromTheManagementTitleField() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_FROM_MANAGEMENT_TITLE);
    }
    public boolean quoteFromTheManagementTextField() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_FROM_MANAGEMENT_TEXT);
    }
    public boolean quoteDisclaimersTextField() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_DISCLAIMER_TEXT_FIELD);
    }
    public boolean quoteHideMonthlyRentToggle() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_HIDE_MONTHLY_RENT_TOGGLE);
    }
    public boolean quoteCustomizedQuoteURL() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_CUSTOM_QUOTE_URL);
    }
    public boolean quoteShowADAIcon() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_SHOW_ADA_ICON);
    }
    public boolean quoteResPortalDisclaimerText() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_RESIDENT_PORTAL_DISCLAIMER_TEXT);
    }
    public boolean quoteAllowResToEditOccupantsAtTimeOfTransferQuotes() {
        return confirmElementIsVisible(SETTING_TRANSFER_QUOTE_ALLOW_RES_TO_EDIT_OCCUPANTS);
    }
    public boolean SaveEnableQuoteSettings() {
        return clickElement(SETTING_TRANSFER_QUOTE_SAVE_BUTTON);
    }
    public boolean enableQuotesSaveBanner() {
        return confirmElementIsVisible(TRANSFER_QUOTE_AFTER_SAVE_SUCCESS_BANNER);
    }

    //Transfer Reasons
    public boolean TransferModificationTransferReasonsTabVisible() {
        return confirmElementIsVisible(PROP_SET_TRANSFER_REASONS_SUB_TAB);
    }

}
