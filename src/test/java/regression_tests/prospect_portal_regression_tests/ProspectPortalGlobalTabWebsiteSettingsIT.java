package regression_tests.prospect_portal_regression_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import static junit.framework.Assert.assertTrue;

import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.GlobalSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.cookie_settings_subtab.CookieSettingsSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.domains_subtab.DomainsSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.encryption_subtab.EncryptionSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab.*;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.snippets_subtab.SnippetsSubTab;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.wrappers_subtab.WrappersSubTab;

public class ProspectPortalGlobalTabWebsiteSettingsIT extends BaseBrowserTest{
            public ProspectPortalGlobalTabWebsiteSettingsIT() {
                super("kHansen");
            }

            @Test
        // Analytic Settings //
        public void shouldCheckWebsiteGlobalInfoAnalyticSettings_whenGlobalInfoSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to select Info sub-tab", global.infoSubTab());
            AnalyticSettings globalInfoAnalytics = new AnalyticSettings(driver);
            assertTrue("Unable to locate Analytic Settings header", globalInfoAnalytics.analyticSetting());
            assertTrue("Unable to locate Analytic Settings 'Edit' button", globalInfoAnalytics.analyticsEditButton());
            assertTrue("Unable to locate Bing Webmaster Meta Tag Key text", globalInfoAnalytics.bingWebmasterMetaTagKey());
            assertTrue("Unable to locate Bing Webmaster Meta Tag Key Tool Tips", globalInfoAnalytics.bingWebmasterMetaTagKeyToolTips());
            assertTrue("Unable to locate Bing Ads UET Key text", globalInfoAnalytics.bingAdsUETKey());
            assertTrue("Unable to locate Bing Ads UET Key Tool Tips", globalInfoAnalytics.bingAdsUETKeyToolTips());
            assertTrue("Unable to locate 'Google Analytics 4 Measurement ID' text.",globalInfoAnalytics.locateGoogleAnalytics4MeasurementIdText());
            assertTrue("Unable to locate 'Google Analytics 4 Measurement ID' Tool Tips.",globalInfoAnalytics.clickGoogleAnalytics4MeasurementIdToolTips());
            assertTrue("Unable to locate 'Google Universal Analytics Tracking ID' text", globalInfoAnalytics.googleUniversalAnalyticsTrackingId());
            assertTrue("Unable to locate 'Google Universal Analytics Tracking ID' Tool Tips.", globalInfoAnalytics.googleUniversalAnalyticsTrackingIdToolTips());
            assertTrue("Unable to locate 'Google Universal Analytics Macro Tracking ID' text", globalInfoAnalytics.googleUniversalAnalyticsMacroTrackingId());
            assertTrue("Unable to locate 'Google Universal Analytics Macro Tracking ID' Tool Tips.", globalInfoAnalytics.googleUniversalAnalyticsMacroTrackingIdToolTips());
            assertTrue("Unable to locate Google Ads Snippet text", globalInfoAnalytics.googleAdsPhoneSnippet());
            assertTrue("Unable to locate Google Ads Phone Snippet Tool Tips.", globalInfoAnalytics.googleAdsPhoneSnippetToolTips());
            assertTrue("Unable to locate Google Tag Manager Key text", globalInfoAnalytics.googleTagManagerKey());
            assertTrue("Unable to locate Google Tag Manager Key Tool Tips.", globalInfoAnalytics.googleTagManagerKeyToolTips());
            assertTrue("Unable to locate Google Search Console Meta Tag Key text", globalInfoAnalytics.googleSearchConsoleMetaTagKey());
            assertTrue("Unable to locate Google Search Console Meta Tag Key Tool Tips.", globalInfoAnalytics.googleSearchConsoleMetaTagKeyToolTips());
            assertTrue("Unable to locate ResidentPortal Google Analytics Tracking Key text", globalInfoAnalytics.residentPortalGoogleAnalyticsTrackingKey());
            assertTrue("Unable to locate ResidentPortal Google Analytics Tracking Key Tool Tips.", globalInfoAnalytics.residentPortalGoogleAnalyticsTrackingKeyToolTips());
            assertTrue("Unable to locate ResidentPortal Google Analytics Macro Tracking Key text.", globalInfoAnalytics.residentPortalGoogleAnalyticsMacroTrackingKey());
            assertTrue("Unable to locate ResidentPortal Google Analytics Macro Tracking Key Tool Tips.", globalInfoAnalytics.residentPortalGoogleAnalyticsMacroTrackingKeyToolTips());
        }
        @Test
        // Social Media Analytics Settings //
        public void shouldCheckWebsiteGlobalInfoSocialMediaSettings_whenGlobalInfoSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to select Info sub-tab", global.infoSubTab());
            SocialMediaSettings globalInfoSocialMedia = new SocialMediaSettings(driver);
            assertTrue("Unable to locate Social Media Analytics Settings text", globalInfoSocialMedia.socialMediaAnalyticsSettings());
            assertTrue("Unable to locate Social Media Analytics Settings 'Edit' button", globalInfoSocialMedia.socialMediaEditBtn());
            assertTrue("Unable to locate Facebook Pixel Tracking Code text", globalInfoSocialMedia.facebookPixelTrackingCode());
            assertTrue("Unable to locate Facebook Pixel Tacking Code Tool Tips.", globalInfoSocialMedia.facebookPixelTrackingCodeToolTips());
            assertTrue("Unable to locate Pinterest Meta Tag Key text.", globalInfoSocialMedia.pinterestMetaTagKey());
            assertTrue("Unable to locate Pinterest Meta Tag Key Tool Tips.", globalInfoSocialMedia.pinterestMetaTagKeyToolTips());
        }
        @Test
        //  Footer Settings  //
        public void shouldCheckWebsiteGlobalInfoFooterSettings_whenGlobalInfoSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to select Info sub-tab", global.infoSubTab());
            FooterSettings globalInfoFooter = new FooterSettings(driver);
            assertTrue("Unable to locate Footer Settings text", globalInfoFooter.footerSettings());
            assertTrue("Unable to locate Footer Settings 'Edit' button", globalInfoFooter.footerSettingsEditBtn());
            assertTrue("Unable to locate Employee Portal text", globalInfoFooter.employeePortal());
            assertTrue("Unable to locate Employee Portal Tool Tips", globalInfoFooter.employeePortalToolTips());
            assertTrue("Unable to locate Owner Portal text.", globalInfoFooter.ownerPortal());
            assertTrue("Unable to locate Owner Portal Tool Tips.", globalInfoFooter.ownerPortalToolTips());
            assertTrue("Unable to locate Rename Owner Portal text.", globalInfoFooter.renameOwnerPortal());
            assertTrue("Unable to locate Rename Owner Portal Tool Tips.", globalInfoFooter.renameOwnerPortalToolTips());
            assertTrue("Unable to locate Customer Footer Text text", globalInfoFooter.customFooterText());
            assertTrue("Unable to locate Customer Footer Text Tools Tips", globalInfoFooter.customFooterTextToolTips());
        }
        @Test
        // Website Settings //
        public void shouldCheckWebsiteGlobalInfoWebsiteSettings_whenGlobalInfoSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to select Info sub-tab", global.infoSubTab());
            WebsiteSettings globalInfoWebsite = new WebsiteSettings(driver);
            assertTrue("Unable to locate Website Settings text", globalInfoWebsite.websiteSettings());
            assertTrue("Unable to locate Website Settings 'Edit' button", globalInfoWebsite.websiteSettingsEditBtn());
            assertTrue("Unable to locate ADA Icon text.", globalInfoWebsite.adaIcon());
            assertTrue("Unable to locate ADA Icon Tool Tips.", globalInfoWebsite.adaIconToolTips());
            assertTrue("Unable to locate TTY Number text.", globalInfoWebsite.ttyNumber());
            assertTrue("Unable to locate TTY Number Tool Tips.", globalInfoWebsite.ttyNumberToolTips());
            assertTrue("Unable to locate Email Us Link text.", globalInfoWebsite.emailUsLink());
            assertTrue("Unable to locate Email Us Link Tool Tips.", globalInfoWebsite.emailUsLinkToolTips());
            assertTrue("Unable to locate Entrata Login text.", globalInfoWebsite.entrataLogin());
            assertTrue("Unable to locate Entrata Login Tool Tips.", globalInfoWebsite.entrataLoginToolTips());
            assertTrue("Unable to locate Entrata SEO Links text.", globalInfoWebsite.entrataSEOLinks());
            assertTrue("Unable to locate Entrata SEO Links Tool Tips.", globalInfoWebsite.entrataSEOLinksToolTips());
            assertTrue("Unable to locate Google Map API Key text.", globalInfoWebsite.googleMapApiKey());
            assertTrue("Unable to locate Google Map API Key Tool Tips.", globalInfoWebsite.googleMapApiKeyToolTips());
            assertTrue("Unable to locate Languages text.", globalInfoWebsite.languages());
            assertTrue("Unable to locate Languages Tool Tips.", globalInfoWebsite.languagesToolTips());
            assertTrue("Unable to locate Language Translator text.", globalInfoWebsite.languageTranslator());
            assertTrue("Unable to locate Language Translator Tool Tips.", globalInfoWebsite.languageTranslatorToolTips());
            assertTrue("Unable to locate Languages Translator in Top Navigation text.", globalInfoWebsite.languagesTranslatorInTopNavigation());
            assertTrue("Unable to locate Languages Translator in Top Navigation Tool Tips.", globalInfoWebsite.languagesTranslatorInTopNavigationToolTips());
            assertTrue("Unable to locate Press Release Link text.", globalInfoWebsite.pressReleasesLink());
            assertTrue("Unable to locate Press Release Link Tool Tips.", globalInfoWebsite.pressReleasesLinkToolTips());
            assertTrue("Unable to locate Accessibility Statement Link text.", globalInfoWebsite.accessibilityStatementLink());
            assertTrue("Unable to locate Accessibility Statement Link Tool Tips.", globalInfoWebsite.accessibilityStatementLinkToolTips());
            assertTrue("Unable to locate Phone # Format text", globalInfoWebsite.phoneNumFormat());
            assertTrue("Unable to locate Phone # Format Tool Tips", globalInfoWebsite.phoneNumFormatToolTips());
        }
        @Test
        // Advanced Settings //
        public void shouldCheckWebsiteGlobalInfoAdvancedSettings_whenAdvancedSettingsAreSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to select Info sub-tab", global.infoSubTab());
            AdvancedSettings globalInfoAdvanced = new AdvancedSettings(driver);
            assertTrue("Unable to locate Advanced Settings link.", globalInfoAdvanced.advancedSettingsLink());
            assertTrue("Unable to locate Advanced Settings header text.", globalInfoAdvanced.advancedSettingsHeaderText());
            assertTrue("Unable to locate Advanced Settings header text edit button.", globalInfoAdvanced.advancedSettingsHeaderTextEditBtn());
            assertTrue("Unable to locate Adobe Dynamic Tag Management URL text.", globalInfoAdvanced.adobeDynamicTagManagementUrl());
            assertTrue("Unable to locate Adobe Dynamic Tag Management URL Tool Tips.", globalInfoAdvanced.adobeDynamicTagManagementUrlToolTips());
            assertTrue("Unable to locate Website Chat HTML text.", globalInfoAdvanced.websiteChatHtml());
            assertTrue("Unable to locate Website Chat HTML Tool Tips.", globalInfoAdvanced.websiteChatHtmlToolTips());
            assertTrue("Unable to locate Website Chat HTML Content text.", globalInfoAdvanced.websiteChatHtmlContent());
            assertTrue("Unable to locate Website Chat HTML Content Tool Tips.", globalInfoAdvanced.websiteChatHtmlContentToolTips());
            assertTrue("Unable to locate Apply Now text.", globalInfoAdvanced.applyNow());
            assertTrue("Unable to locate Apply Now Tool Tips.", globalInfoAdvanced.applyNowToolTips());
            assertTrue("Unable to locate Google Recaptcha Site Key text.", globalInfoAdvanced.googleRecaptchaSiteKey());
            assertTrue("Unable to locate Google Recaptcha Site Key Tool Tips.", globalInfoAdvanced.googleRecaptchaSiteKeyToolTips());
            assertTrue("Unable to locate Google Recaptcha Secret Key text", globalInfoAdvanced.googleRecaptchaSecretKey());
            assertTrue("Unable to locate Google Recaptcha Secret Key Tool Tips", globalInfoAdvanced.googleRecaptchaSecretKeyToolTips());
            assertTrue("Unable to locate Equal Housing Opportunity External Link text", globalInfoAdvanced.equalHousingOpportunityExternalLink());
            assertTrue("Unable to locate Equal Housing Opportunity External Link Tool Tips", globalInfoAdvanced.equalHousingOpportunityExternalLinkToolTips());
            assertTrue("Unable to locate EHO Link Alt Text Override text", globalInfoAdvanced.ehoLinkAltTextOverride());
            assertTrue("Unable to locate EHO Link Alt Text Override Tool Tips", globalInfoAdvanced.ehoLinkAltTextOverrideToolTips());
            assertTrue("Unable to locate ADA Icon External Link text", globalInfoAdvanced.adaIconExternalLink());
            assertTrue("Unable to locate ADA Icon External Link Tool Tips", globalInfoAdvanced.adaIconExternalLinkToolTips());
            assertTrue("Unable to locate ADA Link Alt Text Override text", globalInfoAdvanced.adaLinkAltTextOverride());
            assertTrue("Unable to locate ADA Link Alt Text Override Tool Tips", globalInfoAdvanced.adaLinkAltTextOverrideToolTips());
            assertTrue("Unable to locate Terms Of Use External Link text", globalInfoAdvanced.termsOfUseExternalLink());
            assertTrue("Unable to locate Terms Of Use External Link Tool Tips", globalInfoAdvanced.termsOfUseExternalLinkToolTips());
            assertTrue("Unable to locate Primary Privacy Policy External Link text", globalInfoAdvanced.primaryPrivacyPolicyExternalLink());
            assertTrue("Unable to locate Primary Privacy Policy External Link Tool Tips", globalInfoAdvanced.primaryPrivacyPolicyExternalLinkToolTips());
            assertTrue("Unable to locate Primary Privacy Policy Display Text", globalInfoAdvanced.primaryPrivacyPolicyDisplayText());
            assertTrue("Unable to locate Primary Privacy Policy Display Text Tool Tips", globalInfoAdvanced.primaryPrivacyPolicyDisplayTextToolTips());
            assertTrue("Unable to locate Secondary Privacy Policy External Link text.", globalInfoAdvanced.secondaryPrivacyPolicyExternalLink());
            assertTrue("Unable to locate Secondary Privacy Policy External Link Tool Tips", globalInfoAdvanced.secondaryPrivacyPolicyExternalLinkToolTips());
            assertTrue("Unable to locate Secondary Privacy Policy Display Text", globalInfoAdvanced.secondaryPrivacyPolicyDisplayText());
            assertTrue("Unable to locate Secondary Privacy Policy Display Text Tool Tips", globalInfoAdvanced.secondaryPrivacyPolicyDisplayTextToolTips());
            assertTrue("Unable to locate Hide Website (Entrata Admin Only) text", globalInfoAdvanced.hideWebsiteEntrataAdminOnly());
        }
        @Test
        //  Domains Settings  //
        public void shouldCheckWebsiteGlobalDomainSettings_whenGlobalDomainSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to locate/click Domains tab ", global.domainsTab());
            DomainsSubTab globalDomain = new DomainsSubTab(driver);
            assertTrue("Unable to locate Subdomain", globalDomain.subDomain());
            assertTrue("Unable to locate Add Domain Button", globalDomain.addDomain());
        }
        @Test
        //  Snippets Settings  //
        public void shouldCheckWebsiteGlobalSnippetSettings_whenGlobalSnippetsSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to locate/click Snippets tab", global.snippetsTab());
            SnippetsSubTab globalSnippets = new SnippetsSubTab(driver);
            assertTrue("Unable to locate Snippet Generator", globalSnippets.snippetGenerator());
            assertTrue("Unable to locate Snippet Type selector", globalSnippets.snippetType());
            assertTrue("Unable to locate Advanced Snippet Settings", globalSnippets.snippetAdvancedSettings());
            assertTrue("Unable to locate Snippet Generated Code window", globalSnippets.snippetGeneratedCodeWindow());
            assertTrue("Unable to locate Snippet Copy to Clipboard button", globalSnippets.snippetCopyToClipboardBtn());
            assertTrue("Unable to locate Generate Snippet button", globalSnippets.generateSnippetBtn());
        }
        @Test
        //  Wrappers Settings  //
        public void shouldCheckWebsiteGlobalWrappersSettings_whenGlobalWrappersSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to locate Wrappers tab", global.wrappersTab());
            WrappersSubTab globalWrappers = new WrappersSubTab(driver);
            assertTrue("Unable to locate Add Wrapper button", globalWrappers.addWrapperBtn());
            assertTrue("Unable to locate Wrappers header text", globalWrappers.wrappersHeader());
            assertTrue("Unable to locate Wrappers Re-cache text", globalWrappers.wrappersReCacheText());
            assertTrue("Unable to locate Wrappers text", globalWrappers.wrappersText());
            assertTrue("Unable to locate Wrapper Type text", globalWrappers.wrapperTypeText());
            assertTrue("Unable to locate Wrapper UTL text", globalWrappers.wrapperURLText());
            assertTrue("Unable to locate Wrapper Key text", globalWrappers.wrapperKeyText());
            assertTrue("Unable to locate Wrappers Custom CSS text", globalWrappers.wrapperCustomCSSText());
            assertTrue("Unable to locate Wrappers Actions text", globalWrappers.wrapperActionText());
        }
        @Test
        //  Encryption settings  //
        public void shouldCheckWebsiteGlobalEncryptionSettings_whenGlobalEncryptionSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to locate/click Encryption Tab", global.encryptionTab());
            EncryptionSubTab globalEncryption = new EncryptionSubTab(driver);
            assertTrue("Unable to locate String Encryptor header text", globalEncryption.stringEncryptorHeader());
            assertTrue("Unable to locate String Encryptor Tool Tips.", globalEncryption.stringEncryptorToolTips());
            assertTrue("Unable to locate Content to Encrypt box", globalEncryption.contentToEncryptBox());
            assertTrue("Unable to locate Encrypted Content box", globalEncryption.encryptedContentBox());
            assertTrue("Unable to locate Copy to Clipboard button", globalEncryption.copyToClipboardEncryptBtn());
            assertTrue("Unable to locate Encrypt It button", globalEncryption.encryptItBtn());
        }
        @Test
        //  Cookie Settings  //
        public void shouldCheckWebsiteGlobalCookieSettings_whenGlobalCooliesSubTabIsSelected() {
            EntrataNavBar navBar = new EntrataNavBar(driver);
            assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
            assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
            WebsiteListPage webList = new WebsiteListPage(driver);
            assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
            WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
            assertTrue("Unable to locate/click 'Global' Tab", webSet.globalTab());
            GlobalSubTabs global = new GlobalSubTabs(driver);
            assertTrue("Unable to locate Cookie Settings button", global.cookieSettingsTab());
            CookieSettingsSubTab globalCookie = new CookieSettingsSubTab(driver);
            assertTrue("Unable to locate Cookie Preferences header text", globalCookie.cookiePreferencesHeader());
            assertTrue("Unable to locate Add Cookie button", globalCookie.addCookieBtn());
            assertTrue("Unable to locate Cookie Name Preference text.", globalCookie.cookieNamePreference());
            assertTrue("Unable to locate Cookie Category Preference text.", globalCookie.cookieCategoryPreference());
            assertTrue("Unable to locate Cookie Description Preference text.", globalCookie.cookieDescriptionPreference());
            assertTrue("Unable to locate Cookie Token Preference text.", globalCookie.cookieTokenPreference());
            assertTrue("Unable to locate Cookie Privacy Item Type Preference text.", globalCookie.cookiePrivacyItemTypePreference());
            assertTrue("Unable to locate Cookie Actions Preference text.", globalCookie.cookieActionsPreference());
            assertTrue("Unable to locate Cookie Banner Text header", globalCookie.cookieBannerTextHeader());
            assertTrue("Unable to locate Cookie Banner Text Edit button", globalCookie.cookieBannerEditBtn());
            assertTrue("Unable to locate Cookie Banner Text.", globalCookie.cookieBannerText());
            assertTrue("Unable to locate Cookie Banner Text Tool Tips.", globalCookie.cookieBannerTextToolTips());
        }
}
