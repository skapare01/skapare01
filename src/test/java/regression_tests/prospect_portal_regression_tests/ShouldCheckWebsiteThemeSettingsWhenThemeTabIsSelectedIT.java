package regression_tests.prospect_portal_regression_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteListPage;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.WebsiteSettingsTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.ThemeSubTabs;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab.*;
import page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab.*;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckWebsiteThemeSettingsWhenThemeTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckWebsiteThemeSettingsWhenThemeTabIsSelectedIT() {
        super("KHansen");
    }

    @Test
    // Branding Colors Theme //
    public void ShouldCheckThemeBrandingColorsThemeSettingsWhenColorsThemeTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Branding' sub-tab.",themeSubTab.brandingSubTab());
        BrandingTabs branding = new BrandingTabs(driver);
        assertTrue("Unable to locate Branding 'Colors Theme' tab.",branding.colorsThemeSubTab());
        ColorsThemeTab brandingColors = new ColorsThemeTab(driver);
        assertTrue("Unable to locate 'Colors' header text.",brandingColors.colorsHeaderText());
        assertTrue("Unable to locate Colors Edit button",brandingColors.colorsEditBtn());
        assertTrue("Unable to locate 'Enable Color Contrast Accessibility' text.",brandingColors.enableColorContrastAccessibilityText());
        assertTrue("Unable to locate 'Theme' text.",brandingColors.themeText());
        assertTrue("Unable to locate 'Brand Color' text.",brandingColors.brandColorText());
        assertTrue("Unable to locate Color Tool Tips.",brandingColors.colorToolTips());
        assertTrue("Unable to locate 'Accent Color One' text.",brandingColors.accentColorOneText());
        assertTrue("Unable to locate 'Accent Color Two' text.",brandingColors.accentColorTwoText());
        assertTrue("Unable to locate 'Accent Color Three' text.",brandingColors.accentColorThreeText());
        assertTrue("Unable to locate 'Site Plan Active Pin Color' text.",brandingColors.sitePlanActivePinColorText());
    }
    @Test
    // Branding Fonts //
    public void ShouldCheckThemeBrandingFontsSettingsWhenFontsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Branding' sub-tab.",themeSubTab.brandingSubTab());
        BrandingTabs branding = new BrandingTabs(driver);
        assertTrue("Unable to locate 'Fonts' tab.",branding.fontsSubTab());
        FontsTab brandingFonts = new FontsTab(driver);
        assertTrue("Unable to locate 'Fonts' header text.",brandingFonts.fontsHeaderText());
        assertTrue("Unable to locate Fonts Edit button.",brandingFonts.fontsEditBtn());
        assertTrue("Unable to locate 'Headline Font' text.",brandingFonts.headlineFontText());
        assertTrue("Unable to locate Headline Font Tool Tips.",brandingFonts.headlineFontToolTips());
        assertTrue("Unable to locate 'Body Font' text.",brandingFonts.bodyFontText());
        assertTrue("Unable to locate Body Font Tool Tips.",brandingFonts.bodyFontToolTips());
    }
    @Test
    // Branding Patterns //
    public void ShouldCheckThemeBrandingPatternsSettingsWhenPatternsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Branding' sub-tab.",themeSubTab.brandingSubTab());
        BrandingTabs branding = new BrandingTabs(driver);
        assertTrue("Unable to locate Branding 'Patterns' tab.",branding.patternsSubTab());
        PatternsTab brandingPatterns = new PatternsTab(driver);
        assertTrue("Unable to locate Branding Patterns Available Patterns window.",brandingPatterns.brandingPatternsAvailablePatternsWindow());
    }
    @Test
    // Branding Design Settings //
    public void ShouldCheckThemeBrandingDesignSettingsWhenDesignSettingsTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Branding' sub-tab.",themeSubTab.brandingSubTab());
        BrandingTabs branding = new BrandingTabs(driver);
        assertTrue("Unable to locate Branding 'Design Settings' tab.",branding.designSettingsSubTab());
        DesignSettingsTab brandingDesign = new DesignSettingsTab(driver);
        assertTrue("Unable to locate Branding 'Design Specific Settings' header..",brandingDesign.brandingDesignSpecificSettingsHeader());
        assertTrue("Unable to locate Branding Design Specific Settings Edit button.",brandingDesign.brandingDesignSpecificSettingsEditBtn());
        assertTrue("Unable to locate Branding Design Specific 'Header Layout' text.",brandingDesign.designSpecificHeaderLayoutText());
        assertTrue("Unable to locate Branding Design Specific Header Layout Tool Tips.",brandingDesign.designSpecificHeaderLayoutToolTips());
        assertTrue("Unable to locate Branding Design Specific 'Landing Layout' text.",brandingDesign.designSpecificLandingTextLayoutText());
        assertTrue("Unable to locate Branding Design Specific Landing Layout Tool Tips.",brandingDesign.designSpecificLandingTextLayoutToolTips());
        assertTrue("Unable to locate Branding Design Specific 'Widget Row 2 Layout' text.",brandingDesign.designSpecificWidgetRowTwoLayoutText());
        assertTrue("Unable to locate Branding Design Specific Widget Row 2 Layout Tool Tips.",brandingDesign.designSpecificWidgetRowTwoLayoutToolTips());
        assertTrue("Unable to locate Branding Design Specific 'Footer Layout' text.",brandingDesign.designSpecificFooterLayoutText());
        assertTrue("Unable to locate Branding Design Specific Footer Layout Tool Tips.",brandingDesign.designSpecificFooterLayoutToolTips());
    }
    @Test
    // Journeys General //
    public void ShouldCheckThemeJourneysGeneralTabSettingsWhenGeneralTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Journeys' sub-tab.",themeSubTab.journeysSubTab());
        JourneysTabs journeys = new JourneysTabs(driver);
        assertTrue("Unable to locate 'General settings' tab.", journeys.generalTab());
        GeneralTab journeysGeneral = new GeneralTab(driver);
        assertTrue("Unable to locate 'General Settings' header text.", journeysGeneral.journeysGeneralSettingsHeader());
        assertTrue("Unable to locate General Settings Edit button.", journeysGeneral.journeysGeneralSettingsEditBtn());
        assertTrue("Unable to locate General settings 'CTA Title' text.", journeysGeneral.journeysGeneralCtaTitleText());
        assertTrue("Unable to locate General settings CTA Title Tool Tips.", journeysGeneral.journeysGeneralCtaTitleToolTips());
        assertTrue("Unable to locate General settings 'CTA Sub-Text' text.", journeysGeneral.journeysGeneralCtaSubText());
        assertTrue("Unable to locate Multi-Property Settings header.", journeysGeneral.journeysMultiPropertySettingsHeader());
        assertTrue("Unable to locate Multi-Property Settings Edit button.", journeysGeneral.journeysMultiPropertyEditBtn());
        assertTrue("Unable to locate Multi-Property Settings 'Title' text.", journeysGeneral.journeysMultiPropertyTitleText());
        assertTrue("Unable to locate Multi-Property settings Title Tool Tips.", journeysGeneral.journeysMultiPropertyTitleToolTips());
        assertTrue("Unable to locate Multi-Property settings 'Description' text.", journeysGeneral.journeysMultiPropertyDescriptionText());
        assertTrue("Unable to locate Multi-Property settings Description Tool Tips.", journeysGeneral.journeysMultiPropertyDescriptionToolTips());
        assertTrue("Unable to locate Multi-Property settings 'CTA Filter Type' text.", journeysGeneral.journeysMultiPropertyCtaFilterTypeText());
        assertTrue("Unable to locate Multi-Property settings CTA Filter Type Tool Tips.", journeysGeneral.journeysMultiPropertyCtaFilterTypeToolTips());
        assertTrue("Unable to locate Multi-Property settings 'Button Text' text.", journeysGeneral.journeysMultiPropertyButtonText());
        assertTrue("Unable to locate Multi-Property settings Button Text Tool Tips.", journeysGeneral.journeysMultiPropertyButtonTextToolTips());
    }
    @Test
    // Journeys Conventional //
    public void ShouldCheckThemeJourneysConventionalSettingsWhenConventionalTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.",webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Journeys' sub-tab.",themeSubTab.journeysSubTab());
        JourneysTabs journeys = new JourneysTabs(driver);
        assertTrue("Unable to locate Journeys 'Conventional' tab.",journeys.conventionalTab());
        ConventionalTab conventional = new ConventionalTab(driver);
        // Single Occupant Journey //
        assertTrue("Unable to locate Conventional 'Single Occupant Journey' header.",conventional.conventionalSingleOccupantJourneyHeader());
        assertTrue("Unable to locate Conventional 'Single Occupant Journey' Edit Button.",conventional.conventionalSingleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Conventional Single Occupant 'Active Applications' text.",conventional.singleOccupantActiveApplicationsText());
        assertTrue("Unable to locate Conventional Single Occupant Active Applications Tool Tips.",conventional.singleOccupantActiveApplicationsToolTips());
        assertTrue("Unable to locate Conventional Single Occupant 'Application Selection Instructional Text' text.",conventional.singleOccupantApplicationSelectionInstructionalText());
        assertTrue("Unable to locate Conventional Single Occupant Application Selection Instructional Text Tool Tips.",conventional.singleOccupantApplicationSelectionInstructionalTextToolTips());
        assertTrue("Unable to locate Conventional Single Occupant 'CTA Title' text.",conventional.singleOccupantCtaTitleText());
        assertTrue("Unable to locate Conventional Single Occupant CTA Title Tool Tips.",conventional.singleOccupantCtaTitleToolTips());
        assertTrue("Unable to locate Conventional Single Occupant 'CTA Sub-Text' text.",conventional.singleOccupantCtaSubText());
        assertTrue("Unable to locate Conventional Single Occupant 'CTA Filter Type' text.",conventional.singleOccupantCtaFilterTypeText());
        assertTrue("Unable to locate Conventional Single Occupant CTA Filter Type Tool Tips.",conventional.singleOccupantCtaFilterTypeToolTips());
        assertTrue("Unable to locate Conventional Single Occupant 'Bedroom Count' text.",conventional.singleOccupantBedroomCountText());
        assertTrue("Unable to locate Conventional Single Occupant Bedroom Count Tool Tips.",conventional.singleOccupantBedroomCountToolTips());
        assertTrue("Unable to locate Conventional Single Occupant 'CTA Button Text' text.",conventional.singleOccupantCtaButtonText());
        assertTrue("Unable to locate Conventional Single Occupant CTA Button Text Tool Tips.",conventional.singleOccupantCtaButtonTextToolTips());
        // Multiple Occupant Journey //
        assertTrue("Unable to locate Conventional Multiple Occupant Journey header.", conventional.conventionalMultipleOccupantJourneyHeader());
        assertTrue("Unable to locate Conventional Multiple Occupant Journey Edit button.", conventional.conventionalMultipleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Conventional Multiple Occupant 'Journey Selector Title' text.", conventional. multipleOccupantJourneySelectorTitleText());
        assertTrue("Unable to locate Conventional Multiple Occupant Journey Selector Title Tool Tips.", conventional.multipleOccupantJourneySelectorTitleToolTips());
        assertTrue("Unable to locate Conventional Multiple Occupant 'Journey Selector Description' text.", conventional.multipleOccupantJourneySelectorDescriptionText());
        assertTrue("Unable to locate Conventional Multiple Occupant Journey Selector Description Tool Tips.", conventional.multipleOccupantJourneySelectorDescriptionToolTips());
        assertTrue("Unable to locate Conventional Multiple Occupant 'Journey Selector Image' text.", conventional.multipleOccupantJourneySelectorImageText());
        assertTrue("Unable to locate Conventional Multiple Occupant 'CTA Selection Button Text' text.", conventional.multipleOccupantCtaSelectionButtonText());
        assertTrue("Unable to locate Conventional Multiple Occupant CTA Selection Button Text Tool Tips.", conventional.multipleOccupantCtaSelectionButtonTextToolTips());
    }
    @Test
    // Journeys Flexible //
    public void ShouldCheckThemeJourneysFlexibleSettingsWhenFlexibleTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Journeys' sub-tab.",themeSubTab.journeysSubTab());
        JourneysTabs journeys = new JourneysTabs(driver);
        assertTrue("Unable to locate Journeys 'Flexible' tab.",journeys.flexibleTab());
        FlexibleTab flexible = new FlexibleTab(driver);
        // Single Occupant Journey //
        assertTrue("Unable to locate Flexible 'Single Occupant Journey' header.",flexible.flexibleSingleOccupantJourneyHeader());
        assertTrue("Unable to locate Flexible 'Single Occupant Journey' Edit Button.",flexible.flexibleSingleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Flexible Single Occupant 'Active Applications' text.",flexible.flexSingleOccupantActiveApplicationsText());
        assertTrue("Unable to locate Flexible Single Occupant Active Applications Tool Tips.",flexible.flexSingleOccupantActiveApplicationsToolTips());
        assertTrue("Unable to locate Flexible Single Occupant 'Application Selection Instructional Text' text.",flexible.flexSingleOccupantApplicationSelectionInstructionalText());
        assertTrue("Unable to locate Flexible Single Occupant Application Selection Instructional Text Tool Tips.",flexible.flexSingleOccupantApplicationSelectionInstructionalTextToolTips());
        assertTrue("Unable to locate Flexible Single Occupant 'CTA Title' text.",flexible.flexSingleOccupantCtaTitleText());
        assertTrue("Unable to locate Flexible Single Occupant CTA Title Tool Tips.",flexible.flexSingleOccupantCtaTitleToolTips());
        assertTrue("Unable to locate Flexible Single Occupant 'CTA Sub-Text' text.",flexible.flexSingleOccupantCtaSubText());
        assertTrue("Unable to locate Flexible Single Occupant 'CTA Filter Type' text.",flexible.flexSingleOccupantCtaFilterTypeText());
        assertTrue("Unable to locate Flexible Single Occupant CTA Filter Type Tool Tips.",flexible.flexSingleOccupantCtaFilterTypeToolTips());
        assertTrue("Unable to locate Flexible Single Occupant, 'Occupant Count' text.",flexible.flexSingleOccupantOccupantCountText());
        assertTrue("Unable to locate Flexible Single Occupant, 'Occupant Count' Tool Tips.",flexible.flexSingleOccupantOccupantCountToolTips());
        assertTrue("Unable to locate Flexible Single Occupant 'CTA Button Text' text.",flexible.flexSingleOccupantCtaButtonText());
        assertTrue("Unable to locate Flexible Single Occupant CTA Button Text Tool Tips.",flexible.flexSingleOccupantCtaButtonTextToolTips());
        // Multiple Occupant Journey //
        assertTrue("Unable to locate Flexible Multiple Occupant Journey header.", flexible.flexibleMultipleOccupantJourneyHeader());
        assertTrue("Unable to locate Flexible Multiple Occupant Journey Edit button.", flexible.flexibleMultipleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Flexible Multiple Occupant 'Journey Selector Title' text.", flexible. flexMultipleOccupantJourneySelectorTitleText());
        assertTrue("Unable to locate Flexible Multiple Occupant Journey Selector Title Tool Tips.", flexible.flexMultipleOccupantJourneySelectorTitleToolTips());
        assertTrue("Unable to locate Flexible Multiple Occupant 'Journey Selector Description' text.", flexible.flexMultipleOccupantJourneySelectorDescriptionText());
        assertTrue("Unable to locate Flexible Multiple Occupant 'Journey Selector Image' text.", flexible.flexMultipleOccupantJourneySelectorImageText());
        assertTrue("Unable to locate Flexible Multiple Occupant 'CTA Selection Button Text' text.", flexible.flexMultipleOccupantCtaSelectionButtonText());
        assertTrue("Unable to locate Flexible Multiple Occupant CTA Selection Button Text Tool Tips.", flexible.flexMultipleOccupantCtaSelectionButtonTextToolTips());
    }
    @Test
    // Journeys Student //
    public void ShouldCheckThemeJourneysStudentSettingsWhenStudentTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.", webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Journeys' sub-tab.", themeSubTab.journeysSubTab());
        JourneysTabs journeys = new JourneysTabs(driver);
        assertTrue("Unable to locate Journeys 'Student' tab.", journeys.studentTab());
        StudentTab student = new StudentTab(driver);
        // Student Single Occupant Journey //
        assertTrue("Unable to locate Student 'Single Occupant Journey' header.",student.studentSingleOccupantJourneyHeader());
        assertTrue("Unable to locate Student 'Single Occupant Journey' Edit Button.",student.studentSingleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Student Single Occupant 'Active Applications' text.",student.studentSingleOccupantActiveApplicationsText());
        assertTrue("Unable to locate Student Single Occupant Active Applications Tool Tips.",student.studentSingleOccupantActiveApplicationsToolTips());
        assertTrue("Unable to locate Student Single Occupant 'Application Selection Instructional Text' text.",student.studentSingleOccupantApplicationSelectionInstructionalText());
        assertTrue("Unable to locate Student Single Occupant Application Selection Instructional Text Tool Tips.",student.studentSingleOccupantApplicationSelectionInstructionalTextToolTips());
        assertTrue("Unable to locate Student Single Occupant 'CTA Title' text.",student.studentSingleOccupantCtaTitleText());
        assertTrue("Unable to locate Student Single Occupant CTA Title Tool Tips.",student.studentSingleOccupantCtaTitleToolTips());
        assertTrue("Unable to locate Student Single Occupant 'CTA Sub-Text' text.",student.studentSingleOccupantCtaSubText());
        assertTrue("Unable to locate Student Single Occupant CTA Sub-Text Tool tips.",student.studentSingleOccupantCtaSubTextToolTips());
        assertTrue("Unable to locate Student Single Occupant 'CTA Filter Type' text.",student.studentSingleOccupantCtaFilterTypeText());
        assertTrue("Unable to locate Student Single Occupant CTA Filter Type Tool Tips.",student.studentSingleOccupantCtaFilterTypeToolTips());
        assertTrue("Unable to locate Student Single Occupant, 'Room Type' text.",student.studentSingleOccupantRoomTypeText());
        assertTrue("Unable to locate Student Single Occupant, 'Room Type' Tool Tips.",student.studentSingleOccupantRoomTypeToolTips());
        assertTrue("Unable to locate Student Single Occupant 'CTA Button Text' text.",student.studentSingleOccupantCtaButtonText());
        assertTrue("Unable to locate Student Single Occupant CTA Button Text Tool Tips.",student.studentSingleOccupantCtaButtonTextToolTips());
        // Student Multiple Occupant Journey //
        assertTrue("Unable to locate Student Multiple Occupant Journey header.", student.studentMultipleOccupantJourneyHeader());
        assertTrue("Unable to locate Student Multiple Occupant Journey Edit button.", student.studentMultipleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Student Multiple Occupant 'Journey Selector Title' text.", student. studentMultipleOccupantJourneySelectorTitleText());
        assertTrue("Unable to locate Student Multiple Occupant Journey Selector Title Tool Tips.", student.studentMultipleOccupantJourneySelectorTitleToolTips());
        assertTrue("Unable to locate Student Multiple Occupant 'Journey Selector Description' text.", student.studentMultipleOccupantJourneySelectorDescriptionText());
        assertTrue("Unable to locate Student Multiple Occupant 'Journey Selector Description' Tool Tips.", student.studentMultipleOccupantJourneySelectorDescriptionToolTips());
        assertTrue("Unable to locate Student Multiple Occupant 'Journey Selector Image' text.", student.studentMultipleOccupantJourneySelectorImageText());
        assertTrue("Unable to locate Student Multiple Occupant 'CTA Selection Button Text' text.", student.studentMultipleOccupantCtaSelectionButtonText());
        assertTrue("Unable to locate Student Multiple Occupant CTA Selection Button Text Tool Tips.", student.studentMultipleOccupantCtaSelectionButtonTextToolTips());
    }
    @Test
    // Journeys Military //
    public void ShouldCheckThemeJourneysMilitarySettingsWhenMilitaryTabIsSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab.", navBar.clickSetupButton());
        assertTrue("Unable to locate Websites selector.", navBar.clickWebsites());
        WebsiteListPage webList = new WebsiteListPage(driver);
        assertTrue("Unable to locate Gambit website.", webList.gambitWebsite());
        WebsiteSettingsTabs webSet = new WebsiteSettingsTabs(driver);
        assertTrue("Unable to locate Theme tab.", webSet.themeTab());
        ThemeSubTabs themeSubTab = new ThemeSubTabs(driver);
        assertTrue("Unable to locate Theme 'Journeys' sub-tab.", themeSubTab.journeysSubTab());
        JourneysTabs journeys = new JourneysTabs(driver);
        assertTrue("Unable to locate Journeys 'Military' tab.", journeys.militaryTab());
        MilitaryTab military = new MilitaryTab(driver);
        // Military Single Occupant Journey //
        assertTrue("Unable to locate Military 'Single Occupant Journey' header.",military.militarySingleOccupantJourneyHeader());
        assertTrue("Unable to locate Military 'Single Occupant Journey' Edit Button.",military.militarySingleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Military Single Occupant 'CTA Title' text.",military.militarySingleOccupantCtaTitleText());
        assertTrue("Unable to locate Military Single Occupant CTA Title Tool Tips.",military.militarySingleOccupantCtaTitleToolTips());
        assertTrue("Unable to locate Military Single Occupant 'CTA Sub-Text' text.",military.militarySingleOccupantCtaSubText());
        assertTrue("Unable to locate Military Single Occupant CTA Sub-Text Tool tips.",military.militarySingleOccupantCtaSubTextToolTips());
        assertTrue("Unable to locate Military Single Occupant 'CTA Filter Type' text.",military.militarySingleOccupantCtaFilterTypeText());
        assertTrue("Unable to locate Military Single Occupant CTA Filter Type Tool Tips.",military.militarySingleOccupantCtaFilterTypeToolTips());
        assertTrue("Unable to locate Military Single Occupant 'CTA Button Text' text.",military.militarySingleOccupantCtaButtonText());
        assertTrue("Unable to locate Military Single Occupant CTA Button Text Tool Tips.",military.militarySingleOccupantCtaButtonTextToolTips());
        // Military Multiple Occupant Journey //
        assertTrue("Unable to locate Military Multiple Occupant Journey header.", military.militaryMultipleOccupantJourneyHeader());
        assertTrue("Unable to locate Military Multiple Occupant Journey Edit button.", military.militaryMultipleOccupantJourneyEditBtn());
        assertTrue("Unable to locate Military Multiple Occupant 'Journey Selector Title' text.", military. militaryMultipleOccupantJourneySelectorTitleText());
        assertTrue("Unable to locate Military Multiple Occupant Journey Selector Title Tool Tips.", military.militaryMultipleOccupantJourneySelectorTitleToolTips());
        assertTrue("Unable to locate Military Multiple Occupant 'Journey Selector Description' text.", military.militaryMultipleOccupantJourneySelectorDescriptionText());
        assertTrue("Unable to locate Military Multiple Occupant 'Journey Selector Description' Tool Tips.", military.militaryMultipleOccupantJourneySelectorDescriptionToolTips());
        assertTrue("Unable to locate Military Multiple Occupant 'Journey Selector Image' text.", military.militaryMultipleOccupantJourneySelectorImageText());
        assertTrue("Unable to locate Military Multiple Occupant 'CTA Selection Button Text' text.", military.militaryMultipleOccupantCtaSelectionButtonText());
        assertTrue("Unable to locate Military Multiple Occupant CTA Selection Button Text Tool Tips.", military.militaryMultipleOccupantCtaSelectionButtonTextToolTips());
    }
}
